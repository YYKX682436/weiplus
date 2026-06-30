package com.p314xaae8f345.p2922xd05e7f95.wx.p2924x7643c6b5;

/* renamed from: com.tencent.recovery.wx.service.WXRecoveryUploadService */
/* loaded from: classes12.dex */
public class IntentServiceC25473x7e1fb37e extends android.app.IntentService {

    /* renamed from: EXTRA_CRASH_COUNT */
    private static final java.lang.String f46240x989cb868 = "extra_crash_count";

    /* renamed from: EXTRA_FETCH_BASE_ID */
    private static final java.lang.String f46241xc74bf695 = "extra_fetch_base_id";

    /* renamed from: EXTRA_FOR_TEST */
    private static final java.lang.String f46242x6d55e9d7 = "extra_for_test";

    /* renamed from: EXTRA_NEXT_RETRY_DELAY_MS */
    private static final java.lang.String f46243xc09885d6 = "extra_next_retry_delay_ms";

    /* renamed from: EXTRA_PATCH_URL */
    private static final java.lang.String f46244x932ab729 = "extra_patch_url";

    /* renamed from: EXTRA_RETRY_COUNTER */
    private static final java.lang.String f46245x6b337516 = "extra_retry_counter";

    /* renamed from: EXTRA_USE_HTTPS_ONLY */
    private static final java.lang.String f46246x48bff0a7 = "extra_use_https_only";

    /* renamed from: MAX_RETRY_COUNT */
    private static final int f46247xb7e3a1fd = 3;

    /* renamed from: MAX_RETRY_DELAY_MS */
    private static final int f46248xa9b38234 = 14400000;

    /* renamed from: RECOVERY_TAG */
    private static final java.lang.String f46249x1950fd0 = "MicroMsg.recovery.service";

    /* renamed from: com.tencent.recovery.wx.service.WXRecoveryUploadService$IFetchCallback */
    /* loaded from: classes12.dex */
    public interface IFetchCallback {
        /* renamed from: onCallback */
        void mo94452x9ad64344(int i17);
    }

    public IntentServiceC25473x7e1fb37e() {
        super("WXRecoveryUploadService");
    }

