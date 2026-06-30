package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public class p5 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.q5 f283615d;

    public p5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.q5 q5Var) {
        this.f283615d = q5Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        db5.d5 d5Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.q5 q5Var = this.f283615d;
        android.view.View view = q5Var.f284143r;
        if (view != null && (d5Var = q5Var.f284132d) != null) {
            q5Var.getClass();
            d5Var.showAsDropDown(view, 0, q5Var.f284138m);
        }
        return false;
    }
}
