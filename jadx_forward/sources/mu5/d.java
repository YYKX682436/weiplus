package mu5;

/* loaded from: classes15.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f412998a;

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f412999b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f413000c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f413001d;

    static {
        p3321xbce91901.jvm.p3324x21ffc6bd.y yVar = new p3321xbce91901.jvm.p3324x21ffc6bd.y(p3321xbce91901.jvm.p3324x21ffc6bd.i0.b(mu5.d.class, "threadpool-coroutines_release"), "field_java_lang_reflect_Field_modifiers", "getField_java_lang_reflect_Field_modifiers()Ljava/lang/reflect/Field;");
        p3321xbce91901.jvm.p3324x21ffc6bd.j0 j0Var = p3321xbce91901.jvm.p3324x21ffc6bd.i0.f391657a;
        f412998a = new f06.v[]{j0Var.f(yVar), j0Var.f(new p3321xbce91901.jvm.p3324x21ffc6bd.y(p3321xbce91901.jvm.p3324x21ffc6bd.i0.b(mu5.d.class, "threadpool-coroutines_release"), "field_kotlinx_coroutines_Dispatchers_Default", "getField_kotlinx_coroutines_Dispatchers_Default()Ljava/lang/reflect/Field;")), j0Var.f(new p3321xbce91901.jvm.p3324x21ffc6bd.y(p3321xbce91901.jvm.p3324x21ffc6bd.i0.b(mu5.d.class, "threadpool-coroutines_release"), "field_kotlinx_coroutines_Dispatchers_IO", "getField_kotlinx_coroutines_Dispatchers_IO()Ljava/lang/reflect/Field;"))};
        f412999b = jz5.h.b(mu5.a.f412995d);
        f413000c = jz5.h.b(mu5.b.f412996d);
        f413001d = jz5.h.b(mu5.c.f412997d);
    }

    public static final boolean a(java.lang.reflect.Field field) {
        try {
            jz5.g gVar = f412999b;
            f06.v vVar = f412998a[0];
            java.lang.reflect.Field field2 = (java.lang.reflect.Field) ((jz5.n) gVar).mo141623x754a37bb();
            if (field2 != null) {
                field2.set(field, java.lang.Integer.valueOf(field.getModifiers() & (-17)));
            }
            return true;
        } catch (java.lang.Throwable th6) {
            b(th6);
            return false;
        }
    }

    public static final java.lang.String b(java.lang.Throwable th6) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        th6.printStackTrace(printWriter);
        printWriter.flush();
        java.lang.String stringWriter2 = stringWriter.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.c(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
