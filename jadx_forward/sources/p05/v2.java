package p05;

@j95.b
/* loaded from: classes5.dex */
public final class v2 extends i95.w implements rh0.x {

    /* renamed from: d, reason: collision with root package name */
    public static final p05.v2 f432237d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f432238e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f432239f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f432240g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.LinkedList f432241h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f432242i;

    static {
        p05.v2 v2Var = new p05.v2();
        f432237d = v2Var;
        f432238e = "MicroMsg.WeVisEffectConfigMgr";
        f432239f = 604800000L;
        f432240g = 86400000L;
        f432241h = new java.util.LinkedList();
        f432242i = new java.util.concurrent.ConcurrentHashMap();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            pm0.v.V(5000L, p05.o2.f432164d);
        } else {
            v2Var.Di();
        }
    }

    public java.util.Map Ai(rh0.z scene) {
        java.lang.String str;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.util.Set<java.util.Map.Entry> entrySet;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        java.util.HashMap hashMap = new java.util.HashMap();
        switch (scene.ordinal()) {
            case 0:
            case 4:
                str = "voip";
                break;
            case 1:
                str = "zpbq";
                break;
            case 2:
            case 3:
                str = "livevlog";
                break;
            case 5:
                str = "sightcameracap";
                break;
            case 6:
                str = "livepusher";
                break;
            case 7:
            default:
                str = null;
                break;
            case 8:
                str = "miaojian";
                break;
            case 9:
                str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
                break;
        }
        if (str != null && (concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) f432242i.get(str)) != null && (entrySet = concurrentHashMap.entrySet()) != null) {
            for (java.util.Map.Entry entry : entrySet) {
                java.lang.Object key = entry.getKey();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "<get-key>(...)");
                hashMap.put(key, java.lang.String.valueOf(((r45.r87) entry.getValue()).f466179f));
            }
        }
        return hashMap;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi() {
        return p05.p3.f432172a.b();
    }

    public final void Di() {
        r45.t87 t87Var = new r45.t87();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi = Bi();
        p05.p3 p3Var = p05.p3.f432172a;
        byte[] j17 = Bi.j("effect_config");
        if (j17 != null) {
            try {
                t87Var.mo11468x92b714fd(j17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        Ni(t87Var, false);
    }

    public final void Ni(r45.t87 t87Var, boolean z17) {
        java.util.LinkedList<r45.r87> linkedList = f432241h;
        linkedList.clear();
        linkedList.addAll(t87Var.f467741d);
        for (r45.r87 r87Var : linkedList) {
            java.lang.String str = r87Var.f466180g;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f432242i;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(str);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap();
                java.lang.String Scenario = r87Var.f466180g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Scenario, "Scenario");
                concurrentHashMap.put(Scenario, concurrentHashMap2);
            }
            java.lang.String ConfigKey = r87Var.f466177d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ConfigKey, "ConfigKey");
            concurrentHashMap2.put(ConfigKey, r87Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f432238e, "updateConfigMap: scene:" + r87Var.f466180g + ", key:" + r87Var.f466177d + ", value:" + r87Var.f466179f);
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19567x35db38ca.f270128a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            android.content.Intent intent = new android.content.Intent("com.tencent.mm.WeVisUpdate");
            intent.putExtra("type", "effect_config");
            intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
        }
    }

    public java.lang.String wi(rh0.z scene, java.lang.String configKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configKey, "configKey");
        return (java.lang.String) ((java.util.HashMap) Ai(scene)).get(configKey);
    }
}
