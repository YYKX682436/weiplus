package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes15.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f108279d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f108280e;

    /* renamed from: f, reason: collision with root package name */
    public int f108281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader f108282g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108283h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader finderEmojiListLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f108282g = finderEmojiListLoader;
        this.f108283h = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.model.r0(this.f108282g, this.f108283h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.model.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r14.f108281f
            r2 = 2
            r3 = 0
            com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader r4 = r14.f108282g
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L29
            if (r1 == r5) goto L1d
            if (r1 != r2) goto L15
            kotlin.ResultKt.throwOnFailure(r15)
            goto Lcb
        L15:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1d:
            java.lang.Object r1 = r14.f108280e
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r7 = r14.f108279d
            com.tencent.mm.plugin.finder.feed.model.v0 r7 = (com.tencent.mm.plugin.finder.feed.model.v0) r7
            kotlin.ResultKt.throwOnFailure(r15)
            goto L49
        L29:
            kotlin.ResultKt.throwOnFailure(r15)
            com.tencent.mm.plugin.finder.feed.model.v0 r7 = new com.tencent.mm.plugin.finder.feed.model.v0
            java.lang.String r15 = ""
            r7.<init>(r6, r6, r15)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.tencent.wechat.aff.emoticon.i r15 = r4.f107404m
            if (r15 == 0) goto L4c
            r14.f108279d = r7
            r14.f108280e = r1
            r14.f108281f = r5
            java.lang.Object r15 = r15.a(r6, r14)
            if (r15 != r0) goto L49
            return r0
        L49:
            com.tencent.wechat.aff.emoticon.g r15 = (com.tencent.wechat.aff.emoticon.g) r15
            goto L4d
        L4c:
            r15 = r3
        L4d:
            com.tencent.wechat.aff.emoticon.i r8 = r4.f107404m
            if (r8 == 0) goto L8b
            java.util.ArrayList r8 = r8.f216647d
            if (r8 == 0) goto L8b
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = kz5.d0.q(r8, r10)
            r9.<init>(r10)
            java.util.Iterator r8 = r8.iterator()
            r10 = r6
        L65:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L88
            java.lang.Object r11 = r8.next()
            int r12 = r10 + 1
            if (r10 < 0) goto L84
            bw5.ra r11 = (bw5.ra) r11
            so2.p r13 = new so2.p
            if (r10 == 0) goto L7b
            r10 = r5
            goto L7c
        L7b:
            r10 = r6
        L7c:
            r13.<init>(r11, r10)
            r9.add(r13)
            r10 = r12
            goto L65
        L84:
            kz5.c0.p()
            throw r3
        L88:
            r1.addAll(r9)
        L8b:
            r7.setIncrementList(r1)
            com.tencent.wechat.aff.emoticon.i r1 = r4.f107404m
            if (r1 == 0) goto L99
            boolean r1 = r1.b()
            if (r1 != r5) goto L99
            goto L9a
        L99:
            r5 = r6
        L9a:
            r7.setHasMore(r5)
            com.tencent.wechat.aff.emoticon.g r1 = com.tencent.wechat.aff.emoticon.g.f216641e
            if (r15 != r1) goto La9
            com.tencent.mm.plugin.finder.feed.model.w0 r15 = com.tencent.mm.plugin.finder.feed.model.w0.f108422g
            r4.getClass()
            r4.f107399e = r15
            goto Lb0
        La9:
            com.tencent.mm.plugin.finder.feed.model.w0 r15 = com.tencent.mm.plugin.finder.feed.model.w0.f108421f
            r4.getClass()
            r4.f107399e = r15
        Lb0:
            r7.setPullType(r2)
            kotlinx.coroutines.p0 r15 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r15 = kotlinx.coroutines.internal.b0.f310484a
            com.tencent.mm.plugin.finder.feed.model.q0 r1 = new com.tencent.mm.plugin.finder.feed.model.q0
            com.tencent.mm.plugin.finder.feed.model.internal.n0 r4 = r14.f108283h
            r1.<init>(r4, r7, r3)
            r14.f108279d = r3
            r14.f108280e = r3
            r14.f108281f = r2
            java.lang.Object r15 = kotlinx.coroutines.l.g(r15, r1, r14)
            if (r15 != r0) goto Lcb
            return r0
        Lcb:
            jz5.f0 r15 = jz5.f0.f302826a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
