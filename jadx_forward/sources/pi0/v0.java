package pi0;

/* loaded from: classes11.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final pi0.v0 f436269a = new pi0.v0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f436270b = new java.util.HashMap();

    public final void a(java.lang.String key, pi0.l1 l1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.HashMap hashMap = f436270b;
        if (l1Var == null) {
            hashMap.remove(key);
        } else {
            hashMap.put(key, l1Var);
        }
    }
}
