package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes2.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c f210689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.g0 f210690e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c c13877xf5f46f3c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.g0 g0Var) {
        super(1);
        this.f210689d = c13877xf5f46f3c;
        this.f210690e = g0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa resp = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c c13877xf5f46f3c = this.f210689d;
        java.lang.String f204960d = c13877xf5f46f3c.getF204960d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GlobalMixFavPresenter fetch End,resp incrementList size=");
        java.util.List m56409x97891cf7 = resp.m56409x97891cf7();
        sb6.append(m56409x97891cf7 != null ? java.lang.Integer.valueOf(m56409x97891cf7.size()) : null);
        sb6.append(" id=");
        java.util.List m56409x97891cf72 = resp.m56409x97891cf7();
        if (m56409x97891cf72 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(m56409x97891cf72, 10));
            java.util.Iterator it = m56409x97891cf72.iterator();
            while (it.hasNext()) {
                arrayList.add(pm0.v.u(((so2.j5) it.next()).mo2128x1ed62e84()));
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        sb6.append(";loader dataList=");
        sb6.append(c13877xf5f46f3c.m56387xe6796cde().hashCode());
        sb6.append(",size=");
        sb6.append(c13877xf5f46f3c.m56387xe6796cde().size());
        sb6.append(";presenter dataList(");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.g0 g0Var = this.f210690e;
        sb6.append(g0Var.c().hashCode());
        sb6.append(") size=");
        sb6.append(g0Var.c().size());
        sb6.append(",dataList=");
        java.util.ArrayList c17 = g0Var.c();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(c17, 10));
        java.util.Iterator it6 = c17.iterator();
        while (it6.hasNext()) {
            arrayList2.add(pm0.v.u(((so2.j5) it6.next()).mo2128x1ed62e84()));
        }
        sb6.append(arrayList2);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f204960d, sb6.toString());
        if ((resp instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.a5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.a5) resp : null) != null) {
            g0Var.f().e().E(!resp.getHasMore());
            g0Var.f().f();
            if (g0Var.c().isEmpty()) {
                g0Var.f().k();
            }
        }
        return jz5.f0.f384359a;
    }
}
