package ig2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ig2.a f372895a = new ig2.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f372896b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f372897c = new java.util.HashMap();

    public final void a(long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearFluentList feedId: ");
        sb6.append(j17);
        sb6.append(" exitParamsSize: ");
        java.util.HashMap hashMap = f372897c;
        sb6.append(hashMap);
        sb6.append(" directorSize: ");
        java.util.HashMap hashMap2 = f372896b;
        sb6.append(hashMap2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentReplaySwitchManager", sb6.toString());
        hashMap2.remove(java.lang.Long.valueOf(j17));
        hashMap.remove(java.lang.Long.valueOf(j17));
    }

    public final ig2.r b(long j17) {
        return (ig2.r) f372896b.get(java.lang.Long.valueOf(j17));
    }
}
