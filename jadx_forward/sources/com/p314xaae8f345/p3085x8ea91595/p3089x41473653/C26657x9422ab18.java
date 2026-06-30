package com.p314xaae8f345.p3085x8ea91595.p3089x41473653;

/* renamed from: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient */
/* loaded from: classes13.dex */
public class C26657x9422ab18 extends com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09 {

    /* renamed from: DOWNDLOADSDKSERVICENAME */
    protected static final java.lang.String f56029xfd3a340e = "com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService";
    protected static final java.lang.String TAG = "TMAssistantDownloadSDKClient";

    /* renamed from: mListenerReferenceQueue */
    protected java.lang.ref.ReferenceQueue<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5> f56030x7b85f327;

    /* renamed from: mWeakListenerArrayList */
    protected java.util.ArrayList<java.lang.ref.WeakReference<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5>> f56031x47156d3e;

    public C26657x9422ab18(android.content.Context context, java.lang.String str) {
        super(context, str, f56029xfd3a340e);
        this.f56030x7b85f327 = new java.lang.ref.ReferenceQueue<>();
        this.f56031x47156d3e = new java.util.ArrayList<>();
        this.f56040xec4f5ed = new com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4.Stub() { // from class: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient.1
            @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4
            /* renamed from: OnDownloadSDKServiceTaskProgressChanged */
            public void mo104779xcbedf400(java.lang.String str2, java.lang.String str3, long j17, long j18) {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18.TAG, "OnDownloadProgressChanged,clientKey:" + str2 + ",receivedLen:" + j17 + ",totalLen:" + j18 + ",url:" + str3);
                java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5>> it = com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18.this.f56031x47156d3e.iterator();
                while (it.hasNext()) {
                    java.lang.ref.WeakReference<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5> next = it.next();
                    com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5 interfaceC26654xdda48bb5 = next.get();
                    if (interfaceC26654xdda48bb5 == null) {
                        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18.TAG, " listener = " + interfaceC26654xdda48bb5 + "   linstenerWeakReference :" + next);
                    }
                    com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26660xf61b8104.m104848x9cf0d20b().m104851x70faae5(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18.this, interfaceC26654xdda48bb5, str3, j17, j18);
                }
            }

