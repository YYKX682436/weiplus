package cl1;

/* loaded from: classes8.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo f42888a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42889b;

    public n0(int i17) {
        this.f42889b = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(cl1.n0 r6) {
        /*
            r5 = this;
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r0 = r5.f42888a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r2 = r6.f42888a
            if (r2 != 0) goto Lb
            return r1
        Lb:
            java.lang.String r0 = r0.f76361d
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 == 0) goto L14
            return r1
        L14:
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r0 = r6.f42888a
            java.lang.String r0 = r0.f76361d
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 == 0) goto L1f
            return r1
        L1f:
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r6 = r6.f42888a
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r0 = r5.f42888a
            r6.getClass()
            r2 = 1
            if (r0 != 0) goto L2b
        L29:
            r6 = r1
            goto L43
        L2b:
            java.lang.String r3 = r0.f76361d
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r4 == 0) goto L34
            goto L29
        L34:
            java.lang.String r4 = r6.f76361d
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L29
            int r0 = r0.f76363f
            int r6 = r6.f76363f
            if (r0 != r6) goto L29
            r6 = r2
        L43:
            if (r6 == 0) goto L46
            return r2
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.n0.a(cl1.n0):boolean");
    }

    public boolean b() {
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = this.f42888a;
        return localUsageInfo != null && (localUsageInfo instanceof com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) && ((com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) localUsageInfo).f76358z == 4;
    }

    public n0(com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo, int i17) {
        this.f42888a = localUsageInfo;
        this.f42889b = i17;
    }

    public n0(cl1.n0 n0Var) {
        this.f42888a = n0Var.f42888a;
        this.f42889b = n0Var.f42889b;
    }
}
