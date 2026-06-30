package a82;

/* loaded from: classes12.dex */
public final class v extends jm0.g implements o72.w3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
    }

    public void T6(java.lang.String str) {
        if (str != null) {
            jm0.o service = this.f300267d;
            kotlin.jvm.internal.o.g(service, "service");
            if (!jm0.g.class.isAssignableFrom(a82.t.class)) {
                throw new java.lang.IllegalArgumentException(service.getClass().getName().concat(" must extends FeatureServiceComponent"));
            }
            androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(service.getViewModel(), new jm0.e(service)).a(a82.t.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((a82.t) ((jm0.g) a17)).b7(str);
        }
    }

    public void U6(java.lang.String str) {
        if (str != null) {
            jm0.o service = this.f300267d;
            kotlin.jvm.internal.o.g(service, "service");
            if (!jm0.g.class.isAssignableFrom(a82.t.class)) {
                throw new java.lang.IllegalArgumentException(service.getClass().getName().concat(" must extends FeatureServiceComponent"));
            }
            androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(service.getViewModel(), new jm0.e(service)).a(a82.t.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((a82.t) ((jm0.g) a17)).b7(str);
        }
    }

    public void V6() {
        jm0.f fVar = jm0.g.f300266e;
        jm0.o oVar = this.f300267d;
        ((a82.t) fVar.a(oVar, a82.t.class)).e7();
        ((a82.d0) fVar.a(oVar, a82.d0.class)).e7();
    }
}
