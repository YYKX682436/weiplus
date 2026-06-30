package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes8.dex */
public class p1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19641xd487040e f272583d;

    public p1(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19641xd487040e c19641xd487040e) {
        this.f272583d = c19641xd487040e;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence.toString());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19641xd487040e c19641xd487040e = this.f272583d;
        if (K0) {
            c19641xd487040e.f271313g = true;
        } else {
            c19641xd487040e.f271313g = false;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.h2 h2Var;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.h2 h2Var2;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.h2 h2Var3;
        int i27 = com.p314xaae8f345.mm.p2470x93e71c27.ui.C19641xd487040e.f271309m;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19641xd487040e c19641xd487040e = this.f272583d;
        c19641xd487040e.b();
        if (charSequence.toString().equals("") && !c19641xd487040e.f271313g) {
            if (c19641xd487040e.f271311e == null || !c19641xd487040e.isFocused()) {
                return;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9) c19641xd487040e.f271311e;
            if (c19645x574159e9.f271340h.getChildCount() - 1 == 1 || (h2Var3 = c19645x574159e9.f271342m) == null) {
                return;
            }
            h2Var3.mo67648x3dcbea6f();
            return;
        }
        if (charSequence.toString().equals("") || !c19641xd487040e.f271313g) {
            if (c19641xd487040e.f271311e == null || !c19641xd487040e.isFocused() || (h2Var = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9) c19641xd487040e.f271311e).f271342m) == null) {
                return;
            }
            h2Var.mo67648x3dcbea6f();
            return;
        }
        if (c19641xd487040e.f271311e == null || !c19641xd487040e.isFocused() || (h2Var2 = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9) c19641xd487040e.f271311e).f271342m) == null) {
            return;
        }
        h2Var2.mo67648x3dcbea6f();
    }
}
