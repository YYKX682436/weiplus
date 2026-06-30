package v74;

/* loaded from: classes4.dex */
public final class g extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f515318d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f515319e;

    /* renamed from: f, reason: collision with root package name */
    public final v74.s f515320f;

    /* renamed from: g, reason: collision with root package name */
    public final v74.m f515321g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f515322h;

    /* renamed from: i, reason: collision with root package name */
    public v74.b f515323i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f515324m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f515325n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnClickListener f515326o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnClickListener f515327p;

    /* renamed from: q, reason: collision with root package name */
    public v74.c f515328q;

    public g(android.content.Context mContext, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 mSnsInfo, v74.s mItemSize, v74.m mLookbookCardInfo, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mSnsInfo, "mSnsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mItemSize, "mItemSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mLookbookCardInfo, "mLookbookCardInfo");
        this.f515318d = mContext;
        this.f515319e = mSnsInfo;
        this.f515320f = mItemSize;
        this.f515321g = mLookbookCardInfo;
        this.f515322h = c1163xf1deaba4;
        this.f515325n = jz5.h.b(new v74.f(this));
        this.f515326o = new v74.d(this);
        this.f515327p = v74.e.f515308d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        int size = this.f515321g.c().size() + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        return size;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        long j17 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        return j17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemViewType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        if (i17 == mo1894x7e414b06() - 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            return 2;
        }
        v74.q x17 = x(i17);
        if (x17 != null && x17.c()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            return 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String str;
        boolean z17;
        boolean z18;
        boolean z19;
        java.lang.String str2 = "onBindViewHolder";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        v74.b holder = (v74.b) k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        holder.f3639x46306858.hashCode();
        if (holder.m8185xcdaf1228() != 2) {
            v74.q x17 = x(i17);
            if (x17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookLogic", "onBindViewHolder, itemInfo==null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
            android.view.View view = holder.f515295e;
            if (view != null) {
                v74.m mVar = this.f515321g;
                mVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isHideItemTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                boolean z27 = mVar.f515402e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isHideItemTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                int i18 = z27 ? 8 : 0;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookAdapter$ItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookAdapter$ItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindTitleAndIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleText", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleText", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
            android.content.Context context = this.f515318d;
            android.widget.TextView textView = holder.f515294d;
            if (textView != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
                java.lang.String str3 = x17.f515412a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
                textView.setText(str3);
                int b17 = i65.a.b(context, 12);
                int b18 = i65.a.b(context, 4);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 a17 = x17.a();
                java.util.Map map = l44.u3.f397913a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                if (a17 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                    str = "onBindViewHolder";
                    z19 = false;
                } else {
                    str = "onBindViewHolder";
                    z19 = a17.f244104b == 4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f244116h);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                }
                if (z19) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIconType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                    int i19 = holder.f515300m;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIconType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                    if (i19 != 1) {
                        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f81079xa9ce8914 : com.p314xaae8f345.mm.R.raw.f81080xe25d62d0);
                        if (drawable != null) {
                            drawable.setBounds(0, 0, b17, b17);
                        }
                        textView.setCompoundDrawables(drawable, null, null, null);
                        textView.setCompoundDrawablePadding(b18);
                        z18 = true;
                        holder.k(1);
                    } else {
                        z18 = true;
                    }
                } else {
                    z18 = true;
                    if (l44.s4.j(x17.a())) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIconType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                        int i27 = holder.f515300m;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIconType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                        if (i27 != 2) {
                            android.graphics.drawable.Drawable drawable2 = context.getResources().getDrawable(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f81076x96dc246b : com.p314xaae8f345.mm.R.raw.f81077x97033259);
                            if (drawable2 != null) {
                                drawable2.setBounds(0, 0, b17, b17);
                            }
                            textView.setCompoundDrawables(drawable2, null, null, null);
                            textView.setCompoundDrawablePadding(b18);
                            holder.k(2);
                        }
                    } else if (n74.i0.a(x17.a())) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIconType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                        int i28 = holder.f515300m;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIconType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                        if (i28 != 3) {
                            android.graphics.drawable.Drawable drawable3 = context.getResources().getDrawable(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f81081xfe5e2f0c : com.p314xaae8f345.mm.R.raw.f81082x14d7d2cf);
                            z17 = false;
                            if (drawable3 != null) {
                                drawable3.setBounds(0, 0, b17, b17);
                            }
                            textView.setCompoundDrawables(drawable3, null, null, null);
                            textView.setCompoundDrawablePadding(b18);
                            holder.k(3);
                        }
                    } else {
                        z17 = false;
                        textView.setCompoundDrawables(null, null, null, null);
                        textView.setCompoundDrawablePadding(0);
                        holder.k(0);
                    }
                }
                z17 = false;
            } else {
                str = "onBindViewHolder";
                z17 = false;
                z18 = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindTitleAndIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            if (x17.b() != null) {
                r45.jj4 b19 = x17.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b19);
                m44.a.g(b19);
            }
            if (holder.m8185xcdaf1228() == 0) {
                r45.jj4 b27 = x17.b();
                java.lang.String str4 = b27 != null ? b27.f459393i : null;
                if (str4 != null && str4.length() != 0) {
                    z18 = z17;
                }
                android.widget.ImageView imageView = holder.f515296f;
                if (z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCoverImg", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCoverImg", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                    if (imageView != null) {
                        imageView.setImageDrawable(null);
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCoverImg", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCoverImg", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                    a84.m.b(str4, imageView);
                }
            } else if (x17.b() != null) {
                r45.jj4 b28 = x17.b();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f515319e;
                l44.c0.b(c17933xe8d1b226, b28);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
                r45.jj4 b29 = x17.b();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCoverImg", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCoverImg", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                android.widget.ImageView imageView2 = holder.f515296f;
                int hashCode = context.hashCode();
                com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276841l;
                s7Var.f276846b = c17933xe8d1b226.m70371x485d7().f39015xc86e6609;
                hj6.l0(b29, imageView2, -1, hashCode, s7Var);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookLogic", "media==null");
            }
        } else {
            str = "onBindViewHolder";
            z(this.f515324m);
        }
        str2 = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        android.view.View inflate;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 0) {
            inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571059cu5, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        } else if (i17 != 1) {
            inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cu8, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        } else {
            inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cu7, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        }
        inflate.hashCode();
        v74.b bVar = new v74.b(inflate, i17, this.f515320f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
        android.view.View view = bVar.f515295e;
        if (view != null) {
            view.setOnClickListener(this.f515327p);
        }
        inflate.setOnClickListener(this.f515326o);
        if (i17 == 2) {
            this.f515323i = bVar;
            android.view.View view2 = bVar.f3639x46306858;
            if (view2 != null) {
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), y() > 0 ? y() + view2.getPaddingRight() : view2.getPaddingRight(), view2.getPaddingBottom());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        return bVar;
    }

    public final v74.q x(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        if (i17 >= 0) {
            v74.m mVar = this.f515321g;
            if (i17 < mVar.c().size()) {
                v74.q qVar = (v74.q) mVar.c().get(i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
                return qVar;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        return null;
    }

    public final int y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMTipLayoutExtraRightPadding", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        int intValue = ((java.lang.Number) ((jz5.n) this.f515325n).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMTipLayoutExtraRightPadding", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        return intValue;
    }

    public final void z(boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateOverScrollState", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        this.f515324m = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookLogic", "updateOverScrollState, isOverMinDistance=" + z17);
        v74.b bVar = this.f515323i;
        if (bVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSlideTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSlideTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
            android.widget.TextView textView = bVar.f515299i;
            if (textView != null) {
                boolean z18 = this.f515324m;
                android.content.Context context = this.f515318d;
                v74.m mVar = this.f515321g;
                if (z18) {
                    mVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSlideJumpTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                    java.lang.String str3 = mVar.f515399b;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSlideJumpTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                    if (str3 == null || str3.length() == 0) {
                        str2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574714ly5);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSlideJumpTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                        java.lang.String str4 = mVar.f515399b;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSlideJumpTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                        str2 = str4;
                    }
                    textView.setText(str2);
                } else {
                    mVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSlideTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                    java.lang.String str5 = mVar.f515398a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSlideTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                    if (str5 == null || str5.length() == 0) {
                        str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j7x);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSlideTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                        java.lang.String str6 = mVar.f515398a;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSlideTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                        str = str6;
                    }
                    textView.setText(str);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateOverScrollState", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
    }
}
