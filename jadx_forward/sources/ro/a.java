package ro;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f479505a;

    public a(java.lang.Object obj, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f479505a = obj;
    }

    public final java.lang.String a() {
        java.lang.Object obj = this.f479505a;
        if (obj == null || android.os.Build.VERSION.SDK_INT < 35) {
            return null;
        }
        try {
            java.lang.reflect.Method declaredMethod = obj.getClass().getDeclaredMethod("dump", java.io.PrintWriter.class, java.lang.String.class, java.lang.String.class, android.icu.text.SimpleDateFormat.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.setAccessible(true);
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            declaredMethod.invoke(obj, new java.io.PrintWriter(stringWriter), "", "", new android.icu.text.SimpleDateFormat());
            return stringWriter.toString();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ApplicationStartInfoCompat", "reflect dump fail: " + th6);
            return null;
        }
    }

    public final java.lang.String b() {
        java.lang.Object obj = this.f479505a;
        if (obj == null) {
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.app.ApplicationStartInfo");
            return ((android.app.ApplicationStartInfo) obj).getProcessName();
        }
        try {
            return (java.lang.String) obj.getClass().getDeclaredMethod("getProcessName", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ApplicationStartInfoCompat", "reflect getProcessName err: " + th6.getMessage());
            return null;
        }
    }
}
