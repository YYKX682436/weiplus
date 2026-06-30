package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB%\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletMaxHeightLinearLayout;", "Landroid/widget/LinearLayout;", "", "maxHeightDp", "Ljz5/f0;", "setMaxHeightDp", "maxHeightPx", "setMaxHeightPx", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletMaxHeightLinearLayout */
/* loaded from: classes4.dex */
public final class C19147x541bc361 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f262248d;

    /* renamed from: e, reason: collision with root package name */
    public int f262249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19147x541bc361(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f262249e = -1;
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.j.f270119i, 0, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int integer = obtainStyledAttributes.getInteger(0, -1);
            this.f262248d = integer;
            this.f262249e = integer != -1 ? i65.a.b(getContext(), this.f262248d) : -1;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(this.f262249e, Integer.MIN_VALUE));
    }

    /* renamed from: setMaxHeightDp */
    public final void m73924xb4b70bd5(int i17) {
        this.f262248d = i17;
        this.f262249e = i17 != -1 ? i65.a.b(getContext(), this.f262248d) : -1;
        invalidate();
    }

    /* renamed from: setMaxHeightPx */
    public final void m73925xb4b70d51(int i17) {
        this.f262249e = i17;
        invalidate();
    }

    public C19147x541bc361(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f262249e = -1;
    }
}
