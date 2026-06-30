package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes4.dex */
public class f3 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f275447e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.e3.f275388z, "CleanDeleteItem")};

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2621x8fb0427b.f3 f275448f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f275449d;

    public f3(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.e3.f275388z, "CleanDeleteItem", null);
        this.f275449d = k0Var;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(java.util.Arrays.asList("CREATE INDEX IF NOT EXISTS ID ON CleanDeleteItem ( id )"));
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            k0Var.A("CleanDeleteItem", (java.lang.String) arrayList.get(i17));
        }
        java.lang.System.currentTimeMillis();
        k0Var.w(java.lang.Long.valueOf(F));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanDeleteItemStorage", "executeInitSQL last time[%d]", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.f3 y0() {
        gm0.j1.i();
        gm0.j1.b().c();
        if (f275448f == null) {
            f275448f = new com.p314xaae8f345.mm.p2621x8fb0427b.f3(gm0.j1.u().f354686f);
        }
        return f275448f;
    }

    @Override // l75.n0
    /* renamed from: update */
    public boolean mo11261xce0038c9(long j17, l75.f0 f0Var) {
        return super.mo11261xce0038c9(j17, (dm.c2) f0Var);
    }
}
