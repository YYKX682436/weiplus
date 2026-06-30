package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2183x2fd755;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoCompositionView;", "Lcom/tencent/mm/videocomposition/play/VideoCompositionPlayView;", "Ldb5/e7;", "", "isIntercepted", "Ljz5/f0;", "setInterceptDetach", "r", "Z", "isInterceptedDetach", "()Z", "setInterceptedDetach", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView */
/* loaded from: classes10.dex */
public final class C18191x92bc81e1 extends com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 implements db5.e7 {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean isInterceptedDetach;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Object f249855s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Object f249856t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18191x92bc81e1(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }

    @Override // android.view.View
    public void destroyDrawingCache() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        super.destroyDrawingCache();
        if (this.isInterceptedDetach) {
            z();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        if (this.isInterceptedDetach) {
            v();
        }
        super.onAttachedToWindow();
        if (this.isInterceptedDetach) {
            z();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        if (this.isInterceptedDetach) {
            v();
        } else {
            try {
                super.onDetachedFromWindow();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsFakeVideoCompositionView", e17, "unkown error", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    @Override // db5.e7
    /* renamed from: setInterceptDetach */
    public void mo70831x49dc7633(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInterceptDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        this.isInterceptedDetach = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInterceptDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    /* renamed from: setInterceptedDetach */
    public final void m70832x220faf92(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInterceptedDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        this.isInterceptedDetach = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInterceptedDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    public final void v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hookInnerDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVideoCompositionView", "hookInnerDetach");
            java.lang.reflect.Field declaredField = android.view.TextureView.class.getDeclaredField("mLayer");
            declaredField.setAccessible(true);
            this.f249855s = declaredField.get(this);
            declaredField.set(this, null);
            java.lang.reflect.Field declaredField2 = android.view.TextureView.class.getDeclaredField("mSurface");
            declaredField2.setAccessible(true);
            this.f249856t = declaredField2.get(this);
            declaredField2.set(this, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsFakeVideoCompositionView", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hookInnerDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    public final void z() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unHookInnerDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVideoCompositionView", "unHookInnerDetach");
            if (this.f249855s != null) {
                java.lang.reflect.Field declaredField = android.view.TextureView.class.getDeclaredField("mLayer");
                declaredField.setAccessible(true);
                declaredField.set(this, this.f249855s);
                this.f249855s = null;
            }
            if (this.f249856t != null) {
                java.lang.reflect.Field declaredField2 = android.view.TextureView.class.getDeclaredField("mSurface");
                declaredField2.setAccessible(true);
                declaredField2.set(this, this.f249856t);
                this.f249856t = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsFakeVideoCompositionView", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unHookInnerDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18191x92bc81e1(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }
}
