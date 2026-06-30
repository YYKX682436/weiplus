package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class kd extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public android.widget.TextView A1;
    public android.widget.TextView B1;
    public com.tencent.mm.ui.widget.MMSwitchBtn C1;
    public android.view.View D1;
    public android.view.View E1;
    public com.tencent.mm.ui.widget.dialog.z2 F1;
    public com.tencent.mm.ui.widget.picker.c0 G1;
    public final java.util.List H;
    public boolean H1;
    public final com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI I;
    public boolean I1;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.ui.vd f110225J;
    public int J1;
    public final int K;
    public final r45.hn1 K1;
    public final java.lang.String L;
    public final r45.re2 L1;
    public final java.util.List M;
    public final boolean N;
    public final jz5.g P;
    public android.view.View Q;
    public android.view.View R;
    public android.widget.TextView S;
    public android.view.View T;
    public android.view.View U;
    public android.widget.TextView V;
    public android.view.View W;
    public android.view.View X;
    public android.widget.TextView Y;
    public android.view.View Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.TextView f110226l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.TextView f110227p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.TextView f110228p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.TextView f110229x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.View f110230x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.View f110231y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.TextView f110232y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.view.View f110233z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(android.content.Context context, java.util.List visitorFileList, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI hostActivity, com.tencent.mm.plugin.finder.feed.ui.vd mode, int i17, java.lang.String str, java.util.List list5, boolean z17, boolean z18, boolean z19, int i18, r45.hn1 lastLiveChargeInfo) {
        super(context, false, null, -1.0f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(visitorFileList, "visitorFileList");
        kotlin.jvm.internal.o.g(hostActivity, "hostActivity");
        kotlin.jvm.internal.o.g(mode, "mode");
        kotlin.jvm.internal.o.g(lastLiveChargeInfo, "lastLiveChargeInfo");
        this.H = visitorFileList;
        this.I = hostActivity;
        this.f110225J = mode;
        this.K = i17;
        this.L = str;
        this.M = list5;
        this.N = z17;
        this.P = jz5.h.b(com.tencent.mm.plugin.finder.feed.ui.tc.f110565d);
        this.H1 = z18;
        this.I1 = z19;
        this.J1 = i18;
        r45.hn1 hn1Var = new r45.hn1();
        hn1Var.parseFrom(lastLiveChargeInfo.toByteArray());
        this.K1 = hn1Var;
        r45.re2 re2Var = new r45.re2();
        java.util.LinkedList list6 = re2Var.getList(4);
        java.util.List list7 = kz5.p0.f313996d;
        list6.addAll(list4 != null ? list4 : list7);
        re2Var.getList(0).addAll(list != null ? list : list7);
        re2Var.getList(1).addAll(list2 != null ? list2 : list7);
        re2Var.getList(2).addAll(list != null ? list : list7);
        re2Var.getList(2).addAll(list2 != null ? list2 : list7);
        re2Var.getList(3).addAll(list3 != null ? list3 : list7);
        this.L1 = re2Var;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.e8_;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        a0(this.f118183e.getDrawable(com.tencent.mm.R.drawable.clh));
        d0();
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.i8_);
        this.Q = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.uc(this));
        }
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.i89);
        this.S = textView;
        if (textView != null) {
            hc2.o.a(textView, false);
        }
        this.R = rootView.findViewById(com.tencent.mm.R.id.i8a);
        this.U = rootView.findViewById(com.tencent.mm.R.id.i7g);
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.i7e);
        this.T = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.vc(this));
        }
        com.tencent.mm.plugin.finder.feed.ui.vd vdVar = com.tencent.mm.plugin.finder.feed.ui.vd.f110651f;
        com.tencent.mm.plugin.finder.feed.ui.vd vdVar2 = this.f110225J;
        int i17 = 8;
        if (vdVar2 == vdVar) {
            android.view.View view = this.Q;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = this.U;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view3 = this.Q;
            if (view3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view4 = this.U;
            if (view4 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.V = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.i7i);
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.i7h);
        int i18 = ((java.lang.Boolean) ((jz5.n) this.P).getValue()).booleanValue() ? 0 : 4;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
        arrayList5.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.W = findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.i7l);
        this.X = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.wc(this));
        }
        this.Y = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.i7n);
        this.Z = rootView.findViewById(com.tencent.mm.R.id.u9c);
        this.f110227p0 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.t6q);
        this.f110229x0 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.t6r);
        this.f110233z1 = rootView.findViewById(com.tencent.mm.R.id.u9a);
        this.A1 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.t6i);
        this.B1 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.t6j);
        this.f110231y0 = rootView.findViewById(com.tencent.mm.R.id.u9b);
        this.f110226l1 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.t6l);
        this.f110228p1 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.t6m);
        this.f110230x1 = rootView.findViewById(com.tencent.mm.R.id.t6k);
        android.widget.TextView textView2 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.kpi);
        this.f110232y1 = textView2;
        if (textView2 != null) {
            ne2.c.f336527a.c(textView2);
        }
        this.C1 = (com.tencent.mm.ui.widget.MMSwitchBtn) rootView.findViewById(com.tencent.mm.R.id.igv);
        android.widget.TextView textView3 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.igu);
        zl2.q4 q4Var = zl2.q4.f473933a;
        zl2.r4 r4Var = zl2.r4.f473950a;
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        boolean F = q4Var.F(r4Var.T1(e1Var != null ? e1Var.f328989s : null));
        boolean z17 = this.N;
        textView3.setText((F && z17) ? textView3.getContext().getString(com.tencent.mm.R.string.lvu) : z17 ? textView3.getContext().getString(com.tencent.mm.R.string.lvd) : textView3.getContext().getString(com.tencent.mm.R.string.egy));
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.igw);
        if (vdVar2 == vdVar) {
            mm2.e1 e1Var2 = (mm2.e1) efVar.i(mm2.e1.class);
            if (q4Var.F(r4Var.T1(e1Var2 != null ? e1Var2.f328989s : null)) || z17) {
                i17 = 0;
            }
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(findViewById5, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.D1 = findViewById5;
        this.E1 = rootView.findViewById(com.tencent.mm.R.id.u9n);
        android.view.View G = G();
        if (G != null) {
            G.setEnabled(false);
        }
        boolean z18 = pm0.v.z(this.J1, 1);
        boolean z19 = pm0.v.z(this.J1, 2);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.C1;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(z18 || z19);
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = this.C1;
        if (mMSwitchBtn2 != null) {
            mMSwitchBtn2.setSwitchListener(new com.tencent.mm.plugin.finder.feed.ui.jd(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void U() {
        r45.hf5 hf5Var;
        com.tencent.mm.plugin.finder.feed.ui.vd vdVar = com.tencent.mm.plugin.finder.feed.ui.vd.f110651f;
        com.tencent.mm.plugin.finder.feed.ui.vd vdVar2 = this.f110225J;
        r45.re2 re2Var = this.L1;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI finderLiveVisitorWhiteListUI = this.I;
        if (vdVar2 == vdVar) {
            r45.hn1 hn1Var = this.K1;
            r45.hf5 hf5Var2 = (r45.hf5) hn1Var.getCustom(3);
            if (hf5Var2 != null && hf5Var2.getInteger(0) == 1) {
                r45.hf5 hf5Var3 = (r45.hf5) hn1Var.getCustom(3);
                if (hf5Var3 != null) {
                    hf5Var3.set(2, 0);
                }
            } else {
                r45.hf5 hf5Var4 = (r45.hf5) hn1Var.getCustom(3);
                if ((hf5Var4 != null && hf5Var4.getInteger(0) == 2) && (hf5Var = (r45.hf5) hn1Var.getCustom(3)) != null) {
                    hf5Var.set(1, 0);
                }
            }
            hn1Var.set(2, re2Var);
            com.tencent.mars.xlog.Log.i("FinderLiveVisibilityModeConfigPanel", "after adjustLiveChargeInfo liveChargeInfo:" + cm2.a.f43328a.k(hn1Var));
            finderLiveVisitorWhiteListUI.f109434y1 = this.I1;
            finderLiveVisitorWhiteListUI.f109436z1 = this.J1;
            finderLiveVisitorWhiteListUI.A1 = hn1Var;
            finderLiveVisitorWhiteListUI.B1 = this.H1;
        }
        java.util.LinkedList list = re2Var.getList(4);
        kotlin.jvm.internal.o.f(list, "getLabel_list(...)");
        finderLiveVisitorWhiteListUI.getClass();
        finderLiveVisitorWhiteListUI.H1 = list;
        java.util.LinkedList list2 = re2Var.getList(1);
        kotlin.jvm.internal.o.f(list2, "getUsername_list(...)");
        finderLiveVisitorWhiteListUI.G1 = list2;
        java.util.LinkedList list3 = re2Var.getList(0);
        kotlin.jvm.internal.o.f(list3, "getChatroom_id_list(...)");
        finderLiveVisitorWhiteListUI.F1 = list3;
        java.util.LinkedList list4 = re2Var.getList(3);
        kotlin.jvm.internal.o.f(list4, "getAudience_list(...)");
        finderLiveVisitorWhiteListUI.E1 = list4;
        finderLiveVisitorWhiteListUI.I1 = re2Var;
        finderLiveVisitorWhiteListUI.t7();
        com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        if ((!r3.isEmpty()) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0() {
        /*
            r6 = this;
            com.tencent.mm.plugin.finder.feed.ui.vd r0 = com.tencent.mm.plugin.finder.feed.ui.vd.f110651f
            r1 = 0
            r2 = 1
            com.tencent.mm.plugin.finder.feed.ui.vd r3 = r6.f110225J
            if (r3 != r0) goto L23
            int r0 = r6.f0()
            android.view.View r3 = r6.G()
            if (r3 != 0) goto L14
            goto L83
        L14:
            r45.hn1 r4 = r6.K1
            int r4 = r4.getInteger(r2)
            if (r4 <= 0) goto L1f
            if (r0 <= 0) goto L1f
            r1 = r2
        L1f:
            r3.setEnabled(r1)
            goto L83
        L23:
            android.view.View r0 = r6.G()
            if (r0 != 0) goto L2a
            goto L83
        L2a:
            r3 = 2
            r45.re2 r4 = r6.L1
            java.util.LinkedList r3 = r4.getList(r3)
            java.lang.String r5 = "getContact_list(...)"
            kotlin.jvm.internal.o.f(r3, r5)
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r2
            if (r3 != 0) goto L7f
            r3 = 3
            java.util.LinkedList r3 = r4.getList(r3)
            java.lang.String r5 = "getAudience_list(...)"
            kotlin.jvm.internal.o.f(r3, r5)
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r2
            if (r3 != 0) goto L7f
            r3 = 4
            java.util.LinkedList r3 = r4.getList(r3)
            java.lang.String r5 = "getLabel_list(...)"
            kotlin.jvm.internal.o.f(r3, r5)
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r2
            if (r3 != 0) goto L7f
            java.util.LinkedList r3 = r4.getList(r2)
            java.lang.String r5 = "getUsername_list(...)"
            kotlin.jvm.internal.o.f(r3, r5)
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r2
            if (r3 != 0) goto L7f
            java.util.LinkedList r3 = r4.getList(r1)
            java.lang.String r4 = "getChatroom_id_list(...)"
            kotlin.jvm.internal.o.f(r3, r4)
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r2
            if (r3 == 0) goto L80
        L7f:
            r1 = r2
        L80:
            r0.setEnabled(r1)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.kd.e0():void");
    }

    public final int f0() {
        r45.hn1 hn1Var = this.K1;
        r45.hf5 hf5Var = (r45.hf5) hn1Var.getCustom(3);
        if (hf5Var != null && hf5Var.getInteger(0) == 2) {
            r45.hf5 hf5Var2 = (r45.hf5) hn1Var.getCustom(3);
            if (hf5Var2 != null) {
                return hf5Var2.getInteger(2);
            }
            return 0;
        }
        r45.hf5 hf5Var3 = (r45.hf5) hn1Var.getCustom(3);
        if (hf5Var3 != null) {
            return hf5Var3.getInteger(1);
        }
        return 0;
    }

    public final void g0() {
        com.tencent.mm.plugin.finder.feed.ui.vd vdVar = this.f110225J;
        int ordinal = vdVar.ordinal();
        android.content.Context context = this.f118183e;
        java.lang.String string = ordinal != 1 ? ordinal != 2 ? ordinal != 4 ? "" : context.getString(com.tencent.mm.R.string.ovo) : context.getString(com.tencent.mm.R.string.ovs) : context.getString(com.tencent.mm.R.string.nwn);
        kotlin.jvm.internal.o.d(string);
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.ovq, string);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        c0(string2);
        if (vdVar == com.tencent.mm.plugin.finder.feed.ui.vd.f110651f) {
            h0(this.K1.getInteger(1));
            j0();
            android.widget.TextView textView = this.f110229x0;
            if (textView != null) {
                textView.setText(context.getResources().getString(com.tencent.mm.R.string.d9q));
            }
            android.widget.TextView textView2 = this.f110228p1;
            if (textView2 != null) {
                textView2.setText(context.getResources().getString(com.tencent.mm.R.string.f491494np1));
            }
            android.widget.TextView textView3 = this.B1;
            if (textView3 != null) {
                textView3.setText(context.getResources().getString(com.tencent.mm.R.string.oph));
            }
        } else {
            android.widget.TextView textView4 = this.f110229x0;
            if (textView4 != null) {
                textView4.setText(context.getString(com.tencent.mm.R.string.noe));
            }
            android.widget.TextView textView5 = this.f110228p1;
            if (textView5 != null) {
                textView5.setText(context.getString(com.tencent.mm.R.string.nwp));
            }
            android.widget.TextView textView6 = this.B1;
            if (textView6 != null) {
                textView6.setText(context.getString(com.tencent.mm.R.string.oom));
            }
        }
        r45.re2 re2Var = this.L1;
        kotlin.jvm.internal.o.f(re2Var.getList(2), "getContact_list(...)");
        if (!r1.isEmpty()) {
            android.widget.TextView textView7 = this.f110227p0;
            if (textView7 != null) {
                com.tencent.mm.plugin.finder.feed.ui.wd wdVar = com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI.J1;
                java.util.LinkedList list = re2Var.getList(2);
                kotlin.jvm.internal.o.f(list, "getContact_list(...)");
                textView7.setText(wdVar.c(list));
            }
            android.widget.TextView textView8 = this.f110227p0;
            if (textView8 != null) {
                textView8.setTextColor(context.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
            }
        } else {
            android.widget.TextView textView9 = this.f110227p0;
            if (textView9 != null) {
                textView9.setText(context.getString(com.tencent.mm.R.string.oox));
            }
            android.widget.TextView textView10 = this.f110227p0;
            if (textView10 != null) {
                textView10.setTextColor(context.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
            }
        }
        kotlin.jvm.internal.o.f(re2Var.getList(3), "getAudience_list(...)");
        if (!r3.isEmpty()) {
            android.widget.TextView textView11 = this.f110226l1;
            if (textView11 != null) {
                textView11.setText(com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI.J1.b(re2Var.getList(3)));
            }
            android.widget.TextView textView12 = this.f110226l1;
            if (textView12 != null) {
                textView12.setTextColor(context.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
            }
        } else {
            android.widget.TextView textView13 = this.f110226l1;
            if (textView13 != null) {
                textView13.setText(context.getString(com.tencent.mm.R.string.ovm));
            }
            android.widget.TextView textView14 = this.f110226l1;
            if (textView14 != null) {
                textView14.setTextColor(context.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
            }
        }
        kotlin.jvm.internal.o.f(re2Var.getList(4), "getLabel_list(...)");
        if (!r1.isEmpty()) {
            android.widget.TextView textView15 = this.A1;
            if (textView15 != null) {
                com.tencent.mm.plugin.finder.feed.ui.wd wdVar2 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI.J1;
                java.util.LinkedList list2 = re2Var.getList(4);
                kotlin.jvm.internal.o.f(list2, "getLabel_list(...)");
                textView15.setText(wdVar2.a(list2));
            }
            android.widget.TextView textView16 = this.A1;
            if (textView16 != null) {
                textView16.setTextColor(context.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
            }
        } else {
            android.widget.TextView textView17 = this.A1;
            if (textView17 != null) {
                textView17.setText(context.getString(com.tencent.mm.R.string.ool));
            }
            android.widget.TextView textView18 = this.A1;
            if (textView18 != null) {
                textView18.setTextColor(context.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
            }
        }
        if (this.H.isEmpty()) {
            android.widget.TextView textView19 = this.f110232y1;
            if (textView19 != null) {
                textView19.setVisibility(0);
            }
            android.view.View view = this.f110230x1;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView20 = this.f110226l1;
            if (textView20 != null) {
                textView20.setVisibility(8);
            }
        } else {
            android.widget.TextView textView21 = this.f110232y1;
            if (textView21 != null) {
                textView21.setVisibility(8);
            }
            android.view.View view2 = this.f110230x1;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView22 = this.f110226l1;
            if (textView22 != null) {
                textView22.setVisibility(0);
            }
        }
        e0();
        android.view.View view3 = this.Z;
        if (view3 != null) {
            view3.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.zc(this));
        }
        android.view.View view4 = this.f110233z1;
        if (view4 != null) {
            view4.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.bd(this));
        }
        android.view.View view5 = this.f110231y0;
        if (view5 != null) {
            view5.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.ed(this));
        }
    }

    public final void h0(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        r45.hn1 hn1Var = this.K1;
        hn1Var.set(1, valueOf);
        android.content.Context context = this.f118183e;
        if (i17 > 0) {
            android.widget.TextView textView = this.S;
            if (textView != null) {
                textView.setText(java.lang.String.valueOf(hn1Var.getInteger(1)));
            }
            android.widget.TextView textView2 = this.S;
            if (textView2 != null) {
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
            }
            android.view.View view = this.R;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "setChargeCost", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "setChargeCost", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            hn1Var.set(0, 2);
        } else {
            android.widget.TextView textView3 = this.S;
            if (textView3 != null) {
                textView3.setText(context.getResources().getString(com.tencent.mm.R.string.d9v));
            }
            android.widget.TextView textView4 = this.S;
            if (textView4 != null) {
                textView4.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
            }
            android.view.View view2 = this.R;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "setChargeCost", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel", "setChargeCost", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            hn1Var.set(0, 0);
        }
        e0();
    }

    public final void i0() {
        new com.tencent.mm.plugin.finder.view.zp(this.f118183e, new com.tencent.mm.plugin.finder.feed.ui.fd(this)).a(kz5.c0.i(10, 500, 1000, 2000));
    }

    public final void j0() {
        int integer;
        r45.hn1 hn1Var = this.K1;
        r45.hf5 hf5Var = (r45.hf5) hn1Var.getCustom(3);
        boolean z17 = false;
        if (hf5Var != null && hf5Var.getInteger(0) == 2) {
            z17 = true;
        }
        android.content.Context context = this.f118183e;
        if (z17) {
            android.widget.TextView textView = this.V;
            if (textView != null) {
                textView.setText(context.getString(com.tencent.mm.R.string.d8t));
            }
            r45.hf5 hf5Var2 = (r45.hf5) hn1Var.getCustom(3);
            integer = hf5Var2 != null ? hf5Var2.getInteger(2) : 180;
            android.widget.TextView textView2 = this.Y;
            if (textView2 != null) {
                textView2.setText(ne2.c.f336527a.a(context, integer, 2));
            }
        } else {
            android.widget.TextView textView3 = this.V;
            if (textView3 != null) {
                textView3.setText(context.getString(com.tencent.mm.R.string.d8r));
            }
            r45.hf5 hf5Var3 = (r45.hf5) hn1Var.getCustom(3);
            integer = hf5Var3 != null ? hf5Var3.getInteger(1) : 180;
            android.widget.TextView textView4 = this.Y;
            if (textView4 != null) {
                textView4.setText(ne2.c.f336527a.a(context, integer, 1));
            }
        }
        if (this.H1) {
            android.widget.TextView textView5 = this.Y;
            if (textView5 != null) {
                textView5.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
                return;
            }
            return;
        }
        android.widget.TextView textView6 = this.Y;
        if (textView6 != null) {
            textView6.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View v() {
        android.widget.TextView x17 = x();
        x17.setText(x17.getContext().getString(com.tencent.mm.R.string.f491729m94));
        x17.setTextSize(17.0f);
        int b17 = i65.a.b(x17.getContext(), 12);
        x17.setPadding(b17, 0, b17, 0);
        x17.setTextColor(x17.getContext().getResources().getColor(com.tencent.mm.R.color.f478838io));
        x17.setBackgroundDrawable(x17.getContext().getDrawable(com.tencent.mm.R.drawable.f481060jo));
        x17.setMinWidth((int) x17.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479723df));
        x17.setMinHeight((int) x17.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479714d7));
        x17.setGravity(17);
        return x17;
    }
}
