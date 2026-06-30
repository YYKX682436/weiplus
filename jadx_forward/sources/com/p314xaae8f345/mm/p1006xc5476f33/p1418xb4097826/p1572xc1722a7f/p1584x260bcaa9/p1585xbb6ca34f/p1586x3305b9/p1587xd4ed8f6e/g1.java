package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class g1 extends sp2.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp2.o f203216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ up2.f f203217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f203218c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1 f203219d;

    public g1(vp2.o oVar, up2.f fVar, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1 p1Var) {
        this.f203216a = oVar;
        this.f203217b = fVar;
        this.f203218c = z17;
        this.f203219d = p1Var;
    }

    @Override // sp2.a4, sp2.b4
    public void e(int i17, java.util.List cards) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079;
        so2.j5 j5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cards, "cards");
        vp2.o oVar = this.f203216a;
        if (i17 != oVar.f520480d.f455658d) {
            return;
        }
        java.util.ArrayList feeds = oVar.f520481e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feeds, "feeds");
        up2.f adapter = this.f203217b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        so2.j5 j5Var2 = (so2.j5) kz5.n0.k0(feeds);
        if (j5Var2 != null && (j5Var2 instanceof vp2.c0)) {
            kz5.h0.E(feeds);
            adapter.m8155x27702c4(feeds.size());
        }
        oVar.f520480d.f455662h.addAll(cards);
        java.util.Iterator it = cards.iterator();
        while (it.hasNext()) {
            r45.ea2 ea2Var = (r45.ea2) it.next();
            int m75939xb282bd08 = ea2Var.m75939xb282bd08(1);
            boolean z17 = this.f203218c;
            if (m75939xb282bd08 == 10) {
                r45.oa2 oa2Var = (r45.oa2) ea2Var.m75936x14adae67(4);
                if (oa2Var != null) {
                    java.util.ArrayList arrayList = oVar.f520481e;
                    vp2.l lVar = new vp2.l(oa2Var, oVar.f520480d, ea2Var);
                    lVar.f520472h = z17;
                    arrayList.add(lVar);
                }
            } else {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2);
                if (c19792x256d2725 != null && (c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) kz5.n0.Z(cu2.u.f303974a.j(kz5.b0.c(c19792x256d2725), hc2.d0.d(0), this.f203219d.f203409n))) != null) {
                    java.util.ArrayList arrayList2 = oVar.f520481e;
                    if (ea2Var.m75939xb282bd08(1) == 14) {
                        j5Var = new vp2.m(c14994x9b99c079);
                    } else {
                        vp2.n nVar = new vp2.n(c14994x9b99c079, oVar.f520480d);
                        nVar.f520479f = z17;
                        j5Var = nVar;
                    }
                    arrayList2.add(j5Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HeadLivingListConvert", "#caller.append nickname=" + c14994x9b99c079.m59273x80025a04() + ", style=" + ea2Var.m75939xb282bd08(1));
                }
            }
            adapter.m8149x8b456734(oVar.f520481e.size() - 1);
        }
        java.util.ArrayList feeds2 = oVar.f520481e;
        int i18 = oVar.f520480d.f455663i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feeds2, "feeds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        if (i18 > 0 && !(!kz5.j0.I(feeds2, vp2.c0.class).isEmpty())) {
            feeds2.add(new vp2.c0());
            adapter.m8149x8b456734(feeds2.size() - 1);
        }
    }
}
