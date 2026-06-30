package ak0;

/* loaded from: classes12.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile ak0.a f5542a;

    /* renamed from: b, reason: collision with root package name */
    public static android.content.Context f5543b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentLinkedQueue f5544c = new java.util.concurrent.ConcurrentLinkedQueue();

    public static android.content.Context a() {
        android.content.Context context = f5543b;
        if (context != null) {
            return context;
        }
        throw new java.lang.IllegalStateException("Helper context is not initialized");
    }

    public static ak0.a b() {
        ak0.a aVar = f5542a;
        if (aVar != null) {
            return aVar;
        }
        throw new java.lang.IllegalStateException("Helper is not initialized");
    }

    public static java.io.File c() {
        java.lang.String a17;
        java.lang.String patchVersionDirectory;
        java.io.File file;
        ak0.x xVar = (ak0.x) b();
        java.lang.Object[] objArr = xVar.f5558i;
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = ak0.x.f5549l;
        if (obj != obj2) {
            return (java.io.File) obj;
        }
        synchronized (objArr) {
            java.lang.Object obj3 = xVar.f5558i[0];
            if (obj3 != obj2) {
                return (java.io.File) obj3;
            }
            java.io.File patchDirectory = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(xVar.f5550a.getApplication());
            if (patchDirectory != null && (a17 = xVar.a()) != null && (patchVersionDirectory = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchVersionDirectory(a17)) != null) {
                file = new java.io.File(patchDirectory, patchVersionDirectory);
                xVar.f5558i[0] = file;
                return file;
            }
            file = null;
            xVar.f5558i[0] = file;
            return file;
        }
    }

    public static java.lang.String d() {
        java.lang.String str;
        ak0.x xVar = (ak0.x) b();
        java.lang.Object[] objArr = xVar.f5557h;
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = ak0.x.f5549l;
        if (obj != obj2) {
            return (java.lang.String) obj;
        }
        synchronized (objArr) {
            java.lang.Object obj3 = xVar.f5557h[0];
            if (obj3 != obj2) {
                str = (java.lang.String) obj3;
            } else {
                str = (java.lang.String) xVar.b().get(com.tencent.tinker.loader.shareutil.ShareConstants.NEW_TINKER_ID);
                xVar.f5557h[0] = str;
            }
        }
        return str;
    }

    public static java.lang.String e() {
        java.lang.String str;
        ak0.x xVar = (ak0.x) b();
        java.lang.Object[] objArr = xVar.f5556g;
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = ak0.x.f5549l;
        if (obj != obj2) {
            return (java.lang.String) obj;
        }
        synchronized (objArr) {
            java.lang.Object obj3 = xVar.f5556g[0];
            if (obj3 != obj2) {
                str = (java.lang.String) obj3;
            } else {
                str = (java.lang.String) xVar.b().get("patch.rev");
                xVar.f5556g[0] = str;
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f() {
        /*
            ak0.a r0 = b()
            ak0.x r0 = (ak0.x) r0
            int[] r1 = r0.f5553d
            r2 = 0
            r3 = r1[r2]
            r4 = 1
            r5 = -1
            if (r3 == r5) goto L13
            if (r3 != r4) goto L3b
            r2 = r4
            goto L3b
        L13:
            monitor-enter(r1)
            int[] r3 = r0.f5553d     // Catch: java.lang.Throwable -> L3c
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L3c
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L1d
            r2 = r4
        L1d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            goto L3b
        L1f:
            com.tencent.tinker.entry.ApplicationLike r3 = r0.f5550a     // Catch: java.lang.Throwable -> L3c
            android.content.Intent r3 = r3.getTinkerResultIntent()     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L28
            goto L30
        L28:
            int r3 = com.tencent.tinker.loader.shareutil.ShareIntentUtil.getIntentReturnCode(r3)     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L30
            r3 = r4
            goto L31
        L30:
            r3 = r2
        L31:
            int[] r0 = r0.f5553d     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L36
            goto L37
        L36:
            r4 = r2
        L37:
            r0[r2] = r4     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            r2 = r3
        L3b:
            return r2
        L3c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ak0.o.f():boolean");
    }

    public static boolean g() {
        ak0.x xVar = (ak0.x) b();
        int[] iArr = xVar.f5551b;
        int i17 = iArr[0];
        int i18 = 1;
        if (i17 != -1) {
            return i17 == 1;
        }
        synchronized (iArr) {
            int i19 = xVar.f5551b[0];
            if (i19 != -1) {
                return i19 == 1;
            }
            com.tencent.tinker.entry.ApplicationLike applicationLike = xVar.f5550a;
            boolean z17 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isTinkerEnabled(applicationLike.getTinkerFlags()) && com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isTinkerEnableWithSharedPreferences(applicationLike.getApplication());
            int[] iArr2 = xVar.f5551b;
            if (!z17) {
                i18 = 0;
            }
            iArr2[0] = i18;
            return z17;
        }
    }
}
