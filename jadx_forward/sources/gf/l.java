package gf;

/* loaded from: classes7.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f352644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f352645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2936x80def495.C25587x226dda3 f352646f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 f352647g;

    public l(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var) {
        this.f352644d = i17;
        this.f352645e = tVar;
        this.f352646f = c25587x226dda3;
        this.f352647g = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppServiceSkylineExtensionImpl", "initJSEngine on JsThread " + this.f352644d);
        df.h.f311003a.getClass();
        if (df.h.f311007e) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar = this.f352645e;
            if (tVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.o0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsruntime.AppBrandNodeJSBasedJsEngine");
                cl.q0 q0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.o0) tVar).f165502g;
                if (q0Var != null) {
                    cl.w2 w2Var = new cl.w2();
                    w2Var.f124349e = true;
                    w2Var.b(q0Var);
                }
            }
        }
        com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = this.f352646f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var = this.f352647g;
        c25587x226dda3.mo95671x2cfc69fb(l0Var.L(), l0Var.G(), l0Var.z());
    }
}
