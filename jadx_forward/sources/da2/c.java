package da2;

/* loaded from: classes2.dex */
public final class c implements zy2.ub {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.ub f309269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f309270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ da2.g f309271f;

    public c(yz5.a aVar, da2.g gVar) {
        this.f309270e = aVar;
        this.f309271f = gVar;
        if (!zy2.ub.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(zy2.ub.class.getClassLoader(), new java.lang.Class[]{zy2.ub.class}, pm0.v.f438336b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.findersdk.api.IFinderVideoViewCallback");
        }
        this.f309269d = (zy2.ub) newProxyInstance;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        this.f309269d.E(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f309269d.I(str, str2, i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        yz5.a aVar = this.f309270e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        this.f309269d.N5(str, str2, bool);
    }

    @Override // zy2.ub
    public void e3(int i17, int i18) {
        this.f309269d.e3(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        kk4.g0 g0Var = this.f309271f.f309285d;
        if (g0Var != null) {
            ((ea2.c0) g0Var).f332079a.t7();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        kk4.g0 g0Var = this.f309271f.f309285d;
        if (g0Var != null) {
            ((ea2.c0) g0Var).f332079a.t7();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        this.f309269d.m2(str, str2, z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        this.f309269d.o(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    /* renamed from: onSeekComplete */
    public void mo55683xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        this.f309269d.mo55683xe1fdf750(interfaceC26164x73fc6bc6);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        this.f309269d.p2(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        this.f309269d.v3(str, str2, i17, i18, i19);
    }
}
