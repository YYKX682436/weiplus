package com.tencent.mm.plugin.ball.audio_panel.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewRecommendV2;", "Lcom/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarBaseView;", "", "getLayoutId", "getRecentPlayControlType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "kp1/c0", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class AudioPanelTaskBarViewRecommendV2 extends com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView {
    public static final /* synthetic */ int B = 0;
    public final kp1.d0 A;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f93006p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f93007q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f93008r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f93009s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f93010t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f93011u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f93012v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f93013w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.xb0 f93014x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f93015y;

    /* renamed from: z, reason: collision with root package name */
    public final kp1.j0 f93016z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioPanelTaskBarViewRecommendV2(android.content.Context context) {
        this(context, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView, kp1.l1
    public void a() {
        ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Bi(bw5.yq0.TingReportAction_PageDisappear, this.f93014x, this.f93015y);
        if (this.f93013w) {
            this.f93013w = false;
            r();
            pm0.v.X(new kp1.m0(this));
        }
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView, kp1.l1
    public void b() {
        super.b();
        ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Bi(bw5.yq0.TingReportAction_PageAppear, this.f93014x, this.f93015y);
        p(kp1.c0.f310888f);
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView, kp1.l1
    public void d() {
        o();
        pm0.v.X(new kp1.m0(this));
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    public void g() {
        setRecentContainer((android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.a7_));
        setRecentDescTextView((android.widget.TextView) findViewById(com.tencent.mm.R.id.a7d));
        setPlayButton((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.a79));
        setLoadingButton((android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.a78));
        com.tencent.mm.ui.widget.imageview.WeImageView playButton = getPlayButton();
        if (playButton != null) {
            playButton.setOnClickListener(new kp1.i0(this));
        }
        super.g();
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bnq;
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    public int getRecentPlayControlType() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView
    public void i(boolean z17) {
        if (z17) {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ui(bw5.yq0.TingReportAction_TrianglePlay, this.f93014x, this.f93015y);
        } else {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ui(bw5.yq0.TingReportAction_DoubleBarPause, this.f93014x, this.f93015y);
        }
    }

    public final void p(kp1.c0 c0Var) {
        if (this.f93011u) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendV2", "checkListenSync scene: " + c0Var);
            ((ef0.m3) ((qk.w8) i95.n0.c(qk.w8.class))).wi(null, null);
        }
    }

    public final void q() {
        android.widget.RelativeLayout relativeLayout = this.f93006p;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(relativeLayout.getContext().getResources().getColor(com.tencent.mm.R.color.f478695ec));
        } else {
            kotlin.jvm.internal.o.o("recommendContainer");
            throw null;
        }
    }

    public final void r() {
        if (this.f93011u) {
            ef0.m3 m3Var = (ef0.m3) ((qk.w8) i95.n0.c(qk.w8.class));
            bw5.xb0 xb0Var = m3Var.f252275e;
            if (xb0Var == null) {
                byte[] b17 = gm4.a.f273557a.b("ting_listen_sync_item");
                if (b17 != null) {
                    bw5.xb0 xb0Var2 = new bw5.xb0();
                    xb0Var2.parseFrom(b17);
                    m3Var.f252275e = xb0Var2;
                }
                xb0Var = m3Var.f252275e;
            }
            this.f93014x = xb0Var;
            ef0.m3 m3Var2 = (ef0.m3) ((qk.w8) i95.n0.c(qk.w8.class));
            java.lang.String str = m3Var2.f252276f;
            if (str == null) {
                str = gm4.a.f273557a.e("ting_listen_sync_session_buffer", null);
                m3Var2.f252276f = str;
            }
            this.f93015y = str;
        }
    }

    @Override // com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView, kp1.l1
    public void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendV2", "releaseAudioPanelTaskBarController " + hashCode());
        super.release();
        this.f93011u = false;
        qk.w8 w8Var = (qk.w8) i95.n0.c(qk.w8.class);
        kp1.j0 callback = this.f93016z;
        ef0.m3 m3Var = (ef0.m3) w8Var;
        m3Var.getClass();
        kotlin.jvm.internal.o.g(callback, "callback");
        synchronized (m3Var.f252274d) {
            m3Var.f252274d.remove(callback);
        }
        this.A.dead();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioPanelTaskBarViewRecommendV2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPanelTaskBarViewRecommendV2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kp1.j0 j0Var = new kp1.j0(this);
        this.f93016z = j0Var;
        kp1.d0 d0Var = new kp1.d0(this);
        this.A = d0Var;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.a7f);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f93006p = (android.widget.RelativeLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.a7g);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f93007q = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.a7j);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f93009s = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.a7h);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f93010t = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.a7l);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f93008r = (android.widget.ImageView) findViewById5;
        android.widget.RelativeLayout relativeLayout = this.f93006p;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new kp1.h0(this));
            android.widget.TextView textView = this.f93009s;
            if (textView != null) {
                com.tencent.mm.ui.bk.q0(textView.getPaint());
                android.widget.TextView textView2 = this.f93010t;
                if (textView2 != null) {
                    com.tencent.mm.ui.bk.q0(textView2.getPaint());
                    android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a7b);
                    com.tencent.mm.ui.bk.q0(textView3 != null ? textView3.getPaint() : null);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    ef0.m3 m3Var = (ef0.m3) ((qk.w8) i95.n0.c(qk.w8.class));
                    m3Var.getClass();
                    synchronized (m3Var.f252274d) {
                        m3Var.f252274d.add(j0Var);
                    }
                    d0Var.alive();
                    this.f93011u = true;
                    r();
                    p(kp1.c0.f310886d);
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
}
