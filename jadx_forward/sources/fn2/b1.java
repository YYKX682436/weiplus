package fn2;

/* loaded from: classes10.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f345758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn2.q1 f345759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f345760f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(fn2.q1 q1Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f345759e = q1Var;
        this.f345760f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fn2.b1(this.f345759e, this.f345760f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn2.b1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.zx1 zx1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f345758d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f345758d = 1;
            obj = this.f345759e.e(this.f345760f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.gx1 gx1Var = (r45.gx1) obj;
        java.util.LinkedList linkedList = (gx1Var == null || (zx1Var = gx1Var.f457126d) == null) ? null : zx1Var.f473985d;
        return linkedList == null ? kz5.p0.f395529d : linkedList;
    }
}
