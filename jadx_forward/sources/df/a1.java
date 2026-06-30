package df;

/* loaded from: classes7.dex */
public final class a1 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f310955b;

    /* renamed from: f, reason: collision with root package name */
    public static yz5.a f310959f;

    /* renamed from: a, reason: collision with root package name */
    public static final df.a1 f310954a = new df.a1();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f310956c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f310957d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f310958e = new java.util.HashMap();

    public final synchronized void a(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineManager", "init " + j17);
        java.util.HashMap hashMap = f310956c;
        if (((df.x0) hashMap.get(java.lang.Long.valueOf(j17))) == null) {
            hashMap.put(java.lang.Long.valueOf(j17), new df.x0(j17));
        }
    }
}
