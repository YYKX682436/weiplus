package ir2;

/* loaded from: classes2.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f375775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f375776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f375777f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f375778g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f375779h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ir2.a1 f375780i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(int i17, so2.j5 j5Var, java.lang.Object obj, boolean z17, ir2.a1 a1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f375776e = i17;
        this.f375777f = j5Var;
        this.f375778g = obj;
        this.f375779h = z17;
        this.f375780i = a1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ir2.y0(this.f375776e, this.f375777f, this.f375778g, this.f375779h, this.f375780i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ir2.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f375775d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ir2.a2 a2Var = new ir2.a2(this.f375776e, -1L, this.f375777f, this.f375778g, this.f375779h);
            this.f375775d = 1;
            if (this.f375780i.T6(a2Var, this) == aVar) {
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
