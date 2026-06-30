package sg0;

/* loaded from: classes8.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f489278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sg0.w2 f489279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f489280f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(long j17, sg0.w2 w2Var, p3325xe03a0797.p3326xc267989b.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489278d = j17;
        this.f489279e = w2Var;
        this.f489280f = y0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sg0.l2(this.f489278d, this.f489279e, this.f489280f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sg0.l2 l2Var = (sg0.l2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        l2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        sg0.j2 j2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.m2 m2Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("disposeSearchResultPage ");
        long j17 = this.f489278d;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.WebSearchFlutterService", sb6.toString());
        sg0.w2 w2Var = this.f489279e;
        java.lang.String str = (java.lang.String) w2Var.f489383n.remove(new java.lang.Long(j17));
        sg0.i2 i2Var = (sg0.i2) w2Var.f489385p.remove(new java.lang.Long(j17));
        if (i2Var != null && (j2Var = i2Var.f489256a) != null && (m2Var = j2Var.f489266a) != null) {
            m2Var.b(null);
        }
        if (str != null) {
            try {
                ou4.e0 hj6 = w2Var.hj();
                if (hj6 != null) {
                    ((ou4.z) hj6).Ai(str);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.WebSearchFlutterService", "Container destroyed: ".concat(str));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.hitest.WebSearchFlutterService", "Failed to destroy container: ".concat(str), e17);
            }
        }
        p3325xe03a0797.p3326xc267989b.z0.e(this.f489280f, null, 1, null);
        return jz5.f0.f384359a;
    }
}
