package an;

/* loaded from: classes11.dex */
public class a implements com.tencent.wechat.aff.cara.CaraNativeAccountFeatureCenterBase {
    @Override // com.tencent.wechat.aff.cara.CaraNativeAccountFeatureCenterBase
    public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab discoverTab() {
        com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder newBuilder = com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.newBuilder();
        xm.n nVar = xm.n.f455155e;
        newBuilder.setChannels(((java.lang.Boolean) nVar.a("getFinder", new xm.e(nVar))).booleanValue()).setGames(((java.lang.Boolean) nVar.a("getGame", new xm.f(nVar))).booleanValue()).setLive(((java.lang.Boolean) nVar.a("getLive", new xm.d(nVar))).booleanValue()).setMiniPrograms(((java.lang.Boolean) nVar.a("getAppbrand", new xm.g(nVar))).booleanValue()).setNearby(((java.lang.Boolean) nVar.a("getNearby", new xm.i(nVar))).booleanValue()).setScan(((java.lang.Boolean) nVar.a("getScan", new xm.j(nVar))).booleanValue()).setShake(((java.lang.Boolean) nVar.a("getShake", new xm.l(nVar))).booleanValue()).setShopping(((java.lang.Boolean) nVar.a("getShopping", new xm.m(nVar))).booleanValue()).setTopStories(false).setMoments(((java.lang.Boolean) nVar.a("getSns", new xm.h(nVar))).booleanValue()).setSearch(((java.lang.Boolean) nVar.a("getSearch", new xm.k(nVar))).booleanValue());
        return (com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) newBuilder.build();
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeAccountFeatureCenterBase
    public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraGender gender() {
        java.lang.Object l17;
        com.tencent.wechat.aff.cara.CaraFeatureProto.CaraGender caraGender = com.tencent.wechat.aff.cara.CaraFeatureProto.CaraGender.CARA_GENDER_UNKNOWN;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        if (c17 == null || (l17 = c17.l(12290, null)) == null) {
            return caraGender;
        }
        int intValue = ((java.lang.Integer) l17).intValue();
        return intValue == 2 ? com.tencent.wechat.aff.cara.CaraFeatureProto.CaraGender.CARA_GENDER_FEMALE : intValue == 1 ? com.tencent.wechat.aff.cara.CaraFeatureProto.CaraGender.CARA_GENDER_MALE : caraGender;
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeAccountFeatureCenterBase
    public boolean isRegisteredInChina() {
        return !com.tencent.mm.sdk.platformtools.a0.c();
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeAccountFeatureCenterBase
    public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraMomentPrivacy momentPrivacy() {
        if (p94.w0.c() != null) {
            p94.j0 c17 = p94.w0.c();
            gm0.j1.i();
            r45.cb6 b17 = ((com.tencent.mm.plugin.sns.storage.e2) c17).b1((java.lang.String) gm0.j1.u().c().l(2, null));
            if (b17 != null) {
                int i17 = b17.f371432h;
                return i17 == 4320 ? com.tencent.wechat.aff.cara.CaraFeatureProto.CaraMomentPrivacy.CARA_MOMENT_PRIVACY_LAST_6_MONTHS : i17 == 72 ? com.tencent.wechat.aff.cara.CaraFeatureProto.CaraMomentPrivacy.CARA_MOMENT_PRIVACY_LAST_3_DAYS : i17 == 720 ? com.tencent.wechat.aff.cara.CaraFeatureProto.CaraMomentPrivacy.CARA_MOMENT_PRIVACY_LAST_MONTH : com.tencent.wechat.aff.cara.CaraFeatureProto.CaraMomentPrivacy.CARA_MOMENT_PRIVACY_ALL;
            }
        }
        return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraMomentPrivacy.CARA_MOMENT_PRIVACY_UNKNOWN;
    }
}
