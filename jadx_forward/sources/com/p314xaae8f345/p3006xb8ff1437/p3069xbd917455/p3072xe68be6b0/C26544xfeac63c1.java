package com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0;

/* renamed from: com.tencent.thumbplayer.tplayer.reportv2.TPReportUtils */
/* loaded from: classes16.dex */
public class C26544xfeac63c1 implements com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.OnNetStatusChangeListener {

    /* renamed from: DEVICE_TYPE */
    private static final int f55060x26203383 = 0;

    /* renamed from: INIT_SEQ */
    private static final int f55061x3eb9c490 = 0;

    /* renamed from: OS_VERSION */
    private static final java.lang.String f55062x412a355d = java.lang.String.format("android %s", com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101951x6b6e6f9e());

    /* renamed from: PLATFORM_TYPE */
    private static final int f55063xdb933786 = 0;

    /* renamed from: REPORT_DRM_TYPE */
    private static final java.util.Map<java.lang.Integer, java.lang.Integer> f55064x82e950a5;

    /* renamed from: REPORT_PLAYER_TYPE */
    private static final java.util.Map<java.lang.Integer, java.lang.Integer> f55065x70f4f4d;

    /* renamed from: REPORT_PROTOCOL_VERSION */
    public static final java.lang.String f55066x876bddbc = "1.0.0";
    private static final java.lang.String TAG = "TPReportUtils";

    /* renamed from: mContext */
    private android.content.Context f55067xd6cfe882;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f55065x70f4f4d = hashMap;
        hashMap.put(0, -1);
        hashMap.put(1, 0);
        hashMap.put(2, 3);
        hashMap.put(3, 3);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        f55064x82e950a5 = hashMap2;
        hashMap2.put(-1, -1);
        hashMap2.put(0, 32);
        hashMap2.put(2, 4);
    }

    public C26544xfeac63c1(android.content.Context context) {
        this.f55067xd6cfe882 = context;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.m104331x9cf0d20b().m104347x9e2a13d3(this);
    }

    /* renamed from: convertTPDRMTypeToReportDrmType */
    public static int m103845x4d9ce280(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TP_DRM_TYPE int i17) {
        java.lang.Integer num = f55064x82e950a5.get(java.lang.Integer.valueOf(i17));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: convertTPPlayerTypeToReportPlayerEnum */
    public static int m103846x2f7fe09b(int i17) {
        java.lang.Integer num = f55065x70f4f4d.get(java.lang.Integer.valueOf(i17));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: getDrmAbility */
    private int m103847xb7f4be81() {
        int i17 = 0;
        for (int i18 : com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26210x55de20b4.m101250xc5ab40bf()) {
            i17 |= m103845x4d9ce280(i18);
        }
        return i17;
    }

    /* renamed from: initDeviceParams */
    public void m103848xa4c20cac(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.C26551xb06837ed c26551xb06837ed) {
        c26551xb06837ed.m103937x764ac60b(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101634xfb7ffeff());
        c26551xb06837ed.m103946xa08187cf(0);
        c26551xb06837ed.m103933x4af50cb2(0);
        c26551xb06837ed.m103941xfc9050c6(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26573x253f979f.m104319xd5ad3e40(this.f55067xd6cfe882));
        c26551xb06837ed.m103932x4af1f803(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7());
        c26551xb06837ed.m103942xc7c23012(f55062x412a355d);
        c26551xb06837ed.m103924x81e8f98a(this.f55067xd6cfe882.getPackageName());
        c26551xb06837ed.m103925x430ecc4(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101632xc725eb98(this.f55067xd6cfe882));
        c26551xb06837ed.m103950x55ef77d5("1.0.0");
        c26551xb06837ed.m103949xec2beec0(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.f51522x3fc0a8b8);
        c26551xb06837ed.m103945xe65006f5(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101638xeb97a5e9());
        c26551xb06837ed.m103952xca02949d(0);
        c26551xb06837ed.m103934xe6190c8d(m103847xb7f4be81());
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.OnNetStatusChangeListener
    /* renamed from: onStatusChanged */
    public void mo103065xed0a9ac3(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26573x253f979f.m104326xde9f63df(this.f55067xd6cfe882);
    }

    /* renamed from: updateCommonParams */
    public void m103849xc6fc5aba(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.C26551xb06837ed c26551xb06837ed) {
        c26551xb06837ed.m103941xfc9050c6(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26573x253f979f.m104319xd5ad3e40(this.f55067xd6cfe882));
    }
}
