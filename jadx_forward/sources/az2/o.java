package az2;

/* loaded from: classes2.dex */
public abstract class o extends az2.j {
    public o(r45.qt2 qt2Var, im5.b bVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super((i17 & 1) != 0 ? null : qt2Var, (i17 & 2) != 0 ? null : bVar);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f resp, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.List C = C(resp);
        java.util.Iterator it = C.iterator();
        while (it.hasNext()) {
            bu2.j.f106067a.n((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next(), new bu2.h(this.f152179f.f152246d, D()));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("request: ");
        sb6.append(D());
        sb6.append(", allowSimpleResult: ");
        sb6.append(B());
        sb6.append(", switch: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        sb6.append(((java.lang.Boolean) t70Var.j1().r()).booleanValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCgi", sb6.toString());
        t70Var.j1().l();
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079> arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = C.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            r45.dm2 m76806xdef68064 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) next).getFeedObject().m76806xdef68064();
            if (m76806xdef68064 != null && m76806xdef68064.m75939xb282bd08(40) == 1) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 : arrayList) {
            r45.rv0 rv0Var = new r45.rv0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCgi", "getBatchFeed: ".concat(pm0.v.u(c14994x9b99c079.m59251x5db1b11())));
            rv0Var.set(0, java.lang.Long.valueOf(c14994x9b99c079.m59251x5db1b11()));
            arrayList2.add(rv0Var);
        }
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.j1().r()).booleanValue() && B() && (!arrayList2.isEmpty())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCgi", "listSize: " + arrayList2.size());
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(arrayList2);
            new az2.a(linkedList, this.f97668n, 5).l().K(new az2.n(this));
        }
    }

    public boolean B() {
        return this instanceof bq.z1;
    }

    public abstract java.util.List C(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar);

    public abstract long D();
}
