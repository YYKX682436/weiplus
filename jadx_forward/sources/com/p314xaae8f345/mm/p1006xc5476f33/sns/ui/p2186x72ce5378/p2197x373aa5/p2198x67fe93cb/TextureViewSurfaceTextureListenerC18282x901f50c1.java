package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001d\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/flexible/FlexibleScaleTextureView;", "Lcom/tencent/mm/plugin/thumbplayer/view/MMTextureView;", "Ldd4/u0;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lcom/tencent/mm/pluginsdk/ui/e1;", "type", "Ljz5/f0;", "setScaleType", "Lr45/jj4;", "media", "setupPlayerPositionAndSize", "Lik4/r;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "setFlexibleSurfaceListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView */
/* loaded from: classes15.dex */
public final class TextureViewSurfaceTextureListenerC18282x901f50c1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18692xd171d8a0 implements dd4.u0, android.view.TextureView.SurfaceTextureListener {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o8 f250747h;

    /* renamed from: i, reason: collision with root package name */
    public int f250748i;

    /* renamed from: m, reason: collision with root package name */
    public int f250749m;

    /* renamed from: n, reason: collision with root package name */
    public ik4.r f250750n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.Surface f250751o;

    public TextureViewSurfaceTextureListenerC18282x901f50c1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f250747h = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o8();
        setSurfaceTextureListener(this);
    }

    public void k(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        if (i17 == 0 || i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
            return;
        }
        if (this.f250749m == i17 && this.f250748i == i18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
            return;
        }
        this.f250749m = i17;
        this.f250748i = i18;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
            return;
        }
        layoutParams.addRule(13);
        requestLayout();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        if (this.f250749m == 0 || this.f250748i == 0) {
            setMeasuredDimension(1, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
            return;
        }
        int defaultSize = android.view.View.getDefaultSize(1, i17);
        int defaultSize2 = android.view.View.getDefaultSize(1, i18);
        int i19 = this.f250749m;
        int i27 = this.f250748i;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o8 o8Var = this.f250747h;
        o8Var.a(defaultSize, defaultSize2, i19, i27);
        setMeasuredDimension(o8Var.f273351g, o8Var.f273352h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture texture, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(texture, "texture");
        android.view.Surface surface = new android.view.Surface(texture);
        this.f250751o = surface;
        ik4.r rVar = this.f250750n;
        if (rVar != null) {
            rVar.b(surface, i17, i18, 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture texture) {
        ik4.r rVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(texture, "texture");
        android.view.Surface surface = this.f250751o;
        if (surface != null && (rVar = this.f250750n) != null) {
            rVar.a(surface);
        }
        this.f250751o = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
    }

    @Override // dd4.u0
    /* renamed from: setFlexibleSurfaceListener */
    public void mo71042xbd4b1a74(ik4.r listener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFlexibleSurfaceListener", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f250750n = listener;
        android.view.Surface surface = this.f250751o;
        boolean z17 = false;
        if (surface != null && surface.isValid()) {
            z17 = true;
        }
        if (z17) {
            android.view.Surface surface2 = this.f250751o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surface2);
            listener.b(surface2, getWidth(), getHeight(), 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFlexibleSurfaceListener", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
    }

    @Override // dd4.u0
    /* renamed from: setScaleType */
    public void mo71043xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 type) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScaleType", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f250747h.d(type);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScaleType", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
    }

    @Override // dd4.u0
    /* renamed from: setupPlayerPositionAndSize */
    public void mo71044xca946d71(r45.jj4 media) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        r45.lj4 lj4Var = media.f459398p;
        if (lj4Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        } else {
            k((int) lj4Var.f461053d, (int) lj4Var.f461054e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        }
    }

    public TextureViewSurfaceTextureListenerC18282x901f50c1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f250747h = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o8();
        setSurfaceTextureListener(this);
    }

    public TextureViewSurfaceTextureListenerC18282x901f50c1(android.content.Context context) {
        super(context);
        this.f250747h = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o8();
        setSurfaceTextureListener(this);
    }
}
