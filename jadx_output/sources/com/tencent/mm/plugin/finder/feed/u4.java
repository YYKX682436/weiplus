package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class u4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f109135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f109136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f109137f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f109138g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(java.lang.String str, com.tencent.mm.plugin.finder.feed.a7 a7Var, java.util.List list, int i17) {
        super(0);
        this.f109135d = str;
        this.f109136e = a7Var;
        this.f109137f = list;
        this.f109138g = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r18 = this;
            r0 = r18
            hz2.d r1 = hz2.d.f286313a
            java.lang.String r2 = "comment"
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto Le
            goto Lc8
        Le:
            r1 = 1
            java.lang.String r2 = r0.f109135d
            r3 = 0
            if (r2 == 0) goto L1d
            int r4 = r2.length()
            if (r4 != 0) goto L1b
            goto L1d
        L1b:
            r4 = r3
            goto L1e
        L1d:
            r4 = r1
        L1e:
            r5 = 0
            com.tencent.mm.plugin.finder.feed.a7 r6 = r0.f109136e
            if (r4 == 0) goto L31
            com.tencent.mm.plugin.finder.view.FinderCommentEditText r4 = r6.X()
            if (r4 == 0) goto L2e
            android.text.Editable r4 = r4.getText()
            goto L2f
        L2e:
            r4 = r5
        L2f:
            r11 = r4
            goto L32
        L31:
            r11 = r2
        L32:
            pf5.u r4 = pf5.u.f353936a
            java.lang.Class<zy2.b6> r7 = zy2.b6.class
            pf5.v r4 = r4.e(r7)
            java.lang.Class<xy2.f> r7 = xy2.f.class
            pf5.c r4 = r4.c(r7)
            xy2.f r4 = (xy2.f) r4
            ey2.w r4 = (ey2.w) r4
            java.lang.String r4 = r4.O6()
            int r7 = r4.length()
            if (r7 <= 0) goto L50
            r7 = r1
            goto L51
        L50:
            r7 = r3
        L51:
            java.util.List r8 = r0.f109137f
            if (r7 == 0) goto L77
            java.util.Iterator r7 = r8.iterator()
        L59:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L72
            java.lang.Object r9 = r7.next()
            r10 = r9
            r45.gb4 r10 = (r45.gb4) r10
            r12 = 2
            java.lang.String r10 = r10.getString(r12)
            boolean r10 = kotlin.jvm.internal.o.b(r10, r4)
            if (r10 == 0) goto L59
            goto L73
        L72:
            r9 = r5
        L73:
            if (r9 == 0) goto L77
            r4 = r1
            goto L78
        L77:
            r4 = r3
        L78:
            if (r4 == 0) goto Lb9
            yw2.a0 r2 = r6.f106216o
            if (r2 == 0) goto L82
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r5 = r2.n()
        L82:
            if (r5 != 0) goto L85
            goto L88
        L85:
            r5.setFrozen(r1)
        L88:
            java.lang.Class<vh0.n1> r1 = vh0.n1.class
            i95.m r1 = i95.n0.c(r1)
            vh0.n1 r1 = (vh0.n1) r1
            android.content.Context r13 = r6.f106207d
            java.lang.String r14 = "wxid_wi_1d142z0zdj03"
            r15 = 5
            java.lang.String r2 = "wxid_wi_1d142z0zdj03"
            java.lang.String r2 = com.tencent.mm.ui.l2.a(r2)
            if (r2 != 0) goto La1
            java.lang.String r2 = ""
        La1:
            r16 = r2
            com.tencent.mm.plugin.finder.feed.t4 r17 = new com.tencent.mm.plugin.finder.feed.t4
            com.tencent.mm.plugin.finder.feed.a7 r8 = r0.f109136e
            int r9 = r0.f109138g
            java.util.List r10 = r0.f109137f
            java.lang.String r12 = r0.f109135d
            r7 = r17
            r7.<init>(r8, r9, r10, r11, r12)
            r12 = r1
            vh0.f3 r12 = (vh0.f3) r12
            r12.bj(r13, r14, r15, r16, r17)
            goto Lc8
        Lb9:
            if (r2 == 0) goto Lc1
            int r2 = r2.length()
            if (r2 != 0) goto Lc2
        Lc1:
            r3 = r1
        Lc2:
            r1 = r1 ^ r3
            int r2 = r0.f109138g
            com.tencent.mm.plugin.finder.feed.a7.v(r6, r2, r8, r11, r1)
        Lc8:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.u4.invoke():java.lang.Object");
    }
}
