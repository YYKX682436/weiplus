package d13;

/* loaded from: classes14.dex */
public final class e implements com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f {

    /* renamed from: d, reason: collision with root package name */
    public final b13.m f307260d;

    /* renamed from: e, reason: collision with root package name */
    public cv.v0 f307261e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f307262f;

    public e(b13.m voipMgr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voipMgr, "voipMgr");
        this.f307260d = voipMgr;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void H5(int i17, java.lang.String str) {
        if (i17 == 233) {
            gq4.v.Bi().f258091a.f257944a.f258065x.M1.f258259m = 1;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public android.content.Context J4() {
        android.app.Activity activity = this.f307260d.H1;
        if (activity != null) {
            return activity;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void K(int i17) {
        i2(i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? new cv.v0(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6p), 0, 4, null) : new cv.v0(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6m), 0, 4, null) : new cv.v0(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6o), 0, 4, null) : new cv.v0(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6n), 0, 4, null) : new cv.v0(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6p), 0, 4, null));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void M4(boolean z17) {
        a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void Q2(boolean z17) {
        if (z17) {
            c13.b0.f119393d.h(z03.g.f550764d, null);
        } else {
            c13.b0.f119393d.h(z03.g.f550765e, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void W2() {
        c13.b0.f119393d.h(z03.g.f550766f, null);
    }

    public final synchronized void a() {
        android.os.PowerManager.WakeLock wakeLock = this.f307262f;
        if (wakeLock == null || !wakeLock.isHeld()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterVoipUI", "repeatedly release screen off wakelock from object: %s, drop this call.", toString());
        } else {
            yj0.a.c(wakeLock, "com/tencent/mm/plugin/flutter/voip/ui/FlutterVoipUI", "turnOnScreen", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            yj0.a.f(wakeLock, "com/tencent/mm/plugin/flutter/voip/ui/FlutterVoipUI", "turnOnScreen", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipUI", "after release screen off wakelock from object: %s, isHeld: %s", toString(), java.lang.Boolean.valueOf(wakeLock.isHeld()));
            this.f307262f = null;
            this.f307260d.getClass();
            c13.b0 b0Var = c13.b0.f119393d;
            ((ku5.t0) ku5.t0.f394148d).B(new c13.o(true));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void e4(java.lang.String str) {
        if (str != null) {
            c13.b0.f119393d.h(z03.g.f550769i, str);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void i2(cv.v0 device) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        if (this.f307261e != null && (i17 = device.f304049a) != 2) {
            if (i17 != 4) {
                if (!this.f307260d.f257921s) {
                    mo72878x1aec5e91(true);
                }
            } else if (!this.f307260d.f257921s) {
                mo72878x1aec5e91(true);
            }
        }
        b13.m mVar = this.f307260d;
        cv.v0 v0Var = mVar.A;
        if (v0Var != null && device.f304049a != v0Var.f304049a) {
            mVar.z0(device.c(), 20);
        }
        mVar.B0(device);
        c13.b0 b0Var = c13.b0.f119393d;
        int i18 = device.f304049a;
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac enumC24111x635c95ac = i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42976xb313ebdf : com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42972x1b72d28e : com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42975x5a332e62 : com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42974xfe9d1958 : com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42976xb313ebdf;
        java.lang.String str = device.f304050b;
        if (str == null) {
            str = "";
        }
        ((ku5.t0) ku5.t0.f394148d).B(new c13.g(new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24112xdba77f81(enumC24111x635c95ac, str), device));
        this.f307261e = device;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void k() {
        boolean z17;
        gq4.v.Bi().getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.f258352f2 < 900 || com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.f258351e2) {
            z17 = false;
        } else {
            z17 = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.f258351e2 = true;
        }
        if (z17) {
            c13.b0.f119393d.h(z03.g.f550767g, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void o5(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void q2(java.util.List devices) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(devices, "devices");
        c13.b0 b0Var = c13.b0.f119393d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = devices.iterator();
        while (it.hasNext()) {
            cv.v0 v0Var = (cv.v0) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipService", "onExternalAudioOutputDeviceChanged is " + v0Var.f304049a);
            if (v0Var.f304050b != null) {
                int i17 = v0Var.f304049a;
                com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac enumC24111x635c95ac = i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42976xb313ebdf : com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42972x1b72d28e : com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42975x5a332e62 : com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42974xfe9d1958 : com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42976xb313ebdf;
                java.lang.String str = v0Var.f304050b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                arrayList.add(new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24112xdba77f81(enumC24111x635c95ac, str));
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new c13.k(arrayList));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    /* renamed from: setScreenEnable */
    public void mo72878x1aec5e91(boolean z17) {
        if (z17) {
            a();
            return;
        }
        synchronized (this) {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            android.os.PowerManager powerManager = (android.os.PowerManager) systemService;
            android.os.PowerManager.WakeLock wakeLock = this.f307262f;
            if (wakeLock == null) {
                wakeLock = powerManager.newWakeLock(32, "wechat:screen flutter-Lock");
                this.f307262f = wakeLock;
            }
            android.os.PowerManager.WakeLock wakeLock2 = wakeLock;
            if (wakeLock2.isHeld()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterVoipUI", "repeatedly acquire screen off wakelock from object: %s, drop this call.", toString());
            } else {
                yj0.a.c(wakeLock2, "com/tencent/mm/plugin/flutter/voip/ui/FlutterVoipUI", "turnOffScreen", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                wakeLock2.acquire();
                yj0.a.f(wakeLock2, "com/tencent/mm/plugin/flutter/voip/ui/FlutterVoipUI", "turnOffScreen", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipUI", "after acquire screen off wakelock from object: %s, isHeld: %s", toString(), java.lang.Boolean.valueOf(wakeLock2.isHeld()));
                this.f307260d.getClass();
                c13.b0 b0Var = c13.b0.f119393d;
                ((ku5.t0) ku5.t0.f394148d).B(new c13.o(false));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void u() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void v1() {
        c13.b0.f119393d.h(z03.g.f550768h, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void y(int i17) {
        ((ku5.t0) ku5.t0.f394148d).B(new d13.d(this, i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void z(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void z1(int i17, int i18) {
        c13.b0.f119393d.i(i17, i18);
    }
}
