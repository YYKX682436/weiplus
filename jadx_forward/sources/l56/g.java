package l56;

/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f398220a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f398221b;

    /* renamed from: c, reason: collision with root package name */
    public final java.io.InputStream f398222c;

    public g(java.net.HttpURLConnection httpURLConnection) {
        boolean z17;
        try {
            httpURLConnection.connect();
            this.f398220a = httpURLConnection.getResponseCode();
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<java.lang.String> it = httpURLConnection.getHeaderFields().keySet().iterator();
            while (true) {
                z17 = false;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String next = it.next();
                hashMap.put(next, httpURLConnection.getHeaderFields().get(next).get(0));
            }
            int i17 = this.f398220a;
            if (i17 >= 200 && i17 < 400) {
                z17 = true;
            }
            this.f398222c = z17 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        } catch (java.net.UnknownHostException e17) {
            throw new j56.b("The IP address of a host could not be determined.", e17);
        }
    }

    public java.lang.String a() {
        int read;
        java.lang.String str = this.f398221b;
        if (str == null) {
            java.io.InputStream inputStream = this.f398222c;
            n56.c.b(inputStream, "Cannot get String from a null object");
            try {
                char[] cArr = new char[65536];
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                do {
                    read = inputStreamReader.read(cArr, 0, 65536);
                    if (read > 0) {
                        sb6.append(cArr, 0, read);
                    }
                } while (read >= 0);
                inputStreamReader.close();
                str = sb6.toString();
                this.f398221b = str;
            } catch (java.io.IOException e17) {
                throw new java.lang.IllegalStateException("Error while reading response body", e17);
            }
        }
        return str;
    }
}
