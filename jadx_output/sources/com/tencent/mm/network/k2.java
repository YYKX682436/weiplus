package com.tencent.mm.network;

/* loaded from: classes8.dex */
public class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final javax.net.ssl.HttpsURLConnection f72060a;

    public k2(java.lang.String str) {
        java.net.URL url = new java.net.URL(str);
        this.f72060a = null;
        try {
            this.f72060a = (javax.net.ssl.HttpsURLConnection) url.openConnection();
        } catch (java.net.MalformedURLException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMHttpsUrlConnection", "MalformedURLException : %s", e17.getMessage());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMHttpsUrlConnection", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMHttpsUrlConnection", "IOException : %s", e18.getMessage());
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMHttpsUrlConnection", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMHttpsUrlConnection", "Exception :" + e19.getMessage());
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMHttpsUrlConnection", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
        }
    }

    public void a() {
        javax.net.ssl.HttpsURLConnection httpsURLConnection = this.f72060a;
        if (httpsURLConnection != null) {
            try {
                httpsURLConnection.getInputStream().close();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMHttpsUrlConnection", e17.getMessage());
            }
            httpsURLConnection.disconnect();
        }
    }
}
