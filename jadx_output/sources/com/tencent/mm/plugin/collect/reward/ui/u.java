package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class u implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public int f96333d = 0;

    public u(com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        editable.toString();
        editable.length();
        java.lang.String obj = editable.toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            this.f96333d = 0;
        } else if (this.f96333d == 0) {
            ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).getClass();
            if (!com.tencent.mm.smiley.x1.Di().Ai(obj)) {
                ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).getClass();
                if (!com.tencent.mm.smiley.x1.Di().Bi(obj)) {
                    this.f96333d = 1;
                }
            }
            this.f96333d = editable.length();
        }
        editable.delete(this.f96333d, editable.length());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
