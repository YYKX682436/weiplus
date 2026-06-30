package m94;

/* loaded from: classes4.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f406601d = kz5.p0.f395529d;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemCount", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        int i17 = this.f406601d.isEmpty() ? 0 : Integer.MAX_VALUE;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCount", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        r45.d96 d96Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        m94.a holder = (m94.a) k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (this.f406601d.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        } else {
            int x17 = i17 % x();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScaleRecyclerAdapter", "onBindViewHolder, validPos is " + x17);
            if (holder.m8185xcdaf1228() == 0) {
                r45.i96 i96Var = (r45.i96) this.f406601d.get(x17);
                java.lang.String str = (i96Var == null || (d96Var = i96Var.f458385d) == null) ? null : d96Var.f453786d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemImage", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter$ItemViewHolder");
                android.widget.ImageView imageView = holder.f406600d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemImage", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter$ItemViewHolder");
                a84.m.a(str, imageView);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194(context);
        c44.a.l();
        if (c22642x62f5b194.getLayoutParams() == null) {
            c44.a.o();
            c22642x62f5b194.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = c22642x62f5b194.getLayoutParams();
            layoutParams.width = -1;
            c22642x62f5b194.setLayoutParams(layoutParams);
        }
        c44.a.l();
        if (c22642x62f5b194.getLayoutParams() == null) {
            c44.a.o();
            c22642x62f5b194.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = c22642x62f5b194.getLayoutParams();
            layoutParams2.height = -1;
            c22642x62f5b194.setLayoutParams(layoutParams2);
        }
        c22642x62f5b194.m81432x205ac394(c44.b.a(8));
        m94.a aVar = new m94.a(c22642x62f5b194);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setViewType", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter$ItemViewHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setViewType", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter$ItemViewHolder");
        if (i17 == 0) {
            android.widget.ImageView imageView = new android.widget.ImageView(parent.getContext());
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setItemImage", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter$ItemViewHolder");
            aVar.f406600d = imageView;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setItemImage", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter$ItemViewHolder");
            c44.a.l();
            c44.a.l();
            c22642x62f5b194.addView(imageView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        return aVar;
    }

    public final int x() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRealCount", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        int size = this.f406601d.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealCount", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        return size;
    }
}
