package ds;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f324312a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f324313b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.reflect.Field f324314c;

    public c(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("obj cannot be null");
        }
        this.f324312a = obj;
    }

    public java.lang.Object a() {
        b();
        java.lang.reflect.Field field = this.f324314c;
        if (field == null) {
            throw new java.lang.NoSuchFieldException();
        }
        try {
            return field.get(this.f324312a);
        } catch (java.lang.ClassCastException unused) {
            throw new java.lang.IllegalArgumentException("unable to cast object");
        }
    }

    public final void b() {
        if (this.f324313b) {
            return;
        }
        this.f324313b = true;
        java.lang.Class<?> cls = this.f324312a.getClass();
        while (cls != null) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField("mContentRoot");
                declaredField.setAccessible(true);
                this.f324314c = declaredField;
                return;
            } catch (java.lang.Exception unused) {
            } finally {
                cls.getSuperclass();
            }
        }
    }
}
