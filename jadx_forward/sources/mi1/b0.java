package mi1;

/* loaded from: classes7.dex */
public final class b0 implements mi1.f {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f408048d;

    /* renamed from: e, reason: collision with root package name */
    public final mi1.f f408049e;

    /* renamed from: f, reason: collision with root package name */
    public final u81.f f408050f;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime, mi1.f hostCapsuleBarBlinkHelper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hostCapsuleBarBlinkHelper, "hostCapsuleBarBlinkHelper");
        this.f408048d = runtime;
        this.f408049e = hostCapsuleBarBlinkHelper;
        mi1.a0 a0Var = new mi1.a0(this);
        java.lang.String str = runtime.f156336n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getAppId(...)");
        cf.m mVar = new cf.m(str);
        a0Var.mo146xb9724478(mVar);
        runtime.N.a(mVar);
        this.f408050f = mVar;
    }

    @Override // mi1.f
    public mi1.w0 a(mi1.d dVar, mi1.e eVar, java.lang.String str) {
        return this.f408049e.a(dVar, eVar, str);
    }

    @Override // mi1.f
    public int d() {
        return this.f408049e.d();
    }

    @Override // mi1.f
    public void g(java.lang.String str) {
        this.f408049e.g(str);
    }

    @Override // mi1.f
    public mi1.w0 h(mi1.d dVar) {
        mi1.w0 a17 = this.f408049e.a(dVar, mi1.e.HIGH, "embed_wxa_blink_handler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "blinkCapsuleBar(...)");
        return a17;
    }

    @Override // mi1.f
    public int j() {
        return this.f408049e.j();
    }

    @Override // mi1.f
    public mi1.w0 k(java.util.Map map, mi1.e eVar, java.lang.String str) {
        return this.f408049e.k(map, eVar, str);
    }
}
