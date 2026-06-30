package p44;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f433395a;

    /* renamed from: b, reason: collision with root package name */
    public final int f433396b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f433397c;

    /* renamed from: d, reason: collision with root package name */
    public final i64.b1 f433398d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f433399e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f433400f;

    /* renamed from: g, reason: collision with root package name */
    public p44.r f433401g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f433402h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f433403i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f433404j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.FrameLayout f433405k;

    /* renamed from: l, reason: collision with root package name */
    public final p44.o0 f433406l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f433407m;

    /* renamed from: n, reason: collision with root package name */
    public final p44.x f433408n;

    static {
        new p44.w(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(android.content.Context mContext, int i17, int i18, android.view.View mContentView, android.view.View itemRootView, i64.b1 b1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContentView, "mContentView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemRootView, "itemRootView");
        this.f433395a = mContext;
        this.f433396b = i17;
        this.f433397c = mContentView;
        this.f433398d = b1Var;
        this.f433400f = "";
        p44.o0 o0Var = new p44.o0(mContext, i17, i18, mContentView);
        this.f433406l = o0Var;
        android.view.ViewStub viewStub = (android.view.ViewStub) itemRootView.findViewById(com.p314xaae8f345.mm.R.id.r0w);
        android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
        android.widget.FrameLayout frameLayout = inflate instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) inflate : null;
        this.f433405k = frameLayout;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = i18;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init, displayWidth=");
        sb6.append(i18);
        sb6.append(", layout.hash=");
        sb6.append(frameLayout != null ? java.lang.Integer.valueOf(frameLayout.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardLogic", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createContentView", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        if (frameLayout == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createContentView", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        } else {
            android.content.Context context = o0Var.f433344a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17722xf4627fba c17722xf4627fba = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17722xf4627fba(context, null);
            o0Var.f433357n = c17722xf4627fba;
            c44.a.o();
            c44.a.o();
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = c44.a.e();
            layoutParams2.topMargin = o0Var.j(5);
            c17722xf4627fba.setLayoutParams(layoutParams2);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(frameLayout.getContext());
            frameLayout.addView(frameLayout2);
            c44.a.l();
            if (frameLayout2.getLayoutParams() == null) {
                c44.a.o();
                frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
                layoutParams3.width = -1;
                frameLayout2.setLayoutParams(layoutParams3);
            }
            c44.a.l();
            if (frameLayout2.getLayoutParams() == null) {
                c44.a.o();
                frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams4 = frameLayout2.getLayoutParams();
                layoutParams4.height = -1;
                frameLayout2.setLayoutParams(layoutParams4);
            }
            o0Var.f433352i = frameLayout2;
            android.widget.ImageView imageView = new android.widget.ImageView(frameLayout.getContext());
            frameLayout.addView(imageView);
            c44.a.l();
            if (imageView.getLayoutParams() == null) {
                c44.a.o();
                imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
                layoutParams5.width = -1;
                imageView.setLayoutParams(layoutParams5);
            }
            c44.a.l();
            if (imageView.getLayoutParams() == null) {
                c44.a.o();
                imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams6 = imageView.getLayoutParams();
                layoutParams6.height = -1;
                imageView.setLayoutParams(layoutParams6);
            }
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            imageView.setAlpha(0.0f);
            o0Var.f433354k = imageView;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(frameLayout.getContext());
            frameLayout.addView(linearLayout);
            c44.a.l();
            if (linearLayout.getLayoutParams() == null) {
                c44.a.o();
                linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams7 = linearLayout.getLayoutParams();
                layoutParams7.width = -1;
                linearLayout.setLayoutParams(layoutParams7);
            }
            c44.a.l();
            if (linearLayout.getLayoutParams() == null) {
                c44.a.o();
                linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams8 = linearLayout.getLayoutParams();
                layoutParams8.height = -1;
                linearLayout.setLayoutParams(layoutParams8);
            }
            c44.a.m();
            linearLayout.setOrientation(1);
            linearLayout.setGravity(c44.a.e());
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            android.widget.TextView textView = new android.widget.TextView(linearLayout.getContext());
            linearLayout.addView(textView);
            c44.a.o();
            if (textView.getLayoutParams() == null) {
                c44.a.o();
                textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams9 = textView.getLayoutParams();
                layoutParams9.width = -2;
                textView.setLayoutParams(layoutParams9);
            }
            c44.a.o();
            if (textView.getLayoutParams() == null) {
                c44.a.o();
                textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams10 = textView.getLayoutParams();
                layoutParams10.height = -2;
                textView.setLayoutParams(layoutParams10);
            }
            int j17 = o0Var.j(4);
            android.view.ViewGroup.LayoutParams layoutParams11 = textView.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams11 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams11 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = j17;
            }
            textView.setTextSize(0, o0Var.j(15));
            textView.setSingleLine(true);
            textView.setEllipsize(c44.a.a());
            textView.setLineSpacing(0.0f, 1.0f);
            textView.setIncludeFontPadding(false);
            c44.a.c();
            textView.setVisibility(8);
            o0Var.f433351h = textView;
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(linearLayout.getContext());
            linearLayout.addView(linearLayout2);
            c44.a.o();
            if (linearLayout2.getLayoutParams() == null) {
                c44.a.o();
                linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams12 = linearLayout2.getLayoutParams();
                layoutParams12.width = -2;
                linearLayout2.setLayoutParams(layoutParams12);
            }
            c44.a.o();
            if (linearLayout2.getLayoutParams() == null) {
                c44.a.o();
                linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams13 = linearLayout2.getLayoutParams();
                layoutParams13.height = -2;
                linearLayout2.setLayoutParams(layoutParams13);
            }
            linearLayout2.setGravity(c44.a.f());
            o0Var.f433348e = linearLayout2;
            android.widget.ImageView imageView2 = new android.widget.ImageView(linearLayout2.getContext());
            linearLayout2.addView(imageView2);
            int j18 = o0Var.j(16);
            if (imageView2.getLayoutParams() == null) {
                c44.a.o();
                imageView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(j18, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams14 = imageView2.getLayoutParams();
                layoutParams14.width = j18;
                imageView2.setLayoutParams(layoutParams14);
            }
            int j19 = o0Var.j(16);
            if (imageView2.getLayoutParams() == null) {
                c44.a.o();
                imageView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, j19));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams15 = imageView2.getLayoutParams();
                layoutParams15.height = j19;
                imageView2.setLayoutParams(layoutParams15);
            }
            o0Var.f433349f = imageView2;
            android.widget.TextView textView2 = new android.widget.TextView(linearLayout2.getContext());
            linearLayout2.addView(textView2);
            c44.a.o();
            if (textView2.getLayoutParams() == null) {
                c44.a.o();
                textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams16 = textView2.getLayoutParams();
                layoutParams16.width = -2;
                textView2.setLayoutParams(layoutParams16);
            }
            c44.a.o();
            if (textView2.getLayoutParams() == null) {
                c44.a.o();
                textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams17 = textView2.getLayoutParams();
                layoutParams17.height = -2;
                textView2.setLayoutParams(layoutParams17);
            }
            int j27 = o0Var.j(4);
            android.view.ViewGroup.LayoutParams layoutParams18 = textView2.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams18 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams18 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.leftMargin = j27;
            }
            textView2.setSingleLine(true);
            textView2.setEllipsize(c44.a.a());
            textView2.setTextSize(0, o0Var.j(15));
            textView2.setLineSpacing(0.0f, 1.0f);
            o0Var.f433350g = textView2;
            android.widget.FrameLayout frameLayout3 = new android.widget.FrameLayout(linearLayout.getContext());
            linearLayout.addView(frameLayout3);
            c44.a.o();
            if (frameLayout3.getLayoutParams() == null) {
                c44.a.o();
                frameLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams19 = frameLayout3.getLayoutParams();
                layoutParams19.width = -2;
                frameLayout3.setLayoutParams(layoutParams19);
            }
            c44.a.o();
            if (frameLayout3.getLayoutParams() == null) {
                c44.a.o();
                frameLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams20 = frameLayout3.getLayoutParams();
                layoutParams20.height = -2;
                frameLayout3.setLayoutParams(layoutParams20);
            }
            int j28 = o0Var.j(4);
            android.view.ViewGroup.LayoutParams layoutParams21 = frameLayout3.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams21 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams21 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.topMargin = j28;
            }
            android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(frameLayout3.getContext());
            frameLayout3.addView(linearLayout3);
            c44.a.o();
            if (linearLayout3.getLayoutParams() == null) {
                c44.a.o();
                linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams22 = linearLayout3.getLayoutParams();
                layoutParams22.width = -2;
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
            c44.a.m();
            linearLayout3.setOrientation(1);
            int e17 = c44.a.e();
            android.view.ViewGroup.LayoutParams layoutParams24 = linearLayout3.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams25 = layoutParams24 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams24 : null;
            if (layoutParams25 != null) {
                layoutParams25.gravity = e17;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams26 = linearLayout3.getLayoutParams();
                android.widget.FrameLayout.LayoutParams layoutParams27 = layoutParams26 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams26 : null;
                if (layoutParams27 != null) {
                    layoutParams27.gravity = e17;
                }
            }
            android.widget.TextView textView3 = new android.widget.TextView(linearLayout3.getContext());
            linearLayout3.addView(textView3);
            c44.a.o();
            if (textView3.getLayoutParams() == null) {
                c44.a.o();
                textView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams28 = textView3.getLayoutParams();
                layoutParams28.width = -2;
                textView3.setLayoutParams(layoutParams28);
            }
            c44.a.o();
            if (textView3.getLayoutParams() == null) {
                c44.a.o();
                textView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams29 = textView3.getLayoutParams();
                layoutParams29.height = -2;
                textView3.setLayoutParams(layoutParams29);
            }
            textView3.setSingleLine(true);
            textView3.setEllipsize(c44.a.a());
            textView3.setTextSize(0, o0Var.j(14));
            textView3.setLineSpacing(0.0f, 1.0f);
            o0Var.f433355l = textView3;
            android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(frameLayout3.getContext());
            frameLayout3.addView(linearLayout4);
            c44.a.o();
            if (linearLayout4.getLayoutParams() == null) {
                c44.a.o();
                linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams30 = linearLayout4.getLayoutParams();
                layoutParams30.width = -2;
                linearLayout4.setLayoutParams(layoutParams30);
            }
            c44.a.o();
            if (linearLayout4.getLayoutParams() == null) {
                c44.a.o();
                linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams31 = linearLayout4.getLayoutParams();
                layoutParams31.height = -2;
                linearLayout4.setLayoutParams(layoutParams31);
            }
            c44.a.m();
            linearLayout4.setOrientation(1);
            int e18 = c44.a.e();
            android.view.ViewGroup.LayoutParams layoutParams32 = linearLayout4.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams33 = layoutParams32 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams32 : null;
            if (layoutParams33 != null) {
                layoutParams33.gravity = e18;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams34 = linearLayout4.getLayoutParams();
                android.widget.FrameLayout.LayoutParams layoutParams35 = layoutParams34 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams34 : null;
                if (layoutParams35 != null) {
                    layoutParams35.gravity = e18;
                }
            }
            android.widget.TextView textView4 = new android.widget.TextView(linearLayout4.getContext());
            linearLayout4.addView(textView4);
            c44.a.o();
            if (textView4.getLayoutParams() == null) {
                c44.a.o();
                textView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams36 = textView4.getLayoutParams();
                layoutParams36.width = -2;
                textView4.setLayoutParams(layoutParams36);
            }
            c44.a.o();
            if (textView4.getLayoutParams() == null) {
                c44.a.o();
                textView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams37 = textView4.getLayoutParams();
                layoutParams37.height = -2;
                textView4.setLayoutParams(layoutParams37);
            }
            textView4.setSingleLine(true);
            textView4.setEllipsize(c44.a.a());
            textView4.setTextSize(0, o0Var.j(14));
            textView4.setLineSpacing(0.0f, 1.0f);
            o0Var.f433356m = textView4;
            android.view.View view = o0Var.f433357n;
            if (view == null) {
                ca4.m0.j0();
            } else {
                linearLayout.addView(view);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createContentView", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initLifeCycleListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        p012xc85e97e9.p093xedfae76a.y yVar = mContext instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) mContext : null;
        if (yVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardLogic", "initLifeCycleListener");
            p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = yVar.mo273xed6858b4();
            if (mo273xed6858b4 != null) {
                mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1
                    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
                    /* renamed from: onDestroy */
                    public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardLogic", "onDestroy");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$stopListenEggCanvasEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        p44.z zVar = p44.z.this;
                        zVar.i();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$stopListenEggCanvasEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        p44.z.b(zVar).k();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1");
                    }

                    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
                    /* renamed from: onPause */
                    public void mo7796xb01dfb57(p012xc85e97e9.p093xedfae76a.y owner) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onPause, updateFlag=");
                        p44.z zVar = p44.z.this;
                        sb7.append(p44.z.c(zVar));
                        sb7.append(", stoppedFlag=");
                        sb7.append(p44.z.a(zVar));
                        sb7.append(", pausedFlag=");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        boolean z17 = zVar.f433404j;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        sb7.append(z17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardLogic", sb7.toString());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        zVar.f433404j = true;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1");
                    }

                    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
                    /* renamed from: onResume */
                    public void mo7055x57429eec(p012xc85e97e9.p093xedfae76a.y owner) {
                        java.lang.String str;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                        p44.z zVar = p44.z.this;
                        zVar.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMContentView", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMContentView", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        boolean isAttachedToWindow = zVar.f433397c.isAttachedToWindow();
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onResume, updateFlag=");
                        sb7.append(p44.z.c(zVar));
                        sb7.append(", stoppedFlag=");
                        sb7.append(p44.z.a(zVar));
                        sb7.append(", pausedFlag=");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        boolean z17 = zVar.f433404j;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        sb7.append(z17);
                        sb7.append(", isAttached=");
                        sb7.append(isAttachedToWindow);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardLogic", sb7.toString());
                        if (isAttachedToWindow) {
                            if (p44.z.c(zVar)) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMUpdateFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                                zVar.f433402h = false;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMUpdateFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                                p44.o0 b17 = p44.z.b(zVar);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardLogic", "checkStartAnim");
                                b17.i();
                                b17.d();
                                b17.b();
                            } else if (p44.z.a(zVar)) {
                                p44.o0 b18 = p44.z.b(zVar);
                                b18.getClass();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkStartPartAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17722xf4627fba c17722xf4627fba2 = b18.f433357n;
                                if (c17722xf4627fba2 != null) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkStartPartAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView");
                                    c17722xf4627fba2.n(true);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkStartPartAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView");
                                }
                                if (!b18.h()) {
                                    android.view.View view2 = b18.f433348e;
                                    if (view2 != null) {
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                        arrayList.add(java.lang.Float.valueOf(1.0f));
                                        java.util.Collections.reverse(arrayList);
                                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/helper/randompickcard/TimelineRandomPickLayoutCtrl", "checkStartPartAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                                        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/helper/randompickcard/TimelineRandomPickLayoutCtrl", "checkStartPartAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                    }
                                    android.widget.TextView textView5 = b18.f433350g;
                                    if (textView5 != null) {
                                        p44.r rVar = b18.f433358o;
                                        if (rVar == null || (str = rVar.b()) == null) {
                                            str = "";
                                        }
                                        textView5.setText(str);
                                    }
                                    b18.n(0L);
                                }
                                android.widget.TextView textView6 = b18.f433355l;
                                if (textView6 != null) {
                                    textView6.setVisibility(4);
                                }
                                android.widget.TextView textView7 = b18.f433356m;
                                if (textView7 != null) {
                                    textView7.setAlpha(1.0f);
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkStartPartAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMStoppedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        zVar.f433403i = false;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMStoppedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        zVar.f433404j = false;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1");
                    }

                    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
                    /* renamed from: onStop */
                    public void mo7798xc39f8281(p012xc85e97e9.p093xedfae76a.y owner) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStop", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onStop, updateFlag=");
                        p44.z zVar = p44.z.this;
                        sb7.append(p44.z.c(zVar));
                        sb7.append(", stoppedFlag=");
                        sb7.append(p44.z.a(zVar));
                        sb7.append(", pausedFlag=");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        boolean z17 = zVar.f433404j;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMPausedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        sb7.append(z17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardLogic", sb7.toString());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMStoppedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        zVar.f433403i = true;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMStoppedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                        p44.z.b(zVar).l();
                        p44.z.b(zVar).m();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$initLifeCycleListener$1$1");
                    }
                });
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initLifeCycleListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        this.f433408n = new p44.x(this);
    }

    public static final /* synthetic */ boolean a(p44.z zVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMStoppedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        boolean z17 = zVar.f433403i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMStoppedFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        return z17;
    }

    public static final /* synthetic */ p44.o0 b(p44.z zVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMTimelineRandomPickLayoutCtrl$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        p44.o0 o0Var = zVar.f433406l;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMTimelineRandomPickLayoutCtrl$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        return o0Var;
    }

    public static final /* synthetic */ boolean c(p44.z zVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMUpdateFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        boolean z17 = zVar.f433402h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMUpdateFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        return z17;
    }

    public final void d(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doCgiClickReport", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doCgiClickReport, clickPos=");
        sb6.append(i17);
        sb6.append(", subPos=");
        sb6.append(i18);
        sb6.append(", source=");
        sb6.append(this.f433396b);
        sb6.append(", snsInfo.isNull=");
        sb6.append(this.f433399e == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardLogic", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f433399e;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doCgiClickReport", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
            return;
        }
        int i19 = this.f433396b;
        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i19, i19 != 0 ? 2 : 1, c17933xe8d1b226.f68891x29d1292e, i17, 21);
        ca4.m0.g(c11137xb05b06ad, this.f433398d, c17933xe8d1b226, i17, i18);
        ca4.z0.x0(c11137xb05b06ad);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doCgiClickReport", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
    }

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17722xf4627fba c17722xf4627fba;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17722xf4627fba c17722xf4627fba2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        java.lang.String t07 = ca4.z0.t0(c17933xe8d1b226 != null ? c17933xe8d1b226.f68891x29d1292e : 0L);
        p44.r rVar = (c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null) ? null : m70354x74235b3e.f38268x3996fd45;
        p44.o0 o0Var = this.f433406l;
        android.widget.FrameLayout frameLayout = this.f433405k;
        if (rVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("RandomPickCardLogic", "initData, item reused for !randomPickAd, oldAd=" + this.f433400f + ", newAd=" + t07);
            this.f433402h = false;
            this.f433399e = null;
            this.f433400f = "";
            this.f433401g = null;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            i();
            o0Var.k();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startListenEggCanvasEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        if (this.f433407m == null) {
            final android.content.Context context = this.f433395a;
            if (context instanceof p012xc85e97e9.p093xedfae76a.y) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RandomPickCardLogic", "startListenEggCanvasEvent");
                try {
                    com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6032xa3513758> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6032xa3513758>(context) { // from class: com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super((p012xc85e97e9.p093xedfae76a.y) context);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                            this.f39173x3fe91575 = 101315400;
                        }

                        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                        /* renamed from: callback */
                        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6032xa3513758 c6032xa3513758) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1");
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6032xa3513758 event = c6032xa3513758;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                            d75.b.g(new p44.y(p44.z.this, event));
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1");
                            return false;
                        }
                    };
                    this.f433407m = abstractC20980x9b9ad01d;
                    abstractC20980x9b9ad01d.mo48813x58998cd();
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("RandomPickCardLogic", th6);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startListenEggCanvasEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f433399e;
        if (c17933xe8d1b2262 != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Long.valueOf(c17933xe8d1b2262.f68891x29d1292e), c17933xe8d1b226 != null ? java.lang.Long.valueOf(c17933xe8d1b226.f68891x29d1292e) : null)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardLogic", "initData, oldAd=" + this.f433400f + ", newAd=" + t07);
        this.f433402h = true;
        this.f433399e = c17933xe8d1b226;
        this.f433400f = t07;
        this.f433401g = rVar;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        o0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initData, pageId=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEggCanvasPageId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        java.lang.String str = rVar.f433380m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEggCanvasPageId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimelineRandomPickLayoutCtrl", sb6.toString());
        o0Var.f433358o = rVar;
        o0Var.f433361r = c17933xe8d1b226;
        if (rVar.f76385xff7d4bde != null && (c17722xf4627fba2 = o0Var.f433357n) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c17722xf4627fba2.TAG, "clear");
            c17722xf4627fba2.f244251h = "";
            c17722xf4627fba2.mItemViewList.clear();
            ((java.util.ArrayList) c17722xf4627fba2.f244252i).clear();
            c17722xf4627fba2.mRandomPickCardInfo = null;
            c17722xf4627fba2.removeAllViews();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEggCanvasPageId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str2 = rVar.f433380m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEggCanvasPageId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            c17722xf4627fba2.g(str2, rVar.f76385xff7d4bde, o0Var.f433346c);
            p44.d0 d0Var = o0Var.f433359p;
            if (d0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
                o0Var.f433359p = d0Var;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17722xf4627fba c17722xf4627fba3 = o0Var.f433357n;
                if (c17722xf4627fba3 != null) {
                    c17722xf4627fba3.m69365xa1aeda28(d0Var);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
            }
        }
        android.widget.ImageView imageView = o0Var.f433349f;
        if (imageView != null) {
            a84.z.e(rVar.f76386x8d2f34be, imageView);
        }
        android.widget.ImageView imageView2 = o0Var.f433354k;
        if (imageView2 != null) {
            imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.crc);
        }
        o0Var.o();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        o0Var.d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        p44.x xVar = this.f433408n;
        o0Var.f433359p = xVar;
        if (xVar != null && (c17722xf4627fba = o0Var.f433357n) != null) {
            c17722xf4627fba.m69365xa1aeda28(xVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        o0Var.l();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
    }

    public final void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardLogic", "onAdRemoved, updateFlag=" + this.f433402h + ", stoppedFlag=" + this.f433403i + ", pausedFlag=" + this.f433404j);
        this.f433402h = true;
        p44.o0 o0Var = this.f433406l;
        o0Var.l();
        o0Var.k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
    }

    public final void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTimelineVideoPlay", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardLogic", "onTimelineVideoPlay, updateFlag=" + this.f433402h + ", stoppedFlag=" + this.f433403i + ", pausedFlag=" + this.f433404j);
        if (this.f433402h && !this.f433404j) {
            this.f433402h = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardLogic", "checkStartAnim");
            p44.o0 o0Var = this.f433406l;
            o0Var.i();
            o0Var.d();
            o0Var.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTimelineVideoPlay", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:3:0x000f, B:8:0x002a, B:10:0x0031, B:15:0x003d, B:16:0x0049, B:18:0x0053, B:19:0x0058), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:3:0x000f, B:8:0x002a, B:10:0x0031, B:15:0x003d, B:16:0x0049, B:18:0x0053, B:19:0x0058), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r9, int r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f433395a
            java.lang.String r1 = "openEggCanvasWithPickedId, cardId="
            java.lang.String r2 = "openEggCanvasWithPickedId"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            java.lang.String r4 = "RandomPickCardLogic"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L6a
            r5.append(r9)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L6a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r1)     // Catch: java.lang.Throwable -> L6a
            int r1 = r8.f433396b     // Catch: java.lang.Throwable -> L6a
            r5 = 2
            r6 = 1
            if (r1 == r6) goto L2a
            if (r1 == r5) goto L28
            r5 = r6
            goto L2a
        L28:
            r5 = 16
        L2a:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L6a
            if (r9 == 0) goto L3a
            int r7 = r9.length()     // Catch: java.lang.Throwable -> L6a
            if (r7 != 0) goto L38
            goto L3a
        L38:
            r7 = 0
            goto L3b
        L3a:
            r7 = r6
        L3b:
            if (r7 != 0) goto L49
            java.lang.String r7 = "sns_landing_page_is_local_select_egg_card"
            r1.putExtra(r7, r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = "sns_landing_page_egg_card_id"
            r1.putExtra(r6, r9)     // Catch: java.lang.Throwable -> L6a
        L49:
            java.lang.String r9 = "sns_landing_page_random_pick_card_click_show_index"
            r1.putExtra(r9, r10)     // Catch: java.lang.Throwable -> L6a
            boolean r9 = r0 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L6a
            if (r9 == 0) goto L57
            r9 = r0
            android.app.Activity r9 = (android.app.Activity) r9     // Catch: java.lang.Throwable -> L6a
            goto L58
        L57:
            r9 = 0
        L58:
            boolean r9 = ca4.m0.b0(r9)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r10 = "sns_landing_page_is_dark_status_bar"
            r1.putExtra(r10, r9)     // Catch: java.lang.Throwable -> L6a
            android.view.View r9 = r8.f433397c     // Catch: java.lang.Throwable -> L6a
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r8.f433399e     // Catch: java.lang.Throwable -> L6a
            ca4.m0.p0(r0, r9, r10, r5, r1)     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r9 = move-exception
            ca4.q.c(r4, r9)
        L6e:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p44.z.h(java.lang.String, int):void");
    }

    public final void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopListenEggCanvasEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RandomPickCardLogic", "stopListenEggCanvasEvent");
        try {
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f433407m;
            if (abstractC20980x9b9ad01d != null) {
                abstractC20980x9b9ad01d.mo48814x2efc64();
            }
            this.f433407m = null;
        } catch (java.lang.Throwable th6) {
            ca4.q.c("RandomPickCardLogic", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopListenEggCanvasEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
    }
}
