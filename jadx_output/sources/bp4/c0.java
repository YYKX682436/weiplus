package bp4;

/* loaded from: classes10.dex */
public interface c0 {
    static /* synthetic */ void m(bp4.c0 c0Var, long j17, java.lang.Object obj, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: seek");
        }
        if ((i17 & 2) != 0) {
            obj = null;
        }
        c0Var.h(j17, obj);
    }

    void h(long j17, java.lang.Object obj);

    void pause();

    void resume();
}
