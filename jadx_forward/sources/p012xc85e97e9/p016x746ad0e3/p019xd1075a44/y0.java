package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes13.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.graphics.Rect f91271a = new android.graphics.Rect();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Class f91272b;

    static {
        try {
            f91272b = java.lang.Class.forName("android.graphics.Insets");
        } catch (java.lang.ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(android.graphics.drawable.Drawable drawable) {
        if (!(drawable instanceof android.graphics.drawable.DrawableContainer)) {
            if (drawable instanceof f3.k) {
                ((f3.l) ((f3.k) drawable)).getClass();
                return a(null);
            }
            if (drawable instanceof l.a) {
                return a(((l.a) drawable).f395556d);
            }
            if (drawable instanceof android.graphics.drawable.ScaleDrawable) {
                return a(((android.graphics.drawable.ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof android.graphics.drawable.DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (android.graphics.drawable.Drawable drawable2 : ((android.graphics.drawable.DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!a(drawable2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static android.graphics.Rect b(android.graphics.drawable.Drawable drawable) {
        char c17;
        java.lang.Class cls = f91272b;
        if (cls != null) {
            try {
                boolean z17 = drawable instanceof f3.k;
                java.lang.Object obj = drawable;
                if (z17) {
                    ((f3.l) ((f3.k) drawable)).getClass();
                    obj = null;
                }
                java.lang.Object invoke = obj.getClass().getMethod("getOpticalInsets", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
                if (invoke != null) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    for (java.lang.reflect.Field field : cls.getFields()) {
                        java.lang.String name = field.getName();
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c17 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c17 = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c17 = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c17 = 2;
                                    break;
                                }
                                break;
                        }
                        c17 = 65535;
                        if (c17 == 0) {
                            rect.left = field.getInt(invoke);
                        } else if (c17 == 1) {
                            rect.top = field.getInt(invoke);
                        } else if (c17 == 2) {
                            rect.right = field.getInt(invoke);
                        } else if (c17 == 3) {
                            rect.bottom = field.getInt(invoke);
                        }
                    }
                    return rect;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return f91271a;
    }

    public static android.graphics.PorterDuff.Mode c(int i17, android.graphics.PorterDuff.Mode mode) {
        if (i17 == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i17 == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i17 == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i17) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
