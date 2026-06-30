package cq2;

/* loaded from: classes2.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f302917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f302918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f302919f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.fa2 f302920g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ aq2.k f302921h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.fa2 fa2Var, aq2.k kVar) {
        super(0);
        this.f302917d = i17;
        this.f302918e = i18;
        this.f302919f = gVar;
        this.f302920g = fa2Var;
        this.f302921h = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        r45.dk2 dk2Var;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.LinkedList linkedList;
        r45.na2 na2Var;
        r45.dd2 dd2Var;
        int i18 = this.f302917d;
        int i19 = this.f302918e;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f302919f;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        r45.u80 u80Var = new r45.u80();
        u80Var.set(0, java.lang.Integer.valueOf(this.f302918e));
        r45.fa2 fa2Var = this.f302920g;
        u80Var.set(1, fa2Var.f455665n);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList card_list = fa2Var.f455662h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_list, "card_list");
        java.util.Iterator it = card_list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.ea2) it.next()).m75936x14adae67(2);
            if (c19792x256d2725 != null && c19792x256d2725.m76784x5db1b11() != 0) {
                arrayList.add(java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()));
            }
        }
        u80Var.m75941xfb821914(2).addAll(arrayList);
        u80Var.set(3, java.lang.Integer.valueOf(card_list.size()));
        linkedList2.add(u80Var);
        r45.dd2 dd2Var2 = new r45.dd2();
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) this.f302921h.f117894b;
        if (fVar != null && (dk2Var = (r45.dk2) fVar.f152151d) != null && (m75941xfb821914 = dk2Var.m75941xfb821914(1)) != null) {
            java.util.Iterator it6 = m75941xfb821914.iterator();
            while (true) {
                obj = null;
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it6.next();
                if (((r45.fa2) obj2).f455659e == 12) {
                    break;
                }
            }
            r45.fa2 fa2Var2 = (r45.fa2) obj2;
            if (fa2Var2 != null && (linkedList = fa2Var2.f455662h) != null) {
                java.util.Iterator it7 = linkedList.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it7.next();
                    if (((r45.ea2) next).m75939xb282bd08(1) == 7) {
                        obj = next;
                        break;
                    }
                }
                r45.ea2 ea2Var = (r45.ea2) obj;
                if (ea2Var != null && (na2Var = (r45.na2) ea2Var.m75936x14adae67(6)) != null && (dd2Var = (r45.dd2) na2Var.m75936x14adae67(0)) != null) {
                    i17 = dd2Var.m75939xb282bd08(0);
                    dd2Var2.set(0, java.lang.Integer.valueOf(i17));
                    aq2.a aVar = new aq2.a(i18, i19, gVar, "", linkedList2, 135, 0L, null, dd2Var2, 0, 0.0f, false, null, null, null, false, null, 130624, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewSquarePreloadUtil", "checkEnterLoadMore: req=" + aVar);
                    return new aq2.c(aVar, null, null, 2, null);
                }
            }
        }
        i17 = 0;
        dd2Var2.set(0, java.lang.Integer.valueOf(i17));
        aq2.a aVar2 = new aq2.a(i18, i19, gVar, "", linkedList2, 135, 0L, null, dd2Var2, 0, 0.0f, false, null, null, null, false, null, 130624, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewSquarePreloadUtil", "checkEnterLoadMore: req=" + aVar2);
        return new aq2.c(aVar2, null, null, 2, null);
    }
}
