package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI */
/* loaded from: classes9.dex */
public class ActivityC17117x395bed72 extends com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.AbstractActivityC17115xe34aa8 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f238107v = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22606xbb21161d f238108d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f238109e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f238110f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f238111g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f238112h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f238113i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f238114m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f238115n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f238116o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f238117p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d f238118q;

    /* renamed from: r, reason: collision with root package name */
    public r45.np6 f238119r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f238120s;

    /* renamed from: t, reason: collision with root package name */
    public int f238121t = 0;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f238122u;

    public final void V6(boolean z17) {
        int height = ((android.view.WindowManager) getSystemService("window")).getDefaultDisplay().getHeight();
        int b17 = i65.a.b(mo55332x76847179(), 96);
        int b18 = i65.a.b(mo55332x76847179(), 64);
        int b19 = i65.a.b(mo55332x76847179(), 48);
        int b27 = i65.a.b(mo55332x76847179(), 40);
        int j17 = (height - com.p314xaae8f345.mm.ui.bl.j(mo55332x76847179())) - o25.n1.a(mo55332x76847179());
        if (z17) {
            b17 = b18;
        }
        int i17 = j17 - b27;
        int i18 = this.f238121t;
        int i19 = (i17 - i18) - b17;
        if ((i17 - i18) - b17 < this.f238116o.getBottom() + b19) {
            i19 = this.f238116o.getBottom() + b19;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.f238117p.getTop(), i19);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new y3.b());
        ofFloat.setDuration(175L);
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.f238117p);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17117x395bed72.f238107v;
                int intValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).intValue();
                android.view.View view = (android.view.View) weakReference.get();
                if (view != null) {
                    view.layout(r1, intValue, view.getWidth() + r1, view.getHeight() + intValue);
                }
            }
        });
        ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.a0(this, weakReference, i19));
        ofFloat.start();
    }

    public final void W6() {
        java.lang.String sb6;
        java.lang.String sb7;
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.np6 np6Var = this.f238119r;
        int i17 = sw3.d.f494997u;
        if (np6Var == null) {
            sb7 = "TransferPhoneHomePageResp{null}";
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("TransferPhoneHomePageResp{ret_code=");
            sb8.append(np6Var.f463110d);
            sb8.append(", ret_msg='");
            sb8.append(np6Var.f463111e);
            sb8.append("', title='");
            sb8.append(np6Var.f463112f);
            sb8.append("', subtitle='");
            sb8.append(np6Var.f463113g);
            sb8.append("', has_his_rcvr=");
            sb8.append(np6Var.f463114h);
            sb8.append(", menu=");
            java.util.LinkedList linkedList = np6Var.f463115i;
            if (linkedList == null) {
                sb6 = "LinkedList<JumpItem>{null}";
            } else {
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("LinkedList<JumpItem>{");
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    sb9.append(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f0.e((r45.n34) it.next()));
                    sb9.append(", ");
                }
                sb9.append("}");
                sb6 = sb9.toString();
            }
            sb8.append(sb6);
            sb8.append(", announcement=");
            sb8.append(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f0.e(np6Var.f463116m));
            sb8.append(", homepage_ext='");
            sb8.append(np6Var.f463117n);
            sb8.append("'}");
            sb7 = sb8.toString();
        }
        objArr[0] = sb7;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "updateView() mResponse:%s", objArr);
        if (this.f238119r == null) {
            this.f238109e.setVisibility(4);
            return;
        }
        this.f238109e.setVisibility(0);
        r45.np6 np6Var2 = this.f238119r;
        r45.tw4 tw4Var = np6Var2.f463118o;
        if (tw4Var != null && tw4Var.f468364d == 1) {
            this.f238118q.m83148xdedf72f8(tw4Var);
        } else if (np6Var2.f463116m != null) {
            this.f238110f.setVisibility(0);
            this.f238111g.setText(this.f238119r.f463116m.f462581d);
            this.f238110f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.i0(this));
        } else {
            this.f238110f.setVisibility(8);
        }
        this.f238112h.setText(this.f238119r.f463112f);
        this.f238113i.setText(this.f238119r.f463113g);
        int i18 = this.f238119r.f463114h;
        if (i18 == 0) {
            this.f238114m.m83173x1e821d71().setVisibility(8);
        } else if (i18 == 1) {
            this.f238114m.m83173x1e821d71().setVisibility(0);
        }
        if (this.f238119r.f463115i.size() > 0) {
            mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f78355x20db789a, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.m0(this));
        } else {
            m78551x8f8ecf18(0);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        try {
            mo48674x36654fab();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c27;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.b0(this));
        this.f238108d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22606xbb21161d) findViewById(com.p314xaae8f345.mm.R.id.m7j);
        this.f238109e = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.jnx);
        this.f238110f = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.jnw);
        this.f238111g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.af7);
        this.f238112h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jny);
        this.f238113i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jns);
        this.f238114m = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.jnz);
        com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d c22905xef04d72d = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d) findViewById(com.p314xaae8f345.mm.R.id.pga);
        this.f238118q = c22905xef04d72d;
        c22905xef04d72d.a();
        android.widget.TextView m83186xefe232c4 = this.f238114m.m83186xefe232c4();
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) m83186xefe232c4.getLayoutParams();
        layoutParams.width = -2;
        m83186xefe232c4.setLayoutParams(layoutParams);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359) this.f238114m.m83169xe7297452();
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) c28001xdd2bb359.getLayoutParams();
        layoutParams2.leftMargin = i65.a.b(mo55332x76847179(), 24);
        c28001xdd2bb359.setLayoutParams(layoutParams2);
        c28001xdd2bb359.setFocusable(true);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2490xd09a53f9.C19757x2454ae8e m83173x1e821d71 = this.f238114m.m83173x1e821d71();
        int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834);
        m83173x1e821d71.f273574u = com.p314xaae8f345.mm.R.raw.f79679xe7836e52;
        m83173x1e821d71.f273575v = color;
        this.f238114m.m83173x1e821d71().m75915x984ee11e(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhv));
        this.f238115n = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.jnt);
        this.f238116o = findViewById(com.p314xaae8f345.mm.R.id.jnv);
        this.f238117p = findViewById(com.p314xaae8f345.mm.R.id.auj);
        this.f238108d.m81272xb3968e21(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.c0(this));
        this.f238115n.setEnabled(false);
        this.f238115n.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.d0(this));
        this.f238114m.m83173x1e821d71().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.e0(this));
        this.f238114m.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.f0(this));
        this.f238114m.m83169xe7297452().requestFocus();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.AbstractActivityC17115xe34aa8, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.n34 n34Var;
        super.onCreate(bundle);
        this.f238122u = getIntent().getStringExtra("key_content");
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
        mo43517x10010bd5();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f238122u)) {
            this.f238114m.m83213x765074af(this.f238122u);
            this.f238115n.setEnabled(true);
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MOBILE_REMITTANCE_HOME_PAGE_INFO_STRING_SYNC, "");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            int i17 = sw3.d.f494997u;
            r45.np6 np6Var = new r45.np6();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                np6Var.f463110d = jSONObject.optInt("ret_code");
                np6Var.f463111e = jSONObject.optString("ret_msg");
                np6Var.f463112f = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                np6Var.f463113g = jSONObject.optString("subtitle");
                np6Var.f463114h = jSONObject.optInt("has_his_rcvr");
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("menu");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i18 = 0; i18 < length; i18++) {
                        np6Var.f463115i.add(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f0.a(optJSONArray.getJSONObject(i18)));
                    }
                }
                try {
                    n34Var = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f0.a(new org.json.JSONObject(jSONObject.optString("announcement")));
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JumpItemUtil", "createFromJSONObject() Exception:%s", e17.getMessage());
                    n34Var = null;
                }
                np6Var.f463116m = n34Var;
                np6Var.f463117n = jSONObject.optString("homepage_ext");
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "createFromJson() Exception:%s", e18.getMessage());
                np6Var = null;
            }
            this.f238119r = np6Var;
        }
        W6();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "doNetSceneMobileRemitGetHomePage() isShowProgress:%s", java.lang.Boolean.valueOf(K0));
        this.f238120s = K0;
        m83099x5406100e(new sw3.d(true), K0);
        m83090x14f40144(2952);
        m83090x14f40144(2993);
        m83090x14f40144(1495);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.AbstractActivityC17115xe34aa8, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(2952);
        m83121xf6ff5b27(2993);
        m83121xf6ff5b27(1495);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.AbstractActivityC17115xe34aa8, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f238114m.m83169xe7297452().clearFocus();
        mo48674x36654fab();
        this.f238108d.m81271xb2a7481e().f87429p = false;
        this.f238121t = 0;
        V6(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.AbstractActivityC17115xe34aa8, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f238108d.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.g0(this, new java.lang.ref.WeakReference(this.f238114m)), 500L);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.ArrayList arrayList;
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.mo808xfb85f7b0());
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof sw3.d) {
                if (this.f238120s) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk);
                    }
                    db5.t7.m123883x26a183b(mo55332x76847179, str, 0).show();
                }
                return true;
            }
            if (!(m1Var instanceof sw3.f)) {
                boolean z17 = m1Var instanceof sw3.h;
            }
            if (i18 == 0) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gwx);
                }
                db5.t7.m123883x26a183b(mo55332x768471792, str, 0).show();
            }
            return true;
        }
        if (m1Var instanceof sw3.d) {
            r45.np6 np6Var = ((sw3.d) m1Var).f494998t;
            r45.np6 np6Var2 = np6Var != null ? np6Var : null;
            this.f238119r = np6Var2;
            if (np6Var2 != null && np6Var2.f463110d == 0) {
                W6();
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MOBILE_REMITTANCE_HOME_PAGE_INFO_STRING_SYNC;
                r45.np6 np6Var3 = this.f238119r;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("ret_code", np6Var3.f463110d);
                    jSONObject.put("ret_msg", np6Var3.f463111e);
                    jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, np6Var3.f463112f);
                    jSONObject.put("subtitle", np6Var3.f463113g);
                    jSONObject.put("has_his_rcvr", np6Var3.f463114h);
                    java.util.LinkedList linkedList = np6Var3.f463115i;
                    if (linkedList != null) {
                        org.json.JSONArray jSONArray = new org.json.JSONArray();
                        java.util.Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f0.b((r45.n34) it.next()));
                        }
                        jSONObject.put("menu", jSONArray);
                    }
                    jSONObject.put("announcement", np6Var3.f463116m);
                    jSONObject.put("homepage_ext", np6Var3.f463117n);
                    str2 = jSONObject.toString();
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "getJsonStrFromHomePageInfo() Exception: %s", e17.getMessage());
                    str2 = "";
                }
                c17.x(u3Var, str2);
            } else if (this.f238120s) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471793 = mo55332x76847179();
                r45.np6 np6Var4 = this.f238119r;
                db5.t7.m123883x26a183b(mo55332x768471793, (np6Var4 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(np6Var4.f463111e)) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk) : this.f238119r.f463111e, 0).show();
            }
        } else if (m1Var instanceof sw3.f) {
            r45.hp6 hp6Var = ((sw3.f) m1Var).f495000t;
            if (hp6Var == null) {
                hp6Var = null;
            }
            if (hp6Var == null || hp6Var.f457911d != 0) {
                db5.t7.m123883x26a183b(mo55332x76847179(), (hp6Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hp6Var.f457912e)) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk) : hp6Var.f457912e, 0).show();
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_homepage_ext", this.f238119r.f463117n);
                intent.putExtra("key_finish", hp6Var.f457914g);
                intent.putExtra("key_last_id", hp6Var.f457915h);
                java.util.LinkedList linkedList2 = hp6Var.f457913f;
                if (linkedList2 == null) {
                    arrayList = null;
                } else {
                    arrayList = new java.util.ArrayList();
                    java.util.Iterator it6 = linkedList2.iterator();
                    while (it6.hasNext()) {
                        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.cgi.C17111x2fc4c3b7((r45.ow3) it6.next()));
                    }
                }
                intent.putExtra("key_history_record", arrayList);
                j45.l.j(mo55332x76847179(), "remittance", ".mobile.ui.MobileRemitHistoryRecodUI", intent, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "TransferPhoneGetHisRcvrsResp finish:%s lastId:%s hisRecord.size:%s", java.lang.Boolean.valueOf(hp6Var.f457914g), hp6Var.f457915h, java.lang.Integer.valueOf(linkedList2.size()));
            }
        } else if (m1Var instanceof sw3.h) {
            sw3.h hVar = (sw3.h) m1Var;
            r45.jp6 jp6Var = hVar.f495004v;
            if (jp6Var == null) {
                jp6Var = null;
            }
            if (jp6Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "NetSceneMobileRemitGetRecvInfo rcvrResp is null");
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "NetSceneMobileRemitGetRecvInfo phone:%s ret_code:%s ret_msg:%s", hVar.f495003u, java.lang.Integer.valueOf(jp6Var.f459550d), jp6Var.f459551e);
            if (jp6Var.f459550d == 0) {
                if (jp6Var.f459553g != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "show remark or nickname change dialog!");
                    com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f0.d(this, jp6Var.f459553g, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.n0(this, jp6Var));
                } else if (jp6Var.f459566w != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "show free oneself from dialog!");
                    com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f0.d(this, jp6Var.f459566w, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.z(this, jp6Var));
                } else {
                    tw3.b.a(mo55332x76847179(), jp6Var);
                }
                return true;
            }
            if (jp6Var.f459552f == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "why here???");
            }
            db5.e1.E(mo55332x76847179(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jp6Var.f459551e) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk) : jp6Var.f459551e, "", getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gww), false, null).show();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.o0.class);
    }
}
