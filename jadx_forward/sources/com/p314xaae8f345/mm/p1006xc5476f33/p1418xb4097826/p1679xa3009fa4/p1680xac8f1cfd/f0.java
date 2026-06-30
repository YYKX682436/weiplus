package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f215843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa f215844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n0 f215845f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f215843d = z17;
        this.f215844e = c13924x37151faa;
        this.f215845f = n0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f0(this.f215843d, this.f215844e, this.f215845f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        f0Var.mo150x989b7ca4(f0Var2);
        return f0Var2;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f215843d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n0 n0Var = this.f215845f;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa = this.f215844e;
            java.util.List m56409x97891cf7 = c13924x37151faa.m56409x97891cf7();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m56409x97891cf7, "null cannot be cast to non-null type kotlin.collections.List<out com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListItem>");
            if (m56409x97891cf7.isEmpty()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n0.f216759s;
                n0Var.R6(true, false, false);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n0.f216759s;
                n0Var.m63188x96811f7a().m82914x4c6bcf83().f411726c = false;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa = n0Var.m63188x96811f7a().m62367x4905e9fa();
                if (m62367x4905e9fa != null && (mo7946xf939df19 = m62367x4905e9fa.mo7946xf939df19()) != null) {
                    java.util.Iterator it = m56409x97891cf7.iterator();
                    boolean z18 = false;
                    int i17 = 0;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        java.util.ArrayList arrayList = n0Var.f216767n;
                        if (hasNext) {
                            java.lang.Object next = it.next();
                            int i18 = i17 + 1;
                            if (i17 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t) next;
                            if (i17 == 0) {
                                z18 = true;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t tVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t) kz5.n0.a0(arrayList, i17);
                            if (!(tVar2 != null && tVar2.mo2128x1ed62e84() == tVar.mo2128x1ed62e84())) {
                                z18 = false;
                            }
                            ya2.h.f542017a.j(tVar.f217481d);
                            i17 = i18;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountRecommendListUIC", "finderUsername=" + n0Var.P6() + " isSameFirstPage=" + z18);
                            if (!z18) {
                                arrayList.clear();
                                arrayList.addAll(m56409x97891cf7);
                                mo7946xf939df19.m8146xced61ae5();
                            }
                        }
                    }
                }
                n0Var.R6(true, true, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n0.f216759s.put(n0Var.P6(), m56409x97891cf7);
            if (c13924x37151faa.getHasMore()) {
                n0Var.m63188x96811f7a().i(true);
            } else {
                n0Var.m63188x96811f7a().k();
            }
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n0.f216759s;
            n0Var.R6(false, true, false);
            n0Var.m63188x96811f7a().i(false);
        }
        return jz5.f0.f384359a;
    }
}