    /* renamed from: fetchTinkerPatch */
    public static void m94446xdca7e94f(android.content.Context context, sc0.f fVar, java.lang.String str, boolean z17, boolean z18) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(context, com.p314xaae8f345.p2922xd05e7f95.wx.p2924x7643c6b5.IntentServiceC25473x7e1fb37e.class);
        intent.putExtra(f46241xc74bf695, str);
        intent.putExtra(f46242x6d55e9d7, z17);
        intent.putExtra(f46246x48bff0a7, z18);
        try {
            context.startService(intent);
            d55.w wVar = new d55.w(context, "recovery_statistic");
            wVar.e();
            wVar.mo123525xb58848b9("crash_count", 0);
            wVar.mo123524x41a8a7f2("launch_recovery", false);
            boolean mo123524x41a8a7f2 = wVar.mo123524x41a8a7f2("launch_recovery_real", false);
            boolean mo123524x41a8a7f22 = wVar.mo123524x41a8a7f2("recover_from_crash", false);
            int mo123525xb58848b9 = wVar.mo123525xb58848b9("recovery_status", -1);
            wVar.mo123525xb58848b9("recovery_from", 0);
            int mo123525xb58848b92 = wVar.mo123525xb58848b9("recover_internal_status", 0);
            wVar.mo123525xb58848b9("recover_launch_mode", 0);
            wVar.mo123526xfb822ef2("recover_running_time", 0L);
            wVar.mo123524x41a8a7f2("recover_is_discard", false);
            java.lang.String mo123527x2fec8307 = wVar.mo123527x2fec8307("recover_app_ver", "");
            int i17 = fVar.f487172d;
            long max = java.lang.Math.max(java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.app.x.f135439a, 0L);
            wVar.g("crash_count", 0);
            wVar.mo123528x1c849219("launch_recovery", true);
            wVar.mo123528x1c849219("launch_recovery_real", mo123524x41a8a7f2);
            wVar.mo123528x1c849219("recover_from_crash", mo123524x41a8a7f22);
            wVar.mo123529xc5c55e60("recovery_status", mo123525xb58848b9);
            wVar.mo123529xc5c55e60("recovery_from", i17);
            wVar.mo123529xc5c55e60("recover_internal_status", mo123525xb58848b92);
            wVar.mo123529xc5c55e60("recover_launch_mode", 2);
            wVar.mo123530xf2e7ce2b("recover_running_time", max);
            wVar.mo123528x1c849219("recover_is_discard", false);
            wVar.mo123531xe4673800("recover_app_ver", mo123527x2fec8307);
            wVar.d();
            d55.w wVar2 = new d55.w(context, "recovery_statistic");
            wVar2.e();
            int mo123525xb58848b93 = wVar2.mo123525xb58848b9("crash_count", 0);
            boolean mo123524x41a8a7f23 = wVar2.mo123524x41a8a7f2("launch_recovery", false);
            boolean mo123524x41a8a7f24 = wVar2.mo123524x41a8a7f2("launch_recovery_real", false);
            boolean mo123524x41a8a7f25 = wVar2.mo123524x41a8a7f2("recover_from_crash", false);
            int mo123525xb58848b94 = wVar2.mo123525xb58848b9("recovery_status", -1);
            int mo123525xb58848b95 = wVar2.mo123525xb58848b9("recovery_from", 0);
            int mo123525xb58848b96 = wVar2.mo123525xb58848b9("recover_internal_status", 0);
            int mo123525xb58848b97 = wVar2.mo123525xb58848b9("recover_launch_mode", 0);
            long mo123526xfb822ef2 = wVar2.mo123526xfb822ef2("recover_running_time", 0L);
            boolean mo123524x41a8a7f26 = wVar2.mo123524x41a8a7f2("recover_is_discard", false);
            java.lang.String mo123527x2fec83072 = wVar2.mo123527x2fec8307("recover_app_ver", "");
            wVar2.g("crash_count", mo123525xb58848b93);
            wVar2.mo123528x1c849219("launch_recovery", mo123524x41a8a7f23);
            wVar2.mo123528x1c849219("launch_recovery_real", mo123524x41a8a7f24);
            wVar2.mo123528x1c849219("recover_from_crash", mo123524x41a8a7f25);
            wVar2.mo123529xc5c55e60("recovery_status", mo123525xb58848b94);
            wVar2.mo123529xc5c55e60("recovery_from", mo123525xb58848b95);
            wVar2.mo123529xc5c55e60("recover_internal_status", mo123525xb58848b96);
            wVar2.mo123529xc5c55e60("recover_launch_mode", mo123525xb58848b97);
            wVar2.mo123530xf2e7ce2b("recover_running_time", mo123526xfb822ef2);
            wVar2.mo123528x1c849219("recover_is_discard", mo123524x41a8a7f26);
            wVar2.mo123531xe4673800("recover_app_ver", mo123527x2fec83072);
            wVar2.c();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(f46249x1950fd0, "start service fail", th6);
        }
    }

    /* renamed from: fetchTinkerPatchForTest */
    private void m94448x249920ac(android.content.Intent intent, final com.p314xaae8f345.p2922xd05e7f95.wx.p2924x7643c6b5.IntentServiceC25473x7e1fb37e.IFetchCallback iFetchCallback) {
        boolean booleanExtra = intent.getBooleanExtra(f46246x48bff0a7, true);
        java.lang.String stringExtra = intent.getStringExtra(f46241xc74bf695);
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            d55.u.d(f46249x1950fd0, "fetchTinkerPatchForTest: you must provide baseId when test patch fetching.", new java.lang.Object[0]);
            return;
        }
        d55.u.b(f46249x1950fd0, "fetchTinkerPatchForTest, baseId = %s, useHTTPSOnly = %s", stringExtra, java.lang.Boolean.valueOf(booleanExtra));
        android.content.Context applicationContext = getApplicationContext();
        m3.a aVar = new m3.a() { // from class: com.tencent.recovery.wx.service.WXRecoveryUploadService$$a
            @Override // m3.a
            /* renamed from: accept */
            public final void mo3938xab27b508(java.lang.Object obj) {
                com.p314xaae8f345.p2922xd05e7f95.wx.p2924x7643c6b5.IntentServiceC25473x7e1fb37e.m94450xe96af39c(com.p314xaae8f345.p2922xd05e7f95.wx.p2924x7643c6b5.IntentServiceC25473x7e1fb37e.IFetchCallback.this, (java.lang.Integer) obj);
            }
        };
        d55.u.b("MicroMsg.recovery.operator", "#fetchTinkerPatchForTest", new java.lang.Object[0]);
        a55.h.f83150a.a();
        y45.n nVar = new y45.n(aVar);
        r45.f35 f35Var = new r45.f35();
        f35Var.f455520d = stringExtra;
        f35Var.f455521e = lp0.a.a();
        f35Var.f455522f = b55.b.b();
        f35Var.f455527n = 1;
        y45.m.a(applicationContext, f35Var, nVar, false, booleanExtra, false);
        d55.u.b(f46249x1950fd0, "fetchTinkerPatchForTest done", new java.lang.Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$fetchTinkerPatch$2 */
    public void m94449x45a2061a(com.p314xaae8f345.p2922xd05e7f95.wx.p2924x7643c6b5.IntentServiceC25473x7e1fb37e.IFetchCallback iFetchCallback, java.lang.Integer num) {
        d55.u.b(f46249x1950fd0, "#fetchTinkerPatch callback, status = " + num, new java.lang.Object[0]);
        d55.u.b(f46249x1950fd0, "#fetchTinkerPatch done, status = " + num, new java.lang.Object[0]);
        d55.w wVar = new d55.w(getApplication(), "recovery_statistic");
        wVar.e();
        int mo123525xb58848b9 = wVar.mo123525xb58848b9("crash_count", 0);
        boolean mo123524x41a8a7f2 = wVar.mo123524x41a8a7f2("launch_recovery", false);
        boolean mo123524x41a8a7f22 = wVar.mo123524x41a8a7f2("launch_recovery_real", false);
        boolean mo123524x41a8a7f23 = wVar.mo123524x41a8a7f2("recover_from_crash", false);
        wVar.mo123525xb58848b9("recovery_status", -1);
        int mo123525xb58848b92 = wVar.mo123525xb58848b9("recovery_from", 0);
        int mo123525xb58848b93 = wVar.mo123525xb58848b9("recover_internal_status", 0);
        int mo123525xb58848b94 = wVar.mo123525xb58848b9("recover_launch_mode", 0);
        long mo123526xfb822ef2 = wVar.mo123526xfb822ef2("recover_running_time", 0L);
        wVar.mo123524x41a8a7f2("recover_is_discard", false);
        java.lang.String mo123527x2fec8307 = wVar.mo123527x2fec8307("recover_app_ver", "");
        int intValue = num.intValue();
        wVar.g("crash_count", mo123525xb58848b9);
        wVar.mo123528x1c849219("launch_recovery", mo123524x41a8a7f2);
        wVar.mo123528x1c849219("launch_recovery_real", mo123524x41a8a7f22);
        wVar.mo123528x1c849219("recover_from_crash", mo123524x41a8a7f23);
        wVar.mo123529xc5c55e60("recovery_status", intValue);
        wVar.mo123529xc5c55e60("recovery_from", mo123525xb58848b92);
        wVar.mo123529xc5c55e60("recover_internal_status", mo123525xb58848b93);
        wVar.mo123529xc5c55e60("recover_launch_mode", mo123525xb58848b94);
        wVar.mo123530xf2e7ce2b("recover_running_time", mo123526xfb822ef2);
        wVar.mo123528x1c849219("recover_is_discard", false);
        wVar.mo123531xe4673800("recover_app_ver", mo123527x2fec8307);
        wVar.c();
        if (iFetchCallback != null) {
            iFetchCallback.mo94452x9ad64344(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$fetchTinkerPatchForTest$1 */
    public static /* synthetic */ void m94450xe96af39c(com.p314xaae8f345.p2922xd05e7f95.wx.p2924x7643c6b5.IntentServiceC25473x7e1fb37e.IFetchCallback iFetchCallback, java.lang.Integer num) {
        d55.u.b(f46249x1950fd0, "fetchTinkerPatchForTest callback, status = " + num, new java.lang.Object[0]);
        if (iFetchCallback != null) {
            iFetchCallback.mo94452x9ad64344(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onHandleIntent$0 */
    public void m94451xf470e16c(android.content.Intent intent, int i17) {
        if (i17 > 60 || i17 > 20) {
            try {
                int intExtra = intent.getIntExtra(f46245x6b337516, 0);
                if (intExtra > 3) {
                    d55.u.d(f46249x1950fd0, "[!] Max retry count exceeded, give up.", new java.lang.Object[0]);
                    return;
                }
                android.app.AlarmManager alarmManager = (android.app.AlarmManager) getApplicationContext().getSystemService("alarm");
                android.content.Intent intent2 = new android.content.Intent(intent);
                intent2.putExtra(f46245x6b337516, intExtra + 1);
                long intExtra2 = intent.getIntExtra(f46243xc09885d6, 3600000);
                intent2.putExtra(f46243xc09885d6, java.lang.Math.min(java.lang.Math.max(intExtra2 >> 1, 60000L) + intExtra2, 14400000L));
                android.app.PendingIntent service = android.app.PendingIntent.getService(getApplicationContext(), 1, intent2, 201326592);
                long currentTimeMillis = java.lang.System.currentTimeMillis() + intExtra2;
                java.util.Objects.requireNonNull(service);
                z2.n.b(alarmManager, 0, currentTimeMillis, service);
            } catch (java.lang.Throwable th6) {
                d55.u.c(f46249x1950fd0, "[!] fetch patch callback throws exception.", th6, new java.lang.Object[0]);
            }
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        d55.u.b(f46249x1950fd0, "onBind", new java.lang.Object[0]);
        onHandleIntent(intent);
        return null;
    }

    @Override // android.app.IntentService
    public void onHandleIntent(final android.content.Intent intent) {
        if (intent == null) {
            d55.u.d(f46249x1950fd0, "intent is null.", new java.lang.Object[0]);
            return;
        }
        com.p314xaae8f345.p2922xd05e7f95.wx.p2924x7643c6b5.IntentServiceC25473x7e1fb37e.IFetchCallback iFetchCallback = new com.p314xaae8f345.p2922xd05e7f95.wx.p2924x7643c6b5.IntentServiceC25473x7e1fb37e.IFetchCallback() { // from class: com.tencent.recovery.wx.service.WXRecoveryUploadService$$b
            @Override // com.p314xaae8f345.p2922xd05e7f95.wx.p2924x7643c6b5.IntentServiceC25473x7e1fb37e.IFetchCallback
            /* renamed from: onCallback */
            public final void mo94452x9ad64344(int i17) {
                com.p314xaae8f345.p2922xd05e7f95.wx.p2924x7643c6b5.IntentServiceC25473x7e1fb37e.this.m94451xf470e16c(intent, i17);
            }
        };
        d55.w wVar = new d55.w(getApplication(), "recovery_statistic");
        wVar.e();
        int mo123525xb58848b9 = wVar.mo123525xb58848b9("crash_count", 0);
        boolean mo123524x41a8a7f2 = wVar.mo123524x41a8a7f2("launch_recovery", false);
        wVar.mo123524x41a8a7f2("launch_recovery_real", false);
        boolean mo123524x41a8a7f22 = wVar.mo123524x41a8a7f2("recover_from_crash", false);
        int mo123525xb58848b92 = wVar.mo123525xb58848b9("recovery_status", -1);
        int mo123525xb58848b93 = wVar.mo123525xb58848b9("recovery_from", 0);
        int mo123525xb58848b94 = wVar.mo123525xb58848b9("recover_internal_status", 0);
        int mo123525xb58848b95 = wVar.mo123525xb58848b9("recover_launch_mode", 0);
        long mo123526xfb822ef2 = wVar.mo123526xfb822ef2("recover_running_time", 0L);
        boolean mo123524x41a8a7f23 = wVar.mo123524x41a8a7f2("recover_is_discard", false);
        java.lang.String mo123527x2fec8307 = wVar.mo123527x2fec8307("recover_app_ver", "");
        wVar.g("crash_count", mo123525xb58848b9);
        wVar.mo123528x1c849219("launch_recovery", mo123524x41a8a7f2);
        wVar.mo123528x1c849219("launch_recovery_real", true);
        wVar.mo123528x1c849219("recover_from_crash", mo123524x41a8a7f22);
        wVar.mo123529xc5c55e60("recovery_status", mo123525xb58848b92);
        wVar.mo123529xc5c55e60("recovery_from", mo123525xb58848b93);
        wVar.mo123529xc5c55e60("recover_internal_status", mo123525xb58848b94);
        wVar.mo123529xc5c55e60("recover_launch_mode", mo123525xb58848b95);
        wVar.mo123530xf2e7ce2b("recover_running_time", mo123526xfb822ef2);
        wVar.mo123528x1c849219("recover_is_discard", mo123524x41a8a7f23);
        wVar.mo123531xe4673800("recover_app_ver", mo123527x2fec8307);
        wVar.c();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (intent.getBooleanExtra(f46242x6d55e9d7, false)) {
            m94448x249920ac(intent, iFetchCallback);
        } else {
            m94447xdca7e94f(intent, iFetchCallback);
        }
    }

    /* renamed from: fetchTinkerPatch */
    private void m94447xdca7e94f(android.content.Intent intent, final com.p314xaae8f345.p2922xd05e7f95.wx.p2924x7643c6b5.IntentServiceC25473x7e1fb37e.IFetchCallback iFetchCallback) {
        d55.u.b(f46249x1950fd0, "#onHandleIntent, thread = %s, crash count = %s", java.lang.Thread.currentThread().getName(), java.lang.Integer.valueOf(intent.getIntExtra(f46240x989cb868, -1)));
        m3.a aVar = new m3.a() { // from class: com.tencent.recovery.wx.service.WXRecoveryUploadService$$c
            @Override // m3.a
            /* renamed from: accept */
            public final void mo3938xab27b508(java.lang.Object obj) {
                com.p314xaae8f345.p2922xd05e7f95.wx.p2924x7643c6b5.IntentServiceC25473x7e1fb37e.this.m94449x45a2061a(iFetchCallback, (java.lang.Integer) obj);
            }
        };
        try {
            java.lang.String stringExtra = intent.getStringExtra(f46244x932ab729);
            if (android.text.TextUtils.isEmpty(stringExtra)) {
                stringExtra = intent.getDataString();
            }
            java.lang.String str = stringExtra;
            if (android.text.TextUtils.isEmpty(str)) {
                d55.u.b(f46249x1950fd0, "#fetchTinkerPatch, fetch patch url with cgi", new java.lang.Object[0]);
                y45.m.c(getApplicationContext(), aVar, null, intent.getBooleanExtra(f46246x48bff0a7, false), true);
            } else {
                d55.u.b(f46249x1950fd0, "#fetchTinkerPatch, download patch with given url, url = " + str, new java.lang.Object[0]);
                y45.m.b(getApplicationContext(), str, 0L, null, aVar, true);
            }
        } catch (java.lang.Throwable th6) {
            d55.u.c(f46249x1950fd0, "fetch error", th6, new java.lang.Object[0]);
            aVar.mo3938xab27b508(10);
        }
    }
}
