package com.tencent.mm.plugin.ball.audio_panel.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewV5;", "Lcom/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarBaseView;", "", "getLayoutId", "getRecentPlayControlType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class AudioPanelTaskBarViewV5 extends com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f93028z = 0;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f93029p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f93030q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.RelativeLayout f93031r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.RelativeLayout f93032s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f93033t;

    /* renamed from: u, reason: collision with root package name */
    public int f93034u;

    /* renamed from: v, reason: collision with root package name */
    public int f93035v;

    /* renamed from: w, reason: collision with root package name */
    public int f93036w;

    /* renamed from: x, reason: collision with root package name */
    public int f93037x;

    /* renamed from: y, reason: collision with root package name */
    public int f93038y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioPanelTaskBarViewV5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final void p(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5 audioPanelTaskBarViewV5) {
        audioPanelTaskBarViewV5.getClass();
        ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).u(null);
        jm4.a0 a17 = jm4.c0.f300377d.a();
        if (a17 != null) {
            urgen.ur_0025.UR_5379.UR_B1FF(((jm4.c0) a17).getCppPointer());
        }
        db5.t7.m(audioPanelTaskBarViewV5.getContext(), "已重置");
    }

    public static final void q() {
        jm4.b0 b0Var = jm4.c0.f300377d;
        jm4.a0 a17 = b0Var.a();
        if (a17 != null) {
            ((jm4.c0) a17).a("clicfg_ting_radio_audio_square", "1");
        }
        jm4.a0 a18 = b0Var.a();
        if (a18 != null) {
            ((jm4.c0) a18).a("clicfg_ting_radio_audio_top_lines", "0");
        }
    }

    public static final void r() {
        jm4.b0 b0Var = jm4.c0.f300377d;
        jm4.a0 a17 = b0Var.a();
        if (a17 != null) {
            ((jm4.c0) a17).a("clicfg_ting_radio_audio_square", "1");
        }
        jm4.a0 a18 = b0Var.a();
        if (a18 != null) {
            ((jm4.c0) a18).a("clicfg_ting_radio_audio_top_lines", "1");
        }
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView, kp1.l1
    public void a() {
        ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Bi(bw5.yq0.TingReportAction_PageDisappear, null, null);
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView, kp1.l1
    public void b() {
        super.b();
        ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Bi(bw5.yq0.TingReportAction_PageAppear, null, null);
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    public java.lang.String f(np1.a aVar) {
        if (aVar == null) {
            return "";
        }
        if (il4.d.q(aVar.f390983q)) {
            return aVar.f390984r;
        }
        if (il4.l.g(aVar.f390982p) || il4.d.r(aVar.f390983q)) {
            return aVar.f390977h;
        }
        if (aVar.f390983q <= 0) {
            java.lang.String categoryId = aVar.f390986t;
            kotlin.jvm.internal.o.f(categoryId, "categoryId");
            if (!(categoryId.length() > 0)) {
                return il4.l.l(aVar.f390982p) ? aVar.f390977h : "";
            }
        }
        return aVar.f390984r;
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    public void g() {
        setRecentContainer((android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.a7_));
        this.f93029p = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.a7c);
        setRecentDescTextView((android.widget.TextView) findViewById(com.tencent.mm.R.id.a7d));
        setPlayButton((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.a79));
        setLoadingButton((android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.a78));
        this.f93030q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a7a);
        this.f93031r = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.a77);
        super.g();
        android.widget.RelativeLayout relativeLayout = this.f93031r;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new kp1.a1(this));
        }
        android.widget.RelativeLayout recentContainer = getRecentContainer();
        if (recentContainer != null) {
            recentContainer.setOnClickListener(new kp1.d1(this));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(getRecentContainer(), "tyt_mid_cont_pul_recent");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f93031r, "tyt_mid_cont_pul_recent_btn");
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ehm;
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    public int getRecentPlayControlType() {
        return 5;
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    public void i(boolean z17) {
        if (z17) {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ui(bw5.yq0.TingReportAction_TrianglePlay, null, null);
        } else {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ui(bw5.yq0.TingReportAction_DoubleBarPause, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f0  */
    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(np1.a r6) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5.k(np1.a):void");
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    public void m(boolean z17) {
        if (z17) {
            com.tencent.mm.ui.widget.imageview.WeImageView playButton = getPlayButton();
            if (playButton != null) {
                playButton.s(com.tencent.mm.R.raw.icons_filled_pause, com.tencent.mm.R.color.BW_100_Alpha_0_5);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView playButton2 = getPlayButton();
            if (playButton2 == null) {
                return;
            }
            playButton2.setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.f490511x5));
            return;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView playButton3 = getPlayButton();
        if (playButton3 != null) {
            playButton3.s(com.tencent.mm.R.raw.icons_filled_specialplay, com.tencent.mm.R.color.BW_100_Alpha_0_5);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView playButton4 = getPlayButton();
        if (playButton4 == null) {
            return;
        }
        playButton4.setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.f490519xf));
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f93034u != getMeasuredWidth()) {
            this.f93034u = getMeasuredWidth();
            ft.v3 v3Var = (ft.v3) i95.n0.c(ft.v3.class);
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            jz5.l wi6 = ((et.g) v3Var).wi(context, getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7), this.f93034u);
            this.f93035v = (int) ((java.lang.Number) wi6.f302833d).floatValue();
            this.f93036w = (int) ((java.lang.Number) wi6.f302834e).floatValue();
            android.widget.RelativeLayout relativeLayout = this.f93032s;
            int i19 = this.f93035v;
            if (relativeLayout != null) {
                android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(i19);
                    marginLayoutParams.setMarginEnd(0);
                }
                relativeLayout.setLayoutParams(layoutParams);
            }
            android.widget.RelativeLayout relativeLayout2 = this.f93029p;
            int i27 = this.f93036w;
            int i28 = this.f93035v;
            if (relativeLayout2 == null) {
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = relativeLayout2.getLayoutParams();
            if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMarginStart(i27);
                marginLayoutParams2.setMarginEnd(i28);
            }
            relativeLayout2.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView, kp1.l1
    public void onResume() {
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView, kp1.l1
    public void release() {
        super.release();
        this.f93029p = null;
        this.f93030q = null;
        this.f93031r = null;
        this.f93032s = null;
        this.f93033t = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPanelTaskBarViewV5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.widget.RelativeLayout relativeLayout;
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.o.g(context, "context");
        this.f93032s = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.a7p);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f93032s, "tyt_mid_cont_pul_music");
        this.f93033t = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a7o);
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.f93037x = (int) (i65.a.f(context2, com.tencent.mm.R.dimen.f480112od) * ip1.s.a(context2));
        android.content.Context context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        this.f93038y = (int) (i65.a.f(context3, com.tencent.mm.R.dimen.f480113oe) * ip1.s.a(context3));
        android.widget.RelativeLayout relativeLayout2 = this.f93032s;
        android.widget.ImageView imageView = this.f93033t;
        if (relativeLayout2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = relativeLayout2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = this.f93038y;
            } else {
                layoutParams2 = null;
            }
            relativeLayout2.setLayoutParams(layoutParams2);
        }
        if (imageView != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 != null) {
                int i18 = this.f93037x;
                layoutParams3.width = i18;
                layoutParams3.height = i18;
            } else {
                layoutParams3 = null;
            }
            imageView.setLayoutParams(layoutParams3);
        }
        if (imageView instanceof com.tencent.mm.ui.widget.MMRoundCornerImageView) {
            ((com.tencent.mm.ui.widget.MMRoundCornerImageView) imageView).setRadius(this.f93037x / 2);
        }
        android.widget.RelativeLayout recentContainer = getRecentContainer();
        if (recentContainer != null) {
            android.widget.RelativeLayout recentContainer2 = getRecentContainer();
            if (recentContainer2 == null || (layoutParams = recentContainer2.getLayoutParams()) == null) {
                layoutParams = null;
            } else {
                layoutParams.height = this.f93037x;
            }
            recentContainer.setLayoutParams(layoutParams);
        }
        if (getRecentContainer() instanceof com.tencent.mm.ui.widget.RoundCornerRelativeLayout) {
            android.widget.RelativeLayout recentContainer3 = getRecentContainer();
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = recentContainer3 instanceof com.tencent.mm.ui.widget.RoundCornerRelativeLayout ? (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) recentContainer3 : null;
            if (roundCornerRelativeLayout != null) {
                roundCornerRelativeLayout.setRadius(this.f93037x / 2.0f);
            }
        }
        android.widget.RelativeLayout relativeLayout3 = this.f93032s;
        if (relativeLayout3 != null) {
            relativeLayout3.setOnClickListener(new kp1.y0(this));
        }
        int i19 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if (!((i19 == 788529167 || i19 == 788529166) || z65.c.a()) || (relativeLayout = this.f93032s) == null) {
            return;
        }
        relativeLayout.setOnLongClickListener(new kp1.z0(this));
    }
}
