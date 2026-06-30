package ey2;

/* loaded from: classes2.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f338848d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f338849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ey2.b1 f338850f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f338851g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f338852h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.oq2 f338853i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(ey2.b1 b1Var, int i17, int i18, r45.oq2 oq2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f338850f = b1Var;
        this.f338851g = i17;
        this.f338852h = i18;
        this.f338853i = oq2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ey2.a1 a1Var = new ey2.a1(this.f338850f, this.f338851g, this.f338852h, this.f338853i, interfaceC29045xdcb5ca57);
        a1Var.f338849e = obj;
        return a1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ey2.a1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f338848d;
        ey2.b1 b1Var = this.f338850f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f338849e;
            ey2.z0 z0Var = new ey2.z0(this.f338851g, b1Var, this.f338852h, this.f338853i);
            b1Var.f338859e = true;
            oz5.l f93115e = y0Var.getF93115e();
            int i18 = p3325xe03a0797.p3326xc267989b.r2.O0;
            gb2.d dVar = new gb2.d(z0Var, (p3325xe03a0797.p3326xc267989b.r2) f93115e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d), null, 4, null);
            this.f338848d = 1;
            if (dVar.i(false, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        b1Var.f338859e = false;
        return jz5.f0.f384359a;
    }
}
