package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class c0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f163264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t0 f163265b;

    public c0(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t0 t0Var) {
        this.f163264a = arrayList;
        this.f163265b = t0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t0 t0Var;
        java.util.ArrayList arrayList = this.f163264a;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            t0Var = this.f163265b;
            if (!hasNext) {
                break;
            }
            if (nf.t.b(t0Var.f163593a.mo50352x76847179(), t0Var.f163593a, (java.lang.String) it.next())) {
                it.remove();
            }
        }
        if (arrayList.isEmpty()) {
            return java.lang.Boolean.TRUE;
        }
        android.app.Activity a17 = q75.a.a(t0Var.f163593a.mo50352x76847179());
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "step:requestPermission, context !is Activity");
            km5.u.b().a(new java.lang.IllegalStateException("fail:internal error invalid android context"));
            return java.lang.Boolean.FALSE;
        }
        km5.b b17 = km5.u.b();
        b17.b();
        nf.g.a(a17).i(t0Var.f163593a, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.b0(b17, arrayList));
        return java.lang.Boolean.FALSE;
    }
}
