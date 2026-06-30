package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1 f283851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f283852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f283853f;

    public l1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1 o1Var, boolean z17, java.util.List list) {
        this.f283851d = o1Var;
        this.f283852e = z17;
        this.f283853f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zb5.e eVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1 o1Var = this.f283851d;
        if (o1Var.f283926i == null || o1Var.f283927m.get() || (eVar = o1Var.f283926i) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ActivityC21746xa8e928c2) eVar).U6(this.f283852e, this.f283853f);
    }
}
