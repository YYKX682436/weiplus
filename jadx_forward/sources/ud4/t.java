package ud4;

/* loaded from: classes4.dex */
public abstract class t implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v4 {

    /* renamed from: a */
    public final android.content.Context f508265a;

    /* renamed from: b */
    public final ud4.h f508266b;

    /* renamed from: c */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a f508267c;

    /* renamed from: e */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u4 f508269e;

    /* renamed from: f */
    public float f508270f;

    /* renamed from: g */
    public final android.view.View f508271g;

    /* renamed from: h */
    public final android.widget.ImageView f508272h;

    /* renamed from: i */
    public final android.widget.TextView f508273i;

    /* renamed from: j */
    public final android.view.View f508274j;

    /* renamed from: k */
    public final android.view.View f508275k;

    /* renamed from: l */
    public final android.view.View f508276l;

    /* renamed from: m */
    public int f508277m;

    /* renamed from: n */
    public boolean f508278n = false;

    /* renamed from: d */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f508268d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();

    public t(android.view.View view, android.view.View view2, android.view.View view3, android.view.View view4, android.content.Context context, java.util.List list, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u4 u4Var, ud4.d dVar, boolean z17) {
        this.f508265a = context;
        this.f508269e = u4Var;
        this.f508271g = view2;
        this.f508274j = view3;
        this.f508267c = c18379xb7ff44a;
        this.f508276l = view4;
        this.f508272h = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565568cs4);
        this.f508273i = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.csd);
        this.f508275k = view;
        c18379xb7ff44a.m71185xa0af8705(false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View");
        android.content.Context context2 = ((ud4.k) this).f508265a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPicSizeStatic", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View$Companion");
        int z18 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().z1() - (context2.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562142ab1) * 4)) - (context2.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561403hj) * 2)) / 3;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.f245939y0;
        z18 = z18 > i18 ? i18 : z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPicSizeStatic", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View");
        this.f508277m = z18;
        c18379xb7ff44a.setColumnWidth(z18 + (context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562142ab1) * 2));
        c18379xb7ff44a.setNumColumns(3);
        c18379xb7ff44a.setOverScrollMode(2);
        c18379xb7ff44a.setStretchMode(0);
        c18379xb7ff44a.setClipChildren(false);
        c18379xb7ff44a.setClipToPadding(false);
        c18379xb7ff44a.setSelector(new android.graphics.drawable.ColorDrawable(0));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableAddDummyHeader", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAddDummyHeader", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View");
        ud4.h hVar = new ud4.h(context, list, 3, i17, z17, false, dVar);
        this.f508266b = hVar;
        int i19 = this.f508277m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updatePicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        hVar.f508244s = i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updatePicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        f();
        c18379xb7ff44a.setAdapter2((android.widget.ListAdapter) hVar);
        c18379xb7ff44a.m71180x680a289(new ud4.l(this, c18379xb7ff44a, view3));
        c18379xb7ff44a.setOnItemLongClickListener(new ud4.m(this));
        c18379xb7ff44a.setOnItemClickListener(new ud4.n(this));
        c18379xb7ff44a.m71181x98ecb944(new ud4.o(this, c18379xb7ff44a, view));
        c18379xb7ff44a.getViewTreeObserver().addOnPreDrawListener(new ud4.p(this, c18379xb7ff44a, list));
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().z1() == 0) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new ud4.q(this, list), 50L);
        }
    }

    public static void a(ud4.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        tVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetDelAreaStyle", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        android.view.View view = tVar.f508271g;
        if (view.getBackground() != null) {
            view.getBackground().clearColorFilter();
        }
        android.content.Context context = tVar.f508265a;
        view.setBackgroundColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
        android.graphics.drawable.Drawable m9707x4a96be14 = b3.l.m9707x4a96be14(context, com.p314xaae8f345.mm.R.raw.f81256x86b25b7b);
        if (m9707x4a96be14 != null) {
            m9707x4a96be14.mutate();
            m9707x4a96be14.setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_IN);
        }
        tVar.f508272h.setImageDrawable(m9707x4a96be14);
        tVar.f508273i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j_a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetDelAreaStyle", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
    }

    public static /* synthetic */ android.view.View b(ud4.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        android.view.View view = tVar.f508271g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        return view;
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clean", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a = this.f508267c;
        if (c18379xb7ff44a != null && c18379xb7ff44a.getAdapter() != null) {
            ud4.h hVar = (ud4.h) c18379xb7ff44a.getAdapter();
            hVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClean", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            hVar.f508241p = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClean", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f508268d;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clean", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
    }

    public abstract void d(int i17);

    public void e(java.util.ArrayList arrayList, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setList", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        ud4.h hVar = this.f508266b;
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicGrid", "setList: count:%d, maxLimit:%d", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(i17));
            hVar.c(arrayList);
            f();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setList", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
    }

    public final void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupTipsView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        ud4.h hVar = this.f508266b;
        hVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPicCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        int count = (hVar.getCount() - hVar.j()) - (hVar.f508240o ? 1 : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPicCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkShouldShowImgTipsView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d().getBoolean("key_show_tips", true) && count > 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShouldShowImgTipsView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("knowTips", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d().edit().putBoolean("key_show_tips", false).commit();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("knowTips", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicGrid", "setupTipsView: show = true");
            android.view.View view = this.f508274j;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "setupTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "setupTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f508268d.mo50297x7c4d7ca2(new ud4.r(this), 5000L);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicGrid", "setupTipsView: show = false");
            android.view.View view2 = this.f508274j;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "setupTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "setupTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupTipsView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
    }
}
