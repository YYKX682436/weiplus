package b40;

@j95.b
/* loaded from: classes8.dex */
public class f extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.Future[] f99311d = {null};

    /* renamed from: e, reason: collision with root package name */
    public boolean f99312e = false;

    public final boolean Ai() {
        a92.b b17 = a92.b.b();
        if (b17 == null) {
            return false;
        }
        boolean z17 = !android.text.TextUtils.isEmpty(a92.f.b());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FcmRegister", "FCM onLogout. isRegToSvr:" + z17);
        ((java.util.LinkedList) com.p314xaae8f345.mm.p1006xc5476f33.fcm.ServiceC13631x7118ce24.f183223n).clear();
        ((ku5.t0) ku5.t0.f394148d).g(new a92.RunnableC0005x2d183f());
        if (z17) {
            b17.d(a92.f.b());
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(901L, 20L, 1L, false);
        }
        return true;
    }

    public final boolean Bi() {
        synchronized (this.f99311d) {
            java.util.concurrent.Future future = this.f99311d[0];
            if (future == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FCM.FCMFeatureService", "[-] loadFCMRes is null.");
                return false;
            }
            try {
                return ((java.lang.Boolean) future.get()).booleanValue();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FCM.FCMFeatureService", th6, "[-] Fail to get loadFCM flag.", new java.lang.Object[0]);
                return false;
            }
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        if (Bi()) {
            wi();
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        if (Bi()) {
            Ai();
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        synchronized (this.f99311d) {
            java.util.concurrent.Future[] futureArr = this.f99311d;
            if (futureArr[0] == null) {
                ku5.u0 u0Var = ku5.t0.f394148d;
                b40.e eVar = new b40.e(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                futureArr[0] = t0Var.m(eVar, 0L);
            }
        }
    }

    public final boolean wi() {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FCM.FCMFeatureService", "accout not ready");
            return false;
        }
        synchronized (this.f99311d) {
            if (this.f99312e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FCM.FCMFeatureService", "handleLogin skip, already load fcm");
            } else {
                a92.b b17 = a92.b.b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FCMFeatureService", "handleLogin, fcmRegister=".concat(b17 == null ? "null" : "not null"));
                if (b17 != null) {
                    b17.a();
                    this.f99312e = true;
                    return true;
                }
            }
            return false;
        }
    }
}
