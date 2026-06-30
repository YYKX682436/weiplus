package a5;

/* loaded from: classes13.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f82972a = a5.a0.e("WorkerFactory");

    public final p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f a(android.content.Context context, java.lang.String str, p012xc85e97e9.p125x37c711.C1264xcd547028 c1264xcd547028) {
        java.lang.Class cls;
        java.lang.String str2 = f82972a;
        p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f abstractC1260xfe49ee9f = null;
        try {
            cls = java.lang.Class.forName(str).asSubclass(p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f.class);
        } catch (java.lang.Throwable th6) {
            a5.a0.c().b(str2, "Invalid class: " + str, th6);
            cls = null;
        }
        if (cls != null) {
            try {
                abstractC1260xfe49ee9f = (p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f) cls.getDeclaredConstructor(android.content.Context.class, p012xc85e97e9.p125x37c711.C1264xcd547028.class).newInstance(context, c1264xcd547028);
            } catch (java.lang.Throwable th7) {
                a5.a0.c().b(str2, "Could not instantiate " + str, th7);
            }
        }
        if (abstractC1260xfe49ee9f == null || !abstractC1260xfe49ee9f.f93994g) {
            return abstractC1260xfe49ee9f;
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