            @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4
            /* renamed from: OnDownloadSDKServiceTaskStateChanged */
            public void mo104780xb39b9b4a(java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4, boolean z17, boolean z18) {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18.TAG, "OnDownloadStateChanged,clientKey:" + str2 + ",state:" + i17 + ", errorcode" + i18 + ",url:" + str3);
                java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5>> it = com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18.this.f56031x47156d3e.iterator();
                while (it.hasNext()) {
                    java.lang.ref.WeakReference<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5> next = it.next();
                    com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5 interfaceC26654xdda48bb5 = next.get();
                    if (interfaceC26654xdda48bb5 == null) {
                        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18.TAG, " listener = " + interfaceC26654xdda48bb5 + "   linstenerWeakReference :" + next);
                    }
                    com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26660xf61b8104.m104848x9cf0d20b().m104852x17459f1f(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18.this, interfaceC26654xdda48bb5, str3, i17, i18, str4, z17, z18);
                }
            }
        };
    }

    /* renamed from: about */
    public static java.lang.String m104828x585238d() {
        return "TMAssistantDownloadSDKClient_2014_03_06_11_20_release_25634";
    }

    /* renamed from: cancelDownloadTask */
    public synchronized void m104829x48fc89c7(java.lang.String str) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "cancelDownloadTask,clientKey:" + this.f56037x938e4a7 + ",url:" + str);
        if (str == null) {
            throw new java.lang.IllegalArgumentException("TMAssistantDownloadSDKClient.startDownloadTask url is null");
        }
        com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a interfaceC26646xb416be9a = (com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a) super.m104838xa7c7e97a();
        if (interfaceC26646xb416be9a != null) {
            interfaceC26646xb416be9a.mo104783x48fc89c7(this.f56037x938e4a7, str);
        } else {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "cancelDownloadTask, serviceInterface is null");
            super.mo104821xc3bb29fd();
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09
    /* renamed from: getBindServiceIntent */
    public android.content.Intent mo104820x330e6bbe() {
        return new android.content.Intent(this.f56038xd6cfe882, java.lang.Class.forName(this.f56039xb08a3c7b));
    }

    /* renamed from: getDownloadTaskState */
    public synchronized com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 m104830xc45041ae(java.lang.String str) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "getDownloadTaskState,clientKey:" + this.f56037x938e4a7 + ",url:" + str);
        if (str == null) {
            throw new java.lang.IllegalArgumentException("TMAssistantDownloadSDKClient.getDownloadTaskState url is null");
        }
        com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a interfaceC26646xb416be9a = (com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a) super.m104838xa7c7e97a();
        if (interfaceC26646xb416be9a != null) {
            return interfaceC26646xb416be9a.mo104784x69694ff1(this.f56037x938e4a7, str);
        }
        super.mo104821xc3bb29fd();
        return null;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09
    /* renamed from: onDownloadSDKServiceInvalid */
    public void mo104822xec7c4795() {
        java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5>> it = this.f56031x47156d3e.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26660xf61b8104.m104848x9cf0d20b().m104850x1b68c0cb(this, it.next().get());
        }
    }

    /* renamed from: pauseDownloadTask */
    public synchronized void m104831xb0172743(java.lang.String str) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "pauseDownloadTask,clientKey:" + this.f56037x938e4a7 + ",url:" + str);
        if (str == null) {
            throw new java.lang.IllegalArgumentException("TMAssistantDownloadSDKClient.startDownloadTask url is null");
        }
        com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a interfaceC26646xb416be9a = (com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a) super.m104838xa7c7e97a();
        if (interfaceC26646xb416be9a != null) {
            interfaceC26646xb416be9a.mo104787xb0172743(this.f56037x938e4a7, str);
        } else {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "pauseDownloadTask, serviceInterface is null");
            super.mo104821xc3bb29fd();
        }
    }

    /* renamed from: registerDownloadTaskListener */
    public synchronized boolean m104832xe98e4d44(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5 interfaceC26654xdda48bb5) {
        if (interfaceC26654xdda48bb5 == null) {
            return false;
        }
        while (true) {
            java.lang.ref.Reference<? extends com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5> poll = this.f56030x7b85f327.poll();
            if (poll == null) {
                break;
            }
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "registerDownloadTaskListener removed listener!!!!");
            this.f56031x47156d3e.remove(poll);
        }
        java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5>> it = this.f56031x47156d3e.iterator();
        while (it.hasNext()) {
            if (it.next().get() == interfaceC26654xdda48bb5) {
                return true;
            }
        }
        this.f56031x47156d3e.add(new java.lang.ref.WeakReference<>(interfaceC26654xdda48bb5, this.f56030x7b85f327));
        return true;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09
    /* renamed from: registerServiceCallback */
    public void mo104823xef0bd4f7() {
        ((com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a) this.f56041x26074c91).mo104788x8f0da8d5(this.f56037x938e4a7, (com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4) this.f56040xec4f5ed);
    }

    /* renamed from: startDownloadTask */
    public synchronized int m104833x729383af(java.lang.String str, java.lang.String str2) {
        return m104834x729383af(str, "", 0L, 0, str2, null, true, null);
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09
    /* renamed from: stubAsInterface */
    public void mo104826xca6a1f99(android.os.IBinder iBinder) {
        this.f56041x26074c91 = com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.Stub.m104794xbd0d1927(iBinder);
    }

    /* renamed from: unRegisterDownloadTaskListener */
    public synchronized boolean m104837xdeac007d(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5 interfaceC26654xdda48bb5) {
        if (interfaceC26654xdda48bb5 == null) {
            return false;
        }
        java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5>> it = this.f56031x47156d3e.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5> next = it.next();
            if (next.get() == interfaceC26654xdda48bb5) {
                this.f56031x47156d3e.remove(next);
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09
    /* renamed from: unRegisterServiceCallback */
    public void mo104827x5b97421e() {
        ((com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a) this.f56041x26074c91).mo104793x9e4c47ee(this.f56037x938e4a7, (com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4) this.f56040xec4f5ed);
    }

    /* renamed from: startDownloadTask */
    public synchronized int m104836x729383af(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        return m104834x729383af(str, "", 0L, 0, str2, null, true, map);
    }

    /* renamed from: startDownloadTask */
    public synchronized int m104835x729383af(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return m104834x729383af(str, "", 0L, 0, str2, str3, true, null);
    }

    /* renamed from: startDownloadTask */
    public synchronized int m104834x729383af(java.lang.String str, java.lang.String str2, long j17, int i17, java.lang.String str3, java.lang.String str4, boolean z17, java.util.Map<java.lang.String, java.lang.String> map) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "startDownloadTask,clientKey:" + this.f56037x938e4a7 + ",url:" + str + ",contentType:" + str3);
        if (str != null) {
            if (str3.equals("resource/tm.android.unknown") && android.text.TextUtils.isEmpty(str4)) {
                throw new java.lang.IllegalArgumentException("if contentType is others, filename shouldn't be null!");
            }
            com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a interfaceC26646xb416be9a = (com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a) super.m104838xa7c7e97a();
            if (interfaceC26646xb416be9a != null) {
                interfaceC26646xb416be9a.mo104789xa56831c6(z17);
                return interfaceC26646xb416be9a.mo104792x729383af(this.f56037x938e4a7, str, str2, j17, 0, str3, str4, map);
            }
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "startDownloadTask, serviceInterface is null");
            super.mo104821xc3bb29fd();
            return 0;
        }
        throw new java.lang.IllegalArgumentException("TMAssistantDownloadSDKClient.startDownloadTask url is null");
    }
}
