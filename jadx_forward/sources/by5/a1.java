package by5;

/* loaded from: classes13.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f117943a;

    public static void a() {
        if (!(android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread())) {
            throw new java.lang.IllegalStateException("This operation must be performed on the UI thread.");
        }
    }

    public static void b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.ClipboardManager clipboardManager;
        if (android.text.TextUtils.isEmpty(str2) || (clipboardManager = (android.content.ClipboardManager) context.getSystemService("clipboard")) == null) {
            return;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(str, str2));
    }

    public static boolean c() {
        return org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.l().equalsIgnoreCase(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m156976xe5e58464());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v2 */
    public static java.lang.String d(android.content.Context context, java.lang.String str) {
        java.io.BufferedReader bufferedReader;
        ?? r07 = 0;
        try {
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(context.getAssets().open(str)));
                boolean z17 = true;
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            java.lang.String sb7 = sb6.toString();
                            by5.u.l(bufferedReader);
                            return sb7;
                        }
                        if (z17) {
                            z17 = false;
                        } else {
                            sb6.append('\n');
                        }
                        sb6.append(readLine);
                    } catch (java.io.IOException e17) {
                        e = e17;
                        by5.c4.d("XWebChoreHandler", "loadAssetTextAsString, error:", e);
                        by5.u.l(bufferedReader);
                        return null;
                    }
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                r07 = str;
                by5.u.l(r07);
                throw th;
            }
        } catch (java.io.IOException e18) {
            e = e18;
            bufferedReader = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            by5.u.l(r07);
            throw th;
        }
    }

    public static java.lang.Object e(java.util.concurrent.Callable callable) {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            return callable.call();
        }
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(callable);
        new android.os.Handler(android.os.Looper.getMainLooper()).post(futureTask);
        return futureTask.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #3 {all -> 0x00b6, blocks: (B:25:0x0053, B:27:0x0076), top: B:24:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f() {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: by5.a1.f():void");
    }

    public static void g(android.content.Context context, java.lang.String str, boolean z17) {
        by5.c4.f("XWebChoreHandler", "showAlert, shouldAlert:" + z17 + ", message:" + str);
        try {
            if (z17) {
                new android.app.AlertDialog.Builder(context).setTitle("提示").setMessage(str).setPositiveButton("确定", new by5.z0()).show();
            } else {
                android.widget.Toast.makeText(context, str, 0).show();
            }
        } catch (java.lang.Exception e17) {
            by5.c4.d("XWebChoreHandler", "showAlert, error:", e17);
        }
    }
}
