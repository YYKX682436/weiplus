package sz1;

/* loaded from: classes13.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f495473a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f495474b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("DataReportService#ThreadUtils#ASYNC_HANDLER", new sz1.h());

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f495475c = new java.util.ArrayList();

    public static void a(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            runnable.run();
        } else {
            c(runnable);
        }
    }

    public static void b(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        f495474b.mo50293x3498a0(runnable);
    }

    public static void c(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        f495473a.mo50293x3498a0(runnable);
    }

    public static void d(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return;
        }
        f495473a.mo50297x7c4d7ca2(runnable, j17);
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 e(com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 k3Var) {
        if (k3Var != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) f495475c;
            if (!arrayList.contains(k3Var)) {
                arrayList.add(k3Var);
            }
        }
        return f495474b;
    }
}
