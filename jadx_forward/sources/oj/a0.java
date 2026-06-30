package oj;

/* loaded from: classes12.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f427199a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f427200b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f427201c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Field f427202d;

    public a0(java.lang.Class cls, java.lang.String str) {
        if (cls == null || str == null || str.length() == 0) {
            throw new java.lang.IllegalArgumentException("Both of invoker and fieldName can not be null or nil.");
        }
        this.f427199a = cls;
        this.f427200b = str;
    }

    public synchronized java.lang.Object a(java.lang.Object obj) {
        return b(false, obj);
    }

    public synchronized java.lang.Object b(boolean z17, java.lang.Object obj) {
        c();
        java.lang.reflect.Field field = this.f427202d;
        if (field != null) {
            try {
                return field.get(obj);
            } catch (java.lang.ClassCastException unused) {
                throw new java.lang.IllegalArgumentException("unable to cast object");
            }
        }
        if (!z17) {
            throw new java.lang.NoSuchFieldException();
        }
        oj.j.f("ReflectFiled", java.lang.String.format("Field %s is no exists.", this.f427200b), new java.lang.Object[0]);
        return null;
    }

    public final synchronized void c() {
        if (this.f427201c) {
            return;
        }
        for (java.lang.Class cls = this.f427199a; cls != null; cls = cls.getSuperclass()) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField(this.f427200b);
                declaredField.setAccessible(true);
                this.f427202d = declaredField;
                break;
            } catch (java.lang.Exception unused) {
            }
        }
        this.f427201c = true;
    }

    public synchronized boolean d(java.lang.Object obj, java.lang.Object obj2, boolean z17) {
        c();
        java.lang.reflect.Field field = this.f427202d;
        if (field != null) {
            field.set(obj, obj2);
            return true;
        }
        if (z17) {
            oj.j.f("ReflectFiled", java.lang.String.format("Field %s is no exists.", this.f427200b), new java.lang.Object[0]);
            return false;
        }
        throw new java.lang.NoSuchFieldException("Method " + this.f427200b + " is not exists.");
    }
}
