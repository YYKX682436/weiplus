package k74;

/* loaded from: classes4.dex */
public class i implements i74.l, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f386331d;

    /* renamed from: e, reason: collision with root package name */
    public m74.b f386332e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f386333f;

    /* renamed from: g, reason: collision with root package name */
    public final k74.h f386334g;

    /* renamed from: h, reason: collision with root package name */
    public final i74.a f386335h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f386336i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f386337m = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public int f386338n;

    public i(android.content.Context context) {
        this.f386331d = context;
        i74.a aVar = new i74.a();
        this.f386335h = aVar;
        this.f386334g = new k74.h(context, aVar, this);
        this.f386338n = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.a_c);
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSource", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            aVar.f370990c = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSource", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        }
    }

    @Override // i74.l
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanReasonIds", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackNewStylePromptManager", "cleanReasonIds");
        java.util.Set set = this.f386337m;
        if (set != null) {
            ((java.util.HashSet) set).clear();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanReasonIds", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    @Override // i74.l
    public void b(android.view.View view, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        try {
            if (i17 == 5) {
                h(view, obj);
            } else {
                if (i17 == 3) {
                    g();
                } else if (i17 == 4) {
                    i(view, obj);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1962, i17 + 10);
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FeedbackNewStylePromptManager", "onAction failed : actionId = " + i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    public final int c(android.graphics.Rect rect, android.graphics.Rect rect2, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackNewStylePromptManager", "adjustWindowPosition, anchorRect=" + rect + ", windowsRect=" + rect2);
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.f386338n, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view.getMeasuredHeight();
        if (rect.bottom + measuredHeight <= rect2.height()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
            return 0;
        }
        int i17 = -(measuredHeight + rect.height());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        return i17;
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dismissWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackNewStylePromptManager", "dismissWindow");
        m74.b bVar = this.f386332e;
        if (bVar != null) {
            bVar.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dismissWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    @Override // i74.l
    /* renamed from: dismiss */
    public void mo134889x63a3b28a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    public final void e() {
        java.lang.String str;
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        android.widget.FrameLayout frameLayout;
        java.lang.String str2 = "ensurePopupWindow";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("ensurePopupWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        if (this.f386332e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder");
            android.content.Context context = this.f386331d;
            if (context == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder");
                str = "ensurePopupWindow";
                frameLayout = null;
            } else {
                k74.j jVar = new k74.j();
                android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(context);
                c44.a.l();
                if (frameLayout2.getLayoutParams() == null) {
                    c44.a.o();
                    frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                    layoutParams.width = -1;
                    frameLayout2.setLayoutParams(layoutParams);
                }
                c44.a.o();
                if (frameLayout2.getLayoutParams() == null) {
                    c44.a.o();
                    frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
                    layoutParams2.height = -2;
                    frameLayout2.setLayoutParams(layoutParams2);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMRootView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMRootView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(frameLayout2.getContext());
                frameLayout2.addView(linearLayout);
                c44.a.o();
                if (linearLayout.getLayoutParams() == null) {
                    c44.a.o();
                    linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                    layoutParams3.width = -2;
                    linearLayout.setLayoutParams(layoutParams3);
                }
                c44.a.o();
                if (linearLayout.getLayoutParams() == null) {
                    c44.a.o();
                    linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
                    layoutParams4.height = -2;
                    linearLayout.setLayoutParams(layoutParams4);
                }
                c44.a.m();
                linearLayout.setOrientation(1);
                int h17 = c44.a.h();
                android.view.ViewGroup.LayoutParams layoutParams5 = linearLayout.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams5 : null;
                if (layoutParams6 != null) {
                    layoutParams6.gravity = h17;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams7 = linearLayout.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams7 : null;
                    if (layoutParams8 != null) {
                        layoutParams8.gravity = h17;
                    }
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(linearLayout.getContext());
                linearLayout.addView(c22699x3dcdb352);
                int a17 = c44.b.a(15);
                if (c22699x3dcdb352.getLayoutParams() == null) {
                    c44.a.o();
                    c22699x3dcdb352.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a17, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams9 = c22699x3dcdb352.getLayoutParams();
                    layoutParams9.width = a17;
                    c22699x3dcdb352.setLayoutParams(layoutParams9);
                }
                int a18 = c44.b.a(6);
                if (c22699x3dcdb352.getLayoutParams() == null) {
                    c44.a.o();
                    c22699x3dcdb352.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a18));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams10 = c22699x3dcdb352.getLayoutParams();
                    layoutParams10.height = a18;
                    c22699x3dcdb352.setLayoutParams(layoutParams10);
                }
                int h18 = c44.a.h();
                android.view.ViewGroup.LayoutParams layoutParams11 = c22699x3dcdb352.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams12 = layoutParams11 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams11 : null;
                if (layoutParams12 != null) {
                    layoutParams12.gravity = h18;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams13 = c22699x3dcdb352.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams14 = layoutParams13 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams13 : null;
                    if (layoutParams14 != null) {
                        layoutParams14.gravity = h18;
                    }
                }
                int a19 = c44.b.a(26);
                android.view.ViewGroup.LayoutParams layoutParams15 = c22699x3dcdb352.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams15 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams15 : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.rightMargin = a19;
                }
                c22699x3dcdb352.setScaleType(c44.a.b());
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f81071x1b15a5b0);
                c22699x3dcdb352.m82040x7541828(i65.a.d(c22699x3dcdb352.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMTopArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                jVar.f386341c = c22699x3dcdb352;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMTopArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(linearLayout.getContext());
                linearLayout.addView(linearLayout2);
                c44.a.o();
                if (linearLayout2.getLayoutParams() == null) {
                    c44.a.o();
                    linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams16 = linearLayout2.getLayoutParams();
                    layoutParams16.width = -2;
                    linearLayout2.setLayoutParams(layoutParams16);
                }
                c44.a.o();
                if (linearLayout2.getLayoutParams() == null) {
                    c44.a.o();
                    linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams17 = linearLayout2.getLayoutParams();
                    layoutParams17.height = -2;
                    linearLayout2.setLayoutParams(layoutParams17);
                }
                c44.a.m();
                linearLayout2.setOrientation(1);
                int h19 = c44.a.h();
                android.view.ViewGroup.LayoutParams layoutParams18 = linearLayout2.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams19 = layoutParams18 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams18 : null;
                if (layoutParams19 != null) {
                    layoutParams19.gravity = h19;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams20 = linearLayout2.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams21 = layoutParams20 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams20 : null;
                    if (layoutParams21 != null) {
                        layoutParams21.gravity = h19;
                    }
                }
                linearLayout2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563636co3);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMPanelContentView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                jVar.f386346h = linearLayout2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMPanelContentView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(linearLayout2.getContext());
                linearLayout2.addView(linearLayout3);
                c44.a.l();
                if (linearLayout3.getLayoutParams() == null) {
                    c44.a.o();
                    linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams22 = linearLayout3.getLayoutParams();
                    layoutParams22.width = -1;
                    linearLayout3.setLayoutParams(layoutParams22);
                }
                c44.a.o();
                if (linearLayout3.getLayoutParams() == null) {
                    c44.a.o();
                    linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams23 = linearLayout3.getLayoutParams();
                    layoutParams23.height = -2;
                    linearLayout3.setLayoutParams(layoutParams23);
                }
                str = "ensurePopupWindow";
                linearLayout3.setPadding(c44.b.a(16), linearLayout3.getPaddingTop(), linearLayout3.getPaddingRight(), linearLayout3.getPaddingBottom());
                linearLayout3.setPadding(linearLayout3.getPaddingLeft(), linearLayout3.getPaddingTop(), c44.b.a(16), linearLayout3.getPaddingBottom());
                int a27 = c44.b.a(16);
                android.view.ViewGroup.LayoutParams layoutParams24 = linearLayout3.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams24 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams24 : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.topMargin = a27;
                }
                int a28 = c44.b.a(12);
                android.view.ViewGroup.LayoutParams layoutParams25 = linearLayout3.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams25 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams25 : null;
                if (marginLayoutParams3 != null) {
                    marginLayoutParams3.bottomMargin = a28;
                }
                c44.a.j();
                linearLayout3.setOrientation(0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMTopLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                jVar.f386340b = linearLayout3;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMTopLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(linearLayout3.getContext());
                linearLayout3.addView(linearLayout4);
                if (linearLayout4.getLayoutParams() == null) {
                    c44.a.o();
                    linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(0, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams26 = linearLayout4.getLayoutParams();
                    layoutParams26.width = 0;
                    linearLayout4.setLayoutParams(layoutParams26);
                }
                c44.a.o();
                if (linearLayout4.getLayoutParams() == null) {
                    c44.a.o();
                    linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams27 = linearLayout4.getLayoutParams();
                    layoutParams27.height = -2;
                    linearLayout4.setLayoutParams(layoutParams27);
                }
                int g17 = c44.a.g() | c44.a.i();
                android.view.ViewGroup.LayoutParams layoutParams28 = linearLayout4.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams29 = layoutParams28 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams28 : null;
                if (layoutParams29 != null) {
                    layoutParams29.gravity = g17;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams30 = linearLayout4.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams31 = layoutParams30 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams30 : null;
                    if (layoutParams31 != null) {
                        layoutParams31.gravity = g17;
                    }
                }
                c44.a.m();
                linearLayout4.setOrientation(1);
                android.view.ViewGroup.LayoutParams layoutParams32 = linearLayout4.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams33 = layoutParams32 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams32 : null;
                if (layoutParams33 != null) {
                    layoutParams33.weight = 3;
                }
                int a29 = c44.b.a(16);
                android.view.ViewGroup.LayoutParams layoutParams34 = linearLayout4.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams34 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams34 : null;
                if (marginLayoutParams4 != null) {
                    marginLayoutParams4.rightMargin = a29;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMFeedbackTextContainer", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMFeedbackTextContainer", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                android.widget.TextView textView = new android.widget.TextView(linearLayout4.getContext());
                linearLayout4.addView(textView);
                c44.a.o();
                if (textView.getLayoutParams() == null) {
                    c44.a.o();
                    i17 = -2;
                    textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    i17 = -2;
                    android.view.ViewGroup.LayoutParams layoutParams35 = textView.getLayoutParams();
                    layoutParams35.width = -2;
                    textView.setLayoutParams(layoutParams35);
                }
                c44.a.o();
                if (textView.getLayoutParams() == null) {
                    c44.a.o();
                    textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i17, i17));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams36 = textView.getLayoutParams();
                    layoutParams36.height = i17;
                    textView.setLayoutParams(layoutParams36);
                }
                textView.setIncludeFontPadding(false);
                int a37 = c44.b.a(4);
                android.view.ViewGroup.LayoutParams layoutParams37 = textView.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams37 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams37 : null;
                if (marginLayoutParams5 != null) {
                    marginLayoutParams5.bottomMargin = a37;
                }
                textView.setTextSize(0, (int) ca4.m0.I(com.p314xaae8f345.mm.R.C30860x5b28f31.a_i));
                textView.setTextColor(i65.a.d(textView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
                java.lang.String string = textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ls8);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                textView.setText(string);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMFeedbackTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMFeedbackTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                android.widget.TextView textView2 = new android.widget.TextView(linearLayout4.getContext());
                linearLayout4.addView(textView2);
                c44.a.o();
                if (textView2.getLayoutParams() == null) {
                    c44.a.o();
                    i18 = -2;
                    textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    i18 = -2;
                    android.view.ViewGroup.LayoutParams layoutParams38 = textView2.getLayoutParams();
                    layoutParams38.width = -2;
                    textView2.setLayoutParams(layoutParams38);
                }
                c44.a.o();
                if (textView2.getLayoutParams() == null) {
                    c44.a.o();
                    textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i18, i18));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams39 = textView2.getLayoutParams();
                    layoutParams39.height = i18;
                    textView2.setLayoutParams(layoutParams39);
                }
                textView2.setTextSize(0, (int) ca4.m0.I(com.p314xaae8f345.mm.R.C30860x5b28f31.a_h));
                textView2.setTextColor(i65.a.d(textView2.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
                java.lang.String string2 = textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574723ls5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                textView2.setText(string2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMFeedbackDescView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMFeedbackDescView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                android.widget.FrameLayout frameLayout3 = new android.widget.FrameLayout(linearLayout3.getContext());
                linearLayout3.addView(frameLayout3);
                if (frameLayout3.getLayoutParams() == null) {
                    c44.a.o();
                    frameLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(0, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams40 = frameLayout3.getLayoutParams();
                    layoutParams40.width = 0;
                    frameLayout3.setLayoutParams(layoutParams40);
                }
                c44.a.o();
                if (frameLayout3.getLayoutParams() == null) {
                    c44.a.o();
                    frameLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams41 = frameLayout3.getLayoutParams();
                    layoutParams41.height = -2;
                    frameLayout3.setLayoutParams(layoutParams41);
                }
                android.view.ViewGroup.LayoutParams layoutParams42 = frameLayout3.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams43 = layoutParams42 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams42 : null;
                if (layoutParams43 != null) {
                    layoutParams43.weight = 2;
                }
                android.widget.TextView textView3 = new android.widget.TextView(frameLayout3.getContext());
                frameLayout3.addView(textView3);
                c44.a.o();
                if (textView3.getLayoutParams() == null) {
                    c44.a.o();
                    i19 = -2;
                    textView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    i19 = -2;
                    android.view.ViewGroup.LayoutParams layoutParams44 = textView3.getLayoutParams();
                    layoutParams44.width = -2;
                    textView3.setLayoutParams(layoutParams44);
                }
                c44.a.o();
                if (textView3.getLayoutParams() == null) {
                    c44.a.o();
                    textView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i19, i19));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams45 = textView3.getLayoutParams();
                    layoutParams45.height = i19;
                    textView3.setLayoutParams(layoutParams45);
                }
                int h27 = c44.a.h() | c44.a.i();
                android.view.ViewGroup.LayoutParams layoutParams46 = textView3.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams47 = layoutParams46 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams46 : null;
                if (layoutParams47 != null) {
                    layoutParams47.gravity = h27;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams48 = textView3.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams49 = layoutParams48 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams48 : null;
                    if (layoutParams49 != null) {
                        layoutParams49.gravity = h27;
                    }
                }
                textView3.setGravity(c44.a.d());
                textView3.setIncludeFontPadding(false);
                textView3.setPadding(c44.b.a(12), textView3.getPaddingTop(), textView3.getPaddingRight(), textView3.getPaddingBottom());
                textView3.setPadding(textView3.getPaddingLeft(), c44.b.a(8), textView3.getPaddingRight(), textView3.getPaddingBottom());
                textView3.setPadding(textView3.getPaddingLeft(), textView3.getPaddingTop(), c44.b.a(12), textView3.getPaddingBottom());
                textView3.setPadding(textView3.getPaddingLeft(), textView3.getPaddingTop(), textView3.getPaddingRight(), c44.b.a(8));
                textView3.setTextSize(0, (int) ca4.m0.I(com.p314xaae8f345.mm.R.C30860x5b28f31.a_h));
                java.lang.String string3 = textView3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574721ls3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                textView3.setText(string3);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMFeedbackSubmitBtn", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                jVar.f386339a = textView3;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMFeedbackSubmitBtn", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2119xf495eb85.p2120x72ce5378.C17753xe309eb09 c17753xe309eb09 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2119xf495eb85.p2120x72ce5378.C17753xe309eb09(context, null);
                c44.a.o();
                if (c17753xe309eb09.getLayoutParams() == null) {
                    c44.a.o();
                    i27 = -2;
                    c17753xe309eb09.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    i27 = -2;
                    android.view.ViewGroup.LayoutParams layoutParams50 = c17753xe309eb09.getLayoutParams();
                    layoutParams50.width = -2;
                    c17753xe309eb09.setLayoutParams(layoutParams50);
                }
                c44.a.o();
                if (c17753xe309eb09.getLayoutParams() == null) {
                    c44.a.o();
                    c17753xe309eb09.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i27, i27));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams51 = c17753xe309eb09.getLayoutParams();
                    layoutParams51.height = i27;
                    c17753xe309eb09.setLayoutParams(layoutParams51);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMSelectItemContainer", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                jVar.f386343e = c17753xe309eb09;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMSelectItemContainer", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                linearLayout2.addView(jVar.b());
                android.view.View view = new android.view.View(linearLayout2.getContext());
                linearLayout2.addView(view);
                c44.a.l();
                if (view.getLayoutParams() == null) {
                    c44.a.o();
                    i28 = -2;
                    view.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                } else {
                    i28 = -2;
                    android.view.ViewGroup.LayoutParams layoutParams52 = view.getLayoutParams();
                    layoutParams52.width = -1;
                    view.setLayoutParams(layoutParams52);
                }
                if (view.getLayoutParams() == null) {
                    c44.a.o();
                    view.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i28, 1));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams53 = view.getLayoutParams();
                    layoutParams53.height = 1;
                    view.setLayoutParams(layoutParams53);
                }
                int a38 = c44.b.a(16);
                android.view.ViewGroup.LayoutParams layoutParams54 = view.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams54 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams54 : null;
                if (marginLayoutParams6 != null) {
                    marginLayoutParams6.topMargin = a38;
                }
                view.setBackgroundColor(i65.a.d(view.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
                android.widget.FrameLayout frameLayout4 = new android.widget.FrameLayout(linearLayout2.getContext());
                linearLayout2.addView(frameLayout4);
                c44.a.l();
                if (frameLayout4.getLayoutParams() == null) {
                    c44.a.o();
                    frameLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams55 = frameLayout4.getLayoutParams();
                    layoutParams55.width = -1;
                    frameLayout4.setLayoutParams(layoutParams55);
                }
                c44.a.o();
                if (frameLayout4.getLayoutParams() == null) {
                    c44.a.o();
                    frameLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams56 = frameLayout4.getLayoutParams();
                    layoutParams56.height = -2;
                    frameLayout4.setLayoutParams(layoutParams56);
                }
                int a39 = c44.b.a(16);
                frameLayout4.setPadding(a39, a39, a39, a39);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMComplaintLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                jVar.f386344f = frameLayout4;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMComplaintLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                android.widget.TextView textView4 = new android.widget.TextView(frameLayout4.getContext());
                frameLayout4.addView(textView4);
                c44.a.o();
                if (textView4.getLayoutParams() == null) {
                    c44.a.o();
                    i29 = -2;
                    textView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    i29 = -2;
                    android.view.ViewGroup.LayoutParams layoutParams57 = textView4.getLayoutParams();
                    layoutParams57.width = -2;
                    textView4.setLayoutParams(layoutParams57);
                }
                c44.a.o();
                if (textView4.getLayoutParams() == null) {
                    c44.a.o();
                    textView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i29, i29));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams58 = textView4.getLayoutParams();
                    layoutParams58.height = i29;
                    textView4.setLayoutParams(layoutParams58);
                }
                int g18 = c44.a.g() | c44.a.f();
                android.view.ViewGroup.LayoutParams layoutParams59 = textView4.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams60 = layoutParams59 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams59 : null;
                if (layoutParams60 != null) {
                    layoutParams60.gravity = g18;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams61 = textView4.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams62 = layoutParams61 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams61 : null;
                    if (layoutParams62 != null) {
                        layoutParams62.gravity = g18;
                    }
                }
                int a47 = c44.b.a(48);
                android.view.ViewGroup.LayoutParams layoutParams63 = textView4.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams63 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams63 : null;
                if (marginLayoutParams7 != null) {
                    marginLayoutParams7.rightMargin = a47;
                }
                textView4.setIncludeFontPadding(false);
                textView4.setSingleLine(true);
                textView4.setEllipsize(android.text.TextUtils.TruncateAt.END);
                textView4.setTextColor(i65.a.d(textView4.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
                textView4.setTextSize(0, (int) ca4.m0.I(com.p314xaae8f345.mm.R.C30860x5b28f31.a_h));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMComplaintTextView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                jVar.f386345g = textView4;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMComplaintTextView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(frameLayout4.getContext());
                frameLayout4.addView(c22699x3dcdb3522);
                int a48 = c44.b.a(10);
                if (c22699x3dcdb3522.getLayoutParams() == null) {
                    c44.a.o();
                    c22699x3dcdb3522.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a48, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams64 = c22699x3dcdb3522.getLayoutParams();
                    layoutParams64.width = a48;
                    c22699x3dcdb3522.setLayoutParams(layoutParams64);
                }
                int a49 = c44.b.a(20);
                if (c22699x3dcdb3522.getLayoutParams() == null) {
                    c44.a.o();
                    c22699x3dcdb3522.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a49));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams65 = c22699x3dcdb3522.getLayoutParams();
                    layoutParams65.height = a49;
                    c22699x3dcdb3522.setLayoutParams(layoutParams65);
                }
                c22699x3dcdb3522.setScaleType(c44.a.b());
                int h28 = c44.a.h() | c44.a.f();
                android.view.ViewGroup.LayoutParams layoutParams66 = c22699x3dcdb3522.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams67 = layoutParams66 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams66 : null;
                if (layoutParams67 != null) {
                    layoutParams67.gravity = h28;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams68 = c22699x3dcdb3522.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams69 = layoutParams68 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams68 : null;
                    if (layoutParams69 != null) {
                        layoutParams69.gravity = h28;
                    }
                }
                c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f81070x8adfab41);
                c22699x3dcdb3522.m82040x7541828(i65.a.d(c22699x3dcdb3522.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(linearLayout.getContext());
                linearLayout.addView(c22699x3dcdb3523);
                int a57 = c44.b.a(15);
                if (c22699x3dcdb3523.getLayoutParams() == null) {
                    c44.a.o();
                    c22699x3dcdb3523.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a57, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams70 = c22699x3dcdb3523.getLayoutParams();
                    layoutParams70.width = a57;
                    c22699x3dcdb3523.setLayoutParams(layoutParams70);
                }
                int a58 = c44.b.a(6);
                if (c22699x3dcdb3523.getLayoutParams() == null) {
                    c44.a.o();
                    c22699x3dcdb3523.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a58));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams71 = c22699x3dcdb3523.getLayoutParams();
                    layoutParams71.height = a58;
                    c22699x3dcdb3523.setLayoutParams(layoutParams71);
                }
                int h29 = c44.a.h();
                android.view.ViewGroup.LayoutParams layoutParams72 = c22699x3dcdb3523.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams73 = layoutParams72 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams72 : null;
                if (layoutParams73 != null) {
                    layoutParams73.gravity = h29;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams74 = c22699x3dcdb3523.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams75 = layoutParams74 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams74 : null;
                    if (layoutParams75 != null) {
                        layoutParams75.gravity = h29;
                    }
                }
                int a59 = c44.b.a(26);
                android.view.ViewGroup.LayoutParams layoutParams76 = c22699x3dcdb3523.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams76 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams76 : null;
                if (marginLayoutParams8 != null) {
                    marginLayoutParams8.rightMargin = a59;
                }
                c22699x3dcdb3523.setScaleType(c44.a.b());
                c22699x3dcdb3523.setImageResource(com.p314xaae8f345.mm.R.raw.f81071x1b15a5b0);
                c22699x3dcdb3523.m82040x7541828(i65.a.d(c22699x3dcdb3523.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
                c22699x3dcdb3523.setRotation(180.0f);
                c44.a.c();
                c22699x3dcdb3523.setVisibility(8);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMBottomArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                jVar.f386342d = c22699x3dcdb3523;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMBottomArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                frameLayout2.setTag(com.p314xaae8f345.mm.R.id.qae, jVar);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder");
                frameLayout = frameLayout2;
            }
            m74.b bVar = new m74.b(context);
            this.f386332e = bVar;
            bVar.setContentView(frameLayout);
            this.f386332e.setWidth(this.f386338n);
            this.f386332e.setHeight(-2);
            this.f386332e.setFocusable(true);
            this.f386332e.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            this.f386332e.setOnDismissListener(this);
            str2 = str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    public final android.graphics.Rect f(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAnchorViewRect", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = iArr[0];
        rect.left = i17;
        rect.top = iArr[1];
        rect.right = i17 + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAnchorViewRect", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        return rect;
    }

    public final void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onComplaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("complaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        try {
            android.content.Context context = this.f386331d;
            if (context != null) {
                android.content.Intent f17 = this.f386335h.f();
                boolean c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(f17, "complaint_weapp", false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackNewStylePromptManager", "complaint, toWeApp=" + c17);
                if (c17) {
                    l(f17);
                } else {
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(f17, context);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("complaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onComplaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    public final void h(android.view.View view, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onComplaintReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        java.util.Set set = this.f386337m;
        if (set != null && (obj instanceof j74.c)) {
            int i17 = ((j74.c) obj).f379597a;
            if (view == null || !view.isSelected()) {
                ((java.util.HashSet) set).remove(java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackNewStylePromptManager", "onComplaintReason, remove id=" + i17);
            } else {
                ((java.util.HashSet) set).add(java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackNewStylePromptManager", "onComplaintReason, add id=" + i17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onComplaintReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    public final void i(android.view.View view, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 l17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfirm", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        boolean booleanValue = obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).booleanValue() : false;
        java.util.Set set = this.f386337m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackNewStylePromptManager", "onConfirm, isFeedback=" + booleanValue + ", selectCount=" + (set != null ? ((java.util.HashSet) set).size() : 0));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("thanks", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackNewStylePromptManager", "thanks, isFeedback=" + booleanValue);
            android.content.Context context = this.f386331d;
            db5.t7.h(context, booleanValue ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ls7) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574722ls4));
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("thanks", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = this.f386336i;
        if (iVar != null) {
            iVar.G(view);
        }
        i74.a aVar = this.f386335h;
        if (aVar != null && (l17 = aVar.l(set)) != null) {
            gm0.j1.i();
            gm0.j1.n().f354821b.g(l17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfirm", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    public final void j(int i17) {
        android.view.View view;
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        k74.h hVar = this.f386334g;
        if (hVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
            android.view.View view3 = null;
            if (i17 >= 0) {
                k74.j jVar = hVar.f386326e;
                if (jVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMTopArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                    view2 = jVar.f386341c;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMTopArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                } else {
                    view2 = null;
                }
                if (view2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    android.view.View view4 = view2;
                    yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                k74.j jVar2 = hVar.f386326e;
                if (jVar2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMBottomArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                    view3 = jVar2.f386342d;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMBottomArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                }
                if (view3 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    android.view.View view5 = view3;
                    yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                k74.j jVar3 = hVar.f386326e;
                if (jVar3 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMTopArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                    view = jVar3.f386341c;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMTopArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                } else {
                    view = null;
                }
                if (view != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    android.view.View view6 = view;
                    yj0.a.d(view6, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                k74.j jVar4 = hVar.f386326e;
                if (jVar4 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMBottomArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                    view3 = jVar4.f386342d;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMBottomArrowIconView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
                }
                if (view3 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    android.view.View view7 = view3;
                    yj0.a.d(view7, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer", "showArrowByWindowPosition", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071 A[Catch: all -> 0x0176, TRY_ENTER, TryCatch #0 {all -> 0x0176, blocks: (B:7:0x0020, B:9:0x002e, B:11:0x0040, B:14:0x004a, B:22:0x0063, B:26:0x0071, B:28:0x0088, B:29:0x009c, B:31:0x00b4, B:33:0x00ba, B:35:0x00c3, B:36:0x00e8, B:37:0x00d5, B:38:0x00f9, B:42:0x011d, B:44:0x013c, B:45:0x0149, B:47:0x0163, B:48:0x016f, B:51:0x016a, B:52:0x0143, B:53:0x008c, B:55:0x0092, B:56:0x0099, B:59:0x0067, B:62:0x0034), top: B:6:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k(android.view.View r14, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r15) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k74.i.k(android.view.View, com.tencent.mm.plugin.sns.storage.SnsInfo):boolean");
    }

    public final void l(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "appUserName");
        java.lang.String l18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "appPagePath");
        java.lang.String l19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "appVersion");
        java.lang.String l27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "aId");
        java.lang.String l28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "traceId");
        java.lang.String l29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "sceneNote");
        java.lang.String l37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "uxInfo");
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1045);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        if (android.text.TextUtils.isEmpty(l17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FeedbackNewStylePromptManager", "the app user name is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        } else {
            ca4.z0.r0(l17, l18, l19, l27, l28, l29, l37, g17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
        m74.b bVar = this.f386332e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackNewStylePromptManager", "onDismiss, windows.hash=" + (bVar == null ? 0 : bVar.hashCode()));
        this.f386332e = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
    }
}
