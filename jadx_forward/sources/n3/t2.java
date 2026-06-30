package n3;

/* loaded from: classes14.dex */
public abstract class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Field f415946a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Field f415947b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.reflect.Field f415948c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f415949d;

    static {
        try {
            java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mAttachInfo");
            f415946a = declaredField;
            declaredField.setAccessible(true);
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
            java.lang.reflect.Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f415947b = declaredField2;
            declaredField2.setAccessible(true);
            java.lang.reflect.Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f415948c = declaredField3;
            declaredField3.setAccessible(true);
            f415949d = true;
        } catch (java.lang.ReflectiveOperationException e17) {
            e17.getMessage();
        }
    }
}
