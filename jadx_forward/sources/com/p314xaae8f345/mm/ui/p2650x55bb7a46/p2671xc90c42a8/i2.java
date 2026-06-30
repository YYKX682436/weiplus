package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l2 f283792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f283793e;

    public i2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l2 l2Var, boolean z17) {
        this.f283792d = l2Var;
        this.f283793e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l2 l2Var = this.f283792d;
        zb5.i iVar = l2Var.f284076f;
        if (iVar != null) {
            iVar.A(this.f283793e, l2Var.f284079i.size());
        }
    }
}
