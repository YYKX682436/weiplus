package a92;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f2420a = jz5.h.b(a92.c.f2417d);

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f2421b = jz5.h.b(a92.d.f2418d);

    /* renamed from: c, reason: collision with root package name */
    public static final a92.e f2422c = new a92.e();

    public static final boolean a() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmTokenManager", "deleteInstanceId");
            com.google.firebase.iid.FirebaseInstanceId b17 = com.google.firebase.iid.FirebaseInstanceId.b();
            kotlin.jvm.internal.o.d(b17);
            b17.a();
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmTokenManager", "deleteInstanceId err: " + e17);
            return false;
        }
    }

    public static final java.lang.String b() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.L().getString("fcm_curr_reg_token", "");
        kotlin.jvm.internal.o.d(string);
        return string;
    }

    public static final void c(java.lang.String token) {
        kotlin.jvm.internal.o.g(token, "token");
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmTokenManager", "storeCurrRegFcmToken ".concat(token));
        if (android.text.TextUtils.isEmpty(token)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FCM.FcmTokenManager", "skip: token is empty");
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.FCM.FcmTokenManager");
        com.tencent.mm.sdk.platformtools.o4.L().putString("fcm_curr_reg_token", token);
        com.tencent.mm.sdk.platformtools.o4.L().putLong("fcm_curr_reg_time", java.lang.System.currentTimeMillis());
    }
}
