package to3;

@j95.b
/* loaded from: classes9.dex */
public class c0 extends i95.w {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f502484i = false;

    /* renamed from: m, reason: collision with root package name */
    public static volatile int f502485m = 10;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f502486n;

    /* renamed from: d, reason: collision with root package name */
    public wo3.c0 f502487d = null;

    /* renamed from: e, reason: collision with root package name */
    public to3.n f502488e = null;

    /* renamed from: f, reason: collision with root package name */
    public to3.a0 f502489f = null;

    /* renamed from: g, reason: collision with root package name */
    public xo3.a f502490g = null;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f502491h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    static {
        com.p314xaae8f345.mm.p2802xd031a825.a.h("OfflineBindCardRegProcess", to3.l.class);
        com.p314xaae8f345.mm.p2802xd031a825.a.h("OfflineBindCardProcess", to3.i.class);
        f502486n = false;
    }

    public static to3.c0 Ai() {
        return (to3.c0) i95.n0.c(to3.c0.class);
    }

    public static synchronized int Bi() {
        int i17;
        synchronized (to3.c0.class) {
            if (!f502486n && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && gm0.j1.a()) {
                f502485m = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_OFFLINE_REGET_TOKEN_NUM_SYNC_INT, 10);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreOffline", "init get token count: %s", java.lang.Integer.valueOf(f502485m));
                f502486n = true;
            }
            i17 = f502485m;
        }
        return i17;
    }

    public xo3.a Di() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        if (Ai().f502490g == null) {
            to3.c0 Ai = Ai();
            gm0.j1.i();
            Ai.f502490g = new xo3.a(gm0.j1.u().f354686f);
        }
        return Ai().f502490g;
    }

    public java.lang.String Ni(int i17) {
        gm0.j1.i();
        return (java.lang.String) gm0.j1.u().c().l(i17, null);
    }

    public wo3.c0 Ri() {
        gm0.j1.b().c();
        if (Ai().f502487d == null) {
            Ai().f502487d = new wo3.c0();
        }
        return Ai().f502487d;
    }

    public to3.a0 Ui() {
        gm0.j1.b().c();
        if (Ai().f502489f == null) {
            Ai().f502489f = new to3.a0();
        }
        return Ai().f502489f;
    }

    public void Vi(int i17, java.lang.String str) {
        if (str != null) {
            gm0.j1.i();
            gm0.j1.u().c().w(i17, str);
            gm0.j1.i();
            gm0.j1.u().c().i(true);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
    }

    public to3.n wi() {
        gm0.j1.b().c();
        if (Ai().f502488e == null) {
            Ai().f502488e = new to3.n();
        }
        return Ai().f502488e;
    }
}
