package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f175965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175966f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String str, int i17, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f175964d = str;
        this.f175965e = i17;
        this.f175966f = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t(this.f175964d, this.f175965e, this.f175966f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[Catch: Exception -> 0x00d1, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d1, blocks: (B:10:0x0020, B:12:0x0051, B:15:0x005a, B:16:0x006c, B:24:0x007b, B:25:0x007f, B:26:0x0085, B:28:0x0095, B:30:0x00a6, B:31:0x00b6, B:33:0x00bc, B:41:0x009c, B:42:0x0061), top: B:9:0x0020, inners: #0 }] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r0 = r9.f175964d
            jz5.f0 r1 = jz5.f0.f384359a
            java.lang.String r2 = "MicroMsg.BizVideoPreloadLogic"
            pz5.a r3 = pz5.a.f440719d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.r r10 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.r.f175955d
            kotlin.jvm.internal.h0 r3 = new kotlin.jvm.internal.h0
            r3.<init>()
            java.lang.Object r10 = r10.mo152xb9724478()     // Catch: java.lang.Exception -> Ld2
            r3.f391656d = r10     // Catch: java.lang.Exception -> Ld2
            if (r10 != 0) goto L20
            java.lang.String r10 = "[TRACE_VIDEO_PRELOAD] preloadVideo tmplParams not exist"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r10)     // Catch: java.lang.Exception -> Ld2
            return r1
        L20:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.s r4 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.s     // Catch: java.lang.Exception -> Ld1
            r4.<init>(r3)     // Catch: java.lang.Exception -> Ld1
            java.lang.Object r10 = r4.mo149xb9724478(r0, r10)     // Catch: java.lang.Exception -> Ld1
            nu4.a r10 = (nu4.a) r10     // Catch: java.lang.Exception -> Ld1
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.u r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u.f175984a     // Catch: java.lang.Exception -> Ld1
            java.util.LinkedList r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u.f175987d     // Catch: java.lang.Exception -> Ld1
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k r6 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.k     // Catch: java.lang.Exception -> Ld1
            int r7 = r9.f175965e     // Catch: java.lang.Exception -> Ld1
            java.lang.String r8 = r9.f175966f     // Catch: java.lang.Exception -> Ld1
            r6.<init>(r0, r7, r8, r10)     // Catch: java.lang.Exception -> Ld1
            r5.add(r6)     // Catch: java.lang.Exception -> Ld1
            r45.m83 r0 = r10.f421767b     // Catch: java.lang.Exception -> Ld1
            java.lang.String r0 = r0.f461764e     // Catch: java.lang.Exception -> Ld1
            java.lang.String r5 = "ManifestUrl"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r5)     // Catch: java.lang.Exception -> Ld1
            java.lang.String r0 = nu4.d0.a(r0)     // Catch: java.lang.Exception -> Ld1
            java.lang.String r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u.f175989f     // Catch: java.lang.Exception -> Ld1
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5)     // Catch: java.lang.Exception -> Ld1
            r6 = 1
            if (r5 != 0) goto L61
            java.lang.String r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u.f175989f     // Catch: java.lang.Exception -> Ld1
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r0)     // Catch: java.lang.Exception -> Ld1
            if (r5 != 0) goto L5a
            goto L61
        L5a:
            int r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u.f175988e     // Catch: java.lang.Exception -> Ld1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Ld1
            goto L6c
        L61:
            java.lang.String r5 = "<set-?>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r5)     // Catch: java.lang.Exception -> Ld1
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u.f175989f = r0     // Catch: java.lang.Exception -> Ld1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> Ld1
        L6c:
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> Ld1
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u.f175988e = r0     // Catch: java.lang.Exception -> Ld1
            r5 = 2
            if (r0 == r6) goto L85
            if (r0 == r5) goto L7f
            r10 = 3
            if (r0 == r10) goto L7b
            goto Lc8
        L7b:
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u.a(r4)     // Catch: java.lang.Exception -> Ld1
            goto Lc8
        L7f:
            java.lang.String r10 = "[TRACE_VIDEO_PRELOAD] preloadVideo jsStatus.INIT_ING"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r10)     // Catch: java.lang.Exception -> Ld1
            goto Lc8
        L85:
            java.lang.String r0 = "[TRACE_VIDEO_PRELOAD] preloadVideo JsStatus.SHOULD_INIT"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)     // Catch: java.lang.Exception -> Ld1
            java.lang.Object r0 = r3.f391656d     // Catch: java.lang.Exception -> Ld1
            r45.wm6 r0 = (r45.wm6) r0     // Catch: java.lang.Exception -> Ld1
            java.lang.String r0 = r0.f470828g     // Catch: java.lang.Exception -> Ld1
            java.lang.String r4 = "initFilePath"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r4)     // Catch: java.lang.Exception -> Ld1
            java.lang.String r0 = com.p314xaae8f345.mm.vfs.w6.M(r0)     // Catch: java.io.IOException -> L9a java.lang.Exception -> Ld1
            goto La4
        L9a:
            r0 = move-exception
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> Ld1
            java.lang.String r7 = ""
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r0, r7, r4)     // Catch: java.lang.Exception -> Ld1
            r0 = r7
        La4:
            if (r0 == 0) goto Lc8
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u.f175988e = r5     // Catch: java.lang.Exception -> Ld1
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3 r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.f175904a     // Catch: java.lang.Exception -> Ld1
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.q r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.q.f175941d     // Catch: java.lang.Exception -> Ld1
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
            java.lang.Object r10 = r3.f391656d
            r45.wm6 r10 = (r45.wm6) r10
            com.tencent.mm.plugin.webview.webcompt.h0 r10 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269330e
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
