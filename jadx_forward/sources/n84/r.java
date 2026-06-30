package n84;

/* loaded from: classes4.dex */
public class r implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 f417221d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 c17785x8a47a261) {
        this.f417221d = c17785x8a47a261;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
        n84.w.e("AdAlphaPlayerView", "onSurfaceTextureAvailable " + surfaceTexture);
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261.f245010u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 c17785x8a47a261 = this.f417221d;
        android.view.TextureView textureView = c17785x8a47a261.f245013f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        if (textureView.getSurfaceTexture() != surfaceTexture) {
            n84.w.e("AdAlphaPlayerView", "onSurfaceTextureAvailable change surface " + surfaceTexture);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            android.view.TextureView textureView2 = c17785x8a47a261.f245013f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            textureView2.setSurfaceTexture(surfaceTexture);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        android.view.TextureView textureView3 = c17785x8a47a261.f245013f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startRenderPlay", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.w.a("AdAlphaPlayerView", "startPlay: width-" + i17 + " height-" + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupRenderer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        if (c17785x8a47a261.f245013f == null || i17 == 0 || i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("w", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AlphaPlayer_AdAlphaPlayerView", java.lang.String.valueOf("setupRenderer failed: surface-" + textureView3 + ", width-" + i17 + ", height-" + i18));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("w", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupRenderer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        } else {
            n84.v vVar = new n84.v(c17785x8a47a261.getContext(), textureView3.getSurfaceTexture(), i17, i18, c17785x8a47a261.f245017m);
            c17785x8a47a261.f245011d = vVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRendererStatusChangeListener", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            vVar.f417203q = c17785x8a47a261;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRendererStatusChangeListener", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupRenderer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startRenderPlay", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
        n84.w.e("AdAlphaPlayerView", "onSurfaceTextureDestroyed");
        ((ku5.t0) ku5.t0.f394148d).B(new n84.q(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 c17785x8a47a261 = this.f417221d;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261.f245010u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.v vVar = c17785x8a47a261.f245011d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        if (vVar != null) {
            vVar.d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
        n84.w.a("AdAlphaPlayerView", "onSurfaceTextureSizeChanged width:" + i17 + " height:" + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
    }
}
