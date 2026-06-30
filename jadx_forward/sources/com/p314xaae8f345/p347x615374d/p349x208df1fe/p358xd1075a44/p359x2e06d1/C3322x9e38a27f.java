package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaTextViewImpl */
/* loaded from: classes9.dex */
class C3322x9e38a27f extends android.widget.TextView {
    private static final java.lang.String TAG = "KindaButtonImpl";

    /* renamed from: hasLastPressed */
    private boolean f12941x574c0db2;

    /* renamed from: mKindaButton */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3296x6bc4e37f f12942xe3a3ee32;

    public C3322x9e38a27f(android.content.Context context) {
        super(context);
        this.f12941x574c0db2 = false;
        m26734x316510();
    }

    /* renamed from: init */
    private void m26734x316510() {
        setMaxLines(2);
        setEllipsize(android.text.TextUtils.TruncateAt.END);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        if (this.f12942xe3a3ee32.isEnabled() || this.f12942xe3a3ee32.m26388xaa889e5f() || this.f12941x574c0db2) {
            super.drawableStateChanged();
            this.f12941x574c0db2 = this.f12942xe3a3ee32.m26388xaa889e5f();
        }
    }

    /* renamed from: setKindaButton */
    public void m26735xa9d2971d(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3296x6bc4e37f c3296x6bc4e37f) {
        this.f12942xe3a3ee32 = c3296x6bc4e37f;
    }

    public C3322x9e38a27f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12941x574c0db2 = false;
        m26734x316510();
    }

    public C3322x9e38a27f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f12941x574c0db2 = false;
        m26734x316510();
    }
}
