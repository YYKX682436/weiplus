package fn2;

/* loaded from: classes10.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f345741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn2.q1 f345742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f345743f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(fn2.q1 q1Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f345742e = q1Var;
        this.f345743f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fn2.a1(this.f345742e, this.f345743f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn2.a1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f345741d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            fn2.q1 q1Var = this.f345742e;
            boolean z17 = this.f345743f;
            this.f345741d = 1;
            obj = fn2.q1.d(q1Var, null, z17, null, this, 5, null);
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
