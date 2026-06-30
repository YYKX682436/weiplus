package mi1;

/* loaded from: classes7.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final mi1.o0 f408185a = new mi1.o0();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f408186b = true;

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime, java.lang.String str, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        if (!f408186b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.CapsuleAnimatorEventHelper", "showDefaultTips: isEnable = false");
            return;
        }
        mi1.m0 m0Var = runtime.f156354z.f408239e;
        java.lang.String n07 = runtime.n0();
        if (n07 == null) {
            n07 = "";
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cr8, n07);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        mi1.z0 z0Var = mi1.z0.f408272e;
        m0Var.c(new mi1.j0(0, 0, 0, 3000L, 1, 0L, new mi1.r1(string, str, str, null, 1, false, n07.length(), null, be1.r0.f4232x366c91de, null), 0, 7000L, aVar, 163, null));
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime, mi1.r1 config, int i17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        if (f408186b) {
            runtime.f156354z.f408239e.c(new mi1.j0(0, 0, i17, 1500L, config.f408209e, 0L, config, 0, 7000L, aVar, 163, null));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.CapsuleAnimatorEventHelper", "showTips: isEnable = false");
        }
    }
}
