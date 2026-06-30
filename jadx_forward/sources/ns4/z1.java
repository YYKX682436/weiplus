package ns4;

/* loaded from: classes8.dex */
public final class z1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f421221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de f421222e;

    public z1(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de) {
        this.f421221d = linkedList;
        this.f421222e = activityC19067xb53aa1de;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo888x34063ac(android.view.MenuItem r11, int r12) {
        /*
            r10 = this;
            java.util.LinkedList r11 = r10.f421221d
            java.lang.Object r11 = kz5.n0.a0(r11, r12)
            r45.y94 r11 = (r45.y94) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "select encash, index:"
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = ", bizEncashItem:"
            r0.append(r12)
            r12 = 0
            r1 = 0
            if (r11 == 0) goto L25
            int r2 = r11.m75939xb282bd08(r12)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L26
        L25:
            r2 = r1
        L26:
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            r3 = 1
            if (r11 == 0) goto L36
            java.lang.String r4 = r11.m75945x2fec8307(r3)
            goto L37
        L36:
            r4 = r1
        L37:
            r0.append(r4)
            r0.append(r2)
            r2 = 4
            if (r11 == 0) goto L47
            com.tencent.mm.protobuf.f r4 = r11.m75936x14adae67(r2)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) r4
            goto L48
        L47:
            r4 = r1
        L48:
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "MicroMsg.WeCoinIncomeDetailView"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)
            if (r11 == 0) goto L5e
            int r0 = r11.m75939xb282bd08(r12)
            if (r0 != r3) goto L5e
            r0 = r3
            goto L5f
        L5e:
            r0 = r12
        L5f:
            if (r0 == 0) goto L7a
            com.tencent.mm.protobuf.f r0 = r11.m75936x14adae67(r2)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) r0
            if (r0 != 0) goto L78
            com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView r0 = r10.f421222e
            ms4.t r0 = r0.f260709s
            if (r0 == 0) goto L72
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r0.f412653r
            goto L78
        L72:
            java.lang.String r11 = "mViewModel"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r11)
            throw r1
        L78:
            r5 = r0
            goto L84
        L7a:
            if (r11 == 0) goto L83
            com.tencent.mm.protobuf.f r0 = r11.m75936x14adae67(r2)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) r0
            goto L78
        L83:
            r5 = r1
        L84:
            com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView r4 = r10.f421222e
            if (r11 == 0) goto L8e
            r0 = 2
            long r6 = r11.m75942xfb822ef2(r0)
            goto L90
        L8e:
            r6 = 0
        L90:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            if (r11 == 0) goto L9a
            int r12 = r11.m75939xb282bd08(r12)
        L9a:
            r7 = r12
            if (r11 == 0) goto La1
            java.lang.String r1 = r11.m75945x2fec8307(r3)
        La1:
            r8 = r1
            if (r11 == 0) goto Lab
            r12 = 3
            java.lang.String r11 = r11.m75945x2fec8307(r12)
            if (r11 != 0) goto Lad
        Lab:
            java.lang.String r11 = ""
        Lad:
            r9 = r11
            int r11 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de.E
            r4.W6(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ns4.z1.mo888x34063ac(android.view.MenuItem, int):void");
    }
}
