package t91;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final t91.a f498100a = new t91.a();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f498101b;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        f498101b = z65.c.a();
    }

    public final void a(java.lang.String tag, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, msg);
        if (f498101b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.n0.f159223a.b().mo40555x32c585(0L, null, null, null, 0, 0, 0L, 0L, tag + ": " + msg);
        }
    }

    public final void b(java.lang.String tag, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(tag, msg);
        if (f498101b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.n0.f159223a.b().mo40557x32c593(0L, null, null, null, 0, 0, 0L, 0L, tag + ": " + msg);
        }
    }
}
