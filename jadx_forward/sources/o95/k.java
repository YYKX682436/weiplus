package o95;

@j95.b
/* loaded from: classes13.dex */
public final class k extends i95.w implements ve0.e {

    /* renamed from: e, reason: collision with root package name */
    public static final android.telephony.TelephonyManager f425277e;

    /* renamed from: f, reason: collision with root package name */
    public static final android.media.AudioManager f425278f;

    /* renamed from: h, reason: collision with root package name */
    public static final int f425280h;

    /* renamed from: i, reason: collision with root package name */
    public static int f425281i;

    /* renamed from: n, reason: collision with root package name */
    public static int f425283n;

    /* renamed from: o, reason: collision with root package name */
    public static int f425284o;

    /* renamed from: p, reason: collision with root package name */
    public static ve0.f f425285p;

    /* renamed from: d, reason: collision with root package name */
    public static final o95.k f425276d = new o95.k();

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f425279g = new int[2];

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f425282m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("getSignalStrength");

    /* renamed from: q, reason: collision with root package name */
    public static final jz5.g f425286q = jz5.h.b(o95.h.f425274d);

    /* renamed from: r, reason: collision with root package name */
    public static final jz5.g f425287r = jz5.h.b(o95.i.f425275d);

    static {
        int i17 = 2;
        android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.telephony.feature.TelephonyFeatureService$NetChangedBroadcastReceiver
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(intent.getAction(), io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be)) {
                    o95.k.f425276d.getClass();
                    ve0.f fVar = o95.k.f425285p;
                    if (fVar != null) {
                        fVar.b(intent);
                    }
                }
            }
        };
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(broadcastReceiver, intentFilter);
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("phone");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        f425277e = (android.telephony.TelephonyManager) systemService;
        java.lang.Object systemService2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
        f425278f = (android.media.AudioManager) systemService2;
        java.lang.Object systemService3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService3, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) systemService3).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TelephonyFeatureService", "getNetType: %s %s", java.lang.Integer.valueOf(activeNetworkInfo.getType()), java.lang.Integer.valueOf(activeNetworkInfo.getSubtype()));
                int i18 = 4;
                if (activeNetworkInfo.getType() != 1) {
                    if (activeNetworkInfo.getType() == 9) {
                        i17 = 7;
                    } else if (activeNetworkInfo.getType() == 0) {
                        int subtype = activeNetworkInfo.getSubtype();
                        switch (subtype) {
                            case 0:
                                i18 = 2;
                                break;
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                            case 16:
                                i18 = 1;
                                break;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i18 = 3;
                                break;
                            case 13:
                            case 18:
                            case 19:
                                i18 = 5;
                                break;
                            case 20:
                                i18 = 6;
                                break;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TelephonyFeatureService", "steve: subType:%s, getMobileType(2G/3G/4G/...): %s ", java.lang.Integer.valueOf(subtype), java.lang.Integer.valueOf(i18));
                    }
                }
                i17 = i18;
            } catch (java.lang.NullPointerException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TelephonyFeatureService", e17, "", new java.lang.Object[0]);
            }
        }
        f425280h = i17;
        pm0.v.X(o95.e.f425273d);
    }

    public boolean Ai() {
        int i17;
        if (fp.h.a(31)) {
            android.telephony.TelephonyManager telephonyManager = f425277e;
            if (telephonyManager != null) {
                i17 = telephonyManager.getCallState();
            }
            i17 = 0;
        } else {
            android.media.AudioManager audioManager = f425278f;
            if (audioManager != null && audioManager.getMode() == 1) {
                i17 = 1;
            } else {
                if (audioManager != null && audioManager.getMode() == 2) {
                    i17 = 2;
                }
                i17 = 0;
            }
        }
        return i17 != 0;
    }

    public final void wi(int i17) {
        int[] iArr = f425279g;
        if (i17 != 4) {
            if (i17 != 5) {
                return;
            }
            f425283n += iArr[0];
            f425284o++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TelephonyFeatureService", "mSignalStrength 4G" + iArr[0] + " and index is " + f425284o);
            return;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            try {
                iArr[1] = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.h();
            } catch (java.lang.Exception unused) {
                iArr[1] = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TelephonyFeatureService", "error happened in get wifi info");
            }
            f425283n += iArr[1];
            f425284o++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TelephonyFeatureService", "mSignalStrength WIFI " + iArr[1] + " and index is " + f425284o);
        }
    }
}
