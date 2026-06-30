package qf2;

/* loaded from: classes.dex */
public final class h3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f443937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.q3 f443938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oi2.a f443939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(jz5.l lVar, qf2.q3 q3Var, oi2.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f443937d = lVar;
        this.f443938e = q3Var;
        this.f443939f = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.h3(this.f443937d, this.f443938e, this.f443939f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.h3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean booleanValue = ((java.lang.Boolean) this.f443937d.f384366d).booleanValue();
        jz5.f0 f0Var = jz5.f0.f384359a;
        qf2.q3 q3Var = this.f443938e;
        if (!booleanValue) {
            q3Var.b7();
            return f0Var;
        }
        lj2.o0 o0Var = q3Var.f444081m;
        if (o0Var != null) {
            o0Var.a(this.f443939f.f427143a, 2);
        }
        lj2.o0 o0Var2 = q3Var.f444081m;
        if (o0Var2 == null) {
            return null;
        }
        o0Var2.b();
        return f0Var;
    }
}
