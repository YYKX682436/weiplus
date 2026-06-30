package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$7 */
/* loaded from: classes11.dex */
class RunnableC5027x3a89ce3f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f134815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.a7 f134816f;

    public RunnableC5027x3a89ce3f(com.p314xaae8f345.mm.app.a7 a7Var, java.lang.String str, long j17) {
        this.f134816f = a7Var;
        this.f134814d = str;
        this.f134815e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.app.a7 a7Var = this.f134816f;
        long j17 = this.f134815e;
        ((os.a) ((ps.e) i95.n0.c(ps.e.class))).getClass();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1022xc56d9687.a.f156187d.a()) {
            ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        }
        com.p314xaae8f345.mm.p957x53236a1b.b0.H(true);
        e11.b.e(true);
        if (w11.t1.a("")) {
            w11.p1 p1Var = w11.p1.f523635d;
            w11.r1 r1Var = new w11.r1();
            r1Var.f523670l = p1Var;
            r1Var.b();
        } else {
            w11.p1 p1Var2 = w11.p1.f523635d;
            w11.r1 r1Var2 = new w11.r1();
            r1Var2.f523670l = p1Var2;
            r1Var2.a().a();
        }
        ((e21.z0) c01.d9.b().w()).c(null);
        com.p314xaae8f345.mm.p959x883644fd.i0.h(true);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6146x2bfbe4e9 c6146x2bfbe4e9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6146x2bfbe4e9();
        am.gy gyVar = c6146x2bfbe4e9.f136408g;
        gyVar.f88331a = true;
        gyVar.f88332b = 1;
        c6146x2bfbe4e9.e();
        com.p314xaae8f345.mm.p943x351df9c2.b1.f151959b = 0;
        com.p314xaae8f345.mm.p943x351df9c2.b1.f151960c.d();
        c01.sc.d().a(19, 1);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5160x33ad8273 c5160x33ad8273 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5160x33ad8273();
        c5160x33ad8273.f135510g.f89217a = true;
        c5160x33ad8273.e();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47 c5147x8f44fd47 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47();
        c5147x8f44fd47.f135497g.f87945a = true;
        c5147x8f44fd47.e();
        com.p314xaae8f345.mm.p642xad8b531f.h3 h3Var = com.p314xaae8f345.mm.p642xad8b531f.h3.f144912q;
        long j18 = h3Var.f144924l;
        java.lang.String str = this.f134814d;
        if (j18 == -1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.j3 j3Var = h3Var.f144913a;
            if (j3Var.c(3, 0) == 0) {
                j3Var.h(1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
            }
            h3Var.f144924l = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            java.lang.Object[] objArr = new java.lang.Object[2];
            com.p314xaae8f345.mm.p642xad8b531f.g3 g3Var = h3Var.f144917e;
            objArr[0] = g3Var == null ? "null" : g3Var.f144897a;
            objArr[1] = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StayTimeReport", "onAppResume chatUser:%s, class:%s", objArr);
            if (h3Var.f144917e != null) {
                h3Var.f144921i = android.os.SystemClock.elapsedRealtime();
                if (str != null && str.contains("WebViewUI")) {
                    h3Var.f144922j = android.os.SystemClock.elapsedRealtime();
                }
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5149xdc6c5daf c5149xdc6c5daf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5149xdc6c5daf();
        am.e eVar = c5149xdc6c5daf.f135498g;
        eVar.f88043a = true;
        eVar.f88044b = str;
        c5149xdc6c5daf.e();
        try {
            if (com.p314xaae8f345.mm.app.a7.A) {
                return;
            }
            com.p314xaae8f345.mm.app.a7.A = true;
            if (!a7Var.f134837d) {
                a7Var.f134837d = true;
                return;
            }
            q35.a.a();
            if (q35.b.b() || a7Var.f134838e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "SdcardUsableDetectionEvent pass tipCountAboutSdcardDisable=%s ifSdcardDialogShow=%s", java.lang.Integer.valueOf(com.p314xaae8f345.mm.app.a7.f134836z), java.lang.Boolean.valueOf(a7Var.f134838e));
                com.p314xaae8f345.mm.app.a7.f134836z = -1;
                if (a7Var.f134838e) {
                    return;
                }
                android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("sdcard_usable_report", 4);
                int i17 = sharedPreferences.getInt("mm_process_pid", -1);
                int myPid = android.os.Process.myPid();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "SdcardUsableDetectionEvent pass mmPid=%s mmCurPid=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(myPid));
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (i17 == -1) {
                    return;
                }
                if (i17 == myPid) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(951, 22);
                } else {
                    if (!(i17 == myPid)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(951, 21);
                    }
                }
                android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("mm_process_pid", -1);
                edit.apply();
                return;
            }
            int i18 = com.p314xaae8f345.mm.app.a7.f134836z + 1;
            com.p314xaae8f345.mm.app.a7.f134836z = i18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "tipCountAboutSdcardDisable:%d", java.lang.Integer.valueOf(i18));
            int i19 = com.p314xaae8f345.mm.app.a7.f134836z;
            if (i19 <= 0) {
                return;
            }
            a7Var.f134838e = true;
            if (i19 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(951, 0);
                android.content.SharedPreferences.Editor edit2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("sdcard_usable_report", 4).edit();
                edit2.putInt("mm_process_pid", android.os.Process.myPid());
                edit2.apply();
            } else if (i19 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(951, 1);
            } else if (i19 == 5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(951, 2);
            } else if (i19 == 10) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(951, 3);
            }
            a7Var.f134840g.post(new java.lang.Runnable() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$7.1
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    u1Var.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iby));
                    u1Var.u(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
                    u1Var.a(false);
                    u1Var.l(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated.7.1.1
                        @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
                        public void a(boolean z18, java.lang.String str2) {
                            com.p314xaae8f345.mm.app.a7 a7Var2 = com.p314xaae8f345.mm.app.RunnableC5027x3a89ce3f.this.f134816f;
                            a7Var2.f134837d = false;
                            a7Var2.f134838e = false;
                        }
                    });
                    u1Var.q(false);
                }
            });
        } catch (java.lang.Throwable th6) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "check sdcard failed, message = %s", th6.getMessage());
            } finally {
                com.p314xaae8f345.mm.app.a7.A = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "[onAppForeground] cost:%s", java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - j17));
            }
        }
    }
}
