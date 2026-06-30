package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class p2 implements com.tencent.mm.plugin.appbrand.service.c5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.r2 f84885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f84886b;

    public p2(com.tencent.mm.plugin.appbrand.launching.r2 r2Var, kotlinx.coroutines.q qVar) {
        this.f84885a = r2Var;
        this.f84886b = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        if (r2.isEmpty() == true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "suspendedAwaitFileCleanCompleted, appId:"
            r0.<init>(r1)
            com.tencent.mm.plugin.appbrand.launching.r2 r1 = r4.f84885a
            java.lang.String r2 = r1.f85097a
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.AppLaunchFileCleanBlockingRunner"
            com.tencent.mars.xlog.Log.i(r2, r0)
            kotlinx.coroutines.q r0 = r4.f84886b
            r2 = r0
            kotlinx.coroutines.r r2 = (kotlinx.coroutines.r) r2
            boolean r2 = r2.n()
            if (r2 == 0) goto L2e
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            jz5.f0 r2 = jz5.f0.f302826a
            java.lang.Object r2 = kotlin.Result.m521constructorimpl(r2)
            r0.resumeWith(r2)
        L2e:
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.d5> r0 = com.tencent.mm.plugin.appbrand.service.d5.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.plugin.appbrand.service.d5 r0 = (com.tencent.mm.plugin.appbrand.service.d5) r0
            java.lang.String r1 = r1.f85097a
            com.tencent.mm.plugin.appbrand.appcache.e r0 = (com.tencent.mm.plugin.appbrand.appcache.e) r0
            r0.getClass()
            java.lang.String r2 = "appId"
            kotlin.jvm.internal.o.g(r1, r2)
            java.util.concurrent.ConcurrentHashMap r0 = r0.f75499e
            java.lang.Object r2 = r0.get(r1)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L4f
            r2.remove(r4)
        L4f:
            java.lang.Object r2 = r0.get(r1)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L5f
            boolean r2 = r2.isEmpty()
            r3 = 1
            if (r2 != r3) goto L5f
            goto L60
        L5f:
            r3 = 0
        L60:
            if (r3 == 0) goto L65
            r0.remove(r1)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.p2.a():void");
    }
}
