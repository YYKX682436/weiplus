package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class j4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m4 f283817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f283818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f283819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f283820g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f283821h;

    public j4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m4 m4Var, java.util.ArrayList arrayList, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, boolean z17, int i17) {
        this.f283817d = m4Var;
        this.f283818e = arrayList;
        this.f283819f = f0Var;
        this.f283820g = z17;
        this.f283821h = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m4 m4Var = this.f283817d;
        if (m4Var.f283879t.get()) {
            return;
        }
        m4Var.n();
        m4Var.f284079i.clear();
        m4Var.f284079i.addAll(this.f283818e);
        int i17 = this.f283819f.f391649d;
        m4Var.getClass();
        m4Var.f284080m = m4Var.f284079i;
        zb5.i iVar = m4Var.f284076f;
        if (iVar != null) {
            iVar.A(this.f283820g, this.f283821h);
        }
    }
}
