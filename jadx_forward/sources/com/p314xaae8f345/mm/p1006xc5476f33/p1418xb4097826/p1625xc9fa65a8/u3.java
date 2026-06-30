package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes.dex */
public final class u3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.b4 f207410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f207411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f207412f;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.b4 b4Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, yz5.q qVar) {
        this.f207410d = b4Var;
        this.f207411e = abstractActivityC21394xb3d2c0cf;
        this.f207412f = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    @Override // android.widget.AdapterView.OnItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemClick(android.widget.AdapterView r18, android.view.View r19, int r20, long r21) {
        /*
            r17 = this;
            r6 = r17
            r15 = r20
            java.lang.String r0 = "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$1"
            java.lang.String r1 = "android/widget/AdapterView$OnItemClickListener"
            java.lang.String r2 = "onItemClick"
            java.lang.String r3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r18
            r4.add(r5)
            r5 = r19
            r4.add(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r20)
            r4.add(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r21)
            r4.add(r5)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r17
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.finder.search.b4 r0 = r6.f207410d
            java.util.List r1 = r0.f207171i
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L55
            if (r15 < 0) goto L47
            int r4 = r1.size()
            if (r15 >= r4) goto L47
            r4 = 1
            goto L48
        L47:
            r4 = r2
        L48:
            if (r4 == 0) goto L4b
            goto L4c
        L4b:
            r1 = r3
        L4c:
            if (r1 == 0) goto L55
            java.lang.Object r1 = r1.get(r15)
            r45.lu2 r1 = (r45.lu2) r1
            goto L56
        L55:
            r1 = r3
        L56:
            if (r1 == 0) goto Lbf
            gm0.b0 r4 = gm0.j1.u()
            com.tencent.mm.storage.n3 r4 = r4.c()
            com.tencent.mm.storage.u3 r5 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_HOT_LIST_SEARCH_REQUEST_ID_STRING
            java.lang.String r7 = ""
            java.lang.String r16 = r4.v(r5, r7)
            java.lang.Class<com.tencent.mm.plugin.finder.report.o3> r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class
            i95.m r4 = i95.n0.c(r4)
            com.tencent.mm.plugin.finder.report.o3 r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) r4
            java.lang.String r2 = r1.m75945x2fec8307(r2)
            if (r2 != 0) goto L78
            r8 = r7
            goto L79
        L78:
            r8 = r2
        L79:
            r2 = 5
            java.lang.String r2 = r1.m75945x2fec8307(r2)
            if (r2 != 0) goto L82
            r9 = r7
            goto L83
        L82:
            r9 = r2
        L83:
            r11 = 1
            r12 = 1
            r13 = 2
            java.lang.String r2 = "context"
            com.tencent.mm.ui.MMActivity r5 = r6.f207411e
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r2)
            pf5.z r2 = pf5.z.f435481a
            pf5.v r2 = r2.a(r5)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class
            androidx.lifecycle.c1 r2 = r2.a(r5)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) r2
            if (r2 == 0) goto La3
            r45.qt2 r2 = r2.V6()
            r14 = r2
            goto La4
        La3:
            r14 = r3
        La4:
            r2 = 7
            long r2 = r1.m75942xfb822ef2(r2)
            java.lang.String r2 = pm0.v.u(r2)
            r7 = r4
            r10 = r20
            r15 = r2
            r7.oj(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            java.util.List r0 = r0.f207171i
            yz5.q r3 = r6.f207412f
            r3.mo147xb9724478(r1, r2, r0)
        Lbf:
            java.lang.String r0 = "onItemClick"
            java.lang.String r1 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r2 = "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$1"
            java.lang.String r3 = "android/widget/AdapterView$OnItemClickListener"
            yj0.a.h(r6, r2, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u3.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
