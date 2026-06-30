package d21;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f307315a = new java.util.HashMap();

    public static void b(java.lang.String str, d21.a aVar) {
        iz5.a.d(null, str);
        iz5.a.d(null, aVar);
        java.util.HashMap hashMap = f307315a;
        synchronized (hashMap) {
            hashMap.put(str.toLowerCase(), aVar);
        }
    }

    public abstract d21.c a(java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var);
}
