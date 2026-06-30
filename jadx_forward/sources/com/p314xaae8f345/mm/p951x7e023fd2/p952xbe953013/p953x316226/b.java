package com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226;

/* loaded from: classes11.dex */
public abstract class b {
    public static q11.b a(java.lang.String str, long j17) {
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
        java.io.InputStream inputStream = null;
        if (httpURLConnection.getResponseCode() >= 300) {
            try {
                httpURLConnection.getInputStream().close();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.imageload.DefaultImageDownloader.HttpClientFactory", e17.getMessage());
            }
            httpURLConnection.disconnect();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.imageload.DefaultImageDownloader.HttpClientFactory", "dz[httpURLConnectionGet 300]");
            return null;
        }
        try {
            inputStream = httpURLConnection.getInputStream();
            java.lang.String contentType = httpURLConnection.getContentType();
            byte[] d17 = com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226.f.d(inputStream, j17, false);
            try {
                httpURLConnection.getInputStream().close();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.imageload.DefaultImageDownloader.HttpClientFactory", e18.getMessage());
            }
            httpURLConnection.disconnect();
            q11.b bVar = new q11.b(d17, contentType);
            try {
                inputStream.close();
            } catch (java.lang.Exception unused) {
            }
            return bVar;
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th6;
        }
    }
}
