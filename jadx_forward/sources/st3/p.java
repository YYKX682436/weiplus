package st3;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final st3.p f494094a = new st3.p();

    /* renamed from: b, reason: collision with root package name */
    public static int f494095b;

    /* renamed from: c, reason: collision with root package name */
    public static int f494096c;

    /* renamed from: d, reason: collision with root package name */
    public static st3.q f494097d;

    /* renamed from: e, reason: collision with root package name */
    public static int f494098e;

    /* renamed from: f, reason: collision with root package name */
    public static int f494099f;

    /* renamed from: g, reason: collision with root package name */
    public static int f494100g;

    /* renamed from: h, reason: collision with root package name */
    public static int f494101h;

    public static void a(st3.p pVar, int i17, int i18, int i19, java.lang.Object obj) {
        st3.q qVar;
        if ((i19 & 1) != 0) {
            i17 = -1;
        }
        pVar.getClass();
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(null);
        f494099f = a17.f278669b;
        f494100g = a17.f278668a;
        f494101h = (int) ((r2 * 16) / 9.0f);
        if (i17 == -1) {
            f494096c = com.p314xaae8f345.mm.ui.bl.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordRatioConfigManager", "updateNavigationBarHeight >> " + f494096c);
        } else {
            f494096c = i17;
        }
        int i27 = f494099f;
        f494098e = (i27 - f494101h) - f494096c;
        f494095b = (((i27 - com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 88)) - f494096c) - com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 116)) - com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 64);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordRatioConfigManager", "calculateImproveRadioConfig >> captureSafetyHeight: " + i18 + " currentBottomHeight: " + i17 + ", longSide: " + f494099f + ", shortSide: " + f494100g + ", cameraViewHeight: " + f494101h + ", xStrategy: " + f494098e + ", navigationBarHeight: " + f494096c + ", resideAreaHeight: " + f494095b + ' ');
        int i28 = f494098e;
        if (i28 >= i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordRatioConfigManager", "ratio strategy is CameraView_TOP");
            qVar = st3.q.f494102d;
        } else if (i28 >= f494096c + com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 88)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordRatioConfigManager", "ratio strategy is CameraView_Bottom");
            qVar = st3.q.f494104f;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordRatioConfigManager", "ratio strategy is CameraView_Center");
            qVar = st3.q.f494103e;
        }
        f494097d = qVar;
    }
}
