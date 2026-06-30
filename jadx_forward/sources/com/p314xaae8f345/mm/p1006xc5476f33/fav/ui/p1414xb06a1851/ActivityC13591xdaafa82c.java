package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI */
/* loaded from: classes12.dex */
public class ActivityC13591xdaafa82c extends com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43 implements o72.x3 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f182157w = 0;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f182158m;

    /* renamed from: o, reason: collision with root package name */
    public o72.r2 f182160o;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Bitmap f182162q;

    /* renamed from: s, reason: collision with root package name */
    public kd0.p2 f182164s;

    /* renamed from: n, reason: collision with root package name */
    public int f182159n = 0;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f182161p = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public boolean f182163r = true;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnClickListener f182165t = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.v0(this);

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f182166u = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.w0(this);

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f182167v = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.15
        {
            this.f39173x3fe91575 = 812146647;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be72 = c5886xd11a0be7;
            java.lang.String str = c5886xd11a0be72.f136194g.f87901a;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c.this;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var = null;
            for (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var2 : activityC13591xdaafa82c.f182161p.values()) {
                if (str.equals(o72.x1.x(a1Var2.f182216a))) {
                    a1Var = a1Var2;
                }
            }
            if (a1Var == null) {
                return true;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6 s6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a;
            java.lang.String e17 = s6Var.e(c5886xd11a0be72);
            int c17 = s6Var.c(c5886xd11a0be72);
            int d17 = s6Var.d(c5886xd11a0be72);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            a1Var.f182220e = e17;
            a1Var.f182221f = c17;
            a1Var.f182222g = d17;
            a1Var.f182223h = str;
            a1Var.f182224i = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.b(c5886xd11a0be72);
            if (!a1Var.f182218c.i()) {
                return true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c.Z6(activityC13591xdaafa82c, a1Var);
            return true;
        }
    };

    public static void Z6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var) {
        activityC13591xdaafa82c.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = a1Var.f182218c;
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.x0(activityC13591xdaafa82c, k0Var, a1Var);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.y0(activityC13591xdaafa82c, a1Var);
        k0Var.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.z0(activityC13591xdaafa82c, a1Var);
        if (activityC13591xdaafa82c.mo55332x76847179().isFinishing()) {
            return;
        }
        k0Var.v();
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        if (e2Var != null && e2Var.w0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImgDetailUI", "on cdn status change, dataid[%s]", e2Var.f67085xf604e54a);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1) this.f182161p.get(e2Var.f67085xf604e54a);
            if (a1Var != null) {
                b7(a1Var, "onCdnStatusChanged");
                return;
            }
            return;
        }
        if (e2Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImgDetailUI", "onCdnStatusChanged: dataid[%s], cdn status=%d", e2Var.f67085xf604e54a, java.lang.Integer.valueOf(e2Var.f67093x10a0fed7));
            if (e2Var.f67093x10a0fed7 == 4) {
                k82.c.f386420a.e(this.f182160o.f67645x88be67a1, 1);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22623xe6f21e58 V6() {
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22623xe6f21e58) findViewById(com.p314xaae8f345.mm.R.id.mcm);
    }

    public final android.graphics.Bitmap a7(r45.gp0 gp0Var) {
        android.graphics.Bitmap i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.i(gp0Var, this.f182160o);
        if (i17 != null) {
            return i17;
        }
        if (this.f182162q == null) {
            this.f182162q = bp.b.m10969xb866ec1c(getResources(), com.p314xaae8f345.mm.R.raw.f79106xd105c448, null);
        }
        return this.f182162q;
    }

    public final void b7(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var, java.lang.String str) {
        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.u0(this, a1Var, str));
    }

    public final void c7() {
        int dimensionPixelOffset = com.p314xaae8f345.mm.ui.bk.h(mo55332x76847179()).x - (getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561303er) * 2);
        this.f182159n = dimensionPixelOffset;
        this.f182159n = java.lang.Math.max(dimensionPixelOffset, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.acb;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13589x120fb59a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (1 == i17) {
            if (-1 != i18) {
                return;
            }
            if (new o72.b3().a(this.f182160o, false, false)) {
                db5.e1.T(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571238e));
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            o72.r2 r2Var = this.f182160o;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.l0 l0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.l0(this, Q);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(r2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f6 f6Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f6();
            f6Var.f182381b = stringExtra;
            f6Var.f182382c = stringExtra2;
            f6Var.f182384e = linkedList;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.h(mo55332x76847179, f6Var, l0Var);
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c7();
        java.util.Iterator it = this.f182161p.entrySet().iterator();
        while (it.hasNext()) {
            b7((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1) ((java.util.Map.Entry) it.next()).getValue(), "onConfigurationChanged");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13589x120fb59a, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        c7();
        this.f182158m = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.duv);
        long longExtra = getIntent().getLongExtra("key_detail_info_id", -1L);
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(longExtra);
        this.f182160o = F;
        if (F == null) {
            k82.c.f386420a.e(longExtra, 3);
            finish();
            return;
        }
        Y6(F);
        java.util.Iterator it = this.f182160o.f67640x5ab01132.f452497f.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            java.lang.String str = gp0Var.T;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1(this, null);
            a1Var.f182216a = gp0Var;
            int i18 = i17 + 1;
            android.widget.ImageView imageView = new android.widget.ImageView(mo55332x76847179());
            int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            if (i17 > 0) {
                layoutParams.topMargin = dimensionPixelSize;
            }
            this.f182158m.addView(imageView, layoutParams);
            imageView.setTag(gp0Var);
            int i19 = dimensionPixelSize / 2;
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            imageView.setPadding(i19, i19, i19, i19);
            imageView.setMinimumWidth(i65.a.b(mo55332x76847179(), 50));
            imageView.setMinimumHeight(i65.a.b(mo55332x76847179(), 50));
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79106xd105c448);
            imageView.setOnClickListener(this.f182165t);
            imageView.setOnLongClickListener(this.f182166u);
            imageView.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.j0(this, gp0Var, imageView, i19));
            a1Var.f182217b = imageView;
            this.f182161p.put(gp0Var.T, a1Var);
            b7(a1Var, "initDetail");
            if (gp0Var.X1 != 0) {
                this.f182163r = false;
            }
            i17 = i18;
        }
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_m));
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.y1.a(this, this.f182160o);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.m0(this));
        m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.jzq, com.p314xaae8f345.mm.R.raw.f78355x20db789a, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.r0(this, longExtra));
        o25.n1.c(this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Ia(this);
        this.f182167v.mo48813x58998cd();
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.s0 s0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.s0(this);
        ((jd0.q2) x2Var).getClass();
        this.f182164s = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636(this, s0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Y(this);
        this.f182167v.mo48814x2efc64();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        java.util.Iterator it = this.f182161p.entrySet().iterator();
        while (it.hasNext()) {
            b7((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1) ((java.util.Map.Entry) it.next()).getValue(), "onResume");
        }
    }
}
