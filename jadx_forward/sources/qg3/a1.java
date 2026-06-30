package qg3;

/* loaded from: classes.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f444335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f444336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(android.app.Activity activity, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444336e = activity;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        qg3.a1 a1Var = new qg3.a1(this.f444336e, interfaceC29045xdcb5ca57);
        a1Var.f444335d = obj;
        return a1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qg3.a1 a1Var = (qg3.a1) mo148xaf65a0fc((xg2.a) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        a1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        pm0.v.X(new qg3.z0(this.f444336e, (xg2.a) this.f444335d));
        return jz5.f0.f384359a;
    }
}
