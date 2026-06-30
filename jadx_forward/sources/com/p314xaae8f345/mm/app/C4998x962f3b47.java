package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.MMApplicationLike */
/* loaded from: classes12.dex */
public class C4998x962f3b47 extends com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.C26588x7a8f24a6 {
    private static final java.lang.String TAG = "MicroMsg.MMApplicationLike";

    /* renamed from: sSafeguardInstance */
    private static final com.p314xaae8f345.mm.app.C4998x962f3b47[] f21412x94be23ba = {null};

    /* renamed from: _hellAccFlag_ */
    private byte f21413x7f11beae;

    /* renamed from: mFuses */
    private final gj0.b[] f21414xbe1194c5;

    /* renamed from: mStartupRoutine */
    private p65.a f21415x65bc6954;

    public C4998x962f3b47(android.app.Application application, int i17, boolean z17, long j17, long j18, android.content.Intent intent) {
        super(application, i17, z17, j17, j18, intent);
        this.f21415x65bc6954 = null;
        this.f21414xbe1194c5 = new gj0.b[]{new gj0.d(), new gj0.a(), new gj0.c(), new gj0.e()};
        ak0.a aVar = ak0.o.f87075a;
        ak0.x xVar = new ak0.x(this);
        ak0.s.f87079a = xVar;
        ak0.o.f87075a = xVar;
    }

    /* renamed from: checkFusesBeforeStartup */
    private int m42959x70305514() {
        gj0.b[] bVarArr;
        if ((android.os.Build.VERSION.SDK_INT >= 28 && android.os.Process.isIsolated()) || (bVarArr = this.f21414xbe1194c5) == null) {
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

    /* renamed from: createStartupRoutine */
    private p65.a m42960x145a63a3() {
        com.p314xaae8f345.mm.app.v5 a17 = com.p314xaae8f345.mm.app.v5.a(m104434x367a4c1a());
        if (a17 == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return new p65.i();
        }
        int ordinal = a17.f135403g.ordinal();
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

    /* renamed from: setNewVersionMark */
    private void m42961xfd995b07() {
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
                com.p314xaae8f345.mm.app.p5.d(TAG, th6, "[-] Fail to move old record file, regard as new version.", new java.lang.Object[0]);
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
                com.p314xaae8f345.mm.app.p5.d(TAG, th7, "[-] Fail to read previous client version, regard as new version.", new java.lang.Object[0]);
            }
        } else {
            java.io.File parentFile2 = file2.getParentFile();
            if (parentFile2 != null && !parentFile2.exists()) {
                parentFile2.mkdirs();
            }
        }
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g;
        if (!str2.equals(str)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274607d = true;
            try {
                java.io.PrintWriter printWriter = new java.io.PrintWriter(new java.io.FileWriter(file2));
                try {
                    printWriter.print(str2);
                    printWriter.close();
                } finally {
                }
            } catch (java.lang.Throwable th8) {
                com.p314xaae8f345.mm.app.p5.d(TAG, th8, "[-] Fail to store current client version.", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.app.p5.e(TAG, "[+] setNewVersionMark called, load cost: %s, store cost: %s", java.lang.Long.valueOf(elapsedRealtime2 - elapsedRealtime), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
    }

    /* renamed from: setPatchRev */
    private void m42962xbfe879bd() {
        try {
            lp0.a.f401787h = ak0.o.e();
            lp0.a.f401790k = ak0.o.d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "application set patch rev:%s patch tinkerId:%s ", lp0.a.f401787h, lp0.a.f401790k);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.app.p5.d(TAG, th6, "[-] Fail to set patch rev.", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7
    /* renamed from: getAssets */
    public android.content.res.AssetManager mo42963x11279679(android.content.res.AssetManager assetManager) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e == null ? assetManager : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getAssets();
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7
    /* renamed from: getResources */
    public android.content.res.Resources mo42964x893a2f6f(android.content.res.Resources resources) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e == null ? resources : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7
    /* renamed from: mzNightModeUseOf */
    public int mo42965xc80aabb0() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.C26588x7a8f24a6, com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7, com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.InterfaceC26586xd1743ffa
    /* renamed from: onBaseContextAttached */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo42966xb9ef6503(android.content.Context r21) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.app.C4998x962f3b47.mo42966xb9ef6503(android.content.Context):void");
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.C26588x7a8f24a6, com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7, com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.InterfaceC26586xd1743ffa
    /* renamed from: onConfigurationChanged */
    public void mo42967x50e1c15d(android.content.res.Configuration configuration) {
        super.mo42967x50e1c15d(configuration);
        p65.a aVar = this.f21415x65bc6954;
        if (aVar != null) {
            aVar.getClass();
            fs.g.b(hm0.q.class, new p65.f(aVar, configuration));
        }
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.C26588x7a8f24a6, com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7, com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.InterfaceC26586xd1743ffa
    /* renamed from: onCreate */
    public void mo42968x3e5a77bb() {
        java.lang.String packageName = m104434x367a4c1a().getPackageName();
        if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(packageName) && packageName.equals(bm5.f1.a()))) {
            android.app.Application m104434x367a4c1a = ak0.b0.f87069a.m104434x367a4c1a();
            java.lang.String packageName2 = m104434x367a4c1a.getPackageName();
            if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(packageName2) && packageName2.equals(bm5.f1.a()))) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104760x10df66dd(m104434x367a4c1a, Integer.MIN_VALUE);
            }
        }
        super.mo42968x3e5a77bb();
        p65.a aVar = this.f21415x65bc6954;
        if (aVar != null) {
            aVar.d();
        }
        com.p314xaae8f345.mm.app.u6.INSTANCE.h(com.p314xaae8f345.mm.app.t6.UNTIL_APPLICATION_ON_CREATE_END);
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.C26588x7a8f24a6, com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7, com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.InterfaceC26586xd1743ffa
    /* renamed from: onLowMemory */
    public void mo42969xb5d8ba56() {
        super.mo42969xb5d8ba56();
        p65.a aVar = this.f21415x65bc6954;
        if (aVar != null) {
            aVar.getClass();
            fs.g.b(hm0.q.class, new p65.g(aVar));
        }
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.C26588x7a8f24a6, com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7, com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.InterfaceC26586xd1743ffa
    /* renamed from: onTerminate */
    public void mo42970x7784fb42() {
        super.mo42970x7784fb42();
        p65.a aVar = this.f21415x65bc6954;
        if (aVar != null) {
            aVar.getClass();
            fs.g.b(hm0.q.class, new p65.e(aVar));
        }
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.C26588x7a8f24a6, com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7, com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.InterfaceC26586xd1743ffa
    /* renamed from: onTrimMemory */
    public void mo42971x29685b02(int i17) {
        super.mo42971x29685b02(i17);
        p65.a aVar = this.f21415x65bc6954;
        if (aVar != null) {
            aVar.getClass();
            fs.g.b(hm0.q.class, new p65.h(aVar, i17));
        }
    }

    /* renamed from: safeguard */
    public boolean m42972xbd070f38() {
        com.p314xaae8f345.mm.app.C4998x962f3b47[] c4998x962f3b47Arr = f21412x94be23ba;
        synchronized (c4998x962f3b47Arr) {
            com.p314xaae8f345.mm.app.C4998x962f3b47 c4998x962f3b47 = c4998x962f3b47Arr[0];
            if (c4998x962f3b47 != this) {
                if (c4998x962f3b47 != null) {
                    return true;
                }
                c4998x962f3b47Arr[0] = this;
            }
            return false;
        }
    }
}
