package xi;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f536184a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f536185b;

    public e(android.content.Context context) {
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f536184a = context;
        this.f536185b = handler;
    }

    public java.io.File a(boolean z17) {
        java.io.File file;
        try {
            file = xi.k.f536194e.f("", false);
        } catch (java.io.FileNotFoundException e17) {
            oj.j.d("Matrix.AndroidHeapDumper", e17, "", new java.lang.Object[0]);
            file = null;
        }
        if (file == null) {
            oj.j.f("Matrix.AndroidHeapDumper", "hprof file is null.", new java.lang.Object[0]);
            return null;
        }
        java.io.File parentFile = file.getParentFile();
        if (parentFile == null) {
            oj.j.f("Matrix.AndroidHeapDumper", "hprof file path: %s does not indicate a full path.", file.getAbsolutePath());
            return null;
        }
        if (!parentFile.canWrite()) {
            oj.j.f("Matrix.AndroidHeapDumper", "hprof file path: %s cannot be written.", file.getAbsolutePath());
            return null;
        }
        if (parentFile.getFreeSpace() < 1.610612736E9d) {
            oj.j.f("Matrix.AndroidHeapDumper", "hprof file path: %s free space not enough", parentFile.getAbsolutePath());
            return null;
        }
        if (!z17) {
            try {
                android.os.Debug.dumpHprofData(file.getAbsolutePath());
                return file;
            } catch (java.lang.Exception e18) {
                oj.j.d("Matrix.AndroidHeapDumper", e18, "failed to dump heap into file: %s.", file.getAbsolutePath());
                return null;
            }
        }
        bj.a aVar = new bj.a();
        xi.b bVar = new xi.b(this, aVar);
        android.os.Handler handler = this.f536185b;
        handler.post(bVar);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        java.util.concurrent.CountDownLatch countDownLatch = aVar.f102634b;
        try {
            if (!countDownLatch.await(5L, timeUnit)) {
                oj.j.f("Matrix.AndroidHeapDumper", "give up dumping heap, waiting for toast too long.", new java.lang.Object[0]);
                return null;
            }
            try {
                android.os.Debug.dumpHprofData(file.getAbsolutePath());
                if (countDownLatch.getCount() > 0) {
                    throw new java.lang.IllegalStateException("Call wait() and check its result");
                }
                handler.post(new xi.c(this, (android.widget.Toast) aVar.f102633a.get()));
                return file;
            } catch (java.lang.Exception e19) {
                oj.j.d("Matrix.AndroidHeapDumper", e19, "failed to dump heap into file: %s.", file.getAbsolutePath());
                return null;
            }
        } catch (java.lang.InterruptedException e27) {
            throw new java.lang.RuntimeException("Did not expect thread to be interrupted", e27);
        }
    }
}
