package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public final class m7 {

    /* renamed from: a, reason: collision with root package name */
    public static final r26.t f274389a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f274390b;

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.g7 f274391c;

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.e7 f274392d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f274393e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f274394f;

    /* renamed from: g, reason: collision with root package name */
    public static final android.os.Handler f274395g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.i7 f274396h;

    static {
        java.lang.String uri = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
        f274389a = new r26.t(uri);
        f274390b = android.os.Build.VERSION.SDK_INT >= 29 ? new java.lang.String[]{"_display_name", "_data", "date_added", "is_pending"} : new java.lang.String[]{"_display_name", "_data", "date_added"};
        f274393e = new java.util.concurrent.CopyOnWriteArrayList();
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        f274395g = handler;
        f274396h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i7(handler);
    }

    public static final void a(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.j7 j7Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.j7(str, j17, z17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            j7Var.run();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "invokeAllCallbacks, not in main thread");
            ((ku5.t0) ku5.t0.f394148d).B(j7Var);
        }
    }

    public static final void b(android.content.Context context, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 callback) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenShotUtil", "register, failed: unable to get process name");
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f274393e;
        if (!(copyOnWriteArrayList instanceof java.util.Collection) || !copyOnWriteArrayList.isEmpty()) {
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (((java.lang.ref.WeakReference) it.next()).get() == callback) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "register, failed: callback already registered");
            return;
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(callback);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.e7 e7Var = f274392d;
            if (e7Var != null) {
                ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.p) e7Var).a(a17, true);
            }
        } else if (f274393e.isEmpty()) {
            try {
                context.getContentResolver().registerContentObserver(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, f274396h);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "registerContentObserver");
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScreenShotUtil", th6, "registerContentObserver failed", new java.lang.Object[0]);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "registerContentObserver");
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = f274393e;
        copyOnWriteArrayList2.add(weakReference);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "register, callbackListSize: " + copyOnWriteArrayList2.size());
        if (!(context instanceof p012xc85e97e9.p093xedfae76a.y)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotUtil", "register, warning: context is not a LifecycleOwner");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.l7 l7Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.l7(context, weakReference, a17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            l7Var.run();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "register, addLifecycleObserver not in main thread");
            ((ku5.t0) ku5.t0.f394148d).B(l7Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap c(android.app.Activity r20) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.c(android.app.Activity):android.graphics.Bitmap");
    }

    public static final void d(android.content.Context context, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenShotUtil", "register, failed: unable to get process name");
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f274393e;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 f7Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.f7) weakReference.get();
            if (f7Var == null || f7Var == callback) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.e7 e7Var = f274392d;
            if (e7Var != null) {
                ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.p) e7Var).a(a17, false);
            }
        } else if (copyOnWriteArrayList.isEmpty()) {
            try {
                context.getContentResolver().unregisterContentObserver(f274396h);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "unregisterContentObserver");
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScreenShotUtil", th6, "unregisterContentObserver failed", new java.lang.Object[0]);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "unregisterContentObserver");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "unregister, callbackListSize: " + copyOnWriteArrayList.size());
    }
}
