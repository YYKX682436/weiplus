package d22;

/* loaded from: classes15.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final d22.u f307409a = new d22.u();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(android.content.Context context, d22.v liteAppContext) {
        boolean z17;
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppContext, "liteAppContext");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        if (!((((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(str, null, d22.c.class)).f149933d && liteAppContext.a()) || ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(str, null, d22.b.class)).f149933d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "exit in teen mode");
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
            return;
        }
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMEmoticonLiteAppOpenApi", "view context is null");
            return;
        }
        if (!liteAppContext.mo123369x7b953cf2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "liteapp context not valid");
            return;
        }
        d22.p b17 = liteAppContext.b();
        if (!b17.n(liteAppContext)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "liteapp not enabled");
            b17.k(context, liteAppContext);
            return;
        }
        b17.f(liteAppContext);
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Bundle bundle2 = new android.os.Bundle();
        java.lang.String j17 = b17.j();
        java.lang.String e17 = b17.e();
        java.util.Map e18 = kz5.b1.e(new jz5.l("wxalite70a1e8c60370e23abcc1bde4e2c32f6f", "0.3.8"));
        java.lang.String d17 = b17.d(liteAppContext);
        boolean a17 = b17.a();
        boolean h17 = b17.h();
        try {
            z17 = ((qk.h7) liteAppContext).f445692e;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MMEmoticonLiteAppCreator", th6, "unable to cast PageContext", new java.lang.Object[0]);
            z17 = false;
        }
        if (z17) {
            bundle.putBoolean("isHalfScreen", true);
            bundle.putFloat("heightPercent", 0.75f);
            bundle.putBoolean("enableDragToCloseInHalfScreen", true);
            try {
                z18 = ((qk.h7) liteAppContext).f445693f;
            } catch (java.lang.Throwable unused) {
                z18 = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 b18 = b17.b(liteAppContext);
            if (b18 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34 c16190x27388f34 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34();
                c16190x27388f34.f224947h = true;
                c16190x27388f34.f224949m = b18;
                c16190x27388f34.f224944e = 0.75f;
                c16190x27388f34.f224950n = z18;
                bundle.putParcelable("halfScreenConfig", c16190x27388f34);
            }
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17.m(), "modal")) {
            bundle.putInt("nextAnimIn", com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0);
            bundle.putInt("currentAnimOut", com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
        }
        bundle.putString("appId", j17);
        bundle.putString("query", d17);
        bundle.putBundle(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, bundle2);
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, e17);
        if (e18.containsKey(j17)) {
            bundle.putString("minVersion", (java.lang.String) e18.get(j17));
        }
        bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, a17);
        bundle.putBoolean("forbidRightGesture", h17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "open liteapp:" + j17 + ", page:" + e17);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(context, bundle, true, false, b17.i(liteAppContext), new d22.q(liteAppContext, b17, context));
    }
}
