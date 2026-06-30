package io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873;

/* renamed from: io.flutter.plugin.platform.SkylineTextureLogic */
/* loaded from: classes15.dex */
public class C28739xd227fc18 {
    private static final java.lang.String TAG = "SkylineTextureLogic";

    /* renamed from: VIEW_TYPE */
    private static final java.lang.String f71884x4a18ec94 = "skyline_texture";

    /* renamed from: sSkylineTextureHandler */
    private static io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28712x591f54db f71885x6b0ff2f1;

    /* renamed from: skylineTextureIdsArray */
    private static final android.util.SparseArray<java.util.HashMap<java.lang.String, java.lang.String>> f71887x808fb367 = new android.util.SparseArray<>();

    /* renamed from: sSkylineTextureInfoMapArray */
    private static final android.util.SparseArray<java.util.HashMap<java.lang.String, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28738xe5bdd8b4>> f71886xa2cda5e4 = new android.util.SparseArray<>();

    /* renamed from: addSkylineTexture */
    public static void m138821x18402dc7(int i17, int i18, java.lang.String str) {
        android.util.SparseArray<java.util.HashMap<java.lang.String, java.lang.String>> sparseArray = f71887x808fb367;
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = sparseArray.get(i17);
        if (hashMap == null) {
            hashMap = new java.util.HashMap<>();
            sparseArray.put(i17, hashMap);
        }
        hashMap.put("skyline_texture-" + i18, str);
    }

