package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes8.dex */
public class h2 implements com.p314xaae8f345.mm.p971x6de15a2e.i2 {

    /* renamed from: a, reason: collision with root package name */
    public java.net.HttpURLConnection f153550a;

    /* renamed from: b, reason: collision with root package name */
    public final int f153551b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f153552c;

    /* renamed from: d, reason: collision with root package name */
    public java.net.URL f153553d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f153554e = null;

    public h2(java.net.URL url, int i17) {
        this.f153553d = url;
        this.f153551b = i17;
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
        this.f153550a = httpURLConnection;
        if (1 == i17) {
            httpURLConnection.setInstanceFollowRedirects(false);
        }
    }

    public void a() {
        if (1 == this.f153551b && this.f153554e == null) {
            this.f153554e = this.f153550a.getRequestProperties();
        }
        this.f153550a.connect();
    }

    public java.util.Map b() {
        if (1 == this.f153551b && this.f153554e == null) {
            this.f153554e = this.f153550a.getRequestProperties();
        }
        return this.f153550a.getHeaderFields();
    }

    public void c(java.lang.String str) {
        this.f153550a.setRequestMethod(str);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    public void d(java.lang.String str) {
        this.f153550a.setRequestProperty("Referer", str);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    /* renamed from: disconnect */
    public void mo48348x1f9d589c() {
        java.net.HttpURLConnection httpURLConnection = this.f153550a;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.getInputStream().close();
            } catch (java.lang.Exception e17) {
                e17.getMessage();
            }
            this.f153550a.disconnect();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    public java.lang.String e() {
        return this.f153550a.getContentType();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    public int f() {
        int i17 = this.f153551b;
        if (1 == i17 && this.f153554e == null) {
            this.f153554e = this.f153550a.getRequestProperties();
        }
        int i18 = -1;
        try {
            i18 = this.f153550a.getResponseCode();
            if (1 != i17 || 302 != i18) {
                if (1 == i17 && 200 != i18 && com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    com.p314xaae8f345.mm.p971x6de15a2e.n.g(this.f153552c);
                }
                return i18;
            }
            java.lang.String headerField = this.f153550a.getHeaderField("Location");
            if (headerField == null) {
                return i18;
            }
            this.f153553d = new java.net.URL(this.f153553d, headerField);
            try {
                this.f153550a.getInputStream().close();
            } catch (java.lang.Exception e17) {
                e17.getMessage();
            }
            this.f153550a.disconnect();
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) this.f153553d.openConnection();
            this.f153550a = httpURLConnection;
            httpURLConnection.setInstanceFollowRedirects(false);
            java.util.Map map = this.f153554e;
            if (map != null) {
                for (java.lang.String str : map.keySet()) {
                    if (!str.equals("Host") && !str.equals("X-Online-Host")) {
                        java.util.List list = (java.util.List) this.f153554e.get(str);
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            this.f153550a.setRequestProperty(str, (java.lang.String) list.get(i19));
                        }
                    }
                }
            }
            this.f153550a.setRequestProperty("Host", this.f153553d.getHost());
            this.f153550a.setRequestProperty("X-Online-Host", this.f153553d.getHost());
            return f();
        } catch (java.lang.Exception e18) {
            if (1 == i17 && 200 != i18 && com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                com.p314xaae8f345.mm.p971x6de15a2e.n.g(this.f153552c);
            }
            throw e18;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    public void g(int i17) {
        this.f153550a.setConnectTimeout(i17);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    /* renamed from: getInputStream */
    public java.io.InputStream mo48349xc7995ab4() {
        if (1 == this.f153551b) {
            if (this.f153554e == null) {
                this.f153554e = this.f153550a.getRequestProperties();
            }
            f();
        }
        return this.f153550a.getInputStream();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    public void h(java.lang.String str, java.lang.String str2) {
        this.f153550a.setRequestProperty(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    public java.lang.String i(java.lang.String str) {
        if (1 == this.f153551b && this.f153554e == null) {
            this.f153554e = this.f153550a.getRequestProperties();
        }
        return this.f153550a.getHeaderField(str);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    public void j(boolean z17) {
        this.f153550a.setUseCaches(z17);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    public void k(int i17) {
        this.f153550a.setReadTimeout(i17);
    }

    /* renamed from: toString */
    public java.lang.String m48350x9616526c() {
        return this.f153550a.toString();
    }
}
