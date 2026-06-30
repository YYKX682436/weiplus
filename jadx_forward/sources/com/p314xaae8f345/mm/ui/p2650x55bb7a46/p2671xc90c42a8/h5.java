package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class h5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m5 f283783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f283784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f283785f;

    public h5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m5 m5Var, java.util.ArrayList arrayList, int i17, int i18) {
        this.f283783d = m5Var;
        this.f283784e = arrayList;
        this.f283785f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m5 m5Var = this.f283783d;
        if (m5Var.f283881s.get()) {
            return;
        }
        m5Var.n();
        m5Var.f284079i.clear();
        m5Var.f284079i.addAll(this.f283784e);
        m5Var.getClass();
        m5Var.f284080m = m5Var.f284079i;
        zb5.i iVar = m5Var.f284076f;
        if (iVar != null) {
            iVar.A(false, this.f283785f);
        }
    }
}
