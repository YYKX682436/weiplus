package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public class l3 implements sx.z, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f152594d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f152595e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f152596f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f152597g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f152598h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f152599i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f152600m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    public l3() {
        gm0.j1.d().a(379, this);
    }

    public static java.lang.String m(int i17, r45.jj4 jj4Var) {
        java.util.ArrayList o17;
        java.lang.String b17 = com.p314xaae8f345.mm.p947xba6de98f.i2.b("snsvideo", i17, "sns", jj4Var.f459388d);
        java.lang.String str = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            return null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(jj4Var.f459388d, b17) && jj4Var.f459388d.contains("SlideFullCardAd_")) {
            b17 = b17 + "_" + jj4Var.f459388d;
        }
        if (android.text.TextUtils.isEmpty(jj4Var.U)) {
            return b17;
        }
        if (!android.text.TextUtils.isEmpty(jj4Var.U) && (o17 = t21.d3.o(jj4Var.f459388d)) != null && o17.size() != 0) {
            java.util.Iterator it = o17.iterator();
            while (it.hasNext()) {
                t21.v2 v2Var = (t21.v2) it.next();
                if (android.text.TextUtils.isEmpty(v2Var.B) || v2Var.B.contains(jj4Var.U)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "getCurrentDownloadVideoInfoFlag for play mediaid:%s flag:%s path:%s", jj4Var.f459388d, v2Var.B, v2Var.C);
                    str = v2Var.D;
                    break;
                }
            }
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        return b17 + "_" + jj4Var.U;
    }

    @Override // sx.z
    public int a(java.lang.String str, dn.g gVar, dn.h hVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OnlineVideoService", "cdn callback mediaid is null.");
            return -1;
        }
        if (gVar == null && hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OnlineVideoService", "cdn callback info all null.");
            return -2;
        }
        cp.e.b("OnlineVideoService", new com.p314xaae8f345.mm.p947xba6de98f.a3(this, str, gVar, hVar));
        return ((java.util.HashMap) this.f152596f).get(str) != null ? 1 : 0;
    }

    @Override // sx.z
    public int b(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "onDownloadToEnd. offset %d, length %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        cp.e.b("OnlineVideoService", new com.p314xaae8f345.mm.p947xba6de98f.z2(this, str, i17, i18));
        return ((java.util.HashMap) this.f152596f).containsKey(str) ? 1 : 0;
    }

    @Override // sx.z
    public int c(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "onDataAvailable. offset %d, length %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        cp.e.b("OnlineVideoService", new com.p314xaae8f345.mm.p947xba6de98f.k3(this, str, i17, i18));
        return ((java.util.HashMap) this.f152596f).containsKey(str) ? 1 : 0;
    }

    @Override // sx.z
    public int d(java.lang.String str, int i17, int i18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        this.f152599i.mo50293x3498a0(new com.p314xaae8f345.mm.p947xba6de98f.j3(this, str, videoInfo, i17, i18));
        return ((java.util.HashMap) this.f152596f).containsKey(str) ? 1 : 0;
    }

    public boolean e(dn.o oVar, boolean z17) {
        if (oVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OnlineVideoService", "add download task, but task is null.");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.f69601xaca5bdda)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OnlineVideoService", "add download task, but task mediaId is null.");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "add download task : " + oVar.f69601xaca5bdda + " delay : " + z17 + " task play mode : " + oVar.H1);
        if (oVar.f69591xf9dbbe9c == null) {
            oVar.f69591xf9dbbe9c = "";
        }
        if (oVar.f69575xf11df5f5 == null) {
            oVar.f69575xf11df5f5 = "";
        }
        oVar.f323319e = false;
        if (g(oVar.f69601xaca5bdda, null) || z17) {
            cp.e.b("OnlineVideoService", new com.p314xaae8f345.mm.p947xba6de98f.c3(this, oVar));
            return true;
        }
        cp.e.b("OnlineVideoService", new com.p314xaae8f345.mm.p947xba6de98f.d3(this, oVar));
        return true;
    }

    public boolean f(dn.o oVar) {
        if (oVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OnlineVideoService", "add download task, but task is null.");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.f69601xaca5bdda)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OnlineVideoService", "add download task, but task mediaId is null.");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "add download task : " + oVar.f69601xaca5bdda);
        if (oVar.f69591xf9dbbe9c == null) {
            oVar.f69591xf9dbbe9c = "";
        }
        if (oVar.f69575xf11df5f5 == null) {
            oVar.f69575xf11df5f5 = "";
        }
        oVar.f323319e = false;
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p947xba6de98f.e3(this, oVar));
            return true;
        }
        this.f152600m.mo50302x6b17ad39(oVar.f69601xaca5bdda);
        ((java.util.LinkedList) this.f152594d).add(oVar.f69601xaca5bdda);
        ((java.util.HashMap) this.f152595e).put(oVar.f69601xaca5bdda, oVar);
        s(false);
        return true;
    }

    public boolean g(java.lang.String str, java.lang.Object[] objArr) {
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (((java.util.HashMap) this.f152596f).containsKey(str)) {
                z17 = true;
            } else {
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str);
            }
            cp.e.b("OnlineVideoService", new com.p314xaae8f345.mm.p947xba6de98f.g3(this, str, objArr));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "cancelDownloadTask mediaId : " + str + " remove : " + z17);
        return z17;
    }

    public boolean h(java.lang.String str, java.lang.Object[] objArr) {
        boolean z17;
        boolean z18 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.util.Map map = this.f152596f;
            if (((java.util.HashMap) map).containsKey(str)) {
                z17 = true;
            } else {
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str);
                z17 = false;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f152600m;
            if (!z17 || android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                n3Var.mo50302x6b17ad39(str);
                dn.o oVar = (dn.o) ((java.util.HashMap) map).remove(str);
                if (oVar != null) {
                    dn.h hVar = new dn.h();
                    int aj6 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).aj(oVar.f69601xaca5bdda, hVar);
                    if (aj6 == 0) {
                        r(objArr, hVar, oVar, false);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OnlineVideoService", "stop video stream download error. ret %d, mediaId %s", java.lang.Integer.valueOf(aj6), oVar.f69601xaca5bdda);
                    }
                } else {
                    dn.o oVar2 = (dn.o) ((java.util.HashMap) this.f152597g).remove(str);
                    dn.h hVar2 = (dn.h) ((java.util.HashMap) this.f152598h).remove(str);
                    if (oVar2 != null && hVar2 != null) {
                        r(objArr, hVar2, oVar2, true);
                    }
                }
                ((java.util.HashMap) this.f152595e).remove(str);
            } else {
                n3Var.mo50296x41bd0e60(new com.p314xaae8f345.mm.p947xba6de98f.f3(this, str, objArr), str, android.os.SystemClock.uptimeMillis());
            }
            z18 = z17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "cancelDownloadTaskInMainThread mediaId : " + str + " remove : " + z18);
        return z18;
    }

    public boolean i(java.lang.String str, java.lang.Object[] objArr, wf0.i1 i1Var) {
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (((java.util.HashMap) this.f152596f).containsKey(str)) {
                z17 = true;
            } else {
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str);
            }
            cp.e.b("OnlineVideoService", new com.p314xaae8f345.mm.p947xba6de98f.h3(this, str, objArr, i1Var));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "cancelDownloadTaskWithCallback mediaId : " + str + " remove : " + z17);
        return z17;
    }

    public dn.o j(java.lang.String str, boolean z17) {
        t21.v2 h17;
        java.lang.String rj6;
        int i17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (h17 = t21.d3.h(str)) == null) {
            return null;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(h17.g(), "msg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OnlineVideoService", "cdntra parse video recv xml failed");
            return null;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl");
        java.lang.String str3 = (java.lang.String) d17.get(".msg.videomsg.$cdnrawvideourl");
        java.lang.String str4 = (java.lang.String) d17.get(".msg.videomsg.$rawlength");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OnlineVideoService", "cdntra parse video recv xml failed");
            return null;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.videomsg.$length"), 0);
        java.lang.String str5 = (java.lang.String) d17.get(".msg.videomsg.$md5");
        java.lang.String str6 = (java.lang.String) d17.get(".msg.videomsg.$aeskey");
        java.lang.String str7 = (java.lang.String) d17.get(".msg.videomsg.$fileparam");
        java.lang.String b17 = com.p314xaae8f345.mm.p947xba6de98f.i2.b("downvideo", h17.f496545j, h17.h(), h17.d());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OnlineVideoService", "cdntra genClientId failed not use cdn file:%s", h17.d());
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(h17.h(), h17.f496537c);
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20550x84d8fe25()) == 1) {
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            bm5.f0 f0Var = bm5.f0.f104104s;
            k90.b bVar = (k90.b) u0Var;
            bVar.getClass();
            rj6 = bVar.wi(bVar.rj(o27, f0Var, str, true));
        } else {
            rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(o27, bm5.f0.f104104s, str, true);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("msgid:");
        sb6.append(h17.f496537c);
        sb6.append("\r\nsource_format:");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? 4 : 14);
        sb6.append("\r\nHDVideo:0");
        java.lang.String sb7 = sb6.toString();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            sb7 = sb7 + "\r\nsource_filesize:" + str4;
        }
        dn.o oVar = new dn.o();
        oVar.f323318d = "task_OnlineVideoService_1";
        oVar.N = sb7;
        oVar.E1 = str;
        oVar.F1 = str5;
        oVar.G1 = P;
        oVar.H1 = z17 ? 1 : 0;
        oVar.J1 = h17.e();
        oVar.I1 = h17.h();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(h17.h())) {
            rv1.e eVar = (rv1.e) i95.n0.c(rv1.e.class);
            java.lang.String h18 = h17.h();
            ((c01.w1) eVar).getClass();
            i17 = c01.v1.o(h18);
        } else {
            i17 = 0;
        }
        oVar.K1 = i17;
        oVar.f69601xaca5bdda = b17;
        oVar.f69595x6d25b0d9 = rj6;
        oVar.f69592xf1ebe47b = 4;
        oVar.f69620xeb1a61d6 = P;
        oVar.f69575xf11df5f5 = str6;
        oVar.f69591xf9dbbe9c = str2;
        oVar.f69609xd84b8349 = 2;
        oVar.f69625x7bc6cbf2 = str7;
        oVar.f69586x737ec037 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(h17.h()) ? 1 : 0;
        oVar.L1 = h17.G;
        if (o27 != null) {
            c01.ea w17 = c01.w9.w(o27.G);
            oVar.f323336v = 0;
            oVar.f323337w = 0;
            oVar.O1 = o27.mo78012x3fdd41df();
            oVar.P1 = o27.I0();
            oVar.V1 = w17 != null ? w17.f118694t : 0;
            if (oVar.f323336v > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 36L, 1L, false);
            }
        }
        oVar.f69583xfebd470e = false;
        oVar.f69610x4f5245a8 = d11.s.wi(z17 ? 1 : 0, h17, true);
        return oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dn.o k(com.p314xaae8f345.mm.p2621x8fb0427b.s7 r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, boolean r26, java.lang.String r27, int r28, long r29, java.lang.String r31, r45.jj4 r32) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p947xba6de98f.l3.k(com.tencent.mm.storage.s7, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, long, java.lang.String, r45.jj4):dn.o");
    }

    public final void l(t21.v2 v2Var, int i17, java.lang.String str, dn.o oVar) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "download finish. totalLen %d ", java.lang.Integer.valueOf(i17));
        if ((j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20550x84d8fe25()) == 1) && oVar != null && (str2 = oVar.f69595x6d25b0d9) != null && ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).zj(str2)) {
            ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).getClass();
            java.lang.String str5 = "";
            if (!(str2 == null || str2.length() == 0)) {
                int O = r26.n0.O(str2, '/', 0, false, 6, null);
                if (O >= 0) {
                    str3 = str2.substring(O + 1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "substring(...)");
                } else {
                    str3 = str2;
                }
                if (r26.i0.A(str3, "tmp_", false, 2, null)) {
                    if (O >= 0) {
                        str4 = str2.substring(0, O + 1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "substring(...)");
                    } else {
                        str4 = "";
                    }
                    java.lang.String substring = str3.substring(4);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    str5 = str4.concat(substring);
                } else {
                    str5 = str2;
                }
            }
            if (!vf0.c.fj(str2, str5)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OnlineVideoService", "downloadFinish: rename tmp to final failed, skip status update. tmp=%s", str2);
                return;
            }
        }
        if (v2Var != null) {
            t21.d3.N(v2Var.d(), i17);
            java.lang.String d17 = v2Var.d();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, d17, false);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || i17 <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rj6)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OnlineVideoService", "insert media duplication but args is error.[%d, %s, %s]", java.lang.Integer.valueOf(i17), str, rj6);
                } else {
                    ((com.p314xaae8f345.mm.p2621x8fb0427b.w8) ((g90.o0) ((h90.b0) i95.n0.c(h90.b0.class))).wi()).i(str, i17, rj6);
                }
            }
        }
        if (oVar == null) {
            return;
        }
        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_c2c_video_retransmit_use_link_enable, bm5.h0.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) == 1) && oVar.h() && v2Var != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v2Var.h())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "downloadFinish, user is null, just return");
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(v2Var.h(), v2Var.f496537c);
            if (o27 == null) {
                return;
            }
            java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(o27, bm5.f0.f104104s, v2Var.d(), false);
            java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(o27, v2Var.d(), false);
            if (com.p314xaae8f345.mm.vfs.w6.j(rj7)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "check c2c video recv dup, ret = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(rj7, o27.mo78013xfb85f7b0(), oVar.f69593x419c9c3d, null).f559224a);
            }
            if (com.p314xaae8f345.mm.vfs.w6.j(tj6)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "check c2c video thumb recv dup, ret = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(tj6, o27.mo78013xfb85f7b0(), com.p314xaae8f345.mm.vfs.w6.p(tj6), null).f559224a);
            }
        }
    }

    public final java.lang.String n(java.lang.String svrFlag) {
        ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsMultiVideoSpecMapping", "com.tencent.mm.feature.sns.SnsFeatureService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(svrFlag, "svrFlag");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDefaultSpecFlagMapping", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMultiSpecVideoHelper", "getDefaultSpecFLagMapping >> svrFlag: ".concat(svrFlag));
        if ((svrFlag.length() > 0) && r26.n0.B(svrFlag, "xWT", false)) {
            try {
                int parseInt = java.lang.Integer.parseInt(r26.i0.t(svrFlag, "xWT", "", false));
                java.lang.String str = parseInt == 0 ? "V0" : parseInt < 10000 ? "V4" : "V2";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDefaultSpecFlagMapping", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
                svrFlag = str;
            } catch (java.lang.NumberFormatException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsMultiSpecVideoHelper", "getDefaultSpecFlagMapping error >> " + e17.getMessage());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsMultiVideoSpecMapping", "com.tencent.mm.feature.sns.SnsFeatureService");
            return svrFlag;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDefaultSpecFlagMapping", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsMultiVideoSpecMapping", "com.tencent.mm.feature.sns.SnsFeatureService");
        return svrFlag;
    }

    public boolean o(java.lang.String str, int i17, int i18) {
        if (((dn.o) ((java.util.HashMap) this.f152596f).get(str)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "this media[%s] don't download now.", str);
            return false;
        }
        ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).getClass();
        com.p314xaae8f345.mm.p947xba6de98f.s1.cj().getClass();
        boolean m37752x9b94c84e = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37752x9b94c84e(str, i17, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "is video[%s] data[%d, %d] available[%b]", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(m37752x9b94c84e));
        return m37752x9b94c84e;
    }

    @Override // sx.z
    /* renamed from: onM3U8Ready */
    public int mo48095xc5dd699b(java.lang.String str, java.lang.String str2) {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() != 379) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "it get cdn dns success[%d, %d], try to start.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (gm0.j1.b().m()) {
            cp.e.b("OnlineVideoService", new com.p314xaae8f345.mm.p947xba6de98f.b3(this));
        }
    }

    public int p(java.lang.String str, int i17, int i18, int i19) {
        int Ni = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ni(str, i17, i18, i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoService", "request video video[%s], offset[%d], length[%d] duration[%d] ret[%d]", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(Ni));
        return Ni;
    }

    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 c17683x770f5025) {
        if (c17683x770f5025 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17891, java.lang.Integer.valueOf(c17683x770f5025.f37985x670be1dc), java.lang.Integer.valueOf(c17683x770f5025.f37972x5231341c), java.lang.Integer.valueOf(c17683x770f5025.f37970xda265591), java.lang.Integer.valueOf(c17683x770f5025.f37971x65b9f884), java.lang.Integer.valueOf(c17683x770f5025.f37969x1c0e30bf), java.lang.Integer.valueOf(c17683x770f5025.f37959xb69dd4fc), java.lang.Integer.valueOf(c17683x770f5025.f37958xb69dd486), java.lang.Integer.valueOf(c17683x770f5025.f37986x7fddbbc2), java.lang.Integer.valueOf(c17683x770f5025.f37974x3329b521), java.lang.Integer.valueOf(c17683x770f5025.f37973x1dea449f), java.lang.Integer.valueOf(c17683x770f5025.f37979xb40e463b), java.lang.Integer.valueOf(c17683x770f5025.f37980xce669d45), java.lang.Integer.valueOf(c17683x770f5025.f37978xe49e1188), java.lang.Integer.valueOf(c17683x770f5025.f37961x8ac7cede), java.lang.Integer.valueOf(c17683x770f5025.f37960xf8085845), java.lang.Integer.valueOf(c17683x770f5025.f37984xcef56b5b), java.lang.Integer.valueOf(c17683x770f5025.f37955x7e29a8b4), java.lang.Integer.valueOf(c17683x770f5025.f37965xbc20d806), java.lang.Integer.valueOf(c17683x770f5025.f37962x38236bb1), java.lang.Integer.valueOf(c17683x770f5025.f37990xbd1335dd), java.lang.Integer.valueOf(c17683x770f5025.f37975xf23d7137), java.lang.Integer.valueOf(c17683x770f5025.f37967xda5943dd), java.lang.Integer.valueOf(c17683x770f5025.f37956x8c577f5f), java.lang.Integer.valueOf(c17683x770f5025.f37988x81158a4f), java.lang.Integer.valueOf(c17683x770f5025.f37966x89444d94), java.lang.Integer.valueOf(c17683x770f5025.f37983xb58a4d64), java.lang.Integer.valueOf(c17683x770f5025.f37989x86a80179), java.lang.Integer.valueOf(c17683x770f5025.f37982xf529b1c5), java.lang.Integer.valueOf(c17683x770f5025.f37981x6fbd6873), java.lang.Integer.valueOf(c17683x770f5025.f37976x3c974bd), java.lang.Integer.valueOf(c17683x770f5025.f37977x35ed7653), java.lang.Integer.valueOf(c17683x770f5025.f37963x5b727f66), java.lang.Integer.valueOf(c17683x770f5025.f37964x8d9680fc), java.lang.Integer.valueOf(c17683x770f5025.f37957x2139ca97), java.lang.Integer.valueOf(c17683x770f5025.f37968x25a6ad17), java.lang.Integer.valueOf(c17683x770f5025.f37987x2c4c29be), java.lang.Integer.valueOf(c17683x770f5025.f37992x74f72c51), java.lang.Long.valueOf(c17683x770f5025.crf * 10), java.lang.Integer.valueOf(c17683x770f5025.f37991x6c41574b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0577  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(java.lang.Object[] r44, dn.h r45, dn.o r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 2131
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p947xba6de98f.l3.r(java.lang.Object[], dn.h, dn.o, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(boolean r25) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p947xba6de98f.l3.s(boolean):void");
    }
}
