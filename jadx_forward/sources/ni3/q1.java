package ni3;

/* loaded from: classes7.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni3.g2 f419236d;

    public q1(ni3.g2 g2Var) {
        this.f419236d = g2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r18 = this;
            java.lang.String r1 = "MicroMsg.SubCoreBaseMonitor"
            java.lang.String r0 = ";"
            r2 = 0
            gm0.j1.i()     // Catch: java.lang.Exception -> Lc2
            gm0.b0 r3 = gm0.j1.u()     // Catch: java.lang.Exception -> Lc2
            com.tencent.mm.storage.n3 r3 = r3.c()     // Catch: java.lang.Exception -> Lc2
            com.tencent.mm.storage.u3 r4 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_INSTALL_FIRST_CLIENT_VERSION_INT     // Catch: java.lang.Exception -> Lc2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Lc2
            java.lang.Object r3 = r3.m(r4, r5)     // Catch: java.lang.Exception -> Lc2
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> Lc2
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> Lc2
            gm0.j1.i()     // Catch: java.lang.Exception -> Lc2
            gm0.b0 r4 = gm0.j1.u()     // Catch: java.lang.Exception -> Lc2
            com.tencent.mm.storage.n3 r4 = r4.c()     // Catch: java.lang.Exception -> Lc2
            com.tencent.mm.storage.u3 r5 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_INSTALL_FIRST_TIME_LONG     // Catch: java.lang.Exception -> Lc2
            r6 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Exception -> Lc2
            java.lang.Object r4 = r4.m(r5, r6)     // Catch: java.lang.Exception -> Lc2
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Exception -> Lc2
            long r4 = r4.longValue()     // Catch: java.lang.Exception -> Lc2
            r6 = r18
            ni3.g2 r7 = r6.f419236d     // Catch: java.lang.Exception -> Lc0
            long r7 = ni3.g2.Ai(r7)     // Catch: java.lang.Exception -> Lc0
            r9 = 1
            if (r3 <= 0) goto L4f
            int r10 = o45.wf.f424562g     // Catch: java.lang.Exception -> Lc0
            if (r10 != r3) goto L4d
            goto L4f
        L4d:
            r10 = r2
            goto L50
        L4f:
            r10 = r9
        L50:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc0
            r11.<init>()     // Catch: java.lang.Exception -> Lc0
            r11.append(r3)     // Catch: java.lang.Exception -> Lc0
            r11.append(r0)     // Catch: java.lang.Exception -> Lc0
            int r3 = o45.wf.f424562g     // Catch: java.lang.Exception -> Lc0
            r11.append(r3)     // Catch: java.lang.Exception -> Lc0
            r11.append(r0)     // Catch: java.lang.Exception -> Lc0
            if (r10 == 0) goto L67
            r3 = r9
            goto L68
        L67:
            r3 = r2
        L68:
            r11.append(r3)     // Catch: java.lang.Exception -> Lc0
            r11.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> Lc0
            java.lang.String r10 = "yyyyMMdd"
            r3.<init>(r10)     // Catch: java.lang.Exception -> Lc0
            java.util.Date r10 = new java.util.Date     // Catch: java.lang.Exception -> Lc0
            r10.<init>(r4)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r3 = r3.format(r10)     // Catch: java.lang.Exception -> Lc0
            r11.append(r3)     // Catch: java.lang.Exception -> Lc0
            r11.append(r0)     // Catch: java.lang.Exception -> Lc0
            r11.append(r7)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Exception -> Lc0
            com.tencent.mm.plugin.report.service.g0 r3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE     // Catch: java.lang.Exception -> Lc0
            r11 = 418(0x1a2, double:2.065E-321)
            r13 = 1
            r15 = 1
            r17 = 1
            r10 = r3
            r10.mo68477x336bdfd8(r11, r13, r15, r17)     // Catch: java.lang.Exception -> Lc0
            r11 = 13778(0x35d2, float:1.9307E-41)
            r12 = 0
            r13 = 0
            r14 = 1
            r4 = 3
            java.lang.Object[] r15 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> Lc0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> Lc0
            r15[r2] = r4     // Catch: java.lang.Exception -> Lc0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> Lc0
            r15[r9] = r4     // Catch: java.lang.Exception -> Lc0
            r4 = 2
            r15[r4] = r0     // Catch: java.lang.Exception -> Lc0
            r10 = r3
            r10.g(r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r3 = "summerreportVersion install result[%s]"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> Lc0
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3, r0)     // Catch: java.lang.Exception -> Lc0
            goto Ld8
        Lc0:
            r0 = move-exception
            goto Lc5
        Lc2:
            r0 = move-exception
            r6 = r18
        Lc5:
            java.lang.String r3 = "reportVersion err!"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r0, r3, r2)
            com.tencent.mm.plugin.report.service.g0 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r8 = 418(0x1a2, double:2.065E-321)
            r10 = 2
            r12 = 1
            r14 = 1
            r7.mo68477x336bdfd8(r8, r10, r12, r14)
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni3.q1.run():void");
    }
}
