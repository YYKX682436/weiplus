package df2;

/* loaded from: classes11.dex */
public final class i2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.k2 f311911d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(df2.k2 k2Var) {
        super(0);
        this.f311911d = k2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        df2.k2 k2Var = this.f311911d;
        if (!k2Var.a7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "startMediaBrowserIfNeeded - Skip start, switch is closed");
        } else if (!dk2.ef.f314917g) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m mVar = k2Var.f312077m;
            if (mVar != null && ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.g) mVar.f90470a).f90460b.isConnected()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "connectMediaBrowser - Already connected, skip");
            } else if (k2Var.f312079o) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "connectMediaBrowser - Connecting in progress, skip");
            } else {
                k2Var.f312079o = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "connectMediaBrowser - Creating MediaBrowser");
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m mVar2 = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.ServiceC14434x2b82fbf.class), new df2.f2(k2Var), null);
                k2Var.f312077m = mVar2;
                ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.g) mVar2.f90470a).f90460b.connect();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "startMediaBrowserIfNeeded - Skip start, current user not supported");
        }
        return jz5.f0.f384359a;
    }
}
