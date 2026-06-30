package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class d30 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa f188076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13820xb0e90389 f188077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d30(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13820xb0e90389 c13820xb0e90389) {
        super(0);
        this.f188076d = c13924x37151faa;
        this.f188077e = c13820xb0e90389;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa = this.f188076d;
        if (c13924x37151faa.getPullType() == 0) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.List<so2.j5> m56409x97891cf7 = c13924x37151faa.m56409x97891cf7();
            if (m56409x97891cf7 != null) {
                for (so2.j5 j5Var : m56409x97891cf7) {
                    if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5) {
                        linkedList.add(new bu2.o0(73729, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5) j5Var).f189325d));
                    }
                }
                boolean z17 = true;
                if (!linkedList.isEmpty()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13820xb0e90389 c13820xb0e90389 = this.f188077e;
                    java.lang.String f204960d = c13820xb0e90389.getF204960d();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[saveData] infoList.size=");
                    sb6.append(m56409x97891cf7.size());
                    sb6.append(", firstPage.size=");
                    sb6.append(linkedList.size());
                    sb6.append(" nextPageBuffer ");
                    eb2.e0 e0Var = c13820xb0e90389.f187698d;
                    sb6.append(e0Var.f332269e);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f204960d, sb6.toString());
                    bu2.e0.f106031a.a(37, xy2.c.f(c13820xb0e90389.m56354xfe9224be()), linkedList);
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 c18 = hc2.d0.c(c13820xb0e90389.f187699e);
                    java.lang.String str = e0Var.f332269e;
                    if (str != null && str.length() != 0) {
                        z17 = false;
                    }
                    c17.x(c18, z17 ? null : e0Var.f332269e);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
