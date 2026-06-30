package sc3;

/* loaded from: classes7.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final sc3.a f487959d = new sc3.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bf3.g0.f101160a.getClass();
        int i17 = 60;
        try {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window");
            android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
            if (windowManager != null) {
                android.view.Display.Mode[] supportedModes = windowManager.getDefaultDisplay().getSupportedModes();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(supportedModes, "getSupportedModes(...)");
                for (android.view.Display.Mode mode : supportedModes) {
                    int b17 = a06.d.b(mode.getRefreshRate());
                    if (b17 > i17 && b17 <= 144) {
                        i17 = b17;
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MBServerUtil", e17, "getRefreshRate error", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBServerUtil", "findMaxRefreshRate " + i17);
        return java.lang.Integer.valueOf(i17);
    }
}
