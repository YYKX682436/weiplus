package nq4;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final nq4.f f420547a = new nq4.f();

    /* renamed from: b, reason: collision with root package name */
    public static int f420548b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f420549c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f420550d;

    /* renamed from: e, reason: collision with root package name */
    public static int f420551e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f420552f;

    static {
        f420549c = android.provider.Settings.Global.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "bluetooth_voip_state", 0) == 1;
        f420550d = true;
        f420551e = Integer.MAX_VALUE;
        nq4.g[] gVarArr = nq4.g.f420553d;
    }

    public final boolean a() {
        f420549c = android.provider.Settings.Global.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "bluetooth_voip_state", 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPShortCutAnswerHelper", "checkCanUseShortcutAnswer headSetSupported: " + f420549c + ", deviceSupported: " + f420550d + ", checkVoIPShortcutAnswer: " + vq4.b0.f() + ", checkVoIPShortcutSupportForManufacture: " + vq4.b0.h());
        return f420549c && f420550d && vq4.b0.f() && vq4.b0.h();
    }

    public final boolean b() {
        f420549c = android.provider.Settings.Global.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "bluetooth_voip_state", 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPShortCutAnswerHelper", "checkCanUseShortcutAnswerILink headSetSupported: " + f420549c + ", deviceSupported: " + f420550d + ", checkVoIPShortcutAnswer: " + vq4.b0.f() + ", checkVoIPShortcutSupportForManufacture: " + vq4.b0.h());
        return f420549c && f420550d && vq4.b0.f() && vq4.b0.h();
    }

    public final void c() {
        if (!vq4.b0.g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in voip called this device not support");
            return;
        }
        android.bluetooth.BluetoothHeadset Ni = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ni(1);
        if (f420551e < 0 && Ni == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in voip called accept and set\u3000bl call state active cause not allow");
            return;
        }
        if (Ni != null) {
            try {
                java.lang.reflect.Method declaredMethod = Ni.getClass().getDeclaredMethod("voipCallStateChange", java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class);
                if (declaredMethod != null) {
                    declaredMethod.invoke(Ni, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName(), "");
                }
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in voip called accept and set\u3000bl call state active");
                return;
            }
        }
        f420551e = 0;
        nq4.g[] gVarArr = nq4.g.f420553d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPShortCutAnswerHelper", "voip called accept come and set\u3000bl call state active");
    }

    public final void d() {
        if (!vq4.b0.g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in voip called this device not support");
            return;
        }
        android.bluetooth.BluetoothHeadset Ni = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ni(1);
        if (Ni == null) {
            return;
        }
        try {
            Ni.getClass().getDeclaredMethod("voipCallStateChange", java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class).invoke(Ni, 7, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName(), "");
            f420551e = 7;
            nq4.g[] gVarArr = nq4.g.f420553d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPShortCutAnswerHelper", "happened in voip called cancel and set\u3000bl call state disconnected");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in voip called cancel and set\u3000bl call state disconnected");
        }
        f420552f = false;
    }

    public final boolean e() {
        if (!vq4.b0.g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in voip called this device not support");
            return false;
        }
        android.bluetooth.BluetoothHeadset Ni = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ni(1);
        if (f420551e < 4 && Ni == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in on voip calling come call cause not allow");
            return false;
        }
        if (Ni != null) {
            try {
                java.lang.reflect.Method declaredMethod = Ni.getClass().getDeclaredMethod("voipCallStateChange", java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class);
                if (declaredMethod != null) {
                    declaredMethod.invoke(Ni, 4, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName(), "");
                }
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in on voip calling come call");
                f420550d = false;
                return false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPShortCutAnswerHelper", "voip calling come and set\u3000bl call state incoming");
        f420551e = 4;
        nq4.g[] gVarArr = nq4.g.f420553d;
        f420550d = true;
        return true;
    }

    public final boolean f() {
        if (!vq4.b0.g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in voip called this device not support");
            return false;
        }
        android.bluetooth.BluetoothHeadset Ni = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ni(1);
        if (f420551e < 2 && Ni == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in on voip dialing cause not allow");
            return false;
        }
        if (Ni != null) {
            try {
                java.lang.reflect.Method declaredMethod = Ni.getClass().getDeclaredMethod("voipCallStateChange", java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class);
                if (declaredMethod != null) {
                    declaredMethod.invoke(Ni, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName(), "");
                }
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in on voip dialing come call");
                f420550d = false;
                return false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPShortCutAnswerHelper", "voip dialing come and set\u3000bl call state incoming");
        f420551e = 0;
        nq4.g[] gVarArr = nq4.g.f420553d;
        f420550d = true;
        return true;
    }

    public final void g(boolean z17) {
        if (!vq4.b0.f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in voip called this device not support");
        } else {
            if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ni(1) == null) {
                return;
            }
            if (z17) {
                f();
            } else {
                e();
            }
        }
    }
}
