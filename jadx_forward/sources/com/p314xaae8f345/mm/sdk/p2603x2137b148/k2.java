package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public abstract class k2 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.reflect.Field f274328c;

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f274329d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f274330e;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Runnable f274332g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile java.lang.Class f274333h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile java.lang.reflect.Method f274334i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.Object f274335j;

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f274326a = new java.util.WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f274327b = new byte[0];

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f274331f = android.app.Activity.class.getName();

    static {
        f274328c = null;
        f274329d = null;
        f274330e = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i2 i2Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i2();
        f274332g = i2Var;
        if ((!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) || com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() > 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ListenerInstanceMonitor", "Not debug, assist or monkey env, keep disabled.");
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mContext");
                f274328c = declaredField;
                declaredField.setAccessible(true);
                synchronized (i2Var) {
                    if (!f274330e) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("ListenerInstanceMonitor");
                        f274329d = n3Var;
                        n3Var.m77789xc5a5549d(false);
                        f274329d.mo50297x7c4d7ca2(i2Var, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                        f274330e = true;
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ListenerInstanceMonitor", th6, "init failed, keep disabled.", new java.lang.Object[0]);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ListenerInstanceMonitor", "Not mm process, keep disabled.");
        }
        f274333h = null;
        f274334i = null;
        f274335j = new java.lang.Object();
    }

    public static void a(java.lang.Object obj, android.app.Activity activity, java.lang.reflect.Field field, java.lang.Throwable th6) {
        java.lang.annotation.Annotation annotation;
        try {
            if (f274333h == null) {
                synchronized (f274335j) {
                    if (f274333h == null) {
                        f274333h = com.p314xaae8f345.mm.sdk.p2603x2137b148.InterfaceC20991xc9ebf713.class;
                        f274334i = f274333h.getDeclaredMethod("value", new java.lang.Class[0]);
                    }
                }
            }
            if (!obj.getClass().isAnnotationPresent(f274333h)) {
                java.lang.reflect.Method[] declaredMethods = obj.getClass().getDeclaredMethods();
                int length = declaredMethods.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        annotation = null;
                        break;
                    }
                    java.lang.reflect.Method method = declaredMethods[i17];
                    if (method.isAnnotationPresent(f274333h)) {
                        annotation = method.getAnnotation(f274333h);
                        break;
                    }
                    i17++;
                }
            } else {
                annotation = obj.getClass().getAnnotation(f274333h);
            }
            if (annotation != null) {
                java.lang.Class<?> cls = activity.getClass();
                java.lang.Class[] clsArr = (java.lang.Class[]) f274334i.invoke(annotation, new java.lang.Object[0]);
                boolean z17 = true;
                if (clsArr != null && clsArr.length > 0) {
                    int length2 = clsArr.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= length2) {
                            z17 = false;
                            break;
                        } else if (cls.equals(clsArr[i18])) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ListenerInstanceMonitor", "Activity %s held by %s is ignored !!", activity, obj);
                    return;
                }
            }
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ListenerInstanceMonitor", th7, "addHeldObjInfo", new java.lang.Object[0]);
        }
        synchronized (f274327b) {
            java.util.Map map = f274326a;
            java.util.Set set = (java.util.Set) ((java.util.WeakHashMap) map).get(obj);
            if (set == null) {
                set = new java.util.HashSet();
                ((java.util.WeakHashMap) map).put(obj, set);
            }
            set.add(new com.p314xaae8f345.mm.sdk.p2603x2137b148.j2(activity, field, th6));
        }
    }

    public static void b(java.lang.Object obj) {
        synchronized (f274332g) {
            if (f274330e) {
                if (obj == null) {
                    return;
                }
                java.lang.Throwable th6 = new java.lang.Throwable();
                for (java.lang.Class<?> cls = obj.getClass(); !java.lang.Object.class.equals(cls); cls = cls.getSuperclass()) {
                    if (android.app.Activity.class.isAssignableFrom(cls)) {
                        d(obj, null, th6);
                    } else if (android.view.View.class.isAssignableFrom(cls)) {
                        e(obj, null, th6);
                    } else {
                        for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                            java.lang.Class<?> type = field.getType();
                            if (android.app.Activity.class.isAssignableFrom(type)) {
                                d(obj, field, th6);
                            } else if (android.view.View.class.isAssignableFrom(type)) {
                                e(obj, field, th6);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void c(java.lang.Object obj) {
        synchronized (f274332g) {
            if (f274330e) {
                if (obj == null) {
                    return;
                }
                synchronized (f274327b) {
                    ((java.util.WeakHashMap) f274326a).remove(obj);
                }
            }
        }
    }

    public static void d(java.lang.Object obj, java.lang.reflect.Field field, java.lang.Throwable th6) {
        android.app.Activity activity;
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            try {
                activity = (android.app.Activity) field.get(obj);
                if (activity == null) {
                    return;
                }
            } catch (java.lang.Throwable unused) {
                return;
            }
        } else if (!(obj instanceof android.app.Activity)) {
            return;
        } else {
            activity = (android.app.Activity) obj;
        }
        a(obj, activity, field, th6);
    }

    public static void e(java.lang.Object obj, java.lang.reflect.Field field, java.lang.Throwable th6) {
        android.view.View view;
        java.lang.reflect.Field field2 = f274328c;
        if (field == null) {
            if (!(obj instanceof android.view.View)) {
                return;
            } else {
                view = (android.view.View) obj;
            }
        } else {
            if (field2 == null) {
                return;
            }
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            try {
                view = (android.view.View) field.get(obj);
                if (view == null) {
                    return;
                }
            } catch (java.lang.Throwable unused) {
                return;
            }
        }
        java.lang.Object obj2 = field2.get(view);
        if (obj2 instanceof android.app.Activity) {
            a(obj, (android.app.Activity) obj2, field, th6);
        }
    }
}
