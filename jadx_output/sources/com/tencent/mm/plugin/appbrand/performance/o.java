package com.tencent.mm.plugin.appbrand.performance;

/* loaded from: classes7.dex */
public class o implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final int f87369d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.io.RandomAccessFile f87370e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.io.RandomAccessFile f87371f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f87372g;

    /* renamed from: h, reason: collision with root package name */
    public long f87373h;

    /* renamed from: i, reason: collision with root package name */
    public long f87374i;

    /* renamed from: m, reason: collision with root package name */
    public long f87375m;

    public o(int i17) {
        this.f87369d = i17;
    }

    public final long a() {
        if (this.f87370e == null) {
            this.f87370e = com.tencent.mm.vfs.w6.A(com.tencent.mm.vfs.z7.a("/proc/stat"), false);
        }
        this.f87370e.seek(0L);
        java.lang.String readLine = this.f87370e.readLine();
        if (com.tencent.mm.sdk.platformtools.t8.K0(readLine)) {
            return 0L;
        }
        java.lang.String[] split = readLine.split(" ");
        if (split.length < 9) {
            return 0L;
        }
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1(split[2]);
        long E12 = com.tencent.mm.sdk.platformtools.t8.E1(split[3]);
        long E13 = com.tencent.mm.sdk.platformtools.t8.E1(split[4]);
        long E14 = com.tencent.mm.sdk.platformtools.t8.E1(split[5]);
        long E15 = com.tencent.mm.sdk.platformtools.t8.E1(split[6]);
        long E16 = com.tencent.mm.sdk.platformtools.t8.E1(split[7]);
        return E1 + E12 + E13 + E14 + E15 + E16 + com.tencent.mm.sdk.platformtools.t8.E1(split[8]) + com.tencent.mm.sdk.platformtools.t8.E1(split[9]);
    }

    public double b() {
        java.lang.String readLine;
        double d17;
        double d18;
        double d19 = 0.0d;
        if (this.f87372g) {
            return 0.0d;
        }
        try {
            if (this.f87371f == null) {
                try {
                    this.f87371f = com.tencent.mm.vfs.w6.B("/proc/" + this.f87369d + "/stat", false);
                } catch (java.lang.Exception e17) {
                    e = e17;
                    com.tencent.mars.xlog.Log.e(" MicroMsg.CpuSampler", "read pid stat file error: " + e);
                    this.f87372g = true;
                    return d19;
                }
            }
            this.f87371f.seek(0L);
            readLine = this.f87371f.readLine();
        } catch (java.lang.Exception e18) {
            e = e18;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(readLine)) {
            return 0.0d;
        }
        java.lang.String[] split = readLine.split(" ");
        if (split.length < 17) {
            return 0.0d;
        }
        long a17 = a();
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1(split[13]);
        long E12 = com.tencent.mm.sdk.platformtools.t8.E1(split[14]);
        if (this.f87373h != 0) {
            double d27 = ((E1 - this.f87374i) * 100) / (a17 - r13);
            try {
                d18 = ((E12 - this.f87375m) * 100) / (a17 - r13);
                d17 = 0.0d;
            } catch (java.lang.Exception e19) {
                e = e19;
                d17 = 0.0d;
            }
            try {
                d19 = java.lang.Math.max(0.0d, d27) + java.lang.Math.max(0.0d, d18);
            } catch (java.lang.Exception e27) {
                e = e27;
                d19 = d17;
                com.tencent.mars.xlog.Log.e(" MicroMsg.CpuSampler", "read pid stat file error: " + e);
                this.f87372g = true;
                return d19;
            }
        }
        this.f87373h = a17;
        this.f87374i = E1;
        this.f87375m = E12;
        return d19;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            if (this.f87371f != null) {
                this.f87371f.close();
            }
        } catch (java.io.IOException unused) {
        }
        try {
            if (this.f87370e != null) {
                this.f87370e.close();
            }
        } catch (java.io.IOException unused2) {
        }
    }
}
