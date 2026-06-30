package g75;

/* loaded from: classes11.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f350886d;

    /* renamed from: e, reason: collision with root package name */
    public int f350887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g75.f0 f350888f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g75.z f350889g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j75.d f350890h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g75.f0 f0Var, g75.z zVar, j75.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f350888f = f0Var;
        this.f350889g = zVar;
        this.f350890h = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new g75.c0(this.f350888f, this.f350889g, this.f350890h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g75.c0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        g75.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f350887e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            j75.d dVar = this.f350890h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(dVar, "null cannot be cast to non-null type InAction of com.tencent.mm.sdk.pipeline.ProcessorPipelineComponent.onCreate.<no name provided>.invoke$lambda$0");
            g75.f0 f0Var2 = this.f350888f;
            this.f350886d = f0Var2;
            this.f350887e = 1;
            java.lang.Object i18 = f0Var2.i(this.f350889g, (j75.b) dVar, this);
            if (i18 == aVar) {
                return aVar;
            }
            f0Var = f0Var2;
            obj = i18;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0Var = (g75.f0) this.f350886d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        f0Var.a((j75.d) obj);
        return jz5.f0.f384359a;
    }
}
