package cp2;

/* loaded from: classes2.dex */
public final class h implements cp2.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp2.k f302343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc f302344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 f302345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fp0.r f302346g;

    public h(cp2.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var, fp0.r rVar) {
        this.f302343d = kVar;
        this.f302344e = c14500x958689dc;
        this.f302345f = n0Var;
        this.f302346g = rVar;
    }

    @Override // cp2.e
    public void a(cp2.m response, cp2.l request) {
        r45.qt2 m56354xfe9224be;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        cp2.k kVar = this.f302343d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.m56464xb5886c64(), "[call] onFetchDone... pullType: " + response.getPullType() + "  hasMore: " + response.getHasMore() + "list: " + hc2.o0.p(response.m56409x97891cf7()) + "lastBuffer: " + response.getLastBuffer() + "refresh_interval: " + response.getRefreshInterval());
        java.util.List m56409x97891cf7 = response.m56409x97891cf7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = this.f302344e;
        if (m56409x97891cf7 != null && ((so2.j5) kz5.n0.Z(c14500x958689dc.m56388xcaeb60d0())) == null && (!m56409x97891cf7.isEmpty()) && c14500x958689dc.f202997e == 1001) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(m56409x97891cf7);
            response.m56420x2a5f836b(linkedList);
        }
        c14500x958689dc.f203006q = response.getLastBuffer();
        response.m56425xf28d7bcd(request);
        java.util.List<so2.j5> m56409x97891cf72 = response.m56409x97891cf7();
        if (m56409x97891cf72 != null) {
            for (so2.j5 j5Var : m56409x97891cf72) {
                if ((j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && (m56354xfe9224be = c14500x958689dc.m56354xfe9224be()) != null) {
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().getFeedObject(), m56354xfe9224be.m75939xb282bd08(5), null);
                }
            }
        }
        if (response.getPullType() != 2) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.List<so2.j5> m56409x97891cf73 = response.m56409x97891cf7();
            if (m56409x97891cf73 != null) {
                for (so2.j5 j5Var2 : m56409x97891cf73) {
                    if (j5Var2 instanceof so2.h1) {
                        linkedList2.add(new bu2.k0(j5Var2.h(), j5Var2.mo2128x1ed62e84(), ((so2.h1) j5Var2).getFeedObject().getFeedObject(), hc2.d0.d(c14500x958689dc.f203004o), false, 16, null));
                    } else if (j5Var2 instanceof so2.k1) {
                        j5Var2.h();
                        j5Var2.mo2128x1ed62e84();
                        throw null;
                    }
                }
            }
            if (linkedList2.size() > 0) {
                bu2.e0.f106031a.a(c14500x958689dc.f203005p, xy2.c.f(c14500x958689dc.m56354xfe9224be()), linkedList2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.m56464xb5886c64(), "cache FinderPage size: " + linkedList2.size());
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        this.f302345f.mo55587xb461ee3d(response);
        this.f302346g.b(fp0.u.f346823f);
    }
}
