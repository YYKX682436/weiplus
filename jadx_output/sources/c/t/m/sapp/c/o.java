package c.t.m.sapp.c;

/* loaded from: classes7.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static int f36912a = 20000;

    public static byte[] a(java.lang.String str, byte[] bArr) {
        java.net.HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        } catch (java.lang.Throwable unused) {
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setConnectTimeout(f36912a);
            httpURLConnection.setReadTimeout(f36912a);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Length", java.lang.String.valueOf(bArr.length));
            httpURLConnection.getOutputStream().write(bArr);
            if (httpURLConnection.getResponseCode() == 200) {
                java.io.InputStream inputStream = httpURLConnection.getInputStream();
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                byte[] bArr2 = new byte[128];
                while (true) {
                    int read = inputStream.read(bArr2);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr2, 0, read);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        httpURLConnection.disconnect();
                        return byteArray;
                    }
                }
            } else {
                httpURLConnection.disconnect();
                f36912a = com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
                return null;
            }
        } catch (java.lang.Throwable unused2) {
            try {
                f36912a = com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
                return null;
            } finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
    }

    public static byte[] a(java.lang.String str) {
        try {
            java.net.URLConnection openConnection = new java.net.URL(str).openConnection();
            openConnection.connect();
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openConnection.getInputStream().read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
