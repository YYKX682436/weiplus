package c80;

/* loaded from: classes12.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final c80.e a() {
        v70.w wVar = (v70.w) i95.n0.c(v70.w.class);
        kotlin.jvm.internal.o.d(wVar);
        if (!jm0.g.class.isAssignableFrom(c80.e.class)) {
            throw new java.lang.IllegalArgumentException(wVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(wVar.getViewModel(), new jm0.e(wVar)).a(c80.e.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (c80.e) ((jm0.g) a17);
    }
}
