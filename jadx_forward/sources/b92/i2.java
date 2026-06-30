package b92;

/* loaded from: classes.dex */
public final class i2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f99974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b92.m2 f99975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, b92.m2 m2Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f99974d = hVar;
        this.f99975e = m2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b92.i2(this.f99974d, interfaceC29045xdcb5ca57, this.f99975e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        b92.i2 i2Var = (b92.i2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        i2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.je2 je2Var = (r45.je2) ((xg2.i) this.f99974d).f535926b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveQosReportService", "reportLoop: cgi success, report_interval=" + je2Var.m75939xb282bd08(1));
        if (je2Var.m75939xb282bd08(1) > 0) {
            this.f99975e.f100017g = je2Var.m75939xb282bd08(1) * 1000;
        }
        return jz5.f0.f384359a;
    }
}
