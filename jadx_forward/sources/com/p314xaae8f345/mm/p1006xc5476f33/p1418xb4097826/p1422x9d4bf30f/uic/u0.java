package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes3.dex */
public final class u0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 f183485d;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var) {
        this.f183485d = c1Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var = this.f183485d;
        if (editable != null) {
            i17 = editable.toString().length();
            if (8 <= i17 && i17 < 10) {
                android.widget.TextView textView = c1Var.f183389u;
                if (textView != null) {
                    textView.setTextColor(c1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
                }
                android.widget.TextView textView2 = c1Var.f183389u;
                if (textView2 != null) {
                    textView2.setText(java.lang.String.valueOf(10 - i17));
                }
            } else if (i17 == 10) {
                android.widget.TextView textView3 = c1Var.f183389u;
                if (textView3 != null) {
                    textView3.setTextColor(c1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
                }
                android.widget.TextView textView4 = c1Var.f183389u;
                if (textView4 != null) {
                    textView4.setText("");
                }
            } else if (i17 > 10) {
                android.widget.TextView textView5 = c1Var.f183389u;
                if (textView5 != null) {
                    textView5.setTextColor(c1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
                }
                android.widget.TextView textView6 = c1Var.f183389u;
                if (textView6 != null) {
                    textView6.setText(java.lang.String.valueOf(10 - i17));
                }
            } else {
                android.widget.TextView textView7 = c1Var.f183389u;
                if (textView7 != null) {
                    textView7.setText("");
                }
            }
        } else {
            i17 = 0;
        }
        c1Var.U6(false, 0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c1Var.f183377f;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descEdit");
            throw null;
        }
        android.text.Editable text = c22621x7603e017.getText();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1.Q6(c1Var, i17, text != null ? text.length() : 0);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
