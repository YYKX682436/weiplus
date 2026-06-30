package fc4;

/* loaded from: classes4.dex */
public final class f0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements z35.d0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 f342670d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 f342671e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 f342672f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f342673g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f342674h;

    /* renamed from: i, reason: collision with root package name */
    public int f342675i;

    /* renamed from: m, reason: collision with root package name */
    public long f342676m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f342674h = jz5.h.b(new fc4.e0(this));
    }

    public static final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 O6(fc4.f0 f0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getFlexibleVideoView$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = f0Var.f342670d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getFlexibleVideoView$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        return viewOnLongClickListenerC18284x499dee15;
    }

    @Override // z35.d0
    public void D0(android.widget.SeekBar seekBar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStopTrackingTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = this.f342670d;
        if (viewOnLongClickListenerC18284x499dee15 != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46 = this.f342672f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19718xcf23ab46);
            viewOnLongClickListenerC18284x499dee15.u((int) c19718xcf23ab46.c(i17), true);
        }
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((fc4.p) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(fc4.p.class)).O6(true);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db2 = this.f342671e;
        if (c19716x17d12db2 != null) {
            c19716x17d12db2.m75632x51053e11(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStopTrackingTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }

    public final void P6() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("layoutLandScape", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        pc4.d dVar = pc4.d.f434943a;
        android.view.View view = dVar.w() ? this.f342671e : this.f342672f;
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutLandScape", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = this.f342670d;
        if (viewOnLongClickListenerC18284x499dee15 != null) {
            com.p314xaae8f345.mm.ui.kk.d(viewOnLongClickListenerC18284x499dee15, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee152 = this.f342670d;
        if (viewOnLongClickListenerC18284x499dee152 != null) {
            com.p314xaae8f345.mm.ui.kk.f(viewOnLongClickListenerC18284x499dee152, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee153 = this.f342670d;
        if (viewOnLongClickListenerC18284x499dee153 != null) {
            viewOnLongClickListenerC18284x499dee153.requestLayout();
        }
        int h17 = i65.a.h(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.ajf);
        view.setPadding(h17, view.getPaddingTop(), (!dVar.w() || (i17 = je4.f.f380852a.a(m158354x19263085()).right) <= 0) ? h17 : i17 + h17, dVar.w() ? 0 : i65.a.h(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.ajw));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutLandScape", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }

    public final void Q6() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f342673g;
        if (c17933xe8d1b226 == null || (m70371x485d7 = c17933xe8d1b226.m70371x485d7()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        if (m70371x485d7.f39014x86965dde.f451373h.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        r45.jj4 jj4Var = (r45.jj4) m70371x485d7.f39014x86965dde.f451373h.get(0);
        r45.lj4 lj4Var = jj4Var.f459398p;
        if (lj4Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        if (lj4Var.f461053d <= 0.0f || lj4Var.f461054e <= 0.0f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        pc4.d dVar = pc4.d.f434943a;
        android.view.View view = dVar.w() ? this.f342671e : this.f342672f;
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) m80379x76847179().getSystemService("window");
        if (windowManager == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        int i17 = displayMetrics.widthPixels;
        int i18 = displayMetrics.heightPixels;
        if (i18 <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        int i19 = this.f342675i;
        int h17 = i65.a.h(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.aii);
        view.setPadding(h17, view.getPaddingTop(), h17, dVar.w() ? je4.f.f380852a.a(m158354x19263085()).bottom == 0 ? i65.a.h(m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.ail) : i65.a.h(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.aii) : view.getPaddingBottom());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSeekBarBgImg", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        android.view.View view2 = (android.view.View) ((jz5.n) this.f342674h).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSeekBarBgImg", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        if (view2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.height = i65.a.b(m80379x76847179(), 170) + i19;
            view2.setLayoutParams(layoutParams);
        }
        int p17 = com.p314xaae8f345.mm.ui.bk.p(m80379x76847179());
        r45.lj4 lj4Var2 = jj4Var.f459398p;
        float f17 = lj4Var2.f461053d;
        float f18 = lj4Var2.f461054e;
        int i27 = f17 / f18 > ((float) (i17 / i18)) ? (int) ((f18 * i17) / f17) : i18;
        int i28 = i18 - i27;
        int i29 = i28 / 2;
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        fc4.p pVar = (fc4.p) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(fc4.p.class);
        pVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldShowView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        boolean z17 = pVar.f342731m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldShowView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        n34.n3 n3Var = n34.v3.f416281l;
        int a17 = n3Var.a(m80379x76847179(), z17, true);
        int i37 = a17 + i19;
        if (i29 > i37) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        if (((i28 - a17) - p17) - i19 >= 0) {
            int i38 = i37 - i29;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = this.f342670d;
            if (viewOnLongClickListenerC18284x499dee15 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                return;
            } else {
                R6(viewOnLongClickListenerC18284x499dee15, i38);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                return;
            }
        }
        int a18 = n3Var.a(m80379x76847179(), false, false);
        if (z17 && ((i28 - i19) - p17) - a18 >= 0) {
            int i39 = (a18 + i19) - i29;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee152 = this.f342670d;
            if (viewOnLongClickListenerC18284x499dee152 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                return;
            } else {
                R6(viewOnLongClickListenerC18284x499dee152, i39);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                return;
            }
        }
        int h18 = i65.a.h(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.ajw);
        int i47 = (i18 - p17) - i27;
        if ((i47 - h18) - i19 > 0) {
            int i48 = (i19 + h18) - i29;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee153 = this.f342670d;
            if (viewOnLongClickListenerC18284x499dee153 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                return;
            } else {
                R6(viewOnLongClickListenerC18284x499dee153, i48);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                return;
            }
        }
        if (i47 > 0) {
            int i49 = i47 - i29;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee154 = this.f342670d;
            if (viewOnLongClickListenerC18284x499dee154 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                return;
            } else {
                R6(viewOnLongClickListenerC18284x499dee154, i49);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee155 = this.f342670d;
        if (viewOnLongClickListenerC18284x499dee155 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("alignVideoViewToBottom", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
            int i57 = 0;
            while (true) {
                android.widget.RelativeLayout relativeLayout = viewOnLongClickListenerC18284x499dee155.videoContainer;
                if (!(i57 < relativeLayout.getChildCount())) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("alignVideoViewToBottom", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
                    break;
                }
                int i58 = i57 + 1;
                android.view.View childAt = relativeLayout.getChildAt(i57);
                if (childAt == null) {
                    throw new java.lang.IndexOutOfBoundsException();
                }
                android.view.ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) layoutParams2;
                layoutParams3.addRule(12);
                childAt.setLayoutParams(layoutParams3);
                i57 = i58;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }

    public final void R6(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setViewMargin", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        if (i17 > 0) {
            com.p314xaae8f345.mm.ui.kk.d(view, i17 * 2);
            view.requestLayout();
        } else {
            com.p314xaae8f345.mm.ui.kk.f(view, (-i17) * 2);
            view.requestLayout();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setViewMargin", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }

    @Override // z35.d0
    public void g6(android.widget.SeekBar seekBar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartTrackingTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = this.f342670d;
        if (viewOnLongClickListenerC18284x499dee15 != null) {
            viewOnLongClickListenerC18284x499dee15.k(false);
        }
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((fc4.p) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(fc4.p.class)).O6(false);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db2 = this.f342671e;
        if (c19716x17d12db2 != null) {
            c19716x17d12db2.m75632x51053e11(4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartTrackingTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        int i17 = newConfig.orientation;
        if (i17 == 2) {
            P6();
        } else if (i17 == 1) {
            Q6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7;
        boolean z17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d72;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        if (this.f342673g == null) {
            java.lang.String stringExtra = m158359x1e885992().getStringExtra("intent_localid");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f342673g = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(stringExtra);
        }
        boolean z18 = false;
        m158359x1e885992().getIntExtra("intent_bottom_height", 0);
        this.f342670d = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.rpo);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f342673g;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d((r45.jj4) c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451373h.get(0));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.gzz);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/flexible/FlexibleSeekbarUIC", "initSeekBar", "(Lcom/tencent/mm/protocal/protobuf/MediaObj;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleSeekbarUIC", "initSeekBar", "(Lcom/tencent/mm/protocal/protobuf/MediaObj;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewStub viewStub = (android.view.ViewStub) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.v9a);
        if (viewStub != null) {
            if (pc4.d.f434943a.w()) {
                viewStub.setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.epj);
            } else {
                viewStub.setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.epl);
            }
            viewStub.inflate();
        }
        pc4.d dVar = pc4.d.f434943a;
        if (dVar.w()) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db2 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ncv);
            this.f342671e = c19716x17d12db2;
            this.f342672f = c19716x17d12db2 != null ? c19716x17d12db2.m75623x9dd15644() : null;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db22 = this.f342671e;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19719xa864b110 m75623x9dd15644 = c19716x17d12db22 != null ? c19716x17d12db22.m75623x9dd15644() : null;
            if (m75623x9dd15644 != null) {
                m75623x9dd15644.m75702x6c38a833(new fc4.w(this));
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db23 = this.f342671e;
            com.p314xaae8f345.mm.ui.p2647x2e3067.p2648x3306ec.C21596x8c92f158 c21596x8c92f158 = c19716x17d12db23 != null ? (com.p314xaae8f345.mm.ui.p2647x2e3067.p2648x3306ec.C21596x8c92f158) c19716x17d12db23.findViewById(com.p314xaae8f345.mm.R.id.vlx) : null;
            if (c21596x8c92f158 != null) {
                c21596x8c92f158.m79379x8798bb18(false);
            }
            android.graphics.drawable.Drawable i17 = i65.a.i(m80379x76847179(), com.p314xaae8f345.mm.R.C30861xcebc809e.d0_);
            if (c21596x8c92f158 != null) {
                c21596x8c92f158.setBackground(i17);
            }
            if (m158361x893a2f6f().getConfiguration().orientation == 2) {
                P6();
            } else {
                Q6();
            }
        } else {
            this.f342672f = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ncv);
        }
        android.widget.TextView textView = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.u2b);
        android.widget.TextView textView2 = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.u2c);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46 = this.f342672f;
        if (c19718xcf23ab46 != null) {
            c19718xcf23ab46.m75679x5e005feb(textView);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab462 = this.f342672f;
        if (c19718xcf23ab462 != null) {
            c19718xcf23ab462.m75680x10e11636(textView2);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab463 = this.f342672f;
        if (c19718xcf23ab463 != null) {
            c19718xcf23ab463.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab464 = this.f342672f;
        if (c19718xcf23ab464 != null) {
            c19718xcf23ab464.m75689x457bdbf5(r3.R * 1000);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab465 = this.f342672f;
        if (c19718xcf23ab465 != null) {
            c19718xcf23ab465.m75677xaa87fdc3(this);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab466 = this.f342672f;
        if (c19718xcf23ab466 != null) {
            c19718xcf23ab466.m75692x95acfdd2(new fc4.x(this));
        }
        if (dVar.w()) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db24 = this.f342671e;
            if (c19716x17d12db24 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDefaultExpandSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                if (ca4.z0.g0()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDefaultExpandSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                    z17 = true;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f342673g;
                    if (c17933xe8d1b2262 == null || (m70371x485d72 = c17933xe8d1b2262.m70371x485d7()) == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDefaultExpandSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                        z17 = false;
                    } else {
                        int b17 = a06.d.b(((r45.jj4) m70371x485d72.f39014x86965dde.f451373h.get(0)).R * 1000);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsVideoExpandSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
                        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_expand_seekbar_duration, 15000);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoConfig", "getSnsVideoExpandSeekBarDurationMs: " + Ni);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsVideoExpandSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
                        z17 = b17 >= Ni;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDefaultExpandSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                    }
                }
                c19716x17d12db24.d(z17, false);
            }
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab467 = this.f342672f;
            if (c19718xcf23ab467 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDefaultShowSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                if (ca4.z0.g0()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDefaultShowSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = this.f342673g;
                    if (c17933xe8d1b2263 == null || (m70371x485d7 = c17933xe8d1b2263.m70371x485d7()) == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDefaultShowSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                    } else {
                        int round = java.lang.Math.round(((r45.jj4) m70371x485d7.f39014x86965dde.f451373h.get(0)).R * 1000);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsVideoShowSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
                        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_show_seekbar_duration, 16000);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoConfig", "getSnsVideoShowSeekBarDurationMs: " + Ni2);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsVideoShowSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
                        if (round < Ni2) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDefaultShowSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDefaultShowSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                        }
                    }
                    c19718xcf23ab467.m75681xdabc0b80(z18);
                }
                z18 = true;
                c19718xcf23ab467.m75681xdabc0b80(z18);
            }
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab468 = this.f342672f;
        if (c19718xcf23ab468 != null) {
            c19718xcf23ab468.f();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab469 = this.f342672f;
        if (c19718xcf23ab469 != null) {
            c19718xcf23ab469.mo75675x8d365359(true);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab4610 = this.f342672f;
        if (c19718xcf23ab4610 != null) {
            c19718xcf23ab4610.m75693x7805eb2(new fc4.y(this));
        }
        if (dVar.w()) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db25 = this.f342671e;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19719xa864b110 m75623x9dd156442 = c19716x17d12db25 != null ? c19716x17d12db25.m75623x9dd15644() : null;
            if (m75623x9dd156442 != null) {
                m75623x9dd156442.m75694x30a01e54(new fc4.z());
            }
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab4611 = this.f342672f;
            if (c19718xcf23ab4611 != null) {
                c19718xcf23ab4611.m75694x30a01e54(new fc4.a0(this));
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22610x2e037bd7 c22610x2e037bd7 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22610x2e037bd7) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.u4v);
        if (c22610x2e037bd7 != null) {
            c22610x2e037bd7.m81280xaada124f(new fc4.b0(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = this.f342670d;
        if (viewOnLongClickListenerC18284x499dee15 != null) {
            viewOnLongClickListenerC18284x499dee15.m71057xa2fa530b(new fc4.d0(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46 = this.f342672f;
        if (c19718xcf23ab46 != null) {
            c19718xcf23ab46.isSeekBarActive = false;
            wu5.c cVar = c19718xcf23ab46.hideTask;
            if (cVar != null) {
                cVar.cancel(false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }

    @Override // z35.d0
    /* renamed from: onProgressChanged */
    public void mo129341x95ed2be8(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onProgressChanged", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        if (z17) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f342676m >= 10) {
                this.f342676m = currentTimeMillis;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46 = this.f342672f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19718xcf23ab46);
                int c17 = (int) c19718xcf23ab46.c(i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = this.f342670d;
                if (viewOnLongClickListenerC18284x499dee15 != null) {
                    viewOnLongClickListenerC18284x499dee15.u(c17, false);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onProgressChanged", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }
}
