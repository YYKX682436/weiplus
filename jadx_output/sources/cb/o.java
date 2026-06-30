package cb;

/* loaded from: classes13.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static cb.o f40157e;

    /* renamed from: a, reason: collision with root package name */
    public final x.n f40158a = new x.n();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Boolean f40159b = null;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Queue f40160c = new java.util.ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f40161d = new java.util.ArrayDeque();

    public static synchronized cb.o a() {
        cb.o oVar;
        synchronized (cb.o.class) {
            if (f40157e == null) {
                f40157e = new cb.o();
            }
            oVar = f40157e;
        }
        return oVar;
    }
}
