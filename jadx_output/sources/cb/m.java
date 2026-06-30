package cb;

/* loaded from: classes13.dex */
public final class m {

    /* renamed from: g, reason: collision with root package name */
    public static int f40146g;

    /* renamed from: h, reason: collision with root package name */
    public static android.app.PendingIntent f40147h;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f40149b;

    /* renamed from: c, reason: collision with root package name */
    public final cb.f f40150c;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Messenger f40152e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.firebase.iid.zzi f40153f;

    /* renamed from: a, reason: collision with root package name */
    public final x.n f40148a = new x.n();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Messenger f40151d = new android.os.Messenger(new cb.n(this, android.os.Looper.getMainLooper()));

    public m(android.content.Context context, cb.f fVar) {
        this.f40149b = context;
        this.f40150c = fVar;
    }

    public final void a(java.lang.String str, android.os.Bundle bundle) {
        synchronized (this.f40148a) {
            com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) this.f40148a.remove(str);
            if (taskCompletionSource != null) {
                taskCompletionSource.setResult(bundle);
                return;
            }
            java.lang.String valueOf = java.lang.String.valueOf(str);
            if (valueOf.length() != 0) {
                "Missing callback for ".concat(valueOf);
            }
        }
    }

    public final android.os.Bundle b(android.os.Bundle bundle) {
        int i17;
        cb.j0 j0Var;
        int i18;
        android.content.pm.PackageInfo c17;
        cb.f fVar = this.f40150c;
        synchronized (fVar) {
            if (fVar.f40123d == 0 && (c17 = fVar.c("com.google.android.gms")) != null) {
                fVar.f40123d = c17.versionCode;
            }
            i17 = fVar.f40123d;
        }
        if (i17 < 12000000) {
            android.os.Bundle c18 = c(bundle);
            if (c18 == null || !c18.containsKey("google.messenger")) {
                return c18;
            }
            android.os.Bundle c19 = c(bundle);
            if (c19 == null || !c19.containsKey("google.messenger")) {
                return c19;
            }
            return null;
        }
        android.content.Context context = this.f40149b;
        synchronized (cb.j0.class) {
            if (cb.j0.f40131e == null) {
                cb.j0.f40131e = new cb.j0(context, java.util.concurrent.Executors.newSingleThreadScheduledExecutor());
            }
            j0Var = cb.j0.f40131e;
        }
        synchronized (j0Var) {
            i18 = j0Var.f40135d;
            j0Var.f40135d = i18 + 1;
        }
        try {
            return (android.os.Bundle) com.google.android.gms.tasks.Tasks.await(j0Var.a(new cb.e(i18, 1, bundle)));
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                new java.lang.StringBuilder(java.lang.String.valueOf(e17).length() + 22);
            }
            if (!(e17.getCause() instanceof cb.d) || ((cb.d) e17.getCause()).f40115d != 4) {
                return null;
            }
            android.os.Bundle c27 = c(bundle);
            if (c27 == null || !c27.containsKey("google.messenger")) {
                return c27;
            }
            android.os.Bundle c28 = c(bundle);
            if (c28 == null || !c28.containsKey("google.messenger")) {
                return c28;
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        if (r7.f40153f != null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.tasks.TaskCompletionSource, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.TimeUnit] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.Intent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00dc -> B:34:0x00e7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x00e2 -> B:34:0x00e7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle c(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.m.c(android.os.Bundle):android.os.Bundle");
    }
}
