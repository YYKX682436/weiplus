package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class MMApplicationLike extends com.tencent.tinker.entry.DefaultApplicationLike {
    private static final java.lang.String TAG = "MicroMsg.MMApplicationLike";
    private static final com.tencent.mm.app.MMApplicationLike[] sSafeguardInstance = {null};
    private byte _hellAccFlag_;
    private final gj0.b[] mFuses;
    private p65.a mStartupRoutine;

    public MMApplicationLike(android.app.Application application, int i17, boolean z17, long j17, long j18, android.content.Intent intent) {
        super(application, i17, z17, j17, j18, intent);
        this.mStartupRoutine = null;
        this.mFuses = new gj0.b[]{new gj0.d(), new gj0.a(), new gj0.c(), new gj0.e()};
        ak0.a aVar = ak0.o.f5542a;
        ak0.x xVar = new ak0.x(this);
        ak0.s.f5546a = xVar;
        ak0.o.f5542a = xVar;
    }

    private int checkFusesBeforeStartup() {
        gj0.b[] bVarArr;
        if ((android.os.Build.VERSION.SDK_INT >= 28 && android.os.Process.isIsolated()) || (bVarArr = this.mFuses) == null) {
            return 0;
        }
        for (gj0.b bVar : bVarArr) {
            bVar.getClass();
            int a17 = bVar.a(this);
            if (a17 != 0) {
                return a17;
            }
        }
        return 0;
    }

    private p65.a createStartupRoutine() {
        com.tencent.mm.app.v5 a17 = com.tencent.mm.app.v5.a(getApplication());
        if (a17 == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return new p65.i();
        }
        int ordinal = a17.f53870g.ordinal();
        if (ordinal == 0) {
            return new p65.o();
        }
        if (ordinal == 1) {
            return new p65.i();
        }
        if (ordinal == 2) {
            return new p65.s();
        }
        throw new java.lang.IllegalStateException("Should not be here.");
    }

    private void setNewVersionMark() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.io.File file = new java.io.File(lp0.b.e(), "new_nowver_" + bm5.f1.a() + "_.rec");
        java.io.File file2 = new java.io.File(lp0.b.e(), "nowver_recs/new_nowver_" + bm5.f1.a() + "_.rec");
        if (file.exists()) {
            try {
                java.io.File parentFile = file2.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdir();
                }
                file.renameTo(file2);
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.app.p5.d(TAG, th6, "[-] Fail to move old record file, regard as new version.", new java.lang.Object[0]);
                try {
                    file.delete();
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        java.lang.String str = "";
        if (file2.exists()) {
            try {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file2));
                try {
                    str = bufferedReader.readLine().trim();
                    bufferedReader.close();
                } finally {
                }
            } catch (java.lang.Throwable th7) {
                com.tencent.mm.app.p5.d(TAG, th7, "[-] Fail to read previous client version, regard as new version.", new java.lang.Object[0]);
            }
        } else {
            java.io.File parentFile2 = file2.getParentFile();
            if (parentFile2 != null && !parentFile2.exists()) {
                parentFile2.mkdirs();
            }
        }
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193111g;
        if (!str2.equals(str)) {
            com.tencent.mm.sdk.platformtools.x2.f193074d = true;
            try {
                java.io.PrintWriter printWriter = new java.io.PrintWriter(new java.io.FileWriter(file2));
                try {
                    printWriter.print(str2);
                    printWriter.close();
                } finally {
                }
            } catch (java.lang.Throwable th8) {
                com.tencent.mm.app.p5.d(TAG, th8, "[-] Fail to store current client version.", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.app.p5.e(TAG, "[+] setNewVersionMark called, load cost: %s, store cost: %s", java.lang.Long.valueOf(elapsedRealtime2 - elapsedRealtime), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
    }

    private void setPatchRev() {
        try {
            lp0.a.f320254h = ak0.o.e();
            lp0.a.f320257k = ak0.o.d();
            com.tencent.mars.xlog.Log.w(TAG, "application set patch rev:%s patch tinkerId:%s ", lp0.a.f320254h, lp0.a.f320257k);
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.app.p5.d(TAG, th6, "[-] Fail to set patch rev.", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.tinker.entry.ApplicationLike
    public android.content.res.AssetManager getAssets(android.content.res.AssetManager assetManager) {
        return com.tencent.mm.sdk.platformtools.x2.f193075e == null ? assetManager : com.tencent.mm.sdk.platformtools.x2.f193075e.getAssets();
    }

    @Override // com.tencent.tinker.entry.ApplicationLike
    public android.content.res.Resources getResources(android.content.res.Resources resources) {
        return com.tencent.mm.sdk.platformtools.x2.f193075e == null ? resources : com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    @Override // com.tencent.tinker.entry.ApplicationLike
    public int mzNightModeUseOf() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.tinker.entry.DefaultApplicationLike, com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBaseContextAttached(android.content.Context r21) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.MMApplicationLike.onBaseContextAttached(android.content.Context):void");
    }

    @Override // com.tencent.tinker.entry.DefaultApplicationLike, com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p65.a aVar = this.mStartupRoutine;
        if (aVar != null) {
            aVar.getClass();
            fs.g.b(hm0.q.class, new p65.f(aVar, configuration));
        }
    }

    @Override // com.tencent.tinker.entry.DefaultApplicationLike, com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onCreate() {
        java.lang.String packageName = getApplication().getPackageName();
        if (!(!com.tencent.mm.sdk.platformtools.t8.K0(packageName) && packageName.equals(bm5.f1.a()))) {
            android.app.Application application = ak0.b0.f5536a.getApplication();
            java.lang.String packageName2 = application.getPackageName();
            if (!(!com.tencent.mm.sdk.platformtools.t8.K0(packageName2) && packageName2.equals(bm5.f1.a()))) {
                com.tencent.tinker.loader.shareutil.ShareTinkerInternals.setSafeModeCount(application, Integer.MIN_VALUE);
            }
        }
        super.onCreate();
        p65.a aVar = this.mStartupRoutine;
        if (aVar != null) {
            aVar.d();
        }
        com.tencent.mm.app.u6.INSTANCE.h(com.tencent.mm.app.t6.UNTIL_APPLICATION_ON_CREATE_END);
    }

    @Override // com.tencent.tinker.entry.DefaultApplicationLike, com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onLowMemory() {
        super.onLowMemory();
        p65.a aVar = this.mStartupRoutine;
        if (aVar != null) {
            aVar.getClass();
            fs.g.b(hm0.q.class, new p65.g(aVar));
        }
    }

    @Override // com.tencent.tinker.entry.DefaultApplicationLike, com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onTerminate() {
        super.onTerminate();
        p65.a aVar = this.mStartupRoutine;
        if (aVar != null) {
            aVar.getClass();
            fs.g.b(hm0.q.class, new p65.e(aVar));
        }
    }

    @Override // com.tencent.tinker.entry.DefaultApplicationLike, com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onTrimMemory(int i17) {
        super.onTrimMemory(i17);
        p65.a aVar = this.mStartupRoutine;
        if (aVar != null) {
            aVar.getClass();
            fs.g.b(hm0.q.class, new p65.h(aVar, i17));
        }
    }

    public boolean safeguard() {
        com.tencent.mm.app.MMApplicationLike[] mMApplicationLikeArr = sSafeguardInstance;
        synchronized (mMApplicationLikeArr) {
            com.tencent.mm.app.MMApplicationLike mMApplicationLike = mMApplicationLikeArr[0];
            if (mMApplicationLike != this) {
                if (mMApplicationLike != null) {
                    return true;
                }
                mMApplicationLikeArr[0] = this;
            }
            return false;
        }
    }
}
