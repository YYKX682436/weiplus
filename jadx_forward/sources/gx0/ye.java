package gx0;

/* loaded from: classes5.dex */
public final class ye extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f358767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358768e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f358769f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f358770g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f358771h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f358772i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye(boolean z17, gx0.bf bfVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, int i17, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358767d = z17;
        this.f358768e = bfVar;
        this.f358769f = c4128x879fba0a;
        this.f358770g = i17;
        this.f358771h = c4129xdee64553;
        this.f358772i = z18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.ye(this.f358767d, this.f358768e, this.f358769f, this.f358770g, this.f358771h, this.f358772i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ye) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f358767d;
        gx0.bf bfVar = this.f358768e;
        if (z17 && !bfVar.m7()) {
            return java.lang.Boolean.FALSE;
        }
        gx0.bf bfVar2 = this.f358768e;
        boolean booleanValue = ((java.lang.Boolean) p3325xe03a0797.p3326xc267989b.l.e(bfVar2.f357785s, new gx0.xe(bfVar2, this.f358769f, this.f358770g, this.f358771h, this.f358772i, null))).booleanValue();
        if (booleanValue) {
            gx0.fd fdVar = gx0.fd.f357965h;
            bfVar.f357789w = fdVar;
            bfVar.f357787u.mo7808x76db6cb1(fdVar);
        }
        return java.lang.Boolean.valueOf(booleanValue);
    }
}
