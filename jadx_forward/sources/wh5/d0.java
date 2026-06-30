package wh5;

/* loaded from: classes12.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l70.d f527577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l70.d f527578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f527579f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wh5.g0 f527580g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wh5.v f527581h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(l70.d dVar, l70.d dVar2, mf3.k kVar, wh5.g0 g0Var, wh5.v vVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f527577d = dVar;
        this.f527578e = dVar2;
        this.f527579f = kVar;
        this.f527580g = g0Var;
        this.f527581h = vVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wh5.d0(this.f527577d, this.f527578e, this.f527579f, this.f527580g, this.f527581h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wh5.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        l70.d dVar = this.f527577d;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(dVar.f398338f);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        boolean F = !m17.a() ? false : m17.f294799a.F(m17.f294800b);
        jz5.f0 f0Var = jz5.f0.f384359a;
        wh5.g0 g0Var = this.f527580g;
        if (F) {
            l70.d dVar2 = this.f527578e;
            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(dVar2.f398338f);
            java.lang.String str2 = a18.f294812f;
            if (str2 != null) {
                java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l18)) {
                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
            if (m18.a() ? m18.f294799a.F(m18.f294800b) : false) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("live res already exists. mediaId: ");
                mf3.k kVar = this.f527579f;
                sb6.append(kVar.mo2110x5db1b11());
                sb6.append(" videoPath: ");
                sb6.append(dVar.f398338f);
                sb6.append(" imagePath: ");
                sb6.append(dVar2.f398338f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.ChatLiveStateManager", sb6.toString());
                wh5.g0.b7(g0Var, kVar, dVar.f398338f);
                vf3.i.Z6(this.f527580g, this.f527579f, vf3.e.f517911e, null, null, null, 14, null);
                return f0Var;
            }
        }
        vf3.i.Z6(this.f527580g, this.f527579f, vf3.e.f517913g, null, null, null, 14, null);
        l70.d dVar3 = this.f527577d;
        l70.d dVar4 = this.f527578e;
        g0Var.getClass();
        wh5.v vVar = this.f527581h;
        v65.i.b(g0Var.f517934f, null, new wh5.f0(g0Var, vVar, dVar4, dVar3, vVar.mo2110x5db1b11(), null), 1, null);
        return f0Var;
    }
}
