package f12;

/* loaded from: classes4.dex */
public final class o0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.b1, com.p314xaae8f345.mm.p2470x93e71c27.ui.a1, t21.i0, dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.C13253x62ed4208 f340189d;

    /* renamed from: e, reason: collision with root package name */
    public final f12.c0 f340190e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f340191f;

    /* renamed from: g, reason: collision with root package name */
    public t21.h0 f340192g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f340193h;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f340194i;

    /* renamed from: m, reason: collision with root package name */
    public long f340195m;

    /* renamed from: n, reason: collision with root package name */
    public long f340196n;

    /* renamed from: o, reason: collision with root package name */
    public int f340197o;

    /* renamed from: p, reason: collision with root package name */
    public long f340198p;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.C13253x62ed4208 videoView, f12.c0 viewBinding, java.lang.String url, yz5.a onPreparedCb) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoView, "videoView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewBinding, "viewBinding");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onPreparedCb, "onPreparedCb");
        this.f340189d = videoView;
        this.f340190e = viewBinding;
        this.f340191f = onPreparedCb;
        this.f340194i = new android.os.Handler(android.os.Looper.getMainLooper());
        videoView.mo48236x764cf626(true);
        videoView.mo61532x526554de(this);
        videoView.mo48221xf83edb22(this);
        videoView.m48235xbc2f47ad(this);
        videoView.h(false, url, 0);
        videoView.mo48234x4ac7da23(d30.a.f307656f + "MMVideo_" + url.hashCode() + ".mp4.temp");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "onVideoEnded!!! mediaId[%s].", str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "onGetVideoSize!!! mediaId[%s].", str2);
        f12.c0 c0Var = this.f340190e;
        android.content.res.Resources resources = c0Var.f340120p.getResources();
        android.view.ViewGroup.LayoutParams layoutParams = c0Var.f340120p.getLayoutParams();
        if (i17 < i18) {
            layoutParams.width = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561689px);
            layoutParams.height = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561687pv);
        }
        c0Var.f340120p.requestLayout();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "onError!!! mediaId[%s] errorMsg[%s].", str2, str3);
        f12.c0 c0Var = this.f340190e;
        c0Var.f340121q.setVisibility(0);
        this.f340189d.setVisibility(8);
        c0Var.f340126v.setVisibility(8);
        long j17 = this.f340196n;
        long j18 = this.f340195m;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f340196n = j17 + (java.lang.System.currentTimeMillis() - j18);
        this.f340195m = 0L;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        bool.booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "onVideoWaiting!!! mediaId[%s].", str2);
    }

    @Override // t21.i0
    public void a(java.lang.String str, int i17, int i18) {
        java.lang.String str2 = this.f340193h;
        if (str2 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoController", "requestVideoData offset=" + i17 + ", length=" + i18);
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        t21.o2.Di().p(str, i17, i18, 0);
    }

    @Override // t21.i0
    public void b(java.lang.String mediaId, java.lang.String path, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f340193h = mediaId;
        if (com.p314xaae8f345.mm.vfs.w6.j(d30.a.f307656f + "MMVideo_" + url.hashCode() + ".mp4")) {
            g(mediaId, 0, null);
            return;
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        com.p314xaae8f345.mm.p947xba6de98f.l3 Di = t21.o2.Di();
        dn.o oVar = new dn.o();
        oVar.f69601xaca5bdda = mediaId;
        oVar.M1 = url;
        oVar.H1 = 1;
        oVar.Z = 5;
        oVar.f323342y0 = 3;
        oVar.f69595x6d25b0d9 = path;
        oVar.f323348c2 = this;
        Di.e(oVar, false);
    }

    @Override // t21.i0
    public void c(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoController", "stop ".concat(mediaId));
        java.lang.String str = this.f340193h;
        if (str == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, mediaId)) {
            return;
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        t21.o2.Di().g(mediaId, null);
    }

    @Override // t21.i0
    public void d(t21.h0 h0Var) {
        this.f340192g = h0Var;
    }

    @Override // t21.i0
    public boolean e(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "isVideoDataAvailable!!! mediaId[%s] offset[%s] length[%s].", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.lang.String str2 = this.f340193h;
        if (str2 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
            return false;
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        return t21.o2.Di().o(str, i17, i18);
    }

    @Override // dn.n
    public void f(java.lang.String mediaId, long j17, long j18) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "onProgress!!! mediaId[%s] offset[%s] length[%s].", mediaId, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        if (this.f340192g == null || (str = this.f340193h) == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, mediaId)) {
            return;
        }
        this.f340194i.post(new f12.n0(this, mediaId, j17, j18));
    }

    @Override // dn.n
    public void g(java.lang.String mediaId, int i17, dn.h hVar) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "onFinish!!! mediaId[%s].", mediaId);
        if (this.f340192g == null || (str = this.f340193h) == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, mediaId)) {
            return;
        }
        this.f340194i.post(new f12.l0(this, mediaId, i17));
    }

    public final void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "start");
        com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.C13253x62ed4208 c13253x62ed4208 = this.f340189d;
        c13253x62ed4208.mo48238x68ac462();
        java.lang.Object systemService = c13253x62ed4208.getContext().getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "init: rangerMode=" + ((android.media.AudioManager) systemService).getRingerMode());
        c13253x62ed4208.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "onVideoPause!!! mediaId[%s].", str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "onVideoPlay!!! mediaId[%s], duration[%s].", str2, java.lang.Integer.valueOf(this.f340189d.mo61527x6d590e18()));
        this.f340197o++;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "onVideoWaitingEnd!!! mediaId[%s].", str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "onPrepared!!! mediaId[%s].", str2);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f340195m = java.lang.System.currentTimeMillis();
        this.f340198p = this.f340189d.mo61527x6d590e18() * 1000;
        this.f340190e.f340121q.setVisibility(8);
        this.f340191f.mo152xb9724478();
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String mediaId, long j17, long j18) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "onDataAvailable!!! mediaId[%s] offset[%s] length[%s].", mediaId, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        if (this.f340192g == null || (str = this.f340193h) == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, mediaId)) {
            return;
        }
        this.f340194i.post(new f12.k0(this, mediaId, j17, j18));
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String str, java.lang.String str2) {
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "onMoovReady!!! mediaId[%s] offset[%s] length[%s].", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        if (this.f340192g == null || (str2 = this.f340193h) == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
            return;
        }
        this.f340194i.post(new f12.m0(this, str, j17, j18, videoInfo));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    /* renamed from: onSeekComplete */
    public void mo55683xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "onVideoFirstFrameDraw!!! mediaId[%s].", str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.a1
    public void r(java.lang.String str, boolean z17) {
        if (str != null) {
            java.lang.String t17 = r26.i0.t(str, ".temp", "", false);
            if (com.p314xaae8f345.mm.vfs.w6.j(t17) || !r26.i0.n(str, ".temp", false)) {
                return;
            }
            com.p314xaae8f345.mm.vfs.w6.c(str, t17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
