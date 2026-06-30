package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001d\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B%\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/flexible/FlexibleScaleSurfaceView;", "Landroid/view/SurfaceView;", "Ldd4/u0;", "Landroid/view/SurfaceHolder$Callback;", "Ldb5/e7;", "Lcom/tencent/mm/pluginsdk/ui/e1;", "type", "Ljz5/f0;", "setScaleType", "Lr45/jj4;", "media", "setupPlayerPositionAndSize", "Lik4/r;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "setFlexibleSurfaceListener", "", "isIntercepted", "setInterceptDetach", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView */
/* loaded from: classes15.dex */
public final class SurfaceHolderCallbackC18281xdc514f53 extends android.view.SurfaceView implements dd4.u0, android.view.SurfaceHolder.Callback, db5.e7 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o8 f250742d;

    /* renamed from: e, reason: collision with root package name */
    public int f250743e;

    /* renamed from: f, reason: collision with root package name */
    public int f250744f;

    /* renamed from: g, reason: collision with root package name */
    public ik4.r f250745g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.Surface f250746h;

    public SurfaceHolderCallbackC18281xdc514f53(android.content.Context context) {
        super(context);
        getHolder().addCallback(this);
        this.f250742d = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o8();
    }

    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        if (i17 == 0 || i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
            return;
        }
        this.f250744f = i17;
        this.f250743e = i18;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
            return;
        }
        layoutParams.addRule(13);
        requestLayout();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        if (this.f250744f == 0 || this.f250743e == 0) {
            setMeasuredDimension(1, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
            return;
        }
        int defaultSize = android.view.View.getDefaultSize(1, i17);
        int defaultSize2 = android.view.View.getDefaultSize(1, i18);
        int i19 = this.f250744f;
        int i27 = this.f250743e;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o8 o8Var = this.f250742d;
        o8Var.a(defaultSize, defaultSize2, i19, i27);
        setMeasuredDimension(o8Var.f273351g, o8Var.f273352h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
    }

    @Override // dd4.u0
    /* renamed from: setFlexibleSurfaceListener */
    public void mo71042xbd4b1a74(ik4.r listener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFlexibleSurfaceListener", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f250745g = listener;
        android.view.Surface surface = this.f250746h;
        boolean z17 = false;
        if (surface != null && surface.isValid()) {
            z17 = true;
        }
        if (z17) {
            android.view.Surface surface2 = this.f250746h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surface2);
            listener.b(surface2, getWidth(), getHeight(), 2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFlexibleSurfaceListener", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
    }

    @Override // db5.e7
    /* renamed from: setInterceptDetach */
    public void mo70831x49dc7633(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInterceptDetach", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInterceptDetach", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
    }

    @Override // dd4.u0
    /* renamed from: setScaleType */
    public void mo71043xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 type) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScaleType", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f250742d.d(type);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScaleType", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
    }

    @Override // dd4.u0
    /* renamed from: setupPlayerPositionAndSize */
    public void mo71044xca946d71(r45.jj4 media) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        r45.lj4 lj4Var = media.f459398p;
        if (lj4Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        } else {
            a((int) lj4Var.f461053d, (int) lj4Var.f461054e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("surfaceChanged", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("surfaceChanged", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("surfaceCreated", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        this.f250746h = holder.getSurface();
        ik4.r rVar = this.f250745g;
        if (rVar != null) {
            android.view.Surface surface = holder.getSurface();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(surface, "getSurface(...)");
            rVar.b(surface, getWidth(), getHeight(), 2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("surfaceCreated", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("surfaceDestroyed", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ik4.r rVar = this.f250745g;
        if (rVar != null) {
            android.view.Surface surface = holder.getSurface();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(surface, "getSurface(...)");
            rVar.a(surface);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("surfaceDestroyed", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
    }

    public SurfaceHolderCallbackC18281xdc514f53(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        getHolder().addCallback(this);
        this.f250742d = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o8();
    }

    public SurfaceHolderCallbackC18281xdc514f53(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        getHolder().addCallback(this);
        this.f250742d = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o8();
    }
}
