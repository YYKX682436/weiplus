package nu4;

/* loaded from: classes7.dex */
public final class y implements lu4.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f421824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421825e;

    public y(nu4.b0 b0Var, java.lang.String str) {
        this.f421824d = b0Var;
        this.f421825e = str;
    }

    @Override // lu4.r
    public int F() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.a.b(this.f421824d.B0());
    }

    @Override // lu4.r
    public void I(java.lang.String func, java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(func, "func");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
    }

    @Override // lu4.r
    public int S() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 F0 = this.f421824d.F0(this.f421825e, false);
        int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.a.b(F0);
        com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.p538x696c9db.IO.m37447xbb07de6b((java.io.Closeable) F0);
        return b17;
    }

    @Override // lu4.r
    /* renamed from: getLocalData */
    public java.lang.String mo54387xb79006ff(java.lang.String key) {
        nu4.b0 b0Var = this.f421824d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        try {
            nu4.k kVar = nu4.b0.f421774J;
            java.lang.String s17 = nu4.b0.L.s(this.f421825e + '-' + key, "");
            java.lang.String str = b0Var.C;
            return s17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(b0Var.C, e17, "getLocalData:".concat(key), new java.lang.Object[0]);
            return null;
        }
    }

    @Override // lu4.r
    public nw4.i s() {
        return new nu4.x();
    }

    @Override // lu4.r
    /* renamed from: setLocalData */
    public void mo54388x13e3c773(java.lang.String key, java.lang.String data) {
        nu4.b0 b0Var = this.f421824d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        try {
            nu4.k kVar = nu4.b0.f421774J;
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) nu4.b0.L.i()).D(this.f421825e + '-' + key, data);
            java.lang.String str = b0Var.C;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(b0Var.C, e17, "setLocalData:" + key + ", " + data, new java.lang.Object[0]);
        }
    }

    @Override // lu4.c
    public void t(java.lang.String eventType, java.lang.String event, android.webkit.ValueCallback valueCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventType, "eventType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        this.f421824d.t(eventType, event, valueCallback);
    }

    @Override // lu4.r
    public boolean y(int i17, java.lang.String cgiUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiUrl, "cgiUrl");
        return false;
    }
}
