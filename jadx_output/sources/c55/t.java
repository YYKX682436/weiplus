package c55;

/* loaded from: classes12.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f38761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c55.u f38763f;

    public t(c55.u uVar, java.util.concurrent.CountDownLatch countDownLatch, java.lang.String str) {
        this.f38763f = uVar;
        this.f38761d = countDownLatch;
        this.f38762e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.recovery.ui.RecoveryUI recoveryUI = this.f38763f.f38766d;
        final java.util.concurrent.CountDownLatch countDownLatch = this.f38761d;
        m3.a aVar = new m3.a() { // from class: c55.t$$a
            @Override // m3.a
            public final void accept(java.lang.Object obj) {
                java.lang.Integer num = (java.lang.Integer) obj;
                c55.t tVar = c55.t.this;
                tVar.getClass();
                d55.u.b("MicroMsg.recovery.ui", "#fetchTinkerPatch callback, status = " + num, new java.lang.Object[0]);
                d55.w wVar = new d55.w(tVar.f38763f.f38766d.getApplication(), "recovery_statistic");
                wVar.e();
                int i17 = wVar.getInt("crash_count", 0);
                boolean z17 = wVar.getBoolean("launch_recovery", false);
                boolean z18 = wVar.getBoolean("launch_recovery_real", false);
                boolean z19 = wVar.getBoolean("recover_from_crash", false);
                wVar.getInt("recovery_status", -1);
                int i18 = wVar.getInt("recovery_from", 0);
                int i19 = wVar.getInt("recover_internal_status", 0);
                int i27 = wVar.getInt("recover_launch_mode", 0);
                long j17 = wVar.getLong("recover_running_time", 0L);
                wVar.getBoolean("recover_is_discard", false);
                java.lang.String string = wVar.getString("recover_app_ver", "");
                int intValue = num.intValue();
                wVar.g("crash_count", i17);
                wVar.putBoolean("launch_recovery", z17);
                wVar.putBoolean("launch_recovery_real", z18);
                wVar.putBoolean("recover_from_crash", z19);
                wVar.putInt("recovery_status", intValue);
                wVar.putInt("recovery_from", i18);
                wVar.putInt("recover_internal_status", i19);
                wVar.putInt("recover_launch_mode", i27);
                wVar.putLong("recover_running_time", j17);
                wVar.putBoolean("recover_is_discard", false);
                wVar.putString("recover_app_ver", string);
                wVar.c();
                countDownLatch.countDown();
            }
        };
        java.lang.String str = this.f38762e;
        java.lang.Thread thread = com.tencent.mm.recovery.ui.RecoveryUI.f192192s;
        recoveryUI.getClass();
        try {
            android.content.Intent intent = recoveryUI.getIntent();
            java.lang.String stringExtra = intent.getStringExtra("extra_patch_url");
            java.lang.String dataString = android.text.TextUtils.isEmpty(stringExtra) ? intent.getDataString() : stringExtra;
            if (android.text.TextUtils.isEmpty(dataString)) {
                d55.u.b("MicroMsg.recovery.ui", "#fetchTinkerPatch fetch patch url with cgi", new java.lang.Object[0]);
                y45.m.c(recoveryUI.getApplicationContext(), aVar, str, false, false);
            } else {
                d55.u.b("MicroMsg.recovery.ui", "#fetchTinkerPatch download patch with given url, url = " + dataString, new java.lang.Object[0]);
                y45.m.b(recoveryUI.getApplicationContext(), dataString, 0L, null, aVar, true);
            }
        } catch (java.lang.Throwable th6) {
            d55.u.c("MicroMsg.recovery.ui", "fetch error", th6, new java.lang.Object[0]);
            aVar.accept(10);
        }
    }
}
