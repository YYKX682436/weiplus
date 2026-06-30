package df2;

/* loaded from: classes11.dex */
public final class f2 extends p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ df2.k2 f311634c;

    public f2(df2.k2 k2Var) {
        this.f311634c = k2Var;
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d
    public void a() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 b17;
        df2.k2 k2Var = this.f311634c;
        k2Var.f312079o = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "onConnected - MediaBrowser connected successfully");
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m mVar = k2Var.f312077m;
        if (mVar != null && (b17 = mVar.b()) != null) {
            k2Var.f312078n = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "onConnected - MediaController created");
        }
        k2Var.e7();
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d
    public void b() {
        df2.k2 k2Var = this.f311634c;
        k2Var.f312079o = false;
        k2Var.f312077m = null;
        k2Var.f312078n = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveMediaBrowserController", "onConnectionFailed - Connection failed");
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveMediaBrowserController", "onConnectionSuspended - Connection suspended");
    }
}
