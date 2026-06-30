package l6;

/* loaded from: classes16.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static l6.c f398246a;

    public static l6.c c(android.content.Context context) {
        if (f398246a == null) {
            synchronized (l6.c.class) {
                if (f398246a == null) {
                    f398246a = new l6.i(context);
                }
            }
        }
        return f398246a;
    }

    public abstract void a(java.lang.String str, int i17, int i18, int i19, int i27);

    public abstract void b(java.lang.String str, int i17, int i18, int i19, int i27);

    public abstract int d(java.lang.String str);

    public abstract void e();
}
