package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class o4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f110361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI f110362e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI finderGameLiveAuthUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110362e = finderGameLiveAuthUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.o4(this.f110362e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.ui.o4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f110361d
            r2 = 1
            com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI r3 = r10.f110362e
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r11)
            goto L2c
        Lf:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L17:
            kotlin.ResultKt.throwOnFailure(r11)
            yl2.g1 r4 = r3.B
            if (r4 == 0) goto L2f
            r5 = 0
            r6 = 0
            r8 = 3
            r9 = 0
            r10.f110361d = r2
            r7 = r10
            java.lang.Object r11 = yl2.g1.t(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L2c
            return r0
        L2c:
            yl2.a0 r11 = (yl2.a0) r11
            goto L30
        L2f:
            r11 = 0
        L30:
            boolean r0 = r11 instanceof yl2.x
            if (r0 == 0) goto L4c
            java.lang.String r0 = r3.f109277w
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "startLiveCheck failed, errCode:"
            r1.<init>(r2)
            yl2.x r11 = (yl2.x) r11
            int r11 = r11.f463081a
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r11)
            goto La7
        L4c:
            boolean r0 = r11 instanceof yl2.z
            if (r0 == 0) goto L63
            java.lang.String r0 = r3.f109277w
            java.lang.String r1 = "startLiveCheck continueLive"
            com.tencent.mars.xlog.Log.i(r0, r1)
            yl2.g1 r0 = r3.B
            if (r0 == 0) goto La7
            yl2.z r11 = (yl2.z) r11
            yl2.k r11 = r11.f463087a
            r0.d(r11)
            goto La7
        L63:
            boolean r11 = r11 instanceof yl2.y
            if (r11 == 0) goto La7
            java.lang.String r11 = r3.f109277w
            java.lang.String r0 = "startLiveCheck success"
            com.tencent.mars.xlog.Log.i(r11, r0)
            androidx.appcompat.app.AppCompatActivity r11 = r3.getContext()
            java.lang.String r0 = "getContext(...)"
            kotlin.jvm.internal.o.f(r11, r0)
            pf5.z r0 = pf5.z.f353948a
            pf5.v r11 = r0.a(r11)
            java.lang.Class<com.tencent.mm.plugin.finder.live.viewmodel.h> r0 = com.tencent.mm.plugin.finder.live.viewmodel.h.class
            androidx.lifecycle.c1 r11 = r11.a(r0)
            com.tencent.mm.plugin.finder.live.viewmodel.h r11 = (com.tencent.mm.plugin.finder.live.viewmodel.h) r11
            java.lang.String r0 = r11.f117119d
            java.lang.String r1 = "jumpGamePostUI"
            com.tencent.mars.xlog.Log.i(r0, r1)
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = r11.f117121f     // Catch: java.lang.Throwable -> La0
            r2.<init>(r4)     // Catch: java.lang.Throwable -> La0
            com.tencent.mm.plugin.finder.assist.w7 r4 = com.tencent.mm.plugin.finder.assist.w7.f102656a     // Catch: java.lang.Throwable -> La0
            java.lang.String r11 = r11.f117120e     // Catch: java.lang.Throwable -> La0
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> La0
            r5.<init>()     // Catch: java.lang.Throwable -> La0
            r4.d(r2, r11, r5)     // Catch: java.lang.Throwable -> La0
            goto La7
        La0:
            r11 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r11, r1, r2)
        La7:
            r3.finish()
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.o4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
