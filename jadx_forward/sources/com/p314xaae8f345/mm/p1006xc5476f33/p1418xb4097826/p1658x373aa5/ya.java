package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes5.dex */
public final class ya implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15295xb55935d0 f214921d;

    public ya(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15295xb55935d0 c15295xb55935d0) {
        this.f214921d = c15295xb55935d0;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15295xb55935d0 c15295xb55935d0 = this.f214921d;
        java.lang.String obj = c15295xb55935d0.f212661f.getText().toString();
        c15295xb55935d0.f212666n = obj;
        int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(32, obj) / 2;
        android.widget.TextView textView = c15295xb55935d0.f212662g;
        textView.setText((16 - b17) + "/16");
        android.widget.TextView textView2 = c15295xb55935d0.f212660e;
        if (b17 >= 0) {
            textView.setTextColor(c15295xb55935d0.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            textView2.setEnabled(true);
            textView2.setTextColor(c15295xb55935d0.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            textView2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563090wj);
            return;
        }
        textView.setTextColor(c15295xb55935d0.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
        textView2.setEnabled(false);
        textView2.setTextColor(c15295xb55935d0.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560520mq));
        textView2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563088wh);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
