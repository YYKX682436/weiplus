package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd;

/* loaded from: classes4.dex */
public final class l0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.g1 f252934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f252935b;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.g1 g1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f252934a = g1Var;
        this.f252935b = interfaceC29045xdcb5ca57;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("call", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$runGetDataCgi$2$1");
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("call", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$runGetDataCgi$2$1");
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        r45.xf xfVar = (r45.xf) fVar.f152151d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldDataUIC", "runCgi: " + i17 + ", " + i18);
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f252935b;
        if (i17 == 0 && i18 == 0) {
            pc4.d.f434943a.H(xfVar.f471578e);
            java.util.LinkedList object_list = xfVar.f471577d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(object_list, "object_list");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldDataUIC", "runCgi id list:".concat(kz5.n0.g0(object_list, ";", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.k0.f252932d, 30, null)));
            java.util.List a17 = this.f252934a.a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : a17) {
                long longValue = ((java.lang.Number) obj2).longValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(object_list, 10));
                java.util.Iterator it = object_list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) it.next()).Id));
                }
                if (!arrayList2.contains(java.lang.Long.valueOf(longValue))) {
                    arrayList.add(obj2);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                long longValue2 = ((java.lang.Number) it6.next()).longValue();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().mo70496xb06685ab(longValue2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldDataUIC", "delete snsinfo:" + ca4.z0.t0(longValue2));
            }
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(xfVar));
        } else {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("call", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$runGetDataCgi$2$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("call", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$runGetDataCgi$2$1");
        return f0Var;
    }
}
