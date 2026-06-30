package ug0;

/* loaded from: classes8.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f508995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f508996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f508997f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f508998g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z17, int i17, int i18, byte[] bArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f508995d = z17;
        this.f508996e = i17;
        this.f508997f = i18;
        this.f508998g = bArr;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ug0.l(this.f508995d, this.f508996e, this.f508997f, this.f508998g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ug0.l lVar = (ug0.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        lVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f508995d;
        int i17 = this.f508997f;
        int i18 = this.f508996e;
        if (z17) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27379x973a84d7.m113806x9cf0d20b().m113809xc9f62e0e(9, i18, i17);
        } else {
            byte[] bArr = this.f508998g;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = bArr != null ? new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length) : null;
            java.lang.String i19 = gVar != null ? gVar.i() : null;
            if (i19 == null) {
                i19 = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "nativeSync, contextBuffer String: ".concat(i19));
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27379x973a84d7.m113806x9cf0d20b().m113808xb0e85dc6(9, i18, i19, i17);
        }
        return jz5.f0.f384359a;
    }
}
