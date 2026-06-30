package g4;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f349806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4.i f349807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.m4 f349808f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g4.w4 f349809g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f349810h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f349811i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g4.i iVar, g4.m4 m4Var, g4.w4 w4Var, p3325xe03a0797.p3326xc267989b.r2 r2Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f349807e = iVar;
        this.f349808f = m4Var;
        this.f349809g = w4Var;
        this.f349810h = r2Var;
        this.f349811i = f0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        return new g4.f(this.f349807e, this.f349808f, this.f349809g, this.f349810h, this.f349811i, completion);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.f) mo148xaf65a0fc(obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f349806d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.g0 g0Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.g0(new p3325xe03a0797.p3326xc267989b.p3328x30012e.l0(this.f349807e.f349896f.f349945c.f360246b, new g4.b(null)), new g4.c(this, null));
            g4.e eVar = new g4.e(this);
            this.f349806d = 1;
            if (g0Var.a(eVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
