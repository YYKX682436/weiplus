package wo;

/* loaded from: classes13.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public java.io.RandomAccessFile f529367a;

    /* renamed from: b, reason: collision with root package name */
    public java.io.RandomAccessFile f529368b;

    /* renamed from: c, reason: collision with root package name */
    public wo.v f529369c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f529370d;

    /* renamed from: e, reason: collision with root package name */
    public final long f529371e;

    public w(long j17) {
        this.f529371e = 0L;
        this.f529371e = j17;
    }

    public final void a() {
        this.f529367a = new java.io.RandomAccessFile("/proc/stat", "r");
        long j17 = this.f529371e;
        if (j17 > 0) {
            this.f529368b = new java.io.RandomAccessFile("/proc/" + j17 + "/stat", "r");
        }
    }

    public final void b(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.String[] split;
        java.lang.String str3;
        if (str == null || str.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(" MicroMsg.CpuUsage", "unable to get cpu line cpuId[%d]", java.lang.Integer.valueOf(i17));
            return;
        }
        java.lang.String[] split2 = str.split("[ ]+");
        if (split2[0].indexOf("cpu") != -1) {
            if (i17 != -1) {
                if (this.f529370d == null) {
                    this.f529370d = new java.util.ArrayList();
                }
                if (i17 < this.f529370d.size()) {
                    ((wo.v) this.f529370d.get(i17)).a(split2);
                    return;
                }
                wo.v vVar = new wo.v(this);
                vVar.a(split2);
                this.f529370d.add(vVar);
                return;
            }
            if (this.f529369c == null) {
                this.f529369c = new wo.v(this, this.f529371e);
            }
            wo.v vVar2 = this.f529369c;
            long j17 = vVar2.f529348d;
            if (j17 <= 0) {
                vVar2.a(split2);
                return;
            }
            if (str2 == null || str2.length() <= 0 || (split = str2.split("[ ]+")) == null || split.length <= 0 || (str3 = split[0]) == null || java.lang.Long.parseLong(str3, 10) != j17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(" MicroMsg.CpuUsage", "update but pid not match[%d, %s] update nothing", java.lang.Long.valueOf(j17), str2);
                return;
            }
            long parseLong = java.lang.Long.parseLong(split[13], 10);
            long parseLong2 = java.lang.Long.parseLong(split[14], 10);
            long parseLong3 = java.lang.Long.parseLong(split[15], 10);
            long parseLong4 = java.lang.Long.parseLong(split[16], 10);
            long j18 = parseLong + parseLong2 + parseLong3 + parseLong4;
            long parseLong5 = java.lang.Long.parseLong(split2[4], 10);
            boolean z17 = true;
            long j19 = 0;
            for (java.lang.String str4 : split2) {
                if (z17) {
                    z17 = false;
                } else {
                    j19 += java.lang.Long.parseLong(str4, 10);
                }
            }
            long j27 = parseLong5 - vVar2.f529347c;
            long j28 = j19 - vVar2.f529346b;
            long j29 = j18 - vVar2.f529349e;
            float f17 = (float) j28;
            vVar2.f529345a = (int) ((((float) (j28 - j27)) / f17) * 100.0f);
            vVar2.f529350f = (int) ((((float) j29) / f17) * 100.0f);
            vVar2.f529346b = j19;
            vVar2.f529347c = parseLong5;
            vVar2.f529349e = j18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(" MicroMsg.CpuUsage", "CpuUsageInfo(%d) CPU total=%d idle=%d usage=%d pid=%d pidTotal=%d mPidUsage=%d [%d, %d, %d, %d], [%d, %d, %d]", java.lang.Integer.valueOf(vVar2.hashCode()), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(parseLong5), java.lang.Integer.valueOf(vVar2.f529345a), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(vVar2.f529350f), java.lang.Long.valueOf(parseLong), java.lang.Long.valueOf(parseLong2), java.lang.Long.valueOf(parseLong3), java.lang.Long.valueOf(parseLong4), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j29));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r6 = this;
            java.io.RandomAccessFile r0 = r6.f529368b
            java.lang.String r1 = " MicroMsg.CpuUsage"
            r2 = 0
            if (r0 == 0) goto L24
            r0.seek(r2)     // Catch: java.io.IOException -> L12
            java.io.RandomAccessFile r0 = r6.f529368b     // Catch: java.io.IOException -> L12
            java.lang.String r0 = r0.readLine()     // Catch: java.io.IOException -> L12
            goto L25
        L12:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Ops pidStatFile: "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0)
        L24:
            r0 = 0
        L25:
            java.io.RandomAccessFile r4 = r6.f529367a
            if (r4 == 0) goto L4d
            r4.seek(r2)     // Catch: java.io.IOException -> L3b
            r2 = -1
        L2d:
            java.io.RandomAccessFile r3 = r6.f529367a     // Catch: java.io.IOException -> L3b
            java.lang.String r3 = r3.readLine()     // Catch: java.io.IOException -> L3b
            r6.b(r2, r3, r0)     // Catch: java.io.IOException -> L3b
            int r2 = r2 + 1
            if (r3 != 0) goto L2d
            goto L4d
        L3b:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Ops statFile: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.w.c():void");
    }

    public void d() {
        try {
            a();
            c();
            java.io.RandomAccessFile randomAccessFile = this.f529367a;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            java.io.RandomAccessFile randomAccessFile2 = this.f529368b;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(" MicroMsg.CpuUsage", e17, "update e:", new java.lang.Object[0]);
            java.io.RandomAccessFile randomAccessFile3 = this.f529367a;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.close();
                } catch (java.lang.Exception unused) {
                }
                this.f529367a = null;
            }
            java.io.RandomAccessFile randomAccessFile4 = this.f529368b;
            if (randomAccessFile4 != null) {
                try {
                    randomAccessFile4.close();
                } catch (java.lang.Exception unused2) {
                }
                this.f529368b = null;
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m174205x9616526c() {
        d();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (this.f529369c != null) {
            stringBuffer.append("Cpu Total : ");
            stringBuffer.append(this.f529369c.f529345a);
            stringBuffer.append("%");
            long j17 = this.f529371e;
            if (j17 > 0) {
                stringBuffer.append("pid(");
                stringBuffer.append(j17 + ") :");
                stringBuffer.append(this.f529369c.f529350f);
                stringBuffer.append("%");
            }
        }
        if (this.f529370d != null) {
            for (int i17 = 0; i17 < this.f529370d.size(); i17++) {
                wo.v vVar = (wo.v) this.f529370d.get(i17);
                stringBuffer.append(" Cpu Core(" + i17 + ") : ");
                stringBuffer.append(vVar.f529345a);
                stringBuffer.append("%");
            }
        }
        return stringBuffer.toString();
    }
}
