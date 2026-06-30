package ch2;

/* loaded from: classes10.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f122981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ om2.i f122982e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, om2.i iVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122981d = hVar;
        this.f122982e = iVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ch2.q1(this.f122981d, interfaceC29045xdcb5ca57, this.f122982e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ch2.q1 q1Var = (ch2.q1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        q1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVSingController", "reportSingScore fail songUniqueId: " + this.f122982e.c() + " error: " + ((xg2.a) ((xg2.b) this.f122981d).f535914b));
        return jz5.f0.f384359a;
    }
}
