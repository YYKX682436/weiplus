package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class na extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f110334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI f110335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110337g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI finderLiveKTVReplayUI, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110335e = finderLiveKTVReplayUI;
        this.f110336f = str;
        this.f110337g = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.na(this.f110335e, this.f110336f, this.f110337g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.ui.na) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f110334d
            java.lang.String r2 = r6.f110336f
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI r3 = r6.f110335e
            r4 = 1
            if (r1 == 0) goto L19
            if (r1 != r4) goto L11
            kotlin.ResultKt.throwOnFailure(r7)
            goto L44
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            kotlin.ResultKt.throwOnFailure(r7)
            dk2.ca r7 = r3.B
            if (r7 == 0) goto L4b
            r6.f110334d = r4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "saveVideoToAlbum: filePath="
            r7.<init>(r1)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = "FinderLiveKTVReplayDownloadManager"
            com.tencent.mars.xlog.Log.i(r1, r7)
            kotlinx.coroutines.p0 r7 = kotlinx.coroutines.q1.f310570c
            dk2.ba r1 = new dk2.ba
            r5 = 0
            r1.<init>(r2, r3, r5)
            java.lang.Object r7 = kotlinx.coroutines.l.g(r7, r1, r6)
            if (r7 != r0) goto L44
            return r0
        L44:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L4c
        L4b:
            r7 = 0
        L4c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "saveVideoToAlbum result: saved="
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = ", filePath="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderLiveKTVReplayUI"
            com.tencent.mars.xlog.Log.i(r1, r0)
            if (r7 == 0) goto L8c
            java.lang.String r7 = r6.f110337g
            java.lang.String r7 = com.tencent.mm.sdk.platformtools.w2.a(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ktv_replay_downloaded_"
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            int r0 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI.D
            jz5.g r0 = r3.C
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.sdk.platformtools.o4 r0 = (com.tencent.mm.sdk.platformtools.o4) r0
            r0.G(r7, r4)
        L8c:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.na.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
