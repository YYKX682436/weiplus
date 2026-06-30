package os4;

/* loaded from: classes8.dex */
public abstract class a {
    public static final void a(p012xc85e97e9.p093xedfae76a.j0 j0Var, java.lang.Object obj) {
        if (j0Var == null) {
            return;
        }
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            j0Var.mo523x53d8522f(obj);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new os4.b(j0Var, obj, null));
    }
}
