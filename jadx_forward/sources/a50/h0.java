package a50;

/* loaded from: classes11.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1 f83023d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1 a1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f83023d = a1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a50.h0(this.f83023d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        a50.h0 h0Var = (a50.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        h0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        a50.j0 j0Var = a50.j0.f83029a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init finder live dot mode: ");
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1 a1Var = this.f83023d;
        sb6.append(a1Var.c().name());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxBizFlutterDigestHelper", sb6.toString());
        boolean l17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a.l(a1Var);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270735f = a1Var;
        if (l17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxBizFlutterDigestHelper", "update main session by finder info change");
            a50.j0.f83029a.a(a50.a.f82980m, null);
        }
        return jz5.f0.f384359a;
    }
}
