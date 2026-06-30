package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI */
/* loaded from: classes8.dex */
public final class ActivityC15062xd67d4d74 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {
    public static final /* synthetic */ int E = 0;
    public android.view.View A;
    public android.widget.ProgressBar B;
    public android.view.View C;
    public android.widget.ImageView D;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f210234t = "";

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f210235u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f210236v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f210237w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f210238x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f210239y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f210240z;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        return 10;
    }

    public final void c7(java.lang.String str) {
        android.widget.ProgressBar progressBar = this.B;
        if (progressBar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loading");
            throw null;
        }
        progressBar.setVisibility(0);
        android.view.View view = this.C;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshArea");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI", "doGetQRCodeScene", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI", "doGetQRCodeScene", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)));
        cq.j1.i((cq.k) c17, str, 0, 0L, 0L, qt2Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.cg(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.eg(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b8y;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String str;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.e_e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f210235u = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.fuv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f210236v = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f564832a85);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f210237w = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.a89);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f210238x = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.f569001sb5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f210239y = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.f566480g11);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f210240z = (android.widget.ImageView) findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.f568026lf2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.A = findViewById7;
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.imd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.B = (android.widget.ProgressBar) findViewById8;
        android.view.View findViewById9 = findViewById(com.p314xaae8f345.mm.R.id.g1a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.C = findViewById9;
        android.view.View findViewById10 = findViewById(com.p314xaae8f345.mm.R.id.g1b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.D = (android.widget.ImageView) findViewById10;
        ya2.b2 b17 = ya2.h.f542017a.b(this.f210234t);
        if (b17 != null) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(b17.m176700xe5e0d2a0(), null, 2, null);
            android.widget.ImageView imageView = this.f210235u;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarIv");
                throw null;
            }
            a17.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
            android.widget.TextView textView = this.f210236v;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickTv");
                throw null;
            }
            textView.setText(b17.w0());
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = b17.f69300x731cac1b;
            int m76027x1cbb0791 = c19780xceb4c4dc != null ? c19780xceb4c4dc.m76027x1cbb0791() : 0;
            android.widget.TextView textView2 = this.f210238x;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authJob");
                throw null;
            }
            textView2.setVisibility(8);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1 m1Var = ya2.m1.f542044a;
            android.widget.ImageView imageView2 = this.f210237w;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authIcon");
                throw null;
            }
            zy2.tb.a(m1Var, imageView2, b17.f69300x731cac1b, 0, 4, null);
            if (m76027x1cbb0791 <= 0) {
                android.widget.TextView textView3 = this.f210238x;
                if (textView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authJob");
                    throw null;
                }
                textView3.setVisibility(8);
            } else if (m76027x1cbb0791 == 1) {
                android.widget.ImageView imageView3 = this.f210237w;
                if (imageView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authIcon");
                    throw null;
                }
                imageView3.setVisibility(0);
                android.widget.TextView textView4 = this.f210238x;
                if (textView4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authJob");
                    throw null;
                }
                textView4.setVisibility(0);
                android.widget.TextView textView5 = this.f210238x;
                if (textView5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authJob");
                    throw null;
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc2 = b17.f69300x731cac1b;
                if (c19780xceb4c4dc2 == null || (str = c19780xceb4c4dc2.m76029xad9975ba()) == null) {
                    str = "";
                }
                textView5.setText(str);
            } else if (m76027x1cbb0791 == 100) {
                android.widget.TextView textView6 = this.f210238x;
                if (textView6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authJob");
                    throw null;
                }
                textView6.setVisibility(8);
            }
            c7(b17.D0());
            android.widget.ImageView imageView4 = this.D;
            if (imageView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshIcon");
                throw null;
            }
            imageView4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fg(this, b17));
            android.view.View view = this.A;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("qrcodeContainer");
                throw null;
            }
            android.widget.TextView textView7 = this.f210236v;
            if (textView7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickTv");
                throw null;
            }
            java.lang.Object text = textView7.getText();
            view.setTag(com.p314xaae8f345.mm.R.id.e79, text != null ? text : "");
        }
        android.widget.TextView textView8 = this.f210239y;
        if (textView8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("saveToGalleryTv");
            throw null;
        }
        textView8.setVisibility(8);
        android.widget.TextView textView9 = this.f210239y;
        if (textView9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("saveToGalleryTv");
            throw null;
        }
        com.p314xaae8f345.mm.ui.dl.i(textView9.getPaint());
        android.widget.TextView textView10 = this.f210239y;
        if (textView10 != null) {
            textView10.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.gg(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("saveToGalleryTv");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        java.lang.String stringExtra = getIntent().getStringExtra("finder_username");
        java.lang.String str = stringExtra != null ? stringExtra : "";
        this.f210234t = str;
        if (str.length() == 0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            this.f210234t = xy2.c.e(mo55332x76847179);
        }
        mo43517x10010bd5();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.hg(this));
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderSelfQRCodeUI)).Rj(this, iy1.a.Finder);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(d92.r1.class);
    }
}
