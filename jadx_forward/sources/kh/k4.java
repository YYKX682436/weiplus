package kh;

/* loaded from: classes10.dex */
public final class k4 {

    /* renamed from: a, reason: collision with root package name */
    public static final kh.k4 f389377a = new kh.k4();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Class f389378b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.reflect.Field f389379c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.reflect.Method f389380d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.reflect.Field f389381e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f389382f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f389383g;

    static {
        jz5.i iVar = jz5.i.f384362d;
        f389382f = jz5.h.a(iVar, kh.i4.f389366d);
        f389383g = jz5.h.a(iVar, kh.j4.f389369d);
    }

    public static /* synthetic */ void b(kh.k4 k4Var, android.view.ViewTreeObserver viewTreeObserver, java.lang.String str, java.lang.Class cls, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            aVar = kh.h4.f389358d;
        }
        k4Var.a(viewTreeObserver, str, cls, aVar);
    }

    public final void a(android.view.ViewTreeObserver viewTreeObserver, java.lang.String str, java.lang.Class cls, yz5.a aVar) {
        java.util.List list;
        try {
            java.util.HashMap hashMap = (java.util.HashMap) f389382f.mo141623x754a37bb();
            java.lang.Object obj = hashMap.get(str);
            java.lang.Object obj2 = obj;
            if (obj == null) {
                java.lang.reflect.Field declaredField = viewTreeObserver.getClass().getDeclaredField(str);
                declaredField.setAccessible(true);
                hashMap.put(str, declaredField);
                obj2 = declaredField;
            }
            java.lang.reflect.Field field = (java.lang.reflect.Field) obj2;
            java.util.List b17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.b(field.get(viewTreeObserver));
            if (b17 != null && (b17.isEmpty() ^ true)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b17, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.b(b17);
                java.util.List S0 = kz5.n0.S0(b17);
                if (b17 instanceof kh.u3) {
                    b17.clear();
                    list = b17;
                } else {
                    list = (java.util.List) aVar.mo152xb9724478();
                }
                java.util.Iterator it = S0.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    java.lang.Object b18 = kh.y3.f389487d.b(str, next, cls, next != null ? next.getClass().getName() : null);
                    if (b18 != null) {
                        next = b18;
                    }
                    list.add(next);
                }
                if (b17 != list) {
                    field.set(viewTreeObserver, list);
                    if (d(str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.TraversalTracker", "hacking array: " + viewTreeObserver);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.TraversalTracker", th6, "hackCopyOnWriteArrayListListenersErr: " + th6.getMessage(), new java.lang.Object[0]);
            if (kh.k1.f389371n) {
                ap.a.a(1, "errTrackTraversal", th6, null, "hackCopyOnWriteArrayListListeners", str, cls.getName());
            }
        }
    }

    public final void c(android.view.ViewTreeObserver viewTreeObserver, java.lang.String str, java.lang.Class cls) {
        java.util.List u3Var;
        try {
            java.util.HashMap hashMap = (java.util.HashMap) f389382f.mo141623x754a37bb();
            java.lang.Object obj = hashMap.get(str);
            java.lang.Object obj2 = obj;
            if (obj == null) {
                java.lang.reflect.Field declaredField = viewTreeObserver.getClass().getDeclaredField(str);
                declaredField.setAccessible(true);
                hashMap.put(str, declaredField);
                obj2 = declaredField;
            }
            java.lang.reflect.Field field = (java.lang.reflect.Field) obj2;
            java.lang.Object obj3 = field.get(viewTreeObserver);
            if (obj3 != null) {
                java.lang.reflect.Field field2 = f389381e;
                if (field2 == null) {
                    java.lang.Class cls2 = f389378b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cls2);
                    field2 = cls2.getDeclaredField("mData");
                    field2.setAccessible(true);
                    f389381e = field2;
                }
                java.util.List b17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.b(field2.get(obj3));
                if (b17 != null && (b17.isEmpty() ^ true)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b17, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
                    p3321xbce91901.jvm.p3324x21ffc6bd.m0.b(b17);
                    java.util.List S0 = kz5.n0.S0(b17);
                    if (b17 instanceof kh.u3) {
                        b17.clear();
                        u3Var = b17;
                    } else {
                        u3Var = new kh.u3();
                    }
                    java.util.Iterator it = S0.iterator();
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        java.lang.Object b18 = kh.y3.f389487d.b(str, next, cls, next != null ? next.getClass().getName() : null);
                        if (b18 != null) {
                            next = b18;
                        }
                        u3Var.add(next);
                    }
                    java.lang.Object c0052x1165411 = obj3.getClass() == f389378b ? new p001xcca8366f.p011x373aa5.C0052x1165411(new kh.a4(str, cls, u3Var)) : obj3;
                    if (b17 != u3Var) {
                        field2.set(c0052x1165411, u3Var);
                        if (d(str)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.TraversalTracker", "hacking array dataList: " + viewTreeObserver);
                        }
                    }
                    if (obj3 != c0052x1165411) {
                        field.set(viewTreeObserver, c0052x1165411);
                        if (d(str)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.TraversalTracker", "hacking array: " + viewTreeObserver);
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.TraversalTracker", th6, "hackCopyOnWriteArrayListenersErr: " + th6.getMessage(), new java.lang.Object[0]);
            if (kh.k1.f389371n) {
                ap.a.a(1, "errTrackTraversal", th6, null, "hackCopyOnWriteArrayListeners", str, cls.getName());
            }
        }
    }

    public final boolean d(java.lang.String str) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "mOnPreDrawListeners");
    }
}
