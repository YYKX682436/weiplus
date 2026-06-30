package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class v0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.c1 f101959d;

    public v0(com.tencent.mm.plugin.finder.activity.uic.c1 c1Var) {
        this.f101959d = c1Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj;
        int length = (editable == null || (obj = editable.toString()) == null) ? 0 : obj.length();
        com.tencent.mm.plugin.finder.activity.uic.i0 i0Var = com.tencent.mm.plugin.finder.activity.uic.c1.N;
        boolean z17 = length < com.tencent.mm.plugin.finder.activity.uic.i0.a(i0Var) && com.tencent.mm.plugin.finder.activity.uic.i0.a(i0Var) + (-10) <= length;
        com.tencent.mm.plugin.finder.activity.uic.c1 c1Var = this.f101959d;
        if (z17) {
            android.widget.TextView textView = c1Var.f101857v;
            if (textView != null) {
                textView.setTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.FG_1));
            }
            android.widget.TextView textView2 = c1Var.f101857v;
            if (textView2 != null) {
                textView2.setText(java.lang.String.valueOf(com.tencent.mm.plugin.finder.activity.uic.i0.a(i0Var) - length));
            }
            com.tencent.mm.plugin.finder.activity.uic.c1.O6(c1Var, true);
        } else if (length == com.tencent.mm.plugin.finder.activity.uic.i0.a(i0Var)) {
            android.widget.TextView textView3 = c1Var.f101857v;
            if (textView3 != null) {
                textView3.setTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.FG_1));
            }
            android.widget.TextView textView4 = c1Var.f101857v;
            if (textView4 != null) {
                textView4.setText("");
            }
            com.tencent.mm.plugin.finder.activity.uic.c1.O6(c1Var, false);
        } else if (length > com.tencent.mm.plugin.finder.activity.uic.i0.a(i0Var)) {
            android.widget.TextView textView5 = c1Var.f101857v;
            if (textView5 != null) {
                textView5.setTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.f478532ac));
            }
            android.widget.TextView textView6 = c1Var.f101857v;
            if (textView6 != null) {
                textView6.setText(java.lang.String.valueOf(com.tencent.mm.plugin.finder.activity.uic.i0.a(i0Var) - length));
            }
            com.tencent.mm.plugin.finder.activity.uic.c1.O6(c1Var, true);
        } else {
            android.widget.TextView textView7 = c1Var.f101857v;
            if (textView7 != null) {
                textView7.setText("");
            }
            com.tencent.mm.plugin.finder.activity.uic.c1.O6(c1Var, false);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = c1Var.f101843e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("nameEdit");
            throw null;
        }
        android.text.Editable text = mMEditText.getText();
        com.tencent.mm.plugin.finder.activity.uic.c1.Q6(c1Var, text != null ? text.length() : 0, length);
        c1Var.U6(false, 0);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
