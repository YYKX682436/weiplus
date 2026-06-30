package u6;

/* loaded from: classes13.dex */
public class o implements u6.e {

    /* renamed from: d, reason: collision with root package name */
    public final a7.c0 f506387d;

    /* renamed from: e, reason: collision with root package name */
    public final int f506388e;

    /* renamed from: f, reason: collision with root package name */
    public java.net.HttpURLConnection f506389f;

    /* renamed from: g, reason: collision with root package name */
    public java.io.InputStream f506390g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f506391h;

    static {
        new u6.n();
    }

    public o(a7.c0 c0Var, int i17) {
        this.f506387d = c0Var;
        this.f506388e = i17;
    }

    @Override // u6.e
    public java.lang.Class a() {
        return java.io.InputStream.class;
    }

    @Override // u6.e
    public t6.a b() {
        return t6.a.REMOTE;
    }

    public final java.io.InputStream c(java.net.URL url, int i17, java.net.URL url2, java.util.Map map) {
        if (i17 >= 5) {
            throw new t6.e("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new t6.e("In re-direct loop");
                }
            } catch (java.net.URISyntaxException unused) {
            }
        }
        this.f506389f = (java.net.HttpURLConnection) url.openConnection();
        for (java.util.Map.Entry entry : map.entrySet()) {
            this.f506389f.addRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        this.f506389f.setConnectTimeout(this.f506388e);
        this.f506389f.setReadTimeout(this.f506388e);
        this.f506389f.setUseCaches(false);
        this.f506389f.setDoInput(true);
        this.f506389f.setInstanceFollowRedirects(false);
        this.f506389f.connect();
        this.f506390g = this.f506389f.getInputStream();
        if (this.f506391h) {
            return null;
        }
        int responseCode = this.f506389f.getResponseCode();
        int i18 = responseCode / 100;
        if (i18 == 2) {
            java.net.HttpURLConnection httpURLConnection = this.f506389f;
            if (android.text.TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f506390g = new q7.e(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (android.util.Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.f506390g = httpURLConnection.getInputStream();
            }
            return this.f506390g;
        }
        if (!(i18 == 3)) {
            if (responseCode == -1) {
                throw new t6.e(responseCode);
            }
            throw new t6.e(this.f506389f.getResponseMessage(), responseCode);
        }
        java.lang.String headerField = this.f506389f.getHeaderField("Location");
        if (android.text.TextUtils.isEmpty(headerField)) {
            throw new t6.e("Received empty or null redirect url");
        }
        java.net.URL url3 = new java.net.URL(url, headerField);
        h();
        return c(url3, i17 + 1, url, map);
    }

    @Override // u6.e
    /* renamed from: cancel */
    public void mo751xae7a2e7a() {
        this.f506391h = true;
    }

    @Override // u6.e
    public void e(com.p147xb1cd08cc.p148x5de23a5.g gVar, u6.d dVar) {
        a7.c0 c0Var = this.f506387d;
        int i17 = q7.j.f441834b;
        long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        try {
            try {
                dVar.c(c(c0Var.d(), 0, null, c0Var.f83340b.a()));
                if (!android.util.Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            } catch (java.io.IOException e17) {
                android.util.Log.isLoggable("HttpUrlFetcher", 3);
                dVar.d(e17);
                if (!android.util.Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            }
            q7.j.a(elapsedRealtimeNanos);
        } catch (java.lang.Throwable th6) {
            if (android.util.Log.isLoggable("HttpUrlFetcher", 2)) {
                q7.j.a(elapsedRealtimeNanos);
            }
            throw th6;
        }
    }

    @Override // u6.e
    public void h() {
        java.io.InputStream inputStream = this.f506390g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException unused) {
            }
        }
        java.net.HttpURLConnection httpURLConnection = this.f506389f;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f506389f = null;
    }
}
