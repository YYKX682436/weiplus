package tc2;

/* loaded from: classes2.dex */
public final class g implements pf5.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f498677d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final tc2.f f498678e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.l1 f498679f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f498680g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f498681h;

    /* renamed from: i, reason: collision with root package name */
    public in5.s0 f498682i;

    /* renamed from: m, reason: collision with root package name */
    public in5.r f498683m;

    static {
        new tc2.e(null);
    }

    public g() {
        tc2.f fVar = new tc2.f(hashCode());
        this.f498678e = fVar;
        p012xc85e97e9.p093xedfae76a.l1 l1Var = new p012xc85e97e9.p093xedfae76a.l1();
        this.f498679f = l1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedControllerStore", "init " + hashCode() + " check map " + fVar);
        java.lang.reflect.Field declaredField = p012xc85e97e9.p093xedfae76a.l1.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(l1Var);
        declaredField.set(l1Var, fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedControllerStore", "init check map srcMap1:" + obj.hashCode() + " srcMap2:" + declaredField.get(l1Var).hashCode() + " storeMap:" + fVar.hashCode());
    }

    public final tc2.c a(java.lang.Class bu6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bu6, "bu");
        java.lang.String c17 = c(bu6);
        if (this.f498678e.containsKey(c17)) {
            return (tc2.c) new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new tc2.d(this)).b(c17, bu6);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderFeedControllerStore", "get controller but not exist, key:" + c17);
        return null;
    }

    public final java.lang.Object b(java.lang.Class bu6) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bu6, "bu");
        java.util.Collection values = this.f498678e.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            java.lang.Class<?>[] interfaces = ((p012xc85e97e9.p093xedfae76a.c1) obj).getClass().getInterfaces();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(interfaces, "getInterfaces(...)");
            if (kz5.z.G(interfaces, bu6)) {
                break;
            }
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final java.lang.String c(java.lang.Class bu6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bu6, "bu");
        java.lang.String canonicalName = bu6.getCanonicalName();
        if (canonicalName == null || canonicalName.length() == 0) {
            pm0.z.b(xy2.b.f539688b, "FinderFeedController_getKey_invalid", false, null, null, false, false, null, 124, null);
        }
        return "FinderFeedControllerStore:" + canonicalName;
    }

    @Override // p012xc85e97e9.p093xedfae76a.m1
    /* renamed from: getViewModelStore */
    public p012xc85e97e9.p093xedfae76a.l1 getViewModel() {
        return this.f498679f;
    }
}
