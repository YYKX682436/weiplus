package tl4;

/* loaded from: classes11.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final tl4.n f501857d = new tl4.n();

    public n() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.media.browse.MediaBrowser mediaBrowser = tl4.p.f501859a;
        if (!(mediaBrowser != null && mediaBrowser.isConnected()) && !tl4.p.f501861c) {
            tl4.p.f501861c = true;
            tl4.m mVar = new tl4.m();
            tl4.p.f501862d = true;
            tl4.p.f501859a = new android.media.browse.MediaBrowser(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83.class), mVar, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlayAppSessionController", "mainThreadConnect");
            android.media.browse.MediaBrowser mediaBrowser2 = tl4.p.f501859a;
            if (mediaBrowser2 != null) {
                mediaBrowser2.connect();
            }
        }
        return jz5.f0.f384359a;
    }
}
