package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.v f145046a = new com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.v();

    public final void a() {
        if (gm0.j1.a()) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BizServiceMuteWhitelist");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getValue(...)");
            bn0.g.f104312a.h("MXM_DynaCfg_BizServiceMuteWhitelist", d17);
            java.lang.String u17 = gm0.j1.u().c().u(2, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "getString(...)");
            bn0.g.f104312a.h("USERINFO_USERNAME", u17);
            bn0.g.f104312a.g("USERINFO_EXT_STATUS2_LONG_SYNC", gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, 0L));
            bn0.g.f104312a.i("USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC", gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC, true));
            bn0.g.f104312a.i("USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC", gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC, true));
            bn0.g.f104312a.g("USERINFO_SETTING_NOTIFICATION_BANNER_TYPE_NEW_INT_SYNC", gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_NOTIFICATION_BANNER_TYPE_NEW_INT_SYNC, 0L));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LightPushNotificationSync", "refreshConfigData duration = " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public final void b() {
        java.lang.String str;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        Bi.getClass();
        l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
        int i17 = 0;
        android.database.Cursor f17 = Bi.f276604d.f("select username,verifyFlag,type,lvbuff from rcontact where (type & 1 != 0) or (type & 2 != 0)", null, 0);
        f17.moveToFirst();
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            z3Var.mo9015xbf5d97fd(f17);
            if (!z3Var.k2() || (str = r01.q3.cj().b1(z3Var.d1()).f66739xdfb76cc2) == null) {
                str = "";
            }
            java.lang.String str2 = str;
            bn0.g gVar = bn0.g.f104312a;
            java.lang.String d17 = z3Var.d1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
            gVar.j(d17, new bn0.a(z3Var.f1(), z3Var.m124896xfb85f7b0(), z3Var.f318119x1, z3Var.T, str2));
            i17++;
        }
        f17.close();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LightPushNotificationSync", "refreshContactData count = " + i17 + ", duration = " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public final void c() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.ArrayList<i13.j> Bi = ((h13.l0) i95.n0.c(h13.l0.class)).Bi();
        for (i13.j jVar : Bi) {
            bn0.g gVar = bn0.g.f104312a;
            java.lang.String field_ForcePushId = jVar.f66499xaeadb4bb;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ForcePushId, "field_ForcePushId");
            java.lang.String field_ForcePushId2 = jVar.f66499xaeadb4bb;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ForcePushId2, "field_ForcePushId");
            gVar.k(field_ForcePushId, new bn0.b(field_ForcePushId2, jVar.f66495x81959a6e, jVar.f66497xc9a553ad, jVar.f66500xda05eaf7, jVar.f66501x2253a77f));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LightPushNotificationSync", "refreshForceNotifyData count = " + Bi.size() + ", duration = " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
