package g54;

/* loaded from: classes15.dex */
public final class p implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public long f350476d = -1;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f350477e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.SurfaceTexture f350478f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f350479g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c f350480h;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c c17737xd9711c0c) {
        this.f350480h = c17737xd9711c0c;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        android.graphics.SurfaceTexture surfaceTexture2;
        android.graphics.SurfaceTexture surfaceTexture3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c c17737xd9711c0c = this.f350480h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c.n(c17737xd9711c0c), "onSurfaceTextureAvailable： " + surfaceTexture + '(' + i17 + " x " + i18 + ')');
        if (this.f350477e != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c.n(c17737xd9711c0c), "surface is already valid");
            if (android.os.Build.VERSION.SDK_INT >= 26 && (surfaceTexture3 = this.f350478f) != null) {
                surfaceTexture3.isReleased();
            }
            if (c17737xd9711c0c.m69415xb5cf06c5() && (surfaceTexture2 = this.f350478f) != null) {
                c17737xd9711c0c.setSurfaceTexture(surfaceTexture2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
            return;
        }
        if (c17737xd9711c0c.m69415xb5cf06c5()) {
            this.f350478f = surfaceTexture;
        } else {
            android.view.Surface surface = this.f350477e;
            if (surface != null) {
                surface.release();
            }
        }
        this.f350477e = new android.view.Surface(surfaceTexture);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPlayer$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        kk4.c cVar = c17737xd9711c0c.f244552i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPlayer$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        if (cVar != null) {
            ((kk4.f0) cVar).mo100971x42c875eb(this.f350477e, 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setFirstFrameNotified$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        c17737xd9711c0c.f244559s = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setFirstFrameNotified$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setVideoCenter", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        c17737xd9711c0c.s();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setVideoCenter", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSeekTarget$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        java.lang.Double d17 = c17737xd9711c0c.f244555o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSeekTarget$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        if (d17 != null) {
            c17737xd9711c0c.a(d17.doubleValue(), com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c.m(c17737xd9711c0c));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c c17737xd9711c0c = this.f350480h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c.n(c17737xd9711c0c), "onSurfaceTextureDestroyed");
        if (!c17737xd9711c0c.m69415xb5cf06c5()) {
            android.view.Surface surface = this.f350477e;
            if (surface != null) {
                surface.release();
            }
            this.f350477e = null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setFirstFrameNotified$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
            c17737xd9711c0c.f244559s = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setFirstFrameNotified$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        }
        if (c17737xd9711c0c.m69415xb5cf06c5() && this.f350479g) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c.n(this.f350480h), "onSurfaceTextureSizeChanged: " + i17 + " x " + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        this.f350476d = surface.getTimestamp();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c c17737xd9711c0c = this.f350480h;
        g54.e k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c.k(c17737xd9711c0c);
        k17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNextFrameUpdated", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$Callbacks");
        yz5.a aVar = k17.f350462c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNextFrameUpdated", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$Callbacks");
        if (aVar != null) {
            aVar.mo152xb9724478();
            g54.e k18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c.k(c17737xd9711c0c);
            k18.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNextFrameUpdated", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$Callbacks");
            k18.f350462c = null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNextFrameUpdated", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$Callbacks");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
    }
}
