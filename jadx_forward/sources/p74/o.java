package p74;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f434102a;

    /* renamed from: b, reason: collision with root package name */
    public final p74.d f434103b;

    /* renamed from: c, reason: collision with root package name */
    public int f434104c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f434105d;

    /* renamed from: e, reason: collision with root package name */
    public s34.a1 f434106e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f434107f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f434108g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f434109h;

    /* renamed from: i, reason: collision with root package name */
    public final int f434110i;

    /* renamed from: j, reason: collision with root package name */
    public final android.os.Handler f434111j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f434112k;

    /* renamed from: l, reason: collision with root package name */
    public final z84.j f434113l;

    /* renamed from: m, reason: collision with root package name */
    public final p74.n f434114m;

    public o(android.content.Context context, p74.d mAdContext, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mAdContext, "mAdContext");
        this.f434102a = context;
        this.f434103b = mAdContext;
        this.f434104c = i17;
        this.f434110i = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16);
        this.f434111j = new android.os.Handler(android.os.Looper.getMainLooper());
        android.view.View h17 = a84.y0.h(mAdContext.f434060b);
        this.f434107f = h17;
        android.view.ViewGroup.LayoutParams layoutParams = null;
        android.widget.TextView textView = h17 != null ? (android.widget.TextView) h17.findViewById(com.p314xaae8f345.mm.R.id.qpi) : null;
        this.f434108g = textView;
        android.view.View findViewById = h17 != null ? h17.findViewById(com.p314xaae8f345.mm.R.id.qph) : null;
        this.f434109h = findViewById;
        float s17 = ca4.m0.s(12);
        if (textView != null) {
            textView.setTextSize(0, s17);
        }
        if (findViewById != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = r7;
                layoutParams2.height = r7;
            } else {
                layoutParams2 = null;
            }
            findViewById.setLayoutParams(layoutParams2);
        }
        if (h17 != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = h17.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = ca4.m0.s(22);
                layoutParams = layoutParams3;
            }
            h17.setLayoutParams(layoutParams);
        }
        this.f434113l = new p74.l(this);
        this.f434114m = new p74.n(this);
    }

    public static final /* synthetic */ p74.d a(p74.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAdContext$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        p74.d dVar = oVar.f434103b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAdContext$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        return dVar;
    }

    public static final void b(p74.o oVar, boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$updateTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        oVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardOverSlideLeftLogic", "updateTipText, isOverSlide=" + z17);
        android.widget.TextView textView = oVar.f434108g;
        if (textView != null) {
            android.content.Context context = oVar.f434102a;
            if (z17) {
                s34.a1 a1Var = oVar.f434106e;
                str = a1Var != null ? a1Var.f484100d : null;
                if (str == null || str.length() == 0) {
                    if (oVar.f434104c == 1) {
                        java.lang.String string = "";
                        str = string;
                    } else {
                        java.lang.String string2 = "";
                        str = string2;
                    }
                }
            } else {
                s34.a1 a1Var2 = oVar.f434106e;
                str = a1Var2 != null ? a1Var2.f484099c : null;
                if (str == null || str.length() == 0) {
                    if (oVar.f434104c == 1) {
                        java.lang.String string22 = "";
                        str = string22;
                    } else {
                        java.lang.String string222 = "";
                        str = string222;
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardOverSlideLeftLogic", "tipStr = " + str);
            textView.setText(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$updateTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, s34.a1 a1Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refresh", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        this.f434105d = c17933xe8d1b226;
        this.f434106e = a1Var;
        this.f434104c = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh, overSlideJumpInfo==null?");
        sb6.append((a1Var != null ? a1Var.f76694x80bfd259 : null) == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardOverSlideLeftLogic", sb6.toString());
        if ((a1Var != null ? a1Var.f76694x80bfd259 : null) != null) {
            p74.d dVar = this.f434103b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17757xeeb72e02 c17757xeeb72e02 = dVar.f434059a;
            if (c17757xeeb72e02 != null) {
                c17757xeeb72e02.m69488xc6b73e67(this.f434114m);
            }
            android.view.View view = this.f434107f;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardOverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardOverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = dVar.f434062d;
                if (c17808x428917d3 != null && c17808x428917d3.w()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardOverSlideLeftLogic", "refresh, overSlideTipLayout alpha=1");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardOverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardOverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardOverSlideLeftLogic", "refresh, overSlideTipLayout alpha=0");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardOverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardOverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            android.widget.TextView textView = this.f434108g;
            if (textView != null) {
                java.lang.String str = a1Var.f484099c;
                if (str == null || str.length() == 0) {
                    int i18 = this.f434104c;
                    android.content.Context context = this.f434102a;
                    if (i18 != 1 ? context == null || (str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j7x)) == null : context == null || (str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pi9)) == null) {
                        str = "";
                    }
                }
                textView.setText(str);
            }
            p74.w wVar = dVar.f434061c;
            if (wVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshInteractionMark", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
                wVar.f434149j = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshInteractionMark", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            }
            p74.w wVar2 = dVar.f434061c;
            if (wVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsAutoLoopNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
                wVar2.f434150k = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsAutoLoopNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            }
            p74.i iVar = dVar.f434063e;
            if (iVar != null) {
                iVar.j(view);
                iVar.i(this.f434113l);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refresh", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
    }
}
