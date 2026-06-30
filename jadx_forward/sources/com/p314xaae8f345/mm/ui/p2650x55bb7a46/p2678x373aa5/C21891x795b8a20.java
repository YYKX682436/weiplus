package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/ui/chatting/view/AlphaGradientTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.view.AlphaGradientTextView */
/* loaded from: classes3.dex */
public final class C21891x795b8a20 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.LinearGradient f284339g;

    /* renamed from: h, reason: collision with root package name */
    public final float f284340h;

    /* renamed from: i, reason: collision with root package name */
    public final int f284341i;

    /* renamed from: m, reason: collision with root package name */
    public final int f284342m;

    /* renamed from: n, reason: collision with root package name */
    public int f284343n;

    /* renamed from: o, reason: collision with root package name */
    public final int f284344o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21891x795b8a20(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17) {
            if (this.f284339g == null || (this.f284343n > 0 && java.lang.Math.abs(getHeight() - this.f284343n) > this.f284344o)) {
                this.f284339g = new android.graphics.LinearGradient(0.0f, getHeight() * this.f284340h, 0.0f, getHeight(), this.f284342m, this.f284341i, android.graphics.Shader.TileMode.CLAMP);
            }
            this.f284343n = getHeight();
            getPaint().setShader(this.f284339g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21891x795b8a20(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f284340h = 0.24f;
        this.f284341i = e3.b.i(getCurrentTextColor(), 112);
        this.f284342m = e3.b.i(getCurrentTextColor(), 255);
        this.f284344o = 4;
    }
}
