package com.tencent.mm.app;

/* loaded from: classes11.dex */
class TempAppForegroundNotifyDeprecated$7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f53282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.a7 f53283f;

    public TempAppForegroundNotifyDeprecated$7(com.tencent.mm.app.a7 a7Var, java.lang.String str, long j17) {
        this.f53283f = a7Var;
        this.f53281d = str;
        this.f53282e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.app.a7 a7Var = this.f53283f;
        long j17 = this.f53282e;
        ((os.a) ((ps.e) i95.n0.c(ps.e.class))).getClass();
        if (!com.tencent.mm.plugin.ai.data.business.tools_mp.a.f74654d.a()) {
            ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        }
        com.tencent.mm.modelsimple.b0.H(true);
        e11.b.e(true);
        if (w11.t1.a("")) {
            w11.p1 p1Var = w11.p1.f442102d;
            w11.r1 r1Var = new w11.r1();
            r1Var.f442137l = p1Var;
            r1Var.b();
        } else {
            w11.p1 p1Var2 = w11.p1.f442102d;
            w11.r1 r1Var2 = new w11.r1();
            r1Var2.f442137l = p1Var2;
            r1Var2.a().a();
        }
        ((e21.z0) c01.d9.b().w()).c(null);
        com.tencent.mm.modelstat.i0.h(true);
        com.tencent.mm.autogen.events.SyncOfflineTokenEvent syncOfflineTokenEvent = new com.tencent.mm.autogen.events.SyncOfflineTokenEvent();
        am.gy gyVar = syncOfflineTokenEvent.f54875g;
        gyVar.f6798a = true;
        gyVar.f6799b = 1;
        syncOfflineTokenEvent.e();
        com.tencent.mm.modelavatar.b1.f70426b = 0;
        com.tencent.mm.modelavatar.b1.f70427c.d();
        c01.sc.d().a(19, 1);
        com.tencent.mm.autogen.events.AppActiveEvent appActiveEvent = new com.tencent.mm.autogen.events.AppActiveEvent();
        appActiveEvent.f53977g.f7684a = true;
        appActiveEvent.e();
        com.tencent.mm.autogen.events.ActivateEvent activateEvent = new com.tencent.mm.autogen.events.ActivateEvent();
        activateEvent.f53964g.f6412a = true;
        activateEvent.e();
        com.tencent.mm.booter.h3 h3Var = com.tencent.mm.booter.h3.f63379q;
        long j18 = h3Var.f63391l;
        java.lang.String str = this.f53281d;
        if (j18 == -1) {
            com.tencent.mm.storage.j3 j3Var = h3Var.f63380a;
            if (j3Var.c(3, 0) == 0) {
                j3Var.h(1, com.tencent.mm.sdk.platformtools.t8.i1());
            }
            h3Var.f63391l = com.tencent.mm.sdk.platformtools.t8.i1();
            java.lang.Object[] objArr = new java.lang.Object[2];
            com.tencent.mm.booter.g3 g3Var = h3Var.f63384e;
            objArr[0] = g3Var == null ? "null" : g3Var.f63364a;
            objArr[1] = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.StayTimeReport", "onAppResume chatUser:%s, class:%s", objArr);
            if (h3Var.f63384e != null) {
                h3Var.f63388i = android.os.SystemClock.elapsedRealtime();
                if (str != null && str.contains("WebViewUI")) {
                    h3Var.f63389j = android.os.SystemClock.elapsedRealtime();
                }
            }
        }
        com.tencent.mm.autogen.events.ActiveStatusChangedForDataReportEvent activeStatusChangedForDataReportEvent = new com.tencent.mm.autogen.events.ActiveStatusChangedForDataReportEvent();
        am.e eVar = activeStatusChangedForDataReportEvent.f53965g;
        eVar.f6510a = true;
        eVar.f6511b = str;
        activeStatusChangedForDataReportEvent.e();
        try {
            if (com.tencent.mm.app.a7.A) {
                return;
            }
            com.tencent.mm.app.a7.A = true;
            if (!a7Var.f53304d) {
                a7Var.f53304d = true;
                return;
            }
            q35.a.a();
            if (q35.b.b() || a7Var.f53305e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "SdcardUsableDetectionEvent pass tipCountAboutSdcardDisable=%s ifSdcardDialogShow=%s", java.lang.Integer.valueOf(com.tencent.mm.app.a7.f53303z), java.lang.Boolean.valueOf(a7Var.f53305e));
                com.tencent.mm.app.a7.f53303z = -1;
                if (a7Var.f53305e) {
                    return;
                }
                android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("sdcard_usable_report", 4);
                int i17 = sharedPreferences.getInt("mm_process_pid", -1);
                int myPid = android.os.Process.myPid();
                com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "SdcardUsableDetectionEvent pass mmPid=%s mmCurPid=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(myPid));
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (i17 == -1) {
                    return;
                }
                if (i17 == myPid) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 22);
                } else {
                    if (!(i17 == myPid)) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 21);
                    }
                }
                android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("mm_process_pid", -1);
                edit.apply();
                return;
            }
            int i18 = com.tencent.mm.app.a7.f53303z + 1;
            com.tencent.mm.app.a7.f53303z = i18;
            com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "tipCountAboutSdcardDisable:%d", java.lang.Integer.valueOf(i18));
            int i19 = com.tencent.mm.app.a7.f53303z;
            if (i19 <= 0) {
                return;
            }
            a7Var.f53305e = true;
            if (i19 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 0);
                android.content.SharedPreferences.Editor edit2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("sdcard_usable_report", 4).edit();
                edit2.putInt("mm_process_pid", android.os.Process.myPid());
                edit2.apply();
            } else if (i19 == 3) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 1);
            } else if (i19 == 5) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 2);
            } else if (i19 == 10) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(951, 3);
            }
            a7Var.f53307g.post(new java.lang.Runnable() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$7.1
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.iby));
                    u1Var.u(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490573yv));
                    u1Var.a(false);
                    u1Var.l(new com.tencent.mm.ui.widget.dialog.w1() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated.7.1.1
                        @Override // com.tencent.mm.ui.widget.dialog.w1
                        public void a(boolean z18, java.lang.String str2) {
                            com.tencent.mm.app.a7 a7Var2 = com.tencent.mm.app.TempAppForegroundNotifyDeprecated$7.this.f53283f;
                            a7Var2.f53304d = false;
                            a7Var2.f53305e = false;
                        }
                    });
                    u1Var.q(false);
                }
            });
        } catch (java.lang.Throwable th6) {
            try {
                com.tencent.mars.xlog.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "check sdcard failed, message = %s", th6.getMessage());
            } finally {
                com.tencent.mm.app.a7.A = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "[onAppForeground] cost:%s", java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - j17));
            }
        }
    }
}
