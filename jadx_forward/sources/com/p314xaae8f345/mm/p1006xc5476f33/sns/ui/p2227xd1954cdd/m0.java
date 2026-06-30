package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd;

/* loaded from: classes4.dex */
public final class m0 extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f252937d;

    /* renamed from: e, reason: collision with root package name */
    public long f252938e = -1;

    public m0(int i17) {
        this.f252937d = i17;
    }

    @Override // ym3.a, ym3.f
    public /* bridge */ /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i iVar, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getData", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j a17 = a(iVar, (ym3.c) obj);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getData", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource");
        return a17;
    }

    @Override // ym3.a
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getData", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        java.lang.Object obj = request.f544679d;
        if (!(obj instanceof java.lang.Long)) {
            p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
            v65.i.b(scope, null, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.j0(request, this, b17, null), 1, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getData", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource");
            return b17;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((java.lang.Long) obj).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildDBCacheResponse", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource");
        ym3.d dVar = new ym3.d(request);
        dVar.f544681b = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s2 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Qj().y0(longValue);
        byte[] bArr = y07 != null ? y07.f69423x99016a0b : null;
        if (bArr != null) {
            try {
                if (!(bArr.length == 0)) {
                    r45.qb6 qb6Var = new r45.qb6();
                    qb6Var.mo11468x92b714fd(bArr);
                    synchronized (jm0.k.f381803i) {
                        gm0.j1.b().c();
                        if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                            throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                        }
                        a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
                    }
                    zc4.g gVar = (zc4.g) ((zc4.h) a17).P6(zc4.g.class);
                    java.util.LinkedList snsIds = qb6Var.f465343d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snsIds, "snsIds");
                    for (java.lang.Long l17 : kz5.n0.K0(snsIds, java.lang.Math.min(this.f252937d, qb6Var.f465343d.size()))) {
                        if (l17 != null && longValue == l17.longValue()) {
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
                        xc4.p Y6 = gVar.Y6(l17.longValue());
                        if (Y6 != null) {
                            dVar.f544682c.add(new zc4.b(Y6, false));
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsWsFoldDataUIC", "parse SnsWsGroupStruct fail:%s", e17.getMessage());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldDataUIC", "load db count:" + dVar.f544682c.size() + " id:" + kz5.n0.g0(dVar.f544682c, ";", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.i0.f252921d, 30, null));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildDBCacheResponse", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b18 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        v65.i.b(scope, null, new xm3.q0(b18, dVar, null), 1, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getData", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource");
        return b18;
    }
}
