package fp;

/* loaded from: classes5.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final fp.b0 f346696a = new fp.a0(null);

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f346697b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile fp.b0 f346698c;

    public b0(fp.x xVar) {
    }

    public static fp.b0 a() {
        if (f346698c == null) {
            synchronized (f346697b) {
                if (f346698c == null) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.r() && com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274656s) {
                        f346698c = new fp.z(null);
                    }
                    f346698c = f346696a;
                }
            }
        }
        return f346698c;
    }

    public abstract void b(java.lang.String str);

    public abstract java.lang.String c(java.lang.String str);

    public abstract java.lang.String d(java.lang.String str);
}
