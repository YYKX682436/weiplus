package bs2;

/* loaded from: classes2.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f105412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f105413e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(bs2.n1 n1Var, java.util.LinkedList linkedList) {
        super(0);
        this.f105412d = n1Var;
        this.f105413e = linkedList;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        bs2.n1 n1Var = this.f105412d;
        n1Var.getClass();
        boolean U2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.U2();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!U2 || (i17 = n1Var.f105440a) != 4) {
            return f0Var;
        }
        pf5.u uVar = pf5.u.f435469a;
        p012xc85e97e9.p093xedfae76a.c1 a17 = uVar.e(c61.l7.class).a(ey2.i2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        bs2.d1 d1Var = new bs2.d1((ey2.i2) a17, n1Var);
        java.util.LinkedList linkedList = this.f105413e;
        pm0.v.d0(linkedList, d1Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) next;
            jz5.f0 f0Var2 = f0Var;
            if (!bu2.j.f106067a.i(i17, c19792x256d2725.m76784x5db1b11()) && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0).m59346x74fcbb3d()) {
                arrayList.add(next);
            }
            f0Var = f0Var2;
        }
        jz5.f0 f0Var3 = f0Var;
        boolean isEmpty = arrayList.isEmpty();
        java.lang.String str = n1Var.f105442c;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "refreshFirstPage: valid feed is empty, origin size=" + linkedList.size());
            return f0Var3;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) kz5.n0.Z(arrayList);
        jz5.f0 f0Var4 = null;
        if (c19792x256d27252 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = cu2.u.f303974a.p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d27252, 0));
            p17.c2(true);
            java.util.List list = ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(4).f338976c;
            if (list.size() > 0) {
                java.util.Iterator it6 = list.iterator();
                int i18 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i18 = -1;
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it6.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
                    if (abstractC14490x69736cb5 != null && abstractC14490x69736cb5.getIsUnReadCacheFeed()) {
                        break;
                    }
                    i18++;
                }
                if (i18 >= 0) {
                    list.remove(i18);
                    list.add(i18, p17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "refreshFirstPage: insert to cache, index=" + i18 + ", feedId=" + pm0.v.u(c19792x256d27252.m76784x5db1b11()));
                } else {
                    list.add(p17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "refreshFirstPage: insert to cache tail, feedId=".concat(pm0.v.u(c19792x256d27252.m76784x5db1b11())));
                }
            }
            int d17 = hc2.d0.d(4);
            int a18 = hc2.d0.a(d17);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.addAll(bu2.d0.i(bu2.e0.f106031a, a18, null, 2, null));
            if (linkedList2.isEmpty()) {
                linkedList2.add(p17);
            } else {
                if (linkedList2.size() > 1) {
                    linkedList2.remove(1);
                }
                linkedList2.add(1, p17);
            }
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            linkedList3.addAll(p17.getFeedObject().m59264x7efe73ec());
            jz5.l lVar = new jz5.l(p17, kz5.n0.V0(linkedList3));
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            linkedList4.add(lVar);
            ((ds2.b0) ((jz5.n) n1Var.f105455p).mo141623x754a37bb()).e(new ek4.b(1, -1, hc2.d0.b(i17), 2, 0L, null, 0, 112, null), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88.f36135x233c02ec.b(p17.getFeedObject()), kz5.n0.V0(linkedList4), 1000);
            cu2.u.f303974a.m(linkedList2, d17, "", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "refreshFirstPage: store unread feed, id=".concat(pm0.v.u(c19792x256d27252.m76784x5db1b11())));
            f0Var4 = f0Var3;
        }
        if (f0Var4 != null) {
            return f0Var3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "refreshFirstPage: error, feed is null, size=" + arrayList.size());
        return f0Var3;
    }
}
