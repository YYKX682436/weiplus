package cb;

/* loaded from: classes13.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static cb.o f121690e;

    /* renamed from: a, reason: collision with root package name */
    public final x.n f121691a = new x.n();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Boolean f121692b = null;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Queue f121693c = new java.util.ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f121694d = new java.util.ArrayDeque();

    public static synchronized cb.o a() {
        cb.o oVar;
        synchronized (cb.o.class) {
            if (f121690e == null) {
                f121690e = new cb.o();
            }
            oVar = f121690e;
        }
        return oVar;
    }
}
