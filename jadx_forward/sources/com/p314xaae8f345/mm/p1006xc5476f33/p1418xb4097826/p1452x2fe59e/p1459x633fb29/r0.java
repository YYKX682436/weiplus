package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes15.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f189812d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f189813e;

    /* renamed from: f, reason: collision with root package name */
    public int f189814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13857x71711a11 f189815g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 f189816h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13857x71711a11 c13857x71711a11, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f189815g = c13857x71711a11;
        this.f189816h = n0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r0(this.f189815g, this.f189816h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r14.f189814f
            r2 = 2
            r3 = 0
            com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader r4 = r14.f189815g
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L29
            if (r1 == r5) goto L1d
            if (r1 != r2) goto L15
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto Lcb
        L15:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1d:
            java.lang.Object r1 = r14.f189813e
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r7 = r14.f189812d
            com.tencent.mm.plugin.finder.feed.model.v0 r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.v0) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto L49
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            com.tencent.mm.plugin.finder.feed.model.v0 r7 = new com.tencent.mm.plugin.finder.feed.model.v0
            java.lang.String r15 = ""
            r7.<init>(r6, r6, r15)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.tencent.wechat.aff.emoticon.i r15 = r4.f188937m
            if (r15 == 0) goto L4c
            r14.f189812d = r7
            r14.f189813e = r1
            r14.f189814f = r5
            java.lang.Object r15 = r15.a(r6, r14)
            if (r15 != r0) goto L49
            return r0
        L49:
            com.tencent.wechat.aff.emoticon.g r15 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.g) r15
            goto L4d
        L4c:
            r15 = r3
        L4d:
            com.tencent.wechat.aff.emoticon.i r8 = r4.f188937m
            if (r8 == 0) goto L8b
            java.util.ArrayList r8 = r8.f298180d
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
            r7.m56420x2a5f836b(r1)
            com.tencent.wechat.aff.emoticon.i r1 = r4.f188937m
            if (r1 == 0) goto L99
            boolean r1 = r1.b()
            if (r1 != r5) goto L99
            goto L9a
        L99:
            r5 = r6
        L9a:
            r7.m56419xdac5ee4d(r5)
            com.tencent.wechat.aff.emoticon.g r1 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.g.f298174e
            if (r15 != r1) goto La9
            com.tencent.mm.plugin.finder.feed.model.w0 r15 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w0.f189955g
            r4.getClass()
            r4.f188932e = r15
            goto Lb0
        La9:
            com.tencent.mm.plugin.finder.feed.model.w0 r15 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w0.f189954f
            r4.getClass()
            r4.f188932e = r15
        Lb0:
            r7.m56423xd4b4a5a1(r2)
            kotlinx.coroutines.p0 r15 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r15 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            com.tencent.mm.plugin.finder.feed.model.q0 r1 = new com.tencent.mm.plugin.finder.feed.model.q0
            com.tencent.mm.plugin.finder.feed.model.internal.n0 r4 = r14.f189816h
            r1.<init>(r4, r7, r3)
            r14.f189812d = r3
            r14.f189813e = r3
            r14.f189814f = r2
            java.lang.Object r15 = p3325xe03a0797.p3326xc267989b.l.g(r15, r1, r14)
            if (r15 != r0) goto Lcb
            return r0
        Lcb:
            jz5.f0 r15 = jz5.f0.f384359a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
