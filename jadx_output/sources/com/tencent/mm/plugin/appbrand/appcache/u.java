package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class u extends com.tencent.mm.plugin.appbrand.networking.d {

    /* renamed from: q, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.w f75982q = new com.tencent.mm.plugin.appbrand.appcache.u$$a();

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f75983o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.os3 f75984p;

    public u(r45.os3 os3Var) {
        this.f75984p = os3Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.finder.z0.CTRL_INDEX;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/getwxacdndownloadurl";
        lVar.f70664a = os3Var;
        lVar.f70665b = new r45.ps3();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f75983o = a17;
        p(a17);
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public r45.y50 A() {
        return this.f75984p.f382495v;
    }

    public r45.os3 D() {
        return (r45.os3) this.f75983o.f70710a.f70684a;
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d, com.tencent.mm.modelbase.i
    public synchronized pq5.g l() {
        long currentTimeMillis;
        pq5.g a17;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        currentTimeMillis = java.lang.System.currentTimeMillis();
        a17 = ((com.tencent.mm.plugin.appbrand.appcache.u$$a) f75982q).a(this);
        if (a17 == null) {
            a17 = super.l();
        }
        return a17.h(new com.tencent.mm.plugin.appbrand.appcache.v(this, currentTimeMillis));
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public java.lang.String y() {
        java.lang.String str = this.f75984p.f382481e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }
}
