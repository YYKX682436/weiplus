package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes8.dex */
public final class b2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a2 f183553d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a2(null);

    /* renamed from: e, reason: collision with root package name */
    public static zy2.i5 f183554e;

    public b2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5462x48e46092 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5462x48e46092) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createResultEvent callback :");
        am.ya yaVar = event.f135801g;
        sb6.append(yaVar != null ? java.lang.Integer.valueOf(yaVar.f89981a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CreateAccountStarter", sb6.toString());
        zy2.i5 i5Var = f183554e;
        if (i5Var == null) {
            return true;
        }
        i5Var.a(java.lang.Integer.valueOf(yaVar != null ? yaVar.f89981a : 0));
        return true;
    }
}
