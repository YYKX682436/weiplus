package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class xi extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yi f192604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yi yiVar) {
        super(1);
        this.f192604d = yiVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zi ziVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa resp = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchEndCallback called, data size: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yi yiVar = this.f192604d;
        sb6.append(yiVar.f192705d.m56388xcaeb60d0().size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReservedNoticeListContract", sb6.toString());
        resp.getHasMore();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = yiVar.f192705d;
        java.util.Iterator it = abstractC13919x46aff122.m56388xcaeb60d0().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReservedNoticeListContract", "Data[" + i17 + "]: " + ((so2.j5) next).getClass().getSimpleName());
            i17 = i18;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = yiVar.f192707f;
        if ((c22848x6ddd90cf != null && c22848x6ddd90cf.x() == 0) && abstractC13919x46aff122.m56388xcaeb60d0().size() == 0 && (ziVar = yiVar.f192706e) != null) {
            ziVar.f192804g.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = yiVar.f192707f;
        if (c22848x6ddd90cf2 != null) {
            c22848x6ddd90cf2.m8146xced61ae5();
        }
        return jz5.f0.f384359a;
    }
}
