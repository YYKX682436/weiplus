package com.p314xaae8f345.mm.ui;

/* loaded from: classes13.dex */
public class ak {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f278672a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f278673b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f278674c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Field f278675d;

    public ak(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("obj cannot be null");
        }
        this.f278672a = obj;
        this.f278673b = str;
    }

    public java.lang.Object a() {
        b();
        java.lang.reflect.Field field = this.f278675d;
        if (field == null) {
            throw new java.lang.NoSuchFieldException();
        }
        try {
            return field.get(this.f278672a);
        } catch (java.lang.ClassCastException unused) {
            throw new java.lang.IllegalArgumentException("unable to cast object");
        }
    }

    public final void b() {
        if (this.f278674c) {
            return;
        }
        this.f278674c = true;
        java.lang.Class<?> cls = this.f278672a.getClass();
        while (cls != null) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField(this.f278673b);
                declaredField.setAccessible(true);
                this.f278675d = declaredField;
                return;
            } catch (java.lang.Exception unused) {
            } finally {
                cls.getSuperclass();
            }
        }
    }
}
