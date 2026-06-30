package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f94432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94433f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String str, int i17, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f94431d = str;
        this.f94432e = i17;
        this.f94433f = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.brandservice.ui.timeline.preload.t(this.f94431d, this.f94432e, this.f94433f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.brandservice.ui.timeline.preload.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[Catch: Exception -> 0x00d1, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d1, blocks: (B:10:0x0020, B:12:0x0051, B:15:0x005a, B:16:0x006c, B:24:0x007b, B:25:0x007f, B:26:0x0085, B:28:0x0095, B:30:0x00a6, B:31:0x00b6, B:33:0x00bc, B:41:0x009c, B:42:0x0061), top: B:9:0x0020, inners: #0 }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r0 = r9.f94431d
            jz5.f0 r1 = jz5.f0.f302826a
            java.lang.String r2 = "MicroMsg.BizVideoPreloadLogic"
            pz5.a r3 = pz5.a.f359186d
            kotlin.ResultKt.throwOnFailure(r10)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.r r10 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.r.f94422d
            kotlin.jvm.internal.h0 r3 = new kotlin.jvm.internal.h0
            r3.<init>()
            java.lang.Object r10 = r10.invoke()     // Catch: java.lang.Exception -> Ld2
            r3.f310123d = r10     // Catch: java.lang.Exception -> Ld2
            if (r10 != 0) goto L20
            java.lang.String r10 = "[TRACE_VIDEO_PRELOAD] preloadVideo tmplParams not exist"
            com.tencent.mars.xlog.Log.i(r2, r10)     // Catch: java.lang.Exception -> Ld2
            return r1
        L20:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.s r4 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.s     // Catch: java.lang.Exception -> Ld1
            r4.<init>(r3)     // Catch: java.lang.Exception -> Ld1
            java.lang.Object r10 = r4.invoke(r0, r10)     // Catch: java.lang.Exception -> Ld1
            nu4.a r10 = (nu4.a) r10     // Catch: java.lang.Exception -> Ld1
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.u r4 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.u.f94451a     // Catch: java.lang.Exception -> Ld1
            java.util.LinkedList r5 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.u.f94454d     // Catch: java.lang.Exception -> Ld1
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k r6 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.k     // Catch: java.lang.Exception -> Ld1
            int r7 = r9.f94432e     // Catch: java.lang.Exception -> Ld1
            java.lang.String r8 = r9.f94433f     // Catch: java.lang.Exception -> Ld1
            r6.<init>(r0, r7, r8, r10)     // Catch: java.lang.Exception -> Ld1
            r5.add(r6)     // Catch: java.lang.Exception -> Ld1
            r45.m83 r0 = r10.f340234b     // Catch: java.lang.Exception -> Ld1
            java.lang.String r0 = r0.f380231e     // Catch: java.lang.Exception -> Ld1
            java.lang.String r5 = "ManifestUrl"
            kotlin.jvm.internal.o.f(r0, r5)     // Catch: java.lang.Exception -> Ld1
            java.lang.String r0 = nu4.d0.a(r0)     // Catch: java.lang.Exception -> Ld1
            java.lang.String r5 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.u.f94456f     // Catch: java.lang.Exception -> Ld1
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r5)     // Catch: java.lang.Exception -> Ld1
            r6 = 1
            if (r5 != 0) goto L61
            java.lang.String r5 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.u.f94456f     // Catch: java.lang.Exception -> Ld1
            boolean r5 = kotlin.jvm.internal.o.b(r5, r0)     // Catch: java.lang.Exception -> Ld1
            if (r5 != 0) goto L5a
            goto L61
        L5a:
            int r0 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.u.f94455e     // Catch: java.lang.Exception -> Ld1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Ld1
            goto L6c
        L61:
            java.lang.String r5 = "<set-?>"
            kotlin.jvm.internal.o.g(r0, r5)     // Catch: java.lang.Exception -> Ld1
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.u.f94456f = r0     // Catch: java.lang.Exception -> Ld1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> Ld1
        L6c:
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> Ld1
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.u.f94455e = r0     // Catch: java.lang.Exception -> Ld1
            r5 = 2
            if (r0 == r6) goto L85
            if (r0 == r5) goto L7f
            r10 = 3
            if (r0 == r10) goto L7b
            goto Lc8
        L7b:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.u.a(r4)     // Catch: java.lang.Exception -> Ld1
            goto Lc8
        L7f:
            java.lang.String r10 = "[TRACE_VIDEO_PRELOAD] preloadVideo jsStatus.INIT_ING"
            com.tencent.mars.xlog.Log.i(r2, r10)     // Catch: java.lang.Exception -> Ld1
            goto Lc8
        L85:
            java.lang.String r0 = "[TRACE_VIDEO_PRELOAD] preloadVideo JsStatus.SHOULD_INIT"
            com.tencent.mars.xlog.Log.i(r2, r0)     // Catch: java.lang.Exception -> Ld1
            java.lang.Object r0 = r3.f310123d     // Catch: java.lang.Exception -> Ld1
            r45.wm6 r0 = (r45.wm6) r0     // Catch: java.lang.Exception -> Ld1
            java.lang.String r0 = r0.f389295g     // Catch: java.lang.Exception -> Ld1
            java.lang.String r4 = "initFilePath"
            kotlin.jvm.internal.o.f(r0, r4)     // Catch: java.lang.Exception -> Ld1
            java.lang.String r0 = com.tencent.mm.vfs.w6.M(r0)     // Catch: java.io.IOException -> L9a java.lang.Exception -> Ld1
            goto La4
        L9a:
            r0 = move-exception
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> Ld1
            java.lang.String r7 = ""
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r0, r7, r4)     // Catch: java.lang.Exception -> Ld1
            r0 = r7
        La4:
            if (r0 == 0) goto Lc8
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.u.f94455e = r5     // Catch: java.lang.Exception -> Ld1
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3 r2 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.f94371a     // Catch: java.lang.Exception -> Ld1
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.q r4 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.q.f94408d     // Catch: java.lang.Exception -> Ld1
            nu4.b0 r2 = r2.f()     // Catch: java.lang.Exception -> Ld1
            java.util.concurrent.ConcurrentLinkedDeque r2 = r2.D     // Catch: java.lang.Exception -> Ld1
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> Ld1
        Lb6:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Exception -> Ld1
            if (r5 == 0) goto Lc8
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Exception -> Ld1
            nu4.c0 r5 = (nu4.c0) r5     // Catch: java.lang.Exception -> Ld1
            boolean r5 = r5.d(r6, r10, r0, r4)     // Catch: java.lang.Exception -> Ld1
            if (r5 == 0) goto Lb6
        Lc8:
            java.lang.Object r10 = r3.f310123d
            r45.wm6 r10 = (r45.wm6) r10
            com.tencent.mm.plugin.webview.webcompt.h0 r10 = com.tencent.mm.plugin.webview.webcompt.f1.f187797e
            r10.f()
        Ld1:
            return r1
        Ld2:
            r10 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "[TRACE_VIDEO_PRELOAD] preloadVideo exception = "
            r0.<init>(r3)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.ui.timeline.preload.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
