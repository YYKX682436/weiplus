package p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0003J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculatorCompat;", "Landroidx/window/layout/WindowMetricsCalculator;", "Landroid/app/Activity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "Landroid/graphics/Rect;", "bounds", "Ljz5/f0;", "getRectSizeFromDisplay", "Landroid/content/Context;", "context", "", "getNavigationBarHeight", "Landroid/view/Display;", "display", "Landroid/view/DisplayCutout;", "getCutoutForDisplay", "Landroidx/window/layout/WindowMetrics;", "computeCurrentWindowMetrics", "computeMaximumWindowMetrics", "computeWindowBoundsQ$window_release", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "computeWindowBoundsQ", "computeWindowBoundsP$window_release", "computeWindowBoundsP", "computeWindowBoundsN$window_release", "computeWindowBoundsN", "computeWindowBoundsIceCreamSandwich$window_release", "computeWindowBoundsIceCreamSandwich", "Landroid/graphics/Point;", "getRealSizeForDisplay$window_release", "(Landroid/view/Display;)Landroid/graphics/Point;", "getRealSizeForDisplay", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: androidx.window.layout.WindowMetricsCalculatorCompat */
/* loaded from: classes13.dex */
public final class C1255x3accddd7 implements p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1251x464cc9f5 {

    /* renamed from: INSTANCE */
    public static final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1255x3accddd7 f3941x4fbc8495 = new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1255x3accddd7();
    private static final java.lang.String TAG = "WindowMetricsCalculatorCompat";

    private C1255x3accddd7() {
    }

    /* renamed from: getCutoutForDisplay */
    private final android.view.DisplayCutout m8657xd28e421b(android.view.Display display) {
        try {
            java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName("android.view.DisplayInfo").getConstructor(new java.lang.Class[0]);
            constructor.setAccessible(true);
            java.lang.Object newInstance = constructor.newInstance(new java.lang.Object[0]);
            java.lang.reflect.Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            java.lang.reflect.Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(newInstance);
            if (obj instanceof android.view.DisplayCutout) {
                return (android.view.DisplayCutout) obj;
            }
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
        }
        return null;
    }

    /* renamed from: getNavigationBarHeight */
    private final int m8658x92c6830(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: getRectSizeFromDisplay */
    private final void m8659x27b0a93d(android.app.Activity activity, android.graphics.Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    @Override // p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1251x464cc9f5
    /* renamed from: computeCurrentWindowMetrics */
    public p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1250xcce25e93 mo8645x297b8891(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        int i17 = android.os.Build.VERSION.SDK_INT;
        return new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1250xcce25e93(i17 >= 30 ? p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1228x7a5cda98.f3859x4fbc8495.m8523xfc77aede(activity) : i17 >= 29 ? m8663x79fa7407(activity) : i17 >= 28 ? m8662x98689628(activity) : m8661xd544da6a(activity));
    }

    @Override // p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1251x464cc9f5
    /* renamed from: computeMaximumWindowMetrics */
    public p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1250xcce25e93 mo8646x3e6f174a(android.app.Activity activity) {
        android.graphics.Rect rect;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            rect = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1228x7a5cda98.f3859x4fbc8495.m8524x15eae505(activity);
        } else {
            android.view.Display display = activity.getWindowManager().getDefaultDisplay();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(display, "display");
            android.graphics.Point m8664x90726c4e = m8664x90726c4e(display);
            rect = new android.graphics.Rect(0, 0, m8664x90726c4e.x, m8664x90726c4e.y);
        }
        return new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1250xcce25e93(rect);
    }

    /* renamed from: computeWindowBoundsIceCreamSandwich$window_release */
    public final android.graphics.Rect m8660x989c6a4e(android.app.Activity activity) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.view.Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(defaultDisplay, "defaultDisplay");
        android.graphics.Point m8664x90726c4e = m8664x90726c4e(defaultDisplay);
        android.graphics.Rect rect = new android.graphics.Rect();
        int i18 = m8664x90726c4e.x;
        if (i18 == 0 || (i17 = m8664x90726c4e.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i18;
            rect.bottom = i17;
        }
        return rect;
    }

    /* renamed from: computeWindowBoundsN$window_release */
    public final android.graphics.Rect m8661xd544da6a(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1227x7a5cda7d.f3858x4fbc8495.m8521xea4a57dd(activity)) {
            android.graphics.Point m8664x90726c4e = m8664x90726c4e(defaultDisplay);
            int m8658x92c6830 = m8658x92c6830(activity);
            int i17 = rect.bottom;
            if (i17 + m8658x92c6830 == m8664x90726c4e.y) {
                rect.bottom = i17 + m8658x92c6830;
            } else {
                int i18 = rect.right;
                if (i18 + m8658x92c6830 == m8664x90726c4e.x) {
                    rect.right = i18 + m8658x92c6830;
                }
            }
        }
        return rect;
    }

