package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes8.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p642xad8b531f.e3 f144857d;

    public d3(com.p314xaae8f345.mm.p642xad8b531f.e3 e3Var) {
        this.f144857d = e3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a6 A[RETURN] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r11 = this;
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            java.lang.System.currentTimeMillis()
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            com.tencent.mm.booter.e3 r0 = r11.f144857d
            r0.getClass()
            int r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b
            java.lang.String r2 = wo.w0.k()
            int r3 = o45.wf.f424562g
            java.lang.String r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()
            java.lang.String r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()
            android.content.Context r6 = r0.f144865a
            r7 = 0
            android.content.SharedPreferences r5 = r6.getSharedPreferences(r5, r7)
            java.lang.String r8 = "last_reportdevice_channel"
            int r5 = r5.getInt(r8, r7)
            java.lang.String r9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r9, r7)
            java.lang.String r9 = "last_reportdevice_clientversion"
            int r6 = r6.getInt(r9, r7)
            r10 = 0
            if (r5 != 0) goto L41
            if (r6 != 0) goto L41
            r1 = r7
            goto L48
        L41:
            if (r5 != r1) goto L47
            if (r6 != r3) goto L47
            r1 = r10
            goto L80
        L47:
            r1 = 1
        L48:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = com.p314xaae8f345.mm.p642xad8b531f.e3.f144864b
            r5.append(r6)
            java.lang.String r6 = "?channel="
            r5.append(r6)
            int r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b
            r5.append(r6)
            java.lang.String r6 = "&deviceid="
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = "&clientversion="
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = "&platform=0&lang="
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = "&installtype="
            r5.append(r2)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
        L80:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            int r3 = android.os.Process.myTid()
            int r3 = android.os.Process.getThreadPriority(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r1}
            java.lang.String r3 = "MicroMsg.StartupReport"
            java.lang.String r4 = "tryReport thread:%s pri:%d  Url[%s] "
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r2)
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            if (r2 == 0) goto La7
            return
        La7:
            com.tencent.mm.network.h2 r10 = com.p314xaae8f345.mm.p971x6de15a2e.n.d(r1, r10)     // Catch: java.lang.Exception -> Le9
            r2 = 10000(0x2710, float:1.4013E-41)
            r10.g(r2)     // Catch: java.lang.Exception -> Le9
            r10.k(r2)     // Catch: java.lang.Exception -> Le9
            r10.a()     // Catch: java.lang.Exception -> Le9
            int r2 = r10.f()     // Catch: java.lang.Exception -> Le9
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 != r4) goto Le5
            int r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b     // Catch: java.lang.Exception -> Le9
            int r4 = o45.wf.f424562g     // Catch: java.lang.Exception -> Le9
            r0.getClass()     // Catch: java.lang.Exception -> Le9
            java.lang.String r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()     // Catch: java.lang.Exception -> Le9
            android.content.Context r0 = r0.f144865a     // Catch: java.lang.Exception -> Le9
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r5, r7)     // Catch: java.lang.Exception -> Le9
            android.content.SharedPreferences$Editor r5 = r0.edit()     // Catch: java.lang.Exception -> Le9
            android.content.SharedPreferences$Editor r2 = r5.putInt(r8, r2)     // Catch: java.lang.Exception -> Le9
            r2.commit()     // Catch: java.lang.Exception -> Le9
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Exception -> Le9
            android.content.SharedPreferences$Editor r0 = r0.putInt(r9, r4)     // Catch: java.lang.Exception -> Le9
            r0.commit()     // Catch: java.lang.Exception -> Le9
        Le5:
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Le9
            goto Lfb
        Le9:
            r0 = move-exception
            java.lang.String r2 = ""
            java.lang.Object[] r4 = new java.lang.Object[r7]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r0, r2, r4)
            java.lang.String r0 = "tryReport error url[%s]"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0, r1)
        Lfb:
            if (r10 == 0) goto L100
            r10.mo48348x1f9d589c()
        L100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p642xad8b531f.d3.run():void");
    }
}
