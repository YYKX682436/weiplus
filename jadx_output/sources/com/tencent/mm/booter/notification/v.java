package com.tencent.mm.booter.notification;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.booter.notification.v f63513a = new com.tencent.mm.booter.notification.v();

    public final void a() {
        if (gm0.j1.a()) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BizServiceMuteWhitelist");
            kotlin.jvm.internal.o.f(d17, "getValue(...)");
            bn0.g.f22779a.h("MXM_DynaCfg_BizServiceMuteWhitelist", d17);
            java.lang.String u17 = gm0.j1.u().c().u(2, "");
            kotlin.jvm.internal.o.f(u17, "getString(...)");
            bn0.g.f22779a.h("USERINFO_USERNAME", u17);
            bn0.g.f22779a.g("USERINFO_EXT_STATUS2_LONG_SYNC", gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, 0L));
            bn0.g.f22779a.i("USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC", gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC, true));
            bn0.g.f22779a.i("USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC", gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC, true));
            bn0.g.f22779a.g("USERINFO_SETTING_NOTIFICATION_BANNER_TYPE_NEW_INT_SYNC", gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_SETTING_NOTIFICATION_BANNER_TYPE_NEW_INT_SYNC, 0L));
            com.tencent.mars.xlog.Log.i("MicroMsg.LightPushNotificationSync", "refreshConfigData duration = " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public final void b() {
        java.lang.String str;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        Bi.getClass();
        l75.e0 e0Var = com.tencent.mm.contact.s.G2;
        int i17 = 0;
        android.database.Cursor f17 = Bi.f195071d.f("select username,verifyFlag,type,lvbuff from rcontact where (type & 1 != 0) or (type & 2 != 0)", null, 0);
        f17.moveToFirst();
        while (f17.moveToNext()) {
            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
            z3Var.convertFrom(f17);
            if (!z3Var.k2() || (str = r01.q3.cj().b1(z3Var.d1()).field_enterpriseFather) == null) {
                str = "";
            }
            java.lang.String str2 = str;
            bn0.g gVar = bn0.g.f22779a;
            java.lang.String d17 = z3Var.d1();
            kotlin.jvm.internal.o.f(d17, "getUsername(...)");
            gVar.j(d17, new bn0.a(z3Var.f1(), z3Var.getType(), z3Var.f236586x1, z3Var.T, str2));
            i17++;
        }
        f17.close();
        com.tencent.mars.xlog.Log.i("MicroMsg.LightPushNotificationSync", "refreshContactData count = " + i17 + ", duration = " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public final void c() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.ArrayList<i13.j> Bi = ((h13.l0) i95.n0.c(h13.l0.class)).Bi();
        for (i13.j jVar : Bi) {
            bn0.g gVar = bn0.g.f22779a;
            java.lang.String field_ForcePushId = jVar.field_ForcePushId;
            kotlin.jvm.internal.o.f(field_ForcePushId, "field_ForcePushId");
            java.lang.String field_ForcePushId2 = jVar.field_ForcePushId;
            kotlin.jvm.internal.o.f(field_ForcePushId2, "field_ForcePushId");
            gVar.k(field_ForcePushId, new bn0.b(field_ForcePushId2, jVar.field_CreateTime, jVar.field_ExpiredTime, jVar.field_Status, jVar.field_Type));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LightPushNotificationSync", "refreshForceNotifyData count = " + Bi.size() + ", duration = " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
