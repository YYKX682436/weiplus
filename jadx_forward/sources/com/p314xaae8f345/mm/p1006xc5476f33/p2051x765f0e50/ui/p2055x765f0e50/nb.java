package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class nb extends wm3.a implements al5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f242888d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f242889e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f242889e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mb(this));
    }

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.SettingsEmailEditUIC", "keyboard show " + z17 + ", keyboardHeight " + i17);
        if (!z17) {
            android.view.ViewGroup.LayoutParams layoutParams = T6().d().getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = m158361x893a2f6f().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu);
            layoutParams2.topMargin = 0;
            T6().d().setLayoutParams(layoutParams2);
            T6().c().setPadding(T6().c().getPaddingLeft(), T6().c().getPaddingTop(), T6().c().getPaddingRight(), 0);
            T6().e().scrollBy(0, 0);
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = T6().d().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.bottomMargin = m158361x893a2f6f().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        layoutParams4.topMargin = m158361x893a2f6f().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        T6().d().setLayoutParams(layoutParams4);
        T6().c().setPadding(T6().c().getPaddingLeft(), T6().c().getPaddingTop(), T6().c().getPaddingRight(), i17);
        int height = T6().e().getHeight();
        T6().c().requestLayout();
        T6().c().post(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.lb(this, height));
    }

    public final em.x3 T6() {
        return (em.x3) ((jz5.n) this.f242889e).mo141623x754a37bb();
    }

    public final void U6(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            T6().b().setVisibility(8);
        } else {
            T6().b().setVisibility(0);
            T6().b().setText(str);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.enl;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
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
            P63.mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ib(this), com.p314xaae8f345.mm.R.raw.f81445xd56bca2);
        }
        java.lang.Object l17 = gm0.j1.u().c().l(7, null);
        java.lang.Integer num = l17 instanceof java.lang.Integer ? (java.lang.Integer) l17 : null;
        this.f242888d = (num == null || (num.intValue() & 2) == 0) ? false : true;
        em.x3 T6 = T6();
        if (T6.f336460c == null) {
            T6.f336460c = (android.widget.TextView) T6.f336458a.findViewById(com.p314xaae8f345.mm.R.id.t7e);
        }
        T6.f336460c.setText(m158362x2fec8307(this.f242888d ? com.p314xaae8f345.mm.R.C30867xcad56011.f574568oh5 : com.p314xaae8f345.mm.R.C30867xcad56011.ogy));
        m158354x19263085().getWindow().setSoftInputMode(4);
        T6().c().e(this);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 a17 = T6().a();
        a17.requestFocus();
        a17.setText(m158359x1e885992().getStringExtra("change_bind_email"));
        a17.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.jb(this));
        T6().d().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kb(this));
    }
}
