package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes5.dex */
public final class r0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 f256998a;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var) {
        this.f256998a = v0Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f256998a.f257017n;
        if (c22621x7603e017 != null) {
            c22621x7603e017.n(str);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
        android.view.inputmethod.InputConnection mo81352x6a67d012;
        android.view.inputmethod.InputConnection mo81352x6a67d0122;
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var = this.f256998a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = v0Var.f257017n;
        if (c22621x7603e017 != null && (mo81352x6a67d0122 = c22621x7603e017.mo81352x6a67d012()) != null) {
            mo81352x6a67d0122.sendKeyEvent(new android.view.KeyEvent(0, 67));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = v0Var.f257017n;
        if (c22621x7603e0172 == null || (mo81352x6a67d012 = c22621x7603e0172.mo81352x6a67d012()) == null) {
            return;
        }
        mo81352x6a67d012.sendKeyEvent(new android.view.KeyEvent(1, 67));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.E(this.f256998a);
    }
}
