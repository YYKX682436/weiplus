package pg0;

@j95.b(m140513x1e06fd29 = {pg0.j2.class})
/* loaded from: classes12.dex */
public final class l3 extends i95.w implements qg0.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f435554d = "MicroMsg.WalletSecurityUtilService";

    /* renamed from: e, reason: collision with root package name */
    public final int f435555e = 255;

    public boolean Ai() {
        android.net.Network[] allNetworks;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object systemService = context != null ? context.getSystemService("connectivity") : null;
        android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
        android.net.ConnectivityManager connectivityManager2 = connectivityManager != null ? connectivityManager : null;
        if (connectivityManager2 == null || (allNetworks = connectivityManager2.getAllNetworks()) == null) {
            return false;
        }
        java.util.Iterator a17 = p3321xbce91901.jvm.p3324x21ffc6bd.c.a(allNetworks);
        while (true) {
            p3321xbce91901.jvm.p3324x21ffc6bd.b bVar = (p3321xbce91901.jvm.p3324x21ffc6bd.b) a17;
            if (!bVar.hasNext()) {
                return false;
            }
            android.net.NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities((android.net.Network) bVar.next());
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                return true;
            }
        }
    }

    public boolean Bi() {
        lg0.n nVar = (lg0.n) i95.n0.c(lg0.n.class);
        return nVar != null && ((kg0.r) nVar).wi();
    }

    public float Di() {
        java.lang.String str = v75.m.f515503a;
        java.lang.Class cls = (java.lang.Class) ((jz5.n) v75.m.f515504b).mo141623x754a37bb();
        if (cls == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Honor.TouchDetect", "This device does not support get TouchDetect result");
            return -1.0f;
        }
        try {
            java.lang.reflect.Method method = cls.getMethod("getDetectResult", new java.lang.Class[0]);
            if (method != null) {
                java.lang.Object invoke = method.invoke(((jz5.n) v75.m.f515505c).mo141623x754a37bb(), new java.lang.Object[0]);
                if (invoke != null) {
                    java.lang.Class<?> cls2 = invoke.getClass();
                    java.lang.reflect.Method method2 = cls2.getMethod("getErrorCode", new java.lang.Class[0]);
                    java.lang.Object invoke2 = method2 != null ? method2.invoke(invoke, new java.lang.Object[0]) : null;
                    java.lang.reflect.Method method3 = cls2.getMethod("getResult", new java.lang.Class[0]);
                    java.lang.reflect.Method method4 = cls2.getMethod("getResultInfo", new java.lang.Class[0]);
                    java.lang.Object invoke3 = method3 != null ? method3.invoke(invoke, new java.lang.Object[0]) : null;
                    java.lang.Float f17 = invoke3 instanceof java.lang.Float ? (java.lang.Float) invoke3 : null;
                    float floatValue = f17 != null ? f17.floatValue() : -4.0f;
                    java.lang.Object invoke4 = method4 != null ? method4.invoke(invoke, new java.lang.Object[0]) : null;
                    java.lang.String str2 = invoke4 instanceof java.lang.String ? (java.lang.String) invoke4 : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    v75.m.f515503a = str2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Honor.TouchDetect", "getTouchResult " + invoke2 + "  " + floatValue + "  " + v75.m.f515503a);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(invoke2, -1)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Honor.TouchDetect", "get touch detect result failed");
                        return -2.0f;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(invoke2, -2)) {
                        return -3.0f;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(invoke2, java.lang.Float.valueOf(-6.0f))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Honor.TouchDetect", "no touch data, please touch screen first");
                    } else if (floatValue < 0.0f) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Honor.TouchDetect", "exception occurred, please try getTouchResult again");
                    }
                    return floatValue;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Honor.TouchDetect", "startTouchResult is null");
            }
            return -5.0f;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Honor.TouchDetect", th6, "old version of touch detect api ", new java.lang.Object[0]);
            return -4.0f;
        }
    }

    public float Ni() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context == null) {
            return 0.0f;
        }
        try {
            int i17 = android.provider.Settings.System.getInt(context.getContentResolver(), "screen_brightness");
            if (i17 < 0) {
                i17 = 0;
            }
            int i18 = this.f435555e;
            if (i17 > i18) {
                i17 = i18;
            }
            return i17 / 255.0f;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f435554d, "Failed to get system screen brightness %s", e17.getLocalizedMessage());
            return 0.0f;
        }
    }

    public void Ri() {
        java.lang.String str = v75.m.f515503a;
        java.lang.Class cls = (java.lang.Class) ((jz5.n) v75.m.f515504b).mo141623x754a37bb();
        if (cls == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Honor.TouchDetect", "This device does not support start TouchDetect");
            return;
        }
        try {
            java.lang.reflect.Method method = cls.getMethod("startDetect", new java.lang.Class[0]);
            if (method == null) {
                return;
            }
            java.lang.Object invoke = method.invoke(((jz5.n) v75.m.f515505c).mo141623x754a37bb(), new java.lang.Object[0]);
            java.lang.Integer num = invoke instanceof java.lang.Integer ? (java.lang.Integer) invoke : null;
            if (num != null && num.intValue() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Honor.TouchDetect", "start touch detect success");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Honor.TouchDetect", "start touch detect failed");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Honor.TouchDetect", th6, "old version of touch detect api ", new java.lang.Object[0]);
        }
    }

    public void Ui() {
        java.lang.String str = v75.m.f515503a;
        java.lang.Class cls = (java.lang.Class) ((jz5.n) v75.m.f515504b).mo141623x754a37bb();
        if (cls == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Honor.TouchDetect", "This device does not support stop TouchDetect");
            return;
        }
        try {
            java.lang.reflect.Method method = cls.getMethod("stopDetect", new java.lang.Class[0]);
            if (method == null) {
                return;
            }
            method.invoke(cls.newInstance(), new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Honor.TouchDetect", th6, "stopTouchDetect", new java.lang.Object[0]);
        }
    }

    public boolean wi() {
        p3321xbce91901.jvm.p3324x21ffc6bd.b bVar;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object systemService = context != null ? context.getSystemService("display") : null;
        android.hardware.display.DisplayManager displayManager = systemService instanceof android.hardware.display.DisplayManager ? (android.hardware.display.DisplayManager) systemService : null;
        android.view.Display[] displays = displayManager != null ? displayManager.getDisplays() : null;
        if (displays == null) {
            return false;
        }
        java.util.Iterator a17 = p3321xbce91901.jvm.p3324x21ffc6bd.c.a(displays);
        do {
            bVar = (p3321xbce91901.jvm.p3324x21ffc6bd.b) a17;
            if (!bVar.hasNext()) {
                return false;
            }
        } while ((((android.view.Display) bVar.next()).getFlags() & 8) == 0);
        return true;
    }
}
