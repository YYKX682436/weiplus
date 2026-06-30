package vc1;

/* loaded from: classes13.dex */
public abstract class h3 {

    /* renamed from: d, reason: collision with root package name */
    public static android.hardware.SensorManager f516511d;

    /* renamed from: e, reason: collision with root package name */
    public static vc1.g3 f516512e;

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f516508a = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f516510c = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f516509b = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Runnable f516513f = new vc1.f3();

    public static synchronized boolean a(java.lang.String str, java.lang.String str2) {
        synchronized (vc1.h3.class) {
            java.util.Map map = f516508a;
            java.util.HashMap hashMap = (java.util.HashMap) ((java.util.HashMap) map).get(str);
            if (hashMap == null) {
                return false;
            }
            vc1.a3 a3Var = (vc1.a3) hashMap.get(str2);
            if (a3Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMapManager", "[destroyMapView] mapview not exist, err");
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMapManager", "destoryMapView map:%s", a3Var);
            hashMap.remove(str2);
            g(a3Var);
            if (hashMap.size() <= 0) {
                ((java.util.HashMap) map).remove(str);
            }
            ((java.util.concurrent.CopyOnWriteArraySet) f516509b).add(a3Var);
            java.lang.Runnable runnable = f516513f;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, 100L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMapManager", "[destroyMapView]appid:%s, map count:%d", str, java.lang.Integer.valueOf(hashMap.size()));
            return true;
        }
    }

    public static synchronized vc1.a3 b(java.lang.String str, java.lang.String str2) {
        synchronized (vc1.h3.class) {
            if ("invalid_map_id".equals(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMapManager", "[getMapView]INVALID_MAP_ID");
                return null;
            }
            java.util.HashMap hashMap = (java.util.HashMap) ((java.util.HashMap) f516508a).get(str);
            if (hashMap == null) {
                return null;
            }
            return (vc1.a3) hashMap.get(str2);
        }
    }

    public static synchronized void c() {
        synchronized (vc1.h3.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMapManager", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
            if (f516512e == null) {
                f516512e = new vc1.g3();
                android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");
                f516511d = sensorManager;
                f516511d.registerListener(f516512e, sensorManager.getDefaultSensor(3), 1);
            }
        }
    }

    public static synchronized boolean d(java.lang.String str, java.lang.String str2, vc1.a3 a3Var) {
        synchronized (vc1.h3.class) {
            if ("invalid_map_id".equals(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMapManager", "[createMapView]INVALID_MAP_ID");
                return false;
            }
            java.util.Map map = f516508a;
            java.util.HashMap hashMap = (java.util.HashMap) ((java.util.HashMap) map).get(str);
            if (hashMap == null) {
                hashMap = new java.util.HashMap();
                ((java.util.HashMap) map).put(str, hashMap);
            }
            if (hashMap.containsKey(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandMapManager", "map is exist, return");
                return false;
            }
            hashMap.put(str2, a3Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMapManager", "initMapView appId:%s, mapId:%s", str, str2);
            return true;
        }
    }

    public static synchronized void e(vc1.a3 a3Var) {
        synchronized (vc1.h3.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMapManager", "registerListener map:%s", a3Var);
            java.util.Set set = f516510c;
            ((java.util.HashSet) set).add(a3Var);
            if (((java.util.HashSet) set).size() == 1) {
                c();
            }
        }
    }

    public static synchronized void f() {
        synchronized (vc1.h3.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMapManager", "uninit");
            if (f516512e != null && f516511d != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMapManager", "sensorListener uninit");
                f516511d.unregisterListener(f516512e);
                f516511d = null;
                f516512e = null;
            }
        }
    }

    public static synchronized void g(vc1.a3 a3Var) {
        synchronized (vc1.h3.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMapManager", "unregisterListener map:%s", a3Var);
            java.util.Set set = f516510c;
            ((java.util.HashSet) set).remove(a3Var);
            if (((java.util.HashSet) set).size() == 0) {
                f();
            }
        }
    }
}
