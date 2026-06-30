package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes2.dex */
public final class ec implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.fc f255379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f255380e;

    public ec(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.fc fcVar, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf) {
        this.f255379d = fcVar;
        this.f255380e = c22848x6ddd90cf;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 netSceneBase) {
        pj4.k1 k1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(netSceneBase, "netSceneBase");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.fc fcVar = this.f255379d;
        if (i17 == 0 && i18 == 0 && (k1Var = ((ej4.g) netSceneBase).f334892f) != null) {
            fcVar.f255411d = k1Var.f436689e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(k1Var.f436688d);
            if (arrayList.size() > 1) {
                kz5.g0.t(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.dc());
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadNextPage: callback dataList size=");
            sb6.append(arrayList.size());
            sb6.append(", old size=");
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f255380e;
            sb6.append(c22848x6ddd90cf.m82898xfb7e5820().size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusHalfScreenLikeListUI", sb6.toString());
            c22848x6ddd90cf.m82898xfb7e5820().clear();
            for (java.lang.Object obj : arrayList) {
                if (obj instanceof pj4.b2) {
                    c22848x6ddd90cf.m82898xfb7e5820().add(new kj4.b(fcVar.f255408a, (pj4.b2) obj));
                }
            }
            c22848x6ddd90cf.m8146xced61ae5();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = fcVar.f255409b;
        if (c22801x87cbdc00 != null) {
            c22801x87cbdc00.N(0);
        }
    }
}
