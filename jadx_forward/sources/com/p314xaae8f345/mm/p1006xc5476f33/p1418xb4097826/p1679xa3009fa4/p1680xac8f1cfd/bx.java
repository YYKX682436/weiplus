package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes14.dex */
public final class bx implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx f215466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f215467b;

    public bx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar, java.lang.String str) {
        this.f215466a = sxVar;
        this.f215467b = str;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop fail before play new ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f84020c) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderProjectionScreenUIC", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx.O6(this.f215466a, this.f215467b, "StopFail");
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx.O6(this.f215466a, this.f215467b, "StopSuccess");
    }
}
