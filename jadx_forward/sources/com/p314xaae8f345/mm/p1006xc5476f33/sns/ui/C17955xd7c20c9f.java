package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/CornerMaskImageView;", "Lcom/tencent/mm/plugin/sns/ui/MaskImageView;", "", "radius", "Ljz5/f0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/plugin/sns/ui/z1", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.CornerMaskImageView */
/* loaded from: classes3.dex */
public final class C17955xd7c20c9f extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 {
    public int W;

    /* renamed from: p0, reason: collision with root package name */
    public final al5.p2 f247806p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17955xd7c20c9f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f247806p0 = new al5.p2(this);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n34.w2.f416298b);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.W = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
        setClipToOutline(true);
        setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z1(this.W));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4, com.p314xaae8f345.mm.p872xbfc2bd01.ui.C10912x86c557b2, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView");
        super.onAttachedToWindow();
        this.f247806p0.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4, com.p314xaae8f345.mm.p872xbfc2bd01.ui.C10912x86c557b2, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView");
        super.onDetachedFromWindow();
        this.f247806p0.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView");
    }

    @Override // android.view.View
    public boolean post(java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("post", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView");
        this.f247806p0.getClass();
        boolean post = super.post(runnable);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("post", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView");
        return post;
    }

    /* renamed from: setRadius */
    public final void m70569x205ac394(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRadius", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView");
        this.W = i17;
        setClipToOutline(true);
        setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z1(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRadius", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView");
    }
}
