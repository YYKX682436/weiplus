package com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p809x2eaf0c;

/* renamed from: com.tencent.mm.kara.feature.feature.comm.DiscoverSettingsFeatureGroup */
/* loaded from: classes11.dex */
public class C10782xe7009a95 extends pl0.e {

    /* renamed from: channels */
    @fl0.a
    public int f29315x556423d0;

    /* renamed from: games */
    @fl0.a
    public int f29316x5d932c1;

    /* renamed from: miniPrograms */
    @fl0.a
    public int f29317xe83ff3e6;

    /* renamed from: moments */
    @fl0.a
    public int f29318x49a0be73;

    /* renamed from: nearby */
    @fl0.a
    public int f29319xc1722a7f;

    /* renamed from: scan */
    @fl0.a
    public int f29320x35c67d;

    /* renamed from: search */
    @fl0.a
    public int f29321xc9fa65a8;

    /* renamed from: shake */
    @fl0.a
    public int f29322x6854f06;

    /* renamed from: shopping */
    @fl0.a
    public int f29323xeb77f168;

    /* renamed from: topStories */
    @fl0.a
    public int f29324x605ffd3e;

    @Override // pl0.e, fl0.b
    /* renamed from: build */
    public void mo46315x59bc66e() {
        super.mo46315x59bc66e();
        sl0.o oVar = sl0.o.f490724e;
        this.f29315x556423d0 = ((java.lang.Boolean) oVar.a("getFinder", new sl0.g(oVar))).booleanValue() ? 1 : 0;
        this.f29316x5d932c1 = ((java.lang.Boolean) oVar.a("getGame", new sl0.h(oVar))).booleanValue() ? 1 : 0;
        this.f29317xe83ff3e6 = ((java.lang.Boolean) oVar.a("getAppbrand", new sl0.i(oVar))).booleanValue() ? 1 : 0;
        this.f29318x49a0be73 = ((java.lang.Boolean) oVar.a("getSns", new sl0.j(oVar))).booleanValue() ? 1 : 0;
        this.f29319xc1722a7f = 0;
        this.f29320x35c67d = ((java.lang.Boolean) oVar.a("getScan", new sl0.k(oVar))).booleanValue() ? 1 : 0;
        this.f29321xc9fa65a8 = ((java.lang.Boolean) oVar.a("getSearch", new sl0.l(oVar))).booleanValue() ? 1 : 0;
        this.f29322x6854f06 = ((java.lang.Boolean) oVar.a("getShake", new sl0.m(oVar))).booleanValue() ? 1 : 0;
        this.f29323xeb77f168 = ((java.lang.Boolean) oVar.a("getShopping", new sl0.n(oVar))).booleanValue() ? 1 : 0;
        this.f29324x605ffd3e = 1;
    }

    @Override // fl0.b
    /* renamed from: getName */
    public java.lang.String mo46314xfb82e301() {
        return "myself_discover";
    }
}
