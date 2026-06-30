package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class j2 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f274287b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Class f274288c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Field f274289d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Throwable f274290e;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f274286a = new java.lang.ref.WeakReference(new java.lang.Object());

    /* renamed from: f, reason: collision with root package name */
    public int f274291f = 0;

    public j2(android.app.Activity activity, java.lang.reflect.Field field, java.lang.Throwable th6) {
        this.f274287b = new java.lang.ref.WeakReference(activity);
        this.f274288c = activity.getClass();
        this.f274289d = field;
        this.f274290e = th6;
    }

    public java.lang.String a() {
        java.lang.Object obj = this.f274287b.get();
        java.lang.reflect.Field field = this.f274289d;
        java.lang.Class cls = this.f274288c;
        if (obj == null) {
            if (field == null) {
                return "ui of class [" + cls.getName() + "] which is subclass of\n listener or callback and held by other 'Manager' class is recycled";
            }
            return "ui of class [" + cls.getName() + "] held by\n [" + b() + "] is recycled";
        }
        if (field == null) {
            return "ui of class [" + cls.getName() + "] which is subclass of\n listener or callback and held by other 'Manager' class is leaked.\n Perhaps you should remove any instance of this class from any 'Manager'";
        }
        return "ui of class [" + cls.getName() + "] held by\n [" + b() + "] is leaked.\n Perhaps you should remove the holder from any 'Manager' class when the leaked ui was destroyed.";
    }

    public final java.lang.String b() {
        java.lang.reflect.Field field = this.f274289d;
        if (field == null) {
            return "#null#";
        }
        java.lang.Class<?> declaringClass = field.getDeclaringClass();
        if (!declaringClass.isAnonymousClass()) {
            return "field " + field.getName() + " defined in " + declaringClass.getName();
        }
        java.lang.Object genericSuperclass = declaringClass.getGenericSuperclass();
        java.lang.Object obj = declaringClass;
        if (java.lang.Object.class.equals(genericSuperclass)) {
            obj = declaringClass.getGenericInterfaces()[0];
        } else if (genericSuperclass != null) {
            obj = genericSuperclass;
        }
        return "field " + field.getName() + " define in anonymous class of " + obj.toString().replace('<', '#').replace('>', '#');
    }

    /* renamed from: equals */
    public boolean m77748xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.p314xaae8f345.mm.sdk.p2603x2137b148.j2)) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.j2 j2Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.j2) obj;
        java.lang.Object obj2 = this.f274287b.get();
        java.lang.Object obj3 = j2Var.f274287b.get();
        if (!((obj2 == null && obj3 == null) ? true : (obj2 == null || obj3 == null) ? false : obj2.equals(obj3))) {
            return false;
        }
        java.lang.reflect.Field field = this.f274289d;
        java.lang.reflect.Field field2 = j2Var.f274289d;
        if (!((field == null && field2 == null) ? true : (field == null || field2 == null) ? false : field.equals(field2))) {
            return false;
        }
        java.lang.Throwable th6 = this.f274290e;
        java.lang.Throwable th7 = j2Var.f274290e;
        if (th6 == null && th7 == null) {
            return true;
        }
        if (th6 == null || th7 == null) {
            return false;
        }
        return th6.equals(th7);
    }

    /* renamed from: hashCode */
    public int m77749x8cdac1b() {
        java.lang.Object obj = this.f274287b.get();
        int hashCode = obj != null ? obj.hashCode() : 0;
        java.lang.reflect.Field field = this.f274289d;
        int hashCode2 = field != null ? field.hashCode() : 0;
        java.lang.Throwable th6 = this.f274290e;
        return hashCode + hashCode2 + (th6 != null ? th6.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m77750x9616526c() {
        java.io.PrintWriter printWriter;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(b());
        sb6.append("@");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            printWriter = new java.io.PrintWriter(stringWriter);
            try {
                this.f274290e.printStackTrace(printWriter);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(printWriter);
                sb6.append(stringWriter.toString().replace('\n', '|'));
                return sb6.toString();
            } catch (java.lang.Throwable th6) {
                th = th6;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(printWriter);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            printWriter = null;
        }
    }
}
