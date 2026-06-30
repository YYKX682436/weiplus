package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class op implements ek2.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp f200844a;

    public op(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp ppVar) {
        this.f200844a = ppVar;
    }

    @Override // ek2.n0
    public void a(int i17, int i18, java.lang.String str, r45.o71 resp) {
        java.lang.Object obj;
        java.lang.Object obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicRecommAnchorsCardPanelWidget", "doGetMicCandidateList resp.contacts:" + resp.m75941xfb821914(1).size());
        this.f200844a.f200934g.clear();
        if (resp.m75941xfb821914(1) != null) {
            java.util.ArrayList arrayList = this.f200844a.f200934g;
            java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getContacts(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp ppVar = this.f200844a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                java.lang.Object obj3 = null;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.xn1 xn1Var = (r45.xn1) next;
                java.util.List list = ((mm2.o4) ppVar.f200928a.a(mm2.o4.class)).f410857s;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-anchorPkMicUserList>(...)");
                synchronized (list) {
                    java.util.Iterator it6 = list.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        java.lang.Object next2 = it6.next();
                        java.lang.String str2 = ((km2.q) next2).f390705c;
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null)) {
                            obj3 = next2;
                            break;
                        }
                    }
                }
                if (obj3 == null) {
                    arrayList2.add(next);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp ppVar2 = this.f200844a;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj4 : arrayList2) {
                r45.xn1 xn1Var2 = (r45.xn1) obj4;
                java.util.List list2 = ((mm2.o4) ppVar2.f200928a.a(mm2.o4.class)).f410851o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-linkMicUserList>(...)");
                synchronized (list2) {
                    java.util.Iterator it7 = list2.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it7.next();
                        java.lang.String str3 = ((km2.q) obj2).f390705c;
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76197x6c03c64c() : null)) {
                            break;
                        }
                    }
                }
                if (obj2 == null) {
                    arrayList3.add(obj4);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp ppVar3 = this.f200844a;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj5 : arrayList3) {
                r45.xn1 xn1Var3 = (r45.xn1) obj5;
                java.util.List list3 = ((mm2.o4) ppVar3.f200928a.a(mm2.o4.class)).f410852p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list3, "<get-recomApplylinkMicUserList>(...)");
                synchronized (list3) {
                    java.util.Iterator it8 = list3.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it8.next();
                        java.lang.String str4 = ((km2.q) obj).f390705c;
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var3.m75936x14adae67(0);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, c19782x23db1cfa3 != null ? c19782x23db1cfa3.m76197x6c03c64c() : null)) {
                            break;
                        }
                    }
                }
                if (!(((km2.q) obj) != null ? r7.m() : false)) {
                    arrayList4.add(obj5);
                }
            }
            arrayList.addAll(arrayList4);
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.np(this.f200844a));
        }
    }
}
