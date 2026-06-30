package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class ea extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f109974d;

    /* renamed from: e, reason: collision with root package name */
    public int f109975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI f109976f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI finderLiveHistoryUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f109976f = finderLiveHistoryUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.ea(this.f109976f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.ui.ea) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f109975e
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI r2 = r8.f109976f
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L2f
            if (r1 == r6) goto L2b
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r8.f109974d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto Lb9
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            java.lang.Object r1 = r8.f109974d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L9d
        L2b:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L7e
        L2f:
            kotlin.ResultKt.throwOnFailure(r9)
            r45.s61 r9 = new r45.s61
            r9.<init>()
            java.lang.String r1 = xy2.c.e(r2)
            r9.set(r4, r1)
            java.lang.String r1 = xy2.c.e(r2)
            r9.set(r3, r1)
            db2.t4 r1 = db2.t4.f228171a
            r7 = 9550(0x254e, float:1.3382E-41)
            r45.kv0 r1 = r1.a(r7)
            r9.set(r6, r1)
            r1 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.set(r1, r7)
            int r1 = r2.f109372v
            r7 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.set(r7, r1)
            r1 = 4
            int r7 = r2.f109373w
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.set(r1, r7)
            r1 = 6
            r9.set(r1, r5)
            com.tencent.mm.modelbase.i r9 = r9.d()
            r8.f109975e = r6
            java.lang.Object r9 = xg2.g.d(r9, r5, r8, r6, r5)
            if (r9 != r0) goto L7e
            return r0
        L7e:
            r1 = r9
            xg2.h r1 = (xg2.h) r1
            boolean r9 = r1 instanceof xg2.i
            if (r9 == 0) goto L9d
            oz5.l r9 = r1.f454392a
            if (r9 != 0) goto L8d
            oz5.l r9 = r8.getContext()
        L8d:
            com.tencent.mm.plugin.finder.feed.ui.da r6 = new com.tencent.mm.plugin.finder.feed.ui.da
            r6.<init>(r1, r5, r2)
            r8.f109974d = r1
            r8.f109975e = r4
            java.lang.Object r9 = kotlinx.coroutines.l.g(r9, r6, r8)
            if (r9 != r0) goto L9d
            return r0
        L9d:
            boolean r9 = r1 instanceof xg2.b
            if (r9 == 0) goto Lb9
            oz5.l r9 = r1.f454392a
            if (r9 != 0) goto La9
            oz5.l r9 = r8.getContext()
        La9:
            com.tencent.mm.plugin.finder.feed.ui.ca r4 = new com.tencent.mm.plugin.finder.feed.ui.ca
            r4.<init>(r1, r5, r2)
            r8.f109974d = r1
            r8.f109975e = r3
            java.lang.Object r9 = kotlinx.coroutines.l.g(r9, r4, r8)
            if (r9 != r0) goto Lb9
            return r0
        Lb9:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.ea.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
