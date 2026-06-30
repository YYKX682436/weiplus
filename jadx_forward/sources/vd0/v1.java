package vd0;

@j95.b
/* loaded from: classes14.dex */
public final class v1 extends i95.w implements wd0.j1 {
    public void Ai(java.lang.String str, java.lang.String eventId, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        java.util.HashMap hashMap = new java.util.HashMap();
        if (map == null) {
            map = hashMap;
        }
        if (str == null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(eventId, map, 34575);
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(str, eventId, map, 34575);
        }
    }

    public p3325xe03a0797.p3326xc267989b.f1 Bi(p3325xe03a0797.p3326xc267989b.y0 lifecycleScope, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleScope, "lifecycleScope");
        return p3325xe03a0797.p3326xc267989b.l.b(lifecycleScope, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new vd0.k1(this, z17, null), 2, null);
    }

    public int Di(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return 10 - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("Fingerprint_" + username + "_Retry_Count").o("login_fingerprint_retry_count", 0);
    }

    public boolean Ni(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.String concat = "Fingerprint_".concat(username);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(concat).getBoolean("bind_fingerprint_status", false);
        boolean Zi = ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Zi(username);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SettingFingerprintService", "[fingerprint login] isOpenFingerprintLogin uin is " + concat + ", res: " + z17);
        return z17 && Zi;
    }

    public boolean Ri(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return Ni(username) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c01.uc.f119047c.c(username, "last_logout_fingerprint_permission_status"), "1");
    }

    public boolean Ui(android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean z18 = (wo.v1.f529361h.f529344b & 1) > 0;
        boolean z19 = cu5.b.c() && wt5.a.n(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SettingFingerprintService", "[fingerprint login] isSupportFingerprint res: isSrvSupport: " + z18 + ", isNativeSupport: " + z19);
        return !z17 ? z18 && z19 : z19;
    }

    public void Vi(p3325xe03a0797.p3326xc267989b.y0 lifecycleScope, android.content.Context context, wd0.b2 param, wd0.g2 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleScope, "lifecycleScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ju5.c cVar = new ju5.c(null);
        cVar.f383601c = context;
        cVar.f383602d = 1;
        cVar.f383610l = param.f526230a;
        cVar.f383600b = param.f526232c;
        cVar.f383599a = 920;
        cVar.f383611m = param.f526231b;
        cu5.b.g(new vd0.t1(callback), cVar);
    }

    public void Zi(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SettingFingerprintService", "[fingerprint login] resetUserInfo username: ".concat(username));
        ((is.f) ((js.r0) i95.n0.c(js.r0.class))).hj(username, true);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("Fingerprint_" + username + "_Retry_Count").A("login_fingerprint_retry_count", 0);
    }

    public void aj(boolean z17, java.lang.String fingerprintId, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fingerprintId, "fingerprintId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.String concat = "Fingerprint_".concat(username);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SettingFingerprintService", "[fingerprint login] bind success, uin is " + concat + ", fingerprintId is " + fingerprintId);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(concat).putBoolean("bind_fingerprint_status", z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(concat).putString("bind_fingerprint_fid", fingerprintId);
    }

    public void bj(p3325xe03a0797.p3326xc267989b.y0 lifecycleScope, wd0.m2 param, java.lang.String username, wd0.c1 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleScope, "lifecycleScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(lifecycleScope, null, null, new vd0.u1(callback, param, username, null), 3, null);
    }

    public void wi(p3325xe03a0797.p3326xc267989b.y0 lifecycleScope, int i17, com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10686xf24fb830 c10686xf24fb830, wd0.c2 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleScope, "lifecycleScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10685x7a6659ac c10685x7a6659ac = new com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10685x7a6659ac(0, 0, "", "");
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(fo3.s.INSTANCE.h());
        k57Var.f459929f = cu5Var;
        p3325xe03a0797.p3326xc267989b.l.d(lifecycleScope, null, null, new vd0.h1(i17, c10685x7a6659ac, callback, c10686xf24fb830, this, k57Var, null), 3, null);
    }
}
