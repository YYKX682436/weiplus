package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes15.dex */
public final class v implements ye1.e {

    /* renamed from: a, reason: collision with root package name */
    public rh3.r f90907a;

    /* renamed from: b, reason: collision with root package name */
    public rh3.q f90908b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f90909c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f90910d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f90911e;

    /* renamed from: f, reason: collision with root package name */
    public r45.n23 f90912f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f90913g;

    /* renamed from: h, reason: collision with root package name */
    public ye1.l f90914h;

    /* renamed from: i, reason: collision with root package name */
    public ye1.j f90915i;

    /* renamed from: j, reason: collision with root package name */
    public ye1.m f90916j;

    /* renamed from: k, reason: collision with root package name */
    public ye1.g f90917k;

    /* renamed from: l, reason: collision with root package name */
    public ye1.n f90918l;

    /* renamed from: m, reason: collision with root package name */
    public ye1.f f90919m;

    /* renamed from: n, reason: collision with root package name */
    public ye1.q f90920n;

    /* renamed from: o, reason: collision with root package name */
    public ye1.i f90921o;

    public v() {
        com.tencent.mm.plugin.appbrand.video.player.thumb.s sVar = new com.tencent.mm.plugin.appbrand.video.player.thumb.s(this);
        com.tencent.mm.plugin.appbrand.video.player.thumb.p pVar = com.tencent.mm.plugin.appbrand.video.player.thumb.p.f90900a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pVar.d(context, false, false);
        this.f90908b = new com.tencent.mm.plugin.appbrand.video.player.thumb.r();
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mars.xlog.Log.i("MMPlayerFactory", "buildMPPlayer");
        rh3.r rVar = new rh3.r(new sh3.a(new com.tencent.thumbplayer.tplayer.TPPlayer(context2), null));
        this.f90907a = rVar;
        rVar.q(sVar);
        rh3.r rVar2 = this.f90907a;
        if (rVar2 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        rVar2.j(sVar);
        rh3.r rVar3 = this.f90907a;
        if (rVar3 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        rVar3.i(sVar);
        rh3.r rVar4 = this.f90907a;
        if (rVar4 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        rVar4.k(sVar);
        rh3.r rVar5 = this.f90907a;
        if (rVar5 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        rVar5.h(sVar);
        rh3.r rVar6 = this.f90907a;
        if (rVar6 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        rVar6.l(sVar);
        rh3.r rVar7 = this.f90907a;
        if (rVar7 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        rVar7.f(sVar);
        rh3.r rVar8 = this.f90907a;
        if (rVar8 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        rVar8.o(sVar);
        rh3.r rVar9 = this.f90907a;
        if (rVar9 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        rVar9.p(sVar);
        rh3.r rVar10 = this.f90907a;
        if (rVar10 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        rVar10.g(sVar);
        rh3.r rVar11 = this.f90907a;
        if (rVar11 == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        rh3.q qVar = this.f90908b;
        if (qVar == null) {
            kotlin.jvm.internal.o.o("onePlayContext");
            throw null;
        }
        rVar11.d(qVar);
        com.tencent.mars.xlog.Log.i(E(), "initPlayer");
    }

    @Override // ye1.e
    public void B(ye1.m mVar) {
        this.f90916j = mVar;
    }

    @Override // ye1.s
    public void C(long j17) {
    }

    public final r45.n23 D() {
        r45.n23 n23Var = null;
        if (!this.f90913g) {
            com.tencent.mars.xlog.Log.e("WebViewTPPlayer", "getFinderVideoInfoForMp not init");
            return null;
        }
        rh3.q qVar = this.f90908b;
        if (qVar == null) {
            kotlin.jvm.internal.o.o("onePlayContext");
            throw null;
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.c cVar = (com.tencent.mm.plugin.appbrand.video.player.thumb.c) qVar.e();
        r45.n23 n23Var2 = this.f90912f;
        if (n23Var2 != null) {
            com.tencent.mm.protobuf.f parseFrom = new r45.n23().parseFrom(n23Var2.toByteArray());
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderVideoInfoForMp");
            n23Var = (r45.n23) parseFrom;
        }
        if (n23Var != null) {
            n23Var.set(11, java.lang.Long.valueOf(cVar.f90875e));
            n23Var.set(12, java.lang.Long.valueOf(cVar.f90874d));
            n23Var.set(14, java.lang.Integer.valueOf(cVar.f90878h));
            n23Var.set(5, cVar.f90877g);
            n23Var.set(21, java.lang.Boolean.valueOf(cVar.f90876f));
        }
        return n23Var;
    }

    public final java.lang.String E() {
        rh3.q qVar = this.f90908b;
        if (qVar != null) {
            return qVar.f("WebViewTPPlayer");
        }
        kotlin.jvm.internal.o.o("onePlayContext");
        throw null;
    }

    public final void F(r45.n23 videoInfoForMp) {
        kotlin.jvm.internal.o.g(videoInfoForMp, "videoInfoForMp");
        if (!this.f90913g) {
            com.tencent.mars.xlog.Log.e("WebViewTPPlayer", "resumeFinderVideoInfoForMp not init");
            return;
        }
        rh3.q qVar = this.f90908b;
        if (qVar == null) {
            kotlin.jvm.internal.o.o("onePlayContext");
            throw null;
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.c cVar = (com.tencent.mm.plugin.appbrand.video.player.thumb.c) qVar.e();
        if (!kotlin.jvm.internal.o.b(videoInfoForMp.getString(1), cVar.f90872b)) {
            com.tencent.mars.xlog.Log.i("WebViewTPPlayer", "resumeFinderVideoInfoForMp " + videoInfoForMp.getString(1) + " failed.");
            return;
        }
        com.tencent.mars.xlog.Log.i("WebViewTPPlayer", "resumeFinderVideoInfoForMp " + videoInfoForMp.getString(1) + " cacheSize:" + videoInfoForMp.getLong(11) + " totalSize:" + videoInfoForMp.getLong(12) + " dynamicRangeType:" + videoInfoForMp.getInteger(13) + " state:" + videoInfoForMp.getInteger(14) + " isMoovReady:" + videoInfoForMp.getBoolean(21) + ' ');
        cVar.f90874d = videoInfoForMp.getLong(12);
        cVar.f90875e = videoInfoForMp.getLong(11);
        cVar.f90878h = videoInfoForMp.getInteger(14);
        cVar.f90876f = videoInfoForMp.getBoolean(21);
    }

    public final void G(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mars.xlog.Log.i(E(), "setDataSource, path: " + str + ", videoType:" + i17);
        rh3.r rVar = this.f90907a;
        if (rVar == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        java.lang.Object m17 = rVar.m();
        com.tencent.thumbplayer.tplayer.TPPlayer tPPlayer = m17 instanceof com.tencent.thumbplayer.tplayer.TPPlayer ? (com.tencent.thumbplayer.tplayer.TPPlayer) m17 : null;
        if (tPPlayer != null) {
            tPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(102, 1000L).buildLong(504, 1L));
        }
        if (!r26.n0.D(str, "http", false, 2, null)) {
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            kotlin.jvm.internal.o.d(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
            return;
        }
        this.f90913g = true;
        char[] cArr2 = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
        java.lang.String str3 = com.tencent.mm.plugin.appbrand.video.player.thumb.b.f90867a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.plugin.appbrand.video.player.thumb.b.f90867a);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("finder_video__");
        sb7.append(com.tencent.mm.sdk.platformtools.t8.K0(b17) ? com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()) : b17);
        sb6.append(sb7.toString());
        java.lang.String sb8 = sb6.toString();
        wh3.c cVar = wh3.d.f445967d;
        kotlin.jvm.internal.o.d(b17);
        wh3.d dVar = new wh3.d(b17, str, cVar.a(b17, str, sb8));
        rh3.q qVar = this.f90908b;
        if (qVar == null) {
            kotlin.jvm.internal.o.o("onePlayContext");
            throw null;
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.c cVar2 = new com.tencent.mm.plugin.appbrand.video.player.thumb.c(qVar, b17, sb8);
        com.tencent.mars.xlog.Log.i(E(), "setDataSourceImp videoFileStateCache:" + cVar2);
        rh3.q qVar2 = this.f90908b;
        if (qVar2 == null) {
            kotlin.jvm.internal.o.o("onePlayContext");
            throw null;
        }
        qVar2.d(dVar, cVar2);
        java.lang.String E = E();
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("setDataSourceImp attach videoFileStateCache:");
        rh3.q qVar3 = this.f90908b;
        if (qVar3 == null) {
            kotlin.jvm.internal.o.o("onePlayContext");
            throw null;
        }
        sb9.append(qVar3.e());
        com.tencent.mars.xlog.Log.i(E, sb9.toString());
        rh3.r rVar2 = this.f90907a;
        if (rVar2 != null) {
            rVar2.n(dVar);
        } else {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
    }

    public final void H(r45.n23 videoInfo) {
        kotlin.jvm.internal.o.g(videoInfo, "videoInfo");
        this.f90912f = videoInfo;
        this.f90913g = true;
        dn.o oVar = new dn.o();
        oVar.f241785d = "task_FinderUtil";
        oVar.field_mediaId = videoInfo.getString(1);
        oVar.M1 = videoInfo.getString(2) + videoInfo.getString(6);
        oVar.A = 60;
        oVar.B = 60;
        oVar.H1 = 1;
        oVar.Z = 8;
        oVar.field_requestVideoFormat = videoInfo.getInteger(4);
        oVar.X1 = videoInfo.getString(5);
        oVar.field_fullpath = videoInfo.getString(3);
        oVar.f241809y0 = zy2.u.f477581a;
        oVar.f241806x0 = 4;
        oVar.Y1 = videoInfo.getString(7);
        oVar.f241798q = videoInfo.getBoolean(8);
        oVar.T1 = java.lang.String.valueOf(videoInfo.getInteger(9));
        java.lang.String string = videoInfo.getString(1);
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = videoInfo.getString(2);
        if (string2 == null) {
            string2 = "";
        }
        wh3.d dVar = new wh3.d(string, string2, oVar);
        rh3.q qVar = this.f90908b;
        if (qVar == null) {
            kotlin.jvm.internal.o.o("onePlayContext");
            throw null;
        }
        java.lang.String string3 = videoInfo.getString(1);
        if (string3 == null) {
            string3 = "";
        }
        java.lang.String string4 = videoInfo.getString(3);
        com.tencent.mm.plugin.appbrand.video.player.thumb.c cVar = new com.tencent.mm.plugin.appbrand.video.player.thumb.c(qVar, string3, string4 != null ? string4 : "");
        java.lang.String E = E();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setFinderVideoInfoForMp mediaId:");
        sb6.append(videoInfo.getString(1));
        sb6.append(" feedId:");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) videoInfo.getCustom(0);
        sb6.append(pm0.v.u(finderObject != null ? finderObject.getId() : 0L));
        sb6.append(" videoFileStateCache:");
        sb6.append(cVar);
        com.tencent.mars.xlog.Log.i(E, sb6.toString());
        rh3.q qVar2 = this.f90908b;
        if (qVar2 == null) {
            kotlin.jvm.internal.o.o("onePlayContext");
            throw null;
        }
        qVar2.d(dVar, cVar);
        java.lang.String E2 = E();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setFinderVideoInfoForMp attach videoFileStateCache:");
        rh3.q qVar3 = this.f90908b;
        if (qVar3 == null) {
            kotlin.jvm.internal.o.o("onePlayContext");
            throw null;
        }
        sb7.append(qVar3.e());
        com.tencent.mars.xlog.Log.i(E2, sb7.toString());
        F(videoInfo);
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            rVar.n(dVar);
        } else {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
    }

    @Override // ye1.e
    public void b(boolean z17) {
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            rVar.b(z17);
        } else {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
    }

    @Override // ye1.e
    public void c(float f17, float f18) {
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            rVar.c(f17, f18);
        } else {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
    }

    @Override // ye1.e
    public void d(ye1.f fVar) {
        this.f90919m = fVar;
    }

    @Override // ye1.e
    public boolean f(float f17) {
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            rVar.setPlaySpeedRatio(f17);
            return true;
        }
        kotlin.jvm.internal.o.o("player");
        throw null;
    }

    @Override // ye1.e
    public void g(ye1.q qVar) {
        this.f90920n = qVar;
    }

    @Override // ye1.e
    public int getCurrentPosition() {
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            return (int) rVar.getCurrentPositionMs();
        }
        kotlin.jvm.internal.o.o("player");
        throw null;
    }

    @Override // ye1.e
    public int getDuration() {
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            return (int) rVar.getDurationMs();
        }
        kotlin.jvm.internal.o.o("player");
        throw null;
    }

    @Override // ye1.e
    public int getPlayerType() {
        return 5;
    }

    @Override // ye1.e
    public int getState() {
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            return rVar.getState();
        }
        kotlin.jvm.internal.o.o("player");
        throw null;
    }

    @Override // ye1.e
    public int getVideoHeight() {
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            return rVar.getVideoHeight();
        }
        kotlin.jvm.internal.o.o("player");
        throw null;
    }

    @Override // ye1.e
    public int getVideoWidth() {
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            return rVar.getVideoWidth();
        }
        kotlin.jvm.internal.o.o("player");
        throw null;
    }

    @Override // ye1.e
    public void h(ye1.n nVar) {
        this.f90918l = nVar;
    }

    @Override // ye1.e
    public void i(ye1.o oVar) {
        com.tencent.mars.xlog.Log.w(E(), "setOnSubtitleDataListener listener:" + oVar);
    }

    @Override // ye1.e
    public boolean isPlaying() {
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            return rVar.isPlaying();
        }
        kotlin.jvm.internal.o.o("player");
        throw null;
    }

    @Override // ye1.e
    public void j(boolean z17) {
        com.tencent.mars.xlog.Log.w("WebViewTPPlayer", "showSubtitle not support");
    }

    @Override // ye1.e
    public void k(ye1.k kVar) {
        com.tencent.mars.xlog.Log.w(E(), "setOnHitPreloadListener listener:" + kVar);
    }

    @Override // ye1.e
    public ye1.e l(java.lang.Class playerClass) {
        kotlin.jvm.internal.o.g(playerClass, "playerClass");
        com.tencent.mm.plugin.appbrand.video.player.thumb.v vVar = com.tencent.mm.plugin.appbrand.video.player.thumb.l.class.isAssignableFrom(playerClass) ? this : null;
        com.tencent.mars.xlog.Log.i(E(), "castTo, playerClass: " + playerClass + ", playerImpl: " + vVar);
        return vVar;
    }

    @Override // ye1.e
    public void m(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            str = "";
        }
        G(str, str2, 0);
    }

    @Override // ye1.e
    public void n(double d17) {
        com.tencent.mars.xlog.Log.i(E(), "setPreferredPeakBitRate :" + d17);
    }

    @Override // ye1.s
    public void o(org.json.JSONObject jSONObject) {
    }

    @Override // ye1.e
    public void p(ye1.l lVar) {
        this.f90914h = lVar;
    }

    @Override // ye1.e
    public void pause() {
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            rVar.pause();
        } else {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
    }

    @Override // ye1.e
    public void prepareAsync() {
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            rVar.prepareAsync();
        } else {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
    }

    @Override // ye1.e
    public void q(ye1.i iVar) {
        this.f90921o = iVar;
    }

    @Override // ye1.e
    public void r(ye1.j jVar) {
        this.f90915i = jVar;
    }

    @Override // ye1.e
    public void release() {
        this.f90913g = false;
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            rVar.release();
        } else {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
    }

    @Override // ye1.e
    public void reset() {
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            rVar.reset();
        } else {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
    }

    @Override // ye1.e
    public void seekTo(long j17) {
        rh3.r rVar = this.f90907a;
        if (rVar == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        rVar.seekTo(j17);
        this.f90909c = true;
    }

    @Override // ye1.s
    public void setAppId(java.lang.String str) {
    }

    @Override // ye1.e
    public void setDataSource(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        G(str, "", 0);
    }

    @Override // ye1.e
    public void setMute(boolean z17) {
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            rVar.setOutputMute(z17);
        } else {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
    }

    @Override // ye1.e
    public void setSurface(android.view.Surface surface) {
        java.lang.String E = E();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSurface ");
        sb6.append(surface);
        sb6.append(' ');
        sb6.append(surface != null ? java.lang.Boolean.valueOf(surface.isValid()) : null);
        com.tencent.mars.xlog.Log.i(E, sb6.toString());
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            rVar.setSurface(surface);
        } else {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
    }

    @Override // ye1.e
    public void start() {
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            rVar.start();
        } else {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
    }

    @Override // ye1.e
    public void stop() {
        r45.n23 D = D();
        if (D != null) {
            com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper();
            webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper.f186983d = D;
            java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
            kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
            com.tencent.mm.ipcinvoker.f.a(PROCESS_MAIN, webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper, com.tencent.mm.plugin.appbrand.video.player.thumb.t.f90905d, com.tencent.mm.plugin.appbrand.video.player.thumb.u.f90906d);
        }
        rh3.r rVar = this.f90907a;
        if (rVar != null) {
            rVar.stop();
        } else {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
    }

    @Override // ye1.e
    public void t(java.lang.String sourceUrl, java.lang.String str, java.lang.String str2, boolean z17) {
        kotlin.jvm.internal.o.g(sourceUrl, "sourceUrl");
        com.tencent.mars.xlog.Log.w("WebViewTPPlayer", "setDrmDataSource not support");
    }

    @Override // ye1.s
    public void v(long j17) {
    }

    @Override // ye1.e
    public void w(java.lang.String str) {
        com.tencent.mars.xlog.Log.w("WebViewTPPlayer", "setSubtitleDataSource not support");
    }

    @Override // ye1.e
    public void x(java.lang.String str, java.lang.String str2, int i17) {
        if (str == null) {
            str = "";
        }
        G(str, str2, i17);
    }

    @Override // ye1.e
    public void z(ye1.g gVar) {
        this.f90917k = gVar;
    }
}
