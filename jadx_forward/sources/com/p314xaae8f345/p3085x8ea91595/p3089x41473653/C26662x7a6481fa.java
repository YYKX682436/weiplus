package com.p314xaae8f345.p3085x8ea91595.p3089x41473653;

/* renamed from: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKURLTool */
/* loaded from: classes13.dex */
public class C26662x7a6481fa implements com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26655xe704ca24 {
    protected static final java.lang.String TAG = "TMAssistantDownloadSDKExchangeURL";

    /* renamed from: mInstance */
    protected static com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26662x7a6481fa f56055x46143c22;

    /* renamed from: engine */
    protected com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.C26689x43358f30 f56056xb297fa42;

    /* renamed from: mListener */
    protected com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26655xe704ca24 f56057x753a6c41;

    private C26662x7a6481fa(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26655xe704ca24 interfaceC26655xe704ca24) {
        this.f56057x753a6c41 = null;
        this.f56056xb297fa42 = null;
        if (interfaceC26655xe704ca24 == null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.e(TAG, "ITMAssistantExchangeURLListenner listener shouldn't be null!");
        } else {
            this.f56057x753a6c41 = interfaceC26655xe704ca24;
            this.f56056xb297fa42 = new com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.C26689x43358f30(this.f56057x753a6c41);
        }
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26662x7a6481fa m104857x9cf0d20b(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26655xe704ca24 interfaceC26655xe704ca24) {
        com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26662x7a6481fa c26662x7a6481fa;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26662x7a6481fa.class) {
            if (f56055x46143c22 == null) {
                f56055x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26662x7a6481fa(interfaceC26655xe704ca24);
            }
            c26662x7a6481fa = f56055x46143c22;
        }
        return c26662x7a6481fa;
    }

    /* renamed from: exchangeUrlsFromPackageNames */
    public void m104858x3124e333(java.util.ArrayList<java.lang.String> arrayList) {
        com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.C26689x43358f30 c26689x43358f30;
        if (arrayList == null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.w(TAG, "packageNames is null!");
            return;
        }
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26740xf8b7a5fb> arrayList2 = new java.util.ArrayList<>();
        java.util.Iterator<java.lang.String> it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String[] split = it.next().split(";");
            if (split != null && split.length > 0) {
                com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26740xf8b7a5fb c26740xf8b7a5fb = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26740xf8b7a5fb();
                c26740xf8b7a5fb.f56589x362a8ff1 = split[0];
                if (split.length > 1) {
                    c26740xf8b7a5fb.f56586x5720517e = split[1];
                }
                arrayList2.add(c26740xf8b7a5fb);
            }
        }
        if (arrayList2.size() <= 0 || (c26689x43358f30 = this.f56056xb297fa42) == null) {
            return;
        }
        c26689x43358f30.m104996x31d13e6f(arrayList2);
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26655xe704ca24
    /* renamed from: onExchangedURLSucceed */
    public void mo104817xdc6bef5(java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26741x98500544> arrayList, boolean z17) {
        com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26655xe704ca24 interfaceC26655xe704ca24 = this.f56057x753a6c41;
        if (interfaceC26655xe704ca24 != null) {
            interfaceC26655xe704ca24.mo104817xdc6bef5(arrayList, z17);
        }
    }
}
