package pk2;

/* loaded from: classes3.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f437094d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f437095e;

    /* renamed from: f, reason: collision with root package name */
    public int f437096f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f437097g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437098h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pk2.d0 f437099i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(pk2.o9 o9Var, pk2.d0 d0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f437098h = o9Var;
        this.f437099i = d0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pk2.b0 b0Var = new pk2.b0(this.f437098h, this.f437099i, interfaceC29045xdcb5ca57);
        b0Var.f437097g = ((java.lang.Boolean) obj).booleanValue();
        return b0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.b0) mo148xaf65a0fc(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f437096f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            boolean z17 = this.f437097g;
            pk2.o9 o9Var = this.f437098h;
            this.f437094d = o9Var;
            pk2.d0 d0Var = this.f437099i;
            this.f437095e = d0Var;
            this.f437097g = z17;
            this.f437096f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            o9Var.i(268435456, !z17, d0Var.n(), new pk2.a0(new v65.n(rVar)));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
