package a5;

/* loaded from: classes13.dex */
public abstract class r0 {
    public final a5.j0 a(a5.t0 t0Var) {
        java.util.List singletonList = java.util.Collections.singletonList(t0Var);
        b5.w wVar = (b5.w) this;
        if (singletonList.isEmpty()) {
            throw new java.lang.IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new b5.h(wVar, null, a5.n.KEEP, singletonList, null).a();
    }
}
