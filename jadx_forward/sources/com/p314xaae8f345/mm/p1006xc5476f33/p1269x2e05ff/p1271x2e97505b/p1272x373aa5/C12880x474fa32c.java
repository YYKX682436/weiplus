package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewRecommendMusicList;", "Lcom/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarBaseView;", "", "getSubTitle", "", "getLayoutId", "getRecentPlayControlType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "kp1/o", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList */
/* loaded from: classes11.dex */
public final class C12880x474fa32c extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f174528z = 0;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f174529p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f174530q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f174531r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f174532s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.lp0 f174533t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.o50 f174534u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.qb0 f174535v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f174536w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f174537x;

    /* renamed from: y, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.k0 f174538y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12880x474fa32c(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getSubTitle */
    public final java.lang.String m54048xff46996e() {
        boolean booleanValue;
        qk.h9 h9Var = (qk.h9) i95.n0.c(qk.h9.class);
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        bw5.qb0 qb0Var = this.f174535v;
        bw5.lp0 lp0Var = this.f174533t;
        ef0.d4 d4Var = (ef0.d4) h9Var;
        d4Var.getClass();
        if (!(qb0Var != null && qb0Var.f113567f == 1)) {
            return d4Var.wi(context);
        }
        if (lp0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(lp0Var.d().m13171x7531c8a2());
            sb6.append('-');
            bw5.v70 d17 = lp0Var.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getListenItem(...)");
            sb6.append(rk4.j5.b(d17));
            return sb6.toString();
        }
        java.lang.Boolean bool = d4Var.f333729d;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(gm4.a.f355090a.a("key_clicked_recommend", false));
            d4Var.f333729d = valueOf;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            booleanValue = valueOf.booleanValue();
        }
        if (!booleanValue) {
            return d4Var.wi(context);
        }
        bw5.l60 b17 = qb0Var.b();
        java.lang.String str = b17 != null ? b17.m12381x6e095e9(9) ? b17.f111191o : "" : null;
        java.lang.String str2 = str != null ? str : "";
        if (!(str2.length() > 0)) {
            str2 = null;
        }
        return str2 == null ? d4Var.wi(context) : str2;
    }

    public static final void q(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c c12880x474fa32c, bw5.qb0 qb0Var) {
        if (qb0Var == null) {
            c12880x474fa32c.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "handleRedDotRecommendDataUpdate data null and ignore");
            return;
        }
        c12880x474fa32c.f174535v = qb0Var;
        bw5.l60 b17 = qb0Var.b();
        if (b17 != null) {
            bw5.o50 b18 = b17.b();
            java.lang.String c17 = b18.c();
            if (c17 == null || c17.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "handleRedDotRecommendDataUpdate categoryId invalid");
                c12880x474fa32c.f174534u = null;
                return;
            }
            c12880x474fa32c.f174534u = b18;
            boolean hj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).hj();
            if (!c12880x474fa32c.f174536w || hj6) {
                c12880x474fa32c.f174537x = false;
                c12880x474fa32c.f174533t = null;
                ((ef0.d4) ((qk.h9) i95.n0.c(qk.h9.class))).Di(null);
                c12880x474fa32c.v();
            } else {
                c12880x474fa32c.f174537x = true;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleRedDotRecommendDataUpdate categoryItem: ");
            bw5.o50 o50Var = c12880x474fa32c.f174534u;
            sb6.append(o50Var != null ? o50Var.c() : null);
            sb6.append(", categoryItem.type: ");
            bw5.o50 o50Var2 = c12880x474fa32c.f174534u;
            sb6.append(o50Var2 != null ? java.lang.Integer.valueOf(o50Var2.f112497n) : null);
            sb6.append(", type: ");
            bw5.qb0 qb0Var2 = c12880x474fa32c.f174535v;
            sb6.append(qb0Var2 != null ? java.lang.Integer.valueOf(qb0Var2.f113565d) : null);
            sb6.append(", descType: ");
            bw5.qb0 qb0Var3 = c12880x474fa32c.f174535v;
            sb6.append(qb0Var3 != null ? java.lang.Integer.valueOf(qb0Var3.f113567f) : null);
            sb6.append(", subTitle: ");
            sb6.append(b17.m12381x6e095e9(9) ? b17.f111191o : "");
            sb6.append(", isPlayFromTaskBarRecommend: ");
            sb6.append(c12880x474fa32c.f174536w);
            sb6.append(", idle: ");
            sb6.append(hj6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", sb6.toString());
        }
    }

    public static final void r(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c c12880x474fa32c, java.lang.String str, boolean z17) {
        c12880x474fa32c.getClass();
        if (!z17) {
            if (!(str == null || str.length() == 0)) {
                ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
                android.widget.ImageView imageView = c12880x474fa32c.f174530q;
                if (imageView != null) {
                    ((dl4.m0) tVar).aj(str, imageView, 0, null);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendCover");
                    throw null;
                }
            }
        }
        android.widget.ImageView imageView2 = c12880x474fa32c.f174530q;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendCover");
            throw null;
        }
        imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f78568xfb6bff55);
        android.widget.RelativeLayout relativeLayout = c12880x474fa32c.f174529p;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(relativeLayout.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.afe));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendContainer");
            throw null;
        }
    }

    public static final void s(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c c12880x474fa32c, java.lang.String str, boolean z17) {
        android.widget.TextView textView = c12880x474fa32c.f174532s;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendDesc");
            throw null;
        }
        int textSize = (int) (textView.getTextSize() * 1.2d);
        i95.m c17 = i95.n0.c(zy2.s6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.s6 s6Var = (zy2.s6) c17;
        if (str == null) {
            str = "";
        }
        textView.setText(zy2.s6.l6(s6Var, str, textSize, false, null, 0, false, null, 120, null));
        if (z17) {
            textView.setTextColor(textView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
        } else {
            textView.setTextColor(textView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6, kp1.l1
    public void a() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6, kp1.l1
    public void b() {
        super.b();
        ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ni(1001, this.f174534u);
        u(kp1.o.f392460e);
        android.widget.TextView textView = this.f174532s;
        if (textView != null) {
            textView.post(new kp1.v(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendDesc");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6, kp1.l1
    public void c(qk.ia state) {
        boolean z17;
        bw5.dr0 c17;
        bw5.cp0 b17;
        bw5.o50 b18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int Ni = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Ni();
        b66.j cj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).cj();
        bw5.fr0 d17 = cj6 != null ? ((b66.k) cj6).d() : null;
        bw5.lp0 b19 = d17 != null ? d17.b() : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((d17 == null || (c17 = d17.c()) == null || (b17 = c17.b()) == null || (b18 = b17.b()) == null) ? null : b18.c(), "83101")) {
            if (b19 != null) {
                this.f174533t = b19;
                pm0.v.K(null, new kp1.w(b19));
            }
            pm0.v.X(new kp1.x(this, b19 != null ? rk4.j5.d(b19) : null));
            m54042x2832028f(state);
            z17 = true;
        } else {
            m54042x2832028f(qk.ia.f445703f);
            z17 = false;
        }
        pm0.v.X(new kp1.y(this));
        state.toString();
        this.f174536w = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "isPlayFromTaskBarRecommend: " + this.f174536w + ", playerScene: " + Ni + ", pendingUpdateViewFromSyncData: " + this.f174537x);
        if (state == qk.ia.f445703f && this.f174537x) {
            this.f174537x = false;
            this.f174533t = null;
            ((ef0.d4) ((qk.h9) i95.n0.c(qk.h9.class))).Di(null);
            v();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6, kp1.l1
    public void d() {
        if (t()) {
            v();
        } else {
            pm0.v.K(null, new kp1.s(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    public void g() {
        m54046x8baf87a4((android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.a7_));
        m54047x7b10a520((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a7d));
        m54045x5dd06d88((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.a79));
        m54041x4f973a4c((android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.a78));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 playButton = getPlayButton();
        if (playButton != null) {
            playButton.setOnClickListener(new kp1.t(this));
        }
        super.g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    /* renamed from: getLayoutId */
    public int mo54030x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570729dp5;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    /* renamed from: getRecentPlayControlType */
    public int mo54037x5e16a8d2() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    public boolean h() {
        return t();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    public void i(boolean z17) {
        if (z17) {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ni(1117, this.f174534u);
        } else {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ni(1118, this.f174534u);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    public void j(boolean z17) {
        boolean z18 = false;
        if (this.f174536w) {
            if (((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).nj()) {
                n(qk.ia.f445706i);
                pm0.v.K(null, kp1.z.f392487d);
                i(false);
            } else if (((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).ij()) {
                n(qk.ia.f445704g);
                pm0.v.K(null, kp1.a0.f392414d);
                i(true);
            }
            z18 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "onTogglePlay handled: " + z18);
        if (z18) {
            return;
        }
        if (((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).hj()) {
            n(qk.ia.f445705h);
            if (z17) {
                ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ni(1117, this.f174534u);
            }
        } else {
            n(qk.ia.f445704g);
        }
        i95.m c17 = i95.n0.c(qk.g9.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        bw5.lp0 lp0Var = this.f174533t;
        bw5.o50 o50Var = this.f174534u;
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        qk.g9.Ye((qk.g9) c17, lp0Var, null, o50Var, null, new il4.e(null, 0, 5, false, null, null, 0, 0, false, false, null, java.lang.Integer.valueOf(mo54037x5e16a8d2()), null, null, null, null, false, false, null, null, false, null, false, null, false, 33552379, null), 10, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    public void m(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 playButton = getPlayButton();
            if (playButton != null) {
                playButton.s(com.p314xaae8f345.mm.R.raw.f79844x41f895de, com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 playButton2 = getPlayButton();
            if (playButton2 == null) {
                return;
            }
            playButton2.setContentDescription(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572044x5));
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 playButton3 = getPlayButton();
        if (playButton3 != null) {
            playButton3.s(com.p314xaae8f345.mm.R.raw.f79905x9403a955, com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 playButton4 = getPlayButton();
        if (playButton4 == null) {
            return;
        }
        playButton4.setContentDescription(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572052xf));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6, kp1.l1
    /* renamed from: release */
    public void mo54039x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "releaseAudioPanelTaskBarController " + hashCode());
        super.mo54039x41012807();
    }

    public final boolean t() {
        return (this.f174535v == null || this.f174534u == null) ? false : true;
    }

    public final void u(kp1.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "updateRecommendData scene: " + oVar);
        ((ef0.d4) ((qk.h9) i95.n0.c(qk.h9.class))).Ni(oVar.toString());
    }

    public final void v() {
        pm0.v.X(new kp1.b0(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12880x474fa32c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pm0.v.K(null, new kp1.s(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.a7f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f174529p = (android.widget.RelativeLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.a7g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f174530q = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.a7j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f174531r = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.a7h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f174532s = (android.widget.TextView) findViewById4;
        android.widget.RelativeLayout relativeLayout = this.f174529p;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new kp1.p(this));
            this.f174538y = new kp1.q(this);
            java.lang.Object context2 = getContext();
            if (context2 != null) {
                qk.d9 d9Var = (qk.d9) i95.n0.c(qk.d9.class);
                p012xc85e97e9.p093xedfae76a.k0 k0Var = this.f174538y;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var);
                ef0.z3 z3Var = (ef0.z3) d9Var;
                z3Var.getClass();
                p012xc85e97e9.p093xedfae76a.j0 j0Var = z3Var.f333914f;
                j0Var.mo7806x9d92d11c((p012xc85e97e9.p093xedfae76a.y) context2, k0Var);
                bw5.qb0 qb0Var = (bw5.qb0) j0Var.mo3195x754a37bb();
                if (qb0Var != null) {
                    ((kp1.q) k0Var).mo525x7bb163d5(qb0Var);
                }
            }
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            android.widget.RelativeLayout relativeLayout2 = this.f174529p;
            if (relativeLayout2 != null) {
                ((cy1.a) rVar).pk(relativeLayout2, "tyt_mid_ctrl_list_body");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(getPlayButton(), "tyt_mid_ctrl_list_play");
                android.widget.TextView textView = this.f174531r;
                if (textView != null) {
                    com.p314xaae8f345.mm.ui.bk.q0(textView.getPaint());
                    android.widget.TextView textView2 = this.f174532s;
                    if (textView2 != null) {
                        com.p314xaae8f345.mm.ui.bk.q0(textView2.getPaint());
                        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a7b);
                        com.p314xaae8f345.mm.ui.bk.q0(textView3 != null ? textView3.getPaint() : null);
                        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        u(kp1.o.f392459d);
                        v();
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendContainer");
        throw null;
    }
}
