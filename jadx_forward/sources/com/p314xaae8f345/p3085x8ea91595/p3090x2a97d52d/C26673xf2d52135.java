package com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d;

/* renamed from: com.tencent.tmassistantsdk.downloadservice.HttpClientUtil */
/* loaded from: classes13.dex */
public class C26673xf2d52135 {
    /* renamed from: createHttpClient */
    public static org.apache.http.client.HttpClient m104946x88e1d48f() {
        org.apache.http.params.BasicHttpParams basicHttpParams = new org.apache.http.params.BasicHttpParams();
        org.apache.http.params.HttpConnectionParams.setConnectionTimeout(basicHttpParams, 30000);
        org.apache.http.params.HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        org.apache.http.params.HttpConnectionParams.setSocketBufferSize(basicHttpParams, 4096);
        org.apache.http.client.params.HttpClientParams.setRedirecting(basicHttpParams, false);
        return new org.apache.http.impl.client.DefaultHttpClient(basicHttpParams);
    }

    /* renamed from: setProxy */
    public static void m104947x538b8b2c(org.apache.http.client.HttpClient httpClient) {
        java.lang.String m104885x3d316d39 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104885x3d316d39();
        if (android.text.TextUtils.isEmpty(m104885x3d316d39)) {
            return;
        }
        if (m104885x3d316d39.equalsIgnoreCase("cmwap") || m104885x3d316d39.equalsIgnoreCase("3gwap") || m104885x3d316d39.equalsIgnoreCase("uniwap")) {
            httpClient.getParams().setParameter("http.route.default-proxy", new org.apache.http.HttpHost("10.0.0.172", 80));
        } else if (m104885x3d316d39.equalsIgnoreCase("ctwap")) {
            httpClient.getParams().setParameter("http.route.default-proxy", new org.apache.http.HttpHost("10.0.0.200", 80));
        }
    }
}
