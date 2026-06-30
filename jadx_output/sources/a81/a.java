package a81;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.text.SimpleDateFormat f1956a;

    public static int a(long j17) {
        if (f1956a == null) {
            f1956a = new java.text.SimpleDateFormat("yyyyMMdd");
        }
        return com.tencent.mm.sdk.platformtools.t8.P(f1956a.format(java.lang.Long.valueOf(j17)), -1);
    }
}
