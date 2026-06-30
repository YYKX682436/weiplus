package dk2;

/* loaded from: classes3.dex */
public final class ya {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.ya f315919a = new dk2.ya();

    /* renamed from: b, reason: collision with root package name */
    public static r45.i22 f315920b;

    public final r45.i22 a() {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalStateException("FinderLiveNetworkIdentityAuthManager must be called on main thread".toString());
        }
        if (f315920b == null) {
            ae2.in inVar = ae2.in.f85221a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85260d8).mo141623x754a37bb()).r()).intValue() == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNetworkIdentityAuthManager", "[getAuthParams] using mock params for debug");
                r45.i22 i22Var = new r45.i22();
                i22Var.set(0, "");
                i22Var.set(1, "");
                i22Var.set(2, "");
                i22Var.set(3, "");
                i22Var.set(4, "");
                i22Var.set(5, "");
                return i22Var;
            }
        }
        return f315920b;
    }
}
