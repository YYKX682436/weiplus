package com.tencent.mm.modelimage.loader.impr;

/* loaded from: classes11.dex */
public abstract class b {
    public static q11.b a(java.lang.String str, long j17) {
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        java.io.InputStream inputStream = null;
        if (httpURLConnection.getResponseCode() >= 300) {
            try {
                httpURLConnection.getInputStream().close();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.imageload.DefaultImageDownloader.HttpClientFactory", e17.getMessage());
            }
            httpURLConnection.disconnect();
            com.tencent.mars.xlog.Log.w("MicroMsg.imageload.DefaultImageDownloader.HttpClientFactory", "dz[httpURLConnectionGet 300]");
            return null;
        }
        try {
            inputStream = httpURLConnection.getInputStream();
            java.lang.String contentType = httpURLConnection.getContentType();
            byte[] d17 = com.tencent.mm.modelimage.loader.impr.f.d(inputStream, j17, false);
            try {
                httpURLConnection.getInputStream().close();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.imageload.DefaultImageDownloader.HttpClientFactory", e18.getMessage());
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
