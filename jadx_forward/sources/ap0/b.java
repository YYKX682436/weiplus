package ap0;

/* loaded from: classes13.dex */
public abstract class b {
    public static hp0.d a(java.lang.String str) {
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
        if (httpURLConnection.getResponseCode() >= 300) {
            try {
                httpURLConnection.getInputStream().close();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageDownloader.HttpClientFactory", e17.getMessage());
            }
            httpURLConnection.disconnect();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Loader.DefaultImageDownloader.HttpClientFactory", "dz[httpURLConnectionGet 300]");
            return null;
        }
        java.io.InputStream inputStream = httpURLConnection.getInputStream();
        java.lang.String contentType = httpURLConnection.getContentType();
        byte[] a17 = ap0.h.a(inputStream);
        try {
            httpURLConnection.getInputStream().close();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageDownloader.HttpClientFactory", e18.getMessage());
        }
        httpURLConnection.disconnect();
        return new hp0.d(a17, contentType, new hp0.c(a17));
    }
}
