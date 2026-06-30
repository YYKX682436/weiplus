package yo;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f545574a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f545575b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f545576c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Field f545577d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f545578e;

    public b(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("obj cannot be null");
        }
        this.f545574a = obj;
        this.f545575b = str;
        this.f545578e = str2;
    }

    public java.lang.Object a() {
        b();
        java.lang.reflect.Field field = this.f545577d;
        if (field == null) {
            throw new java.lang.NoSuchFieldException();
        }
        try {
            return field.get(this.f545574a);
        } catch (java.lang.ClassCastException unused) {
            throw new java.lang.IllegalArgumentException("unable to cast object");
        }
    }

    public final void b() {
        if (this.f545576c) {
            return;
        }
        this.f545576c = true;
        java.lang.Class<?> cls = this.f545574a.getClass();
        while (cls != null) {
            try {
                try {
                    java.lang.reflect.Field declaredField = cls.getDeclaredField(this.f545575b);
                    declaredField.setAccessible(true);
                    this.f545577d = declaredField;
                    return;
                } catch (java.lang.Exception unused) {
                    java.lang.String str = this.f545578e;
                    if (str != null) {
                        try {
                            if (!str.equals("")) {
                                java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
                                int length = declaredFields.length;
                                int i17 = 0;
                                while (true) {
                                    if (i17 < length) {
                                        java.lang.reflect.Field field = declaredFields[i17];
                                        if (field.getType().getName().equals(str)) {
                                            field.setAccessible(true);
                                            this.f545577d = field;
                                            break;
                                        }
                                        i17++;
                                    }
                                }
                            }
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                }
            } finally {
                cls.getSuperclass();
            }
        }
    }
}
