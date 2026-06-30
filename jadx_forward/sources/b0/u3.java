package b0;

/* loaded from: classes14.dex */
public final class u3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f98081d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f98082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.h2 f98083f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f98084g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f98085h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(b0.h2 h2Var, yz5.q qVar, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f98083f = h2Var;
        this.f98084g = qVar;
        this.f98085h = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.u3 u3Var = new b0.u3(this.f98083f, this.f98084g, this.f98085h, interfaceC29045xdcb5ca57);
        u3Var.f98082e = obj;
        return u3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.u3) mo148xaf65a0fc((p1.a0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f98081d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b0.t3 t3Var = new b0.t3(this.f98083f, (p1.a0) this.f98082e, this.f98084g, this.f98085h, null);
            this.f98081d = 1;
            if (p3325xe03a0797.p3326xc267989b.z0.f(t3Var, this) == aVar) {
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
