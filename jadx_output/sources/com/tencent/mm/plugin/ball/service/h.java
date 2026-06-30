package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public abstract class h {
    public static void a(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, java.util.List list) {
        int i17;
        int i18 = ballInfo.M.f93091n;
        int size = list.size();
        int i19 = 0;
        int i27 = 1;
        int i28 = 1;
        for (int i29 = 0; i29 < size; i29++) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = (com.tencent.mm.plugin.ball.model.BallInfo) list.get(i29);
            boolean z17 = ballInfo2.I;
            if (z17) {
                i19++;
            }
            if (z17 == ballInfo.I && (i17 = ballInfo2.M.f93094q) >= i27) {
                i27 = i17 + 1;
                i28 = i17;
            }
        }
        java.lang.String format = java.lang.String.format("%s_%d", gm0.j1.b().j(), java.lang.Long.valueOf(ballInfo.C));
        com.tencent.mm.plugin.ball.model.BallReportInfo ballReportInfo = ballInfo.M;
        ballReportInfo.f93092o = format;
        ballReportInfo.f93093p = size <= 1 ? java.lang.String.format("Aggre_%s", format) : ((com.tencent.mm.plugin.ball.model.BallInfo) list.get(0)).M.f93093p;
        ballReportInfo.f93094q = i27;
        if (ballReportInfo.f93084d == 6) {
            ballReportInfo.f93094q = i28;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[15];
            objArr[0] = java.lang.Long.valueOf(ballInfo.B);
            objArr[1] = java.lang.Integer.valueOf(ballReportInfo.f93084d);
            objArr[2] = java.lang.Integer.valueOf(ballReportInfo.f93085e);
            objArr[3] = ballReportInfo.f93092o;
            int i37 = 4;
            objArr[4] = ballReportInfo.f93093p;
            objArr[5] = java.lang.Integer.valueOf(ballReportInfo.f93094q);
            objArr[6] = java.lang.Integer.valueOf(size - i19);
            objArr[7] = java.lang.Integer.valueOf(i19);
            objArr[8] = java.lang.Integer.valueOf(ballInfo.I ? 1 : 2);
            objArr[9] = java.lang.Integer.valueOf(ballReportInfo.f93086f);
            java.lang.String str = ballReportInfo.f93087g;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            objArr[10] = fp.s0.a(str);
            java.lang.String str3 = ballReportInfo.f93088h;
            if (str3 == null) {
                str3 = "";
            }
            objArr[11] = fp.s0.a(str3);
            java.lang.String str4 = ballReportInfo.f93089i;
            if (str4 != null) {
                str2 = str4;
            }
            objArr[12] = fp.s0.a(str2);
            int i38 = ballInfo.H;
            if (i38 != 8 && i38 != 4) {
                i37 = i38;
            }
            objArr[13] = java.lang.Integer.valueOf(i37);
            objArr[14] = java.lang.Integer.valueOf(i18);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(17602, java.lang.String.format("%d,%d,%d,%s,%s,%d,%d,%d,%d,%d,%s,%s,%s,%d,%d", objArr));
        } catch (java.lang.Exception unused) {
        }
        boolean r17 = qp1.w.r(ballInfo);
        boolean z19 = ballInfo.f93048f == 2;
        if (r17 || z19) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("float_win_type", java.lang.Integer.valueOf(r17 ? 1 : 2));
            hashMap.put("view_id", "float_win");
            hashMap.put("float_win_id", ballInfo.f93046d + '_' + ballInfo.f93049g);
            if (r17) {
                hashMap.put("float_win_cnt", java.lang.Integer.valueOf(((java.util.Vector) qp1.w.f(list)).size()));
            } else {
                hashMap.put("float_win_cnt", java.lang.Integer.valueOf(((java.util.Vector) qp1.w.g(list)).size()));
            }
            hashMap.put("state_type", java.lang.Integer.valueOf(com.tencent.mm.plugin.ball.model.BallReportInfo.b(ballInfo.H)));
            java.lang.String a17 = com.tencent.mm.plugin.ball.model.BallReportInfo.a(ballInfo.f93046d);
            kotlin.jvm.internal.o.f(a17, "getKV33488ReportBizName(...)");
            hashMap.put("bizname", a17);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("float_win_add_succ", hashMap, 33488);
        }
    }

    public static void b(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, int i17) {
        long j17;
        if (i17 != 18 || ballInfo.E <= 0) {
            j17 = 0;
        } else {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            j17 = java.lang.System.currentTimeMillis() - ballInfo.E;
        }
        c(ballInfo, i17, 0L, 0L, 0L, 0L, j17);
    }

    public static void c(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, int i17, long j17, long j18, long j19, long j27, long j28) {
        com.tencent.mm.plugin.ball.model.BallReportInfo ballReportInfo = ballInfo.M;
        java.lang.Object[] objArr = new java.lang.Object[10];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = ballReportInfo.f93092o;
        objArr[2] = ballReportInfo.f93093p;
        objArr[3] = java.lang.Long.valueOf(j17);
        objArr[4] = java.lang.Long.valueOf(j18);
        objArr[5] = java.lang.Long.valueOf(j19);
        objArr[6] = java.lang.Integer.valueOf(ballInfo.I ? 1 : 2);
        objArr[7] = java.lang.Integer.valueOf(ballReportInfo.f93094q);
        objArr[8] = java.lang.Long.valueOf(j27);
        objArr[9] = java.lang.Long.valueOf(j28);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(17604, java.lang.String.format("%d,%s,%s,%d,%d,%d,%d,%d,%d,%d", objArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(com.tencent.mm.plugin.ball.model.BallInfo r16, boolean r17) {
        /*
            r0 = r16
            com.tencent.mm.plugin.ball.model.BallReportInfo r1 = r0.M
            int r1 = r1.f93090m
            r2 = 10
            if (r1 == r2) goto L25
            r3 = 9
            if (r1 == r3) goto L25
            r3 = 8
            if (r1 == r3) goto L25
            r3 = 11
            if (r1 == r3) goto L25
            r3 = 14
            if (r1 == r3) goto L25
            r3 = 15
            if (r1 == r3) goto L25
            r3 = 16
            if (r1 != r3) goto L23
            goto L25
        L23:
            r3 = 0
            goto L26
        L25:
            r3 = 1
        L26:
            if (r3 != 0) goto L38
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.FloatBallReportLogic"
            java.lang.String r2 = "removeBallReport unexpected opType:%d"
            com.tencent.mars.xlog.Log.w(r1, r2, r0)
            return
        L38:
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r0.B
            long r8 = r3 - r5
            long r5 = r0.C
            long r6 = r3 - r5
            r10 = 0
            com.tencent.mm.plugin.ball.model.BallReportInfo r1 = r0.M
            if (r17 == 0) goto L6b
            java.lang.String r5 = r1.f93093p
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r5)
            if (r5 != 0) goto L6b
            java.lang.String r5 = r1.f93093p
            java.lang.String r12 = "_"
            r13 = -1
            java.lang.String[] r5 = r5.split(r12, r13)
            int r12 = r5.length
            r13 = 3
            if (r12 != r13) goto L6b
            r12 = 2
            r5 = r5[r12]     // Catch: java.lang.Exception -> L6b
            long r12 = com.tencent.mm.sdk.platformtools.t8.E1(r5)     // Catch: java.lang.Exception -> L6b
            long r12 = r3 - r12
            goto L6c
        L6b:
            r12 = r10
        L6c:
            int r1 = r1.f93090m
            if (r1 != r2) goto L78
            long r14 = r0.E
            int r2 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r2 <= 0) goto L78
            long r3 = r3 - r14
            r10 = r3
        L78:
            r2 = 0
            r0 = r16
            r4 = r12
            c(r0, r1, r2, r4, r6, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ball.service.h.d(com.tencent.mm.plugin.ball.model.BallInfo, boolean):void");
    }
}
