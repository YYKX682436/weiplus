package dk2;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.l f315242a = new dk2.l();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f315243b = new java.util.HashMap();

    static {
        ki.i.f389634c.c(new dk2.k());
    }

    public final void a(java.lang.String prefix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveActivityDataTransaction", prefix.concat(" clear cache feed!"));
            f315243b.clear();
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "FinderLiveActivityDataTransaction-".concat(prefix));
        }
    }
}
