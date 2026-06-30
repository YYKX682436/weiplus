package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class u0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.c1 f101952d;

    public u0(com.tencent.mm.plugin.finder.activity.uic.c1 c1Var) {
        this.f101952d = c1Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i17;
        com.tencent.mm.plugin.finder.activity.uic.c1 c1Var = this.f101952d;
        if (editable != null) {
            i17 = editable.toString().length();
            if (8 <= i17 && i17 < 10) {
                android.widget.TextView textView = c1Var.f101856u;
                if (textView != null) {
                    textView.setTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.FG_1));
                }
                android.widget.TextView textView2 = c1Var.f101856u;
                if (textView2 != null) {
                    textView2.setText(java.lang.String.valueOf(10 - i17));
                }
            } else if (i17 == 10) {
                android.widget.TextView textView3 = c1Var.f101856u;
                if (textView3 != null) {
                    textView3.setTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.FG_1));
                }
                android.widget.TextView textView4 = c1Var.f101856u;
                if (textView4 != null) {
                    textView4.setText("");
                }
            } else if (i17 > 10) {
                android.widget.TextView textView5 = c1Var.f101856u;
                if (textView5 != null) {
                    textView5.setTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.f478532ac));
                }
                android.widget.TextView textView6 = c1Var.f101856u;
                if (textView6 != null) {
                    textView6.setText(java.lang.String.valueOf(10 - i17));
                }
            } else {
                android.widget.TextView textView7 = c1Var.f101856u;
                if (textView7 != null) {
                    textView7.setText("");
                }
            }
        } else {
            i17 = 0;
        }
        c1Var.U6(false, 0);
        com.tencent.mm.ui.widget.MMEditText mMEditText = c1Var.f101844f;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        android.text.Editable text = mMEditText.getText();
        com.tencent.mm.plugin.finder.activity.uic.c1.Q6(c1Var, i17, text != null ? text.length() : 0);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
