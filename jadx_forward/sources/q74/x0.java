package q74;

/* loaded from: classes4.dex */
public class x0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f442092d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f442093e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f442094f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f442095g;

    /* renamed from: h, reason: collision with root package name */
    public z84.i f442096h;

    /* renamed from: i, reason: collision with root package name */
    public z84.h f442097i;

    /* renamed from: m, reason: collision with root package name */
    public final w64.n f442098m;

    /* renamed from: n, reason: collision with root package name */
    public int f442099n;

    /* renamed from: o, reason: collision with root package name */
    public int f442100o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f442101p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f442102q = false;

    public x0(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, w64.n nVar) {
        this.f442101p = false;
        if (c1163xf1deaba4 != null) {
            this.f442092d = c1163xf1deaba4;
            this.f442094f = c1163xf1deaba4.getContext();
        } else {
            this.f442094f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        this.f442098m = nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        if (c17933xe8d1b226 != null) {
            if (c17933xe8d1b226.m70354x74235b3e() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
                s34.a1 a1Var = m70354x74235b3e.f38210x95847c91;
                if (a1Var != null && !a84.b0.b(a1Var.f76695x5800ff2c)) {
                    this.f442093e = c17933xe8d1b226;
                    this.f442095g = m70354x74235b3e.f38210x95847c91.f76695x5800ff2c;
                    if (s34.z0.d(c17933xe8d1b226)) {
                        this.f442101p = this.f442093e.m70354x74235b3e().f38210x95847c91.f484102f.a();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.SlideFullCardRecyclerViewAdapter", "the adSliderFullCardInfo or resource info list is null, initialize adapter failed!!!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.SlideFullCardRecyclerViewAdapter", "the sns info is null, initialize adapter failed!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    public static void x(q74.x0 x0Var, java.util.ArrayList arrayList, float f17) {
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        x0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCardBottomBarLayoutAlpha", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        if (a84.b0.b(arrayList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "setCardBottomBarLayoutAlpha, viewHolders is null or empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCardBottomBarLayoutAlpha", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
                if ((k3Var instanceof q74.y0) && (viewGroup = ((q74.y0) k3Var).f442109i) != null) {
                    viewGroup.setAlpha(f17);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCardBottomBarLayoutAlpha", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    public s34.x0 B(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        try {
            java.util.List list = this.f442095g;
            if (list != null && i17 >= 0 && i17 < list.size()) {
                s34.x0 x0Var = (s34.x0) this.f442095g.get(i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                return x0Var;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.SlideFullCardRecyclerViewAdapter", "the getResInfo has something wrong " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(q74.y0 r21, s34.x0 r22) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q74.x0.E(q74.y0, s34.x0):void");
    }

    public void I(q74.y0 y0Var, s34.x0 x0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processCardContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        q74.t0.g(y0Var.f442104d, x0Var.f76728xfdc65d28);
        q74.t0.g(y0Var.f442106f, x0Var.f76731x5a9c86a6);
        if (x0Var.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.SlideFullCardRecyclerViewAdapter", "the resInfo is sight");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processSight", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            r45.jj4 jj4Var = x0Var.f484361e;
            if (jj4Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processSight", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            } else {
                m44.a.g(jj4Var);
                l44.c0.b(this.f442093e, x0Var.f484361e);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
                r45.jj4 jj4Var2 = x0Var.f484361e;
                android.widget.ImageView imageView = y0Var.f442107g;
                int hashCode = this.f442094f.hashCode();
                com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276841l;
                s7Var.f276846b = this.f442093e.m70371x485d7().f39015xc86e6609;
                hj6.l0(jj4Var2, imageView, -1, hashCode, s7Var);
                a84.y0.p(y0Var.f442108h, true);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processSight", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            }
        } else {
            java.lang.String str = x0Var.f484361e.f459393i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.SlideFullCardRecyclerViewAdapter", "processCardContent, the resInfo is img, thumbUrl is " + str);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                java.lang.String l17 = za4.t0.l("adId", str);
                m44.a.d(str);
                android.widget.ImageView imageView2 = y0Var.f442107g;
                imageView2.setTag(com.p314xaae8f345.mm.R.id.nae, str);
                if (com.p314xaae8f345.mm.vfs.w6.j(l17)) {
                    n74.a2.c(imageView2, l17, 0);
                } else {
                    n74.a2.a(imageView2, str, 0);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processCardContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    public final void J(android.widget.ImageView imageView, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBtnIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null);
        if (J2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "onDownloaded, bitmap == null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return;
        }
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(J2);
        f3.b.g(bitmapDrawable, this.f442094f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231));
        imageView.setImageDrawable(bitmapDrawable);
        a84.y0.p(imageView, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        java.util.List list = this.f442095g;
        if (list == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return 0;
        }
        int size = list.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        return size;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        long j17 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        return j17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        s34.x0 B;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        q74.y0 y0Var = (q74.y0) k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        try {
            B = B(i17);
        } catch (java.lang.Throwable unused) {
        }
        if (B != null && y0Var != null) {
            y0Var.i(i17);
            q74.t0.b(y0Var, this.f442099n, this.f442100o);
            E(y0Var, B);
            I(y0Var, B);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.SlideFullCardRecyclerViewAdapter", "the res info or recyclerView is null!!!!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        z84.i iVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/SlideFullCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            iVar = this.f442096h;
            c1163xf1deaba4 = this.f442092d;
        } catch (java.lang.Throwable unused) {
        }
        if (view == null || c1163xf1deaba4 == null || iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.SlideFullCardRecyclerViewAdapter", "the recycler view or click listener is null!!!");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/SlideFullCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        } else {
            if (view.getParent() != c1163xf1deaba4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "are you cray?!! the parent of the clicked view is not same as the input recycler view!!");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/SlideFullCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = c1163xf1deaba4.w0(view);
            if (w07 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "I think the statement can't be reached, why?");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/SlideFullCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            } else {
                iVar.b(c1163xf1deaba4, view, w07.m8183xf806b362());
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/SlideFullCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        q74.y0 y0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        try {
            viewGroup.getWidth();
            android.view.View g17 = a84.y0.g(this.f442094f, com.p314xaae8f345.mm.R.C30864xbddafb2a.cqb, viewGroup, false);
            if (g17 != null) {
                g17.setOnClickListener(this);
                y0Var = new q74.y0(g17, new q74.w0(this));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "the inflated view is null????");
                q74.y0 y0Var2 = new q74.y0(new android.view.View(viewGroup.getContext()), new q74.w0(this));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                y0Var = y0Var2;
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "onCreateViewHolder failed????");
            y0Var = new q74.y0(new android.view.View(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), new q74.w0(this));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        return y0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewDetachedFromWindow */
    public void mo8161x38c82990(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        q74.y0 y0Var = (q74.y0) k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        super.mo8161x38c82990(y0Var);
        try {
            y0Var.m8183xf806b362();
            a84.y0.c(y0Var.f442108h);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    public void y(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcItemMaterialSize", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "calcItemMaterialSize, adDisplayWidth <= 0");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcItemMaterialSize", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return;
        }
        int b17 = i17 - i65.a.b(this.f442094f, 40);
        this.f442099n = b17;
        double d17 = (b17 * 3.0d) / 4.0d;
        this.f442100o = (int) java.lang.Math.ceil(d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.SlideFullCardRecyclerViewAdapter", "calcItemMaterialSize, mItemMaterialWidth is " + this.f442099n + ", realInnerItemHeight is " + d17 + ", mItemMaterialHeight is " + this.f442100o);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcItemMaterialSize", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    public void z(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        s34.d1 d1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        if (c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e() == null || c17933xe8d1b226.m70354x74235b3e().f38210x95847c91 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return;
        }
        s34.a1 a1Var = c17933xe8d1b226.m70354x74235b3e().f38210x95847c91;
        java.util.List<s34.x0> list = a1Var.f76695x5800ff2c;
        if (list == null || list.size() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return;
        }
        s34.x0 x0Var = a1Var.f76695x5800ff2c.get(i17);
        if (x0Var == null || (d1Var = x0Var.f76729x155a1700) == null || (c17702x544f64e9 = d1Var.f76704x75b1d9b0) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return;
        }
        z84.h hVar = this.f442097i;
        if (hVar != null) {
            hVar.a(view, i17);
        }
        int a17 = a1Var.a(i17);
        w64.n nVar = this.f442098m;
        nVar.o(c17702x544f64e9, c17933xe8d1b226, a17);
        nVar.k(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }
}
