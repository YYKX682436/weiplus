package ip1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final ip1.r f375141a;

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f375142b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f375143c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f375144d;

    static {
        ip1.r rVar = new ip1.r();
        f375141a = rVar;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            boolean a17 = gm0.j1.a();
            if (a17 && f375142b == null) {
                f375142b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(c01.z1.r() + "_audio_panel_mmkv");
            }
            rVar.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarLogicHelper", "initMMKV %s, mmkv: %s, cost: %s", java.lang.Boolean.valueOf(a17), f375142b, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AudioPanelTaskBarLogicHelper", e17, "checkInitMMKV exception", new java.lang.Object[0]);
        }
    }

    public final void a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f375142b;
        f375143c = o4Var != null ? o4Var.getBoolean("key_clear_data_flag", false) : false;
        b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarLogicHelper", "initDataFromLocal clearDataFlag: " + f375143c + ", showAudioTaskBar: " + f375144d);
    }

    public final void b() {
        if (ip1.e.f375117a.a() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).aj(), java.lang.Boolean.FALSE)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarConfig", "canShowAudioPanel enableRecommend but user close, then not show");
        } else {
            int intValue = ((java.lang.Number) ((jz5.n) ip1.e.f375118b).mo141623x754a37bb()).intValue();
            r2 = intValue == 0 || intValue == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarConfig", "canShowAudioPanel config: " + intValue + ", ret: " + r2);
        }
        f375144d = r2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarLogicHelper", "updateShowAudioTaskBarConfig expt: " + r2);
    }
}
