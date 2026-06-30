package f65;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f341402a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f341403b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f341404c = new java.util.ArrayList();

    public final void a(long j17, java.util.Map params, f65.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        synchronized (this.f341404c) {
            ((java.util.ArrayList) this.f341404c).add(java.lang.Long.valueOf(j17));
        }
        this.f341402a.mo50297x7c4d7ca2(new f65.b(j17, params, callback), 5000L);
    }

    public final java.util.Map b(long j17) {
        java.util.LinkedHashMap linkedHashMap;
        synchronized (this.f341403b) {
            java.util.Map map = (java.util.Map) ((java.util.LinkedHashMap) this.f341403b).get(java.lang.Long.valueOf(j17));
            if (map != null) {
                linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.putAll(map);
            } else {
                linkedHashMap = null;
            }
        }
        return linkedHashMap;
    }
}
