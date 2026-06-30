package gx0;

/* loaded from: classes5.dex */
public final class d9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.p9 f357857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f357858e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(gx0.p9 p9Var, float f17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357857d = p9Var;
        this.f357858e = f17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.d9(this.f357857d, this.f357858e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.d9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        gx0.p9 p9Var = this.f357857d;
        ex0.a0 a0Var = p9Var.u7().f358175r;
        ex0.o o17 = a0Var != null ? a0Var.o() : null;
        jz5.f0 f0Var = jz5.f0.f384359a;
        float f17 = this.f357858e;
        if (o17 != null) {
            o17.E(f17);
            p9Var.t7().c7();
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieMusicTipUIC", "changeBgmVolume: musicSegmentVM is null, value=" + f17 + " cached in picker, will be applied on commit");
        return f0Var;
    }
}
