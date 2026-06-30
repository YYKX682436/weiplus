package yy0;

/* loaded from: classes4.dex */
public final class e8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f549608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f549610f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f549611g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(int i17, java.lang.String str, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549608d = i17;
        this.f549609e = str;
        this.f549610f = i18;
        this.f549611g = f0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yy0.e8(this.f549608d, this.f549609e, this.f549610f, this.f549611g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yy0.e8 e8Var = (yy0.e8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        e8Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        i95.m c17 = i95.n0.c(g65.a.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        g65.a.hg((g65.a) c17, 34, this.f549608d, this.f549609e, this.f549610f, this.f549611g.f391649d, 0, 0L, 0L, 0L, 0L, 0, null, null, null, null, 32736, null);
        return jz5.f0.f384359a;
    }
}