    /* renamed from: computeWindowBoundsP$window_release */
    public final android.graphics.Rect m8662x98689628(android.app.Activity activity) {
        android.view.DisplayCutout m8657xd28e421b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.graphics.Rect rect = new android.graphics.Rect();
        android.content.res.Configuration configuration = activity.getResources().getConfiguration();
        try {
            java.lang.reflect.Field declaredField = android.content.res.Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(configuration);
            if (p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1227x7a5cda7d.f3858x4fbc8495.m8521xea4a57dd(activity)) {
                java.lang.Object invoke = obj.getClass().getDeclaredMethod("getBounds", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
                if (invoke == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((android.graphics.Rect) invoke);
            } else {
                java.lang.Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
                if (invoke2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((android.graphics.Rect) invoke2);
            }
        } catch (java.lang.IllegalAccessException unused) {
            m8659x27b0a93d(activity, rect);
        } catch (java.lang.NoSuchFieldException unused2) {
            m8659x27b0a93d(activity, rect);
        } catch (java.lang.NoSuchMethodException unused3) {
            m8659x27b0a93d(activity, rect);
        } catch (java.lang.reflect.InvocationTargetException unused4) {
            m8659x27b0a93d(activity, rect);
        }
        android.view.Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1229x9eab354e c1229x9eab354e = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1229x9eab354e.f3860x4fbc8495;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(currentDisplay, "currentDisplay");
        c1229x9eab354e.m8526x4894ec35(currentDisplay, point);
        p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1227x7a5cda7d c1227x7a5cda7d = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1227x7a5cda7d.f3858x4fbc8495;
        if (!c1227x7a5cda7d.m8521xea4a57dd(activity)) {
            int m8658x92c6830 = m8658x92c6830(activity);
            int i17 = rect.bottom;
            if (i17 + m8658x92c6830 == point.y) {
                rect.bottom = i17 + m8658x92c6830;
            } else {
                int i18 = rect.right;
                if (i18 + m8658x92c6830 == point.x) {
                    rect.right = i18 + m8658x92c6830;
                } else if (rect.left == m8658x92c6830) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !c1227x7a5cda7d.m8521xea4a57dd(activity) && (m8657xd28e421b = m8657xd28e421b(currentDisplay)) != null) {
            int i19 = rect.left;
            p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1230x9eab356e c1230x9eab356e = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1230x9eab356e.f3861x4fbc8495;
            if (i19 == c1230x9eab356e.m8529x23d62db7(m8657xd28e421b)) {
                rect.left = 0;
            }
            if (point.x - rect.right == c1230x9eab356e.m8530x5745ea6c(m8657xd28e421b)) {
                rect.right += c1230x9eab356e.m8530x5745ea6c(m8657xd28e421b);
            }
            if (rect.top == c1230x9eab356e.m8531xd7ddbda5(m8657xd28e421b)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == c1230x9eab356e.m8528x76847bdb(m8657xd28e421b)) {
                rect.bottom += c1230x9eab356e.m8528x76847bdb(m8657xd28e421b);
            }
        }
        return rect;
    }

    /* renamed from: computeWindowBoundsQ$window_release */
    public final android.graphics.Rect m8663x79fa7407(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.content.res.Configuration configuration = activity.getResources().getConfiguration();
        try {
            java.lang.reflect.Field declaredField = android.content.res.Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(configuration);
            java.lang.Object invoke = obj.getClass().getDeclaredMethod("getBounds", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
            if (invoke != null) {
                return new android.graphics.Rect((android.graphics.Rect) invoke);
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (java.lang.IllegalAccessException unused) {
            return m8662x98689628(activity);
        } catch (java.lang.NoSuchFieldException unused2) {
            return m8662x98689628(activity);
        } catch (java.lang.NoSuchMethodException unused3) {
            return m8662x98689628(activity);
        } catch (java.lang.reflect.InvocationTargetException unused4) {
            return m8662x98689628(activity);
        }
    }

    /* renamed from: getRealSizeForDisplay$window_release */
    public final android.graphics.Point m8664x90726c4e(android.view.Display display) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(display, "display");
        android.graphics.Point point = new android.graphics.Point();
        p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1229x9eab354e.f3860x4fbc8495.m8526x4894ec35(display, point);
        return point;
    }
}
