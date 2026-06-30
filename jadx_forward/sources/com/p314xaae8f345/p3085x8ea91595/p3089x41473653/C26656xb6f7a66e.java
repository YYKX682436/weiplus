package com.p314xaae8f345.p3085x8ea91595.p3089x41473653;

/* renamed from: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient */
/* loaded from: classes13.dex */
public class C26656xb6f7a66e extends com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09 {
    protected static final java.lang.String TAG = "TMAssistantDownloadOpenSDKClient";

    /* renamed from: _hellAccFlag_ */
    private byte f56022x7f11beae;

    /* renamed from: mListeners */
    java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26653xae3d077e> f56023x32131c52;

    /* renamed from: retryBindResult */
    protected boolean f56024xaa2cc382;

    /* renamed from: retryCount */
    protected int f56025xbaa1a747;

    public C26656xb6f7a66e(android.content.Context context, java.lang.String str, java.lang.String str2) {
        super(context, str, str2);
        this.f56024xaa2cc382 = false;
        this.f56025xbaa1a747 = 0;
        this.f56023x32131c52 = new java.util.ArrayList<>();
        this.f56040xec4f5ed = new com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.e() { // from class: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient.1
            @Override // com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.f
            /* renamed from: onActionResult */
            public void mo21513xcc9ebd72(byte[] bArr) {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e.TAG, "onActionResult  callBack data:" + bArr + "  mListeners.size:" + com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e.this.f56023x32131c52.size());
                com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26660xf61b8104.m104848x9cf0d20b().m104849x911c2eb3(bArr, com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e.this.f56023x32131c52);
            }
        };
    }

    /* renamed from: about */
    public static java.lang.String m104818x585238d() {
        return "TMAssistantDownloadOpenSDKClient_2014_03_06_11_20_release_25634";
    }

    /* renamed from: addAssistantOnActionListener */
    public void m104819x83072226(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26653xae3d077e interfaceC26653xae3d077e) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "addAssistantOnActionListener");
        if (interfaceC26653xae3d077e == null || this.f56023x32131c52.contains(interfaceC26653xae3d077e)) {
            return;
        }
        this.f56023x32131c52.add(interfaceC26653xae3d077e);
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09
    /* renamed from: getBindServiceIntent */
    public android.content.Intent mo104820x330e6bbe() {
        android.content.Intent intent = new android.content.Intent(this.f56039xb08a3c7b);
        intent.setPackage("com.tencent.android.qqdownloader");
        return intent;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09
    /* renamed from: initTMAssistantDownloadSDK */
    public synchronized boolean mo104821xc3bb29fd() {
        boolean mo104821xc3bb29fd;
        mo104821xc3bb29fd = super.mo104821xc3bb29fd();
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "initTMAssistantDownloadSDK bindResult:" + mo104821xc3bb29fd);
        if (!mo104821xc3bb29fd) {
            try {
                android.content.Intent intent = new android.content.Intent();
                intent.setClassName("com.tencent.android.qqdownloader", "com.tencent.pangu.link.LinkProxyActivity");
                intent.addFlags(268435456);
                android.content.Context context = this.f56038xd6cfe882;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadOpenSDKClient", "initTMAssistantDownloadSDK", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadOpenSDKClient", "initTMAssistantDownloadSDK", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.w(TAG, "retry bind service startActivity Exception:" + e17.toString());
            }
            final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("retry_thread");
            n3Var.mo50297x7c4d7ca2(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        android.content.Intent mo104820x330e6bbe = com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e.this.mo104820x330e6bbe();
                        com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e c26656xb6f7a66e = com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e.this;
                        c26656xb6f7a66e.f56024xaa2cc382 = c26656xb6f7a66e.f56038xd6cfe882.bindService(mo104820x330e6bbe, c26656xb6f7a66e, 1);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.e(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e.TAG, "retry bind service Exception:" + e18.toString());
                    }
                    com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e.this.f56025xbaa1a747++;
                    com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e.TAG, "retry bind service! retryBindResult:" + com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e.this.f56024xaa2cc382 + ",retryCount:" + com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e.this.f56025xbaa1a747);
                    com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e c26656xb6f7a66e2 = com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e.this;
                    if (c26656xb6f7a66e2.f56024xaa2cc382 || c26656xb6f7a66e2.f56025xbaa1a747 >= 3) {
                        return;
                    }
                    n3Var.mo50297x7c4d7ca2(this, 1000L);
                }
            }, 1000L);
        }
        return mo104821xc3bb29fd;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09
    /* renamed from: onDownloadSDKServiceInvalid */
    public void mo104822xec7c4795() {
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26653xae3d077e> arrayList = this.f56023x32131c52;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26653xae3d077e> it = this.f56023x32131c52.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26653xae3d077e next = it.next();
            if (next != null) {
                next.mo104813xec7c4795();
            }
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09
    /* renamed from: registerServiceCallback */
    public void mo104823xef0bd4f7() {
        java.lang.String m105463xa74a7ea2 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26775x762c896f.m105463xa74a7ea2(new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26776xa1a7bfb1().m105478xa0333265(java.lang.String.valueOf(java.lang.System.currentTimeMillis()).getBytes(), this.f56037x938e4a7.getBytes()), 0);
        com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.c cVar = (com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.c) this.f56041x26074c91;
        java.lang.String str = this.f56037x938e4a7;
        com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.f fVar = (com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.f) this.f56040xec4f5ed;
        com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.a aVar = (com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.a) cVar;
        aVar.getClass();
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.assistant.sdk.BaseService");
            obtain.writeString(str);
            obtain.writeString(m105463xa74a7ea2);
            obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
            aVar.f127378d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            obtain2.recycle();
            obtain.recycle();
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onServiceConnected,registerActionCallback:" + this.f56037x938e4a7 + ",tokenString:" + m105463xa74a7ea2 + ",threadId:" + java.lang.Thread.currentThread().getId() + ",mServiceCallback:" + this.f56040xec4f5ed + ",registed result:" + readInt);
            if (readInt == 2) {
                mo104822xec7c4795();
            }
        } catch (java.lang.Throwable th6) {
            obtain2.recycle();
            obtain.recycle();
            throw th6;
        }
    }

    /* renamed from: sendAsyncData */
    public void m104824xa689119e(byte[] bArr) {
        com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.c cVar;
        if (android.text.TextUtils.isEmpty(this.f56037x938e4a7) || (cVar = (com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.c) super.m104838xa7c7e97a()) == null) {
            return;
        }
        java.lang.String str = this.f56037x938e4a7;
        com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.a aVar = (com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.a) cVar;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.assistant.sdk.BaseService");
            obtain.writeString(str);
            obtain.writeByteArray(bArr);
            aVar.f127378d.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: sendSyncData */
    public byte[] m104825x856de48d(byte[] bArr) {
        com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.c cVar;
        if (android.text.TextUtils.isEmpty(this.f56037x938e4a7) || (cVar = (com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.c) super.m104838xa7c7e97a()) == null) {
            return null;
        }
        java.lang.String str = this.f56037x938e4a7;
        com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.a aVar = (com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.a) cVar;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.assistant.sdk.BaseService");
            obtain.writeString(str);
            obtain.writeByteArray(bArr);
            aVar.f127378d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09
    /* renamed from: stubAsInterface */
    public void mo104826xca6a1f99(android.os.IBinder iBinder) {
        com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.c aVar;
        int i17 = com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.b.f127379d;
        if (iBinder == null) {
            aVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.assistant.sdk.BaseService");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.c)) ? new com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.a(iBinder) : (com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.c) queryLocalInterface;
        }
        this.f56041x26074c91 = aVar;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09
    /* renamed from: unRegisterServiceCallback */
    public void mo104827x5b97421e() {
        com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.c cVar = (com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.c) this.f56041x26074c91;
        com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.f fVar = (com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.f) this.f56040xec4f5ed;
        com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.a aVar = (com.p314xaae8f345.p315x553972de.sdk.p316xc84af846.a) cVar;
        aVar.getClass();
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.assistant.sdk.BaseService");
            obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
            aVar.f127378d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 2) {
                mo104822xec7c4795();
            }
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
