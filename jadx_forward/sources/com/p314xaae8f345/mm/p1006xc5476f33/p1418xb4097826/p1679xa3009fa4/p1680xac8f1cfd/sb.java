package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class sb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc f217416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f217417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f217418f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc ncVar, java.util.LinkedList linkedList, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f217416d = ncVar;
        this.f217417e = linkedList;
        this.f217418f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sb(this.f217416d, this.f217417e, this.f217418f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f217416d.f216826g;
        java.util.LinkedList linkedList = this.f217417e;
        if (abstractC13919x46aff122 == null) {
            return linkedList;
        }
        java.util.List<E> m56392xfc5c33e5 = abstractC13919x46aff122.m56392xfc5c33e5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class);
        m56392xfc5c33e5.addAll(hc2.f0.d(abstractC13919x46aff122.m56387xe6796cde().m56381x12f2b736(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class));
        int i17 = this.f217418f;
        java.util.List b17 = hc2.v.b(m56392xfc5c33e5, i17);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) it.next()).getFeedObject().m59240x7c94657b();
            r45.e13 e13Var = new r45.e13();
            e13Var.set(0, java.lang.Long.valueOf(m59240x7c94657b.m76784x5db1b11()));
            r45.dm2 m76806xdef68064 = m59240x7c94657b.m76806xdef68064();
            e13Var.set(4, m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null);
            e13Var.set(1, m59240x7c94657b.m76803x6c285d75());
            e13Var.set(2, java.lang.Integer.valueOf(i17));
            arrayList.add(e13Var);
        }
        linkedList.addAll(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : linkedList) {
            if (!r11.X6().P6(i17, ((r45.e13) obj2).m75942xfb822ef2(0))) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
