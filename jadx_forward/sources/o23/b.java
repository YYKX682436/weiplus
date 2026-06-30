package o23;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final o23.b f423944a = new o23.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f423945b = new java.util.HashMap();

    public final void a(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        java.util.HashMap hashMap = f423945b;
        hashMap.remove(sessionId);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumResultDispatcher", "unregisterCallback: count " + hashMap.size());
    }
}
