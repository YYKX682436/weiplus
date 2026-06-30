package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0003J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculatorCompat;", "Landroidx/window/layout/WindowMetricsCalculator;", "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Landroid/graphics/Rect;", "bounds", "Ljz5/f0;", "getRectSizeFromDisplay", "Landroid/content/Context;", "context", "", "getNavigationBarHeight", "Landroid/view/Display;", "display", "Landroid/view/DisplayCutout;", "getCutoutForDisplay", "Landroidx/window/layout/WindowMetrics;", "computeCurrentWindowMetrics", "computeMaximumWindowMetrics", "computeWindowBoundsQ$window_release", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "computeWindowBoundsQ", "computeWindowBoundsP$window_release", "computeWindowBoundsP", "computeWindowBoundsN$window_release", "computeWindowBoundsN", "computeWindowBoundsIceCreamSandwich$window_release", "computeWindowBoundsIceCreamSandwich", "Landroid/graphics/Point;", "getRealSizeForDisplay$window_release", "(Landroid/view/Display;)Landroid/graphics/Point;", "getRealSizeForDisplay", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes13.dex */
public final class WindowMetricsCalculatorCompat implements androidx.window.layout.WindowMetricsCalculator {
    public static final androidx.window.layout.WindowMetricsCalculatorCompat INSTANCE = new androidx.window.layout.WindowMetricsCalculatorCompat();
    private static final java.lang.String TAG = "WindowMetricsCalculatorCompat";

    private WindowMetricsCalculatorCompat() {
    }

    private final android.view.DisplayCutout getCutoutForDisplay(android.view.Display display) {
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

    private final int getNavigationBarHeight(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void getRectSizeFromDisplay(android.app.Activity activity, android.graphics.Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public androidx.window.layout.WindowMetrics computeCurrentWindowMetrics(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        int i17 = android.os.Build.VERSION.SDK_INT;
        return new androidx.window.layout.WindowMetrics(i17 >= 30 ? androidx.window.layout.ActivityCompatHelperApi30.INSTANCE.currentWindowBounds(activity) : i17 >= 29 ? computeWindowBoundsQ$window_release(activity) : i17 >= 28 ? computeWindowBoundsP$window_release(activity) : computeWindowBoundsN$window_release(activity));
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public androidx.window.layout.WindowMetrics computeMaximumWindowMetrics(android.app.Activity activity) {
        android.graphics.Rect rect;
        kotlin.jvm.internal.o.g(activity, "activity");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            rect = androidx.window.layout.ActivityCompatHelperApi30.INSTANCE.maximumWindowBounds(activity);
        } else {
            android.view.Display display = activity.getWindowManager().getDefaultDisplay();
            kotlin.jvm.internal.o.f(display, "display");
            android.graphics.Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(display);
            rect = new android.graphics.Rect(0, 0, realSizeForDisplay$window_release.x, realSizeForDisplay$window_release.y);
        }
        return new androidx.window.layout.WindowMetrics(rect);
    }

    public final android.graphics.Rect computeWindowBoundsIceCreamSandwich$window_release(android.app.Activity activity) {
        int i17;
        kotlin.jvm.internal.o.g(activity, "activity");
        android.view.Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        kotlin.jvm.internal.o.f(defaultDisplay, "defaultDisplay");
        android.graphics.Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
        android.graphics.Rect rect = new android.graphics.Rect();
        int i18 = realSizeForDisplay$window_release.x;
        if (i18 == 0 || (i17 = realSizeForDisplay$window_release.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i18;
            rect.bottom = i17;
        }
        return rect;
    }

    public final android.graphics.Rect computeWindowBoundsN$window_release(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!androidx.window.layout.ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            android.graphics.Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i17 = rect.bottom;
            if (i17 + navigationBarHeight == realSizeForDisplay$window_release.y) {
                rect.bottom = i17 + navigationBarHeight;
            } else {
                int i18 = rect.right;
                if (i18 + navigationBarHeight == realSizeForDisplay$window_release.x) {
                    rect.right = i18 + navigationBarHeight;
                }
            }
        }
        return rect;
    }

    public final android.graphics.Rect computeWindowBoundsP$window_release(android.app.Activity activity) {
        android.view.DisplayCutout cutoutForDisplay;
        kotlin.jvm.internal.o.g(activity, "activity");
        android.graphics.Rect rect = new android.graphics.Rect();
        android.content.res.Configuration configuration = activity.getResources().getConfiguration();
        try {
            java.lang.reflect.Field declaredField = android.content.res.Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(configuration);
            if (androidx.window.layout.ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
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
            getRectSizeFromDisplay(activity, rect);
        } catch (java.lang.NoSuchFieldException unused2) {
            getRectSizeFromDisplay(activity, rect);
        } catch (java.lang.NoSuchMethodException unused3) {
            getRectSizeFromDisplay(activity, rect);
        } catch (java.lang.reflect.InvocationTargetException unused4) {
            getRectSizeFromDisplay(activity, rect);
        }
        android.view.Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        androidx.window.layout.DisplayCompatHelperApi17 displayCompatHelperApi17 = androidx.window.layout.DisplayCompatHelperApi17.INSTANCE;
        kotlin.jvm.internal.o.f(currentDisplay, "currentDisplay");
        displayCompatHelperApi17.getRealSize(currentDisplay, point);
        androidx.window.layout.ActivityCompatHelperApi24 activityCompatHelperApi24 = androidx.window.layout.ActivityCompatHelperApi24.INSTANCE;
        if (!activityCompatHelperApi24.isInMultiWindowMode(activity)) {
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i17 = rect.bottom;
            if (i17 + navigationBarHeight == point.y) {
                rect.bottom = i17 + navigationBarHeight;
            } else {
                int i18 = rect.right;
                if (i18 + navigationBarHeight == point.x) {
                    rect.right = i18 + navigationBarHeight;
                } else if (rect.left == navigationBarHeight) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activityCompatHelperApi24.isInMultiWindowMode(activity) && (cutoutForDisplay = getCutoutForDisplay(currentDisplay)) != null) {
            int i19 = rect.left;
            androidx.window.layout.DisplayCompatHelperApi28 displayCompatHelperApi28 = androidx.window.layout.DisplayCompatHelperApi28.INSTANCE;
            if (i19 == displayCompatHelperApi28.safeInsetLeft(cutoutForDisplay)) {
                rect.left = 0;
            }
            if (point.x - rect.right == displayCompatHelperApi28.safeInsetRight(cutoutForDisplay)) {
                rect.right += displayCompatHelperApi28.safeInsetRight(cutoutForDisplay);
            }
            if (rect.top == displayCompatHelperApi28.safeInsetTop(cutoutForDisplay)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay)) {
                rect.bottom += displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay);
            }
        }
        return rect;
    }

    public final android.graphics.Rect computeWindowBoundsQ$window_release(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
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
            return computeWindowBoundsP$window_release(activity);
        } catch (java.lang.NoSuchFieldException unused2) {
            return computeWindowBoundsP$window_release(activity);
        } catch (java.lang.NoSuchMethodException unused3) {
            return computeWindowBoundsP$window_release(activity);
        } catch (java.lang.reflect.InvocationTargetException unused4) {
            return computeWindowBoundsP$window_release(activity);
        }
    }

    public final android.graphics.Point getRealSizeForDisplay$window_release(android.view.Display display) {
        kotlin.jvm.internal.o.g(display, "display");
        android.graphics.Point point = new android.graphics.Point();
        androidx.window.layout.DisplayCompatHelperApi17.INSTANCE.getRealSize(display, point);
        return point;
    }
}
