package zr0;

/* loaded from: classes14.dex */
public final class k extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr0.p f556681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ is0.c f556682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(zr0.p pVar, is0.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f556681d = pVar;
        this.f556682e = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zr0.k(this.f556681d, this.f556682e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        zr0.k kVar = (zr0.k) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj);
        jz5.f0 f0Var = jz5.f0.f384359a;
        kVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        os0.a aVar2 = this.f556681d.f556701h;
        if (aVar2 != null) {
            is0.c cVar = this.f556682e;
            aVar2.w(cVar.f375933m, cVar.f375934n);
        }
        zr0.p pVar = this.f556681d;
        os0.a aVar3 = pVar.f556701h;
        if (aVar3 != null) {
            aVar3.u(pVar.f556698e.f537710c.f537706a, this.f556681d.f556698e.f537710c.f537707b);
        }
        zr0.p pVar2 = this.f556681d;
        os0.a aVar4 = pVar2.f556701h;
        if (aVar4 != null) {
            ((os0.c) aVar4).H = this.f556682e.f375928e;
        }
        if (aVar4 != null) {
            aVar4.f429538n = pVar2.f556698e.f537711d;
        }
        zr0.p pVar3 = this.f556681d;
        os0.a aVar5 = pVar3.f556701h;
        if (aVar5 != null) {
            aVar5.f429540p = pVar3.f556698e.f537712e;
        }
        os0.a aVar6 = this.f556681d.f556701h;
        if (aVar6 != null) {
            aVar6.o();
        }
        return jz5.f0.f384359a;
    }
}
