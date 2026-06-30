package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f207163a;

    /* renamed from: b, reason: collision with root package name */
    public final int f207164b;

    /* renamed from: c, reason: collision with root package name */
    public bq.m0 f207165c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f207166d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f207167e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f207168f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ListView f207169g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.z3 f207170h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f207171i;

    public b4(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, yz5.q onHotWordClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onHotWordClickListener, "onHotWordClickListener");
        this.f207166d = activity;
        android.view.View findViewById = activity.findViewById(com.p314xaae8f345.mm.R.id.fvn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
        this.f207167e = linearLayout;
        android.view.View findViewById2 = activity.findViewById(com.p314xaae8f345.mm.R.id.fvp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f207168f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = activity.findViewById(com.p314xaae8f345.mm.R.id.fvo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.ListView listView = (android.widget.ListView) findViewById3;
        this.f207169g = listView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.z3 z3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.z3(this);
        this.f207170h = z3Var;
        listView.setAdapter((android.widget.ListAdapter) z3Var);
        listView.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u3(this, activity, onHotWordClickListener));
        linearLayout.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v3(activity));
        this.f207163a = com.p314xaae8f345.mm.ui.dl.d(activity).x - i65.a.h(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        this.f207164b = i65.a.h(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        c();
    }

    public final void a(java.util.List list, boolean z17) {
        c01.id.e();
        if (z17) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_HOT_LIST_SEARCH_REQUEST_ID_STRING, java.util.UUID.randomUUID().toString());
        }
        this.f207171i = list;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onHotWordsChange : ");
        sb6.append(list);
        sb6.append(" size: ");
        sb6.append(list != null ? list.size() : -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPopularListLogic", sb6.toString());
        android.widget.LinearLayout linearLayout = this.f207167e;
        if (list == null) {
            linearLayout.setVisibility(8);
            return;
        }
        boolean isEmpty = list.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.z3 z3Var = this.f207170h;
        if (isEmpty) {
            linearLayout.setVisibility(8);
            z3Var.notifyDataSetChanged();
        } else {
            linearLayout.setVisibility(0);
            z3Var.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[LOOP:0: B:3:0x000c->B:26:0x0092, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r14 = this;
            android.widget.ListView r0 = r14.f207169g
            int r1 = r0.getFirstVisiblePosition()
            int r0 = r0.getLastVisiblePosition()
            if (r1 > r0) goto L96
        Lc:
            java.util.List r2 = r14.f207171i
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L2a
            if (r1 < 0) goto L1c
            int r5 = r2.size()
            if (r1 >= r5) goto L1c
            r5 = 1
            goto L1d
        L1c:
            r5 = r3
        L1d:
            if (r5 == 0) goto L20
            goto L21
        L20:
            r2 = r4
        L21:
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r2.get(r1)
            r45.lu2 r2 = (r45.lu2) r2
            goto L2b
        L2a:
            r2 = r4
        L2b:
            if (r2 == 0) goto L90
            gm0.b0 r5 = gm0.j1.u()
            com.tencent.mm.storage.n3 r5 = r5.c()
            com.tencent.mm.storage.u3 r6 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_HOT_LIST_SEARCH_REQUEST_ID_STRING
            java.lang.String r7 = ""
            java.lang.String r11 = r5.v(r6, r7)
            java.lang.String r5 = r2.m75945x2fec8307(r3)
            if (r5 == 0) goto L4c
            java.lang.String r6 = ","
            java.lang.String r8 = "$"
            java.lang.String r3 = r26.i0.t(r5, r6, r8, r3)
            goto L4d
        L4c:
            r3 = r4
        L4d:
            java.lang.Class<com.tencent.mm.plugin.finder.report.o3> r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class
            i95.m r5 = i95.n0.c(r5)
            com.tencent.mm.plugin.finder.report.o3 r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) r5
            r6 = 5
            java.lang.String r6 = r2.m75945x2fec8307(r6)
            if (r6 != 0) goto L5d
            r6 = r7
        L5d:
            r7 = 1
            r8 = 1
            r9 = 1
            java.lang.String r10 = "context"
            com.tencent.mm.ui.MMActivity r12 = r14.f207166d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r10)
            pf5.z r10 = pf5.z.f435481a
            pf5.v r10 = r10.a(r12)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r12 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class
            androidx.lifecycle.c1 r10 = r10.a(r12)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r10 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) r10
            if (r10 == 0) goto L7b
            r45.qt2 r4 = r10.V6()
        L7b:
            r10 = r4
            r4 = 7
            long r12 = r2.m75942xfb822ef2(r4)
            java.lang.String r12 = pm0.v.u(r12)
            r2 = r5
            r4 = r6
            r5 = r1
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            r2.oj(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L90:
            if (r1 == r0) goto L96
            int r1 = r1 + 1
            goto Lc
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.b4.b():void");
    }

    public final void c() {
        android.widget.LinearLayout linearLayout = this.f207167e;
        if (linearLayout.getParent() instanceof android.view.ViewGroup) {
            android.view.ViewParent parent = linearLayout.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).setBackgroundColor(this.f207166d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r8 = this;
            r45.cp2 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.y3.f207519c
            r1 = 0
            java.lang.String r2 = "Finder.PopularDataManager"
            r3 = 1
            if (r0 != 0) goto L44
            boolean r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.y3.f207517a
            if (r4 != 0) goto L44
            if (r0 != 0) goto L15
            r45.cp2 r0 = new r45.cp2
            r0.<init>()
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.y3.f207519c = r0
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183678n
            r0.append(r4)
            java.lang.String r4 = "popular.info"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r4 = -1
            byte[] r0 = com.p314xaae8f345.mm.vfs.w6.N(r0, r1, r4)
            r45.cp2 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.y3.f207519c     // Catch: java.lang.Exception -> L3a
            if (r4 == 0) goto L34
            r4.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L3a
        L34:
            java.lang.String r0 = "read from File"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)     // Catch: java.lang.Exception -> L3a
            goto L42
        L3a:
            r0 = move-exception
            java.lang.String r4 = ""
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r0, r4, r5)
        L42:
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.y3.f207517a = r3
        L44:
            r45.cp2 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.y3.f207519c
            if (r0 == 0) goto L95
            int r4 = c01.id.e()
            long r4 = (long) r4
            long r6 = r0.m75942xfb822ef2(r1)
            long r4 = r4 - r6
            r6 = 60
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L64
            java.util.LinkedList r4 = r0.m75941xfb821914(r3)
            int r4 = r4.size()
            if (r4 <= 0) goto L64
            r4 = r3
            goto L65
        L64:
            r4 = r1
        L65:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "cur: "
            r5.<init>(r6)
            int r6 = c01.id.e()
            r5.append(r6)
            java.lang.String r6 = "  lastUpdateTime : "
            r5.append(r6)
            long r6 = r0.m75942xfb822ef2(r1)
            r5.append(r6)
            java.lang.String r6 = " isValid: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r5)
            if (r4 == 0) goto L95
            java.util.LinkedList r0 = r0.m75941xfb821914(r3)
            goto L96
        L95:
            r0 = 0
        L96:
            android.widget.LinearLayout r2 = r8.f207167e
            if (r0 == 0) goto Lab
            r2.setVisibility(r1)
            r2.requestFocus()
            java.util.List r2 = r8.f207171i
            if (r2 == 0) goto La7
            r2.isEmpty()
        La7:
            r8.a(r0, r1)
            goto Lb0
        Lab:
            r0 = 8
            r2.setVisibility(r0)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.b4.d():void");
    }
}
