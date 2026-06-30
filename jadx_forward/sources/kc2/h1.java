package kc2;

/* loaded from: classes10.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final kc2.h1 f387938a = new kc2.h1();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f387939b;

    static {
        boolean z17;
        boolean z18 = false;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f387758a;
        }
        f387939b = z18;
    }

    public final r45.us2 a(com.p314xaae8f345.mm.p2621x8fb0427b.u3 key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        r45.us2 us2Var = new r45.us2();
        try {
            java.lang.Object m17 = gm0.j1.u().c().m(key, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            us2Var.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h((java.lang.String) m17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderKaraInfoManager.Storage", key + " getTimeInfo exit=" + us2Var.m75939xb282bd08(2) + ",expose=" + us2Var.m75939xb282bd08(0) + ",reddot_click=" + us2Var.m75939xb282bd08(1));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderKaraInfoManager.Storage", e17, "", new java.lang.Object[0]);
        }
        return us2Var;
    }

    public final void b(com.p314xaae8f345.mm.p2621x8fb0427b.u3 key, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        r45.us2 us2Var = new r45.us2();
        us2Var.set(0, java.lang.Integer.valueOf(i18));
        us2Var.set(1, java.lang.Integer.valueOf(i19));
        us2Var.set(2, java.lang.Integer.valueOf(i17));
        gm0.j1.u().c().x(key, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(us2Var.mo14344x5f01b1f6()));
        if (f387939b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderKaraInfoManager.Storage", "saveTimeInfo " + key + " lastExitTime=" + i17 + " lastRedDotExposeTime=" + i18 + " lastRedDotClickTime=" + i19 + ' ');
        }
    }
}
