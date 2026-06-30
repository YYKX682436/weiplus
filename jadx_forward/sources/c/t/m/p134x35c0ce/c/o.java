package c.t.m.p134x35c0ce.c;

/* loaded from: classes7.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static int f118445a = 20000;

    public static byte[] a(java.lang.String str, byte[] bArr) {
        java.net.HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        } catch (java.lang.Throwable unused) {
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setConnectTimeout(f118445a);
            httpURLConnection.setReadTimeout(f118445a);
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
                f118445a = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059;
                return null;
            }
        } catch (java.lang.Throwable unused2) {
            try {
                f118445a = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059;
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
