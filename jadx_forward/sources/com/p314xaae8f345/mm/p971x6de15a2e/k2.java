package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes8.dex */
public class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final javax.net.ssl.HttpsURLConnection f153593a;

    public k2(java.lang.String str) {
        java.net.URL url = new java.net.URL(str);
        this.f153593a = null;
        try {
            this.f153593a = (javax.net.ssl.HttpsURLConnection) url.openConnection();
        } catch (java.net.MalformedURLException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMHttpsUrlConnection", "MalformedURLException : %s", e17.getMessage());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMHttpsUrlConnection", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMHttpsUrlConnection", "IOException : %s", e18.getMessage());
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMHttpsUrlConnection", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMHttpsUrlConnection", "Exception :" + e19.getMessage());
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMHttpsUrlConnection", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e19));
        }
    }

    public void a() {
        javax.net.ssl.HttpsURLConnection httpsURLConnection = this.f153593a;
        if (httpsURLConnection != null) {
            try {
                httpsURLConnection.getInputStream().close();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMHttpsUrlConnection", e17.getMessage());
            }
            httpsURLConnection.disconnect();
        }
    }
}
