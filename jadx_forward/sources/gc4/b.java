package gc4;

/* loaded from: classes4.dex */
public final class b implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f351973d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 f351974e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f351975f;

    /* renamed from: g, reason: collision with root package name */
    public int f351976g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f351977h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f351978i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f351979m;

    public b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 commentFooter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentFooter, "commentFooter");
        this.f351973d = activity;
        this.f351974e = commentFooter;
        this.f351975f = "MicroMsg.SnsCommentAdjustNothingKeyboardStateDelegate";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateUseAdjustNothingConfigValue", "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig");
        ka4.e.f387662a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_comment_footer_use_adjust_nothing, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooterConfig", "enableAdjustNothing: " + ka4.e.f387662a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateUseAdjustNothingConfigValue", "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableUseAdjustNothingConfig", "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig");
        boolean z17 = ka4.e.f387662a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableUseAdjustNothingConfig", "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig");
        this.f351977h = z17;
        android.view.Window window = activity.getWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWindowSoftInputModeToAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (z17) {
            window.setSoftInputMode(48);
        }
        commentFooter.G = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "setWindowSoftInputModeToAdjustNothing: enable:%b, current mode:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(window.getAttributes().softInputMode));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWindowSoftInputModeToAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentAdjustNothingKeyboardStateDelegate", "init useAdjustNothing=" + z17);
        if (z17) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(activity);
            this.f351978i = f5Var;
            f5Var.f291933e = this;
        }
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("close", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f351975f, "close: keyboardHeightProviderStarted=" + this.f351979m);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f351978i;
        if (f5Var != null) {
            f5Var.d();
        }
        this.f351979m = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("close", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
    }

    public final boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableDelegateKeyBoardState", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        boolean z17 = false;
        if (this.f351977h) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isUseAdjustResize", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
            boolean z18 = (this.f351973d.getWindow().getAttributes().softInputMode & 240) == 16;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUseAdjustResize", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
            if (!z18) {
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableDelegateKeyBoardState", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        return z17;
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f351975f, "start: keyboardHeightProviderStarted=" + this.f351979m);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f351978i;
        if (f5Var != null) {
            f5Var.f();
        }
        this.f351979m = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onKeyboardHeightChanged", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f351973d;
        int max = i17 == 0 ? 0 : java.lang.Math.max(com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.h(abstractActivityC21394xb3d2c0cf, i17, 0), i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f351975f, "onKeyboardHeightChanged: resultHeight:" + max + ", from provider:" + i17 + ", isResized=" + z17);
        if (this.f351978i != null) {
            int i18 = max > 0 ? 1 : 2;
            if (i18 != this.f351976g) {
                this.f351976g = i18;
                abstractActivityC21394xb3d2c0cf.mo54561x62d1e2e9();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662 = this.f351974e;
            c18037xf8026662.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyKeyBoardChangeOnAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "notifyKeyBoardChange: keyboardHeight: %d, isResized: %s", java.lang.Integer.valueOf(max), java.lang.Boolean.valueOf(z17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            boolean z18 = c18037xf8026662.G;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            if (z18) {
                boolean z19 = max > 0;
                c18037xf8026662.X(z19, max);
                if (c18037xf8026662.f248634r != null) {
                    if (!z19 && !c18037xf8026662.y() && !c18037xf8026662.x()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "notifyKeyBoardChange: footer need down, SmileyPanel Gone");
                        c18037xf8026662.p();
                        c18037xf8026662.J(false);
                        c18037xf8026662.f248647z1 = false;
                    }
                    if (z19 && c18037xf8026662.f248634r.getVisibility() == 8) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "notifyKeyBoardChange: footer need up");
                        c18037xf8026662.q(false);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyKeyBoardChangeOnAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "notifyKeyBoardChange: should use adjustNothing!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyKeyBoardChangeOnAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onKeyboardHeightChanged", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
    }
}
