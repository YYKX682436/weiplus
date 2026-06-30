package com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3;

/* loaded from: classes11.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg3.e f230168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g f230169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f230170f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vg3.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g gVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f230168d = eVar;
        this.f230169e = gVar;
        this.f230170f = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.e(this.f230168d, this.f230169e, this.f230170f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        eVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        vg3.e eVar = this.f230168d;
        vg3.b bVar = eVar.f518222b;
        long j17 = 0;
        if (bVar == vg3.b.f518178e) {
            this.f230169e.f230183g = eVar.f518221a;
            this.f230169e.f230182f = this.f230168d.f518223c;
            this.f230169e.f230181e = this.f230170f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g gVar = this.f230169e;
            vg3.e reportInfo = this.f230168d;
            gVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) gVar.f230180d).mo141623x754a37bb(), null, new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.f(reportInfo, 0L, null), 1, null);
        } else if (bVar == vg3.b.f518179f) {
            if (this.f230169e.f230183g == this.f230168d.f518221a && this.f230169e.f230182f == this.f230168d.f518223c && this.f230169e.f230181e > 0) {
                j17 = this.f230170f - this.f230169e.f230181e;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactOpReportService", "error: lastRequestPage=" + this.f230169e.f230183g + ", lastRequestContent=" + this.f230169e.f230182f + ", lastRequestStartTimeMs=" + this.f230169e.f230181e);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g gVar2 = this.f230169e;
            vg3.e reportInfo2 = this.f230168d;
            gVar2.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo2, "reportInfo");
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) gVar2.f230180d).mo141623x754a37bb(), null, new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.f(reportInfo2, j17, null), 1, null);
        }
        return jz5.f0.f384359a;
    }
}
