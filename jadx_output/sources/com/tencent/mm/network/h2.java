package com.tencent.mm.network;

/* loaded from: classes8.dex */
public class h2 implements com.tencent.mm.network.i2 {

    /* renamed from: a, reason: collision with root package name */
    public java.net.HttpURLConnection f72017a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72018b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f72019c;

    /* renamed from: d, reason: collision with root package name */
    public java.net.URL f72020d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f72021e = null;

    public h2(java.net.URL url, int i17) {
        this.f72020d = url;
        this.f72018b = i17;
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
        this.f72017a = httpURLConnection;
        if (1 == i17) {
            httpURLConnection.setInstanceFollowRedirects(false);
        }
    }

    public void a() {
        if (1 == this.f72018b && this.f72021e == null) {
            this.f72021e = this.f72017a.getRequestProperties();
        }
        this.f72017a.connect();
    }

    public java.util.Map b() {
        if (1 == this.f72018b && this.f72021e == null) {
            this.f72021e = this.f72017a.getRequestProperties();
        }
        return this.f72017a.getHeaderFields();
    }

    public void c(java.lang.String str) {
        this.f72017a.setRequestMethod(str);
    }

    @Override // com.tencent.mm.network.i2
    public void d(java.lang.String str) {
        this.f72017a.setRequestProperty("Referer", str);
    }

    @Override // com.tencent.mm.network.i2
    public void disconnect() {
        java.net.HttpURLConnection httpURLConnection = this.f72017a;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.getInputStream().close();
            } catch (java.lang.Exception e17) {
                e17.getMessage();
            }
            this.f72017a.disconnect();
        }
    }

    @Override // com.tencent.mm.network.i2
    public java.lang.String e() {
        return this.f72017a.getContentType();
    }

    @Override // com.tencent.mm.network.i2
    public int f() {
        int i17 = this.f72018b;
        if (1 == i17 && this.f72021e == null) {
            this.f72021e = this.f72017a.getRequestProperties();
        }
        int i18 = -1;
        try {
            i18 = this.f72017a.getResponseCode();
            if (1 != i17 || 302 != i18) {
                if (1 == i17 && 200 != i18 && com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    com.tencent.mm.network.n.g(this.f72019c);
                }
                return i18;
            }
            java.lang.String headerField = this.f72017a.getHeaderField("Location");
            if (headerField == null) {
                return i18;
            }
            this.f72020d = new java.net.URL(this.f72020d, headerField);
            try {
                this.f72017a.getInputStream().close();
            } catch (java.lang.Exception e17) {
                e17.getMessage();
            }
            this.f72017a.disconnect();
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) this.f72020d.openConnection();
            this.f72017a = httpURLConnection;
            httpURLConnection.setInstanceFollowRedirects(false);
            java.util.Map map = this.f72021e;
            if (map != null) {
                for (java.lang.String str : map.keySet()) {
                    if (!str.equals("Host") && !str.equals("X-Online-Host")) {
                        java.util.List list = (java.util.List) this.f72021e.get(str);
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            this.f72017a.setRequestProperty(str, (java.lang.String) list.get(i19));
                        }
                    }
                }
            }
            this.f72017a.setRequestProperty("Host", this.f72020d.getHost());
            this.f72017a.setRequestProperty("X-Online-Host", this.f72020d.getHost());
            return f();
        } catch (java.lang.Exception e18) {
            if (1 == i17 && 200 != i18 && com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                com.tencent.mm.network.n.g(this.f72019c);
            }
            throw e18;
        }
    }

    @Override // com.tencent.mm.network.i2
    public void g(int i17) {
        this.f72017a.setConnectTimeout(i17);
    }

    @Override // com.tencent.mm.network.i2
    public java.io.InputStream getInputStream() {
        if (1 == this.f72018b) {
            if (this.f72021e == null) {
                this.f72021e = this.f72017a.getRequestProperties();
            }
            f();
        }
        return this.f72017a.getInputStream();
    }

    @Override // com.tencent.mm.network.i2
    public void h(java.lang.String str, java.lang.String str2) {
        this.f72017a.setRequestProperty(str, str2);
    }

    @Override // com.tencent.mm.network.i2
    public java.lang.String i(java.lang.String str) {
        if (1 == this.f72018b && this.f72021e == null) {
            this.f72021e = this.f72017a.getRequestProperties();
        }
        return this.f72017a.getHeaderField(str);
    }

    @Override // com.tencent.mm.network.i2
    public void j(boolean z17) {
        this.f72017a.setUseCaches(z17);
    }

    @Override // com.tencent.mm.network.i2
    public void k(int i17) {
        this.f72017a.setReadTimeout(i17);
    }

    public java.lang.String toString() {
        return this.f72017a.toString();
    }
}
