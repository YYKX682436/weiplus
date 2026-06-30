package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes5.dex */
public class p0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI f96325d;

    public p0(com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI qrRewardSetMoneyUI) {
        this.f96325d = qrRewardSetMoneyUI;
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
        com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI qrRewardSetMoneyUI = this.f96325d;
        com.tencent.mm.sdk.platformtools.u3.l(qrRewardSetMoneyUI.f96284v);
        com.tencent.mm.sdk.platformtools.u3.i(qrRewardSetMoneyUI.f96284v, 50L);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
