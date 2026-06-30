package nu0;

/* loaded from: classes5.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au0.b f421687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b1 f421688e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(au0.b bVar, nu0.b1 b1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f421687d = bVar;
        this.f421688e = b1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nu0.z0(this.f421687d, this.f421688e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        nu0.z0 z0Var = (nu0.z0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        z0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String m32425x6ac9171 = this.f421687d.c().m32425x6ac9171();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m32425x6ac9171, "value(...)");
        bu0.b b17 = this.f421687d.b();
        this.f421688e.Y6().e();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e b76 = this.f421688e.b7();
        cv0.e a76 = this.f421688e.W6().a7(b17);
        java.util.List f17 = cv0.h.f(this.f421688e.m80379x76847179(), b17, a76, b76);
        java.util.List Z6 = this.f421688e.Z6(b17);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4111x4a556090 g17 = cv0.h.g(this.f421688e.m80379x76847179());
        com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4050x944e439f e17 = cv0.h.e(this.f421688e.m80379x76847179());
        nu0.q0 q76 = this.f421688e.q7();
        q76.getClass();
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8 = q76.f421608r;
        if (c4063x855a1ef8 != null) {
            c4063x855a1ef8.m(m32425x6ac9171, f17, Z6, g17, e17);
        }
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef82 = q76.f421608r;
        if (c4063x855a1ef82 != null) {
            c4063x855a1ef82.e();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageControlUIC", "[showBoxItem] enableHandleBox");
        a76.m122779x9616526c();
        return jz5.f0.f384359a;
    }
}
