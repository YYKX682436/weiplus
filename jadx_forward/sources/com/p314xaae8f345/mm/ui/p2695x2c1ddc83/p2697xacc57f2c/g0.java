package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes5.dex */
public class g0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0 f289041d;

    public g0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0 k0Var) {
        this.f289041d = k0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0 k0Var = this.f289041d;
        k0Var.f289071y++;
        if (k0Var.f289071y > 99) {
            return false;
        }
        if (k0Var.f289070x == 1) {
            k0Var.f289059m.setText(((android.content.Context) k0Var.f484375g.get()).getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h7j, java.lang.Integer.valueOf(k0Var.f289071y)));
        }
        return true;
    }
}
