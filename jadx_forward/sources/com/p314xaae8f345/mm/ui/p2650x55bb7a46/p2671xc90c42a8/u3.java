package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f284028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f284029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o3 f284030f;

    public u3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o3 o3Var, java.util.ArrayList arrayList, int i17, int i18) {
        this.f284030f = o3Var;
        this.f284028d = arrayList;
        this.f284029e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o3 o3Var = this.f284030f;
        if (o3Var.f283939s.get()) {
            return;
        }
        o3Var.n();
        o3Var.f284079i.clear();
        o3Var.f284079i.addAll(this.f284028d);
        o3Var.getClass();
        o3Var.f284080m = o3Var.f284079i;
        zb5.i iVar = o3Var.f284076f;
        if (iVar != null) {
            iVar.A(false, this.f284029e);
        }
    }
}