    /* renamed from: destroy */
    public static void m138822x5cd39ffa(int i17) {
        f71887x808fb367.remove(i17);
        java.util.HashMap<java.lang.String, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28738xe5bdd8b4> hashMap = f71886xa2cda5e4.get(i17);
        if (hashMap != null) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28738xe5bdd8b4>> it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28738xe5bdd8b4 value = it.next().getValue();
                java.lang.String str = value.type;
                int i18 = value.id;
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28712x591f54db interfaceC28712x591f54db = f71885x6b0ff2f1;
                if (interfaceC28712x591f54db != null) {
                    interfaceC28712x591f54db.mo131417x1bd2261e(i17, str, i18);
                }
            }
        }
        f71886xa2cda5e4.clear();
    }

    /* renamed from: getSkylineTextureInfo */
    public static io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28738xe5bdd8b4 m138823x8b567e8a(int i17, java.lang.String str, int i18) {
        java.util.HashMap<java.lang.String, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28738xe5bdd8b4> hashMap = f71886xa2cda5e4.get(i17);
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(str + "#" + i18);
    }

    /* renamed from: getSkylineTextureType */
    public static java.lang.String m138824x8b5ba916(int i17, int i18) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = f71887x808fb367.get(i17);
        if (hashMap == null) {
            return null;
        }
        return hashMap.get("skyline_texture-" + i18);
    }

    /* renamed from: initSkylineTextureHandler */
    public static void m138825xe0688274(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28712x591f54db interfaceC28712x591f54db) {
        f71885x6b0ff2f1 = interfaceC28712x591f54db;
    }

    /* renamed from: isSkylineTexture */
    public static boolean m138826x33979e90(int i17, int i18) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = f71887x808fb367.get(i17);
        if (hashMap != null) {
            if (hashMap.containsKey("skyline_texture-" + i18)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isSkylineTextureType */
    public static boolean m138827x4aadd9ea(java.lang.String str) {
        return f71884x4a18ec94.equals(str);
    }

    /* renamed from: onCreateTexture */
    public static android.graphics.SurfaceTexture m138828x6473dce0(int i17, java.lang.String str, int i18) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28712x591f54db interfaceC28712x591f54db = f71885x6b0ff2f1;
        if (interfaceC28712x591f54db != null) {
            return interfaceC28712x591f54db.mo131415x6473dce0(i17, str, i18);
        }
        return null;
    }

    /* renamed from: onDestroyTexture */
    public static boolean m138829xaa156780(int i17, java.lang.String str, int i18) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28712x591f54db interfaceC28712x591f54db = f71885x6b0ff2f1;
        return interfaceC28712x591f54db != null && interfaceC28712x591f54db.mo131416xaa156780(i17, str, i18);
    }

    /* renamed from: onTextureDestroy */
    public static void m138830x1bd2261e(int i17, java.lang.String str, int i18) {
        android.util.SparseArray<java.util.HashMap<java.lang.String, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28738xe5bdd8b4>> sparseArray = f71886xa2cda5e4;
        java.util.HashMap<java.lang.String, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28738xe5bdd8b4> hashMap = sparseArray.get(i17);
        if (hashMap != null) {
            hashMap.remove(str + "#" + i18);
            if (hashMap.isEmpty()) {
                sparseArray.remove(i17);
            }
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28712x591f54db interfaceC28712x591f54db = f71885x6b0ff2f1;
        if (interfaceC28712x591f54db != null) {
            interfaceC28712x591f54db.mo131417x1bd2261e(i17, str, i18);
        }
    }

    /* renamed from: onTextureReady */
    public static void m138831x1ae798c7(int i17, java.lang.String str, int i18, android.graphics.SurfaceTexture surfaceTexture, int i19, int i27) {
        java.util.Objects.toString(surfaceTexture);
        android.util.SparseArray<java.util.HashMap<java.lang.String, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28738xe5bdd8b4>> sparseArray = f71886xa2cda5e4;
        java.util.HashMap<java.lang.String, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28738xe5bdd8b4> hashMap = sparseArray.get(i17);
        if (hashMap == null) {
            hashMap = new java.util.HashMap<>();
            sparseArray.put(i17, hashMap);
        }
        hashMap.put(str + "#" + i18, new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28738xe5bdd8b4(i18, str, i19, i27));
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28712x591f54db interfaceC28712x591f54db = f71885x6b0ff2f1;
        if (interfaceC28712x591f54db != null) {
            interfaceC28712x591f54db.mo131418x1ae798c7(i17, str, i18, surfaceTexture, i19, i27);
        }
    }

    /* renamed from: onTextureTouch */
    public static void m138832x1b089e63(int i17, java.lang.String str, int i18, android.view.MotionEvent motionEvent) {
        java.util.Objects.toString(motionEvent);
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28712x591f54db interfaceC28712x591f54db = f71885x6b0ff2f1;
        if (interfaceC28712x591f54db != null) {
            interfaceC28712x591f54db.mo131419x1b089e63(i17, str, i18, motionEvent);
        }
    }

    /* renamed from: onTextureUpdate */
    public static void m138833x47c65e25(int i17, java.lang.String str, int i18, int i19, int i27) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28712x591f54db interfaceC28712x591f54db = f71885x6b0ff2f1;
        if (interfaceC28712x591f54db != null) {
            interfaceC28712x591f54db.mo131420x47c65e25(i17, str, i18, i19, i27);
        }
    }

    /* renamed from: removeSkylineTexture */
    public static void m138834xb40ea46a(int i17, int i18) {
        android.util.SparseArray<java.util.HashMap<java.lang.String, java.lang.String>> sparseArray = f71887x808fb367;
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = sparseArray.get(i17);
        if (hashMap != null) {
            hashMap.remove("skyline_texture-" + i18);
            if (hashMap.isEmpty()) {
                sparseArray.remove(i17);
            }
        }
    }

    /* renamed from: updateSkylineTextureScale */
    public static void m138835x897b2e9b(int i17, int i18, double d17, double d18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.f66865x76d1ec5a, java.lang.Integer.valueOf(i18));
        hashMap.put("scaleX", java.lang.Double.valueOf(d17));
        hashMap.put("scaleY", java.lang.Double.valueOf(d18));
        if (com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95776xaad4285e(i17) != null) {
            com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95776xaad4285e(i17).m138438xd8c5c779("updateTextureScale", hashMap);
        }
    }
}
