package eb2;

/* loaded from: classes2.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u26.w f332375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f332376e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u26.w wVar, com.p314xaae8f345.mm.p944x882e457a.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f332375d = wVar;
        this.f332376e = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new eb2.r(this.f332375d, this.f332376e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        eb2.r rVar = (eb2.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        rVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.EnhanceStreamFetcher", "send...");
        com.p314xaae8f345.mm.p944x882e457a.f it = this.f332376e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "$it");
        java.lang.Object e17 = this.f332375d.e(it);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("done[");
        sb6.append(!(e17 instanceof u26.b0));
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.EnhanceStreamFetcher", sb6.toString());
        return jz5.f0.f384359a;
    }
}
