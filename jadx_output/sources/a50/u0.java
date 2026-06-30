package a50;

/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a50.u0 f1541d = new a50.u0();

    public u0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int o17 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) a50.v0.f1549f).getValue()).o("RecycleFlutterEnginOnBackground", -1);
        if (o17 == 0) {
            return java.lang.Boolean.FALSE;
        }
        if (o17 == 1) {
            return java.lang.Boolean.TRUE;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_rccycle_flutter_engin_on_background, 1) == 1);
        com.tencent.mars.xlog.Log.i("Finder.BoxBizFlutterInstantsHelper", "recycleFlutterEnginOnBackground " + valueOf.booleanValue());
        return valueOf;
    }
}
