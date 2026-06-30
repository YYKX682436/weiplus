package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class l implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.k f76249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f76251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f76252g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.o f76253h;

    public l(com.tencent.mm.plugin.appbrand.appstorage.o oVar, com.tencent.mm.plugin.appbrand.appstorage.k kVar, java.lang.String str, int i17, int i18) {
        this.f76253h = oVar;
        this.f76249d = kVar;
        this.f76250e = str;
        this.f76251f = i17;
        this.f76252g = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean replace;
        com.tencent.mm.plugin.appbrand.appstorage.o oVar = this.f76253h;
        replace = super/*l75.n0*/.replace(this.f76249d);
        if (!replace) {
            return com.tencent.mm.plugin.appbrand.appstorage.o1.UNKNOWN;
        }
        yz5.l lVar = oVar.f76286e;
        yz5.p pVar = oVar.f76287f;
        java.lang.String str = this.f76250e;
        int i17 = this.f76251f;
        com.tencent.mm.plugin.appbrand.appstorage.a2.a(str, i17, lVar, pVar);
        oVar.J0(i17, str, this.f76252g);
        return com.tencent.mm.plugin.appbrand.appstorage.o1.NONE;
    }
}
