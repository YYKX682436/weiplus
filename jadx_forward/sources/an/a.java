package an;

/* loaded from: classes11.dex */
public class a implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27161x909d3373 {
    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27161x909d3373
    /* renamed from: discoverTab */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraAccountDiscoverTab mo2386xe13b5aec() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraAccountDiscoverTab.Builder m111261x3136c9db = com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraAccountDiscoverTab.m111261x3136c9db();
        xm.n nVar = xm.n.f536688e;
        m111261x3136c9db.m111320xcbf6c252(((java.lang.Boolean) nVar.a("getFinder", new xm.e(nVar))).booleanValue()).m111321x5304f37f(((java.lang.Boolean) nVar.a("getGame", new xm.f(nVar))).booleanValue()).m111322x764ce06e(((java.lang.Boolean) nVar.a("getLive", new xm.d(nVar))).booleanValue()).m111323x7f7b8168(((java.lang.Boolean) nVar.a("getAppbrand", new xm.g(nVar))).booleanValue()).m111325x19be8181(((java.lang.Boolean) nVar.a("getNearby", new xm.i(nVar))).booleanValue()).m111326x764ff5ff(((java.lang.Boolean) nVar.a("getScan", new xm.j(nVar))).booleanValue()).m111328x53b10fc4(((java.lang.Boolean) nVar.a("getShake", new xm.l(nVar))).booleanValue()).m111329x620a8fea(((java.lang.Boolean) nVar.a("getShopping", new xm.m(nVar))).booleanValue()).m111330x7cc50340(false).m111324xfadf47b1(((java.lang.Boolean) nVar.a("getSns", new xm.h(nVar))).booleanValue()).m111327x2246bcaa(((java.lang.Boolean) nVar.a("getSearch", new xm.k(nVar))).booleanValue());
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraAccountDiscoverTab) m111261x3136c9db.mo20556x59bc66e();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27161x909d3373
    /* renamed from: gender */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraGender mo2387xb585f2c1() {
        java.lang.Object l17;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraGender caraGender = com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraGender.CARA_GENDER_UNKNOWN;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        if (c17 == null || (l17 = c17.l(12290, null)) == null) {
            return caraGender;
        }
        int intValue = ((java.lang.Integer) l17).intValue();
        return intValue == 2 ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraGender.CARA_GENDER_FEMALE : intValue == 1 ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraGender.CARA_GENDER_MALE : caraGender;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27161x909d3373
    /* renamed from: isRegisteredInChina */
    public boolean mo2388x591bd646() {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27161x909d3373
    /* renamed from: momentPrivacy */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraMomentPrivacy mo2389xc213f968() {
        if (p94.w0.c() != null) {
            p94.j0 c17 = p94.w0.c();
            gm0.j1.i();
            r45.cb6 b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) c17).b1((java.lang.String) gm0.j1.u().c().l(2, null));
            if (b17 != null) {
                int i17 = b17.f452965h;
                return i17 == 4320 ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraMomentPrivacy.CARA_MOMENT_PRIVACY_LAST_6_MONTHS : i17 == 72 ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraMomentPrivacy.CARA_MOMENT_PRIVACY_LAST_3_DAYS : i17 == 720 ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraMomentPrivacy.CARA_MOMENT_PRIVACY_LAST_MONTH : com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraMomentPrivacy.CARA_MOMENT_PRIVACY_ALL;
            }
        }
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27157x5ac3b05f.CaraMomentPrivacy.CARA_MOMENT_PRIVACY_UNKNOWN;
    }
}
