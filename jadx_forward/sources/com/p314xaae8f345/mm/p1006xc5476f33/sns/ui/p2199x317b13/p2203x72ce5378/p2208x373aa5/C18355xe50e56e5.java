package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2208x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/view/ImproveRoundLinearLayout;", "Landroid/widget/LinearLayout;", "", "percent", "Ljz5/f0;", "setRadius", "Lpd4/c;", "d", "Lpd4/c;", "getCornerRadius", "()Lpd4/c;", "setCornerRadius", "(Lpd4/c;)V", "cornerRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout */
/* loaded from: classes4.dex */
public final class C18355xe50e56e5 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public pd4.c cornerRadius;

    /* renamed from: e, reason: collision with root package name */
    public float f250884e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f250885f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18355xe50e56e5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f250884e = 0.5f;
        this.f250885f = new android.graphics.Path();
        a(context, attributeSet, 0);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.H, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        this.cornerRadius = new pd4.c(dimension, dimension, dimension, dimension);
        setWillNotDraw(false);
        obtainStyledAttributes.recycle();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispatchDraw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2208x373aa5.C18355xe50e56e5.dispatchDraw(android.graphics.Canvas):void");
    }

    /* renamed from: getCornerRadius */
    public final pd4.c m71134x83bb89bd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCornerRadius", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout");
        pd4.c cVar = this.cornerRadius;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCornerRadius", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout");
        return cVar;
    }

    /* renamed from: setCornerRadius */
    public final void m71135xba0484c9(pd4.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCornerRadius", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout");
        this.cornerRadius = cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCornerRadius", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout");
    }

    /* renamed from: setRadius */
    public final void m71136x205ac394(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRadius", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout");
        if (f17 >= 0.0f && f17 <= 0.5f) {
            this.f250884e = f17;
            invalidate();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRadius", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18355xe50e56e5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f250884e = 0.5f;
        this.f250885f = new android.graphics.Path();
        a(context, attributeSet, i17);
    }
}
