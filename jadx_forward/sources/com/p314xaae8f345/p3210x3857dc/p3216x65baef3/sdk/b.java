package com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk;

/* loaded from: classes13.dex */
public class b implements com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c f301908a;

    public b() {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1 m120281x9cf0d20b = com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1.m120281x9cf0d20b();
        if (m120281x9cf0d20b == null) {
            return;
        }
        try {
            this.f301908a = new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.d(new by5.h0(m120281x9cf0d20b.m120198xfefc2a39("CookieManager"), new java.lang.Class[0]).a(new java.lang.Object[0]));
        } catch (java.lang.UnsupportedOperationException e17) {
            by5.c4.d("CookieManager", "ReflectConstructor cookieManager error", e17);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c
    public java.lang.String a(java.lang.String str) {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c cVar = this.f301908a;
        return cVar != null ? ((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.d) cVar).a(str) : "";
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c
    public void b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c cVar = this.f301908a;
        if (cVar != null) {
            ((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.d) cVar).b(str, str2);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c
    public void c() {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c cVar = this.f301908a;
        if (cVar != null) {
            ((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.d) cVar).c();
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c
    public void d(boolean z17) {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c cVar = this.f301908a;
        if (cVar != null) {
            ((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.d) cVar).d(z17);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c
    public void e() {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c cVar = this.f301908a;
        if (cVar != null) {
            ((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.d) cVar).e();
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c
    /* renamed from: flush */
    public void mo120463x5d03b04() {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c cVar = this.f301908a;
        if (cVar != null) {
            ((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.d) cVar).mo120463x5d03b04();
        }
    }

    public b(java.lang.Object obj) {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1 m120281x9cf0d20b = com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1.m120281x9cf0d20b();
        if (m120281x9cf0d20b == null) {
            return;
        }
        if (!m120281x9cf0d20b.m120198xfefc2a39("CookieManager").isInstance(obj)) {
            by5.c4.c("CookieManager", "Object must be an instance of CookieManager");
        } else {
            this.f301908a = new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.d(obj);
        }
    }
}
