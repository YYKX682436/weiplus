package ju3;

/* loaded from: classes3.dex */
public interface d0 {
    static /* synthetic */ void k(ju3.d0 d0Var, ju3.c0 c0Var, android.os.Bundle bundle, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: statusChange");
        }
        if ((i17 & 2) != 0) {
            bundle = null;
        }
        d0Var.w(c0Var, bundle);
    }

    default void f(yt3.r2 plugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
    }

    void w(ju3.c0 c0Var, android.os.Bundle bundle);
}
