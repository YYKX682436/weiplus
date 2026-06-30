package com.tencent.mm.kara.feature.feature.comm;

/* loaded from: classes11.dex */
public class DiscoverSettingsFeatureGroup extends pl0.e {

    @fl0.a
    public int channels;

    @fl0.a
    public int games;

    @fl0.a
    public int miniPrograms;

    @fl0.a
    public int moments;

    @fl0.a
    public int nearby;

    @fl0.a
    public int scan;

    @fl0.a
    public int search;

    @fl0.a
    public int shake;

    @fl0.a
    public int shopping;

    @fl0.a
    public int topStories;

    @Override // pl0.e, fl0.b
    public void build() {
        super.build();
        sl0.o oVar = sl0.o.f409191e;
        this.channels = ((java.lang.Boolean) oVar.a("getFinder", new sl0.g(oVar))).booleanValue() ? 1 : 0;
        this.games = ((java.lang.Boolean) oVar.a("getGame", new sl0.h(oVar))).booleanValue() ? 1 : 0;
        this.miniPrograms = ((java.lang.Boolean) oVar.a("getAppbrand", new sl0.i(oVar))).booleanValue() ? 1 : 0;
        this.moments = ((java.lang.Boolean) oVar.a("getSns", new sl0.j(oVar))).booleanValue() ? 1 : 0;
        this.nearby = 0;
        this.scan = ((java.lang.Boolean) oVar.a("getScan", new sl0.k(oVar))).booleanValue() ? 1 : 0;
        this.search = ((java.lang.Boolean) oVar.a("getSearch", new sl0.l(oVar))).booleanValue() ? 1 : 0;
        this.shake = ((java.lang.Boolean) oVar.a("getShake", new sl0.m(oVar))).booleanValue() ? 1 : 0;
        this.shopping = ((java.lang.Boolean) oVar.a("getShopping", new sl0.n(oVar))).booleanValue() ? 1 : 0;
        this.topStories = 1;
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return "myself_discover";
    }
}
