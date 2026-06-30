package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class g5 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final android.text.TextWatcher f271862d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f271863e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271864f;

    public g5(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33, android.text.TextWatcher textWatcher) {
        this.f271864f = c19666xfd6e2f33;
        this.f271862d = textWatcher;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271864f;
        if (!c19666xfd6e2f33.f271576p3 && c19666xfd6e2f33.X1 && this.f271863e && editable.length() > 0) {
            this.f271863e = false;
            c19666xfd6e2f33.f271554m.mo81590x765074af(editable.subSequence(0, editable.length() - 1));
            if (c19666xfd6e2f33.f271554m.mo81573xbe0e3ae6() > 0) {
                c19666xfd6e2f33.f271560n.performClick();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "enter button, do send");
            }
            java.lang.System.currentTimeMillis();
            return;
        }
        this.f271862d.afterTextChanged(editable);
        if (c19666xfd6e2f33.f271566o != null) {
            if (c19666xfd6e2f33.f271554m.mo81566x92d2fac5() > 1) {
                c19666xfd6e2f33.f271566o.setVisibility(0);
                c19666xfd6e2f33.f271566o.setText("" + editable.length() + "/140");
            } else {
                c19666xfd6e2f33.f271566o.setVisibility(8);
            }
        }
        boolean m17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.m(c19666xfd6e2f33, editable);
        if (!com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.n(c19666xfd6e2f33, m17)) {
            c19666xfd6e2f33.B(m17);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = c19666xfd6e2f33.f271514f;
        if (abstractC19636xc6b37291 != null) {
            abstractC19636xc6b37291.mo75346x768d9f7f(m17);
        }
        java.lang.System.currentTimeMillis();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f271862d.beforeTextChanged(charSequence, i17, i18, i19);
        java.lang.System.currentTimeMillis();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271864f;
        if (!c19666xfd6e2f33.f271576p3 && c19666xfd6e2f33.X1 && i18 == 0 && i17 == charSequence.length() - 1 && i19 == 1 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "text changed, enter button");
            this.f271863e = true;
            return;
        }
        this.f271862d.onTextChanged(charSequence, i17, i18, i19);
        c19666xfd6e2f33.f271561n2 = true;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6298x8484ff78 c6298x8484ff78 = c19666xfd6e2f33.P2;
        c6298x8484ff78.f136577g++;
        c6298x8484ff78.f136575e = c6298x8484ff78.i();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6298x8484ff78 c6298x8484ff782 = c19666xfd6e2f33.P2;
        if (c6298x8484ff782.f136574d == 0) {
            c6298x8484ff782.f136574d = c6298x8484ff782.i();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = c19666xfd6e2f33.f271514f;
        if (abstractC19636xc6b37291 != null) {
            abstractC19636xc6b37291.mo75358x658d5272(c19666xfd6e2f33.f271554m.getText().toString());
        }
    }
}
