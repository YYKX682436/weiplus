package ey2;

/* loaded from: classes2.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ey2.l0 f338955a = new ey2.l0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f338956b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f338957c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f338958d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f338959e;

    static {
        android.content.Context applicationContext = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        android.app.Application application = (android.app.Application) applicationContext;
        if (p012xc85e97e9.p093xedfae76a.e1.f93154c == null) {
            p012xc85e97e9.p093xedfae76a.e1.f93154c = new p012xc85e97e9.p093xedfae76a.e1(application);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p012xc85e97e9.p093xedfae76a.e1.f93154c, "getInstance(...)");
        f338958d = new java.lang.Object();
        f338959e = "FinderGlobalVMStore";
    }

    public final p012xc85e97e9.p093xedfae76a.c1 a(java.lang.String key, java.lang.Class modelClass, p012xc85e97e9.p093xedfae76a.f1 f1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        synchronized (f338958d) {
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) f338956b;
            java.lang.Object obj = linkedHashMap.get(key);
            if (obj == null) {
                obj = new p012xc85e97e9.p093xedfae76a.l1();
                linkedHashMap.put(key, obj);
            }
            p012xc85e97e9.p093xedfae76a.l1 l1Var = (p012xc85e97e9.p093xedfae76a.l1) obj;
            java.lang.String str = modelClass.getCanonicalName() + '_' + key;
            if (f1Var == null) {
                f1Var = (p012xc85e97e9.p093xedfae76a.f1) ((java.util.LinkedHashMap) f338957c).get(str);
            }
            if (f1Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f338959e, "getViewModel is defaultFactory combinedKey:" + str);
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f338959e, "getViewModel combinedKey:" + str);
            return new p012xc85e97e9.p093xedfae76a.j1(l1Var, f1Var).b(str, modelClass);
        }
    }
}
