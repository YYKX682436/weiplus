package c55;

/* loaded from: classes12.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f120294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c55.u f120296f;

    public t(c55.u uVar, java.util.concurrent.CountDownLatch countDownLatch, java.lang.String str) {
        this.f120296f = uVar;
        this.f120294d = countDownLatch;
        this.f120295e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed509 = this.f120296f.f120299d;
        final java.util.concurrent.CountDownLatch countDownLatch = this.f120294d;
        m3.a aVar = new m3.a() { // from class: c55.t$$a
            @Override // m3.a
            /* renamed from: accept */
            public final void mo3938xab27b508(java.lang.Object obj) {
                java.lang.Integer num = (java.lang.Integer) obj;
                c55.t tVar = c55.t.this;
                tVar.getClass();
                d55.u.b("MicroMsg.recovery.ui", "#fetchTinkerPatch callback, status = " + num, new java.lang.Object[0]);
                d55.w wVar = new d55.w(tVar.f120296f.f120299d.getApplication(), "recovery_statistic");
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
                countDownLatch.countDown();
            }
        };
        java.lang.String str = this.f120295e;
        java.lang.Thread thread = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s;
        activityC19822xa98ed509.getClass();
        try {
            android.content.Intent intent = activityC19822xa98ed509.getIntent();
            java.lang.String stringExtra = intent.getStringExtra("extra_patch_url");
            java.lang.String dataString = android.text.TextUtils.isEmpty(stringExtra) ? intent.getDataString() : stringExtra;
            if (android.text.TextUtils.isEmpty(dataString)) {
                d55.u.b("MicroMsg.recovery.ui", "#fetchTinkerPatch fetch patch url with cgi", new java.lang.Object[0]);
                y45.m.c(activityC19822xa98ed509.getApplicationContext(), aVar, str, false, false);
            } else {
                d55.u.b("MicroMsg.recovery.ui", "#fetchTinkerPatch download patch with given url, url = " + dataString, new java.lang.Object[0]);
                y45.m.b(activityC19822xa98ed509.getApplicationContext(), dataString, 0L, null, aVar, true);
            }
        } catch (java.lang.Throwable th6) {
            d55.u.c("MicroMsg.recovery.ui", "fetch error", th6, new java.lang.Object[0]);
            aVar.mo3938xab27b508(10);
        }
    }
}
