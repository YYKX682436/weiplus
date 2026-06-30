package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class x0 extends com.tencent.mm.plugin.appbrand.launching.q0 implements com.tencent.mm.plugin.appbrand.launching.b7 {
    public volatile com.tencent.luggage.sdk.launching.p A;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f85346p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.launching.t8 f85347q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel f85348r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.b1 f85349s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f85350t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f85351u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f85352v;

    /* renamed from: w, reason: collision with root package name */
    public final int f85353w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer f85354x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.HalfScreenConfig f85355y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f85356z;

    public x0(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, java.lang.String str, boolean z17, com.tencent.mm.plugin.appbrand.launching.a1 a1Var, com.tencent.mm.plugin.appbrand.launching.b1 b1Var) {
        super(launchParcel, a1Var);
        this.f85347q = null;
        this.f85349s = null;
        this.A = com.tencent.luggage.sdk.launching.p.LEGACY;
        this.f85348r = launchParcel;
        this.f85350t = str;
        this.f85351u = launchParcel.D;
        this.f85352v = launchParcel.E;
        this.f85353w = launchParcel.F;
        this.f85349s = b1Var;
        this.f85354x = launchParcel.G;
        this.f85346p = z17;
        this.f85355y = launchParcel.H;
        this.f85356z = launchParcel.f84926y1;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreLaunchProcessWC", "<init> username[%s] appId[%s] instanceId[%s] forceUseBackupWxaAttrs[%b]", launchParcel.f84901d, launchParcel.f84902e, str, java.lang.Boolean.valueOf(z17));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair a() {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.x0.a():android.util.Pair");
    }

    public final void b(int i17) {
        try {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(369, i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPreLaunchProcessWC", "reportFallbackIDKey key(%d) get exception %s", java.lang.Integer.valueOf(i17), th6);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.b7
    public boolean d() {
        return !this.f85348r.P.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x08b3, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x08b9, code lost:
    
        if (r4 != 0) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x08bb, code lost:
    
        r3 = r3 | 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x01aa, code lost:
    
        if (android.text.TextUtils.isEmpty(((com.tencent.mm.plugin.appbrand.appcache.o) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.o.class)).z0(r12, 2)) == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0818  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 2621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.x0.run():void");
    }
}
