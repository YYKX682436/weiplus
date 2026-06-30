package tl4;

/* loaded from: classes11.dex */
public final class m extends android.media.browse.MediaBrowser.ConnectionCallback {
    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnected() {
        android.media.session.MediaSession.Token sessionToken;
        tl4.p.f501861c = false;
        android.media.browse.MediaBrowser mediaBrowser = tl4.p.f501859a;
        if (mediaBrowser == null || (sessionToken = mediaBrowser.getSessionToken()) == null) {
            return;
        }
        tl4.p.f501860b = new android.media.session.MediaController(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, sessionToken);
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionFailed() {
        tl4.p.f501861c = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlayAppSessionController", "onConnectionFailed");
        d75.b.g(tl4.n.f501857d);
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionSuspended() {
        super.onConnectionSuspended();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlayAppSessionController", "onConnectionSuspended");
    }
}
