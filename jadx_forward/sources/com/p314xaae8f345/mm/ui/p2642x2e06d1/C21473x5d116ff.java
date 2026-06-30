package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.EllipsizeTextView */
/* loaded from: classes4.dex */
public class C21473x5d116ff extends com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f278777g;

    /* renamed from: h, reason: collision with root package name */
    public int f278778h;

    /* renamed from: i, reason: collision with root package name */
    public int f278779i;

    /* renamed from: m, reason: collision with root package name */
    public db5.n f278780m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.CharSequence f278781n;

    public C21473x5d116ff(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void b(java.lang.CharSequence charSequence, java.lang.String str, int i17, int i18) {
        this.f278777g = str;
        this.f278778h = i17;
        this.f278779i = i18;
        this.f278781n = charSequence;
        setText(((java.lang.Object) this.f278781n) + "  " + str);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (getMeasuredWidth() <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f278777g) || this.f278780m == null || getText() == null || getText().length() <= 0) {
            return;
        }
        java.lang.CharSequence a17 = this.f278780m.a(this, this.f278781n, this.f278777g, this.f278778h, this.f278779i);
        this.f278777g = null;
        setText(a17, android.widget.TextView.BufferType.SPANNABLE);
        requestLayout();
    }

    /* renamed from: setLayoutCallback */
    public void m78881x600eea91(db5.n nVar) {
        this.f278780m = nVar;
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    public C21473x5d116ff(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
