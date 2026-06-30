package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes15.dex */
public final class x0 implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 f156174d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 l1Var) {
        this.f156174d = l1Var;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectAddressDialog", "onPageSelected");
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 l1Var = this.f156174d;
        android.widget.TextView[] textViewArr = {(android.widget.TextView) ((jz5.n) l1Var.f156116x).mo141623x754a37bb(), (android.widget.TextView) ((jz5.n) l1Var.f156117y).mo141623x754a37bb(), (android.widget.TextView) ((jz5.n) l1Var.f156118z).mo141623x754a37bb(), (android.widget.TextView) ((jz5.n) l1Var.A).mo141623x754a37bb()};
        int i18 = 0;
        int i19 = 0;
        while (i18 < 4) {
            android.widget.TextView textView = textViewArr[i18];
            int i27 = i19 + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c11485x80cda4c8 = i19 >= l1Var.D.size() ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) l1Var.D.get(i19);
            if (c11485x80cda4c8 != null) {
                if (textView != null) {
                    textView.setText(c11485x80cda4c8.f155904d);
                }
                if (textView != null) {
                    textView.setTextColor(l1Var.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                }
            } else {
                if (textView != null) {
                    java.lang.CharSequence hint = textView.getHint();
                    textView.setText(hint != null ? hint.toString() : null);
                }
                if (textView != null) {
                    textView.setTextColor(l1Var.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
                }
            }
            if (textView != null) {
                textView.setVisibility(l1Var.C > i19 ? 0 : 4);
            }
            if (i17 == i19) {
                if (textView != null) {
                    com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                }
            } else if (textView != null) {
                com.p314xaae8f345.mm.ui.bk.t0(textView.getPaint());
            }
            i18++;
            i19 = i27;
        }
    }
}
