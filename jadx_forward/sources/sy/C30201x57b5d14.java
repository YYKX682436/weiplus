package sy;

/* renamed from: sy.b0$$b */
/* loaded from: classes5.dex */
public final /* synthetic */ class C30201x57b5d14 implements java.util.function.BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f495317a;

    public /* synthetic */ C30201x57b5d14(long j17) {
        this.f495317a = j17;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = this.f495317a;
        java.lang.String str = (java.lang.String) obj;
        sy.c0 c0Var = (sy.c0) obj2;
        try {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str) == null) {
                return;
            }
            c0Var.f495323e = j17;
            c0Var.f495320b = c01.e2.Q(str);
            c0Var.f495322d = r2.d1();
            c0Var.a();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PluginMsgReporter", "get report data filed " + e17);
        }
    }
}
