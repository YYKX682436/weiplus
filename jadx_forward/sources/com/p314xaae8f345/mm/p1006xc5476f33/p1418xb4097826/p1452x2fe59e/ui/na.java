package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes.dex */
public final class na extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f191867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14003xac416256 f191868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191870g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14003xac416256 activityC14003xac416256, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f191868e = activityC14003xac416256;
        this.f191869f = str;
        this.f191870g = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.na(this.f191868e, this.f191869f, this.f191870g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.na) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r6.f191867d
            java.lang.String r2 = r6.f191869f
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI r3 = r6.f191868e
            r4 = 1
            if (r1 == 0) goto L19
            if (r1 != r4) goto L11
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L44
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            dk2.ca r7 = r3.B
            if (r7 == 0) goto L4b
            r6.f191867d = r4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "saveVideoToAlbum: filePath="
            r7.<init>(r1)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = "FinderLiveKTVReplayDownloadManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r7)
            kotlinx.coroutines.p0 r7 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            dk2.ba r1 = new dk2.ba
            r5 = 0
            r1.<init>(r2, r3, r5)
            java.lang.Object r7 = p3325xe03a0797.p3326xc267989b.l.g(r7, r1, r6)
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            if (r7 == 0) goto L8c
            java.lang.String r7 = r6.f191870g
            java.lang.String r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ktv_replay_downloaded_"
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            int r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14003xac416256.D
            jz5.g r0 = r3.C
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            com.tencent.mm.sdk.platformtools.o4 r0 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) r0
            r0.G(r7, r4)
        L8c:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.na.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
