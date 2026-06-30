package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6;

/* loaded from: classes2.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s f202867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f202868e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        super(1);
        this.f202867d = sVar;
        this.f202868e = abstractC14490x69736cb5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008d, code lost:
    
        if ((r2.length() == 0) == true) goto L44;
     */
    @Override // yz5.l
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo146xb9724478(java.lang.Object r12) {
        /*
            r11 = this;
            com.tencent.mm.modelbase.f r12 = (com.p314xaae8f345.mm.p944x882e457a.f) r12
            r0 = 1
            r1 = 0
            if (r12 == 0) goto Le
            boolean r2 = r12.b()
            if (r2 != r0) goto Le
            r2 = r0
            goto Lf
        Le:
            r2 = r1
        Lf:
            r3 = 0
            com.tencent.mm.plugin.finder.member.question.s r4 = r11.f202867d
            if (r2 == 0) goto L6f
            com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader r12 = r4.f202879f
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r12 = r12.m56387xe6796cde()
            java.util.Iterator r12 = r12.iterator()
            r2 = r1
        L1f:
            boolean r5 = r12.hasNext()
            r6 = -1
            if (r5 == 0) goto L51
            java.lang.Object r5 = r12.next()
            so2.j5 r5 = (so2.j5) r5
            boolean r7 = r5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5
            if (r7 == 0) goto L4a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.getFeedObject()
            long r7 = r5.m59251x5db1b11()
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r11.f202868e
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.getFeedObject()
            long r9 = r5.m59251x5db1b11()
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 != 0) goto L4a
            r5 = r0
            goto L4b
        L4a:
            r5 = r1
        L4b:
            if (r5 == 0) goto L4e
            goto L52
        L4e:
            int r2 = r2 + 1
            goto L1f
        L51:
            r2 = r6
        L52:
            jz5.f0 r12 = jz5.f0.f384359a
            if (r2 == r6) goto L6d
            com.tencent.mm.plugin.finder.member.question.w r0 = r4.f202880g
            if (r0 == 0) goto Lab
            com.tencent.mm.plugin.finder.view.FinderRefreshLayout r0 = r0.a()
            androidx.recyclerview.widget.RecyclerView r0 = r0.m62367x4905e9fa()
            if (r0 == 0) goto Lab
            androidx.recyclerview.widget.f2 r0 = r0.mo7946xf939df19()
            if (r0 == 0) goto Lab
            r0.m8147xed6e4d18(r2)
        L6d:
            r3 = r12
            goto Lab
        L6f:
            com.tencent.mm.ui.MMActivity r2 = r4.f202877d
            int r5 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n
            com.tencent.mm.ui.widget.dialog.e4 r5 = new com.tencent.mm.ui.widget.dialog.e4
            r5.<init>(r2)
            r2 = 2131690910(0x7f0f059e, float:1.9010877E38)
            r5.b(r2)
            if (r12 == 0) goto L90
            java.lang.String r2 = r12.f152150c
            if (r2 == 0) goto L90
            int r2 = r2.length()
            if (r2 != 0) goto L8c
            r2 = r0
            goto L8d
        L8c:
            r2 = r1
        L8d:
            if (r2 != r0) goto L90
            goto L91
        L90:
            r0 = r1
        L91:
            if (r0 == 0) goto L9d
            com.tencent.mm.ui.MMActivity r12 = r4.f202877d
            r0 = 2131767059(0x7f102f13, float:1.9165325E38)
            java.lang.String r12 = r12.getString(r0)
            goto La5
        L9d:
            if (r12 == 0) goto La1
            java.lang.String r3 = r12.f152150c
        La1:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r3)
            r12 = r3
        La5:
            r5.f293309c = r12
            com.tencent.mm.ui.widget.dialog.f4 r3 = r5.c()
        Lab:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.m.mo146xb9724478(java.lang.Object):java.lang.Object");
    }
}
