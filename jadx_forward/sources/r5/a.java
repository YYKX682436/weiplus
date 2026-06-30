package r5;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final r5.a f474044a = new r5.a();

    /* renamed from: b, reason: collision with root package name */
    public static r5.j f474045b;

    public static final r5.j a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        r5.j jVar = f474045b;
        if (jVar != null) {
            return jVar;
        }
        synchronized (f474044a) {
            r5.j jVar2 = f474045b;
            if (jVar2 != null) {
                return jVar2;
            }
            context.getApplicationContext();
            int i17 = r5.j.f474065a;
            r5.j a17 = new r5.i(context).a();
            f474045b = a17;
            return a17;
        }
    }
}
