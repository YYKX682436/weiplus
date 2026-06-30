package a0;

/* loaded from: classes14.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f81843d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f81844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f81845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.o f81846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f81847h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f81848i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f81849m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z17, c0.o oVar, n0.v2 v2Var, n0.e5 e5Var, n0.e5 e5Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f81845f = z17;
        this.f81846g = oVar;
        this.f81847h = v2Var;
        this.f81848i = e5Var;
        this.f81849m = e5Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        a0.v vVar = new a0.v(this.f81845f, this.f81846g, this.f81847h, this.f81848i, this.f81849m, interfaceC29045xdcb5ca57);
        vVar.f81844e = obj;
        return vVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.v) mo148xaf65a0fc((p1.a0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f81843d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p1.a0 a0Var = (p1.a0) this.f81844e;
            a0.t tVar = new a0.t(this.f81845f, this.f81846g, this.f81847h, this.f81848i, null);
            a0.u uVar = new a0.u(this.f81845f, this.f81849m);
            this.f81843d = 1;
            if (b0.d4.d(a0Var, tVar, uVar, this) == aVar) {
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
