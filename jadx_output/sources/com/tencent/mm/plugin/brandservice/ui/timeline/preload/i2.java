package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class i2 extends xs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.o97 f94314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nu4.a f94315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94316c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f94317d;

    public i2(r45.o97 o97Var, nu4.a aVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        this.f94314a = o97Var;
        this.f94315b = aVar;
        this.f94316c = str;
        this.f94317d = continuation;
    }

    @Override // xs1.b
    public boolean a(java.lang.Object obj, int i17, java.util.HashMap headers) {
        com.tencent.mm.network.j2 connection = (com.tencent.mm.network.j2) obj;
        kotlin.jvm.internal.o.g(connection, "connection");
        kotlin.jvm.internal.o.g(headers, "headers");
        com.tencent.mm.plugin.brandservice.webprefetcher.debug.b.c(headers, "fetchManifest");
        return i17 == 200;
    }

    @Override // xs1.c, xs1.b
    public void b(java.lang.Object obj, xs1.e downloadResult) {
        kotlin.jvm.internal.o.g(downloadResult, "downloadResult");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcher", "fetchManifest: " + this.f94315b.f340233a.f379226d + '#' + this.f94316c + ", succ:" + downloadResult.f456301a + ", path:" + this.f94315b.f340234b.f380230d + ", url:" + this.f94315b.f340234b.f380231e);
        if (!downloadResult.f456301a) {
            kotlin.coroutines.Continuation continuation = this.f94317d;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
            return;
        }
        java.lang.String Domain = this.f94315b.f340233a.f379226d;
        kotlin.jvm.internal.o.f(Domain, "Domain");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.f94205a;
        synchronized (com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.class) {
            java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
            kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
            com.tencent.mm.ipcinvoker.f.a(PROCESS_MAIN, new com.tencent.mm.ipcinvoker.type.IPCString(Domain), com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.f94187d, null);
            if (!com.tencent.mm.pluginsdk.model.g4.b()) {
                java.lang.String PROCESS_TOOLS = com.tencent.mm.sdk.platformtools.w9.f193055c;
                kotlin.jvm.internal.o.f(PROCESS_TOOLS, "PROCESS_TOOLS");
                com.tencent.mm.ipcinvoker.f.a(PROCESS_TOOLS, new com.tencent.mm.ipcinvoker.type.IPCString(Domain), com.tencent.mm.plugin.brandservice.ui.timeline.preload.c.f94196d, null);
            }
        }
        kotlin.coroutines.Continuation continuation2 = this.f94317d;
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        continuation2.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        if (com.tencent.mm.plugin.webview.core.t1.a().getInt("debugCookie", -1) == 1) goto L14;
     */
    @Override // xs1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.Object r13) {
        /*
            r12 = this;
            com.tencent.mm.network.j2 r13 = (com.tencent.mm.network.j2) r13
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.o.g(r13, r0)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 r0 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94445a
            r45.o97 r1 = r12.f94314a
            java.lang.String r1 = r1.f382054d
            java.lang.String r2 = "url"
            kotlin.jvm.internal.o.f(r1, r2)
            java.util.List r3 = r0.g(r1)
            if (r3 == 0) goto L28
            java.lang.String r4 = "; "
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 62
            r11 = 0
            java.lang.String r0 = kz5.n0.g0(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 == 0) goto L3b
            java.lang.String r1 = "fetchManifest request header cookie: "
            java.lang.String r1 = r1.concat(r0)
            java.lang.String r2 = "MicroMsg.WebPrefetcher"
            com.tencent.mars.xlog.Log.i(r2, r1)
            java.lang.String r1 = "cookie"
            r13.h(r1, r0)
        L3b:
            com.tencent.mm.plugin.webview.core.q1 r0 = com.tencent.mm.plugin.webview.core.s1.f181972a
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.z.f193105a
            boolean r0 = r0.a()
            if (r0 == 0) goto L54
            com.tencent.mm.sdk.platformtools.o4 r0 = com.tencent.mm.plugin.webview.core.t1.a()
            java.lang.String r1 = "debugCookie"
            r2 = -1
            int r0 = r0.getInt(r1, r2)
            r1 = 1
            if (r0 != r1) goto L54
            goto L55
        L54:
            r1 = 0
        L55:
            if (r1 == 0) goto L60
            java.lang.String r0 = com.tencent.mm.plugin.brandservice.webprefetcher.debug.b.b()
            java.lang.String r1 = "Cookie"
            r13.h(r1, r0)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.ui.timeline.preload.i2.c(java.lang.Object):void");
    }
}
