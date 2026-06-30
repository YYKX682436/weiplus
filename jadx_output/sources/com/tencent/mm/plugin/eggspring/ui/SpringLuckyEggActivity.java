package com.tencent.mm.plugin.eggspring.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-eggspring_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SpringLuckyEggActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f97437o = 0;

    /* renamed from: f, reason: collision with root package name */
    public f12.c0 f97440f;

    /* renamed from: g, reason: collision with root package name */
    public f12.o0 f97441g;

    /* renamed from: h, reason: collision with root package name */
    public long f97442h;

    /* renamed from: n, reason: collision with root package name */
    public boolean f97445n;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f97438d = kotlinx.coroutines.z0.b();

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f97439e = jz5.h.b(new f12.b0(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f97443i = jz5.h.b(new f12.r(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f97444m = jz5.h.b(new f12.f(this));

    public static final android.content.res.ColorStateList T6(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity, int i17, float f17) {
        springLuckyEggActivity.getClass();
        float f18 = 255;
        return new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, android.util.StateSet.WILD_CARD}, new int[]{android.graphics.Color.argb((int) (f18 * java.lang.Math.min(f17 - 0.2f, 1.0f)), android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17)), android.graphics.Color.argb((int) (f18 * f17), android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17))});
    }

    public static final void U6(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity, java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        springLuckyEggActivity.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringLuckyEggActivity", "redirect: target=" + obj);
        boolean z17 = false;
        if (obj instanceof uq.a) {
            android.content.Intent intent = new android.content.Intent();
            uq.a aVar = (uq.a) obj;
            java.lang.String ad_xml = aVar.f430128e;
            kotlin.jvm.internal.o.f(ad_xml, "ad_xml");
            if (r26.n0.L(ad_xml, "<adxml", 0, false, 6, null) >= 0) {
                str2 = aVar.f430128e;
            } else {
                str2 = "<adxml>" + aVar.f430128e + "</adxml>";
            }
            intent.putExtra("sns_landing_pages_xml", str2);
            intent.putExtra("sns_landig_pages_from_source", 14);
            intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
            j45.l.j(springLuckyEggActivity.getContext(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, null);
            return;
        }
        if (obj instanceof uq.t) {
            l81.b1 b1Var = new l81.b1();
            uq.t tVar = (uq.t) obj;
            java.lang.String app_user_name = tVar.f430191d;
            kotlin.jvm.internal.o.f(app_user_name, "app_user_name");
            if (r26.i0.n(app_user_name, "@app", false)) {
                str = tVar.f430191d;
            } else {
                str = tVar.f430191d + "@app";
            }
            b1Var.f317012a = str;
            b1Var.f317022f = tVar.f430192e;
            b1Var.f317032k = 1189;
            b1Var.f317016c = 0;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(com.tencent.mm.sdk.platformtools.x2.f193071a, b1Var);
            return;
        }
        if (obj instanceof uq.m) {
            java.lang.String str3 = ((uq.m) obj).f430158d;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", str3);
            intent2.putExtra("from_shortcut", true);
            intent2.putExtra("disable_minimize", true);
            if (springLuckyEggActivity.X6().f258627q.getValue() != null) {
                uq.n nVar = (uq.n) springLuckyEggActivity.X6().f258627q.getValue();
                if (nVar != null && nVar.f430159d == 4) {
                    intent2.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477728p);
                    intent2.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477855dd);
                }
            }
            j45.l.n(springLuckyEggActivity, "webview", ".ui.tools.WebViewUI", intent2, 3001);
            if (springLuckyEggActivity.X6().f258627q.getValue() != null) {
                uq.n nVar2 = (uq.n) springLuckyEggActivity.X6().f258627q.getValue();
                if (nVar2 != null && nVar2.f430159d == 4) {
                    z17 = true;
                }
                if (z17) {
                    springLuckyEggActivity.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
                    return;
                }
                return;
            }
            return;
        }
        if (obj instanceof uq.d) {
            f12.j0 X6 = springLuckyEggActivity.X6();
            uq.d dVar = (uq.d) obj;
            java.lang.String str4 = dVar.f430132d;
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String str5 = dVar.f430133e;
            java.lang.String str6 = str5 != null ? str5 : "";
            X6.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.SpringLuckyEggViewModel", "accept coupon: appId=" + str4 + ", stockId=" + str6 + ", traceId=" + X6.f258620g);
            kotlinx.coroutines.l.d(X6.f258621h, null, null, new f12.d0(str4, str6, X6, null), 3, null);
            return;
        }
        boolean z18 = obj instanceof uq.c;
        ya2.e1 e1Var = ya2.e1.f460472a;
        jz5.g gVar = springLuckyEggActivity.f97443i;
        if (z18) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("finder_username", ((uq.c) obj).f430131d);
            intent3.putExtra("key_session_id", java.lang.String.valueOf(b12.k.f17064e));
            intent3.putExtra("key_comment_scene", 32);
            if (((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue()) {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(3, 12, 32, intent3);
            } else {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(2, 12, 32, intent3);
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            e1Var.w(springLuckyEggActivity, intent3);
            return;
        }
        if (!(obj instanceof uq.b)) {
            springLuckyEggActivity.finish();
            return;
        }
        android.content.Intent intent4 = new android.content.Intent();
        intent4.putExtra("from_user", c01.z1.r());
        uq.b bVar = (uq.b) obj;
        intent4.putExtra("feed_encrypted_object_id", bVar.f430129d);
        intent4.putExtra("feed_object_nonceId", bVar.f430130e);
        intent4.putExtra("key_session_id", java.lang.String.valueOf(b12.k.f17064e));
        intent4.putExtra("key_comment_scene", 25);
        if (((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue()) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(3, 12, 25, intent4);
        } else {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(2, 12, 25, intent4);
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.b(e1Var, springLuckyEggActivity, intent4, false, 4, null);
    }

    public static final int V6(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity, java.lang.String str, int i17) {
        springLuckyEggActivity.getClass();
        if (str == null) {
            return b3.l.getColor(springLuckyEggActivity, i17);
        }
        try {
            return android.graphics.Color.parseColor(str);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SpringLuckyEggActivity", "Illegal color value: ".concat(str));
            return b3.l.getColor(springLuckyEggActivity, i17);
        }
    }

    public static final void W6(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity, java.lang.String str, boolean z17) {
        android.graphics.drawable.Drawable drawable;
        f12.c0 c0Var = springLuckyEggActivity.f97440f;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = c0Var.f258587p.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringLuckyEggActivity", "params " + z17);
        if (z17) {
            layoutParams2.width = springLuckyEggActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480156px);
            layoutParams2.height = springLuckyEggActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480154pv);
            layoutParams2.topMargin = springLuckyEggActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480155pw);
            layoutParams2.gravity = 1;
            drawable = b3.l.getDrawable(springLuckyEggActivity, com.tencent.mm.R.drawable.cfr);
            kotlin.jvm.internal.o.d(drawable);
        } else {
            layoutParams2.width = springLuckyEggActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480158pz) - springLuckyEggActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ao7);
            layoutParams2.height = springLuckyEggActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480151pq);
            layoutParams2.topMargin = 0;
            layoutParams2.gravity = 17;
            drawable = null;
        }
        f12.c0 c0Var2 = springLuckyEggActivity.f97440f;
        if (c0Var2 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = c0Var2.f258592u.getLayoutParams();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("params.width ");
        sb6.append(layoutParams2.width);
        sb6.append(", height ");
        sb6.append(layoutParams2.height);
        sb6.append(", video ");
        sb6.append(layoutParams3.width);
        sb6.append(", height ");
        sb6.append(layoutParams3.height);
        sb6.append(", scale ");
        f12.c0 c0Var3 = springLuckyEggActivity.f97440f;
        if (c0Var3 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        sb6.append(c0Var3.f258592u);
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringLuckyEggActivity", sb6.toString());
        f12.c0 c0Var4 = springLuckyEggActivity.f97440f;
        if (c0Var4 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var4.f258587p.requestLayout();
        o11.f fVar = new o11.f();
        fVar.f342078b = true;
        fVar.f342098v = true;
        fVar.f342082f = d30.a.f226123f + '/' + str.hashCode();
        fVar.f342092p = drawable;
        fVar.f342097u = (float) springLuckyEggActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480157py);
        o11.g a17 = fVar.a();
        n11.a b17 = n11.a.b();
        f12.c0 c0Var5 = springLuckyEggActivity.f97440f;
        if (c0Var5 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        b17.j(str, c0Var5.f258588q, a17, new f12.t(springLuckyEggActivity));
    }

    public final f12.j0 X6() {
        return (f12.j0) this.f97439e.getValue();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cvf;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f97442h = java.lang.System.currentTimeMillis();
        b12.k.f17066g = getIntent().getStringExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
        setMMTitle("");
        setBackBtn(new f12.u(this), com.tencent.mm.R.drawable.buc);
        hideActionbarLine();
        getWindow().addFlags(128);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        setActionbarColor(0);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.m7g);
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = (com.tencent.mm.plugin.gif.MMAnimateView) findViewById(com.tencent.mm.R.id.ilr);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.atw);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.atv);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.atu);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.avo);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.att);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ati);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.bbs);
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.b7w);
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView2 = (com.tencent.mm.plugin.gif.MMAnimateView) findViewById(com.tencent.mm.R.id.b8a);
        android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.b8b);
        android.widget.TextView textView5 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483557b80);
        android.widget.TextView textView6 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.b7z);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.b7v);
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView3 = (com.tencent.mm.plugin.gif.MMAnimateView) findViewById(com.tencent.mm.R.id.b7x);
        android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.b7y);
        android.view.ViewGroup viewGroup5 = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.cks);
        android.widget.TextView textView7 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jq_);
        android.view.ViewGroup viewGroup6 = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f485968jq0);
        com.tencent.mm.plugin.eggspring.ui.SpringEggVideoView springEggVideoView = (com.tencent.mm.plugin.eggspring.ui.SpringEggVideoView) findViewById(com.tencent.mm.R.id.f483558b81);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483559b82);
        kotlin.jvm.internal.o.d(viewGroup);
        kotlin.jvm.internal.o.d(mMAnimateView);
        kotlin.jvm.internal.o.d(weImageView);
        kotlin.jvm.internal.o.d(textView);
        kotlin.jvm.internal.o.d(textView2);
        kotlin.jvm.internal.o.d(findViewById);
        kotlin.jvm.internal.o.d(textView3);
        kotlin.jvm.internal.o.d(imageView);
        kotlin.jvm.internal.o.d(textView4);
        kotlin.jvm.internal.o.d(mMAnimateView2);
        kotlin.jvm.internal.o.d(viewGroup2);
        kotlin.jvm.internal.o.d(viewGroup3);
        kotlin.jvm.internal.o.d(textView5);
        kotlin.jvm.internal.o.d(textView6);
        kotlin.jvm.internal.o.d(button);
        kotlin.jvm.internal.o.d(viewGroup4);
        kotlin.jvm.internal.o.d(mMAnimateView3);
        kotlin.jvm.internal.o.d(viewGroup5);
        kotlin.jvm.internal.o.d(textView7);
        kotlin.jvm.internal.o.d(viewGroup6);
        kotlin.jvm.internal.o.d(springEggVideoView);
        kotlin.jvm.internal.o.d(weImageView2);
        f12.c0 c0Var = new f12.c0(viewGroup, mMAnimateView, weImageView, textView, textView2, findViewById, textView3, imageView, textView4, mMAnimateView2, viewGroup2, viewGroup3, textView5, textView6, button, viewGroup4, mMAnimateView3, viewGroup5, textView7, viewGroup6, springEggVideoView, weImageView2);
        this.f97440f = c0Var;
        c0Var.f258572a.getViewTreeObserver().addOnGlobalLayoutListener(new f12.v(this));
        java.lang.String str = d30.a.f226124g;
        if (com.tencent.mm.vfs.w6.j(str)) {
            f12.c0 c0Var2 = this.f97440f;
            if (c0Var2 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            c0Var2.f258573b.setImageFilePath(str);
        } else {
            f12.c0 c0Var3 = this.f97440f;
            if (c0Var3 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            c0Var3.f258573b.setImageResource(com.tencent.mm.R.drawable.c8e);
        }
        f12.c0 c0Var4 = this.f97440f;
        if (c0Var4 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var4.f258586o.setOnClickListener(new f12.w(this));
        findViewById(com.tencent.mm.R.id.atx).setOnClickListener(new f12.x(this));
        f12.c0 c0Var5 = this.f97440f;
        if (c0Var5 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var5.f258578g.setOnClickListener(new f12.z(this));
        X6().f258624n.observe(this, new f12.g(this));
        X6().f258622i.observe(this, new f12.h(this));
        X6().f258627q.observe(this, new f12.i(this));
        X6().f258628r.observe(this, new f12.j(this));
        X6().f258623m.observe(this, new f12.k(this));
        X6().f258629s.observe(this, new f12.l(this));
        b12.k.f17060a.d(1, 0L);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        long j17;
        super.onDestroy();
        uq.n nVar = (uq.n) X6().f258627q.getValue();
        long j18 = nVar != null ? nVar.f430173u : 0L;
        f12.o0 o0Var = this.f97441g;
        long j19 = o0Var != null ? o0Var.f258665p : 0L;
        int i17 = o0Var != null ? o0Var.f258664o : 0;
        if (o0Var != null) {
            long j27 = o0Var.f258662m;
            if (j27 > 0) {
                long j28 = o0Var.f258663n;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                j17 = j28 + (java.lang.System.currentTimeMillis() - j27);
            } else {
                j17 = o0Var.f258663n;
            }
        } else {
            j17 = 0;
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f97442h;
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringEggRpt", "18916 eggRpt: " + b12.k.f17067h + ", 16, sessionId " + b12.k.f17064e + ", materialId " + j18 + " , appId " + b12.k.f17066g + ", stayTime: " + currentTimeMillis);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18916, b12.k.f17064e, "", 16, "", java.lang.Long.valueOf(j19), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), "", b12.k.f17066g, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis), 0);
        f12.o0 o0Var2 = this.f97441g;
        if (o0Var2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "release");
            java.lang.String str = o0Var2.f258660h;
            if (str != null) {
                ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
                t21.o2.Di().g(str, null);
            }
            o0Var2.f258656d.d();
            o0Var2.f258662m = 0L;
        }
        f12.c0 c0Var = this.f97440f;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var.f258573b.y();
        kotlinx.coroutines.z0.e(this.f97438d, null, 1, null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringLuckyEggActivity", "onPause");
        f12.o0 o0Var = this.f97441g;
        if (o0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "pause");
            o0Var.f258656d.e();
            long j17 = o0Var.f258663n;
            long j18 = o0Var.f258662m;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            o0Var.f258663n = j17 + (java.lang.System.currentTimeMillis() - j18);
            o0Var.f258662m = 0L;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringLuckyEggActivity", "onResume " + this.f97445n);
        if (this.f97445n) {
            f12.o0 o0Var = this.f97441g;
            if (o0Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "resume");
                o0Var.f258664o--;
                o0Var.f258656d.g();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                o0Var.f258662m = java.lang.System.currentTimeMillis();
                return;
            }
            return;
        }
        f12.o0 o0Var2 = this.f97441g;
        if (o0Var2 != null) {
            o0Var2.h();
        }
        f12.o0 o0Var3 = this.f97441g;
        if (o0Var3 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "resume");
            o0Var3.f258664o--;
            o0Var3.f258656d.g();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            o0Var3.f258662m = java.lang.System.currentTimeMillis();
        }
    }
}
