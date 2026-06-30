package p01;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f431899c;

    /* renamed from: a, reason: collision with root package name */
    public static final p01.f f431897a = new p01.f();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f431898b = jz5.h.b(p01.e.f431896d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f431900d = jz5.h.b(p01.d.f431895d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f431901e = jz5.h.b(p01.c.f431894d);

    public final boolean a() {
        return ((java.lang.Boolean) ((jz5.n) f431898b).mo141623x754a37bb()).booleanValue();
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewInitThread", "quit() called hasNewHandlerThread:" + f431899c);
        if (f431899c) {
            ((android.os.HandlerThread) ((jz5.n) f431900d).mo141623x754a37bb()).quit();
        }
    }
}
