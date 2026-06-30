package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class p4 implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f190231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f190232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f190233c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f190234d;

    public p4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, boolean z17, so2.y0 y0Var, android.view.View view) {
        this.f190231a = a7Var;
        this.f190232b = z17;
        this.f190233c = y0Var;
        this.f190234d = view;
    }

    @Override // vh0.i1
    /* renamed from: onResult */
    public void mo56534x57429edc(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var;
        yw2.a0 a0Var;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", "privacy result " + bool);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (!bool.booleanValue() || (a0Var = (a7Var = this.f190231a).f187749o) == null) {
            return;
        }
        a0Var.n().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.o4(a7Var, this.f190233c, this.f190234d), this.f190232b ? 0L : 300L);
    }
}
