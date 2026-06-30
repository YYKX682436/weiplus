package ap0;

/* loaded from: classes13.dex */
public abstract class b {
    public static hp0.d a(java.lang.String str) {
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        if (httpURLConnection.getResponseCode() >= 300) {
            try {
                httpURLConnection.getInputStream().close();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageDownloader.HttpClientFactory", e17.getMessage());
            }
            httpURLConnection.disconnect();
            com.tencent.mars.xlog.Log.w("MicroMsg.Loader.DefaultImageDownloader.HttpClientFactory", "dz[httpURLConnectionGet 300]");
            return null;
        }
        java.io.InputStream inputStream = httpURLConnection.getInputStream();
        java.lang.String contentType = httpURLConnection.getContentType();
        byte[] a17 = ap0.h.a(inputStream);
        try {
            httpURLConnection.getInputStream().close();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageDownloader.HttpClientFactory", e18.getMessage());
        }
        httpURLConnection.disconnect();
        return new hp0.d(a17, contentType, new hp0.c(a17));
    }
}
