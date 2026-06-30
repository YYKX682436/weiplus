package dl4;

/* loaded from: classes11.dex */
public abstract class l {
    public static q11.b a(java.lang.String str, int i17, int i18) {
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.imageload.TingImageDownloader.TingHttpClientFactory", "openConnection %d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 <= 0) {
            i17 = 15000;
        }
        httpURLConnection.setConnectTimeout(i17);
        if (i18 <= 0) {
            i18 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059;
        }
        httpURLConnection.setReadTimeout(i18);
        java.io.InputStream inputStream = null;
        if (httpURLConnection.getResponseCode() >= 300) {
            try {
                httpURLConnection.getInputStream().close();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.imageload.TingImageDownloader.TingHttpClientFactory", e17.getMessage());
            }
            httpURLConnection.disconnect();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.imageload.TingImageDownloader.TingHttpClientFactory", "dz[httpURLConnectionGet 300]");
            return null;
        }
        try {
            inputStream = httpURLConnection.getInputStream();
            java.lang.String contentType = httpURLConnection.getContentType();
            byte[] d17 = com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226.f.d(inputStream, 0L, false);
            try {
                httpURLConnection.getInputStream().close();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.imageload.TingImageDownloader.TingHttpClientFactory", e18.getMessage());
            }
            httpURLConnection.disconnect();
            q11.b bVar = new q11.b(d17, contentType);
            try {
                inputStream.close();
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.imageload.TingImageDownloader.TingHttpClientFactory", e19, "httpURLConnectionGet exception", new java.lang.Object[0]);
            }
            return bVar;
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.imageload.TingImageDownloader.TingHttpClientFactory", e27, "httpURLConnectionGet exception", new java.lang.Object[0]);
                }
            }
            throw th6;
        }
    }
}
