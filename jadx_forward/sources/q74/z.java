package q74;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f442118a;

    /* renamed from: b, reason: collision with root package name */
    public final q74.c0 f442119b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f442120c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f442121d;

    /* renamed from: e, reason: collision with root package name */
    public s34.a1 f442122e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f442123f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f442124g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f442125h;

    /* renamed from: i, reason: collision with root package name */
    public final int f442126i;

    /* renamed from: j, reason: collision with root package name */
    public final android.os.Handler f442127j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f442128k;

    /* renamed from: l, reason: collision with root package name */
    public final q74.w f442129l;

    /* renamed from: m, reason: collision with root package name */
    public final q74.y f442130m;

    public z(android.content.Context context, q74.c0 mAdContext) {
        android.view.ViewGroup.LayoutParams layoutParams;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mAdContext, "mAdContext");
        this.f442118a = context;
        this.f442119b = mAdContext;
        this.f442120c = "OverSlideLeftLogic";
        this.f442126i = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16);
        this.f442127j = new android.os.Handler(android.os.Looper.getMainLooper());
        android.view.View h17 = a84.y0.h(mAdContext.f441965b);
        this.f442123f = h17;
        android.widget.TextView textView = h17 != null ? (android.widget.TextView) h17.findViewById(com.p314xaae8f345.mm.R.id.qpi) : null;
        this.f442124g = textView;
        android.view.View findViewById = h17 != null ? h17.findViewById(com.p314xaae8f345.mm.R.id.qph) : null;
        this.f442125h = findViewById;
        float b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
        if (textView != null) {
            textView.setTextSize(0, b17);
        }
        android.graphics.Point point = mAdContext.f441971h;
        int i17 = point != null ? point.y : 0;
        int i18 = point != null ? point.x : 0;
        if (i17 > 0 && i18 > 0) {
            java.lang.Object layoutParams2 = h17 != null ? h17.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.height = i17;
                int a17 = (((mAdContext.f441972i - i18) - ((findViewById == null || (layoutParams = findViewById.getLayoutParams()) == null) ? c44.b.a(12) : layoutParams.width)) - c44.b.a(10)) - c44.b.a(10);
                marginLayoutParams.rightMargin = a17 >= 0 ? a17 : 0;
                if (h17 != null) {
                    h17.setLayoutParams(marginLayoutParams);
                }
            }
        }
        this.f442129l = new q74.w(this);
        this.f442130m = new q74.y(this);
    }

    public static final /* synthetic */ java.lang.String a(q74.z zVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        java.lang.String str = zVar.f442120c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        return str;
    }

    public static final void b(q74.z zVar, boolean z17) {
        java.lang.String str;
        java.lang.String string;
        java.lang.String string2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$updateTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        zVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(zVar.f442120c, "updateTipText, isOverSlide=" + z17);
        android.widget.TextView textView = zVar.f442124g;
        if (textView != null) {
            java.lang.String str2 = "";
            android.content.Context context = zVar.f442118a;
            if (z17) {
                s34.a1 a1Var = zVar.f442122e;
                str = a1Var != null ? a1Var.f484100d : null;
                if (str == null || str.length() == 0) {
                    if (context != null && (string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ly7)) != null) {
                        str2 = string2;
                    }
                    str = str2;
                }
                textView.setText(str);
            } else {
                s34.a1 a1Var2 = zVar.f442122e;
                str = a1Var2 != null ? a1Var2.f484099c : null;
                if (str == null || str.length() == 0) {
                    if (context != null && (string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ly6)) != null) {
                        str2 = string;
                    }
                    str = str2;
                }
                textView.setText(str);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$updateTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
    }

    public final q74.c0 c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMAdContext", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMAdContext", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        return this.f442119b;
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, s34.a1 a1Var) {
        boolean z17;
        q74.c0 c0Var;
        android.view.View view;
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refresh", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        this.f442121d = c17933xe8d1b226;
        this.f442122e = a1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh, overSlideJumpInfo==null?");
        sb6.append((a1Var != null ? a1Var.f76694x80bfd259 : null) == null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f442120c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = a1Var != null ? a1Var.f76694x80bfd259 : null;
        android.view.View view2 = this.f442123f;
        q74.c0 c0Var2 = this.f442119b;
        if (c17702x544f64e9 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2124x2ad8c7ad.C17758x730d4dd2 c17758x730d4dd2 = c0Var2.f441964a;
            if (c17758x730d4dd2 != null) {
                c17758x730d4dd2.m69491xc6b73e67(this.f442130m);
            }
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                c0Var = c0Var2;
                view = view2;
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/OverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/OverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = c0Var.f441967d;
                if (c17808x428917d3 != null && c17808x428917d3.w()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "refresh, overSlideTipLayout alpha=1");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/OverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/OverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "refresh, overSlideTipLayout alpha=0");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/OverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/OverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            } else {
                c0Var = c0Var2;
                view = view2;
            }
            android.widget.TextView textView = this.f442124g;
            if (textView != null) {
                java.lang.String str2 = a1Var != null ? a1Var.f484099c : null;
                if ((str2 == null || str2.length() == 0) && ((context = this.f442118a) == null || (str2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ly6)) == null)) {
                    str2 = "";
                }
                textView.setText(str2);
            }
            q74.b1 b1Var = c0Var.f441966c;
            if (b1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsAutoLoopNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                b1Var.f441956f = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsAutoLoopNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d32 = c0Var.f441967d;
            if (c17808x428917d32 != null) {
                c17808x428917d32.C(false);
            }
            z84.k kVar = c0Var.f441968e;
            if (kVar != null) {
                kVar.j(view);
                kVar.i(this.f442129l);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInfiniteLoopMode", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
                kVar.f552310h = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInfiniteLoopMode", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2124x2ad8c7ad.C17758x730d4dd2 c17758x730d4dd22 = c0Var2.f441964a;
            if (c17758x730d4dd22 != null) {
                c17758x730d4dd22.m69491xc6b73e67(null);
            }
            if (view2 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/OverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/OverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            q74.b1 b1Var2 = c0Var2.f441966c;
            if (b1Var2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsAutoLoopNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                z17 = true;
                b1Var2.f441956f = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsAutoLoopNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            } else {
                z17 = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d33 = c0Var2.f441967d;
            if (c17808x428917d33 != null) {
                c17808x428917d33.C(z17);
            }
            z84.k kVar2 = c0Var2.f441968e;
            if (kVar2 != null) {
                kVar2.j(null);
                kVar2.i(null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInfiniteLoopMode", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
                kVar2.f552310h = z17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInfiniteLoopMode", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refresh", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
    }
}
