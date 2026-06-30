package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/card/ui/v3/a", "com/tencent/mm/plugin/card/ui/v3/j", "com/tencent/mm/plugin/card/ui/v3/l", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
/* renamed from: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI */
/* loaded from: classes9.dex */
public final class ActivityC13069x47bc6a4f extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f176766y = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f176768e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f176769f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f176770g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f176771h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f176772i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f176773m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f176774n;

    /* renamed from: p, reason: collision with root package name */
    public int f176776p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f176777q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f176778r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f176779s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f176780t;

    /* renamed from: u, reason: collision with root package name */
    public r45.cu f176781u;

    /* renamed from: v, reason: collision with root package name */
    public r45.xt f176782v;

    /* renamed from: w, reason: collision with root package name */
    public int f176783w;

    /* renamed from: x, reason: collision with root package name */
    public int f176784x;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f176767d = "MicroMsg.CardHomePageV3UI";

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f176775o = new java.util.ArrayList();

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13069x47bc6a4f.f176767d, "go to card detail: %s", str);
        android.content.Intent intent = new android.content.Intent(activityC13069x47bc6a4f.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.class);
        intent.putExtra("key_card_id", str);
        intent.addFlags(131072);
        intent.putExtra("key_from_scene", 3);
        activityC13069x47bc6a4f.startActivityForResult(intent, 4);
    }

    public final void U6(boolean z17) {
        java.lang.String str = this.f176767d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "do load home page");
        int i17 = 0;
        if (this.f176777q && !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "already load complete");
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f176769f;
            if (c22801x87cbdc00 != null) {
                c22801x87cbdc00.N(0);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
                throw null;
            }
        }
        if (this.f176778r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "is loading");
            return;
        }
        this.f176778r = true;
        int i18 = this.f176776p;
        if (z17) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f176769f;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
                throw null;
            }
            c22801x87cbdc002.m82693x1501d518(true);
        } else {
            i17 = i18;
        }
        pq5.g l17 = new bu1.c(i17, 10).l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        pm0.v.T(l17, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.m(this, z17));
    }

    public final void V6(r45.zt ztVar) {
        if (ztVar != null) {
            java.util.Iterator it = ztVar.f473897d.iterator();
            while (it.hasNext()) {
                r45.yt ytVar = (r45.yt) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ytVar);
                aVar.f176817d = ytVar;
                this.f176775o.add(aVar);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f176774n;
            if (c22848x6ddd90cf == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPageAdapter");
                throw null;
            }
            c22848x6ddd90cf.m8146xced61ae5();
        }
        Y6();
    }

    public final void W6(r45.xt xtVar) {
        if (xtVar != null) {
            this.f176782v = xtVar;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xtVar.f471917d)) {
                return;
            }
            m78548x39037dd1();
            m78478x84f07bce(0, 0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t(this, xtVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X6(r45.cu r31) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f.X6(r45.cu):void");
    }

    public final void Y6() {
        if (this.f176775o.isEmpty()) {
            android.view.View view = this.f176773m;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHomePageEmptyView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI", "updateRecentlyUsedCardTitleLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI", "updateRecentlyUsedCardTitleLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.f176772i;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHomePageRecentlyUsedCardTitleTv");
                throw null;
            }
        }
        android.view.View view2 = this.f176773m;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHomePageEmptyView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI", "updateRecentlyUsedCardTitleLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI", "updateRecentlyUsedCardTitleLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView2 = this.f176772i;
        if (textView2 != null) {
            textView2.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHomePageRecentlyUsedCardTitleTv");
            throw null;
        }
    }

    public final void Z6(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        android.widget.TextView textView = this.f176772i;
        if (textView != null) {
            textView.setText(str);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHomePageRecentlyUsedCardTitleTv");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569857q6;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f565262bw1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f176768e = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f565261bw0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f176769f = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById2;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f176768e;
        if (c22849x81a93d25 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPageRv");
            throw null;
        }
        c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179(), 1, false));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$initView$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.j(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f.this);
            }
        }, this.f176775o, false);
        this.f176774n = c22848x6ddd90cf;
        c22848x6ddd90cf.mo8164xbbdced85(true);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f176768e;
        if (c22849x81a93d252 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPageRv");
            throw null;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f176774n;
        if (c22848x6ddd90cf2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPageAdapter");
            throw null;
        }
        c22849x81a93d252.mo7960x6cab2c8d(c22848x6ddd90cf2);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.i0 i0Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.i0(mo55332x76847179(), 1);
        i0Var.d(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562649l6));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f176768e;
        if (c22849x81a93d253 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPageRv");
            throw null;
        }
        c22849x81a93d253.N(i0Var);
        android.view.LayoutInflater layoutInflater = getLayoutInflater();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d254 = this.f176768e;
        if (c22849x81a93d254 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPageRv");
            throw null;
        }
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569855q4, (android.view.ViewGroup) c22849x81a93d254, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f176770g = viewGroup;
        android.view.View findViewById3 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.bv7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f176771h = (android.view.ViewGroup) findViewById3;
        android.view.ViewGroup viewGroup2 = this.f176770g;
        if (viewGroup2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderView");
            throw null;
        }
        android.view.View findViewById4 = viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.bv_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f176772i = (android.widget.TextView) findViewById4;
        android.view.ViewGroup viewGroup3 = this.f176770g;
        if (viewGroup3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderView");
            throw null;
        }
        android.view.View findViewById5 = viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.bv9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f176773m = findViewById5;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = this.f176774n;
        if (c22848x6ddd90cf3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPageAdapter");
            throw null;
        }
        android.view.ViewGroup viewGroup4 = this.f176770g;
        if (viewGroup4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderView");
            throw null;
        }
        c22848x6ddd90cf3.T(viewGroup4, 2, false);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f176769f;
        if (c22801x87cbdc00 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
            throw null;
        }
        c22801x87cbdc00.m82690xd3a27e96(false);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f176769f;
        if (c22801x87cbdc002 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
            throw null;
        }
        c22801x87cbdc002.m82696x5dd8f4d3(i65.a.b(mo55332x76847179(), 1200) - ((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu)));
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = this.f176769f;
        if (c22801x87cbdc003 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
            throw null;
        }
        c22801x87cbdc003.m82702xfa5d1e8f(((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj)) - i65.a.b(mo55332x76847179(), 1200));
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc004 = this.f176769f;
        if (c22801x87cbdc004 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
            throw null;
        }
        c22801x87cbdc004.m82686x6e84640(1.85f);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc005 = this.f176769f;
        if (c22801x87cbdc005 != null) {
            c22801x87cbdc005.m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.p(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r3 != 5) goto L17;
     */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r3, int r4, android.content.Intent r5) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == r0) goto L1c
            r1 = 2
            if (r3 == r1) goto L18
            r1 = 3
            if (r3 == r1) goto L14
            r1 = 4
            if (r3 == r1) goto L10
            r1 = 5
            if (r3 == r1) goto L14
            goto L1f
        L10:
            r2.U6(r0)
            goto L1f
        L14:
            r2.U6(r0)
            goto L1f
        L18:
            r2.U6(r0)
            goto L1f
        L1c:
            r2.U6(r0)
        L1f:
            super.onActivityResult(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0069  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            r4.mo43517x10010bd5()
            r5 = 2131757914(0x7f100b5a, float:1.9146777E38)
            r4.mo56582xbf7c1df6(r5)
            android.content.res.Resources r5 = r4.getResources()
            r0 = 2131099656(0x7f060008, float:1.7811671E38)
            int r5 = r5.getColor(r0)
            r4.mo64405x4dab7448(r5)
            r4.mo78530x8b45058f()
            com.tencent.mm.plugin.card.ui.v3.q r5 = new com.tencent.mm.plugin.card.ui.v3.q
            r5.<init>(r4)
            r4.mo54448x9c8c0d33(r5)
            gm0.b0 r5 = gm0.j1.u()
            com.tencent.mm.storage.n3 r5 = r5.c()
            com.tencent.mm.storage.u3 r0 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_HOME_PAGE_V3_STRING_SYNC
            java.lang.String r1 = ""
            java.lang.Object r5 = r5.m(r0, r1)
            java.lang.String r5 = (java.lang.String) r5
            r0 = 1
            if (r5 == 0) goto L43
            int r2 = r5.length()
            if (r2 != 0) goto L41
            goto L43
        L41:
            r2 = 0
            goto L44
        L43:
            r2 = r0
        L44:
            if (r2 == 0) goto L47
            goto L66
        L47:
            r45.ti3 r2 = new r45.ti3
            r2.<init>()
            java.nio.charset.Charset r3 = r26.c.f450400c
            byte[] r5 = r5.getBytes(r3)
            java.lang.String r3 = "getBytes(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r3)
            r2.mo11468x92b714fd(r5)     // Catch: java.lang.Exception -> L5b
            goto L67
        L5b:
            r5 = move-exception
            java.lang.String r2 = "safeParser"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r2, r1, r5)
        L66:
            r2 = 0
        L67:
            if (r2 == 0) goto L81
            int r5 = r2.f468000g
            r4.f176776p = r5
            java.lang.String r5 = r2.f468004n
            r4.Z6(r5)
            r45.cu r5 = r2.f467999f
            r4.X6(r5)
            r45.zt r5 = r2.f468002i
            r4.V6(r5)
            r45.xt r5 = r2.f468003m
            r4.W6(r5)
        L81:
            r4.U6(r0)
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.f5> r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class
            i95.m r5 = i95.n0.c(r5)
            com.tencent.mm.plugin.appbrand.service.f5 r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) r5
            com.tencent.mm.plugin.appbrand.service.x6 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.H
            r5.Rh(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.f176779s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f176767d, "no data to save snapshot");
            return;
        }
        r45.ti3 ti3Var = new r45.ti3();
        r45.ie ieVar = new r45.ie();
        ti3Var.f76492x92037252 = ieVar;
        ieVar.f458493e = new r45.du5();
        ti3Var.f467999f = this.f176781u;
        android.widget.TextView textView = this.f176772i;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHomePageRecentlyUsedCardTitleTv");
            throw null;
        }
        ti3Var.f468004n = textView.getText().toString();
        ti3Var.f468002i = new r45.zt();
        ti3Var.f468000g = this.f176776p;
        ti3Var.f468003m = this.f176782v;
        java.util.Iterator it = this.f176775o.iterator();
        while (it.hasNext()) {
            ti3Var.f468002i.f473897d.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.a) it.next()).a());
        }
        pm0.v.K(null, new au1.e(ti3Var));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f176780t) {
            U6(true);
            this.f176780t = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.l.class);
    }
}
