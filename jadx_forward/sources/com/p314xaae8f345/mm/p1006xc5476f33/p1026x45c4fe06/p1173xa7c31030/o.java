package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030;

/* loaded from: classes7.dex */
public class o implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final int f168902d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.io.RandomAccessFile f168903e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.io.RandomAccessFile f168904f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f168905g;

    /* renamed from: h, reason: collision with root package name */
    public long f168906h;

    /* renamed from: i, reason: collision with root package name */
    public long f168907i;

    /* renamed from: m, reason: collision with root package name */
    public long f168908m;

    public o(int i17) {
        this.f168902d = i17;
    }

    public final long a() {
        if (this.f168903e == null) {
            this.f168903e = com.p314xaae8f345.mm.vfs.w6.A(com.p314xaae8f345.mm.vfs.z7.a("/proc/stat"), false);
        }
        this.f168903e.seek(0L);
        java.lang.String readLine = this.f168903e.readLine();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(readLine)) {
            return 0L;
        }
        java.lang.String[] split = readLine.split(" ");
        if (split.length < 9) {
            return 0L;
        }
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split[2]);
        long E12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split[3]);
        long E13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split[4]);
        long E14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split[5]);
        long E15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split[6]);
        long E16 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split[7]);
        return E1 + E12 + E13 + E14 + E15 + E16 + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split[8]) + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split[9]);
    }

    public double b() {
        java.lang.String readLine;
        double d17;
        double d18;
        double d19 = 0.0d;
        if (this.f168905g) {
            return 0.0d;
        }
        try {
            if (this.f168904f == null) {
                try {
                    this.f168904f = com.p314xaae8f345.mm.vfs.w6.B("/proc/" + this.f168902d + "/stat", false);
                } catch (java.lang.Exception e17) {
                    e = e17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(" MicroMsg.CpuSampler", "read pid stat file error: " + e);
                    this.f168905g = true;
                    return d19;
                }
            }
            this.f168904f.seek(0L);
            readLine = this.f168904f.readLine();
        } catch (java.lang.Exception e18) {
            e = e18;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(readLine)) {
            return 0.0d;
        }
        java.lang.String[] split = readLine.split(" ");
        if (split.length < 17) {
            return 0.0d;
        }
        long a17 = a();
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split[13]);
        long E12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split[14]);
        if (this.f168906h != 0) {
            double d27 = ((E1 - this.f168907i) * 100) / (a17 - r13);
            try {
                d18 = ((E12 - this.f168908m) * 100) / (a17 - r13);
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(" MicroMsg.CpuSampler", "read pid stat file error: " + e);
                this.f168905g = true;
                return d19;
            }
        }
        this.f168906h = a17;
        this.f168907i = E1;
        this.f168908m = E12;
        return d19;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            if (this.f168904f != null) {
                this.f168904f.close();
            }
        } catch (java.io.IOException unused) {
        }
        try {
            if (this.f168903e != null) {
                this.f168903e.close();
            }
        } catch (java.io.IOException unused2) {
        }
    }
}
