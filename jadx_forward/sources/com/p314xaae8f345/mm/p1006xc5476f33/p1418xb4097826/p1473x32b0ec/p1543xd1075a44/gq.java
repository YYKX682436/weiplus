package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class gq implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq f200002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f200003b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.a63 f200004c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fq f200005d;

    public gq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq nqVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hq hqVar, com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864, r45.a63 a63Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fq fqVar) {
        this.f200002a = nqVar;
        this.f200003b = c22851x22587864;
        this.f200004c = a63Var;
        this.f200005d = fqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cc, code lost:
    
        if (r6 != null) goto L31;
     */
    @Override // gm5.a
    /* renamed from: call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object r12) {
        /*
            r11 = this;
            com.tencent.mm.modelbase.f r12 = (com.p314xaae8f345.mm.p944x882e457a.f) r12
            com.tencent.mm.plugin.finder.live.widget.nq r0 = r11.f200002a
            java.lang.String r1 = r0.H
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "#onLoadMore cgiBack errType="
            r2.<init>(r3)
            int r3 = r12.f152148a
            r2.append(r3)
            java.lang.String r3 = " errCode="
            r2.append(r3)
            int r3 = r12.f152149b
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            int r1 = r12.f152148a
            java.lang.String r0 = r0.H
            r45.a63 r2 = r11.f200004c
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r11.f200003b
            r4 = 3
            r5 = 1
            if (r1 != 0) goto Ld4
            int r1 = r12.f152149b
            if (r1 != 0) goto Ld4
            com.tencent.mm.plugin.finder.assist.b3 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a
            com.tencent.mm.protobuf.f r6 = r12.f152151d
            r45.hv1 r6 = (r45.hv1) r6
            r7 = 4
            java.util.LinkedList r6 = r6.m75941xfb821914(r7)
            java.lang.String r8 = "getGame_category_list(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r8)
            r1.e(r6)
            com.tencent.mm.protobuf.f r12 = r12.f152151d
            r45.hv1 r12 = (r45.hv1) r12
            java.util.LinkedList r12 = r12.m75941xfb821914(r7)
            if (r12 == 0) goto Lce
            java.util.Iterator r12 = r12.iterator()
        L54:
            boolean r1 = r12.hasNext()
            r6 = 0
            if (r1 == 0) goto L71
            java.lang.Object r1 = r12.next()
            r8 = r1
            r45.a63 r8 = (r45.a63) r8
            r9 = 0
            int r8 = r8.m75939xb282bd08(r9)
            int r10 = r2.m75939xb282bd08(r9)
            if (r8 != r10) goto L6e
            r9 = r5
        L6e:
            if (r9 == 0) goto L54
            goto L72
        L71:
            r1 = r6
        L72:
            r45.a63 r1 = (r45.a63) r1
            if (r1 == 0) goto Lce
            r12 = 2
            java.util.LinkedList r8 = r2.m75941xfb821914(r12)
            java.util.LinkedList r9 = r1.m75941xfb821914(r12)
            r8.addAll(r9)
            boolean r8 = r1.m75933x41a8a7f2(r4)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r2.set(r4, r8)
            java.lang.String r8 = r1.m75945x2fec8307(r7)
            r2.set(r7, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "#onLoadMore cgiBack append= "
            r7.<init>(r8)
            java.util.LinkedList r1 = r1.m75941xfb821914(r12)
            r7.append(r1)
            java.lang.String r1 = " total="
            r7.append(r1)
            java.util.LinkedList r12 = r2.m75941xfb821914(r12)
            r7.append(r12)
            java.lang.String r12 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r12)
            com.tencent.mm.plugin.finder.live.widget.fq r12 = r11.f200005d
            r12.m8146xced61ae5()
            boolean r12 = r2.m75933x41a8a7f2(r4)
            if (r12 == 0) goto Lc6
            if (r3 == 0) goto Lcc
            r3.e(r5)
            goto Lcb
        Lc6:
            if (r3 == 0) goto Lcc
            r3.f()
        Lcb:
            r6 = r3
        Lcc:
            if (r6 != 0) goto Ld9
        Lce:
            if (r3 == 0) goto Ld9
            r3.e(r5)
            goto Ld9
        Ld4:
            if (r3 == 0) goto Ld9
            r3.e(r5)
        Ld9:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "#onLoadMore cgiBack finally has_next="
            r12.<init>(r1)
            boolean r1 = r2.m75933x41a8a7f2(r4)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r12)
            jz5.f0 r12 = jz5.f0.f384359a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gq.mo1059x2e7a5e(java.lang.Object):java.lang.Object");
    }
}
