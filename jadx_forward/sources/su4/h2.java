package su4;

/* loaded from: classes8.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f494439a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f494440b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f494441c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f494442d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f494443e;

    public h2(int i17, java.lang.String liteAppId, java.lang.String liteappPage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppId, "liteAppId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteappPage, "liteappPage");
        this.f494439a = liteAppId;
        this.f494440b = liteappPage;
    }

    public final java.lang.String a() {
        return this.f494439a + this.f494440b;
    }

    public final boolean b(boolean z17) {
        java.lang.String str = this.f494441c;
        if (str == null) {
            return false;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "clicfg_discover_search_use_liteapp")) {
            return true;
        }
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().j(str, "0", z17, true), 0) != 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("webSearch", "exception = " + e17.getStackTrace());
            return false;
        }
    }
}
