package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class k8 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f242762d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f242763e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f242764f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f242762d = "";
        this.f242764f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i8(this));
    }

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k8 k8Var) {
        java.lang.String U6;
        if (k8Var.f242763e) {
            U6 = k8Var.f242762d;
        } else {
            java.lang.String str = k8Var.f242762d;
            if (str == null) {
                str = "";
            }
            U6 = k8Var.U6(str);
        }
        int i17 = k8Var.f242763e ? com.p314xaae8f345.mm.R.C30867xcad56011.ohc : com.p314xaae8f345.mm.R.C30867xcad56011.ohs;
        em.w3 V6 = k8Var.V6();
        if (V6.f336428b == null) {
            V6.f336428b = (android.widget.TextView) V6.f336427a.findViewById(com.p314xaae8f345.mm.R.id.si9);
        }
        V6.f336428b.setText(U6);
        em.w3 V62 = k8Var.V6();
        if (V62.f336429c == null) {
            V62.f336429c = (android.widget.TextView) V62.f336427a.findViewById(com.p314xaae8f345.mm.R.id.v5j);
        }
        android.widget.TextView textView = V62.f336429c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        k8Var.W6(textView, i17, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.j8(k8Var));
    }

    public final java.lang.String U6(java.lang.String str) {
        int K = r26.n0.K(str, '@', 0, false, 6, null);
        if (K <= 1) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str.charAt(0));
        sb6.append("****");
        sb6.append(str.charAt(K - 1));
        sb6.append('@');
        java.lang.String substring = str.substring(K + 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        sb6.append(substring);
        return sb6.toString();
    }

    public final em.w3 V6() {
        return (em.w3) ((jz5.n) this.f242764f).mo141623x754a37bb();
    }

    public final void W6(android.widget.TextView textView, int i17, yz5.a aVar) {
        java.lang.String m158362x2fec8307 = m158362x2fec8307(i17);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(m158362x2fec8307);
        spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g8(aVar), 0, m158362x2fec8307.length(), 18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        textView.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(P6 != null ? P6.mo55332x76847179() : null));
        textView.setClickable(true);
        textView.setText(spannableStringBuilder);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.enj;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f242762d = m158359x1e885992().getStringExtra("BINDED_EMAIL");
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo54450xbf7c1df6("");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 != null) {
            P62.mo64405x4dab7448(m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P63 = P6();
        if (P63 != null) {
            P63.mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.c8(this), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        }
        em.w3 V6 = V6();
        if (V6.f336428b == null) {
            V6.f336428b = (android.widget.TextView) V6.f336427a.findViewById(com.p314xaae8f345.mm.R.id.si9);
        }
        android.widget.TextView textView = V6.f336428b;
        java.lang.String str = this.f242762d;
        textView.setText(U6(str != null ? str : ""));
        textView.setTextAlignment(4);
        textView.setMaxLines(2);
        textView.setBreakStrategy(0);
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.d8(textView));
        em.w3 V62 = V6();
        if (V62.f336429c == null) {
            V62.f336429c = (android.widget.TextView) V62.f336427a.findViewById(com.p314xaae8f345.mm.R.id.v5j);
        }
        android.widget.TextView textView2 = V62.f336429c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        W6(textView2, com.p314xaae8f345.mm.R.C30867xcad56011.ohs, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.e8(this));
        em.w3 V63 = V6();
        if (V63.f336430d == null) {
            V63.f336430d = (android.widget.Button) V63.f336427a.findViewById(com.p314xaae8f345.mm.R.id.kao);
        }
        V63.f336430d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.f8(this));
    }
}
