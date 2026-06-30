package ig0;

/* loaded from: classes12.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f372846d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f372847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cg0.a f372848f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ig0.o f372849g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(cg0.a aVar, ig0.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372848f = aVar;
        this.f372849g = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ig0.f fVar = new ig0.f(this.f372848f, this.f372849g, interfaceC29045xdcb5ca57);
        fVar.f372847e = obj;
        return fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ig0.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f372846d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f372847e;
            fg0.g a17 = fg0.g.f343369h.a();
            ig0.e eVar = new ig0.e(y0Var, this.f372849g);
            this.f372846d = 1;
            if (a17.V6(this.f372848f, eVar, this) == aVar) {
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
