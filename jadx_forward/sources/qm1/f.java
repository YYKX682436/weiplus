package qm1;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public android.app.Activity f446226a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f446227b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f446228c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 f446229d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f446230e;

    /* renamed from: f, reason: collision with root package name */
    public int f446231f;

    /* renamed from: g, reason: collision with root package name */
    public int f446232g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 f446233h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f446234i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f446235j;

    /* renamed from: k, reason: collision with root package name */
    public sm1.a f446236k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f446237l;

    public f() {
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        this.f446232g = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.u2();
        this.f446237l = jz5.h.b(new qm1.b(this));
    }

    public static final void a(qm1.f fVar, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24951x8c692f44 c24951x8c692f44) {
        fVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizCommentController", "addCommentInputView");
        android.app.Activity activity = fVar.f446226a;
        if (activity == null) {
            return;
        }
        fVar.f446231f = com.p314xaae8f345.mm.ui.bl.c(activity);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(activity);
        frameLayout.setBackgroundColor(activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        fVar.f446230e = frameLayout;
        android.widget.FrameLayout d17 = fVar.d();
        if (d17 != null) {
            android.widget.FrameLayout frameLayout2 = fVar.f446230e;
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = fVar.f446231f;
            d17.addView(frameLayout2, layoutParams);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7) com.p314xaae8f345.mm.ui.id.b(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dza, fVar.f446230e).findViewById(com.p314xaae8f345.mm.R.id.eat);
        fVar.f446229d = c12827x691a1aa7;
        if (c12827x691a1aa7 != null) {
            c12827x691a1aa7.setVisibility(fVar.f446234i ? 0 : 4);
            c12827x691a1aa7.setBackgroundColor(activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            c12827x691a1aa7.m53859x558c9080(!fVar.f446234i);
            c12827x691a1aa7.m53864x1c6ee3ad((qm1.a) ((jz5.n) fVar.f446237l).mo141623x754a37bb());
            c12827x691a1aa7.m53869xc61d8794(0.0f);
            fVar.h(c24951x8c692f44);
            android.app.Activity activity2 = fVar.f446226a;
            if (activity2 != null) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = fVar.f446227b;
                if (f5Var != null) {
                    f5Var.d();
                }
                fVar.f446227b = null;
                fVar.f446227b = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(activity2);
                com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var2 = fVar.f446227b;
                if (f5Var2 != null) {
                    f5Var2.f291933e = fVar.f446229d;
                }
                com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var3 = fVar.f446227b;
                if (f5Var3 != null) {
                    f5Var3.f();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa72 = fVar.f446229d;
        if (c12827x691a1aa72 == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = c12827x691a1aa72.getLayoutParams();
        if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = fVar.f446231f;
        }
        c12827x691a1aa72.setLayoutParams(layoutParams2);
    }

    public static final void b(qm1.f fVar) {
        android.widget.TextView m53847x623e5088;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizCommentController", "hideCommentInputView " + fVar.f());
        if (fVar.f()) {
            fVar.f446228c = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7 = fVar.f446229d;
            if (c12827x691a1aa7 != null) {
                int i17 = c12827x691a1aa7.footerMode;
                if (i17 == 1) {
                    c12827x691a1aa7.k(true);
                } else if (i17 == 2) {
                    c12827x691a1aa7.n(false);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa72 = fVar.f446229d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 m53838xdb574fcd = c12827x691a1aa72 != null ? c12827x691a1aa72.m53838xdb574fcd() : null;
        if (m53838xdb574fcd != null) {
            m53838xdb574fcd.setText((java.lang.CharSequence) null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa73 = fVar.f446229d;
        if (c12827x691a1aa73 != null) {
            c12827x691a1aa73.h("", "", null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa74 = fVar.f446229d;
        if (c12827x691a1aa74 != null && (m53847x623e5088 = c12827x691a1aa74.m53847x623e5088()) != null) {
            m53847x623e5088.setText(com.p314xaae8f345.mm.R.C30867xcad56011.n4p);
        }
        fVar.g();
    }

    public static final void c(qm1.f fVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87, boolean z17) {
        android.widget.TextView m53847x623e5088;
        float f174019v;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7 = fVar.f446229d;
        if (c12827x691a1aa7 != null) {
            if (z17) {
                if (fVar.f446234i) {
                    f174019v = c12827x691a1aa7.getF174019v();
                    i17 = fVar.f446231f;
                } else {
                    f174019v = c12827x691a1aa7.getF174019v() + c12827x691a1aa7.m53837x1293c36f();
                    i17 = fVar.f446231f;
                }
                c12827x691a1aa7.setTranslationY(f174019v + i17);
            }
            if (c19781xd1c47b87 != null) {
                int i18 = fVar.f446232g;
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                hc2.t.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i18);
                java.lang.String m76102x6c03c64c = c19781xd1c47b87.m76102x6c03c64c();
                java.lang.String m76084x8010e5e4 = c19781xd1c47b87.m76084x8010e5e4();
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                java.lang.String Ri = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ri(m76102x6c03c64c, m76084x8010e5e4, false);
                c12827x691a1aa7.g(c12827x691a1aa7.lastFromName, " " + c12827x691a1aa7.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n4r, Ri), null, true);
            } else {
                c12827x691a1aa7.h("", "", null);
            }
            boolean z18 = c19781xd1c47b87 != null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa72 = fVar.f446229d;
            if (c12827x691a1aa72 == null || (m53847x623e5088 = c12827x691a1aa72.m53847x623e5088()) == null) {
                return;
            }
            m53847x623e5088.setText(z18 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572074y0 : com.p314xaae8f345.mm.R.C30867xcad56011.n4p);
        }
    }

    public final android.widget.FrameLayout d() {
        android.view.Window window;
        android.app.Activity activity = this.f446226a;
        if (!(activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            return null;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity : null;
        android.view.View decorView = (abstractActivityC21394xb3d2c0cf == null || (window = abstractActivityC21394xb3d2c0cf.getWindow()) == null) ? null : window.getDecorView();
        if (decorView instanceof android.widget.FrameLayout) {
            return (android.widget.FrameLayout) decorView;
        }
        return null;
    }

    public final void e() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.BizCommentController", "internalRemoveCommentInputView", new java.lang.Object[0]);
        android.widget.FrameLayout d17 = d();
        if (d17 != null) {
            d17.removeView(this.f446230e);
        }
        this.f446230e = null;
        this.f446229d = null;
    }

    public final boolean f() {
        return (!this.f446228c || this.f446229d == null || this.f446230e == null) ? false : true;
    }

    public final void g() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.BizCommentController", "removeCommentInputViewIfNeeded", new java.lang.Object[0]);
        if (this.f446234i) {
            return;
        }
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (r8.booleanValue() == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24951x8c692f44 r8) {
        /*
            r7 = this;
            com.tencent.mm.plugin.audio.comment.view.BizCommentFooter r0 = r7.f446229d
            if (r0 == 0) goto L70
            java.lang.Long r1 = r8.m92429x8895be09()
            r2 = 1
            if (r1 == 0) goto L44
            java.lang.Long r1 = r8.m92429x8895be09()
            if (r1 != 0) goto L12
            goto L27
        L12:
            long r3 = r1.longValue()
            r5 = 2
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L27
            r1 = 2
            r0.m53877x53aed94a(r1)
            int r1 = r0.getScene()
            r7.f446232g = r1
            goto L49
        L27:
            if (r1 != 0) goto L2a
            goto L3e
        L2a:
            long r3 = r1.longValue()
            r5 = 3
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L3e
            r0.m53877x53aed94a(r2)
            int r1 = r0.getScene()
            r7.f446232g = r1
            goto L49
        L3e:
            int r1 = r7.f446232g
            r0.m53877x53aed94a(r1)
            goto L49
        L44:
            int r1 = r7.f446232g
            r0.m53877x53aed94a(r1)
        L49:
            java.lang.Boolean r1 = r8.m92423x184786e()
            r3 = 0
            if (r1 == 0) goto L5e
            java.lang.Boolean r8 = r8.m92423x184786e()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L5e
            goto L5f
        L5e:
            r2 = r3
        L5f:
            r0.m53861xbd14632b(r2)
            r0.l(r3)
            r0.m(r3)
            qm1.e r8 = new qm1.e
            r8.<init>(r7)
            r0.m53883xe955eca(r8)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qm1.f.h(com.tencent.pigeon.ting.CommentInputRequest):void");
    }
}
