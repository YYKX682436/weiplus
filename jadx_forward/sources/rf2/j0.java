package rf2;

/* loaded from: classes10.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f476308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f476309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f476310f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476311g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(rf2.v0 v0Var, r45.f02 f02Var, android.view.View view, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476309e = v0Var;
        this.f476310f = f02Var;
        this.f476311g = view;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rf2.j0(this.f476309e, this.f476310f, this.f476311g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.j0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f476308d;
        r45.f02 f02Var = this.f476310f;
        rf2.v0 v0Var = this.f476309e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f476308d = 1;
            if (rf2.v0.a(v0Var, f02Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.view.View view = this.f476311g;
        v0Var.k(view, f02Var);
        v0Var.j(view, f02Var);
        return jz5.f0.f384359a;
    }
}
