package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class ez extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f188209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar) {
        super(0);
        this.f188209d = pzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0092, code lost:
    
        if (r10.f492134g == r7) goto L13;
     */
    @Override // yz5.a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo152xb9724478() {
        /*
            r12 = this;
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r1 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC
            r2 = 0
            int r6 = r0.r(r1, r2)
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r1 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC
            int r0 = r0.r(r1, r2)
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC
            int r1 = r1.r(r3, r2)
            gm0.b0 r3 = gm0.j1.u()
            com.tencent.mm.storage.n3 r3 = r3.c()
            com.tencent.mm.storage.u3 r4 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC
            int r3 = r3.r(r4, r2)
            gm0.b0 r4 = gm0.j1.u()
            com.tencent.mm.storage.n3 r4 = r4.c()
            com.tencent.mm.storage.u3 r5 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_FOLLOW_ACCEPT_INT_SYNC
            r4.r(r5, r2)
            gm0.b0 r4 = gm0.j1.u()
            com.tencent.mm.storage.n3 r4 = r4.c()
            com.tencent.mm.storage.u3 r5 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC
            int r7 = r4.r(r5, r2)
            int r4 = r6 + r0
            int r4 = r4 + r1
            int r4 = r4 + r3
            int r5 = r4 + r7
            int r4 = r0 + r1
            int r8 = r4 + r3
            gm0.b0 r4 = gm0.j1.u()
            com.tencent.mm.storage.n3 r4 = r4.c()
            com.tencent.mm.storage.u3 r9 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_AVATAR_STRING_SYNC
            java.lang.String r10 = ""
            java.lang.Object r4 = r4.m(r9, r10)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.String"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r4, r9)
            r9 = r4
            java.lang.String r9 = (java.lang.String) r9
            com.tencent.mm.plugin.finder.feed.pz r4 = r12.f188209d
            so2.t r10 = r4.f190296p0
            int r11 = r10.f492131d
            if (r11 != r5) goto L94
            java.lang.String r10 = r10.f492135h
            boolean r10 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r10, r9)
            if (r10 == 0) goto L94
            so2.t r10 = r4.f190296p0
            int r11 = r10.f492132e
            if (r11 != r8) goto L94
            int r11 = r10.f492133f
            if (r11 != r6) goto L94
            int r10 = r10.f492134g
            if (r10 == r7) goto L95
        L94:
            r2 = 1
        L95:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "isNeedRefresh="
            r10.<init>(r11)
            r10.append(r2)
            java.lang.String r11 = " refreshMsgNotify commentCnt "
            r10.append(r11)
            r10.append(r6)
            java.lang.String r11 = ", likeCnt "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r0 = " objectLikeLikeCnt "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = " objectRecommendLikeCnt "
            r10.append(r0)
            r10.append(r3)
            java.lang.String r0 = " friendRecommendCnt:"
            r10.append(r0)
            r10.append(r7)
            java.lang.String r0 = " tabType "
            r10.append(r0)
            int r0 = r4.f190295p
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            java.lang.String r1 = r4.U
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            if (r2 == 0) goto Le7
            com.tencent.mm.plugin.finder.feed.dz r0 = new com.tencent.mm.plugin.finder.feed.dz
            com.tencent.mm.plugin.finder.feed.pz r4 = r12.f188209d
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            pm0.v.X(r0)
        Le7:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ez.mo152xb9724478():java.lang.Object");
    }
}
