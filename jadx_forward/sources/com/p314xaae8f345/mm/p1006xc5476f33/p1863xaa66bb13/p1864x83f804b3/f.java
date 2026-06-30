package com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3;

/* loaded from: classes11.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg3.e f230174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f230175e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vg3.e eVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f230174d = eVar;
        this.f230175e = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.f(this.f230174d, this.f230175e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.f fVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        fVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7166x6367e644 c7166x6367e644 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7166x6367e644();
        vg3.e eVar = this.f230174d;
        c7166x6367e644.f144677d = c7166x6367e644.b("requestPage", java.lang.String.valueOf(eVar.f518221a.f518219d), true);
        java.util.List list = eVar.f518225e;
        c7166x6367e644.f144678e = c7166x6367e644.b("toUsername", list != null ? kz5.n0.g0(list, "#", null, null, 0, null, null, 62, null) : null, true);
        c7166x6367e644.f144680g = eVar.f518222b.f518181d;
        c7166x6367e644.f144681h = eVar.f518223c.f518205d;
        c7166x6367e644.f144682i = c7166x6367e644.b("returnCode", java.lang.String.valueOf(eVar.f518224d), true);
        c7166x6367e644.f144683j = 1L;
        c7166x6367e644.f144684k = this.f230175e;
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            c7166x6367e644.o();
        }
        c7166x6367e644.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactOpReportService", "report page=" + c7166x6367e644.f144677d + ", toUsername=" + c7166x6367e644.f144678e + ", eventType=" + c7166x6367e644.f144680g + ", requestContent=" + c7166x6367e644.f144681h + ", returnCode=" + c7166x6367e644.f144682i + ", costTime=" + c7166x6367e644.f144684k);
        return jz5.f0.f384359a;
    }
}
