package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.KeyboardLinearLayout */
/* loaded from: classes8.dex */
public class C21386xa8232056 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21527x310c6aba {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f278354e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f278355f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f278356g;

    /* renamed from: h, reason: collision with root package name */
    public int f278357h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.e8 f278358i;

    public C21386xa8232056(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278354e = "MicroMsg.KeyboardLinearLayout";
        this.f278355f = false;
        this.f278357h = 0;
        this.f278356g = false;
        this.f278354e += getId();
    }

    public void c(int i17) {
        if (this.f278355f) {
            int i18 = this.f278357h;
            if (i18 < i17) {
                i18 = i17;
            }
            this.f278357h = i18;
        } else {
            this.f278355f = true;
            this.f278357h = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f278354e, "init height:%d", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.ui.e8 e8Var = this.f278358i;
            if (e8Var != null) {
                e8Var.a(-1);
            }
        }
        if (this.f278355f && !this.f278356g && this.f278357h - i17 > 100) {
            this.f278356g = true;
            e(-3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f278354e, "show keyboard!! mHeight: " + this.f278357h + " b: " + i17);
        }
        if (this.f278355f && this.f278356g && this.f278357h - i17 <= 100) {
            this.f278356g = false;
            e(-2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f278354e, "hide keyboard!! mHeight: " + this.f278357h + " b: " + i17);
        }
    }

    public void e(int i17) {
        com.p314xaae8f345.mm.ui.e8 e8Var = this.f278358i;
        if (e8Var != null) {
            e8Var.a(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21527x310c6aba, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22601x66cbd65e, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        c(i27);
    }

    /* renamed from: setOnkbdStateCopyListener */
    public void m78439x655a6f6e(com.p314xaae8f345.mm.ui.d8 d8Var) {
    }

    /* renamed from: setOnkbdStateListener */
    public void m78440x375f7b59(com.p314xaae8f345.mm.ui.e8 e8Var) {
        this.f278358i = e8Var;
    }

    public C21386xa8232056(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278354e = "MicroMsg.KeyboardLinearLayout";
        this.f278355f = false;
    }
}
