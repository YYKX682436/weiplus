package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI */
/* loaded from: classes9.dex */
public class ActivityC17149x1eca379 extends com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17151xe789054f {
    public static int[] A;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f239102e;

    /* renamed from: f, reason: collision with root package name */
    public int f239103f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f239104g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239105h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 f239106i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f239107m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f239108n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab f239109o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f239110p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f239111q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f239112r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f239113s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f239114t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab f239115u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 f239116v;

    /* renamed from: w, reason: collision with root package name */
    public a36.c f239117w;

    /* renamed from: x, reason: collision with root package name */
    public r45.zv f239118x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f239119y = false;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f239120z = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17149x1eca379.AnonymousClass1(com.p314xaae8f345.mm.app.a0.f134821d);

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e> {
        public AnonymousClass1(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = 520089918;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultNewUI", "receive pay result event, do finish");
            int i17 = c6249x2aa12f2e.f136498g.f89395b;
            if (i17 != 1000 && i17 != 1001) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultNewUI", "doEndRemittance");
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17149x1eca379 activityC17149x1eca379 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17149x1eca379.this;
            com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a39 = activityC17149x1eca379.m83108x2b5a5a39();
            if (m83108x2b5a5a39 != null) {
                m83108x2b5a5a39.z(activityC17149x1eca379);
            }
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a8(this), 100L);
            return false;
        }
    }

    public static int W6(android.content.Context context, java.lang.String str, int i17) {
        int b17 = i65.a.b(context, 16);
        if (A == null) {
            A = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.f(context);
        }
        boolean z17 = false;
        int b18 = ((A[0] - i65.a.b(context, 88)) - i17) / b17;
        int length = str.length();
        int i18 = length / b18;
        if (i18 > 2 || (i18 == 2 && length % b18 > 0)) {
            z17 = true;
        }
        return z17 ? (b18 * 2) - 5 : str.length();
    }

    public final void X6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultNewUI", "doEndRemittance");
        m83108x2b5a5a39().f(this, m83105x7498fe14());
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.e8(this), 100L);
    }

    public final void Y6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultNewUI", "endRemittance");
        if (!m83105x7498fe14().containsKey("key_realname_guide_helper")) {
            X6();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1) m83105x7498fe14().getParcelable("key_realname_guide_helper");
        if (c19088xa4b300c1 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".ui.RemittanceResultUI");
            bundle.putString("realname_verify_process_jump_plugin", "remittance");
            c19088xa4b300c1.a(this, bundle, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.c8(this), null);
            c19088xa4b300c1.c(this, bundle, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.d8(this), null, false);
            m83105x7498fe14().remove("key_realname_guide_helper");
        }
    }

    public final android.view.View Z6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = this.f239102e;
        if (c19099x8d444f05 == null) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(c19099x8d444f05.f261215n > 0.0d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultNewUI", "need set charge fee: %s", objArr);
        if (this.f239102e.f261215n <= 0.0d) {
            return null;
        }
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574362i13);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f052 = this.f239102e;
        java.lang.String n17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(c19099x8d444f052.f261215n, c19099x8d444f052.f261214m);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a_s, this.f239111q, false);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.odf);
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.cut);
        textView.setText(string);
        imageView.setVisibility(8);
        textView2.setText(n17);
        this.f239111q.addView(viewGroup);
        return viewGroup;
    }

    public final android.view.ViewGroup a7(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultNewUI", "setF2FNameView");
        if (z17) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a_v, this.f239111q, false);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.lut);
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568056lj2);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f239104g) || this.f239106i.f273655u == null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(c19659x677e0913, this.f239104g, 0.06f);
            } else {
                int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(this, 56.0f);
                c19659x677e0913.m75394x3288e7c1(true);
                c19659x677e0913.b(this.f239106i.f273655u.getString("extinfo_key_27"), d17, d17, com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
            }
            textView.setText(str);
            this.f239111q.addView(viewGroup);
            return viewGroup;
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a_u, this.f239111q, false);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e09132 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.lut);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.f568056lj2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f239104g) || this.f239106i.f273655u == null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(c19659x677e09132, this.f239104g, 0.06f);
        } else {
            int d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(this, 28.0f);
            c19659x677e09132.m75394x3288e7c1(true);
            c19659x677e09132.b(this.f239106i.f273655u.getString("extinfo_key_27"), d18, d18, com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        }
        textView2.setText(str);
        this.f239111q.addView(viewGroup2);
        return viewGroup2;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultNewUI", "finish this %s %s", this, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (this.f239119y) {
            return;
        }
        super.finish();
        this.f239119y = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17151xe789054f, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cef;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        boolean z17;
        android.view.ViewGroup viewGroup;
        android.os.Bundle bundle;
        android.view.ViewGroup viewGroup2 = null;
        mo54448x9c8c0d33(null);
        m78600x5843c740(false);
        m78499x92e71989(false);
        this.f239107m = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.dmb);
        this.f239108n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565808dm5);
        this.f239109o = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) findViewById(com.p314xaae8f345.mm.R.id.f565806dm3);
        this.f239110p = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.dm9);
        this.f239111q = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.dm_);
        this.f239112r = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.kdn);
        this.f239113s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kdm);
        this.f239114t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kdh);
        this.f239115u = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) findViewById(com.p314xaae8f345.mm.R.id.kdg);
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f568926oj0)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b8(this));
        this.f239116v = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577) findViewById(com.p314xaae8f345.mm.R.id.a_t);
        java.lang.String x17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.x(this.f239104g);
        int i17 = this.f239103f;
        if (i17 == 31 || i17 == 5) {
            this.f239114t.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w(this.f239102e.f261214m));
            this.f239115u.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(this.f239102e.f261211h));
            if (this.f239103f == 31) {
                java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574365i16, x17);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    this.f239113s.setVisibility(8);
                } else {
                    android.widget.TextView textView = this.f239113s;
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    float textSize = this.f239113s.getTextSize();
                    ((ke0.e) xVar).getClass();
                    textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, string, textSize));
                }
            } else {
                android.os.Bundle bundle2 = this.f239106i.f273655u;
                z17 = bundle2 != null && bundle2.getBoolean("extinfo_key_10");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultNewUI", "isEmojiReward: %s", java.lang.Boolean.valueOf(z17));
                if (z17) {
                    this.f239113s.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i07));
                } else {
                    java.util.List list = this.f239102e.M;
                    if (list != null && ((java.util.ArrayList) list).get(0) != null && !android.text.TextUtils.isEmpty(((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) this.f239102e.M).get(0)).f261239g)) {
                        this.f239113s.setText(((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) this.f239102e.M).get(0)).f261239g);
                    }
                }
            }
            this.f239112r.setVisibility(0);
            if (this.f239102e.f261215n > 0.0d) {
                Z6();
                ((android.view.ViewGroup.MarginLayoutParams) this.f239110p.getLayoutParams()).topMargin = i65.a.b(this, 20);
                this.f239110p.setVisibility(0);
                this.f239111q.setVisibility(0);
            }
        } else {
            byte[] byteArray = m83105x7498fe14().getByteArray("key_succpage_resp");
            if (byteArray != null) {
                r45.zv zvVar = new r45.zv();
                this.f239118x = zvVar;
                try {
                    zvVar.mo11468x92b714fd(byteArray);
                    this.f239117w = this.f239118x.f473917g;
                } catch (java.lang.Exception e17) {
                    this.f239118x = null;
                    this.f239117w = null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RemittanceResultNewUI", e17, "parse f2FPaySucPageResp error: %s", e17.getMessage());
                }
            }
            java.lang.String x18 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.x(this.f239104g);
            this.f239108n.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w(this.f239102e.f261214m));
            this.f239109o.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(this.f239102e.f261211h));
            this.f239111q.removeAllViews();
            int i18 = this.f239103f;
            if (i18 == 32 || i18 == 33 || i18 == 48) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x18) && (bundle = this.f239106i.f273655u) != null) {
                    x18 = bundle.getString("extinfo_key_28");
                }
                android.os.Bundle bundle3 = this.f239106i.f273655u;
                java.lang.String string2 = bundle3 != null ? bundle3.getString("extinfo_key_2") : "";
                if (x18 != null && x18.length() > 10) {
                    x18 = x18.substring(0, 10) + "...";
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x18)) {
                        string2 = x18 + "(" + com.p314xaae8f345.mm.p2802xd031a825.ui.r1.y(string2) + ")";
                    }
                    x18 = string2;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultNewUI", "setF2FReceiverRemarkView");
                java.lang.String string3 = this.f239106i.f273655u.getString("extinfo_key_3");
                java.lang.String string4 = this.f239106i.f273655u.getString("extinfo_key_8");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
                    viewGroup = null;
                } else {
                    viewGroup = (android.view.ViewGroup) getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a_t, this.f239111q, false);
                    android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.odf);
                    android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.cut);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string4)) {
                        textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9v));
                    } else {
                        textView2.setText(string4);
                    }
                    textView3.setText(string3);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultNewUI", "setF2FPayerRemarkView");
                java.lang.String string5 = this.f239106i.f273655u.getString("extinfo_key_6");
                java.lang.String string6 = this.f239106i.f273655u.getString("extinfo_key_7");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string6)) {
                    viewGroup2 = (android.view.ViewGroup) getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a_t, this.f239111q, false);
                    android.widget.TextView textView4 = (android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.odf);
                    android.widget.TextView textView5 = (android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.cut);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string5)) {
                        textView4.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9u));
                    } else {
                        textView4.setText(string5);
                    }
                    textView5.setText(string6);
                }
                android.view.ViewGroup viewGroup3 = viewGroup2;
                android.view.View Z6 = Z6();
                z17 = viewGroup == null && viewGroup3 == null && Z6 == null;
                this.f239110p.setVisibility(0);
                this.f239111q.setVisibility(0);
                if (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577.e(this.f239117w)) {
                    java.lang.String str = ((java.util.ArrayList) this.f239102e.M).size() > 0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) this.f239102e.M).get(0)).f261247r : "";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultNewUI", "transId: %s", str);
                    this.f239116v.n(this, this.f239117w, str, true, (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.aai));
                    this.f239116v.g();
                    this.f239116v.setVisibility(0);
                    a7(x18, false);
                } else {
                    this.f239116v.setVisibility(8);
                    a7(x18, z17);
                }
                if (viewGroup != null) {
                    this.f239111q.addView(viewGroup);
                }
                if (viewGroup3 != null) {
                    this.f239111q.addView(viewGroup3);
                }
                if (Z6 != null) {
                    this.f239111q.addView(Z6);
                }
            }
            this.f239107m.setVisibility(0);
        }
        ((mz2.j2) ((mz2.e1) i95.n0.c(mz2.e1.class))).Ai(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17151xe789054f, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String str2;
        super.onCreate(bundle);
        if (fp.h.c(21)) {
            if (fp.h.c(23)) {
                getWindow().setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            } else {
                getWindow().setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77696x3cb0741));
            }
        }
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().o();
        }
        this.f239120z.mo48813x58998cd();
        this.f239102e = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) m83105x7498fe14().getParcelable("key_orders");
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) m83105x7498fe14().getParcelable("key_pay_info");
        this.f239106i = c19760x34448d56;
        if (c19760x34448d56 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceResultNewUI", "payInfo is null!!!");
            finish();
            return;
        }
        android.os.Bundle bundle2 = c19760x34448d56.f273655u;
        if (bundle2 != null) {
            this.f239105h = bundle2.getBoolean("extinfo_key_4");
            str = this.f239106i.f273655u.getString("extinfo_key_1");
            str2 = this.f239106i.f273655u.getString("extinfo_key_16");
        } else {
            str = "";
            str2 = str;
        }
        int i17 = this.f239106i.f273642e;
        this.f239103f = i17;
        this.f239104g = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultNewUI", "payScene: %s", java.lang.Integer.valueOf(i17));
        mo43517x10010bd5();
        if (this.f239103f == 31) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultNewUI", "transId: %s", str2);
            kw3.p.Ai().Di().d(str2, this.f239104g, "");
        }
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 0, 0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17151xe789054f, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f239120z.mo48814x2efc64();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577.e(this.f239117w)) {
            this.f239116v.j();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            Y6();
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577.e(this.f239117w)) {
            this.f239116v.k();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17151xe789054f, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577.e(this.f239117w) ? this.f239116v.l(i17, i18, str, m1Var) : super.mo48630x76e0bfae(i17, i18, str, m1Var);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setContentViewVisibility */
    public void mo67598xf0aced2e(int i17) {
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m78513xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultNewUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/remittance/ui/RemittanceResultNewUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
