package d42;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static d42.a f307933b;

    /* renamed from: a, reason: collision with root package name */
    public long f307934a;

    public a() {
        this.f307934a = 0L;
        if (!gm0.j1.a()) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f307934a = java.lang.System.currentTimeMillis();
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPTID_BEGIN_TIME_LONG;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f307934a = c17.t(u3Var, java.lang.System.currentTimeMillis());
        }
    }

    public static d42.a a() {
        if (f307933b == null) {
            f307933b = new d42.a();
        }
        return f307933b;
    }
}
