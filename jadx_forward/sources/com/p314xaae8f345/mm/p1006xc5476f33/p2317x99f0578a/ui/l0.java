package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes5.dex */
public final class l0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 f256975d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var) {
        this.f256975d = v0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var = this.f256975d;
        if (!v0Var.f257014h && v0Var.P) {
            v0Var.f257014h = true;
            v0Var.f257012f.f256932w = 1;
        }
        android.widget.Button button = v0Var.f257026v;
        if (button != null) {
            button.setEnabled(true ^ com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(editable));
        }
        android.widget.ImageView imageView = v0Var.f257018o;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(editable) ? 4 : 0);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
