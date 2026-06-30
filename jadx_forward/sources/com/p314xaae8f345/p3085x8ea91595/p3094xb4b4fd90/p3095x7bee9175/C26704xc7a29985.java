package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175;

/* renamed from: com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled */
/* loaded from: classes13.dex */
public class C26704xc7a29985 extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = "QQDownloaderInstalled";

    /* renamed from: mInstance */
    protected static com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26704xc7a29985 f56339x46143c22;

    /* renamed from: isRegisted */
    protected boolean f56340xa793d5df = false;

    /* renamed from: mListener */
    protected com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26704xc7a29985.IQQDownloaderInstalled f56341x753a6c41 = null;

    /* renamed from: com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled$IQQDownloaderInstalled */
    /* loaded from: classes13.dex */
    public interface IQQDownloaderInstalled {
        /* renamed from: onQQDownloaderInstalled */
        void mo105056xc09a3d06(android.content.Context context);
    }

    private C26704xc7a29985() {
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26704xc7a29985 m105051x9cf0d20b() {
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26704xc7a29985 c26704xc7a29985;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26704xc7a29985.class) {
            if (f56339x46143c22 == null) {
                f56339x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26704xc7a29985();
            }
            c26704xc7a29985 = f56339x46143c22;
        }
        return c26704xc7a29985;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onReceive!");
        ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled.1
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26704xc7a29985.IQQDownloaderInstalled iQQDownloaderInstalled = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26704xc7a29985.this.f56341x753a6c41;
                if (iQQDownloaderInstalled != null) {
                    iQQDownloaderInstalled.mo105056xc09a3d06(context);
                }
            }
        });
    }

    /* renamed from: registeListener */
    public void m105052xa5e4d183(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26704xc7a29985.IQQDownloaderInstalled iQQDownloaderInstalled) {
        this.f56341x753a6c41 = iQQDownloaderInstalled;
    }

    /* renamed from: registeReceiver */
    public void m105053x2573f6be(android.content.Context context) {
        if (this.f56340xa793d5df) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "registeReceiver   context" + context + "  receiver:" + this);
        try {
            this.f56340xa793d5df = true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "registeReceiver exception!!!");
            this.f56340xa793d5df = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: unRegisteReceiver */
    public void m105054xb4567ae5(android.content.Context context) {
        if (context == null || f56339x46143c22 == null || !this.f56340xa793d5df) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "realy unRegisteReceiver  context:" + context + "  receiver:" + this);
        try {
            this.f56340xa793d5df = false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "unRegisteReceiver exception!!!");
            this.f56340xa793d5df = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: unregisteListener */
    public void m105055x70349dca() {
        this.f56341x753a6c41 = null;
    }
}
