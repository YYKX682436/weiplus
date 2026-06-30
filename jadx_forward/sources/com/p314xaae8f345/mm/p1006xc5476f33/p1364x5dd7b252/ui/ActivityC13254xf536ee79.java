package com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-eggspring_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity */
/* loaded from: classes4.dex */
public final class ActivityC13254xf536ee79 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f178970o = 0;

    /* renamed from: f, reason: collision with root package name */
    public f12.c0 f178973f;

    /* renamed from: g, reason: collision with root package name */
    public f12.o0 f178974g;

    /* renamed from: h, reason: collision with root package name */
    public long f178975h;

    /* renamed from: n, reason: collision with root package name */
    public boolean f178978n;

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f178971d = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f178972e = jz5.h.b(new f12.b0(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f178976i = jz5.h.b(new f12.r(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f178977m = jz5.h.b(new f12.f(this));

    public static final android.content.res.ColorStateList T6(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79, int i17, float f17) {
        activityC13254xf536ee79.getClass();
        float f18 = 255;
        return new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, android.util.StateSet.WILD_CARD}, new int[]{android.graphics.Color.argb((int) (f18 * java.lang.Math.min(f17 - 0.2f, 1.0f)), android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17)), android.graphics.Color.argb((int) (f18 * f17), android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17))});
    }

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79, java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        activityC13254xf536ee79.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringLuckyEggActivity", "redirect: target=" + obj);
        boolean z17 = false;
        if (obj instanceof uq.a) {
            android.content.Intent intent = new android.content.Intent();
            uq.a aVar = (uq.a) obj;
            java.lang.String ad_xml = aVar.f511661e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ad_xml, "ad_xml");
            if (r26.n0.L(ad_xml, "<adxml", 0, false, 6, null) >= 0) {
                str2 = aVar.f511661e;
            } else {
                str2 = "<adxml>" + aVar.f511661e + "</adxml>";
            }
            intent.putExtra("sns_landing_pages_xml", str2);
            intent.putExtra("sns_landig_pages_from_source", 14);
            intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
            j45.l.j(activityC13254xf536ee79.mo55332x76847179(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, null);
            return;
        }
        if (obj instanceof uq.t) {
            l81.b1 b1Var = new l81.b1();
            uq.t tVar = (uq.t) obj;
            java.lang.String app_user_name = tVar.f511724d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(app_user_name, "app_user_name");
            if (r26.i0.n(app_user_name, "@app", false)) {
                str = tVar.f511724d;
            } else {
                str = tVar.f511724d + "@app";
            }
            b1Var.f398545a = str;
            b1Var.f398555f = tVar.f511725e;
            b1Var.f398565k = 1189;
            b1Var.f398549c = 0;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b1Var);
            return;
        }
        if (obj instanceof uq.m) {
            java.lang.String str3 = ((uq.m) obj).f511691d;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", str3);
            intent2.putExtra("from_shortcut", true);
            intent2.putExtra("disable_minimize", true);
            if (activityC13254xf536ee79.X6().f340160q.mo3195x754a37bb() != null) {
                uq.n nVar = (uq.n) activityC13254xf536ee79.X6().f340160q.mo3195x754a37bb();
                if (nVar != null && nVar.f511692d == 4) {
                    intent2.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
                    intent2.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
                }
            }
            j45.l.n(activityC13254xf536ee79, "webview", ".ui.tools.WebViewUI", intent2, 3001);
            if (activityC13254xf536ee79.X6().f340160q.mo3195x754a37bb() != null) {
                uq.n nVar2 = (uq.n) activityC13254xf536ee79.X6().f340160q.mo3195x754a37bb();
                if (nVar2 != null && nVar2.f511692d == 4) {
                    z17 = true;
                }
                if (z17) {
                    activityC13254xf536ee79.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
                    return;
                }
                return;
            }
            return;
        }
        if (obj instanceof uq.d) {
            f12.j0 X6 = activityC13254xf536ee79.X6();
            uq.d dVar = (uq.d) obj;
            java.lang.String str4 = dVar.f511665d;
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String str5 = dVar.f511666e;
            java.lang.String str6 = str5 != null ? str5 : "";
            X6.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringLuckyEggViewModel", "accept coupon: appId=" + str4 + ", stockId=" + str6 + ", traceId=" + X6.f340153g);
            p3325xe03a0797.p3326xc267989b.l.d(X6.f340154h, null, null, new f12.d0(str4, str6, X6, null), 3, null);
            return;
        }
        boolean z18 = obj instanceof uq.c;
        ya2.e1 e1Var = ya2.e1.f542005a;
        jz5.g gVar = activityC13254xf536ee79.f178976i;
        if (z18) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("finder_username", ((uq.c) obj).f511664d);
            intent3.putExtra("key_session_id", java.lang.String.valueOf(b12.k.f98597e));
            intent3.putExtra("key_comment_scene", 32);
            if (((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue()) {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(3, 12, 32, intent3);
            } else {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(2, 12, 32, intent3);
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            e1Var.w(activityC13254xf536ee79, intent3);
            return;
        }
        if (!(obj instanceof uq.b)) {
            activityC13254xf536ee79.finish();
            return;
        }
        android.content.Intent intent4 = new android.content.Intent();
        intent4.putExtra("from_user", c01.z1.r());
        uq.b bVar = (uq.b) obj;
        intent4.putExtra("feed_encrypted_object_id", bVar.f511662d);
        intent4.putExtra("feed_object_nonceId", bVar.f511663e);
        intent4.putExtra("key_session_id", java.lang.String.valueOf(b12.k.f98597e));
        intent4.putExtra("key_comment_scene", 25);
        if (((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue()) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(3, 12, 25, intent4);
        } else {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(2, 12, 25, intent4);
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.b(e1Var, activityC13254xf536ee79, intent4, false, 4, null);
    }

    public static final int V6(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79, java.lang.String str, int i17) {
        activityC13254xf536ee79.getClass();
        if (str == null) {
            return b3.l.m9702x7444d5ad(activityC13254xf536ee79, i17);
        }
        try {
            return android.graphics.Color.parseColor(str);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SpringLuckyEggActivity", "Illegal color value: ".concat(str));
            return b3.l.m9702x7444d5ad(activityC13254xf536ee79, i17);
        }
    }

    public static final void W6(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79, java.lang.String str, boolean z17) {
        android.graphics.drawable.Drawable drawable;
        f12.c0 c0Var = activityC13254xf536ee79.f178973f;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = c0Var.f340120p.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringLuckyEggActivity", "params " + z17);
        if (z17) {
            layoutParams2.width = activityC13254xf536ee79.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561689px);
            layoutParams2.height = activityC13254xf536ee79.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561687pv);
            layoutParams2.topMargin = activityC13254xf536ee79.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561688pw);
            layoutParams2.gravity = 1;
            drawable = b3.l.m9707x4a96be14(activityC13254xf536ee79, com.p314xaae8f345.mm.R.C30861xcebc809e.cfr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable);
        } else {
            layoutParams2.width = activityC13254xf536ee79.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561691pz) - activityC13254xf536ee79.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ao7);
            layoutParams2.height = activityC13254xf536ee79.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561684pq);
            layoutParams2.topMargin = 0;
            layoutParams2.gravity = 17;
            drawable = null;
        }
        f12.c0 c0Var2 = activityC13254xf536ee79.f178973f;
        if (c0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = c0Var2.f340125u.getLayoutParams();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("params.width ");
        sb6.append(layoutParams2.width);
        sb6.append(", height ");
        sb6.append(layoutParams2.height);
        sb6.append(", video ");
        sb6.append(layoutParams3.width);
        sb6.append(", height ");
        sb6.append(layoutParams3.height);
        sb6.append(", scale ");
        f12.c0 c0Var3 = activityC13254xf536ee79.f178973f;
        if (c0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        sb6.append(c0Var3.f340125u);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringLuckyEggActivity", sb6.toString());
        f12.c0 c0Var4 = activityC13254xf536ee79.f178973f;
        if (c0Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var4.f340120p.requestLayout();
        o11.f fVar = new o11.f();
        fVar.f423611b = true;
        fVar.f423631v = true;
        fVar.f423615f = d30.a.f307656f + '/' + str.hashCode();
        fVar.f423625p = drawable;
        fVar.f423630u = (float) activityC13254xf536ee79.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561690py);
        o11.g a17 = fVar.a();
        n11.a b17 = n11.a.b();
        f12.c0 c0Var5 = activityC13254xf536ee79.f178973f;
        if (c0Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        b17.j(str, c0Var5.f340121q, a17, new f12.t(activityC13254xf536ee79));
    }

    public final f12.j0 X6() {
        return (f12.j0) this.f178972e.mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cvf;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f178975h = java.lang.System.currentTimeMillis();
        b12.k.f98599g = getIntent().getStringExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd);
        mo54450xbf7c1df6("");
        mo74406x9c8c0d33(new f12.u(this), com.p314xaae8f345.mm.R.C30861xcebc809e.buc);
        mo78530x8b45058f();
        getWindow().addFlags(128);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        mo64405x4dab7448(0);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.m7g);
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) findViewById(com.p314xaae8f345.mm.R.id.ilr);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.atw);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.atv);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.atu);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.avo);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.att);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ati);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.bbs);
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.b7w);
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe3662 = (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) findViewById(com.p314xaae8f345.mm.R.id.b8a);
        android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.b8b);
        android.widget.TextView textView5 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565090b80);
        android.widget.TextView textView6 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.b7z);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.b7v);
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe3663 = (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) findViewById(com.p314xaae8f345.mm.R.id.b7x);
        android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.b7y);
        android.view.ViewGroup viewGroup5 = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.cks);
        android.widget.TextView textView7 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jq_);
        android.view.ViewGroup viewGroup6 = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f567501jq0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.C13253x62ed4208 c13253x62ed4208 = (com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.C13253x62ed4208) findViewById(com.p314xaae8f345.mm.R.id.f565091b81);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.f565092b82);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16077xb54fe366);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb352);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16077xb54fe3662);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(button);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16077xb54fe3663);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c13253x62ed4208);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb3522);
        f12.c0 c0Var = new f12.c0(viewGroup, c16077xb54fe366, c22699x3dcdb352, textView, textView2, findViewById, textView3, imageView, textView4, c16077xb54fe3662, viewGroup2, viewGroup3, textView5, textView6, button, viewGroup4, c16077xb54fe3663, viewGroup5, textView7, viewGroup6, c13253x62ed4208, c22699x3dcdb3522);
        this.f178973f = c0Var;
        c0Var.f340105a.getViewTreeObserver().addOnGlobalLayoutListener(new f12.v(this));
        java.lang.String str = d30.a.f307657g;
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            f12.c0 c0Var2 = this.f178973f;
            if (c0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            c0Var2.f340106b.m64938x75cc54fa(str);
        } else {
            f12.c0 c0Var3 = this.f178973f;
            if (c0Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            c0Var3.f340106b.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c8e);
        }
        f12.c0 c0Var4 = this.f178973f;
        if (c0Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var4.f340119o.setOnClickListener(new f12.w(this));
        findViewById(com.p314xaae8f345.mm.R.id.atx).setOnClickListener(new f12.x(this));
        f12.c0 c0Var5 = this.f178973f;
        if (c0Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var5.f340111g.setOnClickListener(new f12.z(this));
        X6().f340157n.mo7806x9d92d11c(this, new f12.g(this));
        X6().f340155i.mo7806x9d92d11c(this, new f12.h(this));
        X6().f340160q.mo7806x9d92d11c(this, new f12.i(this));
        X6().f340161r.mo7806x9d92d11c(this, new f12.j(this));
        X6().f340156m.mo7806x9d92d11c(this, new f12.k(this));
        X6().f340162s.mo7806x9d92d11c(this, new f12.l(this));
        b12.k.f98593a.d(1, 0L);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        long j17;
        super.onDestroy();
        uq.n nVar = (uq.n) X6().f340160q.mo3195x754a37bb();
        long j18 = nVar != null ? nVar.f511706u : 0L;
        f12.o0 o0Var = this.f178974g;
        long j19 = o0Var != null ? o0Var.f340198p : 0L;
        int i17 = o0Var != null ? o0Var.f340197o : 0;
        if (o0Var != null) {
            long j27 = o0Var.f340195m;
            if (j27 > 0) {
                long j28 = o0Var.f340196n;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                j17 = j28 + (java.lang.System.currentTimeMillis() - j27);
            } else {
                j17 = o0Var.f340196n;
            }
        } else {
            j17 = 0;
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f178975h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringEggRpt", "18916 eggRpt: " + b12.k.f98600h + ", 16, sessionId " + b12.k.f98597e + ", materialId " + j18 + " , appId " + b12.k.f98599g + ", stayTime: " + currentTimeMillis);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18916, b12.k.f98597e, "", 16, "", java.lang.Long.valueOf(j19), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), "", b12.k.f98599g, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis), 0);
        f12.o0 o0Var2 = this.f178974g;
        if (o0Var2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "release");
            java.lang.String str = o0Var2.f340193h;
            if (str != null) {
                ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
                t21.o2.Di().g(str, null);
            }
            o0Var2.f340189d.d();
            o0Var2.f340195m = 0L;
        }
        f12.c0 c0Var = this.f178973f;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var.f340106b.y();
        p3325xe03a0797.p3326xc267989b.z0.e(this.f178971d, null, 1, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringLuckyEggActivity", "onPause");
        f12.o0 o0Var = this.f178974g;
        if (o0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "pause");
            o0Var.f340189d.e();
            long j17 = o0Var.f340196n;
            long j18 = o0Var.f340195m;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            o0Var.f340196n = j17 + (java.lang.System.currentTimeMillis() - j18);
            o0Var.f340195m = 0L;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringLuckyEggActivity", "onResume " + this.f178978n);
        if (this.f178978n) {
            f12.o0 o0Var = this.f178974g;
            if (o0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "resume");
                o0Var.f340197o--;
                o0Var.f340189d.g();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                o0Var.f340195m = java.lang.System.currentTimeMillis();
                return;
            }
            return;
        }
        f12.o0 o0Var2 = this.f178974g;
        if (o0Var2 != null) {
            o0Var2.h();
        }
        f12.o0 o0Var3 = this.f178974g;
        if (o0Var3 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoController", "resume");
            o0Var3.f340197o--;
            o0Var3.f340189d.g();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            o0Var3.f340195m = java.lang.System.currentTimeMillis();
        }
    }
}
