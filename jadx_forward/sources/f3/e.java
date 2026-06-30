package f3;

/* loaded from: classes13.dex */
public abstract class e {
    public static int a(java.lang.Object obj) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return f3.g.a(obj);
        }
        try {
            return ((java.lang.Integer) obj.getClass().getMethod("getResId", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0])).intValue();
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return 0;
        }
    }

    public static java.lang.String b(java.lang.Object obj) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return f3.g.b(obj);
        }
        try {
            return (java.lang.String) obj.getClass().getMethod("getResPackage", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public static int c(java.lang.Object obj) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return f3.g.c(obj);
        }
        try {
            return ((java.lang.Integer) obj.getClass().getMethod("getType", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0])).intValue();
        } catch (java.lang.IllegalAccessException unused) {
            java.util.Objects.toString(obj);
            return -1;
        } catch (java.lang.NoSuchMethodException unused2) {
            java.util.Objects.toString(obj);
            return -1;
        } catch (java.lang.reflect.InvocationTargetException unused3) {
            java.util.Objects.toString(obj);
            return -1;
        }
    }

    public static android.net.Uri d(java.lang.Object obj) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return f3.g.d(obj);
        }
        try {
            return (android.net.Uri) obj.getClass().getMethod("getUri", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public static android.graphics.drawable.Drawable e(android.graphics.drawable.Icon icon, android.content.Context context) {
        return icon.loadDrawable(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.drawable.Icon f(p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.e.f(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
    }
}
