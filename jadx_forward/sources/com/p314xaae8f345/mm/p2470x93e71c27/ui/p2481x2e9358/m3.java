package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class m3 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272016d;

    public m3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272016d = c19666xfd6e2f33;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272016d;
        if (c19666xfd6e2f33.f271501c6 != com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b5.MODE_TRANS) {
            return true;
        }
        java.lang.String str = (java.lang.String) ((java.util.HashMap) c19666xfd6e2f33.f271513e6).get(java.lang.Integer.valueOf(c19666xfd6e2f33.f271615v6));
        if (str == null) {
            str = "";
        }
        if (c19666xfd6e2f33.V4.getVisibility() == 0) {
            return true;
        }
        c19666xfd6e2f33.f271494b4.setText(pg5.d.a(c19666xfd6e2f33.getContext(), str));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c19666xfd6e2f33.f271494b4;
        c22621x7603e017.mo81549xf579a34a(c22621x7603e017.getText().length());
        return true;
    }
}
