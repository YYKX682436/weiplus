package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44;

/* renamed from: com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog */
/* loaded from: classes8.dex */
public class C18765xae0673c5 extends android.widget.RelativeLayout implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f256788t = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f256789d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f256790e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f256791f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18056x3bc9e3cf f256792g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f256793h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f256794i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f256795m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f256796n;

    /* renamed from: o, reason: collision with root package name */
    public long f256797o;

    /* renamed from: p, reason: collision with root package name */
    public sm4.f f256798p;

    /* renamed from: q, reason: collision with root package name */
    public in4.a0 f256799q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f256800r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View.OnClickListener f256801s;

    public C18765xae0673c5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f256795m = null;
        this.f256796n = false;
        this.f256797o = 0L;
        this.f256801s = new in4.z(this);
        c();
    }

    public void a() {
        this.f256792g.setText("");
        setVisibility(8);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f256789d.getLayoutParams();
        layoutParams.bottomMargin = 0;
        this.f256789d.setLayoutParams(layoutParams);
        this.f256794i.mo48674x36654fab();
        this.f256796n = false;
        in4.a0 a0Var = this.f256799q;
        if (a0Var != null) {
            a0Var.mo131896xb349b3ab();
        }
    }

    public void b() {
        if (this.f256792g.getText().toString().length() > 0) {
            db5.e1.l(this.f256794i, com.p314xaae8f345.mm.R.C30867xcad56011.k0g, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f572141zu, com.p314xaae8f345.mm.R.C30867xcad56011.f572036wx, true, new in4.x(this), new in4.y(this), com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp);
        } else {
            a();
        }
    }

    public final void c() {
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.d1l, this);
        this.f256789d = findViewById(com.p314xaae8f345.mm.R.id.c6u);
        this.f256792g = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18056x3bc9e3cf) findViewById(com.p314xaae8f345.mm.R.id.c86);
        this.f256790e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565298c00);
        this.f256791f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565299c01);
    }

    public void d(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f256794i = abstractActivityC21394xb3d2c0cf;
        this.f256793h = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(abstractActivityC21394xb3d2c0cf);
        setOnClickListener(this.f256801s);
        findViewById(com.p314xaae8f345.mm.R.id.b5k).setOnClickListener(new in4.s(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567894l04);
        this.f256800r = textView;
        textView.setOnClickListener(new in4.t(this, abstractActivityC21394xb3d2c0cf));
        f();
        g();
        this.f256792g.addTextChangedListener(new in4.u(this));
        post(new in4.v(this));
    }

    public void e(sm4.f fVar, in4.a0 a0Var, int i17, int i18) {
        this.f256796n = true;
        this.f256798p = fVar;
        setVisibility(0);
        this.f256792g.requestFocus();
        this.f256794i.mo26063x7b383410();
        this.f256799q = a0Var;
        r45.kn6 kn6Var = (r45.kn6) fVar.f491471e.f152243a.f152217a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17080, 7, 2, "action=14&channelId=" + i17 + "&mpScene=0&kykScene=" + kn6Var.f460403o + "&kykSubScene=0&itemType=" + i18 + "&searchId=" + kn6Var.f460402n + "&docId=" + kn6Var.f460396e + "&byPass=" + kn6Var.f460405q);
    }

    public final void f() {
        int length = this.f256792g.getText().toString().length();
        if (length < 180) {
            this.f256790e.setVisibility(8);
            this.f256791f.setVisibility(8);
            return;
        }
        this.f256790e.setVisibility(0);
        this.f256791f.setVisibility(0);
        int color = length <= 200 ? getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a96) : getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y);
        this.f256790e.setText("" + length);
        this.f256790e.setTextColor(color);
    }

    public final void g() {
        int length = this.f256792g.getText().toString().length();
        int length2 = this.f256792g.getText().toString().trim().length();
        if (length > 200 || length <= 0 || length2 <= 0) {
            this.f256800r.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b7u);
        } else {
            this.f256800r.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b7t);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f256795m;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f256795m = null;
        }
        if (!(i17 == 0 && i18 == 0)) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f256794i;
            db5.e1.s(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571924to), "");
            return;
        }
        a();
        in4.a0 a0Var = this.f256799q;
        if (a0Var != null) {
            a0Var.a();
        }
        if (m1Var instanceof sm4.f) {
            sm4.f fVar = (sm4.f) m1Var;
            cl0.g gVar = new cl0.g();
            try {
                com.p314xaae8f345.mm.p944x882e457a.o oVar = fVar.f491471e;
                com.p314xaae8f345.mm.p944x882e457a.o oVar2 = fVar.f491471e;
                r45.kn6 kn6Var = (r45.kn6) oVar.f152243a.f152217a;
                gVar.h("content", kn6Var != null ? kn6Var.f460397f : "");
                gVar.h(dm.i4.f66865x76d1ec5a, ((r45.ln6) oVar2.f152244b.f152233a).f461200d);
                r45.kn6 kn6Var2 = (r45.kn6) oVar2.f152243a.f152217a;
                gVar.h("docId", kn6Var2 != null ? kn6Var2.f460396e : "");
                gVar.h("opType", "REPLY_ARTICLE_BY_ME");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5636xb8854922 c5636xb8854922 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5636xb8854922();
                am.gh ghVar = c5636xb8854922.f135964g;
                ghVar.f88295a = gVar.toString();
                ghVar.f88296b = "";
                c5636xb8854922.e();
            } catch (cl0.f unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStoryCommentFloatDialog", "notify tl failed");
            }
        }
        db5.t7.m123882x26a183b(this.f256794i, com.p314xaae8f345.mm.R.C30867xcad56011.k0i, 0).show();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStoryCommentFloatDialog", "onKeyboardHeightChanged in pixels: " + i17);
        if (this.f256796n) {
            android.view.View view = this.f256789d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog", "show", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog", "show", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (((android.widget.RelativeLayout.LayoutParams) this.f256789d.getLayoutParams()).bottomMargin != i17) {
                in4.w wVar = new in4.w(this, i17);
                if (i17 != 0) {
                    wVar.setDuration(200L);
                } else {
                    wVar.setDuration(300L);
                }
                this.f256789d.startAnimation(wVar);
            }
            this.f256792g.requestFocus();
            setVisibility(0);
        }
    }

    public C18765xae0673c5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f256795m = null;
        this.f256796n = false;
        this.f256797o = 0L;
        this.f256801s = new in4.z(this);
        c();
    }
}
