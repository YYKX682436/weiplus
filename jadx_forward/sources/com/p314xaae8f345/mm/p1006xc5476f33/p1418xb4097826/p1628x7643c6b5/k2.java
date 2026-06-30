package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes2.dex */
public final class k2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2 f207636f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207637g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f207638h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f207639i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2 l2Var, java.lang.String str2, int i18, int i19) {
        super(0);
        this.f207634d = i17;
        this.f207635e = str;
        this.f207636f = l2Var;
        this.f207637g = str2;
        this.f207638h = i18;
        this.f207639i = i19;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0036, code lost:
    
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(r4, 0).m59347x965c8f17() == false) goto L6;
     */
    @Override // yz5.a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo152xb9724478() {
        /*
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "recordPreloadFeed commentScene:"
            r0.<init>(r1)
            int r1 = r13.f207634d
            r0.append(r1)
            r2 = 32
            r0.append(r2)
            java.lang.String r2 = r13.f207635e
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "FinderFeedDetailService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            com.tencent.mm.plugin.finder.service.l2 r0 = r13.f207636f
            com.tencent.mm.sdk.platformtools.c0 r4 = r0.f207646d
            java.lang.Object r4 = r4.b(r2)
            com.tencent.mm.protocal.protobuf.FinderObject r4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) r4
            if (r4 == 0) goto L38
            com.tencent.mm.plugin.finder.storage.h90 r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec
            r6 = 0
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.a(r4, r6)
            boolean r5 = r5.m59347x965c8f17()
            if (r5 != 0) goto L39
        L38:
            r6 = 1
        L39:
            jz5.f0 r5 = jz5.f0.f384359a
            int r7 = r13.f207639i
            if (r6 == 0) goto Lba
            java.lang.Runnable r4 = r0.f207652m
            java.util.concurrent.CopyOnWriteArraySet r6 = r0.f207653n
            java.lang.String r8 = r13.f207637g
            if (r4 == 0) goto L9e
            com.tencent.mm.plugin.finder.service.x1 r4 = new com.tencent.mm.plugin.finder.service.x1
            r4.<init>(r2, r8)
            r6.add(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "recordPreloadFeed 聚合 commentScene:"
            r4.<init>(r9)
            r4.append(r1)
            java.lang.String r9 = " feedId:"
            r4.append(r9)
            r4.append(r2)
            java.lang.String r9 = " list:"
            r4.append(r9)
            java.util.concurrent.CopyOnWriteArraySet r9 = r0.f207651i
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = kz5.d0.q(r9, r11)
            r10.<init>(r11)
            java.util.Iterator r9 = r9.iterator()
        L77:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L92
            java.lang.Object r11 = r9.next()
            java.lang.Long r11 = (java.lang.Long) r11
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r11)
            long r11 = r11.longValue()
            java.lang.String r11 = pm0.v.u(r11)
            r10.add(r11)
            goto L77
        L92:
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4)
            r3 = r5
            goto L9f
        L9e:
            r3 = 0
        L9f:
            if (r3 != 0) goto Lc5
            com.tencent.mm.plugin.finder.service.x1 r3 = new com.tencent.mm.plugin.finder.service.x1
            r3.<init>(r2, r8)
            r6.add(r3)
            com.tencent.mm.plugin.finder.service.j2 r2 = new com.tencent.mm.plugin.finder.service.j2
            int r3 = r13.f207638h
            r2.<init>(r0, r1, r3, r7)
            r0.f207652m = r2
            java.util.regex.Pattern r0 = pm0.v.f438335a
            r0 = 300(0x12c, double:1.48E-321)
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(r2, r0)
            goto Lc5
        Lba:
            if (r4 == 0) goto Lc5
            java.util.List r2 = kz5.b0.c(r4)
            com.tencent.mm.plugin.finder.service.b2 r0 = r0.f207647e
            r0.a(r1, r2, r7)
        Lc5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.k2.mo152xb9724478():java.lang.Object");
    }
}
