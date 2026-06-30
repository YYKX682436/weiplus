package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes14.dex */
public final class lx implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx f216628a;

    public lx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar) {
        this.f216628a = sxVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop fail ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f84020c) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderProjectionScreenUIC", sb6.toString());
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.kx(this.f216628a));
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProjectionScreenUIC", "stop success");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar = this.f216628a;
        x91.h hVar = sxVar.f217474w;
        if (hVar != null) {
            hVar.f534184e.f534196a = x91.j.Stopped;
        }
        if (hVar != null) {
            hVar.h();
        }
        x91.h hVar2 = sxVar.f217474w;
        if (hVar2 != null) {
            hVar2.i();
        }
        x91.h hVar3 = sxVar.f217474w;
        if (hVar3 != null) {
            hVar3.f534187h = null;
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vw(hVar3, sxVar, true));
        sxVar.f217474w = null;
        sxVar.f217475x = 0L;
    }
}
