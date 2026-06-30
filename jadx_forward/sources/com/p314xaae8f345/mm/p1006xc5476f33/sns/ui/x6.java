package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes11.dex */
public class x6 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk {
    @Override // ql5.d
    public android.view.View b(int i17, int i18, boolean z17, android.view.View view, android.view.ViewGroup viewGroup) {
        final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.n nVar;
        android.view.View view2;
        java.lang.String str;
        java.lang.CharSequence charSequence;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRealChildView", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRealChildView", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        zd4.o oVar = this.f253068f;
        int n17 = oVar.n(i17);
        if (view == null) {
            int i19 = this.f253072j;
            android.view.LayoutInflater layoutInflater = this.f253071i;
            view2 = i19 == 1 ? layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cs_, (android.view.ViewGroup) null) : layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cs9, (android.view.ViewGroup) null);
            nVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.n();
            nVar.f252755a = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9q);
            nVar.f252756b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9p);
            nVar.f252757c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9o);
            nVar.f252758d = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9n);
            nVar.f252759e = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9h);
            android.widget.ImageView imageView = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.n9m);
            nVar.f252760f = imageView;
            imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.xk$$a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    java.lang.String str2;
                    java.lang.String str3;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk xkVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.this;
                    xkVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$getRealChildView$0", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view3);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsLabelUIAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", xkVar, array);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zk zkVar = (view3.getTag() == null || !(view3.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zk)) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zk) view3.getTag();
                    if (zkVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.AnimatedExpandableListAdapter", "dividerIv tag is null.");
                        yj0.a.h(xkVar, "com/tencent/mm/plugin/sns/ui/SnsLabelUIAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$getRealChildView$0", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yk ykVar = xkVar.f253082t;
                    if (ykVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$1");
                        int i27 = zkVar.f253230a;
                        int i28 = zkVar.f253231b;
                        int i29 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c.D;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c abstractActivityC18396x51e3f06c = ((zd4.d) ykVar).f553161a;
                        abstractActivityC18396x51e3f06c.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("gotoEditTag", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        if (abstractActivityC18396x51e3f06c.f252216q != null) {
                            str2 = "lambda$getRealChildView$0";
                            str3 = "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter";
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "gotoEditTag: groupPosition:%d, childPosition:%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
                            java.lang.Object child = abstractActivityC18396x51e3f06c.f252216q.getChild(i27, i28);
                            if (child != null && (child instanceof java.lang.String)) {
                                java.lang.String str4 = (java.lang.String) child;
                                java.lang.String e17 = ((b93.b) c93.a.a()).e(str4);
                                android.content.Intent intent = new android.content.Intent();
                                intent.putExtra("label_id", e17);
                                intent.putExtra("label_name", str4);
                                intent.putExtra("is_show_delete", false);
                                intent.putExtra("key_label_click_source", 3);
                                intent.putExtra("last_page_source_type", 1);
                                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_new_contact_label_ui, 1) == 1) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactEditLabel ");
                                    j45.l.n(abstractActivityC18396x51e3f06c.mo55332x76847179(), "label", ".ui.ContactEditLabel", intent, 4002);
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactLabelEditUI ");
                                    j45.l.n(abstractActivityC18396x51e3f06c.mo55332x76847179(), "label", ".ui.ContactLabelEditUI", intent, 4002);
                                }
                            }
                        } else {
                            str2 = "lambda$getRealChildView$0";
                            str3 = "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter";
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("gotoEditTag", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$1");
                    } else {
                        str2 = "lambda$getRealChildView$0";
                        str3 = "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter";
                    }
                    yj0.a.h(xkVar, "com/tencent/mm/plugin/sns/ui/SnsLabelUIAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str3);
                }
            });
            view2.setTag(nVar);
        } else {
            nVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.n) view.getTag();
            view2 = view;
        }
        boolean a17 = oVar.a(n17, i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.f253063x);
        android.content.Context context = this.f253070h;
        if (a17) {
            nVar.f252755a.setVisibility(8);
            nVar.f252756b.setVisibility(8);
            nVar.f252759e.setVisibility(8);
            nVar.f252760f.setVisibility(8);
            nVar.f252757c.setVisibility(0);
            nVar.f252758d.setVisibility(0);
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.f253063x;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter");
            nVar.f252757c.setText(i65.a.r(context, oVar.e(n17, i27)));
            nVar.f252758d.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            nVar.f252758d.setSingleLine(false);
            if (oVar.o(n17, 2)) {
                if (this.f253078p.isEmpty()) {
                    nVar.f252758d.setText(i65.a.r(context, oVar.d(n17, i27)));
                } else {
                    nVar.f252758d.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                    if (!android.text.TextUtils.isEmpty(this.f253083u)) {
                        nVar.f252758d.setText(this.f253083u);
                        nVar.f252758d.setVisibility(0);
                    } else if (this.f253078p.size() < 500) {
                        java.lang.CharSequence j17 = j(this.f253078p, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6d));
                        this.f253083u = j17;
                        nVar.f252758d.setText(j17);
                        nVar.f252758d.setVisibility(0);
                    } else {
                        final ru3.f fVar = new ru3.f();
                        fVar.b(context, false, com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18443x6cc340f());
                        final java.util.ArrayList arrayList = this.f253078p;
                        final int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6d);
                        final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.al alVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.al() { // from class: com.tencent.mm.plugin.sns.ui.xk$$c
                            @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.al
                            public final void a(final java.lang.CharSequence charSequence2) {
                                final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk xkVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.this;
                                final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.n nVar2 = nVar;
                                final ru3.f fVar2 = fVar;
                                xkVar.getClass();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$getRealChildView$3", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.xk$$h
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk xkVar2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.this;
                                        xkVar2.getClass();
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$getRealChildView$2", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                                        java.lang.CharSequence charSequence3 = charSequence2;
                                        xkVar2.f253083u = charSequence3;
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.n nVar3 = nVar2;
                                        nVar3.f252758d.setText(charSequence3);
                                        nVar3.f252758d.setVisibility(0);
                                        fVar2.a();
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$getRealChildView$2", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                                    }
                                });
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$getRealChildView$3", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                            }
                        };
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("packageContactName", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                        ((ku5.t0) ku5.t0.f394148d).a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.xk$$f
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk xkVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.this;
                                xkVar.getClass();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$packageContactName$7", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                java.lang.CharSequence j18 = xkVar.j(arrayList, color);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AnimatedExpandableListAdapter", "packageContactName cost:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                                alVar.a(j18);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$packageContactName$7", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                            }
                        });
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("packageContactName", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                    }
                }
            } else if (oVar.o(n17, 3)) {
                if (this.f253079q.isEmpty()) {
                    nVar.f252758d.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5));
                    java.lang.String r17 = i65.a.r(context, oVar.d(n17, i27));
                    nVar.f252758d.setText(r17);
                    if (r17.isEmpty()) {
                        nVar.f252758d.setVisibility(8);
                    } else {
                        nVar.f252758d.setVisibility(0);
                    }
                } else {
                    nVar.f252758d.setVisibility(0);
                    nVar.f252758d.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                    if (!android.text.TextUtils.isEmpty(this.f253084v)) {
                        nVar.f252758d.setText(this.f253084v);
                        nVar.f252758d.setVisibility(0);
                    } else if (this.f253079q.size() < 500) {
                        java.lang.CharSequence j18 = j(this.f253079q, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6e));
                        this.f253084v = j18;
                        nVar.f252758d.setText(j18);
                        nVar.f252758d.setVisibility(0);
                    } else {
                        final ru3.f fVar2 = new ru3.f();
                        fVar2.b(context, false, com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18445x6cc3411());
                        final java.util.ArrayList arrayList2 = this.f253079q;
                        final int color2 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6e);
                        final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.al alVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.al() { // from class: com.tencent.mm.plugin.sns.ui.xk$$e
                            @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.al
                            public final void a(final java.lang.CharSequence charSequence2) {
                                final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk xkVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.this;
                                final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.n nVar2 = nVar;
                                final ru3.f fVar3 = fVar2;
                                xkVar.getClass();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$getRealChildView$6", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.xk$$g
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk xkVar2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.this;
                                        xkVar2.getClass();
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$getRealChildView$5", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                                        java.lang.CharSequence charSequence3 = charSequence2;
                                        xkVar2.f253084v = charSequence3;
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.n nVar3 = nVar2;
                                        nVar3.f252758d.setText(charSequence3);
                                        nVar3.f252758d.setVisibility(0);
                                        fVar3.a();
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$getRealChildView$5", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                                    }
                                });
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$getRealChildView$6", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                            }
                        };
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("packageContactName", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                        ((ku5.t0) ku5.t0.f394148d).a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.xk$$f
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk xkVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.this;
                                xkVar.getClass();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$packageContactName$7", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                java.lang.CharSequence j182 = xkVar.j(arrayList2, color2);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AnimatedExpandableListAdapter", "packageContactName cost:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                                alVar2.a(j182);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$packageContactName$7", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                            }
                        });
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("packageContactName", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                    }
                }
            }
        } else if (oVar.a(n17, i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.f253062w)) {
            nVar.f252755a.setVisibility(8);
            nVar.f252759e.setVisibility(8);
            nVar.f252760f.setVisibility(8);
            nVar.f252757c.setVisibility(0);
            nVar.f252756b.setVisibility(8);
            nVar.f252758d.setVisibility(0);
            int i28 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.f253062w;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter");
            nVar.f252757c.setText(i65.a.r(context, oVar.e(n17, i28)));
            nVar.f252758d.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            nVar.f252758d.setSingleLine(false);
            java.util.ArrayList arrayList3 = this.f253077o;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c.X6(arrayList3);
            if (!oVar.o(n17, 3)) {
                java.util.ArrayList arrayList4 = this.f253076n;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c.X6(arrayList4);
                if (arrayList4.isEmpty()) {
                    nVar.f252758d.setText(i65.a.r(context, oVar.d(n17, i28)));
                } else {
                    nVar.f252758d.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                    nVar.f252758d.setText(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.k(arrayList4, true, com.p314xaae8f345.mm.R.C30859x5a72f63.a6d));
                }
            } else if (arrayList3.isEmpty()) {
                nVar.f252758d.setText(i65.a.r(context, oVar.d(n17, i28)));
            } else {
                nVar.f252758d.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                nVar.f252758d.setText(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.k(arrayList3, true, com.p314xaae8f345.mm.R.C30859x5a72f63.a6e));
            }
        } else {
            if (!this.f253066d || !oVar.a(n17, i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.f253064y)) {
                int f17 = i18 - f();
                android.widget.ImageView imageView2 = nVar.f252760f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initMoreBtnIndicator", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                java.lang.Object tag = imageView2.getTag();
                if (tag == null || !(tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zk)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zk zkVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zk(this);
                    zkVar.f253230a = i17;
                    zkVar.f253231b = f17;
                    imageView2.setTag(zkVar);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zk zkVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zk) imageView2.getTag();
                    zkVar2.f253230a = i17;
                    zkVar2.f253231b = f17;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initMoreBtnIndicator", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                nVar.f252755a.setVisibility(0);
                nVar.f252756b.setVisibility(0);
                nVar.f252759e.setVisibility(0);
                nVar.f252760f.setVisibility(0);
                nVar.f252757c.setVisibility(8);
                nVar.f252758d.setVisibility(8);
                java.lang.String str2 = (java.lang.String) this.f253069g.get(f17);
                android.widget.TextView textView = nVar.f252755a;
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2));
                android.widget.TextView textView2 = nVar.f252756b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                java.util.List<java.lang.String> j19 = ((b93.b) c93.a.a()).j(((b93.b) c93.a.a()).e(str2));
                if (j19 == null || j19.size() == 0) {
                    str = "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter";
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                    charSequence = "";
                } else {
                    str = "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter";
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(j19.size());
                    for (java.lang.String str3 : j19) {
                        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                        ((sg3.a) v0Var).getClass();
                        arrayList5.add(c01.a2.e(str3));
                    }
                    java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList5, ",");
                    ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                    charSequence = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, c17);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                }
                textView2.setText(charSequence);
                nVar.f252760f.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f81106x4448d04, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5)));
                if (this.f253072j == 1) {
                    if (oVar.o(n17, 2)) {
                        if (h(1, str2)) {
                            nVar.f252759e.setImageResource(com.p314xaae8f345.mm.R.raw.f81056x99940718);
                        } else {
                            nVar.f252759e.setImageResource(com.p314xaae8f345.mm.R.raw.f81058x89594171);
                        }
                    } else if (oVar.o(n17, 3)) {
                        if (this.f253073k != i17) {
                            nVar.f252759e.setImageResource(com.p314xaae8f345.mm.R.raw.f81059xcf3608c3);
                        } else {
                            nVar.f252759e.setImageResource(com.p314xaae8f345.mm.R.raw.f81057x13b7a2ea);
                        }
                        if (h(2, str2)) {
                            nVar.f252759e.setImageResource(com.p314xaae8f345.mm.R.raw.f81057x13b7a2ea);
                        } else {
                            nVar.f252759e.setImageResource(com.p314xaae8f345.mm.R.raw.f81059xcf3608c3);
                        }
                    }
                } else if (oVar.o(n17, 2)) {
                    if (h(1, str2)) {
                        nVar.f252759e.setImageResource(com.p314xaae8f345.mm.R.raw.f78834xa20f9397);
                    } else {
                        nVar.f252759e.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562789oo);
                    }
                } else if (oVar.o(n17, 3)) {
                    if (h(2, str2)) {
                        nVar.f252759e.setImageResource(com.p314xaae8f345.mm.R.raw.f78848x228ad7e9);
                    } else {
                        nVar.f252759e.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562789oo);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealChildView", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                view2.setPadding(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj), view2.getPaddingTop(), view2.getPaddingRight(), view2.getPaddingBottom());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealChildView", str);
                return view2;
            }
            int i29 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.f253064y;
            nVar.f252757c.setVisibility(0);
            nVar.f252757c.setText(i65.a.r(context, oVar.e(n17, i29)));
            nVar.f252758d.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6e));
            if (oVar.o(n17, 3)) {
                nVar.f252758d.setText(i65.a.r(context, oVar.d(n17, i29)));
                if (this.f253067e) {
                    nVar.f252758d.setVisibility(0);
                } else {
                    nVar.f252758d.setVisibility(8);
                }
            }
        }
        str = "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealChildView", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        view2.setPadding(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj), view2.getPaddingTop(), view2.getPaddingRight(), view2.getPaddingBottom());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealChildView", str);
        return view2;
    }
}
