package hc2;

/* loaded from: classes2.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f361874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f361875e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i17, r45.qt2 qt2Var) {
        super(0);
        this.f361874d = i17;
        this.f361875e = qt2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.qt2 qt2Var;
        java.util.List i17 = bu2.d0.i(bu2.e0.f106031a, this.f361874d, null, 2, null);
        java.util.Iterator it = i17.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            qt2Var = this.f361875e;
            if (!hasNext) {
                break;
            }
            so2.j5 j5Var = (so2.j5) it.next();
            if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                if (qt2Var != null) {
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().getFeedObject(), qt2Var.m75939xb282bd08(5), null);
                }
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59243x428f8d2()) {
                    i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18).rk(abstractC14490x69736cb5.getFeedObject().getFeedObject(), 14, null);
                }
            }
        }
        if (qt2Var != null) {
            bu2.j jVar = bu2.j.f106067a;
            int m75939xb282bd08 = qt2Var.m75939xb282bd08(5);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : i17) {
                if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) it6.next()).getFeedObject().getFeedObject());
            }
            jVar.a(m75939xb282bd08, arrayList2);
        }
        return i17;
    }
}
