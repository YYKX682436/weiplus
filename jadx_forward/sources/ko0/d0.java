package ko0;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ko0.d0 f391373a = new ko0.d0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f391374b = new java.util.HashMap();

    public final void a(java.lang.String event, int i17, java.lang.String tag, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.util.HashMap hashMap = f391374b;
        java.lang.Long l17 = (java.lang.Long) hashMap.get(event);
        if (l17 == null) {
            l17 = 0L;
        }
        long longValue = l17.longValue();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - longValue > i17 * 1000 || z65.c.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "LiveIntervalLogUtil: ".concat(msg));
            hashMap.put(event, java.lang.Long.valueOf(currentTimeMillis));
        }
    }
}
