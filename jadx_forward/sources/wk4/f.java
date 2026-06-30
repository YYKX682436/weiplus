package wk4;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public android.app.Activity f528504a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f528505b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f528506c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c f528507d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f528508e;

    /* renamed from: f, reason: collision with root package name */
    public int f528509f;

    /* renamed from: g, reason: collision with root package name */
    public int f528510g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 f528511h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f528512i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f528513j;

    /* renamed from: k, reason: collision with root package name */
    public yk4.a f528514k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f528515l;

    public f() {
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        this.f528510g = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.u2();
        this.f528515l = jz5.h.b(new wk4.b(this));
    }

    public static final void a(wk4.f fVar, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24951x8c692f44 c24951x8c692f44) {
        fVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingCommentController", "addCommentInputView");
        android.app.Activity activity = fVar.f528504a;
        if (activity == null) {
            return;
        }
        android.widget.FrameLayout frameLayout = fVar.f528508e;
        if (frameLayout != null) {
            pm0.v.B(frameLayout);
        }
        fVar.f528509f = com.p314xaae8f345.mm.ui.bl.c(activity);
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(activity);
        frameLayout2.setBackgroundColor(activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        fVar.f528508e = frameLayout2;
        android.widget.FrameLayout d17 = fVar.d();
        if (d17 != null) {
            android.widget.FrameLayout frameLayout3 = fVar.f528508e;
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = fVar.f528509f;
            d17.addView(frameLayout3, layoutParams);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c) com.p314xaae8f345.mm.ui.id.b(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571108d11, fVar.f528508e).findViewById(com.p314xaae8f345.mm.R.id.eat);
        fVar.f528507d = c18713x3be2dc6c;
        if (c18713x3be2dc6c != null) {
            c18713x3be2dc6c.setVisibility(fVar.f528512i ? 0 : 4);
            c18713x3be2dc6c.setBackgroundColor(activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            c18713x3be2dc6c.m72087x558c9080(!fVar.f528512i);
            c18713x3be2dc6c.m72092x1c6ee3ad((wk4.a) ((jz5.n) fVar.f528515l).mo141623x754a37bb());
            c18713x3be2dc6c.m72097xc61d8794(0.0f);
            fVar.h(c24951x8c692f44);
            android.app.Activity activity2 = fVar.f528504a;
            if (activity2 != null) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = fVar.f528505b;
                if (f5Var != null) {
                    f5Var.d();
                }
                fVar.f528505b = null;
                fVar.f528505b = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(activity2);
                com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var2 = fVar.f528505b;
                if (f5Var2 != null) {
                    f5Var2.f291933e = fVar.f528507d;
                }
                com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var3 = fVar.f528505b;
                if (f5Var3 != null) {
                    f5Var3.f();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c2 = fVar.f528507d;
        if (c18713x3be2dc6c2 == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = c18713x3be2dc6c2.getLayoutParams();
        if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = fVar.f528509f;
        }
        c18713x3be2dc6c2.setLayoutParams(layoutParams2);
    }

    public static final void b(wk4.f fVar) {
        android.widget.TextView m72075x623e5088;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingCommentController", "hideCommentInputView " + fVar.f());
        if (fVar.f()) {
            fVar.f528506c = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c = fVar.f528507d;
            if (c18713x3be2dc6c != null) {
                int i17 = c18713x3be2dc6c.footerMode;
                if (i17 == 1) {
                    c18713x3be2dc6c.k(true);
                } else if (i17 == 2) {
                    c18713x3be2dc6c.n(false);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c2 = fVar.f528507d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 m72066xdb574fcd = c18713x3be2dc6c2 != null ? c18713x3be2dc6c2.m72066xdb574fcd() : null;
        if (m72066xdb574fcd != null) {
            m72066xdb574fcd.setText((java.lang.CharSequence) null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c3 = fVar.f528507d;
        if (c18713x3be2dc6c3 != null) {
            c18713x3be2dc6c3.h("", "", null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c4 = fVar.f528507d;
        if (c18713x3be2dc6c4 != null && (m72075x623e5088 = c18713x3be2dc6c4.m72075x623e5088()) != null) {
            m72075x623e5088.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jyk);
        }
        fVar.g();
    }

    public static final void c(wk4.f fVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87, boolean z17) {
        android.widget.TextView m72075x623e5088;
        float f256215v;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c = fVar.f528507d;
        if (c18713x3be2dc6c != null) {
            if (z17) {
                if (fVar.f528512i) {
                    f256215v = c18713x3be2dc6c.getF256215v();
                    i17 = fVar.f528509f;
                } else {
                    f256215v = c18713x3be2dc6c.getF256215v() + c18713x3be2dc6c.m72065x1293c36f();
                    i17 = fVar.f528509f;
                }
                c18713x3be2dc6c.setTranslationY(f256215v + i17);
            }
            if (c19781xd1c47b87 != null) {
                int i18 = fVar.f528510g;
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                hc2.t.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i18);
                java.lang.String m76102x6c03c64c = c19781xd1c47b87.m76102x6c03c64c();
                java.lang.String m76084x8010e5e4 = c19781xd1c47b87.m76084x8010e5e4();
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                java.lang.String Ri = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ri(m76102x6c03c64c, m76084x8010e5e4, false);
                c18713x3be2dc6c.g(c18713x3be2dc6c.lastFromName, " " + c18713x3be2dc6c.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jyo, Ri), null, true);
            } else {
                c18713x3be2dc6c.h("", "", null);
            }
            boolean z18 = c19781xd1c47b87 != null;
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c2 = fVar.f528507d;
            if (c18713x3be2dc6c2 == null || (m72075x623e5088 = c18713x3be2dc6c2.m72075x623e5088()) == null) {
                return;
            }
            m72075x623e5088.setText(z18 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572074y0 : com.p314xaae8f345.mm.R.C30867xcad56011.jyk);
        }
    }

    public final android.widget.FrameLayout d() {
        android.view.Window window;
        android.app.Activity activity = this.f528504a;
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
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TingCommentController", "internalRemoveCommentInputView", new java.lang.Object[0]);
        android.widget.FrameLayout d17 = d();
        if (d17 != null) {
            d17.removeView(this.f528508e);
        }
        this.f528508e = null;
        this.f528507d = null;
    }

    public final boolean f() {
        return (!this.f528506c || this.f528507d == null || this.f528508e == null) ? false : true;
    }

    public final void g() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TingCommentController", "removeCommentInputViewIfNeeded showInputBar: " + this.f528512i, new java.lang.Object[0]);
        if (this.f528512i) {
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
            com.tencent.mm.plugin.ting.comment.view.TingCommentFooter r0 = r7.f528507d
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
            r0.m72105x53aed94a(r1)
            int r1 = r0.getScene()
            r7.f528510g = r1
            goto L49
        L27:
            if (r1 != 0) goto L2a
            goto L3e
        L2a:
            long r3 = r1.longValue()
            r5 = 3
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L3e
            r0.m72105x53aed94a(r2)
            int r1 = r0.getScene()
            r7.f528510g = r1
            goto L49
        L3e:
            int r1 = r7.f528510g
            r0.m72105x53aed94a(r1)
            goto L49
        L44:
            int r1 = r7.f528510g
            r0.m72105x53aed94a(r1)
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
            r0.m72089xbd14632b(r2)
            r0.l(r3)
            r0.m(r3)
            wk4.e r8 = new wk4.e
            r8.<init>(r7)
            r0.m72111xe955eca(r8)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wk4.f.h(com.tencent.pigeon.ting.CommentInputRequest):void");
    }
}
