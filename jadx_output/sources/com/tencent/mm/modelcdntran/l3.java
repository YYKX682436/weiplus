package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class l3 implements sx.z, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f71061d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f71062e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f71063f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f71064g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f71065h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f71066i = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f71067m = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    public l3() {
        gm0.j1.d().a(379, this);
    }

    public static java.lang.String m(int i17, r45.jj4 jj4Var) {
        java.util.ArrayList o17;
        java.lang.String b17 = com.tencent.mm.modelcdntran.i2.b("snsvideo", i17, "sns", jj4Var.f377855d);
        java.lang.String str = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            return null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.N0(jj4Var.f377855d, b17) && jj4Var.f377855d.contains("SlideFullCardAd_")) {
            b17 = b17 + "_" + jj4Var.f377855d;
        }
        if (android.text.TextUtils.isEmpty(jj4Var.U)) {
            return b17;
        }
        if (!android.text.TextUtils.isEmpty(jj4Var.U) && (o17 = t21.d3.o(jj4Var.f377855d)) != null && o17.size() != 0) {
            java.util.Iterator it = o17.iterator();
            while (it.hasNext()) {
                t21.v2 v2Var = (t21.v2) it.next();
                if (android.text.TextUtils.isEmpty(v2Var.B) || v2Var.B.contains(jj4Var.U)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "getCurrentDownloadVideoInfoFlag for play mediaid:%s flag:%s path:%s", jj4Var.f377855d, v2Var.B, v2Var.C);
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
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OnlineVideoService", "cdn callback mediaid is null.");
            return -1;
        }
        if (gVar == null && hVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OnlineVideoService", "cdn callback info all null.");
            return -2;
        }
        cp.e.b("OnlineVideoService", new com.tencent.mm.modelcdntran.a3(this, str, gVar, hVar));
        return ((java.util.HashMap) this.f71063f).get(str) != null ? 1 : 0;
    }

    @Override // sx.z
    public int b(java.lang.String str, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "onDownloadToEnd. offset %d, length %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        cp.e.b("OnlineVideoService", new com.tencent.mm.modelcdntran.z2(this, str, i17, i18));
        return ((java.util.HashMap) this.f71063f).containsKey(str) ? 1 : 0;
    }

    @Override // sx.z
    public int c(java.lang.String str, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "onDataAvailable. offset %d, length %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        cp.e.b("OnlineVideoService", new com.tencent.mm.modelcdntran.k3(this, str, i17, i18));
        return ((java.util.HashMap) this.f71063f).containsKey(str) ? 1 : 0;
    }

    @Override // sx.z
    public int d(java.lang.String str, int i17, int i18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        this.f71066i.post(new com.tencent.mm.modelcdntran.j3(this, str, videoInfo, i17, i18));
        return ((java.util.HashMap) this.f71063f).containsKey(str) ? 1 : 0;
    }

    public boolean e(dn.o oVar, boolean z17) {
        if (oVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OnlineVideoService", "add download task, but task is null.");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(oVar.field_mediaId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OnlineVideoService", "add download task, but task mediaId is null.");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "add download task : " + oVar.field_mediaId + " delay : " + z17 + " task play mode : " + oVar.H1);
        if (oVar.field_fileId == null) {
            oVar.field_fileId = "";
        }
        if (oVar.field_aesKey == null) {
            oVar.field_aesKey = "";
        }
        oVar.f241786e = false;
        if (g(oVar.field_mediaId, null) || z17) {
            cp.e.b("OnlineVideoService", new com.tencent.mm.modelcdntran.c3(this, oVar));
            return true;
        }
        cp.e.b("OnlineVideoService", new com.tencent.mm.modelcdntran.d3(this, oVar));
        return true;
    }

    public boolean f(dn.o oVar) {
        if (oVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OnlineVideoService", "add download task, but task is null.");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(oVar.field_mediaId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OnlineVideoService", "add download task, but task mediaId is null.");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "add download task : " + oVar.field_mediaId);
        if (oVar.field_fileId == null) {
            oVar.field_fileId = "";
        }
        if (oVar.field_aesKey == null) {
            oVar.field_aesKey = "";
        }
        oVar.f241786e = false;
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.modelcdntran.e3(this, oVar));
            return true;
        }
        this.f71067m.removeCallbacksAndMessages(oVar.field_mediaId);
        ((java.util.LinkedList) this.f71061d).add(oVar.field_mediaId);
        ((java.util.HashMap) this.f71062e).put(oVar.field_mediaId, oVar);
        s(false);
        return true;
    }

    public boolean g(java.lang.String str, java.lang.Object[] objArr) {
        boolean z17 = false;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (((java.util.HashMap) this.f71063f).containsKey(str)) {
                z17 = true;
            } else {
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str);
            }
            cp.e.b("OnlineVideoService", new com.tencent.mm.modelcdntran.g3(this, str, objArr));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "cancelDownloadTask mediaId : " + str + " remove : " + z17);
        return z17;
    }

    public boolean h(java.lang.String str, java.lang.Object[] objArr) {
        boolean z17;
        boolean z18 = false;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.util.Map map = this.f71063f;
            if (((java.util.HashMap) map).containsKey(str)) {
                z17 = true;
            } else {
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str);
                z17 = false;
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f71067m;
            if (!z17 || android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                n3Var.removeCallbacksAndMessages(str);
                dn.o oVar = (dn.o) ((java.util.HashMap) map).remove(str);
                if (oVar != null) {
                    dn.h hVar = new dn.h();
                    int aj6 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).aj(oVar.field_mediaId, hVar);
                    if (aj6 == 0) {
                        r(objArr, hVar, oVar, false);
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.OnlineVideoService", "stop video stream download error. ret %d, mediaId %s", java.lang.Integer.valueOf(aj6), oVar.field_mediaId);
                    }
                } else {
                    dn.o oVar2 = (dn.o) ((java.util.HashMap) this.f71064g).remove(str);
                    dn.h hVar2 = (dn.h) ((java.util.HashMap) this.f71065h).remove(str);
                    if (oVar2 != null && hVar2 != null) {
                        r(objArr, hVar2, oVar2, true);
                    }
                }
                ((java.util.HashMap) this.f71062e).remove(str);
            } else {
                n3Var.postAtTime(new com.tencent.mm.modelcdntran.f3(this, str, objArr), str, android.os.SystemClock.uptimeMillis());
            }
            z18 = z17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "cancelDownloadTaskInMainThread mediaId : " + str + " remove : " + z18);
        return z18;
    }

    public boolean i(java.lang.String str, java.lang.Object[] objArr, wf0.i1 i1Var) {
        boolean z17 = false;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (((java.util.HashMap) this.f71063f).containsKey(str)) {
                z17 = true;
            } else {
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str);
            }
            cp.e.b("OnlineVideoService", new com.tencent.mm.modelcdntran.h3(this, str, objArr, i1Var));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "cancelDownloadTaskWithCallback mediaId : " + str + " remove : " + z17);
        return z17;
    }

    public dn.o j(java.lang.String str, boolean z17) {
        t21.v2 h17;
        java.lang.String rj6;
        int i17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (h17 = t21.d3.h(str)) == null) {
            return null;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(h17.g(), "msg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OnlineVideoService", "cdntra parse video recv xml failed");
            return null;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl");
        java.lang.String str3 = (java.lang.String) d17.get(".msg.videomsg.$cdnrawvideourl");
        java.lang.String str4 = (java.lang.String) d17.get(".msg.videomsg.$rawlength");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OnlineVideoService", "cdntra parse video recv xml failed");
            return null;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.videomsg.$length"), 0);
        java.lang.String str5 = (java.lang.String) d17.get(".msg.videomsg.$md5");
        java.lang.String str6 = (java.lang.String) d17.get(".msg.videomsg.$aeskey");
        java.lang.String str7 = (java.lang.String) d17.get(".msg.videomsg.$fileparam");
        java.lang.String b17 = com.tencent.mm.modelcdntran.i2.b("downvideo", h17.f415012j, h17.h(), h17.d());
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OnlineVideoService", "cdntra genClientId failed not use cdn file:%s", h17.d());
            return null;
        }
        com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(h17.h(), h17.f415004c);
        if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigVideoPathRenameEnable()) == 1) {
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            bm5.f0 f0Var = bm5.f0.f22571s;
            k90.b bVar = (k90.b) u0Var;
            bVar.getClass();
            rj6 = bVar.wi(bVar.rj(o27, f0Var, str, true));
        } else {
            rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(o27, bm5.f0.f22571s, str, true);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("msgid:");
        sb6.append(h17.f415004c);
        sb6.append("\r\nsource_format:");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.K0(str3) ? 4 : 14);
        sb6.append("\r\nHDVideo:0");
        java.lang.String sb7 = sb6.toString();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            sb7 = sb7 + "\r\nsource_filesize:" + str4;
        }
        dn.o oVar = new dn.o();
        oVar.f241785d = "task_OnlineVideoService_1";
        oVar.N = sb7;
        oVar.E1 = str;
        oVar.F1 = str5;
        oVar.G1 = P;
        oVar.H1 = z17 ? 1 : 0;
        oVar.J1 = h17.e();
        oVar.I1 = h17.h();
        if (com.tencent.mm.storage.z3.R4(h17.h())) {
            rv1.e eVar = (rv1.e) i95.n0.c(rv1.e.class);
            java.lang.String h18 = h17.h();
            ((c01.w1) eVar).getClass();
            i17 = c01.v1.o(h18);
        } else {
            i17 = 0;
        }
        oVar.K1 = i17;
        oVar.field_mediaId = b17;
        oVar.field_fullpath = rj6;
        oVar.field_fileType = 4;
        oVar.field_totalLen = P;
        oVar.field_aesKey = str6;
        oVar.field_fileId = str2;
        oVar.field_priority = 2;
        oVar.field_wxmsgparam = str7;
        oVar.field_chattype = com.tencent.mm.storage.z3.R4(h17.h()) ? 1 : 0;
        oVar.L1 = h17.G;
        if (o27 != null) {
            c01.ea w17 = c01.w9.w(o27.G);
            oVar.f241803v = 0;
            oVar.f241804w = 0;
            oVar.O1 = o27.getCreateTime();
            oVar.P1 = o27.I0();
            oVar.V1 = w17 != null ? w17.f37161t : 0;
            if (oVar.f241803v > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 36L, 1L, false);
            }
        }
        oVar.field_autostart = false;
        oVar.field_requestVideoFormat = d11.s.wi(z17 ? 1 : 0, h17, true);
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
    public dn.o k(com.tencent.mm.storage.s7 r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, boolean r26, java.lang.String r27, int r28, long r29, java.lang.String r31, r45.jj4 r32) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelcdntran.l3.k(com.tencent.mm.storage.s7, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, long, java.lang.String, r45.jj4):dn.o");
    }

    public final void l(t21.v2 v2Var, int i17, java.lang.String str, dn.o oVar) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "download finish. totalLen %d ", java.lang.Integer.valueOf(i17));
        if ((j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigVideoPathRenameEnable()) == 1) && oVar != null && (str2 = oVar.field_fullpath) != null && ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).zj(str2)) {
            ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).getClass();
            java.lang.String str5 = "";
            if (!(str2 == null || str2.length() == 0)) {
                int O = r26.n0.O(str2, '/', 0, false, 6, null);
                if (O >= 0) {
                    str3 = str2.substring(O + 1);
                    kotlin.jvm.internal.o.f(str3, "substring(...)");
                } else {
                    str3 = str2;
                }
                if (r26.i0.A(str3, "tmp_", false, 2, null)) {
                    if (O >= 0) {
                        str4 = str2.substring(0, O + 1);
                        kotlin.jvm.internal.o.f(str4, "substring(...)");
                    } else {
                        str4 = "";
                    }
                    java.lang.String substring = str3.substring(4);
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    str5 = str4.concat(substring);
                } else {
                    str5 = str2;
                }
            }
            if (!vf0.c.fj(str2, str5)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OnlineVideoService", "downloadFinish: rename tmp to final failed, skip status update. tmp=%s", str2);
                return;
            }
        }
        if (v2Var != null) {
            t21.d3.N(v2Var.d(), i17);
            java.lang.String d17 = v2Var.d();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, d17, false);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str) || i17 <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(rj6)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.OnlineVideoService", "insert media duplication but args is error.[%d, %s, %s]", java.lang.Integer.valueOf(i17), str, rj6);
                } else {
                    ((com.tencent.mm.storage.w8) ((g90.o0) ((h90.b0) i95.n0.c(h90.b0.class))).wi()).i(str, i17, rj6);
                }
            }
        }
        if (oVar == null) {
            return;
        }
        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_c2c_video_retransmit_use_link_enable, bm5.h0.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) == 1) && oVar.h() && v2Var != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(v2Var.h())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "downloadFinish, user is null, just return");
                return;
            }
            com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(v2Var.h(), v2Var.f415004c);
            if (o27 == null) {
                return;
            }
            java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(o27, bm5.f0.f22571s, v2Var.d(), false);
            java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(o27, v2Var.d(), false);
            if (com.tencent.mm.vfs.w6.j(rj7)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "check c2c video recv dup, ret = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(rj7, o27.getType(), oVar.field_filemd5, null).f477691a);
            }
            if (com.tencent.mm.vfs.w6.j(tj6)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "check c2c video thumb recv dup, ret = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(tj6, o27.getType(), com.tencent.mm.vfs.w6.p(tj6), null).f477691a);
            }
        }
    }

    public final java.lang.String n(java.lang.String svrFlag) {
        ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsMultiVideoSpecMapping", "com.tencent.mm.feature.sns.SnsFeatureService");
        kotlin.jvm.internal.o.g(svrFlag, "svrFlag");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDefaultSpecFlagMapping", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMultiSpecVideoHelper", "getDefaultSpecFLagMapping >> svrFlag: ".concat(svrFlag));
        if ((svrFlag.length() > 0) && r26.n0.B(svrFlag, "xWT", false)) {
            try {
                int parseInt = java.lang.Integer.parseInt(r26.i0.t(svrFlag, "xWT", "", false));
                java.lang.String str = parseInt == 0 ? "V0" : parseInt < 10000 ? "V4" : "V2";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDefaultSpecFlagMapping", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
                svrFlag = str;
            } catch (java.lang.NumberFormatException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsMultiSpecVideoHelper", "getDefaultSpecFlagMapping error >> " + e17.getMessage());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsMultiVideoSpecMapping", "com.tencent.mm.feature.sns.SnsFeatureService");
            return svrFlag;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDefaultSpecFlagMapping", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsMultiVideoSpecMapping", "com.tencent.mm.feature.sns.SnsFeatureService");
        return svrFlag;
    }

    public boolean o(java.lang.String str, int i17, int i18) {
        if (((dn.o) ((java.util.HashMap) this.f71063f).get(str)) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "this media[%s] don't download now.", str);
            return false;
        }
        ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).getClass();
        com.tencent.mm.modelcdntran.s1.cj().getClass();
        boolean isVideoDataAvailable = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).isVideoDataAvailable(str, i17, i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "is video[%s] data[%d, %d] available[%b]", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(isVideoDataAvailable));
        return isVideoDataAvailable;
    }

    @Override // sx.z
    public int onM3U8Ready(java.lang.String str, java.lang.String str2) {
        return 0;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() != 379) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "it get cdn dns success[%d, %d], try to start.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (gm0.j1.b().m()) {
            cp.e.b("OnlineVideoService", new com.tencent.mm.modelcdntran.b3(this));
        }
    }

    public int p(java.lang.String str, int i17, int i18, int i19) {
        int Ni = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ni(str, i17, i18, i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "request video video[%s], offset[%d], length[%d] duration[%d] ret[%d]", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(Ni));
        return Ni;
    }

    public void q(com.tencent.mm.plugin.sight.base.ABAPrams aBAPrams) {
        if (aBAPrams == null) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17891, java.lang.Integer.valueOf(aBAPrams.sceneCase), java.lang.Integer.valueOf(aBAPrams.inputWidth), java.lang.Integer.valueOf(aBAPrams.inputHeight), java.lang.Integer.valueOf(aBAPrams.inputKbps), java.lang.Integer.valueOf(aBAPrams.inputFps), java.lang.Integer.valueOf(aBAPrams.averageQP), java.lang.Integer.valueOf(aBAPrams.averageMV), java.lang.Integer.valueOf(aBAPrams.skipMode), java.lang.Integer.valueOf(aBAPrams.intraMode), java.lang.Integer.valueOf(aBAPrams.interMode), java.lang.Integer.valueOf(aBAPrams.outputKbps), java.lang.Integer.valueOf(aBAPrams.outputWidth), java.lang.Integer.valueOf(aBAPrams.outputHeight), java.lang.Integer.valueOf(aBAPrams.bitrateAdaptiveUP), java.lang.Integer.valueOf(aBAPrams.bitrateAdaptiveDown), java.lang.Integer.valueOf(aBAPrams.resolutionAdjust), java.lang.Integer.valueOf(aBAPrams.SkipReadQP), java.lang.Integer.valueOf(aBAPrams.consumingtime), java.lang.Integer.valueOf(aBAPrams.codecID), java.lang.Integer.valueOf(aBAPrams.transcosingKbps), java.lang.Integer.valueOf(aBAPrams.isEnableHEVC), java.lang.Integer.valueOf(aBAPrams.enableABA), java.lang.Integer.valueOf(aBAPrams.abaPreset), java.lang.Integer.valueOf(aBAPrams.startTime), java.lang.Integer.valueOf(aBAPrams.duration), java.lang.Integer.valueOf(aBAPrams.ratiosBitrateQP), java.lang.Integer.valueOf(aBAPrams.textureComplexity), java.lang.Integer.valueOf(aBAPrams.qualityLevel), java.lang.Integer.valueOf(aBAPrams.platform), java.lang.Integer.valueOf(aBAPrams.oriAudioBitrate), java.lang.Integer.valueOf(aBAPrams.oriAudioChannel), java.lang.Integer.valueOf(aBAPrams.compAudioBitrate), java.lang.Integer.valueOf(aBAPrams.compAudioChannel), java.lang.Integer.valueOf(aBAPrams.addStickers), java.lang.Integer.valueOf(aBAPrams.enableSWHEVCTrans), java.lang.Integer.valueOf(aBAPrams.skipVideoCompress), java.lang.Integer.valueOf(aBAPrams.vcodec2Preset), java.lang.Long.valueOf(aBAPrams.crf * 10), java.lang.Integer.valueOf(aBAPrams.vbvBufferSize));
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelcdntran.l3.r(java.lang.Object[], dn.h, dn.o, boolean):void");
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelcdntran.l3.s(boolean):void");
    }
}
