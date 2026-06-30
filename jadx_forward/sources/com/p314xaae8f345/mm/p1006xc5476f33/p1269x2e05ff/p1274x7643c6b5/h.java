package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public abstract class h {
    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, java.util.List list) {
        int i17;
        int i18 = c12886x91aa2b6d.M.f174624n;
        int size = list.size();
        int i19 = 0;
        int i27 = 1;
        int i28 = 1;
        for (int i29 = 0; i29 < size; i29++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) list.get(i29);
            boolean z17 = c12886x91aa2b6d2.I;
            if (z17) {
                i19++;
            }
            if (z17 == c12886x91aa2b6d.I && (i17 = c12886x91aa2b6d2.M.f174627q) >= i27) {
                i27 = i17 + 1;
                i28 = i17;
            }
        }
        java.lang.String format = java.lang.String.format("%s_%d", gm0.j1.b().j(), java.lang.Long.valueOf(c12886x91aa2b6d.C));
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 c12887x942bef81 = c12886x91aa2b6d.M;
        c12887x942bef81.f174625o = format;
        c12887x942bef81.f174626p = size <= 1 ? java.lang.String.format("Aggre_%s", format) : ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) list.get(0)).M.f174626p;
        c12887x942bef81.f174627q = i27;
        if (c12887x942bef81.f174617d == 6) {
            c12887x942bef81.f174627q = i28;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[15];
            objArr[0] = java.lang.Long.valueOf(c12886x91aa2b6d.B);
            objArr[1] = java.lang.Integer.valueOf(c12887x942bef81.f174617d);
            objArr[2] = java.lang.Integer.valueOf(c12887x942bef81.f174618e);
            objArr[3] = c12887x942bef81.f174625o;
            int i37 = 4;
            objArr[4] = c12887x942bef81.f174626p;
            objArr[5] = java.lang.Integer.valueOf(c12887x942bef81.f174627q);
            objArr[6] = java.lang.Integer.valueOf(size - i19);
            objArr[7] = java.lang.Integer.valueOf(i19);
            objArr[8] = java.lang.Integer.valueOf(c12886x91aa2b6d.I ? 1 : 2);
            objArr[9] = java.lang.Integer.valueOf(c12887x942bef81.f174619f);
            java.lang.String str = c12887x942bef81.f174620g;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            objArr[10] = fp.s0.a(str);
            java.lang.String str3 = c12887x942bef81.f174621h;
            if (str3 == null) {
                str3 = "";
            }
            objArr[11] = fp.s0.a(str3);
            java.lang.String str4 = c12887x942bef81.f174622i;
            if (str4 != null) {
                str2 = str4;
            }
            objArr[12] = fp.s0.a(str2);
            int i38 = c12886x91aa2b6d.H;
            if (i38 != 8 && i38 != 4) {
                i37 = i38;
            }
            objArr[13] = java.lang.Integer.valueOf(i37);
            objArr[14] = java.lang.Integer.valueOf(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(17602, java.lang.String.format("%d,%d,%d,%s,%s,%d,%d,%d,%d,%d,%s,%s,%s,%d,%d", objArr));
        } catch (java.lang.Exception unused) {
        }
        boolean r17 = qp1.w.r(c12886x91aa2b6d);
        boolean z19 = c12886x91aa2b6d.f174581f == 2;
        if (r17 || z19) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("float_win_type", java.lang.Integer.valueOf(r17 ? 1 : 2));
            hashMap.put("view_id", "float_win");
            hashMap.put("float_win_id", c12886x91aa2b6d.f174579d + '_' + c12886x91aa2b6d.f174582g);
            if (r17) {
                hashMap.put("float_win_cnt", java.lang.Integer.valueOf(((java.util.Vector) qp1.w.f(list)).size()));
            } else {
                hashMap.put("float_win_cnt", java.lang.Integer.valueOf(((java.util.Vector) qp1.w.g(list)).size()));
            }
            hashMap.put("state_type", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81.b(c12886x91aa2b6d.H)));
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81.a(c12886x91aa2b6d.f174579d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getKV33488ReportBizName(...)");
            hashMap.put("bizname", a17);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("float_win_add_succ", hashMap, 33488);
        }
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, int i17) {
        long j17;
        if (i17 != 18 || c12886x91aa2b6d.E <= 0) {
            j17 = 0;
        } else {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            j17 = java.lang.System.currentTimeMillis() - c12886x91aa2b6d.E;
        }
        c(c12886x91aa2b6d, i17, 0L, 0L, 0L, 0L, j17);
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, int i17, long j17, long j18, long j19, long j27, long j28) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 c12887x942bef81 = c12886x91aa2b6d.M;
        java.lang.Object[] objArr = new java.lang.Object[10];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = c12887x942bef81.f174625o;
        objArr[2] = c12887x942bef81.f174626p;
        objArr[3] = java.lang.Long.valueOf(j17);
        objArr[4] = java.lang.Long.valueOf(j18);
        objArr[5] = java.lang.Long.valueOf(j19);
        objArr[6] = java.lang.Integer.valueOf(c12886x91aa2b6d.I ? 1 : 2);
        objArr[7] = java.lang.Integer.valueOf(c12887x942bef81.f174627q);
        objArr[8] = java.lang.Long.valueOf(j27);
        objArr[9] = java.lang.Long.valueOf(j28);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(17604, java.lang.String.format("%d,%s,%s,%d,%d,%d,%d,%d,%d,%d", objArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d r16, boolean r17) {
        /*
            r0 = r16
            com.tencent.mm.plugin.ball.model.BallReportInfo r1 = r0.M
            int r1 = r1.f174623m
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r2, r0)
            return
        L38:
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r0.B
            long r8 = r3 - r5
            long r5 = r0.C
            long r6 = r3 - r5
            r10 = 0
            com.tencent.mm.plugin.ball.model.BallReportInfo r1 = r0.M
            if (r17 == 0) goto L6b
            java.lang.String r5 = r1.f174626p
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5)
            if (r5 != 0) goto L6b
            java.lang.String r5 = r1.f174626p
            java.lang.String r12 = "_"
            r13 = -1
            java.lang.String[] r5 = r5.split(r12, r13)
            int r12 = r5.length
            r13 = 3
            if (r12 != r13) goto L6b
            r12 = 2
            r5 = r5[r12]     // Catch: java.lang.Exception -> L6b
            long r12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(r5)     // Catch: java.lang.Exception -> L6b
            long r12 = r3 - r12
            goto L6c
        L6b:
            r12 = r10
        L6c:
            int r1 = r1.f174623m
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.h.d(com.tencent.mm.plugin.ball.model.BallInfo, boolean):void");
    }
}
