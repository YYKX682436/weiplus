package bu2;

/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bu2.g0 f106044a = new bu2.g0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f106045b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final int f106046c = 5;

    public final bu2.f0 a(java.lang.String userName) {
        bu2.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        synchronized (this) {
            f0Var = (bu2.f0) ((java.util.LinkedHashMap) f106045b).get(userName);
        }
        return f0Var;
    }
}
