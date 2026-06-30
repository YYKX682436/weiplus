package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class r1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final jv2.d f211927d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f211928e;

    public r1(jv2.d commentItem, int i17, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItem, "commentItem");
        this.f211927d = commentItem;
        this.f211928e = lVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        jv2.a aVar;
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            jv2.d dVar = this.f211927d;
            if (itemId == 0) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.f383740d.j())) {
                    return;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(dVar.f383740d.j());
                dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f571894st, 0).show();
                return;
            }
            if (itemId == 1) {
                yz5.l lVar = this.f211928e;
                if (lVar != null) {
                    lVar.mo146xb9724478(dVar);
                    return;
                }
                return;
            }
            if (itemId == 2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "getContext(...)");
                jv2.a aVar2 = dVar.f383740d;
                long j17 = aVar2.f67478xf9a02e3e;
                aVar2.t0();
                return;
            }
            if (itemId != 3) {
                if (itemId == 999) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e((dVar == null || (aVar = dVar.f383740d) == null) ? null : aVar.m141444x9616526c());
                    return;
                }
                return;
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.y yVar = hb2.y.f361647e;
            long mo2128x1ed62e84 = dVar.mo2128x1ed62e84();
            jv2.a aVar3 = dVar.f383740d;
            long j18 = aVar3.f67478xf9a02e3e;
            java.lang.String str = aVar3.f67481x2812d6a6;
            if (str == null) {
                str = "";
            }
            yVar.o(mo2128x1ed62e84, j18, str, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q1());
        }
    }
}
