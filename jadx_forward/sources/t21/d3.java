package t21;

/* loaded from: classes12.dex */
public abstract class d3 {
    public static void A(java.lang.String str, int i17) {
        t21.v2 h17 = h(str);
        if (h17 != null) {
            int i18 = h17.f496548m;
            if (i18 <= 0 || java.lang.Math.abs(i18 - i17) > 2) {
                h17.f496548m = i17;
                h17.U = 4096;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "repair video duration ret %b, duration[%d, %d]", java.lang.Boolean.valueOf(Q(h17)), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            }
        }
    }

    public static boolean B(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "resetMsgRecv fileName : " + str);
        t21.v2 v2Var = new t21.v2();
        v2Var.f496544i = 112;
        v2Var.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        v2Var.f496547l = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        v2Var.f496533a = str;
        v2Var.U = 3328;
        if (!Q(v2Var)) {
            return false;
        }
        t21.o2.Zi().k();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean C(java.lang.String r8) {
        /*
            t21.v2 r0 = h(r8)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Class<wf0.b2> r2 = wf0.b2.class
            i95.m r2 = i95.n0.c(r2)
            wf0.b2 r2 = (wf0.b2) r2
            long r3 = r0.f496549n
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.String r6 = "MicroMsg.VideoLogic"
            r7 = 1
            if (r5 > 0) goto L1c
            goto L40
        L1c:
            java.lang.String r5 = r0.f496553r
            com.tencent.mm.storage.f9 r3 = pt0.f0.f2(r5, r3)
            if (r3 != 0) goto L25
            goto L40
        L25:
            java.lang.String r3 = r3.S1()
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r4 == 0) goto L30
            goto L40
        L30:
            y15.d r4 = new y15.d     // Catch: java.lang.Throwable -> L42
            r4.<init>()     // Catch: java.lang.Throwable -> L42
            r4.m126728xdc93280d(r3)     // Catch: java.lang.Throwable -> L42
            c01.f7 r3 = r4.k()     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L40
            r3 = r7
            goto L51
        L40:
            r3 = r1
            goto L51
        L42:
            r3 = move-exception
            java.lang.String r4 = r0.d()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "isFavQuickSendMsg parse failed, fileName=%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r6, r3, r5, r4)
            goto L40
        L51:
            vf0.y2 r2 = (vf0.y2) r2
            boolean r4 = r2.aj(r8)
            if (r4 == 0) goto L63
            boolean r4 = r2.hj()
            if (r4 == 0) goto L61
            if (r3 == 0) goto L63
        L61:
            r4 = r7
            goto L64
        L63:
            r4 = r1
        L64:
            if (r4 == 0) goto L99
            boolean r1 = r2.hj()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r1, r2}
            java.lang.String r1 = "resetMsgSend useNewSend, fileName=%s, isForbidden=%b, isFavQuickSend=%b"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r1, r8)
            java.lang.Class<c35.o> r8 = c35.o.class
            i95.m r8 = i95.n0.c(r8)
            c35.o r8 = (c35.o) r8
            java.lang.String r1 = r0.f496553r
            long r2 = r0.f496549n
            com.tencent.mm.storage.f9 r1 = pt0.f0.f2(r1, r2)
            java.lang.String r0 = r0.S
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            r0 = r0 ^ r7
            vf0.k2 r8 = (vf0.k2) r8
            r8.Bi(r1, r0)
            goto Ldf
        L99:
            java.lang.String r2 = "rsetMsgSend %s"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r2, r8)
            r45.vh4 r8 = r0.H
            if (r8 == 0) goto Lab
            r8.f469769f = r1
            r0.H = r8
        Lab:
            int r8 = r0.f496542g
            int r2 = r0.f496543h
            if (r8 >= r2) goto Lb6
            r8 = 103(0x67, float:1.44E-43)
            r0.f496544i = r8
            goto Lba
        Lb6:
            r8 = 104(0x68, float:1.46E-43)
            r0.f496544i = r8
        Lba:
            long r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()
            r0.f496545j = r2
            long r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()
            r0.f496546k = r2
            long r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()
            r0.f496547l = r2
            r8 = 536874752(0x20000f00, float:1.0846985E-19)
            r0.U = r8
            boolean r8 = Q(r0)
            if (r8 != 0) goto Ld8
            return r1
        Ld8:
            t21.p3 r8 = t21.o2.Zi()
            r8.k()
        Ldf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.d3.C(java.lang.String):boolean");
    }

    public static boolean D(java.lang.String str) {
        t21.v2 h17 = h(str);
        if (h17 == null || h17.f496549n == 0) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(h17.h(), h17.f496549n);
        int mo78013xfb85f7b0 = Li.mo78013xfb85f7b0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "ashutest::setBlack, msg type %d", java.lang.Integer.valueOf(mo78013xfb85f7b0));
        if (43 != mo78013xfb85f7b0 && 62 != mo78013xfb85f7b0) {
            return false;
        }
        Li.d1(t21.t2.a(h17.e(), h17.f496548m, false));
        Li.r1(2);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(h17.f496549n, Li, true);
        h17.f496544i = 197;
        h17.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        h17.U = 1280;
        return Q(h17);
    }

    public static boolean E(java.lang.String str, int i17) {
        return F(h(str), i17);
    }

    public static boolean F(t21.v2 v2Var, int i17) {
        if (v2Var == null) {
            return false;
        }
        v2Var.G = i17;
        v2Var.U = 268435456;
        return Q(v2Var);
    }

    public static boolean G(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 218L, 1L, false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoLogic", "setError file:%s stack:[%s]", str, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        ((java.util.HashMap) t21.o2.Zi().f496405o).remove(str);
        if (str == null) {
            return false;
        }
        t21.v2 h17 = h(str);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "Set error failed file:".concat(str));
            return false;
        }
        h17.f496544i = nd1.d1.f72919x366c91de;
        h17.f496546k = java.lang.System.currentTimeMillis() / 1000;
        h17.U = 1280;
        r45.vh4 vh4Var = h17.H;
        vh4Var.f469769f = 0;
        h17.H = vh4Var;
        boolean Q = Q(h17);
        long j17 = h17.f496549n;
        if (j17 == 0) {
            return Q;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(h17.f496553r, j17);
        int mo78013xfb85f7b0 = Li.mo78013xfb85f7b0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "set error, msg type %d", java.lang.Integer.valueOf(mo78013xfb85f7b0));
        if (43 != mo78013xfb85f7b0 && 62 != mo78013xfb85f7b0) {
            return Q;
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(111L, 32L, 1L, true);
        Li.u1(h17.h());
        Li.d1(t21.t2.a(h17.e(), -1L, true));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.m124847x74d37ac6(), Li, true);
        return Q;
    }

    public static boolean H(java.lang.String str) {
        t21.v2 h17 = h(str);
        if (h17 == null) {
            return false;
        }
        h17.f496532J = 2;
        h17.U = 2;
        boolean C = t21.o2.Ui().C(h17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "set hevc video format ret: " + C + " status: " + h17.f496544i);
        return C;
    }

    public static boolean I(java.lang.String str) {
        t21.v2 h17 = h(str);
        if (h17 == null) {
            return false;
        }
        h17.f496532J = 2;
        h17.f496544i = 199;
        h17.f496547l = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        h17.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        h17.G = 19;
        h17.U = 268438786;
        boolean C = t21.o2.Ui().C(h17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "set hevc video Completion ret: " + C + " status: " + h17.f496544i);
        return C;
    }

    public static void J(java.lang.String str, int i17) {
        t21.v2 h17 = h(str);
        if (h17 != null) {
            if (pt0.f0.Li(h17.h(), h17.f496549n).M2()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "jump mp video");
                return;
            }
            h17.f496544i = 122;
            h17.f496547l = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            h17.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            h17.G = i17;
            h17.U = 268438784;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "set online video Completion ret: " + t21.o2.Ui().C(h17) + " status: " + h17.f496544i);
        }
    }

    public static int K(java.lang.String str) {
        int i17;
        t21.v2 h17 = h(str);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "ERR:" + fp.k.c() + " getinfo failed: " + str);
            return 0 - fp.k.a();
        }
        int i18 = h17.f496544i;
        if (i18 != 111 && i18 != 113 && i18 != 121 && i18 != 122 && i18 != 123) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "ERR:" + fp.k.c() + " get status failed: " + str + " status:" + h17.f496544i);
            return 0 - fp.k.a();
        }
        boolean z17 = pt0.f0.Li(h17.h(), h17.f496549n).M2();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", " is mp video :%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoLogic", "start complete online video, but can not stream video now!");
            h17.f496544i = 112;
            h17.f496540e = 0;
            i17 = 272;
        } else {
            h17.f496544i = 122;
            i17 = 256;
        }
        h17.f496547l = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        h17.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        h17.U = i17 | 2048 | 1024;
        if (Q(h17)) {
            t21.o2.Zi().i();
            t21.o2.Zi().k();
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "ERR:" + fp.k.c() + " update failed: " + str);
        return 0 - fp.k.a();
    }

    public static int L(java.lang.String str) {
        t21.v2 h17 = h(str);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "ERR:" + fp.k.c() + " getinfo failed: " + str);
            return 0 - fp.k.a();
        }
        int i17 = h17.f496544i;
        if (i17 != 111 && i17 != 113 && i17 != 121 && i17 != 122 && i17 != 123) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "ERR:" + fp.k.c() + " get status failed: " + str + " status:" + h17.f496544i);
            return 0 - fp.k.a();
        }
        h17.f496544i = 112;
        h17.f496547l = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        h17.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        h17.U = 3328;
        if (Q(h17)) {
            t21.o2.Zi().i();
            t21.o2.Zi().k();
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "ERR:" + fp.k.c() + " update failed: " + str);
        return 0 - fp.k.a();
    }

    public static int M(java.lang.String str) {
        int a17;
        t21.v2 h17 = h(str);
        if (h17 != null) {
            vf0.y2 y2Var = (vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class));
            if (!y2Var.aj(str) || y2Var.hj()) {
                int i17 = h17.f496544i;
                if (i17 == 102 || i17 == 105) {
                    if (i17 == 102) {
                        h17.f496544i = 103;
                    } else if (h17.f496543h == h17.f496542g) {
                        h17.f496544i = 104;
                    } else {
                        h17.f496544i = 103;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", fp.k.c() + "startSend file:" + str + " status:[" + i17 + "->" + h17.f496544i + "]");
                    h17.f496547l = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                    h17.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                    h17.U = 3328;
                    if (Q(h17)) {
                        t21.o2.Zi().k();
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "ERR:" + fp.k.c() + " update failed: " + str);
                        a17 = fp.k.a();
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "SENDERR:" + fp.k.c() + " get status failed: " + str + " status:" + h17.f496544i);
                    a17 = fp.k.a();
                }
            } else {
                ((vf0.k2) ((c35.o) i95.n0.c(c35.o.class))).Bi(pt0.f0.f2(h17.f496553r, h17.f496549n), !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.S));
            }
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "SENDERR:" + fp.k.c() + " getinfo failed: " + str);
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, str, false);
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, str, false);
        com.p314xaae8f345.mm.vfs.w6.h(rj6);
        com.p314xaae8f345.mm.vfs.w6.h(tj6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "startSend, video info is null, need delete file, videoPath = " + rj6 + " thumb path = " + tj6);
        a17 = fp.k.a();
        return 0 - a17;
    }

    public static boolean N(java.lang.String str, int i17) {
        t21.v2 h17 = h(str);
        int i18 = 0;
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "ERR:" + fp.k.c() + " getinfo failed: " + str);
            return false;
        }
        if (i17 != h17.f496541f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoLogic", "download video finish, but file size is not equals db size[%d, %d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(h17.f496541f));
            h17.f496541f = i17;
            i18 = 32;
        }
        h17.f496540e = i17;
        h17.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        O(h17);
        h17.f496544i = 199;
        h17.U = i18 | 1296;
        boolean Q = Q(h17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "END!!!  updateRecv  file:" + str + " newsize:" + i17 + " total:" + h17.f496541f + " status:" + h17.f496544i + " netTimes:" + h17.f496550o + " update ret: " + Q);
        return Q;
    }

    public static boolean O(t21.v2 v2Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(v2Var.h(), v2Var.f496549n);
        int mo78013xfb85f7b0 = Li.mo78013xfb85f7b0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "ashutest::update read fin msg info, msg type %d", java.lang.Integer.valueOf(mo78013xfb85f7b0));
        if (43 != mo78013xfb85f7b0 && 62 != mo78013xfb85f7b0) {
            return false;
        }
        Li.o1(v2Var.f496537c);
        Li.d1(t21.t2.a(v2Var.e(), v2Var.f496548m, false));
        Li.u1(v2Var.h());
        Li.j();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(v2Var.f496537c, Li);
        if (!Li.Y2()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "on receive sight, sightFileSize %d bytes", java.lang.Integer.valueOf(v2Var.f496541f));
        return true;
    }

    public static void P(java.lang.String str, int i17) {
        t21.v2 h17 = h(str);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoLogic", "update, but video info is null, fileName %s, msgType %d", str, 43);
            return;
        }
        int t17 = t21.w2.t(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, str, false));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "update, video size %d, msgType %d, fileName: %s", java.lang.Integer.valueOf(t17), 43, str);
        h17.f496541f = t17;
        h17.f496548m = i17;
        r45.vh4 vh4Var = h17.H;
        vh4Var.f469767d = false;
        h17.H = vh4Var;
        h17.f496544i = 102;
        h17.f496543h = t21.w2.t(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, str, false));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "update prepare:" + str + " thumbsize:" + h17.f496543h);
        h17.U = 4512;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "update to db, result %B, msgType %d", java.lang.Boolean.valueOf(Q(h17)), 43);
        if (h17.f496559x == 4) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(h17.h(), h17.f496549n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "before update msgInfo, localId[%d] svrId[%d] talker[%s] type[%d] isSend[%d] imgPath[%s], status[%d] createTime[%d]", java.lang.Long.valueOf(Li.m124847x74d37ac6()), java.lang.Long.valueOf(Li.I0()), Li.Q0(), java.lang.Integer.valueOf(Li.mo78013xfb85f7b0()), java.lang.Integer.valueOf(Li.A0()), Li.z0(), java.lang.Integer.valueOf(Li.P0()), java.lang.Long.valueOf(Li.mo78012x3fdd41df()));
        Li.u1(h17.h());
        Li.m124850x7650bebc(43);
        Li.j1(1);
        if (!((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).hj()) {
            Li.i1(str);
        }
        Li.r1(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "after update msgInfo, localId[%d] svrId[%d] talker[%s] type[%d] isSend[%d] imgPath[%s], status[%d] createTime[%d]", java.lang.Long.valueOf(Li.m124847x74d37ac6()), java.lang.Long.valueOf(Li.I0()), Li.Q0(), java.lang.Integer.valueOf(Li.mo78013xfb85f7b0()), java.lang.Integer.valueOf(Li.A0()), Li.z0(), java.lang.Integer.valueOf(Li.P0()), java.lang.Long.valueOf(Li.mo78012x3fdd41df()));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(h17.f496549n, Li, true);
    }

    public static boolean Q(t21.v2 v2Var) {
        if (v2Var == null) {
            return false;
        }
        if ((v2Var.d() == null || v2Var.d().length() <= 0) && v2Var.U == -1) {
            return false;
        }
        return t21.o2.Ui().C(v2Var);
    }

    public static void R(t21.v2 v2Var) {
        if (v2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "video info is null");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(v2Var.h(), v2Var.f496549n);
        int mo78013xfb85f7b0 = Li.mo78013xfb85f7b0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "ashutest::updateWriteFinMsgInfo, msg type %d", java.lang.Integer.valueOf(mo78013xfb85f7b0));
        if (43 == mo78013xfb85f7b0 || 62 == mo78013xfb85f7b0) {
            Li.j1(1);
            Li.u1(v2Var.h());
            Li.o1(v2Var.f496537c);
            Li.r1(2);
            Li.d1(t21.t2.a(v2Var.e(), v2Var.f496548m, false));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(v2Var.f496549n, Li, true);
            ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).cj(Li, true);
            if (v2Var.K != 0 && !android.text.TextUtils.isEmpty(v2Var.L)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "[updateWriteFinMsgInfo] trigger incremental clean for original message id: " + v2Var.K + ", talker: " + v2Var.L);
                ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).mj(java.lang.Long.valueOf(v2Var.K), v2Var.L);
            }
            ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).mj(java.lang.Long.valueOf(Li.m124847x74d37ac6()), Li.Q0());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0070, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayHistoryStorage", "getPlayDuration ret : " + r0 + " starttime : " + r1.f38864x6ac9171 + " playduration : " + r2.f38864x6ac9171);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0095, code lost:
    
        if (r0 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a2, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(r1.f38864x6ac9171) >= 300) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a4, code lost:
    
        r0 = r2.f38864x6ac9171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a8, code lost:
    
        if (r0 < 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ac, code lost:
    
        if (r0 < (r18 - 1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b0, code lost:
    
        android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        if (r8 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005d, code lost:
    
        if (r8 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(int r18, java.lang.String r19) {
        /*
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            android.os.SystemClock.elapsedRealtime()
            com.tencent.mm.pointers.PInt r1 = new com.tencent.mm.pointers.PInt
            r1.<init>()
            com.tencent.mm.pointers.PInt r2 = new com.tencent.mm.pointers.PInt
            r2.<init>()
            t21.k3 r0 = t21.o2.Vi()
            r0.getClass()
            java.lang.String r3 = "playduration"
            java.lang.String r4 = "starttime"
            java.lang.String r5 = "MicroMsg.VideoPlayHistoryStorage"
            r6 = 1
            r7 = 0
            r8 = 0
            l75.k0 r9 = r0.f496351a     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.String r10 = "VideoPlayHistory"
            java.lang.String[] r11 = new java.lang.String[]{r4, r3}     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.String r12 = "filename=?"
            java.lang.String[] r13 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(r19)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r13[r7] = r19     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.String r14 = ""
            java.lang.String r15 = ""
            java.lang.String r16 = ""
            r17 = 2
            android.database.Cursor r8 = r9.D(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            if (r8 == 0) goto L5c
            boolean r0 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            if (r0 == 0) goto L5c
            int r0 = r8.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            int r0 = r8.getInt(r0)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r1.f38864x6ac9171 = r0     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            int r0 = r8.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            int r0 = r8.getInt(r0)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r2.f38864x6ac9171 = r0     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r0 = r6
            goto L5d
        L5c:
            r0 = r7
        L5d:
            if (r8 == 0) goto L70
            goto L6d
        L60:
            r0 = move-exception
            goto Lb4
        L62:
            r0 = move-exception
            java.lang.String r3 = ""
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L60
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r5, r0, r3, r4)     // Catch: java.lang.Throwable -> L60
            r0 = r7
            if (r8 == 0) goto L70
        L6d:
            r8.close()
        L70:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getPlayDuration ret : "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " starttime : "
            r3.append(r4)
            int r4 = r1.f38864x6ac9171
            r3.append(r4)
            java.lang.String r4 = " playduration : "
            r3.append(r4)
            int r4 = r2.f38864x6ac9171
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r3)
            if (r0 == 0) goto La7
            int r0 = r1.f38864x6ac9171
            long r0 = (long) r0
            long r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(r0)
            r3 = 300(0x12c, double:1.48E-321)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto La7
            int r0 = r2.f38864x6ac9171
            goto La8
        La7:
            r0 = r7
        La8:
            if (r0 < 0) goto Lb0
            int r1 = r18 + (-1)
            if (r0 < r1) goto Laf
            goto Lb0
        Laf:
            r7 = r0
        Lb0:
            android.os.SystemClock.elapsedRealtime()
            return r7
        Lb4:
            if (r8 == 0) goto Lb9
            r8.close()
        Lb9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.d3.a(int, java.lang.String):int");
    }

    public static boolean b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoLogic", "check short video was replaced, but filename is null.");
            return false;
        }
        t21.v2 h17 = h(str);
        if (h17 != null && h17.f496544i == 199) {
            int i17 = h17.f496541f;
            int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, str, false));
            if (k17 > 0 && java.lang.Math.abs(k17 - i17) > 16) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoLogic", "it error short video can not retransmit. file size[%d], video info size[%d]", java.lang.Integer.valueOf(k17), java.lang.Integer.valueOf(i17));
                java.lang.String d17 = h17.d();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 217L, 1L, false);
                t21.v2 h18 = h(d17);
                if (h18 != null) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(h18.h(), h18.f496549n);
                    int mo78013xfb85f7b0 = Li.mo78013xfb85f7b0();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "ashutest::setBroken, msg type %d", java.lang.Integer.valueOf(mo78013xfb85f7b0));
                    if (43 == mo78013xfb85f7b0 || 62 == mo78013xfb85f7b0) {
                        Li.d1(t21.t2.a(h18.e(), h18.f496548m, false));
                        Li.r1(2);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(h18.f496549n, Li, true);
                        h18.f496544i = 196;
                        h18.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                        h18.U = 1280;
                        Q(h18);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean c(java.lang.String str) {
        t21.v2 h17;
        int i17;
        if (str == null || (h17 = h(str)) == null || (i17 = h17.f496550o) >= 2500) {
            return false;
        }
        h17.f496550o = i17 + 1;
        h17.U = 16384;
        return Q(h17);
    }

    public static java.lang.String d(long j17, int i17) {
        return j17 + "_" + i17;
    }

    public static void e(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        t21.v2 h17 = h(str);
        if (h17 != null) {
            long j17 = h17.f496549n;
            if (j17 > 0) {
                f9Var = pt0.f0.Li(h17.h(), j17);
                f(str, f9Var);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoLogic", "deleteRecord, msg local id error id = " + j17 + " user = " + h17.e());
            }
        }
        f9Var = null;
        f(str, f9Var);
    }

    public static void f(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String str2;
        java.lang.String str3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        t21.v2 h17 = h(str);
        if (h17 != null) {
            str2 = h17.S;
            str3 = h17.O;
        } else {
            str2 = null;
            str3 = null;
        }
        if (t21.o2.Ui().c(str, str3)) {
            try {
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, str, false));
                java.lang.String str4 = a17.f294812f;
                if (str4 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                    if (!str4.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (m17.a()) {
                    m17.f294799a.d(m17.f294800b);
                }
                java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f104104s, str, false);
                com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(rj6);
                java.lang.String str5 = a18.f294812f;
                if (str5 != null) {
                    java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
                    if (!str5.equals(l18)) {
                        a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
                if (m18.a()) {
                    m18.f294799a.d(m18.f294800b);
                }
                java.lang.String wi6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).wi(rj6);
                if (com.p314xaae8f345.mm.vfs.w6.j(wi6)) {
                    com.p314xaae8f345.mm.vfs.w6.h(wi6);
                }
                com.p314xaae8f345.mm.vfs.w6.h(h17.C);
                if (str.endsWith(ya.b.f77495x8b74a326)) {
                    if (f9Var != null) {
                        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
                        h90.a[] aVarArr = h90.a.f361204d;
                        ((g90.u) wVar).wi(f9Var, 2);
                        java.lang.String Ai = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(f9Var, false);
                        com.p314xaae8f345.mm.vfs.z7 a19 = com.p314xaae8f345.mm.vfs.z7.a(Ai);
                        java.lang.String str6 = a19.f294812f;
                        if (str6 != null) {
                            java.lang.String l19 = com.p314xaae8f345.mm.vfs.e8.l(str6, false, false);
                            if (!str6.equals(l19)) {
                                a19 = new com.p314xaae8f345.mm.vfs.z7(a19.f294810d, a19.f294811e, l19, a19.f294813g, a19.f294814h);
                            }
                        }
                        com.p314xaae8f345.mm.vfs.z2 m19 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a19, null);
                        if (m19.a()) {
                            m19.f294799a.d(m19.f294800b);
                        }
                        java.lang.String wi7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).wi(Ai);
                        if (com.p314xaae8f345.mm.vfs.w6.j(wi7)) {
                            com.p314xaae8f345.mm.vfs.w6.h(wi7);
                        }
                    }
                } else if (f9Var != null) {
                    h90.w wVar2 = (h90.w) i95.n0.c(h90.w.class);
                    h90.a[] aVarArr2 = h90.a.f361204d;
                    ((g90.u) wVar2).wi(f9Var, 5);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "ERR: Delete file Failed" + fp.k.c() + " file:" + str + " msg:" + e17.getMessage());
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                f(str2, f9Var);
            }
            try {
                java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f104104s, str, false);
                java.lang.String r17 = com.p314xaae8f345.mm.vfs.w6.r(rj7);
                if (!r17.endsWith("/")) {
                    r17 = r17.concat("/");
                }
                java.lang.String str7 = r17 + com.p314xaae8f345.mm.vfs.w6.q(rj7) + "_hd.mp4";
                boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str7);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "local capture video, hdFilePath: %s, exist: %s", str7, java.lang.Boolean.valueOf(j17));
                if (j17) {
                    com.p314xaae8f345.mm.vfs.w6.h(str7);
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "try to get hd filePath error: %s", e18.getMessage());
            }
        }
    }

    public static int g(t21.v2 v2Var) {
        int i17 = v2Var.f496541f;
        if (i17 == 0) {
            return 0;
        }
        return (int) ((v2Var.f496540e * 100) / i17);
    }

    public static t21.v2 h(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return t21.o2.Ui().g(str);
    }

    public static t21.v2 i(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str3)) {
            return j(str, str2);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        t21.v2 h17 = h(str);
        if (h17 != null) {
            return h17;
        }
        java.util.ArrayList o17 = o(str2);
        if (o17 == null) {
            return null;
        }
        java.util.Iterator it = o17.iterator();
        while (it.hasNext()) {
            t21.v2 v2Var = (t21.v2) it.next();
            java.lang.String str4 = v2Var.B;
            if (str4 != null && str4.toLowerCase().contains(str3.toLowerCase())) {
                return v2Var;
            }
        }
        return null;
    }

    public static t21.v2 j(java.lang.String str, java.lang.String str2) {
        t21.v2 v2Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return h(str);
        }
        t21.w2 Ui = t21.o2.Ui();
        Ui.getClass();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(t21.w2.q(t21.b3.a(str)));
            sb6.append(" where (");
            sb6.append(t21.b3.a(str));
            sb6.append(".filename = '");
            java.lang.String str3 = "" + str;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str3);
            sb6.append(str3);
            sb6.append("' OR ");
            sb6.append(t21.b3.a(str));
            sb6.append(".media_id = '");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str2);
            sb6.append(str2);
            sb6.append("')");
            android.database.Cursor f17 = Ui.f496590a.f(sb6.toString(), null, 2);
            if (f17 == null) {
                return null;
            }
            if (f17.moveToFirst()) {
                v2Var = new t21.v2();
                v2Var.a(f17);
            } else {
                v2Var = null;
            }
            f17.close();
            return v2Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoInfoStorage", e17, "getByFileName error[%s]", e17.toString());
            return null;
        }
    }

    public static boolean k(java.lang.String str, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2) {
        gp.d dVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoLogic", "get media info but path is null");
            return false;
        }
        try {
            java.lang.String m69182xa23d6ecc = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69182xa23d6ecc(str);
            if (m69182xa23d6ecc == null) {
                return false;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(m69182xa23d6ecc);
            c19767x257d7f.f38864x6ac9171 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(jSONObject.getInt("videoDuration"));
            c19767x257d7f2.f38864x6ac9171 = jSONObject.getInt("videoBitrate") / 1000;
            return true;
        } catch (org.json.JSONException unused) {
            gp.d dVar2 = null;
            try {
                try {
                    try {
                        dVar = new gp.d();
                    } catch (java.io.IOException unused2) {
                        int i17 = c19767x257d7f2.f38864x6ac9171;
                        int i18 = c19767x257d7f.f38864x6ac9171;
                        return true;
                    }
                } catch (java.lang.Exception e17) {
                    e = e17;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
            try {
                dVar.setDataSource(str);
                c19767x257d7f.f38864x6ac9171 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(9), 0));
                c19767x257d7f2.f38864x6ac9171 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(20), 0) / 1000;
                dVar.release();
            } catch (java.lang.Exception e18) {
                e = e18;
                dVar2 = dVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoLogic", e, "get video bitrate error. path %s", str);
                if (dVar2 != null) {
                    dVar2.release();
                }
                int i172 = c19767x257d7f2.f38864x6ac9171;
                int i182 = c19767x257d7f.f38864x6ac9171;
                return true;
            } catch (java.lang.Throwable th7) {
                th = th7;
                dVar2 = dVar;
                if (dVar2 != null) {
                    try {
                        dVar2.release();
                    } catch (java.io.IOException unused3) {
                    }
                }
                throw th;
            }
            int i1722 = c19767x257d7f2.f38864x6ac9171;
            int i1822 = c19767x257d7f.f38864x6ac9171;
            return true;
        }
    }

    public static int l(java.lang.String str) {
        t21.v2 h17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (h17 = h(str)) == null) {
            return 0;
        }
        return m(h17);
    }

    public static int m(t21.v2 v2Var) {
        long j17;
        long j18;
        t21.v2 h17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(v2Var.h(), v2Var.f496549n);
        if (v2Var.f496541f != 0) {
            Li.z0();
            ((c35.m) i95.n0.c(c35.m.class)).getClass();
            java.lang.String Ai = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(Li, true);
            if (com.p314xaae8f345.mm.vfs.w6.j(Ai) ? true : !android.text.TextUtils.isEmpty(Ai) ? com.p314xaae8f345.mm.vfs.w6.j(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).wi(Ai)) : false) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v2Var.S) || (h17 = h(v2Var.S)) == null) {
                    j17 = 0;
                    j18 = 0;
                } else {
                    j17 = h17.f496540e;
                    j18 = h17.f496541f;
                }
                if (j18 == 0) {
                    return 0;
                }
                return (int) ((j17 * 100) / j18);
            }
        }
        return 0;
    }

    public static int n(t21.v2 v2Var) {
        long j17;
        long j18;
        t21.v2 h17;
        if (v2Var.f496541f == 0) {
            return 0;
        }
        if (!s() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v2Var.S) || (h17 = h(v2Var.S)) == null) {
            j17 = 0;
            j18 = 0;
        } else {
            j17 = h17.f496539d;
            j18 = h17.f496541f;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "cdntra getUploadProgress :" + v2Var.f496539d + " " + v2Var.f496541f + " origin offset = " + j17 + " origin total len = " + j18);
        int i17 = (int) (((((long) v2Var.f496539d) * 100) + (j17 * 100)) / (((long) v2Var.f496541f) + j18));
        if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20551x1009539b()) == 1)) {
            return i17;
        }
        java.lang.String d17 = v2Var.d();
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) ? false : ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).aj(d17) ? (int) (i17 * 0.9d) : i17;
    }

    public static java.util.ArrayList o(java.lang.String str) {
        java.util.ArrayList arrayList;
        android.database.Cursor f17;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        t21.w2 Ui = t21.o2.Ui();
        Ui.getClass();
        kk.l lVar = t21.w2.f496589c;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) lVar.get(str);
        if (arrayList2 != null) {
            arrayList = new java.util.ArrayList(arrayList2);
        } else {
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(t21.w2.q("videoinfo2"));
                sb6.append(" where (videoinfo2.media_id = '");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
                sb6.append(str);
                sb6.append("')");
                f17 = Ui.f496590a.f(sb6.toString(), null, 2);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoInfoStorage", e17, "getByFileName error[%s]", e17.toString());
            }
            if (f17 == null) {
                arrayList = null;
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                while (f17.moveToNext()) {
                    t21.v2 v2Var = new t21.v2();
                    v2Var.a(f17);
                    arrayList3.add(v2Var);
                }
                lVar.put(str, arrayList3);
                f17.close();
                arrayList = new java.util.ArrayList(arrayList3);
            }
        }
        if (arrayList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "getVideoInfoByMediaId return null");
            return null;
        }
        java.util.Collections.sort(arrayList, new t21.C30210x598e932());
        return arrayList;
    }

    public static boolean p(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, java.lang.String str5, int i19, r45.uf6 uf6Var, java.lang.String str6, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, java.lang.String str7, java.lang.String str8, boolean z17, long j17, r45.xz6 xz6Var, java.lang.String str9) {
        return q(str, str2, i17, str3, str4, i18, str5, i19, uf6Var, str6, c16564xb55e1d5, str7, str8, z17, j17, xz6Var, str9, "");
    }

    public static boolean q(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, java.lang.String str5, int i19, r45.uf6 uf6Var, java.lang.String str6, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, java.lang.String str7, java.lang.String str8, boolean z17, long j17, r45.xz6 xz6Var, java.lang.String str9, java.lang.String str10) {
        t21.v2 v2Var = new t21.v2();
        v2Var.f496533a = str;
        v2Var.f496548m = i17;
        v2Var.f496552q = str3;
        v2Var.f496554s = (java.lang.String) gm0.j1.u().c().l(2, "");
        v2Var.f496545j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        v2Var.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        v2Var.f496558w = str5;
        v2Var.f496557v = str4;
        v2Var.E = uf6Var;
        v2Var.F = str6;
        v2Var.l(c16564xb55e1d5);
        v2Var.M = str7;
        v2Var.W = true;
        v2Var.N = str8 != null ? str8 : "";
        v2Var.X = true;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            v2Var.o(str2);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            v2Var.f496555t = 1;
        }
        if (i18 > 0) {
            v2Var.f496555t = 1;
        }
        if (62 == i19) {
            v2Var.f496559x = 3;
        } else if (i18 > 0) {
            v2Var.f496559x = 2;
        } else {
            v2Var.f496559x = 1;
        }
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        bm5.f0 f0Var = bm5.f0.f104104s;
        java.lang.String rj6 = ((k90.b) u0Var).rj(null, f0Var, str, false);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str3, j17);
        if (z17 && Li.Q0() != null) {
            rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, f0Var, str, true);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rj6)) {
                rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, f0Var, str, false);
            }
        }
        int t17 = t21.w2.t(rj6);
        if (t17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "get Video size failed :" + str);
            return false;
        }
        v2Var.f496541f = t17;
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(Li, str, false);
        int t18 = t21.w2.t(tj6);
        if (t18 <= 0 && !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "get Thumb size failed :" + tj6 + " size:" + t18);
            return false;
        }
        v2Var.f496543h = t18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "init record file:" + str + " thumbsize:" + v2Var.f496543h + " videosize:" + v2Var.f496541f + " msgType:" + i19 + " forwardMsgId: " + c16564xb55e1d5 + " revokeMsgId: " + str10);
        v2Var.f496544i = 102;
        if (!z17 && j17 == -1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.u1(v2Var.h());
            f9Var.m124850x7650bebc(i19);
            f9Var.j1(1);
            if (!((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).hj()) {
                f9Var.i1(str);
            }
            f9Var.r1(1);
            f9Var.e1(c01.w9.o(v2Var.h()));
            f9Var.f275467n2 = str10;
            long x17 = c01.w9.x(f9Var);
            v2Var.f496549n = x17;
            v2Var.n(f9Var.Q0());
            if (x17 > 0) {
                java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f104105t, str, true);
                if (com.p314xaae8f345.mm.vfs.w6.j(tj6) && !android.text.TextUtils.equals(tj6, rj7)) {
                    com.p314xaae8f345.mm.vfs.w6.w(tj6, rj7);
                }
                java.lang.String rj8 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, f0Var, str, true);
                if (com.p314xaae8f345.mm.vfs.w6.j(rj6) && !android.text.TextUtils.equals(rj6, rj8)) {
                    com.p314xaae8f345.mm.vfs.w6.w(rj6, rj8);
                }
            }
        }
        if (j17 != -1) {
            v2Var.f496549n = j17;
            v2Var.n(str3);
            v2Var.f496559x = 4;
        }
        v2Var.Q = xz6Var;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str9)) {
            v2Var.R = str9;
            v2Var.f496534a0 = true;
        }
        return t21.o2.Ui().x(v2Var, true);
    }

    public static boolean r(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, r45.xz6 xz6Var, java.lang.String str4, int i19) {
        t21.v2 v2Var = new t21.v2();
        v2Var.f496533a = str;
        v2Var.f496548m = i17;
        v2Var.f496552q = str2;
        v2Var.f496554s = (java.lang.String) gm0.j1.u().c().l(2, "");
        v2Var.f496545j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        v2Var.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        v2Var.f496558w = str3;
        v2Var.l(c16564xb55e1d5);
        v2Var.R = str4;
        v2Var.f496534a0 = true;
        v2Var.Q = xz6Var;
        if (62 == i18) {
            v2Var.f496559x = 3;
        } else {
            v2Var.f496559x = 1;
        }
        if (((xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class))).aj()) {
            v2Var.f496541f = i19;
        } else {
            v2Var.f496541f = t21.w2.t(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, str, false));
        }
        v2Var.f496543h = t21.w2.t(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, str, false));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "init record file:" + str + " thumbsize:" + v2Var.f496543h + " videosize:" + v2Var.f496541f + " msgType:" + i18 + " forwardMsgId: " + c16564xb55e1d5);
        v2Var.f496544i = 102;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.u1(v2Var.h());
        f9Var.m124850x7650bebc(i18);
        f9Var.j1(1);
        if (!((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).hj()) {
            f9Var.i1(str);
        }
        f9Var.r1(1);
        f9Var.e1(c01.w9.o(v2Var.h()));
        v2Var.f496549n = c01.w9.x(f9Var);
        v2Var.n(f9Var.Q0());
        return t21.o2.Ui().x(v2Var, true);
    }

    public static boolean s() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20519x93434678()) == 1;
    }

    public static boolean t() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_send_video_placeholder_enable, bm5.h0.RepairerConfig_Mv_SendOVideoPlaceHolder_Int, 0) == 1;
    }

    public static boolean u(t21.v2 v2Var) {
        if (v2Var == null || !t() || !s()) {
            return false;
        }
        int i17 = v2Var.f496544i;
        return i17 == 104 || i17 == 105;
    }

    public static boolean v(java.lang.String str) {
        boolean containsKey;
        t21.v2 h17 = h(str);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "ERR:" + fp.k.c() + " getinfo failed: " + str);
            return false;
        }
        vf0.y2 y2Var = (vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class));
        if (y2Var.aj(str) && y2Var.ij(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(h17.f496549n, h17.f496553r))) {
            return true;
        }
        synchronized (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.f270783w) {
            containsKey = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.f270782v.containsKey(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "check %s is remuxing, ret %B", str, java.lang.Boolean.valueOf(containsKey));
        return containsKey;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r2 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void w(java.lang.String r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.d3.w(java.lang.String, int, boolean):void");
    }

    public static int x(long j17, java.lang.String str, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return i17;
        }
        try {
            java.lang.String[] split = str.split("_");
            if (split != null && split.length == 2 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split[0], 0L) == j17) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[1], 0);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "parseEnterVideoOpTips error: " + e17.toString());
        }
        return i17;
    }

    public static int y(java.lang.String str) {
        int a17;
        t21.v2 h17 = h(str);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "ERR:" + fp.k.c() + " getinfo failed: " + str);
            a17 = fp.k.a();
        } else {
            int i17 = h17.f496544i;
            if (i17 == 112 || i17 == 120 || i17 == 122 || i17 == 123) {
                h17.f496544i = 113;
                h17.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                h17.U = 1280;
                if (Q(h17)) {
                    return 0;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "ERR:" + fp.k.c() + " update failed: " + str);
                a17 = fp.k.a();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "ERR:" + fp.k.c() + " get status failed: " + str + " status:" + h17.f496544i);
                a17 = fp.k.a();
            }
        }
        return 0 - a17;
    }

    public static int z(java.lang.String str) {
        int a17;
        qi3.b0 b0Var;
        qi3.g0 g0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLogic", "pauseSend file:" + str);
        t21.v2 h17 = h(str);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "ERR:" + fp.k.c() + " getinfo failed: " + str);
            a17 = fp.k.a();
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f27 = pt0.f0.f2(h17.h(), h17.f496549n);
            if (f27 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "ERR:" + fp.k.c() + " get msg failed: " + str);
                a17 = fp.k.a();
            } else if (((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).aj(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f27.m124847x74d37ac6(), f27.Q0());
                yf0.p pVar = yf0.k0.f543109o;
                pVar.a().getClass();
                d75.c cVar = (d75.c) pVar.b().get(c16564xb55e1d5.m66995x9616526c());
                if (!((cVar == null || (b0Var = (qi3.b0) cVar.get()) == null || ((g0Var = ((qi3.c) b0Var).f445210f) != qi3.g0.f445243i && g0Var != qi3.g0.f445244m)) ? false : true)) {
                    h17.f496544i = 105;
                    h17.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                    h17.U = 1280;
                    Q(h17);
                    com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d52 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(h17.f496549n, h17.f496553r);
                    yf0.k0 a18 = pVar.a();
                    a18.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.VideoSendFSC", "cancelTask " + c16564xb55e1d52);
                    p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                    d75.c cVar2 = (d75.c) pVar.b().get(c16564xb55e1d52.m66995x9616526c());
                    qi3.b0 b0Var2 = cVar2 != null ? (qi3.b0) cVar2.get() : null;
                    h0Var.f391656d = b0Var2;
                    if (b0Var2 != null) {
                        b0Var2.x();
                    }
                    v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) a18.f543111f).mo141623x754a37bb(), null, new yf0.q(c16564xb55e1d52, h0Var, null), 1, null);
                    return 0;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoLogic", "pauseSend, isVideoSendingInCgiPhase, return");
                a17 = fp.k.a();
            } else {
                int i17 = h17.f496544i;
                if (i17 == 104 || i17 == 103) {
                    h17.f496544i = 105;
                    h17.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                    h17.U = 1280;
                    if (Q(h17)) {
                        return 0;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "ERR:" + fp.k.c() + " update pause status failed: " + str);
                    a17 = fp.k.a();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoLogic", "ERR:" + fp.k.c() + " get status failed: " + str + " status:" + h17.f496544i);
                    a17 = fp.k.a();
                }
            }
        }
        return 0 - a17;
    }
}
