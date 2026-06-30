package mk2;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final mk2.h f408666a = new mk2.h();

    /* renamed from: b, reason: collision with root package name */
    public static final mk2.c f408667b = new mk2.c();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f408668c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f408669d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f408670e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final mk2.b f408671f = new mk2.b();

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Runnable f408672g = mk2.d.f408662d;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.ref.WeakReference f408673h;

    public final void a(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LinkMicTimeoutTimer", "startRandomMatchTimer delay:" + j17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(f408672g, j17);
    }

    public final void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LinkMicTimeoutTimer", "stopAcceptMicNewAnchorPkTimer userName:" + str);
        if (str != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l((java.lang.Runnable) f408669d.get(str));
        }
    }

    public final void c(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LinkMicTimeoutTimer", "stopAcceptMicTimer micId:" + str);
        if (str != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l((java.lang.Runnable) f408670e.get(str));
        }
    }

    public final void d(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LinkMicTimeoutTimer", "stopApplyMicNewAnchorPkTimer userName:" + str);
        if (str != null) {
            java.util.HashMap hashMap = f408668c;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l((java.lang.Runnable) hashMap.get(str));
        }
    }

    public final void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LinkMicTimeoutTimer", "stopApplyMicTimer");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(f408667b);
    }

    public final void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LinkMicTimeoutTimer", "stopRandomMatchTimer");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(f408672g);
    }
}
