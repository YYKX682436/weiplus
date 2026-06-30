package com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d;

/* renamed from: com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver */
/* loaded from: classes13.dex */
public class C26675xcb69b97b extends android.content.BroadcastReceiver {

    /* renamed from: MSG_DELAY_TIME */
    protected static final int f56206x63d79bc7 = 3500;

    /* renamed from: MSG_resumeDownloadTime */
    protected static final int f56207x6ebdc1e0 = 67;
    protected static final java.lang.String TAG = "NetworkMonitorReceiver";

    /* renamed from: mInstance */
    protected static com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b f56208x46143c22;

    /* renamed from: isRegisterReceiver */
    protected boolean f56209x6befe6fc = false;

    /* renamed from: mNetworkChangedHandler */
    protected final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f56210xdc9b5d57 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3() { // from class: com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.1
        @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
        /* renamed from: handleMessage */
        public void mo1038x5b586cbf(android.os.Message message) {
            if (message.what != 67) {
                return;
            }
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.this.m104952xbfcae04f();
        }
    };

    /* renamed from: mObs */
    java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.INetworkChangedObserver> f56211x32c153 = new java.util.ArrayList<>();

    /* renamed from: com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver$INetworkChangedObserver */
    /* loaded from: classes13.dex */
    public interface INetworkChangedObserver {
        /* renamed from: onNetworkChanged */
        void mo104866xf54d1865();
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b m104950x9cf0d20b() {
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b c26675xcb69b97b;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.class) {
            if (f56208x46143c22 == null) {
                f56208x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b();
            }
            c26675xcb69b97b = f56208x46143c22;
        }
        return c26675xcb69b97b;
    }

    /* renamed from: addNetworkChangedObserver */
    public void m104951xb6a2a79d(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.INetworkChangedObserver iNetworkChangedObserver) {
        if (this.f56211x32c153.contains(iNetworkChangedObserver) || iNetworkChangedObserver == null) {
            return;
        }
        this.f56211x32c153.add(iNetworkChangedObserver);
    }

    /* renamed from: notifyNetworkChanged */
    public void m104952xbfcae04f() {
        java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.INetworkChangedObserver> it = this.f56211x32c153.iterator();
        while (it.hasNext()) {
            it.next().mo104866xf54d1865();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "network changed!");
        this.f56210xdc9b5d57.mo50303x856b99f0(67);
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 67;
        this.f56210xdc9b5d57.mo50311x7ab51103(obtain, 3500L);
    }

    /* renamed from: registerReceiver */
    public void m104953xc20729b2() {
        android.content.Context m105492x76847179 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105492x76847179();
        if (m105492x76847179 == null) {
            return;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
        try {
            m105492x76847179.registerReceiver(this, intentFilter);
            this.f56209x6befe6fc = true;
        } catch (java.lang.Throwable th6) {
            this.f56209x6befe6fc = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: removeNetworkChangedObserver */
    public void m104954x972dcb40(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.INetworkChangedObserver iNetworkChangedObserver) {
        if (iNetworkChangedObserver != null) {
            this.f56211x32c153.remove(iNetworkChangedObserver);
        }
    }

    /* renamed from: unregisterReceiver */
    public void m104955x41b0e64b() {
        android.content.Context m105492x76847179;
        if (f56208x46143c22 == null || (m105492x76847179 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105492x76847179()) == null) {
            return;
        }
        try {
            if (this.f56209x6befe6fc) {
                m105492x76847179.unregisterReceiver(this);
                this.f56209x6befe6fc = false;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "", new java.lang.Object[0]);
        }
    }
}
