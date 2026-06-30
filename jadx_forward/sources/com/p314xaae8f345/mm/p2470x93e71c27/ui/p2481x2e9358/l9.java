package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class l9 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.n9 f271999d;

    public l9(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.n9 n9Var) {
        this.f271999d = n9Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        db5.d5 d5Var = this.f271999d.f272052h;
        if (d5Var == null) {
            return false;
        }
        d5Var.dismiss();
        return false;
    }
}
