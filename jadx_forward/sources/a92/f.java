package a92;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f83953a = jz5.h.b(a92.c.f83950d);

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f83954b = jz5.h.b(a92.d.f83951d);

    /* renamed from: c, reason: collision with root package name */
    public static final a92.e f83955c = new a92.e();

    public static final boolean a() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmTokenManager", "deleteInstanceId");
            com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17 b17 = com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
            b17.a();
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmTokenManager", "deleteInstanceId err: " + e17);
            return false;
        }
    }

    public static final java.lang.String b() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("fcm_curr_reg_token", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        return string;
    }

    public static final void c(java.lang.String token) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmTokenManager", "storeCurrRegFcmToken ".concat(token));
        if (android.text.TextUtils.isEmpty(token)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FCM.FcmTokenManager", "skip: token is empty");
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.FCM.FcmTokenManager");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putString("fcm_curr_reg_token", token);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("fcm_curr_reg_time", java.lang.System.currentTimeMillis());
    }
}
