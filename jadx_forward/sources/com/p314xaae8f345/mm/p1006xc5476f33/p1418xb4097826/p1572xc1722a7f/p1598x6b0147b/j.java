package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b;

/* loaded from: classes2.dex */
public final class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 implements im5.b, db2.u3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.f f203736d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.m0 f203737e;

    /* renamed from: f, reason: collision with root package name */
    public fp0.t f203738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14575x3ee3558d f203739g;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14575x3ee3558d c14575x3ee3558d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.f streamFetcher, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.m0 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamFetcher, "streamFetcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f203739g = c14575x3ee3558d;
        this.f203736d = streamFetcher;
        this.f203737e = scene;
    }

    @Override // db2.u3
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: alive */
    public void mo56311x58998cd() {
        super.mo56311x58998cd();
        if (this.f203737e == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.m0.f189550g) {
            fp0.t tVar = (fp0.t) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).T).mo141623x754a37bb();
            this.f203738f = tVar;
            if (tVar != null) {
                tVar.d();
                return;
            }
            return;
        }
        fp0.t tVar2 = new fp0.t("SingleExecutor#TabType=" + this.f203736d.f203721g);
        tVar2.e();
        this.f203738f = tVar2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: dead */
    public void mo56312x2efc64() {
        super.mo56312x2efc64();
        fp0.t tVar = this.f203738f;
        if (tVar != null) {
            tVar.mo129985x6761d4f();
        }
        this.f203738f = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetch */
    public void mo56275x5cd06ba(java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.k) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            fp0.t tVar = this.f203738f;
            if (tVar != null) {
                tVar.b(new fp0.r(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.i(this, obj, uptimeMillis, callback, this.f203739g), null, 2, null));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchInit */
    public void mo56023xb639f2ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        java.util.Iterator it;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        pf5.u uVar = pf5.u.f435469a;
        ey2.c3 c3Var = (ey2.c3) uVar.e(c61.l7.class).a(ey2.c3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.m0 m0Var = this.f203737e;
        ey2.x2 O6 = c3Var.O6(m0Var.f189567d);
        boolean isEmpty = O6.f339102b.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14575x3ee3558d c14575x3ee3558d = this.f203739g;
        if (isEmpty) {
            java.util.List i17 = bu2.d0.i(bu2.e0.f106031a, c14575x3ee3558d.mo55586xaf11af30(), null, 2, null);
            java.util.Iterator it6 = i17.iterator();
            while (it6.hasNext()) {
                so2.j5 j5Var = (so2.j5) it6.next();
                if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    r45.qt2 m56354xfe9224be = c14575x3ee3558d.m56354xfe9224be();
                    if (m56354xfe9224be != null) {
                        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        it = it6;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().getFeedObject(), m56354xfe9224be.m75939xb282bd08(5), null);
                    } else {
                        it = it6;
                    }
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59243x428f8d2()) {
                        i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18).rk(abstractC14490x69736cb5.getFeedObject().getFeedObject(), 14, null);
                    }
                } else {
                    it = it6;
                }
                it6 = it;
            }
            r45.qt2 m56354xfe9224be2 = c14575x3ee3558d.m56354xfe9224be();
            if (m56354xfe9224be2 != null) {
                bu2.j jVar = bu2.j.f106067a;
                int m75939xb282bd08 = m56354xfe9224be2.m75939xb282bd08(5);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : i17) {
                    if (((so2.j5) obj) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    so2.j5 j5Var2 = (so2.j5) it7.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j5Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                    arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2).getFeedObject().getFeedObject());
                }
                jVar.a(m75939xb282bd08, arrayList2);
            }
            linkedList.addAll(i17);
            r45.qt2 m56354xfe9224be3 = c14575x3ee3558d.m56354xfe9224be();
            if (m56354xfe9224be3 != null) {
                ((ey2.i2) uVar.e(c61.l7.class).a(ey2.i2.class)).N6(m56354xfe9224be3.m75939xb282bd08(5), hc2.f0.d(linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class));
            }
        } else {
            linkedList.addAll(O6.f339102b);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.f fVar = this.f203736d;
        int i18 = fVar.f203721g;
        int i19 = !linkedList.isEmpty() ? 1 : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r1 e17 = v1Var.e(i18);
        if (e17 != null) {
            e17.V = i19;
        }
        so2.j5 j5Var3 = (so2.j5) kz5.n0.Z(linkedList);
        java.lang.String m56464xb5886c64 = m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchInit tabType=");
        sb6.append(fVar.f203721g);
        sb6.append(" callInitData scene=");
        sb6.append(m0Var);
        sb6.append(", contextObj=");
        sb6.append(c14575x3ee3558d.m56354xfe9224be() == null);
        sb6.append(" list first=");
        sb6.append(j5Var3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var3).getFeedObject().m59273x80025a04() : "");
        sb6.append(" => ");
        so2.j5 j5Var4 = (so2.j5) kz5.n0.Z(linkedList);
        sb6.append(pm0.v.u(j5Var4 != null ? j5Var4.mo2128x1ed62e84() : 0L));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.l(0, 0, "", null, 8, null);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : linkedList) {
            so2.j5 j5Var5 = (so2.j5) obj2;
            if (j5Var5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? hc2.o0.C(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var5).getFeedObject().getFeedObject()) : true) {
                arrayList3.add(obj2);
            }
        }
        lVar.m56420x2a5f836b(arrayList3);
        lVar.m56423xd4b4a5a1(1000);
        callback.mo55587xb461ee3d(lVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchLoadMore */
    public void mo56024xaef8a235(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        mo56275x5cd06ba(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.k(2, null, 2, null), callback, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchRefresh */
    public void mo56025xae25fec1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14575x3ee3558d c14575x3ee3558d = this.f203739g;
        int i17 = c14575x3ee3558d.f203700e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.k(i17, null, 2, null);
        kVar.f203740a = i17;
        if (i17 == 0) {
            c14575x3ee3558d.f203700e = 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "[requestRefresh] pullType=" + kVar.f203740a + "  hasPrefetch=false needToRefreshForPrefetch=false");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0.m56461x34ddd257(this, kVar, callback, false, 4, null);
    }

    @Override // im5.b
    /* renamed from: keep */
    public void mo46316x322b85(im5.a aVar) {
    }
}
