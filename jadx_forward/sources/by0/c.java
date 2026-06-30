package by0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final by0.c f117856a = new by0.c();

    public final android.app.Activity a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<this>");
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (!(context instanceof android.content.ContextWrapper)) {
            return null;
        }
        android.content.Context baseContext = ((android.content.ContextWrapper) context).getBaseContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(baseContext, "getBaseContext(...)");
        return a(baseContext);
    }
}
