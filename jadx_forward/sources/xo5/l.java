package xo5;

/* loaded from: classes14.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xo5.n f537324d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xo5.n nVar) {
        super(0);
        this.f537324d = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MVR.RenderComponentManager", "triger remote render ");
        xo5.n nVar = this.f537324d;
        yo5.e eVar = new yo5.e(0, "remote_render", 1, null);
        xo5.n nVar2 = this.f537324d;
        p3325xe03a0797.p3326xc267989b.l.d(nVar2.f537328f, null, null, new xo5.k(eVar, nVar2, null), 3, null);
        xo5.n.b(nVar, eVar, null, 0, 3, null);
        return eVar;
    }
}
