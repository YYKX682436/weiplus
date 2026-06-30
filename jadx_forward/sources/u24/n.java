package u24;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f505663a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Long f505664b;

    public static final void a(long j17) {
        if (f505663a != null) {
            return;
        }
        f505664b = java.lang.Long.valueOf(j17);
        f505663a = gm0.j1.b().j() + '_' + j17;
    }

    public static final java.lang.String b() {
        java.lang.String str = f505663a;
        return str == null ? "" : str;
    }
}
