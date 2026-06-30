package gx0;

/* loaded from: classes5.dex */
public final class af extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f357743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f357744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(gx0.bf bfVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357743d = bfVar;
        this.f357744e = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.af(this.f357743d, this.f357744e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.af) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (this.f357743d.f357789w != gx0.fd.f357965h) {
            return java.lang.Boolean.FALSE;
        }
        gx0.bf bfVar = this.f357743d;
        boolean booleanValue = ((java.lang.Boolean) p3325xe03a0797.p3326xc267989b.l.e(bfVar.f357785s, new gx0.ze(bfVar, null))).booleanValue();
        if (booleanValue) {
            yy0.m7 m7Var = (yy0.m7) this.f357743d.R6().O6();
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.m4(m7Var, null), 3, null);
        }
        if (!this.f357744e && booleanValue) {
            gx0.bf bfVar2 = this.f357743d;
            gx0.fd fdVar = gx0.fd.f357966i;
            bfVar2.f357789w = fdVar;
            bfVar2.f357787u.mo7808x76db6cb1(fdVar);
        }
        return java.lang.Boolean.valueOf(booleanValue);
    }
}
