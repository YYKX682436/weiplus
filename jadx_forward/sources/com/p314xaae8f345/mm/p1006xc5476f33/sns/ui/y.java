package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class y extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f253126d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f253127e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f253128f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f253129g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public int f253130h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f253131i = 0;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.w f253132m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z f253133n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.r f253134o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f253135p;

    /* renamed from: q, reason: collision with root package name */
    public r45.za f253136q;

    public y(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.r rVar) {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f253135p = "";
        this.f253126d = abstractActivityC21394xb3d2c0cf;
        this.f253135p = str;
        this.f253132m = wVar;
        this.f253134o = rVar;
        this.f253133n = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z(abstractActivityC21394xb3d2c0cf, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q(this));
        a();
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetCursor", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z zVar = this.f253133n;
        if (zVar != null) {
            ((qz.c) ((rz.q) i95.n0.c(rz.q.class))).getClass();
            f21.r0.Bi().getClass();
            java.lang.String a17 = zz1.a.a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetCursor", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
            zVar.f253190g = this.f253135p;
            zVar.f253191h = a17;
            zVar.a(true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetCursor", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetCursor", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
    }

    public final void c(int i17, android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x xVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImgInfo", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        r45.jj4 jj4Var = (r45.jj4) getItem(i17);
        imageView.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v();
        vVar.f252139b = "";
        vVar.f252138a = i17;
        imageView.setTag(vVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().e0(jj4Var, imageView, this.f253126d.hashCode(), com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276840k);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImgInfo", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        int i17 = this.f253130h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        return i17;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        java.lang.Object obj = ((java.util.ArrayList) this.f253127e).get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemId", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x xVar;
        android.view.View view2;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x xVar2;
        java.lang.String str2 = "com.tencent.mm.plugin.sns.ui.ArtistAdapter";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createView", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x xVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x(this);
            android.view.View inflate = android.view.View.inflate(this.f253126d, com.p314xaae8f345.mm.R.C30864xbddafb2a.cqr, null);
            xVar3.f253000a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568589nc4);
            xVar3.f253001b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568590nc5);
            xVar3.f253002c = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.haa);
            xVar3.f253003d = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hab);
            xVar3.f253004e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hac);
            xVar3.f253005f = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567083i26);
            android.widget.ImageView imageView = xVar3.f253002c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.w wVar = this.f253132m;
            imageView.setOnClickListener(wVar.f252257a);
            xVar3.f253003d.setOnClickListener(wVar.f252258b);
            xVar3.f253004e.setOnClickListener(wVar.f252259c);
            inflate.setTag(xVar3);
            xVar = xVar3;
            view2 = inflate;
        } else {
            xVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x) view.getTag();
            view2 = view;
        }
        java.util.HashMap hashMap = (java.util.HashMap) this.f253128f;
        int intValue = hashMap.get(java.lang.Integer.valueOf(i17)) != null ? ((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i17))).intValue() : -1;
        xVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.ArtistAdapter$ViewHolder");
        xVar.f253002c.setVisibility(8);
        xVar.f253003d.setVisibility(8);
        xVar.f253004e.setVisibility(8);
        android.view.View view3 = xVar.f253005f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistAdapter$ViewHolder", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/ArtistAdapter$ViewHolder", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        java.lang.String str3 = xVar.f253006g.f253135p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        if (str3.equals("en")) {
            xVar.f253000a.setVisibility(8);
            xVar.f253001b.setVisibility(4);
        } else {
            xVar.f253000a.setVisibility(4);
            xVar.f253001b.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.ArtistAdapter$ViewHolder");
        if (intValue >= this.f253131i || intValue == -1) {
            str = "getView";
            view2.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 1));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            android.view.View view4 = view2;
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        } else {
            int i18 = intValue - 1;
            java.lang.String str4 = i18 >= 0 ? ((r45.jj4) getItem(i18)).f459390f : "";
            view2.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            android.view.View view5 = view2;
            str = "getView";
            java.lang.String str5 = str4;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x xVar4 = xVar;
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.HashMap hashMap2 = (java.util.HashMap) this.f253129g;
            int intValue2 = hashMap2.get(java.lang.Integer.valueOf(i17)) != null ? ((java.lang.Integer) hashMap2.get(java.lang.Integer.valueOf(i17))).intValue() : 1;
            r45.jj4 jj4Var = (r45.jj4) getItem(intValue);
            if (!jj4Var.f459390f.equals("") && jj4Var.f459390f.equals(str5)) {
                xVar2 = xVar4;
            } else if (this.f253135p.equals("en")) {
                xVar2 = xVar4;
                xVar2.f253001b.setVisibility(0);
                xVar2.f253001b.setText(jj4Var.f459390f + "");
                android.view.View view6 = xVar2.f253005f;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                xVar2 = xVar4;
                xVar2.f253000a.setVisibility(0);
                xVar2.f253000a.setText(jj4Var.f459390f + "");
                android.view.View view7 = xVar2.f253005f;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (intValue2 >= 1) {
                c(intValue, xVar2.f253002c, xVar2);
            }
            if (intValue2 >= 2) {
                c(intValue + 1, xVar2.f253003d, xVar2);
            }
            if (intValue2 >= 3) {
                c(intValue + 2, xVar2.f253004e, xVar2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.r rVar = this.f253134o;
            if (rVar != null) {
                r45.za zaVar = this.f253136q;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRefreshAuthor", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b activityC17940xbaa2983b = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p0) rVar).f251669a;
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b.U6(activityC17940xbaa2983b) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b.U6(activityC17940xbaa2983b).setVisibility(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b.U6(activityC17940xbaa2983b).m70546x66ad9b78(zaVar);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRefreshAuthor", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
            }
            str2 = "com.tencent.mm.plugin.sns.ui.ArtistAdapter";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
        return view2;
    }
}
