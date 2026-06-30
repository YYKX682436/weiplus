package com.p314xaae8f345.p3210x3857dc;

/* renamed from: com.tencent.xweb.WebView$$a */
/* loaded from: classes13.dex */
public final /* synthetic */ class CallableC27817xc6731548 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx5.i f301734d;

    public /* synthetic */ CallableC27817xc6731548(tx5.i iVar) {
        this.f301734d = iVar;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        com.p314xaae8f345.p3210x3857dc.f1 f1Var = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301722m;
        by5.c4.a("WebView", "initWebViewCoreComponentsWrapper, setting ProfileStore, CookieManager, WebStorage.");
        com.p314xaae8f345.p3210x3857dc.c0 a17 = com.p314xaae8f345.p3210x3857dc.c0.a();
        tx5.i iVar = this.f301734d;
        tx5.d mo120518xa93cb32e = iVar.mo120518xa93cb32e();
        a17.getClass();
        by5.a1.a();
        by5.c4.f("ProfileStore", "setProfileStoreWrapper:" + mo120518xa93cb32e);
        a17.f301752a = mo120518xa93cb32e;
        com.p314xaae8f345.p3210x3857dc.d g17 = com.p314xaae8f345.p3210x3857dc.d.g();
        tx5.b mo120517x5ad7a0f3 = iVar.mo120517x5ad7a0f3();
        g17.getClass();
        if (mo120517x5ad7a0f3 == null) {
            by5.c4.g("CookieManager", "Constructing with null object.");
        } else {
            by5.c4.f("CookieManager", "setCookieManagerWrapper: " + mo120517x5ad7a0f3);
            g17.f301769a = mo120517x5ad7a0f3;
        }
        com.p314xaae8f345.p3210x3857dc.a1 c17 = com.p314xaae8f345.p3210x3857dc.a1.c();
        tx5.e e17 = iVar.e();
        c17.getClass();
        if (e17 == null) {
            by5.c4.g("WebStorage", "Constructing with null object.");
            return null;
        }
        by5.c4.f("WebStorage", "setWebStorageWrapper: " + e17);
        c17.f301740a = e17;
        return null;
    }
}
