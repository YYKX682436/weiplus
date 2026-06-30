package a82;

/* loaded from: classes12.dex */
public final class o0 extends jm0.g implements o72.z3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        T6();
    }

    @Override // jm0.g
    public void S6() {
        jm0.o service = this.f300267d;
        kotlin.jvm.internal.o.g(service, "service");
        if (!jm0.g.class.isAssignableFrom(a82.n0.class)) {
            throw new java.lang.IllegalArgumentException(service.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(service.getViewModel(), new jm0.e(service)).a(a82.n0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) ((a82.n0) ((jm0.g) a17)).f2088h).getValue()).onDestroy();
    }

    public void T6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavCheckCdnProxyFSC", "run");
        com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct b17 = o72.w2.f343509a.b();
        if (b17 != null) {
            b17.f56226k = 1;
        }
        jm0.o service = this.f300267d;
        kotlin.jvm.internal.o.g(service, "service");
        if (!jm0.g.class.isAssignableFrom(a82.n0.class)) {
            throw new java.lang.IllegalArgumentException(service.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(service.getViewModel(), new jm0.e(service)).a(a82.n0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        a82.n0 n0Var = (a82.n0) ((jm0.g) a17);
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) n0Var.f2088h).getValue(), null, new a82.h0(n0Var, null), 1, null);
    }
}
