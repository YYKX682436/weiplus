package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes5.dex */
public final class t5 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f217512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f217514f;

    public t5(android.widget.TextView textView, in5.s0 s0Var, boolean z17) {
        this.f217512d = textView;
        this.f217513e = s0Var;
        this.f217514f = z17;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
        int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u4.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.A) * 2, s17.toString()) / 2;
        boolean z17 = b17 >= 0 && b17 < 6;
        in5.s0 s0Var = this.f217513e;
        android.widget.TextView textView = this.f217512d;
        if (z17) {
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView != null) {
                textView.setText(java.lang.String.valueOf(b17));
            }
            if (textView != null) {
                textView.setTextColor(s0Var.f374654e.getResources().getColor(this.f217514f ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c : com.p314xaae8f345.mm.R.C30859x5a72f63.f560785u4));
                return;
            }
            return;
        }
        if (b17 >= 0) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(b17));
        }
        if (textView != null) {
            textView.setTextColor(s0Var.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
