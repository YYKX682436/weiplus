package y84;

/* loaded from: classes4.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f541547d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f541548e;

    /* renamed from: f, reason: collision with root package name */
    public final y84.l3 f541549f;

    /* renamed from: g, reason: collision with root package name */
    public final int f541550g;

    /* renamed from: h, reason: collision with root package name */
    public final int f541551h;

    public b(android.content.Context mContext, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 mSnsInfo, y84.l3 mRandomSelectCardAdInfo, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mSnsInfo, "mSnsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mRandomSelectCardAdInfo, "mRandomSelectCardAdInfo");
        this.f541547d = mContext;
        this.f541548e = mSnsInfo;
        this.f541549f = mRandomSelectCardAdInfo;
        this.f541550g = i17;
        this.f541551h = i18;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemCount", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCount", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        return Integer.MAX_VALUE;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        y84.a holder = (y84.a) k3Var;
        android.content.Context context = this.f541547d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdRandomSelectCardAdapter", "onBindHolder, view.hash is " + holder.f3639x46306858.hashCode() + ", pos=" + i17);
            if (holder.m8185xcdaf1228() == 0) {
                y84.o3 o3Var = this.f541549f.f541679m;
                r45.jj4 a17 = o3Var != null ? o3Var.a() : null;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardImage", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter$ItemViewHolder");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardImage", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter$ItemViewHolder");
                android.widget.ImageView imageView = holder.f541541f;
                int hashCode = context.hashCode();
                com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276841l;
                s7Var.f276846b = this.f541548e.m70371x485d7().f39015xc86e6609;
                hj6.W(a17, imageView, -1, hashCode, s7Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter$ItemViewHolder");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter$ItemViewHolder");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194 = holder.f541540e;
                if (c22642x62f5b194 != null) {
                    c22642x62f5b194.m81432x205ac394(i65.a.b(context, 3));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter$ItemViewHolder");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter$ItemViewHolder");
                android.widget.FrameLayout frameLayout = holder.f541539d;
                java.lang.Object layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.width = this.f541550g;
                    marginLayoutParams.height = this.f541551h;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter$ItemViewHolder");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter$ItemViewHolder");
                if (frameLayout != null) {
                    frameLayout.requestLayout();
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdRandomSelectCardAdapter", "onBindViewHolder, wrong view type");
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdRandomSelectCardAdapter", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        y84.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        android.content.Context context = this.f541547d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        try {
            android.view.View inflate = i17 == 0 ? android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.en8, parent, false) : new android.view.View(context);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdRandomSelectCardAdapter", "onCreateHolder, view.hash is " + inflate.hashCode());
            aVar = new y84.a(inflate, i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdRandomSelectCardAdapter", th6);
            aVar = new y84.a(new android.view.View(context), i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        return aVar;
    }
}
