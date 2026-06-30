package wo;

/* loaded from: classes14.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile long f529270a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f529271b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f529272c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f529273d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f529274e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static wo.b1 f529275f;

    public static void a() {
        java.util.Map map = f529271b;
        int size = ((java.util.concurrent.ConcurrentHashMap) map).size();
        java.util.Map map2 = f529272c;
        int size2 = size + ((java.util.concurrent.ConcurrentHashMap) map2).size();
        java.util.Map map3 = f529273d;
        int size3 = size2 + ((java.util.concurrent.ConcurrentHashMap) map3).size();
        java.util.Map map4 = f529274e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecProxyUtils", "codecCountCheck allsize:[%d], audioEncodeMap:[%d], audioDecodeMap:[%d], videoEncodeMap:[%d], videoDecodeMap:[%d]", java.lang.Integer.valueOf(size3 + ((java.util.concurrent.ConcurrentHashMap) map4).size()), java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) map).size()), java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) map2).size()), java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) map3).size()), java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) map4).size()));
        b(map2, 12);
        b(map, 13);
        b(map4, 14);
        b(map3, 15);
    }

    public static void b(java.util.Map map, int i17) {
        if (map.size() >= 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecProxyUtils", "codecLeakCheckImpl type:[%d], map.size:[%d], process:[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(map.size()), bm5.f1.a());
            if (f529270a + 30000 >= java.lang.System.currentTimeMillis() && f529270a != 0) {
                java.lang.System.currentTimeMillis();
                return;
            }
            f529270a = java.lang.System.currentTimeMillis();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.util.Set keySet = map.keySet();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Iterator it = keySet.iterator();
            while (it.hasNext()) {
                wo.j1 j1Var = (wo.j1) map.get((java.lang.Integer) it.next());
                if (j1Var != null) {
                    java.lang.String str = j1Var.f529266f;
                    java.lang.String replace = str != null ? str.replace(",", ";") : "";
                    sb6.append(j1Var.f529262b);
                    sb6.append(";");
                    sb6.append(j1Var.f529264d);
                    sb6.append(";");
                    sb6.append(j1Var.f529265e);
                    sb6.append(";");
                    sb6.append(bm5.f1.a());
                    sb6.append(";");
                    sb6.append(replace);
                    sb6.append(";");
                    sb6.append(j1Var.f529263c);
                    sb6.append("|");
                    long j17 = currentTimeMillis - j1Var.f529261a;
                    if (j17 > 600000) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecProxyUtils", "codecCountCheckImpl diffTime:[%s] ", java.lang.Long.valueOf(j17));
                        sb7.append(j17);
                        sb7.append(";");
                        sb7.append(j1Var.f529262b);
                        sb7.append(";");
                        sb7.append(j1Var.f529264d);
                        sb7.append(";");
                        sb7.append(j1Var.f529265e);
                        sb7.append(";");
                        sb7.append(bm5.f1.a());
                        sb7.append(";");
                        sb7.append(replace);
                        sb7.append(";");
                        sb7.append(j1Var.f529263c);
                        sb7.append("|");
                    }
                }
            }
            if (i17 == 12) {
                wo.k1.a(12);
                if (!android.text.TextUtils.isEmpty(sb7.toString())) {
                    wo.k1.a(192);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                        wo.k1.c(192, sb6.toString());
                    }
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    wo.k1.a(180);
                    wo.k1.c(180, sb6.toString());
                    return;
                } else if (bm5.f1.a().contains(":appbrand")) {
                    wo.k1.a(184);
                    return;
                } else {
                    wo.k1.a(188);
                    return;
                }
            }
            if (i17 == 13) {
                wo.k1.a(13);
                if (!android.text.TextUtils.isEmpty(sb7.toString())) {
                    wo.k1.a(193);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                        wo.k1.c(193, sb6.toString());
                    }
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    wo.k1.a(181);
                    wo.k1.c(181, sb6.toString());
                    return;
                } else if (bm5.f1.a().contains(":appbrand")) {
                    wo.k1.a(185);
                    return;
                } else {
                    wo.k1.a(189);
                    return;
                }
            }
            if (i17 == 14) {
                wo.k1.a(14);
                if (!android.text.TextUtils.isEmpty(sb7.toString())) {
                    wo.k1.a(194);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                        wo.k1.c(194, sb6.toString());
                    }
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    wo.k1.a(182);
                    wo.k1.c(182, sb6.toString());
                    return;
                } else if (bm5.f1.a().contains(":appbrand")) {
                    wo.k1.a(186);
                    return;
                } else {
                    wo.k1.a(190);
                    return;
                }
            }
            if (i17 == 15) {
                wo.k1.a(15);
                if (!android.text.TextUtils.isEmpty(sb7.toString())) {
                    wo.k1.a(195);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                        wo.k1.c(195, sb6.toString());
                    }
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    wo.k1.a(183);
                    wo.k1.c(183, sb6.toString());
                } else if (bm5.f1.a().contains(":appbrand")) {
                    wo.k1.a(187);
                } else {
                    wo.k1.a(191);
                }
            }
        }
    }

    public static void c(boolean z17, java.lang.String str, wo.j1 j1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecProxyUtils", "isEncode:[%b], mimeType:[%s]", java.lang.Boolean.valueOf(z17), str);
        if (str.contains("video/")) {
            if (z17) {
                wo.k1.a(6);
                wo.k1.b(6, j1Var);
                return;
            } else {
                wo.k1.a(5);
                wo.k1.b(5, j1Var);
                return;
            }
        }
        if (str.contains("audio/")) {
            if (z17) {
                wo.k1.a(4);
                wo.k1.b(4, j1Var);
            } else {
                wo.k1.a(3);
                wo.k1.b(3, j1Var);
            }
        }
    }

    public static wo.j1 d(int i17, java.lang.String str) {
        int codecCount = android.media.MediaCodecList.getCodecCount();
        for (int i18 = 0; i18 < codecCount; i18++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i18);
            if (android.text.TextUtils.equals(codecInfoAt.getName(), str)) {
                java.lang.String[] supportedTypes = codecInfoAt.getSupportedTypes();
                if (supportedTypes.length > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecProxyUtils", "insertMapWithCodecName success, codecName:[%s], mime:[%s]", str, supportedTypes[0]);
                    return e(i17, codecInfoAt.isEncoder(), supportedTypes[0]);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCodecProxyUtils", "insertMapWithCodecName fail, codecName:[%s]", str);
        wo.j1 j1Var = new wo.j1();
        j1Var.f529265e = str;
        wo.k1.a(21);
        wo.k1.b(21, j1Var);
        return new wo.j1();
    }

    public static wo.j1 e(int i17, boolean z17, java.lang.String str) {
        wo.j1 j1Var = new wo.j1();
        j1Var.f529264d = str;
        j1Var.f529262b = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecProxyUtils", "insertMapWithMimeType, isEncode:[%b],mimeType:[%s]", java.lang.Boolean.valueOf(z17), str);
        if (str.contains("video/")) {
            if (z17) {
                ((java.util.concurrent.ConcurrentHashMap) f529273d).put(java.lang.Integer.valueOf(i17), j1Var);
            } else {
                ((java.util.concurrent.ConcurrentHashMap) f529274e).put(java.lang.Integer.valueOf(i17), j1Var);
            }
        } else if (!str.contains("audio/")) {
            wo.k1.a(20);
            wo.k1.b(20, j1Var);
        } else if (z17) {
            ((java.util.concurrent.ConcurrentHashMap) f529271b).put(java.lang.Integer.valueOf(i17), j1Var);
        } else {
            ((java.util.concurrent.ConcurrentHashMap) f529272c).put(java.lang.Integer.valueOf(i17), j1Var);
        }
        return j1Var;
    }

    public static boolean f(java.lang.String str, wo.j1 j1Var) {
        int codecCount = android.media.MediaCodecList.getCodecCount();
        for (int i17 = 0; i17 < codecCount; i17++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i17);
            for (java.lang.String str2 : codecInfoAt.getSupportedTypes()) {
                if (android.text.TextUtils.equals(str2, str)) {
                    j1Var.f529265e = codecInfoAt.getName();
                    return true;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCodecProxyUtils", "mimeTypeSupportCheck error, type unsupport:[%s]", str);
        wo.k1.a(23);
        wo.k1.b(23, j1Var);
        return false;
    }

    public static boolean g(int i17) {
        if (((java.util.concurrent.ConcurrentHashMap) f529271b).remove(java.lang.Integer.valueOf(i17)) != null) {
            return true;
        }
        if (((java.util.concurrent.ConcurrentHashMap) f529272c).remove(java.lang.Integer.valueOf(i17)) != null) {
            return true;
        }
        if (((java.util.concurrent.ConcurrentHashMap) f529273d).remove(java.lang.Integer.valueOf(i17)) != null) {
            return true;
        }
        if (((java.util.concurrent.ConcurrentHashMap) f529274e).remove(java.lang.Integer.valueOf(i17)) != null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCodecProxyUtils", "removeMap fail");
        wo.k1.a(22);
        wo.k1.b(22, new wo.j1());
        return false;
    }
}
