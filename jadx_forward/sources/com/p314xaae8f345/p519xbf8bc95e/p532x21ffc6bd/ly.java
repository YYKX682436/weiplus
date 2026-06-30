package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class ly extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mc {

    /* renamed from: b, reason: collision with root package name */
    protected java.lang.String f131936b;

    private java.lang.String c() {
        return this.f131936b;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mc, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu
    public final java.io.InputStream e(java.lang.String str) {
        try {
            java.lang.String file = new java.net.URL(str).getFile();
            if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(file)) {
                this.f131936b = file.substring(file.lastIndexOf("/") + 1).replace("%20", " ");
            }
        } catch (java.net.MalformedURLException unused) {
        }
        return super.e(str);
    }
}
