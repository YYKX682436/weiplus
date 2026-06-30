package vx5;

/* loaded from: classes13.dex */
public class e implements tx5.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c f522870a;

    public e() {
        by5.c4.c("PinusCookieManagerWrapper", "PinusCookieManagerWrapper, Default.");
        if (!"Default".equals(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.a.f301907b)) {
            synchronized (com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.b.class) {
                com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.a.f301906a = new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.b();
                com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.a.f301907b = "Default";
            }
        }
        this.f522870a = com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.a.f301906a;
    }

    @Override // tx5.b
    public java.lang.String a(java.lang.String str) {
        try {
            return this.f522870a.a(new com.p314xaae8f345.p3210x3857dc.q0(str).m120498x9616526c());
        } catch (java.net.URISyntaxException e17) {
            by5.c4.d("PinusCookieManagerWrapper", "getCookie, Unable to get cookies due to error parsing URL: " + str, e17);
            return null;
        }
    }

    @Override // tx5.b
    public void b(java.lang.String str, java.lang.String str2) {
        try {
            this.f522870a.b(new com.p314xaae8f345.p3210x3857dc.q0(str).m120498x9616526c(), str2);
        } catch (java.net.URISyntaxException e17) {
            by5.c4.d("PinusCookieManagerWrapper", "setCookie, Not setting cookie due to error parsing URL: " + str, e17);
        }
    }

    @Override // tx5.b
    public void c() {
        this.f522870a.c();
    }

    @Override // tx5.b
    public void d(boolean z17) {
        by5.c4.f("PinusCookieManagerWrapper", "setAcceptCookie:" + z17);
        this.f522870a.d(z17);
    }

    @Override // tx5.b
    public void e() {
        by5.c4.f("PinusCookieManagerWrapper", "removeAllCookie");
        this.f522870a.e();
    }

    @Override // tx5.b
    public void f(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, boolean z17) {
        by5.c4.f("PinusCookieManagerWrapper", "setAcceptThirdPartyCookies:" + z17);
    }

    @Override // tx5.b
    /* renamed from: flush */
    public void mo120241x5d03b04() {
        this.f522870a.mo120463x5d03b04();
    }

    public e(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c cVar) {
        this.f522870a = cVar;
    }
}
