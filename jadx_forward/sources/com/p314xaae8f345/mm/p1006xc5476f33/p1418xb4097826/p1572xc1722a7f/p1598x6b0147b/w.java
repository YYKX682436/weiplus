package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b;

/* loaded from: classes2.dex */
public final class w extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.d0 f203758a;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.d0 d0Var) {
        this.f203758a = d0Var;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyVideoViewCallback", "onExposeTimeRecorded: size = " + recordsSet.size());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = recordsSet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.d0 d0Var = this.f203758a;
            if (!hasNext) {
                rq2.v.f480424a.g(d0Var.f203710f.mo58499x8fadefe3(), linkedList);
                so2.h3.f491925d.d(linkedList);
                return;
            }
            in5.j jVar = (in5.j) it.next();
            in5.c cVar = jVar.f374603a;
            boolean z17 = cVar instanceof so2.h1;
            in5.c cVar2 = jVar.f374603a;
            if (z17) {
                ml2.d dVar = new ml2.d();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedLive");
                so2.h1 h1Var = (so2.h1) cVar2;
                int i17 = jVar.f374607e;
                ml2.x1 x1Var = ml2.x1.f409735f;
                ml2.q1 q1Var = ml2.q1.f409345e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba3301 = d0Var.f203709e;
                if (abstractC14499x6ba3301 == null || (str = abstractC14499x6ba3301.s0()) == null) {
                    str = "";
                }
                dVar.h(h1Var, i17, x1Var, "temp_32", str, d0Var.f203714m.a(jVar.f374607e, jVar.f374608f, "onExpose"));
            } else if (cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                r45.ni4 ni4Var = new r45.ni4();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar2;
                ni4Var.set(0, java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
                so2.h3.f491925d.f(ni4Var, d0Var.f203710f.mo58499x8fadefe3(), -1);
                ni4Var.set(5, java.lang.Integer.valueOf((int) jVar.f374606d));
                ni4Var.set(4, abstractC14490x69736cb5.g0());
                linkedList.add(ni4Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyVideoViewCallback", "onExposeTimeRecorded pos:" + jVar.f374607e + " exposeTime:" + jVar.f374606d + " nick:" + abstractC14490x69736cb5.getFeedObject().getFeedObject().m76801x8010e5e4() + ", feedId=" + pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
            }
            d0Var.f203716o.c(jVar, d0Var.a());
        }
    }

    @Override // in5.p
    public void d(in5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        in5.c cVar = item.f374603a;
        boolean z17 = cVar instanceof so2.u1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.d0 d0Var = this.f203758a;
        if (z17) {
            r45.ni4 ni4Var = new r45.ni4();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedVideo");
            so2.u1 u1Var = (so2.u1) cVar;
            ni4Var.set(0, java.lang.Long.valueOf(u1Var.mo2128x1ed62e84()));
            ni4Var.set(5, java.lang.Integer.valueOf((int) item.f374604b));
            so2.h3.f491925d.f(ni4Var, d0Var.f203710f.mo58499x8fadefe3(), -1);
            ((java.util.LinkedList) rq2.v.f480424a.a(d0Var.f203710f.mo58499x8fadefe3())).add(ni4Var);
            ni4Var.m75942xfb822ef2(0);
            u1Var.getFeedObject().getFeedObject().m76801x8010e5e4();
        } else if (cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar;
            d0Var.a().m75939xb282bd08(5);
            abstractC14490x69736cb5.getFeedObject().getFeedObject().m76801x8010e5e4();
            pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84());
            r45.ni4 ni4Var2 = new r45.ni4();
            ni4Var2.set(0, java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
            ni4Var2.set(6, java.lang.Integer.valueOf(item.f374607e));
            ni4Var2.set(4, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(abstractC14490x69736cb5.mo2128x1ed62e84(), abstractC14490x69736cb5.w(), d0Var.a().m75939xb282bd08(5)));
            ni4Var2.set(11, 1);
            so2.h3 h3Var = so2.h3.f491925d;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(ni4Var2);
            h3Var.d(linkedList);
        }
        d0Var.f203716o.d(item, d0Var.a());
    }
}
