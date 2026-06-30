package kh;

/* loaded from: classes12.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final kh.i0 f389359a = new kh.i0();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Field f389360b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.reflect.Field f389361c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.reflect.Field f389362d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.reflect.Field f389363e;

    public final void a(java.lang.Object obj) {
        try {
            if (f389362d == null) {
                java.lang.reflect.Field declaredField = obj.getClass().getDeclaredField("action");
                declaredField.setAccessible(true);
                f389362d = declaredField;
            }
            java.lang.reflect.Field field = f389362d;
            if (field != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(field);
                java.lang.Object obj2 = field.get(obj);
                if ((obj2 instanceof android.view.Choreographer.FrameCallback) && !(obj2 instanceof kh.d0)) {
                    java.lang.reflect.Field field2 = f389362d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(field2);
                    field2.set(obj, new kh.d0((android.view.Choreographer.FrameCallback) obj2));
                } else if ((obj2 instanceof java.lang.Runnable) && !(obj2 instanceof kh.f0)) {
                    java.lang.reflect.Field field3 = f389362d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(field3);
                    field3.set(obj, new kh.f0((java.lang.Runnable) obj2));
                } else if (android.os.Build.VERSION.SDK_INT >= 33 && (obj2 instanceof android.view.Choreographer.VsyncCallback) && !(obj2 instanceof kh.h0)) {
                    java.lang.reflect.Field field4 = f389362d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(field4);
                    field4.set(obj, new kh.h0((android.view.Choreographer.VsyncCallback) obj2));
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.ChoreographerTracker", e17, "reflect action failed", new java.lang.Object[0]);
            boolean z17 = kh.k1.f389371n;
            if (kh.k1.f389371n) {
                ap.a.a(1, "errTrackChoreographer", e17, null, "action", e17.getMessage());
            }
        }
        try {
            if (f389363e == null) {
                java.lang.reflect.Field declaredField2 = obj.getClass().getDeclaredField("next");
                declaredField2.setAccessible(true);
                f389363e = declaredField2;
            }
            java.lang.reflect.Field field5 = f389363e;
            if (field5 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(field5);
                java.lang.Object obj3 = field5.get(obj);
                if (obj3 != null) {
                    a(obj3);
                }
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.ChoreographerTracker", e18, "reflect next failed", new java.lang.Object[0]);
            boolean z18 = kh.k1.f389371n;
            if (kh.k1.f389371n) {
                ap.a.a(1, "errTrackChoreographer", e18, null, "next", e18.getMessage());
            }
        }
    }

    public final void b(android.view.Choreographer choreographer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(choreographer, "choreographer");
        try {
            if (f389360b == null) {
                java.lang.reflect.Field declaredField = android.view.Choreographer.class.getDeclaredField("mCallbackQueues");
                declaredField.setAccessible(true);
                f389360b = declaredField;
            }
            java.lang.reflect.Field field = f389360b;
            if (field != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(field);
                java.lang.Object obj = field.get(choreographer);
                if (obj != null) {
                    int length = java.lang.reflect.Array.getLength(obj);
                    for (int i17 = 0; i17 < length; i17++) {
                        java.lang.Object obj2 = java.lang.reflect.Array.get(obj, i17);
                        if (obj2 != null) {
                            try {
                                if (f389361c == null) {
                                    java.lang.reflect.Field declaredField2 = obj2.getClass().getDeclaredField("mHead");
                                    declaredField2.setAccessible(true);
                                    f389361c = declaredField2;
                                }
                                java.lang.reflect.Field field2 = f389361c;
                                if (field2 != null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(field2);
                                    java.lang.Object obj3 = field2.get(obj2);
                                    if (obj3 != null) {
                                        a(obj3);
                                    }
                                }
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.ChoreographerTracker", e17, "reflect mHead failed", new java.lang.Object[0]);
                                boolean z17 = kh.k1.f389371n;
                                if (kh.k1.f389371n) {
                                    ap.a.a(1, "errTrackChoreographer", e17, null, "mHead", e17.getMessage());
                                }
                            }
                        }
                    }
                }
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.ChoreographerTracker", e18, "reflect mCallbackQueues failed", new java.lang.Object[0]);
            boolean z18 = kh.k1.f389371n;
            if (kh.k1.f389371n) {
                ap.a.a(1, "errTrackChoreographer", e18, null, "mCallbackQueues", e18.getMessage());
            }
        }
    }
}
