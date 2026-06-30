package com.tencent.mm.plugin.ball.audio_panel.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewRecommendMusicList;", "Lcom/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarBaseView;", "", "getSubTitle", "", "getLayoutId", "getRecentPlayControlType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "kp1/o", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class AudioPanelTaskBarViewRecommendMusicList extends com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f92995z = 0;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f92996p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f92997q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f92998r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f92999s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.lp0 f93000t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.o50 f93001u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.qb0 f93002v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f93003w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f93004x;

    /* renamed from: y, reason: collision with root package name */
    public androidx.lifecycle.k0 f93005y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioPanelTaskBarViewRecommendMusicList(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String getSubTitle() {
        boolean booleanValue;
        qk.h9 h9Var = (qk.h9) i95.n0.c(qk.h9.class);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        bw5.qb0 qb0Var = this.f93002v;
        bw5.lp0 lp0Var = this.f93000t;
        ef0.d4 d4Var = (ef0.d4) h9Var;
        d4Var.getClass();
        if (!(qb0Var != null && qb0Var.f32034f == 1)) {
            return d4Var.wi(context);
        }
        if (lp0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(lp0Var.d().getTitle());
            sb6.append('-');
            bw5.v70 d17 = lp0Var.d();
            kotlin.jvm.internal.o.f(d17, "getListenItem(...)");
            sb6.append(rk4.j5.b(d17));
            return sb6.toString();
        }
        java.lang.Boolean bool = d4Var.f252196d;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(gm4.a.f273557a.a("key_clicked_recommend", false));
            d4Var.f252196d = valueOf;
            kotlin.jvm.internal.o.d(valueOf);
            booleanValue = valueOf.booleanValue();
        }
        if (!booleanValue) {
            return d4Var.wi(context);
        }
        bw5.l60 b17 = qb0Var.b();
        java.lang.String str = b17 != null ? b17.hasFieldNumber(9) ? b17.f29658o : "" : null;
        java.lang.String str2 = str != null ? str : "";
        if (!(str2.length() > 0)) {
            str2 = null;
        }
        return str2 == null ? d4Var.wi(context) : str2;
    }

    public static final void q(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList audioPanelTaskBarViewRecommendMusicList, bw5.qb0 qb0Var) {
        if (qb0Var == null) {
            audioPanelTaskBarViewRecommendMusicList.getClass();
            com.tencent.mars.xlog.Log.w("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "handleRedDotRecommendDataUpdate data null and ignore");
            return;
        }
        audioPanelTaskBarViewRecommendMusicList.f93002v = qb0Var;
        bw5.l60 b17 = qb0Var.b();
        if (b17 != null) {
            bw5.o50 b18 = b17.b();
            java.lang.String c17 = b18.c();
            if (c17 == null || c17.length() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "handleRedDotRecommendDataUpdate categoryId invalid");
                audioPanelTaskBarViewRecommendMusicList.f93001u = null;
                return;
            }
            audioPanelTaskBarViewRecommendMusicList.f93001u = b18;
            boolean hj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).hj();
            if (!audioPanelTaskBarViewRecommendMusicList.f93003w || hj6) {
                audioPanelTaskBarViewRecommendMusicList.f93004x = false;
                audioPanelTaskBarViewRecommendMusicList.f93000t = null;
                ((ef0.d4) ((qk.h9) i95.n0.c(qk.h9.class))).Di(null);
                audioPanelTaskBarViewRecommendMusicList.v();
            } else {
                audioPanelTaskBarViewRecommendMusicList.f93004x = true;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleRedDotRecommendDataUpdate categoryItem: ");
            bw5.o50 o50Var = audioPanelTaskBarViewRecommendMusicList.f93001u;
            sb6.append(o50Var != null ? o50Var.c() : null);
            sb6.append(", categoryItem.type: ");
            bw5.o50 o50Var2 = audioPanelTaskBarViewRecommendMusicList.f93001u;
            sb6.append(o50Var2 != null ? java.lang.Integer.valueOf(o50Var2.f30964n) : null);
            sb6.append(", type: ");
            bw5.qb0 qb0Var2 = audioPanelTaskBarViewRecommendMusicList.f93002v;
            sb6.append(qb0Var2 != null ? java.lang.Integer.valueOf(qb0Var2.f32032d) : null);
            sb6.append(", descType: ");
            bw5.qb0 qb0Var3 = audioPanelTaskBarViewRecommendMusicList.f93002v;
            sb6.append(qb0Var3 != null ? java.lang.Integer.valueOf(qb0Var3.f32034f) : null);
            sb6.append(", subTitle: ");
            sb6.append(b17.hasFieldNumber(9) ? b17.f29658o : "");
            sb6.append(", isPlayFromTaskBarRecommend: ");
            sb6.append(audioPanelTaskBarViewRecommendMusicList.f93003w);
            sb6.append(", idle: ");
            sb6.append(hj6);
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", sb6.toString());
        }
    }

    public static final void r(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList audioPanelTaskBarViewRecommendMusicList, java.lang.String str, boolean z17) {
        audioPanelTaskBarViewRecommendMusicList.getClass();
        if (!z17) {
            if (!(str == null || str.length() == 0)) {
                ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
                android.widget.ImageView imageView = audioPanelTaskBarViewRecommendMusicList.f92997q;
                if (imageView != null) {
                    ((dl4.m0) tVar).aj(str, imageView, 0, null);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("recommendCover");
                    throw null;
                }
            }
        }
        android.widget.ImageView imageView2 = audioPanelTaskBarViewRecommendMusicList.f92997q;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("recommendCover");
            throw null;
        }
        imageView2.setImageResource(com.tencent.mm.R.raw.audio_panel_default_cover);
        android.widget.RelativeLayout relativeLayout = audioPanelTaskBarViewRecommendMusicList.f92996p;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(relativeLayout.getContext().getResources().getColor(com.tencent.mm.R.color.afe));
        } else {
            kotlin.jvm.internal.o.o("recommendContainer");
            throw null;
        }
    }

    public static final void s(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList audioPanelTaskBarViewRecommendMusicList, java.lang.String str, boolean z17) {
        android.widget.TextView textView = audioPanelTaskBarViewRecommendMusicList.f92999s;
        if (textView == null) {
            kotlin.jvm.internal.o.o("recommendDesc");
            throw null;
        }
        int textSize = (int) (textView.getTextSize() * 1.2d);
        i95.m c17 = i95.n0.c(zy2.s6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.s6 s6Var = (zy2.s6) c17;
        if (str == null) {
            str = "";
        }
        textView.setText(zy2.s6.l6(s6Var, str, textSize, false, null, 0, false, null, 120, null));
        if (z17) {
            textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
        } else {
            textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        }
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView, kp1.l1
    public void a() {
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView, kp1.l1
    public void b() {
        super.b();
        ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ni(1001, this.f93001u);
        u(kp1.o.f310927e);
        android.widget.TextView textView = this.f92999s;
        if (textView != null) {
            textView.post(new kp1.v(this));
        } else {
            kotlin.jvm.internal.o.o("recommendDesc");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView, kp1.l1
    public void c(qk.ia state) {
        boolean z17;
        bw5.dr0 c17;
        bw5.cp0 b17;
        bw5.o50 b18;
        kotlin.jvm.internal.o.g(state, "state");
        int Ni = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Ni();
        b66.j cj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).cj();
        bw5.fr0 d17 = cj6 != null ? ((b66.k) cj6).d() : null;
        bw5.lp0 b19 = d17 != null ? d17.b() : null;
        if (kotlin.jvm.internal.o.b((d17 == null || (c17 = d17.c()) == null || (b17 = c17.b()) == null || (b18 = b17.b()) == null) ? null : b18.c(), "83101")) {
            if (b19 != null) {
                this.f93000t = b19;
                pm0.v.K(null, new kp1.w(b19));
            }
            pm0.v.X(new kp1.x(this, b19 != null ? rk4.j5.d(b19) : null));
            setMCurrentPlayState(state);
            z17 = true;
        } else {
            setMCurrentPlayState(qk.ia.f364170f);
            z17 = false;
        }
        pm0.v.X(new kp1.y(this));
        state.toString();
        this.f93003w = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "isPlayFromTaskBarRecommend: " + this.f93003w + ", playerScene: " + Ni + ", pendingUpdateViewFromSyncData: " + this.f93004x);
        if (state == qk.ia.f364170f && this.f93004x) {
            this.f93004x = false;
            this.f93000t = null;
            ((ef0.d4) ((qk.h9) i95.n0.c(qk.h9.class))).Di(null);
            v();
        }
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView, kp1.l1
    public void d() {
        if (t()) {
            v();
        } else {
            pm0.v.K(null, new kp1.s(this));
        }
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    public void g() {
        setRecentContainer((android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.a7_));
        setRecentDescTextView((android.widget.TextView) findViewById(com.tencent.mm.R.id.a7d));
        setPlayButton((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.a79));
        setLoadingButton((android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.a78));
        com.tencent.mm.ui.widget.imageview.WeImageView playButton = getPlayButton();
        if (playButton != null) {
            playButton.setOnClickListener(new kp1.t(this));
        }
        super.g();
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489196dp5;
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    public int getRecentPlayControlType() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    public boolean h() {
        return t();
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    public void i(boolean z17) {
        if (z17) {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ni(1117, this.f93001u);
        } else {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ni(1118, this.f93001u);
        }
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    public void j(boolean z17) {
        boolean z18 = false;
        if (this.f93003w) {
            if (((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).nj()) {
                n(qk.ia.f364173i);
                pm0.v.K(null, kp1.z.f310954d);
                i(false);
            } else if (((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).ij()) {
                n(qk.ia.f364171g);
                pm0.v.K(null, kp1.a0.f310881d);
                i(true);
            }
            z18 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "onTogglePlay handled: " + z18);
        if (z18) {
            return;
        }
        if (((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).hj()) {
            n(qk.ia.f364172h);
            if (z17) {
                ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ni(1117, this.f93001u);
            }
        } else {
            n(qk.ia.f364171g);
        }
        i95.m c17 = i95.n0.c(qk.g9.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        bw5.lp0 lp0Var = this.f93000t;
        bw5.o50 o50Var = this.f93001u;
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        qk.g9.Ye((qk.g9) c17, lp0Var, null, o50Var, null, new il4.e(null, 0, 5, false, null, null, 0, 0, false, false, null, java.lang.Integer.valueOf(getRecentPlayControlType()), null, null, null, null, false, false, null, null, false, null, false, null, false, 33552379, null), 10, null);
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    public void m(boolean z17) {
        if (z17) {
            com.tencent.mm.ui.widget.imageview.WeImageView playButton = getPlayButton();
            if (playButton != null) {
                playButton.s(com.tencent.mm.R.raw.icons_filled_pause, com.tencent.mm.R.color.BW_100_Alpha_0_8);
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
            playButton3.s(com.tencent.mm.R.raw.icons_filled_specialplay, com.tencent.mm.R.color.BW_100_Alpha_0_8);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView playButton4 = getPlayButton();
        if (playButton4 == null) {
            return;
        }
        playButton4.setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.f490519xf));
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView, kp1.l1
    public void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "releaseAudioPanelTaskBarController " + hashCode());
        super.release();
    }

    public final boolean t() {
        return (this.f93002v == null || this.f93001u == null) ? false : true;
    }

    public final void u(kp1.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "updateRecommendData scene: " + oVar);
        ((ef0.d4) ((qk.h9) i95.n0.c(qk.h9.class))).Ni(oVar.toString());
    }

    public final void v() {
        pm0.v.X(new kp1.b0(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPanelTaskBarViewRecommendMusicList(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        pm0.v.K(null, new kp1.s(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.a7f);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f92996p = (android.widget.RelativeLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.a7g);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f92997q = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.a7j);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f92998r = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.a7h);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f92999s = (android.widget.TextView) findViewById4;
        android.widget.RelativeLayout relativeLayout = this.f92996p;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new kp1.p(this));
            this.f93005y = new kp1.q(this);
            java.lang.Object context2 = getContext();
            if (context2 != null) {
                qk.d9 d9Var = (qk.d9) i95.n0.c(qk.d9.class);
                androidx.lifecycle.k0 k0Var = this.f93005y;
                kotlin.jvm.internal.o.d(k0Var);
                ef0.z3 z3Var = (ef0.z3) d9Var;
                z3Var.getClass();
                androidx.lifecycle.j0 j0Var = z3Var.f252381f;
                j0Var.observe((androidx.lifecycle.y) context2, k0Var);
                bw5.qb0 qb0Var = (bw5.qb0) j0Var.getValue();
                if (qb0Var != null) {
                    ((kp1.q) k0Var).onChanged(qb0Var);
                }
            }
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            android.widget.RelativeLayout relativeLayout2 = this.f92996p;
            if (relativeLayout2 != null) {
                ((cy1.a) rVar).pk(relativeLayout2, "tyt_mid_ctrl_list_body");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(getPlayButton(), "tyt_mid_ctrl_list_play");
                android.widget.TextView textView = this.f92998r;
                if (textView != null) {
                    com.tencent.mm.ui.bk.q0(textView.getPaint());
                    android.widget.TextView textView2 = this.f92999s;
                    if (textView2 != null) {
                        com.tencent.mm.ui.bk.q0(textView2.getPaint());
                        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a7b);
                        com.tencent.mm.ui.bk.q0(textView3 != null ? textView3.getPaint() : null);
                        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                        u(kp1.o.f310926d);
                        v();
                        return;
                    }
                    kotlin.jvm.internal.o.o("recommendDesc");
                    throw null;
                }
                kotlin.jvm.internal.o.o("recommendTitle");
                throw null;
            }
            kotlin.jvm.internal.o.o("recommendContainer");
            throw null;
        }
        kotlin.jvm.internal.o.o("recommendContainer");
        throw null;
    }
}
