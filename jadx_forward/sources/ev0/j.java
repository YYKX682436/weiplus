package ev0;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev0.t f338384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f338385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f338386f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ev0.t tVar, boolean z17, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f338384d = tVar;
        this.f338385e = z17;
        this.f338386f = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ev0.j(this.f338384d, this.f338385e, this.f338386f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ev0.j jVar = (ev0.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        jVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MovieComposingMusicPlayer", "pause play");
        ev0.b bVar = this.f338384d.f338412b;
        if (bVar != null) {
            kk4.b.i(bVar, this.f338385e, false, 2, null);
        }
        yz5.a aVar2 = this.f338386f;
        if (aVar2 != null) {
            aVar2.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
