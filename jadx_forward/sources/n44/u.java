package n44;

/* loaded from: classes15.dex */
public final class u extends db5.p8 {

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f416584g;

    /* renamed from: h, reason: collision with root package name */
    public final i64.z f416585h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.FrameLayout f416586i;

    /* renamed from: m, reason: collision with root package name */
    public final y54.b f416587m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f416588n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f416589o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f416590p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f416591q;

    /* renamed from: r, reason: collision with root package name */
    public final android.util.SparseArray f416592r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f416593s;

    public u(android.content.Context context, i64.z zVar, android.widget.FrameLayout frameLayout, y54.b contentSizeAttr, java.util.LinkedList topMaterialSizeDataList, java.util.LinkedList fullScreenMaterialSizeDataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentSizeAttr, "contentSizeAttr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topMaterialSizeDataList, "topMaterialSizeDataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullScreenMaterialSizeDataList, "fullScreenMaterialSizeDataList");
        this.f416584g = context;
        this.f416585h = zVar;
        this.f416586i = frameLayout;
        this.f416587m = contentSizeAttr;
        this.f416588n = topMaterialSizeDataList;
        this.f416589o = fullScreenMaterialSizeDataList;
        this.f416590p = new java.util.HashMap();
        this.f416591q = new java.util.LinkedList();
        this.f416592r = new android.util.SparseArray();
        this.f416593s = jz5.h.b(new n44.t(this));
    }

    @Override // db5.p8
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        return null;
    }

    @Override // db5.p8
    public /* bridge */ /* synthetic */ java.lang.Object d(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        android.view.View i18 = i(i17, view, viewGroup);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        return i18;
    }

    @Override // db5.p8, p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup container, int i17, java.lang.Object itemView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroyItem", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View view = itemView instanceof android.view.View ? (android.view.View) itemView : null;
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroyItem", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
            return;
        }
        this.f416591q.add(view);
        this.f416590p.remove(view);
        this.f416592r.remove(i17);
        a84.y0.i(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroyItem", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
    }

    @Override // db5.p8
    public android.view.View e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewByPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        java.lang.Object obj = this.f416592r.get(i17);
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewByPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        return view;
    }

    @Override // db5.p8
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f f(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        return null;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        java.util.LinkedList f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        i64.z zVar = this.f416585h;
        int size = (zVar == null || (f17 = zVar.f()) == null) ? 0 : f17.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        return size;
    }

    @Override // db5.p8, p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object item) {
        java.lang.Integer num;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.util.HashMap hashMap = this.f416590p;
        int i17 = -2;
        if (hashMap.containsKey(item) && (num = (java.lang.Integer) hashMap.get(item)) != null) {
            i17 = num.intValue();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        return i17;
    }

    public android.view.View i(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        n44.v vVar;
        android.view.View inflate;
        java.util.LinkedList f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        i64.z zVar = this.f416585h;
        r45.jj4 jj4Var = (zVar == null || (f17 = zVar.f()) == null) ? null : (r45.jj4) f17.get(i17);
        boolean z17 = jj4Var != null && jj4Var.f459389e == 2;
        android.content.Context context = this.f416584g;
        if (!z17) {
            android.view.View view2 = new android.view.View(context);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
            return view2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillViewImage", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        if (view == null || view.getTag() == null) {
            vVar = new n44.v();
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$ViewHolder");
            vVar.f416598a = imageView;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$ViewHolder");
            android.widget.ImageView a17 = vVar.a();
            if (a17 != null) {
                a17.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            }
            inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569494wy, viewGroup, false);
            if (inflate != null) {
                inflate.setTag(vVar);
            }
        } else {
            java.lang.Object tag = view.getTag();
            vVar = tag instanceof n44.v ? (n44.v) tag : null;
            inflate = view;
        }
        if (inflate == null) {
            inflate = new android.view.View(context);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewImage", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        } else {
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.fcs);
            android.widget.FrameLayout frameLayout = this.f416586i;
            if (frameLayout != null) {
                y54.c cVar = new y54.c(0, 0, 0, 0, 15, null);
                n44.a0 a0Var = n44.m0.f416515s;
                r45.lj4 lj4Var = jj4Var.f459398p;
                a0Var.a(lj4Var.f461053d, lj4Var.f461054e, frameLayout.getLayoutParams().width, frameLayout.getLayoutParams().height, true, cVar);
                android.view.ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.width = cVar.d();
                    marginLayoutParams.height = cVar.a();
                    marginLayoutParams.leftMargin = cVar.b();
                    marginLayoutParams.topMargin = cVar.c();
                    marginLayoutParams.rightMargin = (frameLayout.getLayoutParams().width - cVar.d()) - cVar.b();
                    marginLayoutParams.bottomMargin = (frameLayout.getLayoutParams().height - cVar.a()) - cVar.c();
                }
            }
            m44.a.g(jj4Var);
            if (ca4.m0.u0(e42.c0.clicfg_sns_ad_half_screen_disable_use_mm_image_loader, 0) == 1) {
                a84.z.h(jj4Var.f459393i, vVar != null ? vVar.a() : null);
            } else {
                a84.m.a(jj4Var.f459393i, vVar != null ? vVar.a() : null);
            }
            a84.y0.b(viewGroup2, vVar != null ? vVar.a() : null, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewImage", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        return inflate;
    }

    @Override // db5.p8, p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("instantiateItem", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        java.util.LinkedList linkedList = this.f416591q;
        android.view.View i18 = i(i17, linkedList.size() > 0 ? (android.view.View) linkedList.poll() : null, container);
        i18.setOnClickListener(n44.s.f416576d);
        this.f416590p.put(i18, java.lang.Integer.valueOf(i17));
        this.f416592r.put(i17, i18);
        a84.y0.b(container, i18, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("instantiateItem", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        return i18;
    }
}
