package yp3;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f545933a = java.util.concurrent.TimeUnit.DAYS.toMillis(7);

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.r6 f545934b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f545935c;

    static {
        java.lang.String o17;
        com.p314xaae8f345.mm.vfs.r6 j17 = com.p314xaae8f345.mm.vfs.r6.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getExternalCacheDir());
        f545934b = j17;
        java.lang.String[] strArr = new java.lang.String[2];
        strArr[0] = (j17 == null || (o17 = j17.o()) == null) ? null : o17.concat("/hprofs/");
        strArr[1] = (j17 != null ? j17.o() : null) + "/matrix_resource";
        f545935c = strArr;
    }
}
