package e22;

/* loaded from: classes5.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f328281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f328282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f328283f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f328284g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(n0.e5 e5Var, f0.r1 r1Var, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f328282e = e5Var;
        this.f328283f = r1Var;
        this.f328284g = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new e22.w0(this.f328282e, this.f328283f, this.f328284g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((e22.w0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f328281d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j f17 = n0.s4.f(new e22.s0(this.f328282e, this.f328283f));
            e22.t0 t0Var = new e22.t0(this.f328284g);
            this.f328281d = 1;
            java.lang.Object a17 = f17.a(new e22.v0(t0Var), this);
            if (a17 != pz5.a.f440719d) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
