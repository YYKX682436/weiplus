package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class w5 implements org.chromium.net.apihelpers.CronetRequestCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76020a;

    public w5(java.lang.String str) {
        this.f76020a = str;
    }

    public final void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PkgNetworkOpt", "preConnectHost, task end, url:%s, statusCode:%d", this.f76020a, java.lang.Integer.valueOf(i17));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.util.SparseLongArray sparseLongArray = com.tencent.mm.plugin.appbrand.appcache.x5.f76051b;
        synchronized (sparseLongArray) {
            sparseLongArray.put(this.f76020a.hashCode(), currentTimeMillis);
        }
    }

    @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
    public void onCanceled(org.chromium.net.UrlResponseInfo urlResponseInfo) {
        a(-2);
    }

    @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
    public void onFailed(org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
        a(-1);
    }

    @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
    public void onSucceeded(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.Object obj) {
        a(urlResponseInfo.getHttpStatusCode());
    }
}
