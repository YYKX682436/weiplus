package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView */
/* loaded from: classes4.dex */
public class C18406x5acd4424 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d {
    public boolean A;
    public boolean B;
    public boolean C;

    /* renamed from: y, reason: collision with root package name */
    public m3.a f252362y;

    /* renamed from: z, reason: collision with root package name */
    public m3.a f252363z;

    public C18406x5acd4424(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdTimelineVideoView", "clearTimer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    /* renamed from: getThumbDrawable */
    public android.graphics.drawable.Drawable m71244x957e1cde() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getThumbDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        android.widget.ImageView imageView = this.f247945g;
        if (imageView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getThumbDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
            return null;
        }
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getThumbDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        return drawable;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d
    public void k(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("seek", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.k(i17, z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdTimelineVideoView", "seekTo:" + i17 + ", afterSeekPlay=" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("seek", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d
    public void l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showLoading", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLoading", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d
    public void m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        boolean g17 = g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdTimelineVideoView", "start, hasPrepared=" + this.B + ", shouldPlayWhenPrepared=" + this.f247951p + ", isPlaying=" + g17);
        if (!this.B && this.f247951p) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
            return;
        }
        if (!g17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdTimelineVideoView", "do start");
            super.m();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d
    public void n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.n();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdTimelineVideoView", "startTimer:" + m70611xeb48f774());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d
    public void o(boolean z17, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("switchVideoModel", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.o(z17, f17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchVideoModel: thumVis=");
        sb6.append(this.f247945g.getVisibility() == 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdTimelineVideoView", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("switchVideoModel", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdTimelineVideoView", "onDetachedFromWindow");
        u();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onError", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.mo9756xaf8aa769(i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.t.f69748x366c91de, 7);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        m3.a aVar = this.f252362y;
        if (aVar != null) {
            aVar.mo3938xab27b508(null);
            this.f252362y = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdTimelineVideoView", "onPrepared, path=%s , shouldPlayWhenPrepared=%s", m70612x4edea88a(), java.lang.Boolean.valueOf(this.f247951p));
        if (this.f247951p) {
            super.mo9757x58d5b73c();
        }
        this.B = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    /* renamed from: setForbidAutoPlay */
    public void m71245x2d90239(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setForbidAutoPlay", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        this.C = z17;
        if (z17) {
            this.f247951p = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setForbidAutoPlay", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    /* renamed from: setOnPrepared */
    public void m71246x753abd3e(m3.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        this.f252362y = aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    /* renamed from: setOnReplay */
    public void m71247xcdd3bd28(m3.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnReplay", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        this.f252363z = aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnReplay", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    /* renamed from: setShouldPlayWhenPrepared */
    public void m71248xa59621c0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShouldPlayWhenPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdTimelineVideoView", "setShouldPlayWhenPrepared:" + z17 + ", isForbidAutoPlay=" + this.C);
        if (this.C) {
            this.f247951p = false;
        } else {
            this.f247951p = z17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShouldPlayWhenPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    /* renamed from: setThumbBmp */
    public void m71249xd3f79a51(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setThumbBmp", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdTimelineVideoView", "setThumbBmp=" + bitmap);
        android.widget.ImageView imageView = this.f247945g;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setThumbBmp", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    /* renamed from: setThumbDrawable */
    public void m71250x28548352(android.graphics.drawable.Drawable drawable) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setThumbDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdTimelineVideoView", "setThumbDrawable=" + drawable);
        android.widget.ImageView imageView = this.f247945g;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setThumbDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    /* renamed from: setThumpViewScaleType */
    public void m71251x4885fafd(android.widget.ImageView.ScaleType scaleType) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setThumpViewScaleType", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        android.widget.ImageView imageView = this.f247945g;
        if (imageView != null) {
            imageView.setScaleType(scaleType);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setThumpViewScaleType", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    /* renamed from: setVideoPath */
    public void m71252xab3268fe(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoPath", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        java.lang.String m70612x4edea88a = m70612x4edea88a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdTimelineVideoView", "setVideoPath, hasPrepared=" + this.A + ", path=" + str + ", oldPath=" + m70612x4edea88a);
        if (!this.A || (str != null && !str.equals(m70612x4edea88a))) {
            j(str);
            this.A = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoPath", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d
    public void t(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateVideoUI", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.t(i17);
        this.f247945g.getVisibility();
        int i18 = i17 / 1000;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateVideoUI", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdTimelineVideoView", "clear");
        i();
        this.A = false;
        this.f247951p = false;
        this.B = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdTimelineVideoView", "path after clear=" + m70612x4edea88a());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("restart", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdTimelineVideoView", "restart, hasPrepared=" + this.A);
        if (this.A) {
            super.k(0, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("restart", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void w(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showVideoThumb", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdTimelineVideoView", "showVideoThumb:" + z17);
        o(!z17, z17 ? 0.0f : 1.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showVideoThumb", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public C18406x5acd4424(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f247951p = false;
    }
}
