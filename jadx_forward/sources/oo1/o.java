package oo1;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final oo1.o f428684a = new oo1.o();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f428685b = jz5.h.b(oo1.n.f428683d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f428686c = jz5.h.b(oo1.m.f428682d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f428687d = jz5.h.b(oo1.l.f428681d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f428688e = jz5.h.b(oo1.k.f428680d);

    public final void a(java.lang.String deviceId) {
        java.lang.String g07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(deviceId, "deviceId@roam-at")) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupMmkv", "add last active deviceId=".concat(deviceId));
        if (deviceId.length() == 0) {
            return;
        }
        jz5.g gVar = f428688e;
        synchronized (((java.util.LinkedHashSet) ((jz5.n) gVar).mo141623x754a37bb())) {
            ((java.util.LinkedHashSet) ((jz5.n) gVar).mo141623x754a37bb()).remove(deviceId);
            ((java.util.LinkedHashSet) ((jz5.n) gVar).mo141623x754a37bb()).add(deviceId);
            g07 = kz5.n0.g0((java.util.LinkedHashSet) ((jz5.n) gVar).mo141623x754a37bb(), ",", null, null, 0, null, null, 62, null);
        }
        c().D("lastActiveDevice", g07);
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("roam_backup_device_info", e(), 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(J2, "getAccountAwareMMKV(...)");
        return J2;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 c() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f428687d).mo141623x754a37bb();
    }

    public final java.lang.String d() {
        java.lang.String t17 = c().t("phone_id");
        if (t17 == null || t17.length() == 0) {
            t17 = wo.w0.k();
            if (t17.length() == 0) {
                t17 = java.util.UUID.randomUUID().toString();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupMmkv", "Create new phoneId=" + t17 + " for uin=" + e());
            c().D("phone_id", t17);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t17);
        return t17;
    }

    public final int e() {
        return ((java.lang.Number) ((jz5.n) f428685b).mo141623x754a37bb()).intValue();
    }

    public final void f(java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f428686c).mo141623x754a37bb()).B(talker, c01.id.c());
    }
}
