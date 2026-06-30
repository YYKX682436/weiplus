package vn2;

/* loaded from: classes.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f519875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f519876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519877f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(android.content.Context context, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f519876e = context;
        this.f519877f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        vn2.o0 o0Var = new vn2.o0(this.f519876e, this.f519877f, interfaceC29045xdcb5ca57);
        o0Var.f519875d = obj;
        return o0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vn2.o0 o0Var = (vn2.o0) mo148xaf65a0fc((xg2.a) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        o0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        pm0.v.X(new vn2.n0(this.f519876e, this.f519877f, (xg2.a) this.f519875d));
        return jz5.f0.f384359a;
    }
}
