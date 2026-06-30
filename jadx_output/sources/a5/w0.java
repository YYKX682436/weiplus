package a5;

/* loaded from: classes13.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f1439a = a5.a0.e("WorkerFactory");

    public final androidx.work.ListenableWorker a(android.content.Context context, java.lang.String str, androidx.work.WorkerParameters workerParameters) {
        java.lang.Class cls;
        java.lang.String str2 = f1439a;
        androidx.work.ListenableWorker listenableWorker = null;
        try {
            cls = java.lang.Class.forName(str).asSubclass(androidx.work.ListenableWorker.class);
        } catch (java.lang.Throwable th6) {
            a5.a0.c().b(str2, "Invalid class: " + str, th6);
            cls = null;
        }
        if (cls != null) {
            try {
                listenableWorker = (androidx.work.ListenableWorker) cls.getDeclaredConstructor(android.content.Context.class, androidx.work.WorkerParameters.class).newInstance(context, workerParameters);
            } catch (java.lang.Throwable th7) {
                a5.a0.c().b(str2, "Could not instantiate " + str, th7);
            }
        }
        if (listenableWorker == null || !listenableWorker.f12461g) {
            return listenableWorker;
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
