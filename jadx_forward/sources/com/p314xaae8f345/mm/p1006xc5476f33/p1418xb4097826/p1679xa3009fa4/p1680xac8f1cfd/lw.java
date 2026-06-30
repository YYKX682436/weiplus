package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes14.dex */
public final class lw implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx f216627a;

    public lw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar) {
        this.f216627a = sxVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play new fail ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f84020c) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderProjectionScreenUIC", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar = this.f216627a;
        android.os.Message mo50289x733c63a2 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) sxVar.f217473v).mo141623x754a37bb()).mo50289x733c63a2(7);
        mo50289x733c63a2.arg1 = eVar != null ? eVar.f84020c : 0;
        mo50289x733c63a2.sendToTarget();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx.P6(sxVar, false);
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProjectionScreenUIC", "play new success");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar = this.f216627a;
        x91.h hVar = sxVar.f217474w;
        if (hVar != null) {
            hVar.f534184e.f534196a = x91.j.Playing;
        }
        if (hVar != null) {
            hVar.f();
        }
        x91.h hVar2 = sxVar.f217474w;
        if (hVar2 != null) {
            hVar2.g();
        }
        x91.h hVar3 = sxVar.f217474w;
        if (hVar3 != null) {
            hVar3.f534187h = (x91.i) ((jz5.n) sxVar.f217457J).mo141623x754a37bb();
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ww(sxVar.f217474w, sxVar));
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) sxVar.M).mo141623x754a37bb()).d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx.P6(sxVar, true);
    }
}
