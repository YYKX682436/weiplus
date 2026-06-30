package by0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final by0.c f36323a = new by0.c();

    public final android.app.Activity a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "<this>");
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (!(context instanceof android.content.ContextWrapper)) {
            return null;
        }
        android.content.Context baseContext = ((android.content.ContextWrapper) context).getBaseContext();
        kotlin.jvm.internal.o.f(baseContext, "getBaseContext(...)");
        return a(baseContext);
    }
}
