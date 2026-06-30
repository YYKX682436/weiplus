package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class j8 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.r8 f84700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f84701e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(com.tencent.mm.plugin.appbrand.launching.r8 r8Var, java.util.concurrent.CountDownLatch countDownLatch) {
        super(2);
        this.f84700d = r8Var;
        this.f84701e = countDownLatch;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009c  */
    @Override // yz5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "waitForPkgList onError("
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r8)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible"
            com.tencent.mars.xlog.Log.e(r1, r0)
            com.tencent.mm.plugin.appbrand.launching.r8 r0 = r6.f84700d
            int r1 = r0.f85107e
            boolean r1 = com.tencent.mm.plugin.appbrand.appcache.g0.a(r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3f
            com.tencent.mm.plugin.appbrand.launching.a6 r1 = com.tencent.mm.plugin.appbrand.launching.a6.f84487e
            r1 = 111(0x6f, float:1.56E-43)
            if (r1 != r7) goto L3f
            r0.a()
            goto L84
        L3f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r4 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            r5 = 2131755829(0x7f100335, float:1.9142548E38)
            java.lang.String r4 = com.tencent.mm.plugin.appbrand.utils.s0.b(r5, r4)
            r1.append(r4)
            if (r8 == 0) goto L66
            int r4 = r8.length()
            if (r4 != 0) goto L64
            goto L66
        L64:
            r4 = r2
            goto L67
        L66:
            r4 = r3
        L67:
            if (r4 == 0) goto L6c
            java.lang.String r8 = ""
            goto L7a
        L6c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "\n"
            r4.<init>(r5)
            r4.append(r8)
            java.lang.String r8 = r4.toString()
        L7a:
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.b(r8)
        L84:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r8 = r0.f85111i
            r1 = 120(0x78, float:1.68E-43)
            if (r7 > r1) goto L8f
            r1 = 101(0x65, float:1.42E-43)
            if (r7 < r1) goto L8f
            goto L90
        L8f:
            r3 = r2
        L90:
            r1 = 0
            iz5.a.g(r1, r3)
            int r1 = r0.f85107e
            boolean r3 = com.tencent.mm.plugin.appbrand.appcache.g0.b(r1)
            if (r3 == 0) goto L9e
            int r2 = r8.f77444d
        L9e:
            java.lang.String r8 = r0.f85106d
            int r0 = r0.f85108f
            com.tencent.mm.plugin.appbrand.c6.b(r7, r8, r2, r1, r0)
            java.util.concurrent.CountDownLatch r7 = r6.f84701e
            r7.countDown()
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.j8.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
