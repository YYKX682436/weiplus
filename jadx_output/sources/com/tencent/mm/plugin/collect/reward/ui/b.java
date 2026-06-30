package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class b implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI f96288d;

    public b(com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI qrRewardGrantUI) {
        this.f96288d = qrRewardGrantUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        java.lang.String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int length = obj.length();
        if (indexOf >= 0 && length - indexOf > 3) {
            editable.delete(indexOf + 3, length);
        } else if (indexOf > 6) {
            editable.delete(6, indexOf);
        } else if (indexOf == -1 && length > 6) {
            editable.delete(6, length);
        }
        int round = (int) java.lang.Math.round(com.tencent.mm.sdk.platformtools.t8.F(editable.toString(), 0.0d) * 100.0d);
        com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI qrRewardGrantUI = this.f96288d;
        com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.U6(qrRewardGrantUI, round);
        qrRewardGrantUI.f96216q = round;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
