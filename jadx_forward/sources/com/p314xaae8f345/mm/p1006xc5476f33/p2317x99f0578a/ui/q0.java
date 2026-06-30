package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes5.dex */
public final class q0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 f256995d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var) {
        this.f256995d = v0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var = this.f256995d;
        int i17 = v0Var.G;
        int i18 = i17 % 3;
        v0Var.G = i17 + 1;
        if (i18 == 0) {
            v0Var.F = "·";
        } else if (i18 == 1) {
            v0Var.F = "··";
        } else if (i18 == 2) {
            v0Var.F = "···";
        }
        java.lang.String str = v0Var.f257029x0;
        int length = str.length() > 3 ? str.length() - 3 : 0;
        java.lang.String str2 = str + v0Var.F;
        android.text.SpannableString spannableString = new android.text.SpannableString(str2);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(v0Var.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a)), length, str2.length(), 18);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = v0Var.f257017n;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setText(spannableString);
        }
        return true;
    }
}
