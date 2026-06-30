package com.p314xaae8f345.p3085x8ea91595.p3089x41473653;

/* renamed from: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase */
/* loaded from: classes13.dex */
public abstract class AbstractServiceConnectionC26658x1e46da09 implements android.content.ServiceConnection {

    /* renamed from: CONNTECTSTATE_CONNECTING */
    public static final java.lang.String f56033x84088314 = "CONNECTING";

    /* renamed from: CONNTECTSTATE_FINISH */
    public static final java.lang.String f56034x4ea926ef = "FINISH";

    /* renamed from: CONNTECTSTATE_INIT */
    public static final java.lang.String f56035xc79cea6c = "INIT";
    protected static final java.lang.String TAG = "TMAssistantDownloadSDKClient";

    /* renamed from: mClientKey */
    public java.lang.String f56037x938e4a7;

    /* renamed from: mContext */
    protected android.content.Context f56038xd6cfe882;

    /* renamed from: mDwonloadServiceName */
    protected java.lang.String f56039xb08a3c7b;

    /* renamed from: connectState */
    protected java.lang.String f56036x716c5dc7 = f56035xc79cea6c;

    /* renamed from: mServiceInterface */
    protected android.os.IInterface f56041x26074c91 = null;

    /* renamed from: mServiceCallback */
    protected android.os.IInterface f56040xec4f5ed = null;

    /* renamed from: mThreadlock */
    protected final java.lang.Object f56042x959bb682 = new java.lang.Object();

    public AbstractServiceConnectionC26658x1e46da09(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.f56038xd6cfe882 = context;
        this.f56037x938e4a7 = str;
        this.f56039xb08a3c7b = str2;
    }

    /* renamed from: getBindServiceIntent */
    public abstract android.content.Intent mo104820x330e6bbe();

    /* renamed from: getServiceInterface */
    public android.os.IInterface m104838xa7c7e97a() {
        android.content.Context context = this.f56038xd6cfe882;
        if (context != null && context.getMainLooper().getThread().getId() == java.lang.Thread.currentThread().getId()) {
            throw new java.lang.Exception("TMAssistantDownloadSDKClient must be called in other Thread(no MainThread)");
        }
        if (this.f56041x26074c91 == null) {
            mo104821xc3bb29fd();
            this.f56036x716c5dc7 = f56033x84088314;
            synchronized (this.f56042x959bb682) {
                this.f56042x959bb682.wait(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            }
        }
        android.os.IInterface iInterface = this.f56041x26074c91;
        if (iInterface != null) {
            return iInterface;
        }
        throw new java.lang.Exception("TMAssistantDownloadSDKClient ServiceInterface is null");
    }

    /* renamed from: initTMAssistantDownloadSDK */
    public synchronized boolean mo104821xc3bb29fd() {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "connectState = " + this.f56036x716c5dc7);
        if (this.f56036x716c5dc7 != f56035xc79cea6c) {
            return true;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "initTMAssistantDownloadSDK,clientKey:" + this.f56037x938e4a7 + ",mServiceInterface:" + this.f56041x26074c91 + ",threadId:" + java.lang.Thread.currentThread().getId());
        this.f56036x716c5dc7 = f56035xc79cea6c;
        if (this.f56041x26074c91 != null) {
            this.f56036x716c5dc7 = f56034x4ea926ef;
            return true;
        }
        boolean z17 = false;
        if (this.f56038xd6cfe882 != null && this.f56039xb08a3c7b != null) {
            try {
                z17 = this.f56038xd6cfe882.bindService(mo104820x330e6bbe(), this, 1);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "initTMAssistantDownloadSDK bindResult:" + z17);
        }
        return z17;
    }

    /* renamed from: onDownloadSDKServiceInvalid */
    public abstract void mo104822xec7c4795();

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        mo104826xca6a1f99(iBinder);
        this.f56036x716c5dc7 = f56034x4ea926ef;
        synchronized (this.f56042x959bb682) {
            this.f56042x959bb682.notifyAll();
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onServiceConnected,clientKey:" + this.f56037x938e4a7 + ",mServiceInterface:" + this.f56041x26074c91 + ",IBinder:" + iBinder + ",threadId:" + java.lang.Thread.currentThread().getId());
        try {
            if (this.f56041x26074c91 == null || this.f56040xec4f5ed == null) {
                return;
            }
            mo104823xef0bd4f7();
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onServiceConnected, exception : " + e17.getMessage());
            mo104822xec7c4795();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onServiceDisconnected,clientKey:" + this.f56037x938e4a7);
        synchronized (this) {
            this.f56041x26074c91 = null;
            this.f56036x716c5dc7 = f56035xc79cea6c;
            synchronized (this.f56042x959bb682) {
                this.f56042x959bb682.notifyAll();
            }
            mo104822xec7c4795();
        }
    }

    /* renamed from: registerServiceCallback */
    public abstract void mo104823xef0bd4f7();

    /* renamed from: stubAsInterface */
    public abstract void mo104826xca6a1f99(android.os.IBinder iBinder);

    /* renamed from: unInitTMAssistantDownloadSDK */
    public synchronized void m104839x38ee5776() {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "unInitTMAssistantDownloadSDK,clientKey:" + this.f56037x938e4a7 + ",mServiceInterface:" + this.f56041x26074c91 + ",threadId:" + java.lang.Thread.currentThread().getId());
        if (this.f56041x26074c91 != null && this.f56040xec4f5ed != null) {
            try {
                mo104827x5b97421e();
            } catch (android.os.RemoteException unused) {
            }
        }
        android.content.Context context = this.f56038xd6cfe882;
        if (context != null && this.f56041x26074c91 != null) {
            context.unbindService(this);
        }
        this.f56041x26074c91 = null;
        this.f56040xec4f5ed = null;
        this.f56036x716c5dc7 = f56035xc79cea6c;
    }

    /* renamed from: unRegisterServiceCallback */
    public abstract void mo104827x5b97421e();
}
