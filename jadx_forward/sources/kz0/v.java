package kz0;

/* loaded from: classes5.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 f395347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1 f395348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.y f395349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f395350g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f395351h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f395352i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f395353m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1 c1Var, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.y yVar, yz5.l lVar, n0.v2 v2Var, n0.v2 v2Var2, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f395347d = m7Var;
        this.f395348e = c1Var;
        this.f395349f = yVar;
        this.f395350g = lVar;
        this.f395351h = v2Var;
        this.f395352i = v2Var2;
        this.f395353m = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kz0.v(this.f395347d, this.f395348e, this.f395349f, this.f395350g, this.f395351h, this.f395352i, this.f395353m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        kz0.v vVar = (kz0.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        vVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yz5.l lVar = this.f395350g;
        n0.v2 v2Var = this.f395351h;
        n0.v2 v2Var2 = this.f395352i;
        kz0.q qVar = new kz0.q(lVar, v2Var, v2Var2);
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var = this.f395347d;
        m7Var.getClass();
        m7Var.f151623h = qVar;
        m7Var.f151624i = new kz0.r(lVar, v2Var, v2Var2);
        m7Var.f151625j = new kz0.s(lVar, v2Var, v2Var2);
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1 c1Var = this.f395348e;
        c1Var.getClass();
        yz5.a aVar2 = this.f395353m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar2, "<set-?>");
        c1Var.f151407e = aVar2;
        c1Var.f151408f = new kz0.t(m7Var);
        kz0.u uVar = new kz0.u(aVar2);
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.y yVar = this.f395349f;
        yVar.getClass();
        yVar.f151860f = uVar;
        return jz5.f0.f384359a;
    }
}
