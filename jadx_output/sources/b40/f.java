package b40;

@j95.b
/* loaded from: classes8.dex */
public class f extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.Future[] f17778d = {null};

    /* renamed from: e, reason: collision with root package name */
    public boolean f17779e = false;

    public final boolean Ai() {
        a92.b b17 = a92.b.b();
        if (b17 == null) {
            return false;
        }
        boolean z17 = !android.text.TextUtils.isEmpty(a92.f.b());
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FcmRegister", "FCM onLogout. isRegToSvr:" + z17);
        ((java.util.LinkedList) com.tencent.mm.plugin.fcm.WCFirebaseMessagingService.f101690n).clear();
        ((ku5.t0) ku5.t0.f312615d).g(new a92.b$$a());
        if (z17) {
            b17.d(a92.f.b());
        } else {
            jx3.f.INSTANCE.idkeyStat(901L, 20L, 1L, false);
        }
        return true;
    }

    public final boolean Bi() {
        synchronized (this.f17778d) {
            java.util.concurrent.Future future = this.f17778d[0];
            if (future == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FCM.FCMFeatureService", "[-] loadFCMRes is null.");
                return false;
            }
            try {
                return ((java.lang.Boolean) future.get()).booleanValue();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FCM.FCMFeatureService", th6, "[-] Fail to get loadFCM flag.", new java.lang.Object[0]);
                return false;
            }
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        if (Bi()) {
            wi();
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        if (Bi()) {
            Ai();
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        synchronized (this.f17778d) {
            java.util.concurrent.Future[] futureArr = this.f17778d;
            if (futureArr[0] == null) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                b40.e eVar = new b40.e(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                futureArr[0] = t0Var.m(eVar, 0L);
            }
        }
    }

    public final boolean wi() {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FCM.FCMFeatureService", "accout not ready");
            return false;
        }
        synchronized (this.f17778d) {
            if (this.f17779e) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FCM.FCMFeatureService", "handleLogin skip, already load fcm");
            } else {
                a92.b b17 = a92.b.b();
                com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FCMFeatureService", "handleLogin, fcmRegister=".concat(b17 == null ? "null" : "not null"));
                if (b17 != null) {
                    b17.a();
                    this.f17779e = true;
                    return true;
                }
            }
            return false;
        }
    }
}
