package ev0;

/* loaded from: classes5.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f338395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f338396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f338397f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ev0.t f338398g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j17, long j18, ev0.t tVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f338396e = j17;
        this.f338397f = j18;
        this.f338398g = tVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ev0.o oVar = new ev0.o(this.f338396e, this.f338397f, this.f338398g, interfaceC29045xdcb5ca57);
        oVar.f338395d = obj;
        return oVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ev0.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setPlayRange [");
        long j17 = this.f338396e;
        sb6.append(j17);
        sb6.append(", ");
        long j18 = this.f338397f;
        sb6.append(j18);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MovieComposingMusicPlayer", sb6.toString());
        ev0.b bVar = this.f338398g.f338412b;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MovieComposingMusicPlayer", "setPlayRange skip: player is null");
            return f0Var;
        }
        bVar.A(true);
        bVar.H(j17, j18);
        kk4.b.f(bVar, (int) j17, false, null, 4, null);
        bVar.O();
        return f0Var;
    }
}
