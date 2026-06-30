package zr0;

/* loaded from: classes14.dex */
public final class o extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr0.p f556693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f556694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f556695f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f556696g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(zr0.p pVar, byte[] bArr, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f556693d = pVar;
        this.f556694e = bArr;
        this.f556695f = i17;
        this.f556696g = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zr0.o(this.f556693d, this.f556694e, this.f556695f, this.f556696g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        zr0.o oVar = (zr0.o) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj);
        jz5.f0 f0Var = jz5.f0.f384359a;
        oVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        os0.f fVar = this.f556693d.f556700g;
        if (fVar != null) {
            fVar.q(this.f556694e);
        }
        os0.f fVar2 = this.f556693d.f556700g;
        if (fVar2 != null) {
            fVar2.w(this.f556695f, this.f556696g);
        }
        zr0.p pVar = this.f556693d;
        os0.f fVar3 = pVar.f556700g;
        if (fVar3 != null) {
            fVar3.u(pVar.f556698e.f537710c.f537706a, this.f556693d.f556698e.f537710c.f537707b);
        }
        zr0.p pVar2 = this.f556693d;
        os0.f fVar4 = pVar2.f556700g;
        if (fVar4 != null) {
            fVar4.f429538n = pVar2.f556698e.f537711d;
        }
        zr0.p pVar3 = this.f556693d;
        os0.f fVar5 = pVar3.f556700g;
        if (fVar5 != null) {
            fVar5.f429540p = pVar3.f556698e.f537712e;
        }
        os0.f fVar6 = this.f556693d.f556700g;
        if (fVar6 != null) {
            fVar6.o();
        }
        return jz5.f0.f384359a;
    }
}
