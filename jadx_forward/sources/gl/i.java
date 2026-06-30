package gl;

@j95.b
/* loaded from: classes14.dex */
public final class i extends i95.w implements cv.w0, gl.q {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.HashSet f354285p = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f354287e;

    /* renamed from: f, reason: collision with root package name */
    public cv.v0 f354288f;

    /* renamed from: g, reason: collision with root package name */
    public final gl.a f354289g;

    /* renamed from: i, reason: collision with root package name */
    public cv.u0 f354291i;

    /* renamed from: m, reason: collision with root package name */
    public int f354292m;

    /* renamed from: o, reason: collision with root package name */
    public android.bluetooth.BluetoothHeadset f354294o;

    /* renamed from: h, reason: collision with root package name */
    public final gl.k f354290h = new gl.k();

    /* renamed from: n, reason: collision with root package name */
    public int f354293n = 3;

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f354286d = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));

    public i() {
        gl.a yVar = fp.h.c(31) ? new gl.y() : new gl.l();
        this.f354289g = yVar;
        yVar.j(this);
        Ni(1);
    }

    public final java.lang.Object Ai(int i17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 4) {
            if (Ri()) {
                this.f354292m = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRouteManager", "onAudioRouteSucc deviceClass: 4 deviceName: " + str);
                this.f354292m = 0;
                gl.a aVar = this.f354289g;
                if (aVar != null) {
                    aVar.g(4, str);
                }
            } else {
                java.lang.Object cj6 = cj(4, str, interfaceC29045xdcb5ca57);
                if (cj6 == pz5.a.f440719d) {
                    return cj6;
                }
            }
        }
        return f0Var;
    }

    public cv.v0 Bi() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRouteManager", "checkCurrentOutputInfo cur " + this.f354288f + " and " + Vi());
        cv.v0 v0Var = this.f354288f;
        if (v0Var == null) {
            return Ui() ? new cv.v0(4, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6m), 0, 4, null) : aj() ? new cv.v0(3, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6o), 0, 4, null) : Vi() ? new cv.v0(1, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6p), 0, 4, null) : new cv.v0(2, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6n), 0, 4, null);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v0Var);
        return v0Var;
    }

    public boolean Di(java.util.List devices) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(devices, "devices");
        java.util.Iterator it = devices.iterator();
        while (it.hasNext()) {
            int i17 = ((cv.v0) it.next()).f304049a;
            if (i17 != 2 && i17 != 1) {
                return true;
            }
        }
        return false;
    }

    public android.bluetooth.BluetoothHeadset Ni(int i17) {
        if (this.f354294o == null) {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("bluetooth");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
            android.bluetooth.BluetoothAdapter adapter = ((android.bluetooth.BluetoothManager) systemService).getAdapter();
            if (adapter != null) {
                try {
                    adapter.getProfileProxy(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new gl.e(this, adapter), 1);
                } catch (java.lang.SecurityException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioRouteManager", "getProfileProxy error: " + e17.getMessage());
                }
            }
        }
        return this.f354294o;
    }

    public boolean Ri() {
        gl.a aVar = this.f354289g;
        if (aVar != null) {
            return aVar.i();
        }
        return false;
    }

    public boolean Ui() {
        gl.a aVar = this.f354289g;
        if (aVar != null ? aVar.k() : false) {
            return !(this.f354292m >= 2);
        }
        return false;
    }

    public boolean Vi() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return mm1.g.b((android.media.AudioManager) systemService);
    }

    public boolean Zi() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return ((android.media.AudioManager) systemService).getRingerMode() != 2;
    }

    public boolean aj() {
        gl.a aVar = this.f354289g;
        if (aVar != null) {
            return aVar.a();
        }
        return false;
    }

    public final void bj(cv.v0 v0Var, boolean z17) {
        this.f354288f = v0Var;
        cv.u0 u0Var = this.f354291i;
        if (u0Var != null) {
            this.f354290h.b(u0Var.f304047b, v0Var, !(this.f354289g instanceof gl.l) ? 1 : 0, z17);
            m3.a aVar = u0Var.f304046a;
            if (aVar != null) {
                cv.v0 v0Var2 = new cv.v0(v0Var.f304049a, v0Var.f304050b, 1);
                java.lang.String str = v0Var.f304052d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                v0Var2.f304052d = str;
                aVar.mo3938xab27b508(v0Var2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f2 A[LOOP:0: B:19:0x00ec->B:21:0x00f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cj(int r13, java.lang.String r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.i.cj(int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void fj(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        boolean z17 = false;
        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_bluetooth_limited_in_background, false) && this.f354291i == null) ? false : true) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED") && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) == 12) {
                z17 = true;
            }
            if ((z17 ? intent : null) != null) {
                android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
                android.bluetooth.BluetoothHeadset bluetoothHeadset = this.f354294o;
                if (defaultAdapter != null && bluetoothHeadset != null) {
                    defaultAdapter.closeProfileProxy(1, bluetoothHeadset);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRouteManager", "bt closeProfileProxy " + bluetoothHeadset);
                }
                this.f354294o = null;
                Ni(1);
            }
            gl.a aVar = this.f354289g;
            if (aVar != null) {
                aVar.e(intent);
            }
        }
    }

    public void hj(int i17, java.lang.String str) {
        cv.u0 u0Var = this.f354291i;
        if (u0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRouteManager", "onAudioDeviceActive deviceClass: " + i17 + " deviceName: " + str);
            this.f354290h.b(u0Var.f304047b, new cv.v0(i17, str, 4), !(this.f354289g instanceof gl.l) ? 1 : 0, false);
            m3.a aVar = u0Var.f304046a;
            if (aVar != null) {
                aVar.mo3938xab27b508(new cv.v0(i17, str, 4));
            }
        }
    }

    public void ij(int i17, java.lang.String str, java.lang.String str2) {
        if (i17 == 4) {
            this.f354292m = 0;
        }
        cv.v0 v0Var = new cv.v0(i17, str, 0, 4, null);
        if (str2 == null) {
            str2 = "";
        }
        v0Var.f304052d = str2;
        v0Var.f304051c = 1;
        bj(v0Var, false);
    }

    public void mj(int i17, java.lang.String str) {
        cv.u0 u0Var = this.f354291i;
        if (u0Var != null) {
            if (i17 == 4) {
                this.f354292m = 0;
            }
            m3.a aVar = u0Var.f304046a;
            if (aVar != null) {
                aVar.mo3938xab27b508(new cv.v0(i17, str, 3));
            }
        }
    }

    public void nj(int i17, java.lang.String str) {
        m3.a aVar;
        cv.u0 u0Var = this.f354291i;
        if (u0Var != null && (aVar = u0Var.f304046a) != null) {
            aVar.mo3938xab27b508(new cv.v0(i17, str, 2));
        }
        cv.v0 v0Var = this.f354288f;
        if (v0Var != null && i17 == v0Var.f304049a) {
            this.f354288f = null;
            if (i17 == 4) {
                this.f354292m = 0;
            }
        }
    }

    public void oj(cv.u0 consumer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consumer, "consumer");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRouteManager", "remove listener " + consumer);
        this.f354291i = null;
    }

    public final void pj() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("notification");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        boolean isNotificationPolicyAccessGranted = ((android.app.NotificationManager) systemService).isNotificationPolicyAccessGranted();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRouteManager", "requestPermission() result:%s", java.lang.Boolean.valueOf(isNotificationPolicyAccessGranted));
        if (isNotificationPolicyAccessGranted) {
            return;
        }
        try {
            android.content.Intent intent = new android.content.Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/audio/manager/AudioRouteManager", "requestPermission", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/audio/manager/AudioRouteManager", "requestPermission", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioRouteManager", "requestPermission() Exception:%s", e17.getMessage());
        }
    }

    public boolean qj(int i17, boolean z17) {
        oz5.l lVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.AudioRouteManager", "route to Device " + i17, new java.lang.Object[0]);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f354286d;
        if (y0Var != null && (lVar = ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) y0Var).f392029d) != null) {
            p3325xe03a0797.p3326xc267989b.v2.e(lVar, null, 1, null);
        }
        this.f354287e = y0Var != null ? p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new gl.h(i17, this, z17, null), 3, null) : null;
        return true;
    }

    /* renamed from: release */
    public void m131720x41012807() {
        oz5.l f93115e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRouteManager", "release audio route manager ");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f354287e;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f354286d;
        if (y0Var != null && (f93115e = y0Var.getF93115e()) != null) {
            p3325xe03a0797.p3326xc267989b.v2.e(f93115e, null, 1, null);
        }
        gl.a aVar = this.f354289g;
        if (aVar != null) {
            aVar.mo131724x41012807();
        }
        this.f354292m = 0;
        this.f354293n = 3;
        cv.u0 u0Var = this.f354291i;
        if (u0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioRouteManager", "registeredListeners not null,must be leak ");
            this.f354290h.a(u0Var.f304047b, 1, -1);
            this.f354291i = null;
        }
        this.f354288f = null;
    }

    public java.util.List rj() {
        cv.v0 v0Var;
        cv.v0 v0Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean Ui = Ui();
        gl.a aVar = this.f354289g;
        if (Ui) {
            if (aVar == null || (v0Var2 = aVar.f354265b) == null) {
                v0Var2 = new cv.v0(4, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6m), 0, 4, null);
            }
            arrayList.add(v0Var2);
        }
        boolean z17 = true;
        if (aVar != null && aVar.a()) {
            if (aVar == null || (v0Var = aVar.f354264a) == null) {
                v0Var = new cv.v0(3, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6o), 0, 4, null);
            }
            arrayList.add(v0Var);
        }
        gl.b bVar = new gl.b();
        bVar.a();
        if (!bVar.f354266a && !bVar.f354267b) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRouteManager", "push earPiece Menu Item to AvailableDevicesList");
            arrayList.add(new cv.v0(2, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6n), 0, 4, null));
        }
        arrayList.add(new cv.v0(1, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6p), 0, 4, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRouteManager", "current available devices " + arrayList.size());
        return arrayList;
    }

    public void sj() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        try {
            ((android.media.AudioManager) systemService).adjustVolume(-1, 5);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioRouteManager", "adjustStreamVolume() Exception: %s", e17.getMessage());
            pj();
        }
    }

    public void tj() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        try {
            ((android.media.AudioManager) systemService).adjustVolume(1, 5);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AudioRouteManager", "adjustStreamVolume() Exception: %s", e17.getMessage());
            pj();
        }
    }

    public void wi(cv.u0 consumer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consumer, "consumer");
        int i17 = gl.c.f354269b;
        gl.c.f354268a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_android_bluetooth_sco_retry_timeout, 2500L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRouteManager", "add listener " + consumer);
        this.f354291i = consumer;
    }
}
