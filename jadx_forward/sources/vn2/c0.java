package vn2;

/* loaded from: classes.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f519779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f519780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519781f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, android.content.Context context, java.lang.String str) {
        super(2, interfaceC29045xdcb5ca57);
        this.f519779d = hVar;
        this.f519780e = context;
        this.f519781f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vn2.c0(this.f519779d, interfaceC29045xdcb5ca57, this.f519780e, this.f519781f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vn2.c0 c0Var = (vn2.c0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        c0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        pm0.v.X(new vn2.b0(this.f519780e, this.f519781f, (xg2.a) ((xg2.b) this.f519779d).f535914b));
        return jz5.f0.f384359a;
    }
}
