package com.tencent.mm.plugin.card.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class CardGiftAcceptUI extends com.tencent.mm.ui.MMActivity implements android.view.View.OnClickListener, com.tencent.mm.modelbase.u0 {
    public xt1.y A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f94783d;

    /* renamed from: e, reason: collision with root package name */
    public int f94784e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f94785f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f94786g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f94787h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f94788i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f94789m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f94790n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f94791o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f94792p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f94793q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f94794r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f94795s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.LinearLayout f94796t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f94797u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f94798v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f94799w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.RelativeLayout f94800x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f94801y = null;

    /* renamed from: z, reason: collision with root package name */
    public xt1.n0 f94802z;

    public final void T6() {
        gm0.j1.n().f273288b.g(new xt1.y(this.f94784e, this.f94783d, this.f94786g, java.lang.Boolean.FALSE));
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f94801y;
        if (u3Var != null) {
            u3Var.show();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488298pg;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f94787h = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.b_1);
        this.f94788i = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.b__);
        this.f94789m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.b_b);
        this.f94790n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.b_c);
        this.f94791o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.b_8);
        this.f94792p = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f485426hn1);
        this.f94793q = (android.widget.Button) findViewById(com.tencent.mm.R.id.b_e);
        this.f94795s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.b_9);
        this.f94797u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.b_a);
        this.f94800x = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.b_d);
        this.f94798v = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.b_7);
        this.f94799w = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486787mh3);
        this.f94794r = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.kn8);
        this.f94796t = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f486788mh4);
        this.f94800x.setOnClickListener(this);
        this.f94787h.setOnClickListener(this);
        this.f94788i.setOnClickListener(this);
        this.f94794r.setOnClickListener(this);
        this.f94796t.setOnClickListener(this);
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f94801y = db5.e1.Q(getContext(), null, getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.card.ui.t0(this));
        gm0.j1.n().f273288b.g(new xt1.n0(this.f94784e, this.f94783d, this.f94786g));
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f94801y;
        if (u3Var != null) {
            u3Var.show();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.tencent.mm.R.id.b_e || view.getId() == com.tencent.mm.R.id.kn8) {
            if (this.f94793q.getVisibility() == 0) {
                int d17 = com.tencent.mm.ui.bk.d(com.tencent.mm.sdk.platformtools.t8.f(this.f94802z.f456539p, getResources().getColor(com.tencent.mm.R.color.f478789h9)));
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setColor(d17);
                gradientDrawable.setStroke(2, d17);
                gradientDrawable.setCornerRadius(6.0f);
                this.f94793q.setBackground(gradientDrawable);
                this.f94793q.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            }
            T6();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94785f)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13866, 2, this.f94783d, kk.v.a(this.f94784e), this.f94785f);
            }
        } else if (view.getId() == com.tencent.mm.R.id.b_d) {
            finish();
        } else if (view.getId() == com.tencent.mm.R.id.b_1) {
            finish();
        } else if (view.getId() == com.tencent.mm.R.id.f486788mh4) {
            gm0.j1.n().f273288b.g(new xt1.y(this.f94784e, this.f94783d, this.f94786g, java.lang.Boolean.TRUE));
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f94801y;
            if (u3Var != null) {
                u3Var.show();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f94783d = getIntent().getStringExtra("key_order_id");
        this.f94784e = getIntent().getIntExtra("key_biz_uin", -1);
        this.f94785f = getIntent().getStringExtra("key_from_user_name");
        this.f94786g = getIntent().getStringExtra("key_chatroom_name");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftAcceptUI", "onCreate, orderId:%s, bizUin:%s, fromUserName:%s", this.f94783d, java.lang.Integer.valueOf(this.f94784e), this.f94785f);
        if (this.f94784e == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftAcceptUI", "bizUin is -1, fail!");
            lu1.r.e(this, "", true);
        } else {
            if (this.f94783d == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftAcceptUI", "orderId is null, fail");
                lu1.r.e(this, "", true);
                return;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94785f)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13866, 1, this.f94783d, kk.v.a(this.f94784e), this.f94785f);
            }
            initView();
            gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.ad.jsapi.c.CTRL_INDEX, this);
            gm0.j1.n().f273288b.a(1136, this);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.ad.jsapi.c.CTRL_INDEX, this);
        gm0.j1.n().f273288b.q(1136, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftAcceptUI", "onKeyDown finishUI");
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f94801y;
            if (u3Var != null && u3Var.isShowing()) {
                this.f94801y.dismiss();
            }
            finish();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f94801y;
            if (u3Var != null && u3Var.isShowing()) {
                this.f94801y.dismiss();
            }
            if (m1Var instanceof xt1.n0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftAcceptUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                lu1.r.e(this, str, true);
                return;
            } else {
                if (m1Var instanceof xt1.y) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftAcceptUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                    lu1.r.e(this, str, true);
                    return;
                }
                return;
            }
        }
        if (!(m1Var instanceof xt1.n0)) {
            if (m1Var instanceof xt1.y) {
                com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f94801y;
                if (u3Var2 != null && u3Var2.isShowing()) {
                    this.f94801y.dismiss();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftAcceptUI", "accept gift card is success!");
                this.A = (xt1.y) m1Var;
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardGiftReceiveUI.class);
                intent.putExtra("key_order_id", this.f94783d);
                intent.putExtra("key_biz_uin", this.f94784e);
                intent.putExtra("key_gift_into", this.A.f456607f);
                intent.putExtra("key_from_group_chat_room", !com.tencent.mm.sdk.platformtools.t8.K0(this.f94786g));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
                return;
            }
            return;
        }
        xt1.n0 n0Var = (xt1.n0) m1Var;
        this.f94802z = n0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftAcceptUI", "ignore:%b", java.lang.Boolean.valueOf(n0Var.f456537n));
        if (this.f94802z.f456537n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftAcceptUI", "NetScenePreAcceptGiftCard ignore is true~so ignore it");
            T6();
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var3 = this.f94801y;
        if (u3Var3 != null && u3Var3.isShowing()) {
            this.f94801y.dismiss();
        }
        xt1.n0 n0Var2 = this.f94802z;
        if (n0Var2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftAcceptUI", "preAcceptGiftCard is null");
        } else {
            this.f94791o.setText(n0Var2.f456535i);
            android.widget.TextView textView = this.f94790n;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = this.f94802z.f456532f;
            float textSize = this.f94790n.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str2, textSize));
            xt1.n0 n0Var3 = this.f94802z;
            int i19 = n0Var3.f456534h;
            if (i19 == 0) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(n0Var3.f456536m)) {
                    this.f94793q.setVisibility(0);
                    this.f94793q.setText(getResources().getString(com.tencent.mm.R.string.ash));
                    this.f94793q.setOnClickListener(this);
                } else {
                    this.f94793q.setVisibility(0);
                    this.f94793q.setText(this.f94802z.f456536m);
                    this.f94793q.setOnClickListener(this);
                }
            } else if (i19 == 1) {
                this.f94793q.setVisibility(8);
                this.f94793q.setOnClickListener(null);
            } else if (i19 != 2) {
                this.f94793q.setVisibility(8);
                this.f94793q.setOnClickListener(null);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(n0Var3.f456536m)) {
                this.f94793q.setVisibility(8);
                this.f94793q.setOnClickListener(null);
            } else {
                this.f94793q.setVisibility(0);
                this.f94793q.setBackgroundDrawable(null);
                this.f94793q.setText(this.f94802z.f456536m);
                this.f94793q.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
                this.f94793q.setTextSize(1, 17.0f);
                this.f94793q.setOnClickListener(null);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94802z.f456540q)) {
                this.f94793q.setVisibility(8);
                this.f94796t.setVisibility(8);
                this.f94794r.setVisibility(0);
                this.f94795s.setText(this.f94802z.f456540q);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94802z.f456541r)) {
                this.f94794r.setVisibility(8);
                this.f94796t.setVisibility(0);
                this.f94797u.setText(this.f94802z.f456541r);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94802z.f456533g)) {
                int b17 = i65.a.b(this, 15);
                o11.f fVar = new o11.f();
                fVar.f342083g = lp0.b.D();
                fVar.f342082f = xt1.q.m(this.f94802z.f456533g);
                fVar.f342078b = true;
                fVar.f342096t = true;
                fVar.f342097u = b17;
                fVar.f342077a = true;
                fVar.f342091o = com.tencent.mm.R.drawable.cbt;
                n11.a.b().h(this.f94802z.f456533g, this.f94789m, fVar.a());
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94802z.f456538o)) {
                n11.a.b().g(this.f94802z.f456538o, this.f94792p);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94802z.f456539p) && this.f94793q.getVisibility() == 0) {
                int d17 = com.tencent.mm.ui.bk.d(com.tencent.mm.sdk.platformtools.t8.f(this.f94802z.f456539p, getResources().getColor(com.tencent.mm.R.color.f478789h9)));
                int color = getResources().getColor(com.tencent.mm.R.color.f478494f);
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setColor(color);
                gradientDrawable.setStroke(2, d17);
                gradientDrawable.setCornerRadius(6.0f);
                this.f94793q.setBackground(gradientDrawable);
                this.f94793q.setTextColor(d17);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94802z.f456539p) && this.f94795s.getVisibility() == 0) {
                this.f94795s.setTextColor(com.tencent.mm.ui.bk.d(com.tencent.mm.sdk.platformtools.t8.f(this.f94802z.f456539p, getResources().getColor(com.tencent.mm.R.color.f478789h9))));
                int color2 = getResources().getColor(com.tencent.mm.R.color.f478789h9);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94802z.f456539p)) {
                    color2 = com.tencent.mm.sdk.platformtools.t8.f(this.f94802z.f456539p, color2);
                }
                int d18 = com.tencent.mm.ui.bk.d(color2);
                android.widget.ImageView imageView = this.f94798v;
                android.graphics.drawable.Drawable drawable = imageView.getDrawable();
                f3.b.h(drawable, android.content.res.ColorStateList.valueOf(d18));
                imageView.setImageDrawable(drawable);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94802z.f456539p) && this.f94797u.getVisibility() == 0) {
                this.f94797u.setTextColor(com.tencent.mm.ui.bk.d(com.tencent.mm.sdk.platformtools.t8.f(this.f94802z.f456539p, getResources().getColor(com.tencent.mm.R.color.f478789h9))));
                int color3 = getResources().getColor(com.tencent.mm.R.color.f478789h9);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94802z.f456539p)) {
                    color3 = com.tencent.mm.sdk.platformtools.t8.f(this.f94802z.f456539p, color3);
                }
                int d19 = com.tencent.mm.ui.bk.d(color3);
                android.widget.ImageView imageView2 = this.f94799w;
                android.graphics.drawable.Drawable drawable2 = imageView2.getDrawable();
                f3.b.h(drawable2, android.content.res.ColorStateList.valueOf(d19));
                imageView2.setImageDrawable(drawable2);
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f94793q.getLayoutParams();
                marginLayoutParams.topMargin -= i65.a.b(this, 20);
                this.f94793q.setLayoutParams(marginLayoutParams);
            }
            if (this.f94793q.getVisibility() == 0 && this.f94796t.getVisibility() == 8) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) this.f94793q.getLayoutParams();
                marginLayoutParams2.bottomMargin += i65.a.b(this, 28);
                this.f94793q.setLayoutParams(marginLayoutParams2);
            }
        }
        android.widget.RelativeLayout relativeLayout = this.f94788i;
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 0.96f, 0.0f, 0.96f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setInterpolator(new android.view.animation.OvershootInterpolator());
        scaleAnimation.setFillAfter(true);
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(0.96f, 1.0f, 0.96f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(100L);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation.setAnimationListener(new lu1.f0(relativeLayout, scaleAnimation2));
        if (relativeLayout != null) {
            relativeLayout.startAnimation(scaleAnimation);
        }
        com.tencent.mm.ui.bk.p0(this, getResources().getColor(com.tencent.mm.R.color.f478493e));
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(contentView, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
