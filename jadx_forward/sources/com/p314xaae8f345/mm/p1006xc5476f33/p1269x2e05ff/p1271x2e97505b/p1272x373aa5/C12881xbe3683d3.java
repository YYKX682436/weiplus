package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewRecommendV2;", "Lcom/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarBaseView;", "", "getLayoutId", "getRecentPlayControlType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "kp1/c0", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 */
/* loaded from: classes11.dex */
public final class C12881xbe3683d3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6 {
    public static final /* synthetic */ int B = 0;
    public final kp1.d0 A;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f174539p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f174540q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f174541r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f174542s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f174543t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f174544u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f174545v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f174546w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.xb0 f174547x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f174548y;

    /* renamed from: z, reason: collision with root package name */
    public final kp1.j0 f174549z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12881xbe3683d3(android.content.Context context) {
        this(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6, kp1.l1
    public void a() {
        ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Bi(bw5.yq0.TingReportAction_PageDisappear, this.f174547x, this.f174548y);
        if (this.f174546w) {
            this.f174546w = false;
            r();
            pm0.v.X(new kp1.m0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6, kp1.l1
    public void b() {
        super.b();
        ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Bi(bw5.yq0.TingReportAction_PageAppear, this.f174547x, this.f174548y);
        p(kp1.c0.f392421f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6, kp1.l1
    public void d() {
        o();
        pm0.v.X(new kp1.m0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    public void g() {
        m54046x8baf87a4((android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.a7_));
        m54047x7b10a520((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a7d));
        m54045x5dd06d88((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.a79));
        m54041x4f973a4c((android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.a78));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 playButton = getPlayButton();
        if (playButton != null) {
            playButton.setOnClickListener(new kp1.i0(this));
        }
        super.g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    /* renamed from: getLayoutId */
    public int mo54030x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bnq;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    /* renamed from: getRecentPlayControlType */
    public int mo54037x5e16a8d2() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    public void i(boolean z17) {
        if (z17) {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ui(bw5.yq0.TingReportAction_TrianglePlay, this.f174547x, this.f174548y);
        } else {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ui(bw5.yq0.TingReportAction_DoubleBarPause, this.f174547x, this.f174548y);
        }
    }

    public final void p(kp1.c0 c0Var) {
        if (this.f174544u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendV2", "checkListenSync scene: " + c0Var);
            ((ef0.m3) ((qk.w8) i95.n0.c(qk.w8.class))).wi(null, null);
        }
    }

    public final void q() {
        android.widget.RelativeLayout relativeLayout = this.f174539p;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(relativeLayout.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560228ec));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendContainer");
            throw null;
        }
    }

    public final void r() {
        if (this.f174544u) {
            ef0.m3 m3Var = (ef0.m3) ((qk.w8) i95.n0.c(qk.w8.class));
            bw5.xb0 xb0Var = m3Var.f333808e;
            if (xb0Var == null) {
                byte[] b17 = gm4.a.f355090a.b("ting_listen_sync_item");
                if (b17 != null) {
                    bw5.xb0 xb0Var2 = new bw5.xb0();
                    xb0Var2.mo11468x92b714fd(b17);
                    m3Var.f333808e = xb0Var2;
                }
                xb0Var = m3Var.f333808e;
            }
            this.f174547x = xb0Var;
            ef0.m3 m3Var2 = (ef0.m3) ((qk.w8) i95.n0.c(qk.w8.class));
            java.lang.String str = m3Var2.f333809f;
            if (str == null) {
                str = gm4.a.f355090a.e("ting_listen_sync_session_buffer", null);
                m3Var2.f333809f = str;
            }
            this.f174548y = str;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6, kp1.l1
    /* renamed from: release */
    public void mo54039x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendV2", "releaseAudioPanelTaskBarController " + hashCode());
        super.mo54039x41012807();
        this.f174544u = false;
        qk.w8 w8Var = (qk.w8) i95.n0.c(qk.w8.class);
        kp1.j0 callback = this.f174549z;
        ef0.m3 m3Var = (ef0.m3) w8Var;
        m3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        synchronized (m3Var.f333807d) {
            m3Var.f333807d.remove(callback);
        }
        this.A.m43072x2efc64();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12881xbe3683d3(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12881xbe3683d3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        kp1.j0 j0Var = new kp1.j0(this);
        this.f174549z = j0Var;
        kp1.d0 d0Var = new kp1.d0(this);
        this.A = d0Var;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.a7f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f174539p = (android.widget.RelativeLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.a7g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f174540q = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.a7j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f174542s = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.a7h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f174543t = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.a7l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f174541r = (android.widget.ImageView) findViewById5;
        android.widget.RelativeLayout relativeLayout = this.f174539p;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new kp1.h0(this));
            android.widget.TextView textView = this.f174542s;
            if (textView != null) {
                com.p314xaae8f345.mm.ui.bk.q0(textView.getPaint());
                android.widget.TextView textView2 = this.f174543t;
                if (textView2 != null) {
                    com.p314xaae8f345.mm.ui.bk.q0(textView2.getPaint());
                    android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a7b);
                    com.p314xaae8f345.mm.ui.bk.q0(textView3 != null ? textView3.getPaint() : null);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    ef0.m3 m3Var = (ef0.m3) ((qk.w8) i95.n0.c(qk.w8.class));
                    m3Var.getClass();
                    synchronized (m3Var.f333807d) {
                        m3Var.f333807d.add(j0Var);
                    }
                    d0Var.m43071x58998cd();
                    this.f174544u = true;
                    r();
                    p(kp1.c0.f392419d);
                    return;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendDesc");
                throw null;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendTitle");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendContainer");
        throw null;
    }
}
