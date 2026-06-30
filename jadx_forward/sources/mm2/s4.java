package mm2;

/* loaded from: classes3.dex */
public final class s4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f410946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.v4 f410947e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, mm2.v4 v4Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f410946d = hVar;
        this.f410947e = v4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mm2.s4(this.f410946d, interfaceC29045xdcb5ca57, this.f410947e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mm2.s4 s4Var = (mm2.s4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        s4Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f410946d).f535914b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f410947e.f411009f, "getLotteryInfo " + aVar2);
        return jz5.f0.f384359a;
    }
}
