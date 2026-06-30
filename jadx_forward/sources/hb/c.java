package hb;

/* loaded from: classes7.dex */
public final class c extends hb.b {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Class f361542d;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f361543b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Field f361544c;

    public c() {
        java.lang.Object obj;
        java.lang.reflect.Field field = null;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("sun.misc.Unsafe");
            f361542d = cls;
            java.lang.reflect.Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (java.lang.Exception unused) {
            obj = null;
        }
        this.f361543b = obj;
        try {
            field = java.lang.reflect.AccessibleObject.class.getDeclaredField("override");
        } catch (java.lang.NoSuchFieldException unused2) {
        }
        this.f361544c = field;
    }

    @Override // hb.b
    public void a(java.lang.reflect.AccessibleObject accessibleObject) {
        java.lang.reflect.Field field;
        boolean z17 = false;
        java.lang.Object obj = this.f361543b;
        if (obj != null && (field = this.f361544c) != null) {
            try {
                f361542d.getMethod("putBoolean", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Boolean.TYPE).invoke(obj, accessibleObject, java.lang.Long.valueOf(((java.lang.Long) f361542d.getMethod("objectFieldOffset", java.lang.reflect.Field.class).invoke(obj, field)).longValue()), java.lang.Boolean.TRUE);
                z17 = true;
            } catch (java.lang.Exception unused) {
            }
        }
        if (z17) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (java.lang.SecurityException e17) {
            throw new com.p176xb6135e39.p280x308fcb.m("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e17);
        }
    }
}
