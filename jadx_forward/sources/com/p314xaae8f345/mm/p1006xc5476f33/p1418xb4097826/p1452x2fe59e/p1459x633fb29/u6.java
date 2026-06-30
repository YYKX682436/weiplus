package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class u6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13906x7187c260 f189930d;

    public u6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13906x7187c260 c13906x7187c260) {
        this.f189930d = c13906x7187c260;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.v6 v6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.v6(0, 0, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13906x7187c260 c13906x7187c260 = this.f189930d;
        v6Var.m56420x2a5f836b(c13906x7187c260.f189133f);
        v6Var.m56421x73095078(c13906x7187c260.f189134g);
        return v6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0036 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int r10, int r11, java.lang.String r12, com.p314xaae8f345.mm.p944x882e457a.i r13, com.p314xaae8f345.mm.p2495xc50a8b8b.f r14) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof bq.f1
            r1 = 0
            if (r0 == 0) goto Ld9
            boolean r0 = r14 instanceof r45.go2
            if (r0 == 0) goto Ld9
            com.tencent.mm.plugin.finder.feed.model.v6 r0 = new com.tencent.mm.plugin.finder.feed.model.v6
            r0.<init>(r10, r11, r12)
            r12 = 0
            r2 = 1
            if (r10 != 0) goto L21
            if (r11 != 0) goto L21
            r10 = r14
            r45.go2 r10 = (r45.go2) r10
            r11 = 3
            int r10 = r10.m75939xb282bd08(r11)
            if (r10 == 0) goto L1f
            goto L21
        L1f:
            r10 = r12
            goto L22
        L21:
            r10 = r2
        L22:
            r0.m56419xdac5ee4d(r10)
            r45.go2 r14 = (r45.go2) r14
            java.util.LinkedList r10 = r14.m75941xfb821914(r2)
            if (r10 == 0) goto Lc6
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L36:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto Lc5
            java.lang.Object r3 = r10.next()
            r45.do2 r3 = (r45.do2) r3
            com.tencent.mm.protobuf.f r4 = r3.m75936x14adae67(r12)
            r45.uz0 r4 = (r45.uz0) r4
            r5 = 13
            if (r4 == 0) goto L54
            int r4 = r4.m75939xb282bd08(r5)
            if (r4 != r2) goto L54
            r4 = r2
            goto L55
        L54:
            r4 = r12
        L55:
            r6 = 0
            if (r4 == 0) goto L80
            java.lang.String r4 = r9.m56464xb5886c64()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "skip course invalid "
            r5.<init>(r8)
            com.tencent.mm.protobuf.f r3 = r3.m75936x14adae67(r12)
            r45.uz0 r3 = (r45.uz0) r3
            if (r3 == 0) goto L70
            long r6 = r3.m75942xfb822ef2(r12)
        L70:
            java.lang.String r3 = pm0.v.u(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r3)
        L7e:
            r4 = r1
            goto Lbe
        L80:
            com.tencent.mm.protobuf.f r4 = r3.m75936x14adae67(r2)
            r45.n11 r4 = (r45.n11) r4
            if (r4 == 0) goto L90
            int r4 = r4.m75939xb282bd08(r5)
            if (r4 != r2) goto L90
            r4 = r2
            goto L91
        L90:
            r4 = r12
        L91:
            if (r4 == 0) goto Lb9
            java.lang.String r4 = r9.m56464xb5886c64()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "skip drama invalid "
            r5.<init>(r8)
            com.tencent.mm.protobuf.f r3 = r3.m75936x14adae67(r2)
            r45.n11 r3 = (r45.n11) r3
            if (r3 == 0) goto Laa
            long r6 = r3.m75942xfb822ef2(r12)
        Laa:
            java.lang.String r3 = pm0.v.u(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r3)
            goto L7e
        Lb9:
            nr2.m r4 = new nr2.m
            r4.<init>(r3)
        Lbe:
            if (r4 == 0) goto L36
            r11.add(r4)
            goto L36
        Lc5:
            r1 = r11
        Lc6:
            r0.m56420x2a5f836b(r1)
            r10 = 4
            com.tencent.mm.protobuf.g r10 = r14.m75934xbce7f2f(r10)
            r0.m56421x73095078(r10)
            bq.f1 r13 = (bq.f1) r13
            int r10 = r13.f105018o
            r0.m56423xd4b4a5a1(r10)
            return r0
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.u6.mo983xfcd2013a(int, int, java.lang.String, com.tencent.mm.modelbase.i, com.tencent.mm.protobuf.f):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13906x7187c260 c13906x7187c260 = this.f189930d;
        return new bq.f1(c13906x7187c260.f189131d, c13906x7187c260.m56357x44e5026c(), c13906x7187c260.m56354xfe9224be(), 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13906x7187c260 c13906x7187c260 = this.f189930d;
        return new bq.f1(c13906x7187c260.f189131d, null, c13906x7187c260.m56354xfe9224be(), 0);
    }
}
