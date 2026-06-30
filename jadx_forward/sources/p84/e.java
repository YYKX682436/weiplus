package p84;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: n, reason: collision with root package name */
    public static final p84.a f434311n = new p84.a(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f434312a;

    /* renamed from: b, reason: collision with root package name */
    public final int f434313b;

    /* renamed from: c, reason: collision with root package name */
    public long f434314c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f434315d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.u f434316e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2141x433d5f83.C17787x45e5e488 f434317f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f434318g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.AnimatorSet f434319h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.AnimatorSet f434320i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f434321j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f434322k;

    /* renamed from: l, reason: collision with root package name */
    public final p84.c f434323l;

    /* renamed from: m, reason: collision with root package name */
    public final p84.b f434324m;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2141x433d5f83.C17787x45e5e488 labelView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelView, "labelView");
        this.f434312a = "AnimLabelCtrl";
        this.f434313b = 1;
        this.f434317f = labelView;
        if (labelView.getVisibility() == 0) {
            labelView.setVisibility(4);
        }
        this.f434323l = new p84.c(this, android.os.Looper.getMainLooper());
        this.f434324m = new p84.b(this);
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f434312a, "clear");
        this.f434314c = 0L;
        this.f434315d = null;
        this.f434316e = null;
        d();
        this.f434321j = false;
        this.f434322k = false;
        this.f434323l.removeCallbacksAndMessages(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPlayEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.u uVar = this.f434316e;
        if (uVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlayEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        } else {
            if (this.f434315d == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlayEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                return;
            }
            if (uVar != null) {
                e(uVar.f247681c);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlayEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        }
    }

    public final void c(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        if (this.f434316e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        } else if (this.f434315d == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        } else {
            e((int) j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        }
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetViewState", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f434312a, "resetViewState");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2141x433d5f83.C17787x45e5e488 c17787x45e5e488 = this.f434317f;
        if (c17787x45e5e488.getVisibility() == 0) {
            c17787x45e5e488.setVisibility(4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        android.animation.AnimatorSet animatorSet = c17787x45e5e488.f245049n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        android.animation.AnimatorSet animatorSet2 = c17787x45e5e488.f245050o;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        android.animation.AnimatorSet animatorSet3 = c17787x45e5e488.f245051p;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopBackgroundAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2141x433d5f83.C17788x6b5d94e7 c17788x6b5d94e7 = c17787x45e5e488.f245048m;
        if (c17788x6b5d94e7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBackgroundView");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopTranslateAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        c17788x6b5d94e7.f245059m = true;
        c17788x6b5d94e7.invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopTranslateAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopBackgroundAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        android.view.View view = c17787x45e5e488.f245043e;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContentView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/animlabel/AnimLabelView", "clear", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/animlabel/AnimLabelView", "clear", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = c17787x45e5e488.f245043e;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContentView");
            throw null;
        }
        view2.setTranslationX(0.0f);
        android.widget.ImageView imageView = c17787x45e5e488.f245047i;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mArrowIcon");
            throw null;
        }
        imageView.setAlpha(0.0f);
        android.widget.ImageView imageView2 = c17787x45e5e488.f245047i;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mArrowIcon");
            throw null;
        }
        imageView2.setTranslationX(0.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        android.animation.AnimatorSet animatorSet4 = this.f434319h;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        android.animation.AnimatorSet animatorSet5 = this.f434320i;
        if (animatorSet5 != null) {
            animatorSet5.cancel();
        }
        android.view.View view3 = this.f434318g;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/animlabel/AnimLabelCtrl", "resetViewState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/widget/animlabel/AnimLabelCtrl", "resetViewState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view4 = this.f434318g;
        if (view4 != null) {
            view4.setTranslationX(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetViewState", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
    }

    public final void e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendPlayMsg", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        android.os.Message obtain = android.os.Message.obtain();
        int i18 = this.f434313b;
        obtain.what = i18;
        obtain.arg1 = i17;
        p84.c cVar = this.f434323l;
        cVar.removeMessages(i18);
        cVar.sendMessageDelayed(obtain, 50L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendPlayMsg", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
    }
}
