package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes5.dex */
public class y1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 f220891d;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e70) {
        this.f220891d = c15854x49003e70;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e70 = this.f220891d;
        ck5.f b17 = ck5.f.b(c15854x49003e70.f220477n);
        b17.f124094f = 1;
        b17.f124093e = 1000;
        b17.f124095g = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2;
        b17.f124089a = true;
        b17.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.a2(c15854x49003e70));
        java.lang.String obj = c15854x49003e70.f220477n.getText().toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70.g(c15854x49003e70, obj);
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj);
        if (z17 == c15854x49003e70.B) {
            return;
        }
        c15854x49003e70.B = z17;
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) c15854x49003e70.f220479p.getLayoutParams();
        if (z17) {
            layoutParams.setMarginStart(i65.a.h(c15854x49003e70.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
            c15854x49003e70.f220479p.setLayoutParams(layoutParams);
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            valueAnimator.setIntValues(0, c15854x49003e70.A);
            valueAnimator.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.u1(this));
            valueAnimator.setDuration(150L);
            valueAnimator.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.v1(this));
            valueAnimator.start();
            return;
        }
        layoutParams.setMarginStart(i65.a.h(c15854x49003e70.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        c15854x49003e70.f220479p.setLayoutParams(layoutParams);
        android.animation.ValueAnimator valueAnimator2 = new android.animation.ValueAnimator();
        valueAnimator2.setIntValues(c15854x49003e70.A, 0);
        valueAnimator2.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.w1(this));
        valueAnimator2.setDuration(150L);
        valueAnimator2.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.x1(this));
        valueAnimator2.start();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.String valueOf = java.lang.String.valueOf(charSequence);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e70 = this.f220891d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.g8 g8Var = c15854x49003e70.f220483t;
        if (g8Var != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra) g8Var;
            raVar.f272152j = true;
            raVar.a(valueOf, c15854x49003e70.G);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = c15854x49003e70.f220482s;
        if (abstractC19636xc6b37291 != null) {
            abstractC19636xc6b37291.mo75358x658d5272(c15854x49003e70.f220477n.getText().toString());
        }
    }
}
