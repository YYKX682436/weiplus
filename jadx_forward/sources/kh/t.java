package kh;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final kh.t f389443a = new kh.t();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Class f389444b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.reflect.Field f389445c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.reflect.Field f389446d;

    /* renamed from: e, reason: collision with root package name */
    public static int f389447e;

    public final void a(android.animation.Animator animator) {
        java.lang.Class cls;
        java.lang.Class<?> cls2;
        java.lang.Class<?> cls3;
        java.lang.String name;
        java.lang.Class<?> cls4;
        cls = android.animation.ValueAnimator.class;
        if (animator != null) {
            try {
                cls2 = animator.getClass();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.AnimatorTracker", th6, "hookAnimationHandlerErr " + f389447e + ": " + th6.getMessage(), new java.lang.Object[0]);
                int i17 = f389447e % 10;
                if (i17 + ((((i17 ^ 10) & ((-i17) | i17)) >> 31) & 10) == 0) {
                    boolean z17 = kh.k1.f389371n;
                    if (kh.k1.f389371n) {
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        java.lang.Class<?>[] interfaces = (animator != null ? animator.getClass() : android.animation.ValueAnimator.class).getInterfaces();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(interfaces, "getInterfaces(...)");
                        int length = interfaces.length;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= length) {
                                cls3 = null;
                                break;
                            }
                            cls3 = interfaces[i18];
                            if (r26.i0.n(cls3.getName(), "$AnimationFrameCallback", false)) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                        if (cls3 != null) {
                            linkedHashMap.put("class", cls3.getName());
                            linkedHashMap.put("modifiers", java.lang.Integer.valueOf(cls3.getModifiers()));
                            try {
                                java.lang.reflect.Field declaredField = java.lang.Class.class.getDeclaredField("accessFlags");
                                declaredField.setAccessible(true);
                                declaredField.setInt(cls3, (declaredField.getInt(cls3) & (-3)) | 1);
                                name = java.lang.String.valueOf(declaredField.getInt(cls3));
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.MatrixReportUtils", e17, "modifyAndGetClassAccessFlags failed", new java.lang.Object[0]);
                                java.lang.String message = e17.getMessage();
                                name = message == null ? e17.getClass().getName() : message;
                            }
                            linkedHashMap.put("accessFlags", name);
                        }
                        java.lang.String[] strArr = new java.lang.String[3];
                        strArr[0] = "AnimationFrameCallback";
                        strArr[1] = java.lang.String.valueOf(f389447e);
                        strArr[2] = animator != null ? animator.getClass().getName() : null;
                        ap.a.a(1, "errTrackAnimator", th6, linkedHashMap, strArr);
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            cls2 = cls;
        }
        java.lang.Class<?>[] interfaces2 = cls2.getInterfaces();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(interfaces2, "getInterfaces(...)");
        int length2 = interfaces2.length;
        int i19 = 0;
        while (true) {
            if (i19 >= length2) {
                cls4 = null;
                break;
            }
            cls4 = interfaces2[i19];
            if (r26.i0.n(cls4.getName(), "$AnimationFrameCallback", false)) {
                break;
            } else {
                i19++;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cls4);
        f389444b = cls4;
    }
}
