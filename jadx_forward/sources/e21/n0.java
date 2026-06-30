package e21;

/* loaded from: classes5.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f328087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg3.q0 f328088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xg3.n0 f328089f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f328090g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(xg3.q0 q0Var, xg3.n0 n0Var, java.lang.ref.WeakReference weakReference, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f328088e = q0Var;
        this.f328089f = n0Var;
        this.f328090g = weakReference;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new e21.n0(this.f328088e, this.f328089f, this.f328090g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((e21.n0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        e21.f0 f0Var;
        xg3.n0 n0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f328087d;
        xg3.q0 q0Var = this.f328088e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                e21.z0 z0Var = e21.z0.f328138d;
                this.f328087d = 1;
                obj = e21.z0.a(z0Var, q0Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            f0Var = (e21.f0) obj;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OplogServiceKt", th6, "dealWith cgi error", new java.lang.Object[0]);
            f0Var = new e21.f0(q0Var, -1, "", "");
        }
        e21.z0 z0Var2 = e21.z0.f328138d;
        xg3.n0 n0Var2 = this.f328089f;
        if (n0Var2 != null) {
            z0Var2.o(n0Var2, f0Var.f328050b, f0Var.f328051c, f0Var.f328052d);
        }
        java.lang.ref.WeakReference weakReference = this.f328090g;
        if (weakReference != null && (n0Var = (xg3.n0) weakReference.get()) != null) {
            z0Var2.o(n0Var, f0Var.f328050b, f0Var.f328051c, f0Var.f328052d);
        }
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) e21.z0.f328145n).e(f0Var);
        return jz5.f0.f384359a;
    }
}
