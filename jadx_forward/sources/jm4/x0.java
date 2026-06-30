package jm4;

/* loaded from: classes15.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final jm4.x0 f381971a = new jm4.x0();

    /* renamed from: b, reason: collision with root package name */
    public static volatile jm4.t0 f381972b;

    public static final jm4.t0 a() {
        jm4.t0 t0Var;
        jm4.t0 t0Var2 = f381972b;
        if (t0Var2 == null) {
            synchronized (f381971a) {
                t0Var = f381972b;
                if (t0Var == null) {
                    t0Var = new sk4.p();
                    f381972b = t0Var;
                }
            }
            t0Var2 = t0Var;
        }
        java.util.Objects.toString(f381972b);
        return t0Var2;
    }
}
