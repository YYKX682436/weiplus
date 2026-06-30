package r84;

/* loaded from: classes4.dex */
public final class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final s34.c f474855d;

    /* renamed from: e, reason: collision with root package name */
    public final int f474856e;

    /* renamed from: f, reason: collision with root package name */
    public final int f474857f;

    /* renamed from: g, reason: collision with root package name */
    public final int f474858g;

    public d(s34.c bulletInfo, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bulletInfo, "bulletInfo");
        this.f474855d = bulletInfo;
        this.f474856e = i17;
        this.f474857f = i18;
        this.f474858g = i19;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemCount", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCount", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        return Integer.MAX_VALUE;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemId", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        long mo7906x1ed62e84 = super.mo7906x1ed62e84(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        return mo7906x1ed62e84;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemViewType", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        int i18 = i17 < this.f474855d.a() ? 0 : 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        return i18;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        r84.b holder = (r84.b) k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        s34.c cVar = this.f474855d;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBulletTextList", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
        java.util.List list = cVar.f484119a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBulletTextList", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        int size = arrayList.size();
        int a17 = cVar.a();
        if (i17 >= a17) {
            if (size == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
            }
            int i18 = (i17 - a17) % size;
            if (i18 >= 0 && i18 < size) {
                com.p314xaae8f345.mm.p2614xca6eae71.x1 Di = com.p314xaae8f345.mm.p2614xca6eae71.x1.Di();
                holder.f3639x46306858.getContext();
                android.text.SpannableString Ri = Di.Ri((java.lang.CharSequence) arrayList.get(i18), true);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTextView", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter$ViewHolder");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextView", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter$ViewHolder");
                android.widget.TextView textView = holder.f474853d;
                if (textView != null) {
                    textView.setText(Ri);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildDanmuItemView", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        int i18 = this.f474858g;
        int i19 = this.f474856e;
        if (i17 == 0) {
            android.view.View view2 = new android.view.View(context);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(i19, i19);
            marginLayoutParams.bottomMargin = i18;
            view2.setLayoutParams(marginLayoutParams);
            view = view2;
        } else {
            android.widget.TextView textView = new android.widget.TextView(context);
            s34.c cVar = this.f474855d;
            cVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBackgroundColor", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            int i27 = cVar.f484122d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBackgroundColor", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            textView.setBackgroundColor(i27);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTextColor", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            int i28 = cVar.f484121c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextColor", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            textView.setTextColor(i28);
            textView.setSingleLine(true);
            textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFontSize", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            int i29 = cVar.f484120b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFontSize", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            textView.setTextSize(0, i29);
            android.graphics.Typeface typeface = textView.getTypeface();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFontWeight", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            int i37 = cVar.f484123e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFontWeight", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            textView.setTypeface(typeface, i37);
            textView.setGravity(17);
            int s17 = ca4.m0.s(6);
            textView.setPadding(s17, 0, s17, 0);
            textView.setClipToOutline(true);
            textView.setOutlineProvider(new r84.c(this));
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = new android.view.ViewGroup.MarginLayoutParams(-2, i19);
            marginLayoutParams2.bottomMargin = i18;
            textView.setLayoutParams(marginLayoutParams2);
            view = textView;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildDanmuItemView", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        r84.b bVar = new r84.b(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        return bVar;
    }
}
