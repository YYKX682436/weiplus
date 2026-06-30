package l56;

/* loaded from: classes13.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f398214a;

    /* renamed from: b, reason: collision with root package name */
    public final l56.j f398215b;

    /* renamed from: c, reason: collision with root package name */
    public final l56.e f398216c = new l56.e();

    /* renamed from: d, reason: collision with root package name */
    public final l56.e f398217d = new l56.e();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f398218e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public java.net.HttpURLConnection f398219f;

    public f(l56.j jVar, java.lang.String str) {
        this.f398215b = jVar;
        this.f398214a = str;
    }

    public l56.g a() {
        java.net.HttpURLConnection httpURLConnection = this.f398219f;
        l56.j jVar = this.f398215b;
        httpURLConnection.setRequestMethod(jVar.name());
        java.net.HttpURLConnection httpURLConnection2 = this.f398219f;
        java.util.HashMap hashMap = (java.util.HashMap) this.f398218e;
        for (java.lang.String str : hashMap.keySet()) {
            httpURLConnection2.setRequestProperty(str, (java.lang.String) hashMap.get(str));
        }
        if (jVar.equals(l56.j.PUT) || jVar.equals(l56.j.POST)) {
            java.net.HttpURLConnection httpURLConnection3 = this.f398219f;
            try {
                byte[] bytes = this.f398217d.a().getBytes(java.nio.charset.Charset.defaultCharset().name());
                httpURLConnection3.setRequestProperty("Content-Length", java.lang.String.valueOf(bytes.length));
                if (httpURLConnection3.getRequestProperty("Content-Type") == null) {
                    httpURLConnection3.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                }
                httpURLConnection3.setDoOutput(true);
                httpURLConnection3.getOutputStream().write(bytes);
            } catch (java.io.UnsupportedEncodingException e17) {
                throw new j56.b("Unsupported Charset: " + java.nio.charset.Charset.defaultCharset().name(), e17);
            }
        }
        return new l56.g(this.f398219f);
    }

    public java.lang.String b() {
        l56.e eVar = this.f398216c;
        eVar.getClass();
        java.lang.String str = this.f398214a;
        n56.c.b(str, "Cannot append to null URL");
        java.lang.String a17 = eVar.a();
        if (a17.equals("")) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str));
        sb6.append(str.indexOf(63) != -1 ? "&" : '?');
        return java.lang.String.valueOf(sb6.toString()).concat(a17);
    }

    public l56.g c() {
        try {
            java.lang.String b17 = b();
            if (this.f398219f == null) {
                java.lang.System.setProperty("http.keepAlive", "false");
                this.f398219f = (java.net.HttpURLConnection) new java.net.URL(b17).openConnection();
            }
            return a();
        } catch (java.lang.Exception e17) {
            throw new j56.a(e17);
        }
    }
}
