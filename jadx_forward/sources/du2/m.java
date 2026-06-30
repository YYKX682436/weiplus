package du2;

/* loaded from: classes2.dex */
public final class m extends p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ du2.n f325016c;

    public m(du2.n nVar) {
        this.f325016c = nVar;
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d
    public void a() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 b17;
        du2.n nVar = this.f325016c;
        nVar.f325019f = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "[onConnected] MediaBrowser connected successfully");
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m mVar = nVar.f325021h;
        if (mVar == null || (b17 = mVar.b()) == null) {
            return;
        }
        nVar.f325020g = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b17);
        nVar.Ri();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "[onConnected] MediaController created");
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d
    public void b() {
        du2.n nVar = this.f325016c;
        nVar.f325019f = false;
        nVar.f325020g = null;
        nVar.f325021h = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "onConnectionFailed");
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "onConnectionSuspended");
    }
}
