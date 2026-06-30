package tj1;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final tj1.f f501226a = new tj1.f();

    /* renamed from: b, reason: collision with root package name */
    public static tj1.b f501227b;

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 m52174xaf156f4a = runtime.x0().m52174xaf156f4a();
        if (m52174xaf156f4a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.AppBrandTranslateLogic", "translateClick error, pageView is null, runtime:" + runtime);
            return;
        }
        tj1.m W1 = m52174xaf156f4a.W1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandTranslateLogic", "translateClick pageState:" + W1);
        if (W1 != tj1.m.f501237f) {
            if (W1 == tj1.m.f501238g) {
                tj1.o oVar = new tj1.o();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 C0 = runtime.C0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C0, "getService(...)");
                oVar.x(C0, 0);
                return;
            }
            return;
        }
        android.app.Activity r07 = runtime.r0();
        if (r07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.AppBrandTranslateLogic", "translateClick error, context is null, runtime:" + runtime);
        } else {
            fl1.b bVar = new fl1.b(r07);
            bVar.E(com.p314xaae8f345.mm.R.C30867xcad56011.m6v);
            bVar.A(r07.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m4l), true, new tj1.e(r07));
            bVar.w(r07.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m6x), true, null);
            ((fl1.c0) runtime.m48801x784fb1e3()).c(bVar);
        }
    }
}
