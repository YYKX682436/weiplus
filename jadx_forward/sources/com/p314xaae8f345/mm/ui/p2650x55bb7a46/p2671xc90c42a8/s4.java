package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class s4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f283991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y4 f283993f;

    public s4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y4 y4Var, java.util.ArrayList arrayList, int i17) {
        this.f283993f = y4Var;
        this.f283991d = arrayList;
        this.f283992e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y4 y4Var = this.f283993f;
        if (y4Var.f284098s.get()) {
            return;
        }
        y4Var.n();
        y4Var.f284079i.clear();
        y4Var.f284079i.addAll(this.f283991d);
        y4Var.f284080m = y4Var.f284079i;
        zb5.i iVar = y4Var.f284076f;
        if (iVar != null) {
            iVar.A(false, this.f283992e);
        }
    }
}
