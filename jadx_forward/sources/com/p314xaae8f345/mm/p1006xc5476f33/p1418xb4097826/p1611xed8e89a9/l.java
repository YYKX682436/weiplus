package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9;

/* loaded from: classes2.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w f204927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f204928e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w wVar, boolean z17, java.util.List list) {
        this.f204927d = wVar;
        this.f204928e = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 m80997xdc5215a6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/FinderProfilePoiHandler$handlePoiList$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w wVar = this.f204927d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 b0Var = wVar.f205982f;
        final android.app.Activity activity = wVar.f205977a;
        if (b0Var == null) {
            java.lang.String str2 = wVar.f205986j;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 b0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0(activity);
            b0Var2.f204856q = str2;
            b0Var2.f204857r = wVar;
            b0Var2.f204853n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.k(wVar);
            wVar.f205982f = b0Var2;
        }
        if (wVar.f205983g == null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14871xa985f898.f204823z;
            android.view.Window window = activity.getWindow();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 b0Var3 = wVar.f205982f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfilePoiDrawer", "createDrawerToAttachWindow ");
            final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14871xa985f898 c14871xa985f898 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14871xa985f898(activity);
            c14871xa985f898.m58609xa443c70b(b0Var3);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.j();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c14871xa985f898.getContext(), "getContext(...)");
            jVar.f204923d = c14871xa985f898;
            c14871xa985f898.m82809x50955ab0(com.p314xaae8f345.mm.R.C30861xcebc809e.f563074w3);
            c14871xa985f898.m82805x59f38d7d(true);
            c14871xa985f898.h(jVar);
            int g17 = com.p314xaae8f345.mm.ui.bl.g(activity);
            layoutParams.bottomMargin = g17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfilePoiDrawer", "[initView] bottomMargin= " + g17);
            android.view.View decorView = window.getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((android.widget.FrameLayout) decorView).addView(c14871xa985f898, layoutParams);
            android.widget.FrameLayout headerLayout = c14871xa985f898.m82795xcb847e8d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerLayout, "headerLayout");
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570609b73, headerLayout);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            jVar.f204924e = inflate;
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.byz);
            if (findViewById != null) {
                findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.i(jVar));
            }
            if (findViewById != null) {
                jVar.g().k(findViewById);
            }
            android.view.View view2 = jVar.f204924e;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
                throw null;
            }
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.f565668d50);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14871xa985f898 g18 = jVar.g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linearLayout);
            g18.k(linearLayout);
            android.view.View view3 = jVar.f204924e;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
                throw null;
            }
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = (com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92) view3.findViewById(com.p314xaae8f345.mm.R.id.d4t);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14871xa985f898 g19 = jVar.g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22482x50bddb92);
            g19.k(c22482x50bddb92);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 rlLayout = c14871xa985f898.m82792x510df255();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rlLayout, "rlLayout");
            jVar.f204925f = rlLayout;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rlLayout.m82555x4905e9fa(), "<set-?>");
            if (b0Var3 != null) {
                android.view.View view4 = jVar.f204924e;
                if (view4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
                    throw null;
                }
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = jVar.f204925f;
                if (c22801x87cbdc00 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                    throw null;
                }
                b0Var3.f204854o = view4;
                c22801x87cbdc00.m82690xd3a27e96(false);
                c22801x87cbdc00.m82688x390c1d00(false);
                android.content.Context context = b0Var3.f204846d;
                android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570708bk1, (android.view.ViewGroup) null);
                b0Var3.f204849g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) inflate2.findViewById(com.p314xaae8f345.mm.R.id.m6l);
                c22801x87cbdc00.m82697xe136b7d8(inflate2);
                c22801x87cbdc00.m82683xb165a19d(b0Var3.f204857r);
                b0Var3.f204847e = c22801x87cbdc00;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = c22801x87cbdc00.m82555x4905e9fa();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m82555x4905e9fa, "<set-?>");
                b0Var3.f204848f = m82555x4905e9fa;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.z zVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.z(b0Var3);
                b0Var3.f204852m = zVar;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = b0Var3.f204848f;
                if (c1163xf1deaba4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                    throw null;
                }
                c1163xf1deaba4.mo7960x6cab2c8d(zVar);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = b0Var3.f204848f;
                if (c1163xf1deaba42 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                    throw null;
                }
                c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
                b0Var3.c(0);
            }
            android.widget.FrameLayout loadingLayout = c14871xa985f898.m82797xccb9a7d0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadingLayout, "loadingLayout");
            if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) activity).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer$Companion$createDrawerToAttachWindow$1
                    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                    /* renamed from: onDestroy */
                    public final void m58611xac79a11b() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14871xa985f898.this.b();
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) activity).mo273xed6858b4().c(this);
                    }
                });
            }
            wVar.f205983g = c14871xa985f898;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 b0Var4 = wVar.f205982f;
        java.util.List list = this.f204928e;
        if (b0Var4 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfilePoiListView", "[initPoiList] list size=" + list.size());
            if (list.size() >= 20) {
                android.view.View view5 = b0Var4.f204854o;
                android.widget.LinearLayout linearLayout2 = view5 != null ? (android.widget.LinearLayout) view5.findViewById(com.p314xaae8f345.mm.R.id.f565668d50) : null;
                android.view.View view6 = b0Var4.f204854o;
                if ((view6 != null ? view6.getLayoutParams() : null) instanceof android.widget.LinearLayout.LayoutParams) {
                    android.view.View view7 = b0Var4.f204854o;
                    android.view.ViewGroup.LayoutParams layoutParams2 = view7 != null ? view7.getLayoutParams() : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    ((android.widget.LinearLayout.LayoutParams) layoutParams2).bottomMargin = b0Var4.f204846d.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
                }
                android.view.View view8 = b0Var4.f204854o;
                com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb922 = view8 != null ? (com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92) view8.findViewById(com.p314xaae8f345.mm.R.id.d4t) : null;
                b0Var4.f204855p = c22482x50bddb922;
                if (c22482x50bddb922 != null) {
                    c22482x50bddb922.f291368d.setVisibility(8);
                    c22482x50bddb922.f291370f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.abq);
                    c22482x50bddb922.f291370f.getLayoutParams().height = c22482x50bddb922.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561249d9);
                    c22482x50bddb922.f291372h.g();
                    android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) c22482x50bddb922.f291372h.getLayoutParams();
                    layoutParams3.width = -2;
                    layoutParams3.setMarginEnd((int) c22482x50bddb922.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
                    c22482x50bddb922.f291372h.setLayoutParams(layoutParams3);
                }
                com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb923 = b0Var4.f204855p;
                if (c22482x50bddb923 != null && (m80997xdc5215a6 = c22482x50bddb923.m80997xdc5215a6()) != null) {
                    m80997xdc5215a6.m80988xce28f7ee(b0Var4);
                }
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                if (linearLayout2 != null) {
                    linearLayout2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.a0(linearLayout2, b0Var4));
                }
            }
            java.util.LinkedList linkedList = b0Var4.f204850h;
            linkedList.clear();
            linkedList.addAll(list);
            b0Var4.c(linkedList.size());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.z zVar2 = b0Var4.f204852m;
            if (zVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            zVar2.m8146xced61ae5();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14871xa985f898 c14871xa985f8982 = wVar.f205983g;
        if (c14871xa985f8982 != null) {
            c14871xa985f8982.m58610xbd04defe(list.size());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14871xa985f898 c14871xa985f8983 = wVar.f205983g;
        if (c14871xa985f8983 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5.s(c14871xa985f8983, false, false, 0, 7, null);
        }
        java.lang.CharSequence text = wVar.g().getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        wVar.k(1, str, wVar.f205986j);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiHandler$handlePoiList$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
