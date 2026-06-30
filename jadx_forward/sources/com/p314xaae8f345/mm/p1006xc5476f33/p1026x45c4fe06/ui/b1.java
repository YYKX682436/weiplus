package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class b1 extends ze.g {

    /* renamed from: Companion */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.a1 f35295x233c02ec = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.a1(null);

    /* renamed from: forceCenterInside$delegate */
    private static final nf.r f35296xfeb251ed;

    /* renamed from: forceNotCenterInside$delegate */
    private static final nf.r f35297x21c51110;

    /* renamed from: mayDisableInHuaWeiDevices */
    private static java.lang.Boolean f35298x8e3eb3ae;

    /* renamed from: base */
    private final xi1.g f35299x2e06d1;

    static {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        f35296xfeb251ed = new nf.r(bool);
        f35297x21c51110 = new nf.r(bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 rt6, xi1.p activityOrientationHandler, xi1.g base) {
        super(rt6, activityOrientationHandler, false, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityOrientationHandler, "activityOrientationHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(base, "base");
        this.f35299x2e06d1 = base;
    }

    /* renamed from: access$getForceCenterInside$delegate$cp */
    public static final /* synthetic */ nf.r m52933x1ef03e0e() {
        return f35296xfeb251ed;
    }

    /* renamed from: access$getForceNotCenterInside$delegate$cp */
    public static final /* synthetic */ nf.r m52934x64f7a4b7() {
        return f35297x21c51110;
    }

    /* renamed from: access$getMayDisableInHuaWeiDevices$cp */
    public static final /* synthetic */ java.lang.Boolean m52935xa4ad2059() {
        return f35298x8e3eb3ae;
    }

    /* renamed from: access$setMayDisableInHuaWeiDevices$cp */
    public static final /* synthetic */ void m52936x9f968365(java.lang.Boolean bool) {
        f35298x8e3eb3ae = bool;
    }

    /* renamed from: enableForGame */
    private final boolean m52937x1a478958() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_center_inside_for_mini_game, 0) == 1;
    }

    /* renamed from: isBlackListing */
    public static final boolean m52938x549587cf(android.content.Context context) {
        return f35295x233c02ec.c(context);
    }

    @Override // ze.g
    /* renamed from: getBackgroundColor */
    public int mo52939x3119c89f() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.b(m178758xe21a8068()) ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5 : com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d;
    }

    @Override // ze.g, xi1.s
    /* renamed from: getStatusBar */
    public xi1.f mo51615x8408480b() {
        return this.f35299x2e06d1.mo51615x8408480b();
    }

    @Override // ze.g, xi1.s
    /* renamed from: shouldInLargeScreenCompatMode */
    public boolean mo51620x1ab1e3d4() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.a1 a1Var = f35295x233c02ec;
        if (a1Var.a()) {
            return true;
        }
        if (m178764x5db1c38().Q0()) {
            return false;
        }
        if (m178758xe21a8068() != null) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 m178758xe21a8068 = m178758xe21a8068();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m178758xe21a8068);
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) m178758xe21a8068).f158825e2 || (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.b(m178758xe21a8068()) && !m52937x1a478958())) {
                return false;
            }
        }
        if (m178763x7f3bd3f5() || a1Var.c(this.f35299x2e06d1.mo52325x76847179())) {
            return false;
        }
        nf.y yVar = nf.x.f418149b;
        if (yVar != null ? yVar.e() : false) {
            return true;
        }
        return super.mo51620x1ab1e3d4();
    }
}
