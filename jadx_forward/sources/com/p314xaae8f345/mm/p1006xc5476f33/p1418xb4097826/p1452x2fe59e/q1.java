package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class q1 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f190320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f190321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f190322c;

    public q1(r45.qt2 qt2Var, yz5.l lVar, yz5.l lVar2) {
        this.f190320a = qt2Var;
        this.f190321b = lVar;
        this.f190322c = lVar2;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onExposeTimeRecorded: size = ");
        sb6.append(recordsSet.size());
        sb6.append(", commentScene=");
        r45.qt2 qt2Var = this.f190320a;
        sb6.append(qt2Var.m75939xb282bd08(5));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseGridFeedUIContract.ViewCallback", sb6.toString());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = recordsSet.iterator();
        while (it.hasNext()) {
            in5.j jVar = (in5.j) it.next();
            if (jVar.f374603a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                r45.ni4 ni4Var = new r45.ni4();
                in5.c cVar = jVar.f374603a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar;
                linkedList2.add(abstractC14490x69736cb5);
                ni4Var.set(0, java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
                ni4Var.set(15, abstractC14490x69736cb5.w());
                ni4Var.set(6, java.lang.Integer.valueOf(jVar.f374607e));
                so2.h3.f491925d.f(ni4Var, qt2Var.m75939xb282bd08(5), qt2Var.m75939xb282bd08(7));
                ni4Var.set(5, java.lang.Integer.valueOf((int) jVar.f374606d));
                ni4Var.set(4, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(abstractC14490x69736cb5.mo2128x1ed62e84(), abstractC14490x69736cb5.w(), qt2Var.m75939xb282bd08(5)));
                linkedList.add(ni4Var);
                yz5.l lVar = this.f190321b;
                if (lVar != null) {
                    lVar.mo146xb9724478(jVar);
                }
                qt2Var.m75939xb282bd08(5);
                abstractC14490x69736cb5.getFeedObject().getFeedObject().m76801x8010e5e4();
                pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84());
            }
        }
        so2.h3.f491925d.e(linkedList, linkedList2, qt2Var, -1);
    }

    @Override // in5.p
    public void d(in5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        in5.c cVar = item.f374603a;
        if (cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar;
            r45.qt2 qt2Var = this.f190320a;
            qt2Var.m75939xb282bd08(5);
            abstractC14490x69736cb5.getFeedObject().getFeedObject().m76801x8010e5e4();
            pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84());
            r45.ni4 ni4Var = new r45.ni4();
            ni4Var.set(0, java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
            ni4Var.set(15, abstractC14490x69736cb5.w());
            ni4Var.set(6, java.lang.Integer.valueOf(item.f374607e));
            ni4Var.set(4, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(abstractC14490x69736cb5.mo2128x1ed62e84(), abstractC14490x69736cb5.w(), qt2Var.m75939xb282bd08(5)));
            ni4Var.set(11, 1);
            yz5.l lVar = this.f190322c;
            if (lVar != null) {
                lVar.mo146xb9724478(item);
            }
            so2.h3 h3Var = so2.h3.f491925d;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(ni4Var);
            h3Var.d(linkedList);
        }
    }
}
