package b0;

/* loaded from: classes14.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97764d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1.a0 f97766f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f97767g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97768h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97769i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97770m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(p1.a0 a0Var, yz5.q qVar, yz5.l lVar, yz5.l lVar2, yz5.l lVar3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97766f = a0Var;
        this.f97767g = qVar;
        this.f97768h = lVar;
        this.f97769i = lVar2;
        this.f97770m = lVar3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.b4 b4Var = new b0.b4(this.f97766f, this.f97767g, this.f97768h, this.f97769i, this.f97770m, interfaceC29045xdcb5ca57);
        b4Var.f97765e = obj;
        return b4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.b4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97764d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f97765e;
            p1.a0 a0Var = this.f97766f;
            b0.a4 a4Var = new b0.a4(new b0.h2(a0Var), this.f97767g, y0Var, this.f97768h, this.f97769i, this.f97770m, null);
            this.f97764d = 1;
            if (b0.u1.b(a0Var, a4Var, this) == aVar) {
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
