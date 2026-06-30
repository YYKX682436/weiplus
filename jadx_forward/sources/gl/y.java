package gl;

/* loaded from: classes14.dex */
public final class y extends gl.a {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f354317i = kz5.c0.i(26, 7);

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.List f354318j = kz5.c0.i(3, 22, 11, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.List f354319k = kz5.b0.c(2);

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.List f354320l = kz5.b0.c(1);

    /* renamed from: c, reason: collision with root package name */
    public gl.q f354321c;

    /* renamed from: d, reason: collision with root package name */
    public android.media.AudioDeviceInfo f354322d;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f354325g;

    /* renamed from: e, reason: collision with root package name */
    public int f354323e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Boolean f354324f = java.lang.Boolean.FALSE;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f354326h = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));

    public y() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        gl.t tVar = new gl.t(this);
        gl.w wVar = new gl.w(this);
        audioManager.registerAudioDeviceCallback(tVar, null);
        audioManager.addOnCommunicationDeviceChangedListener(new gl.s(this), wVar);
        l(new android.media.AudioDeviceInfo[0]);
    }

    @Override // gl.r
    public boolean a() {
        java.lang.Object obj;
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        java.util.List<android.media.AudioDeviceInfo> availableCommunicationDevices = ((android.media.AudioManager) systemService).getAvailableCommunicationDevices();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        java.util.Iterator<T> it = availableCommunicationDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            android.media.AudioDeviceInfo audioDeviceInfo = (android.media.AudioDeviceInfo) obj;
            if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4) {
                break;
            }
        }
        return obj != null;
    }

    @Override // gl.r
    public java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object obj;
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        java.util.List<android.media.AudioDeviceInfo> availableCommunicationDevices = ((android.media.AudioManager) systemService).getAvailableCommunicationDevices();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        java.util.Iterator<T> it = availableCommunicationDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((android.media.AudioDeviceInfo) obj).getType() == 2) {
                break;
            }
        }
        android.media.AudioDeviceInfo audioDeviceInfo = (android.media.AudioDeviceInfo) obj;
        if (audioDeviceInfo != null) {
            if (n(audioDeviceInfo)) {
                this.f354323e = audioDeviceInfo.getType();
                m(f354319k);
                return new cv.v0(1, null, 1, 2, null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LEAudioProfile", "error happened in route to device speaker");
        }
        return null;
    }

    @Override // gl.r
    public java.lang.Object d(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object obj;
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        gl.b bVar = new gl.b();
        bVar.a();
        if (bVar.f354267b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LEAudioProfile", "routeToEarpiece -> Fallback System Default Audio Route");
            audioManager.clearCommunicationDevice();
        } else {
            java.util.List<android.media.AudioDeviceInfo> availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
            java.util.Iterator<T> it = availableCommunicationDevices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                boolean z17 = true;
                if (((android.media.AudioDeviceInfo) obj).getType() != 1) {
                    z17 = false;
                }
                if (z17) {
                    break;
                }
            }
            android.media.AudioDeviceInfo audioDeviceInfo = (android.media.AudioDeviceInfo) obj;
            if (audioDeviceInfo == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LEAudioProfile", "not has earpieceDevice but force route to earpiece");
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LEAudioProfile", "routeToEarpiece -> Route to Earpiece");
            if (!n(audioDeviceInfo)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LEAudioProfile", "error happened in route to device earpiece");
                return null;
            }
            this.f354323e = audioDeviceInfo.getType();
            m(f354320l);
        }
        return new cv.v0(2, null, 1, 2, null);
    }

    @Override // gl.r
    public java.lang.Object f(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object obj;
        java.lang.CharSequence string;
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        java.util.List<android.media.AudioDeviceInfo> availableCommunicationDevices = ((android.media.AudioManager) systemService).getAvailableCommunicationDevices();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        java.util.Iterator<T> it = availableCommunicationDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            android.media.AudioDeviceInfo audioDeviceInfo = (android.media.AudioDeviceInfo) obj;
            if (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 7) {
                break;
            }
        }
        android.media.AudioDeviceInfo audioDeviceInfo2 = (android.media.AudioDeviceInfo) obj;
        if (audioDeviceInfo2 != null) {
            if (n(audioDeviceInfo2)) {
                this.f354323e = audioDeviceInfo2.getType();
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(audioDeviceInfo2.getProductName(), wo.w0.m())) {
                    java.lang.CharSequence productName = audioDeviceInfo2.getProductName();
                    if (!(productName == null || r26.n0.N(productName))) {
                        string = audioDeviceInfo2.getProductName();
                        m(f354317i);
                        string.toString();
                        cv.v0 v0Var = new cv.v0(4, string.toString(), 1);
                        java.lang.String address = audioDeviceInfo2.getAddress();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(address, "getAddress(...)");
                        v0Var.f304052d = address;
                        return v0Var;
                    }
                }
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6m);
                m(f354317i);
                string.toString();
                cv.v0 v0Var2 = new cv.v0(4, string.toString(), 1);
                java.lang.String address2 = audioDeviceInfo2.getAddress();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(address2, "getAddress(...)");
                v0Var2.f304052d = address2;
                return v0Var2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LEAudioProfile", "error happened in route to device ble audio ");
        }
        return null;
    }

    @Override // gl.r
    public java.lang.Object h(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object obj;
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        java.util.List<android.media.AudioDeviceInfo> availableCommunicationDevices = ((android.media.AudioManager) systemService).getAvailableCommunicationDevices();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        java.util.Iterator<T> it = availableCommunicationDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            android.media.AudioDeviceInfo audioDeviceInfo = (android.media.AudioDeviceInfo) obj;
            if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4) {
                break;
            }
        }
        android.media.AudioDeviceInfo audioDeviceInfo2 = (android.media.AudioDeviceInfo) obj;
        if (audioDeviceInfo2 != null) {
            if (n(audioDeviceInfo2)) {
                this.f354323e = audioDeviceInfo2.getType();
                m(f354318j);
                return new cv.v0(3, audioDeviceInfo2.getProductName().toString(), 1);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LEAudioProfile", "error happened in route to device headset");
        }
        return null;
    }

    @Override // gl.r
    public boolean i() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        if (mm1.g.a((android.media.AudioManager) systemService)) {
            return true;
        }
        android.media.AudioDeviceInfo audioDeviceInfo = mm1.d.f410180a;
        android.media.AudioDeviceInfo audioDeviceInfo2 = mm1.d.f410180a;
        return audioDeviceInfo2 != null && audioDeviceInfo2.getType() == 26;
    }

    @Override // gl.r
    public void j(gl.q listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f354321c = listener;
    }

    @Override // gl.r
    public boolean k() {
        java.lang.Object obj;
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        java.util.List<android.media.AudioDeviceInfo> availableCommunicationDevices = ((android.media.AudioManager) systemService).getAvailableCommunicationDevices();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        java.util.Iterator<T> it = availableCommunicationDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            android.media.AudioDeviceInfo audioDeviceInfo = (android.media.AudioDeviceInfo) obj;
            if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 26) {
                break;
            }
        }
        return obj != null;
    }

    public final void l(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = audioDeviceInfoArr.length;
        int i17 = 0;
        while (true) {
            boolean z17 = true;
            if (i17 >= length) {
                break;
            }
            android.media.AudioDeviceInfo audioDeviceInfo = audioDeviceInfoArr[i17];
            if (audioDeviceInfo.getType() != 26 && audioDeviceInfo.getType() != 7) {
                z17 = false;
            }
            if (z17) {
                arrayList.add(audioDeviceInfo);
            }
            i17++;
        }
        java.util.List<android.media.AudioDeviceInfo> availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : availableCommunicationDevices) {
            android.media.AudioDeviceInfo audioDeviceInfo2 = (android.media.AudioDeviceInfo) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LEAudioProfile", "checkAllBluetoothDevice " + ((java.lang.Object) audioDeviceInfo2.getProductName()) + " -" + audioDeviceInfo2.getType());
            if (audioDeviceInfo2.getType() == 26 || audioDeviceInfo2.getType() == 7) {
                arrayList2.add(obj);
            }
        }
        java.lang.Object[] elements = arrayList2.toArray(new android.media.AudioDeviceInfo[0]);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList.size() + elements.length);
        arrayList3.addAll(arrayList);
        kz5.h0.w(arrayList3, elements);
    }

    public final boolean m(java.util.List list) {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioDeviceInfo communicationDevice = ((android.media.AudioManager) systemService).getCommunicationDevice();
        if (communicationDevice == null || !list.contains(java.lang.Integer.valueOf(communicationDevice.getType()))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LEAudioProfile", "route to device:" + list + " slowly ");
            return false;
        }
        this.f354323e = -1;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f354325g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("route to device:");
        android.media.AudioDeviceInfo audioDeviceInfo = this.f354322d;
        sb6.append(audioDeviceInfo != null ? java.lang.Integer.valueOf(audioDeviceInfo.getType()) : null);
        sb6.append(" soon ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LEAudioProfile", sb6.toString());
        this.f354322d = communicationDevice;
        return true;
    }

    public final boolean n(android.media.AudioDeviceInfo audioDeviceInfo) {
        try {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            boolean communicationDevice = ((android.media.AudioManager) systemService).setCommunicationDevice(audioDeviceInfo);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LEAudioProfile", "setCommunicationDevice Result: " + communicationDevice);
            return communicationDevice;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LEAudioProfile", "something error happened in device failed " + e17.getMessage());
            return false;
        }
    }

    @Override // gl.r
    /* renamed from: release */
    public void mo131724x41012807() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f354325g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        ((ku5.t0) ku5.t0.f394148d).g(gl.x.f354316d);
    }
}
