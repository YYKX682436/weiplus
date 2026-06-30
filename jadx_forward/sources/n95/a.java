package n95;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f417455a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f417456b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f417457c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Field f417458d;

    public a(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("obj cannot be null");
        }
        this.f417455a = obj;
        this.f417456b = str;
    }

    public java.lang.Object a() {
        b();
        java.lang.reflect.Field field = this.f417458d;
        if (field == null) {
            throw new java.lang.NoSuchFieldException();
        }
        try {
            return field.get(this.f417455a);
        } catch (java.lang.ClassCastException unused) {
            throw new java.lang.IllegalArgumentException("unable to cast object");
        }
    }

    public final void b() {
        if (this.f417457c) {
            return;
        }
        this.f417457c = true;
        java.lang.Class<?> cls = this.f417455a.getClass();
        while (cls != null) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField(this.f417456b);
                declaredField.setAccessible(true);
                this.f417458d = declaredField;
                return;
            } catch (java.lang.Exception unused) {
            } finally {
                cls.getSuperclass();
            }
        }
    }
}
