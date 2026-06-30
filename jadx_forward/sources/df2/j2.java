package df2;

/* loaded from: classes10.dex */
public final class j2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.k2 f311980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(df2.k2 k2Var) {
        super(0);
        this.f311980d = k2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        df2.k2 k2Var = this.f311980d;
        mn0.b0 Z6 = k2Var.Z6();
        if (Z6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "unregisterPlayerListener - Skip, cdnPlayer not available");
        } else {
            mn0.y yVar = (mn0.y) Z6;
            if (yVar.f411341g.contains(k2Var)) {
                yVar.x(k2Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "unregisterPlayerListener - Listener removed");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "unregisterPlayerListener - Skip, cdnPlayer does not contain listener");
            }
        }
        k2Var.f312078n = null;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m mVar = k2Var.f312077m;
        if (mVar != null) {
            mVar.a();
        }
        k2Var.f312077m = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "stopMediaBrowser - MediaBrowser disconnected");
        return jz5.f0.f384359a;
    }
}
