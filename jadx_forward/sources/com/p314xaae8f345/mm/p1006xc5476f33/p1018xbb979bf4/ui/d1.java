package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes.dex */
public final class d1 implements u60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 f156065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f156066b;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 l1Var, android.widget.TextView textView) {
        this.f156065a = l1Var;
        this.f156066b = textView;
    }

    @Override // u60.e
    /* renamed from: onLocationAddr */
    public final void mo24721x71c058c5(com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 c11121x1f1011) {
        java.util.Objects.toString(c11121x1f1011);
        java.lang.String str = c11121x1f1011.f152748h;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = c11121x1f1011.f152747g;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 l1Var = this.f156065a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 h17 = l1Var.f156112t.h(c11121x1f1011.f152746f, str, c11121x1f1011.f152749i, c11121x1f1011.f152753p);
        if (h17 != null) {
            java.lang.String str2 = h17.f155904d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c11485x80cda4c8 = h17;
            while (true) {
                c11485x80cda4c8 = l1Var.f156112t.c(c11485x80cda4c8.f155908h);
                if (c11485x80cda4c8 == null) {
                    break;
                }
                str2 = c11485x80cda4c8.f155904d + ' ' + str2;
            }
            this.f156066b.setText(str2);
            android.widget.TextView textView = (android.widget.TextView) l1Var.findViewById(com.p314xaae8f345.mm.R.id.f568340mj0);
            if (textView != null) {
                textView.setVisibility(0);
                textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.c1(l1Var, h17));
            }
        }
    }
}
