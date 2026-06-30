package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/roamlite/CreateRoamLitePkgUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "mo1/d", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI */
/* loaded from: classes5.dex */
public final class ActivityC12849xeea2846d extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.ref.WeakReference f174229s;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f174230d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f174231e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f174232f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f174233g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f174234h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f174235i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f174236m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 f174237n;

    /* renamed from: o, reason: collision with root package name */
    public po1.d f174238o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f174239p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f174240q;

    /* renamed from: r, reason: collision with root package name */
    public int f174241r = 1;

    static {
        new mo1.d(null);
    }

    public final void U6() {
        finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559262q, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    public final void V6(long j17, java.lang.String str, int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", i17);
        jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, str);
        jSONObject.put("packageId", j17);
        mv.y yVar = (mv.y) i95.n0.c(mv.y.class);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) yVar).Di("roamLiteNewBackupResult", jSONObject2);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dxg;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && intent != null && i17 == 125) {
            android.os.Parcelable parcelableExtra = intent.getParcelableExtra("convParcelRange");
            if (parcelableExtra == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MM.Roam.CreateRoamLitePkgUI", "Fail to parse backup range from result intent");
            } else {
                this.f174237n = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9) parcelableExtra;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        f174229s = new java.lang.ref.WeakReference(this);
        mo54450xbf7c1df6("");
        mo74406x9c8c0d33(new mo1.f(this), com.p314xaae8f345.mm.R.raw.f80051x8e8c33a0);
        mo78530x8b45058f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174474i);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = 2L;
        c6839x89375b51.f141600e = 1L;
        c6839x89375b51.k();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.rhj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f174230d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.rhk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f174231e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.rhn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f174232f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.rho);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f174233g = (android.widget.LinearLayout) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.rhp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f174234h = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.rhq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f174235i = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.rcs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.rhm)).setOnClickListener(new mo1.g(this));
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.rcr)).setVisibility(8);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.rht)).setVisibility(8);
        ((android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f565514t14)).setVisibility(8);
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.rhr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById8;
        this.f174236m = button;
        button.setOnClickListener(new mo1.h(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Roam.CreateRoamLitePkgUI", "setup default rule");
        this.f174237n = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9(null, null, null, 0L, 0L, 31, null);
        java.lang.String stringExtra = getIntent().getStringExtra("deviceInfo");
        po1.d b17 = po1.d.f438827i.b(stringExtra);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MM.Roam.CreateRoamLitePkgUI", "[prepareInitData] Fail to parse device from " + stringExtra);
            U6();
            return;
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
        this.f174239p = stringExtra2 != null ? stringExtra2 : "";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[prepareInitData] deviceId=");
        sb6.append(b17.f438828a);
        sb6.append(", sessionId=");
        java.lang.String str = this.f174239p;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            throw null;
        }
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Roam.CreateRoamLitePkgUI", sb6.toString());
        this.f174238o = b17;
        android.widget.TextView textView = this.f174231e;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceNameTv");
            throw null;
        }
        textView.setVisibility(0);
        android.widget.TextView textView2 = this.f174231e;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceNameTv");
            throw null;
        }
        textView2.setText(b17.b());
        android.widget.TextView textView3 = this.f174231e;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceNameTv");
            throw null;
        }
        textView3.setTextColor(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f174230d;
        if (c22699x3dcdb352 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceIcon");
            throw null;
        }
        c22699x3dcdb352.setVisibility(0);
        int ordinal = b17.f438829b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f174230d;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f80080x185fe337);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceIcon");
                throw null;
            }
        }
        if (ordinal != 2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f174230d;
            if (c22699x3dcdb3523 != null) {
                c22699x3dcdb3523.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceIcon");
                throw null;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f174230d;
        if (c22699x3dcdb3524 != null) {
            c22699x3dcdb3524.setImageResource(com.p314xaae8f345.mm.R.raw.f80343xde51652c);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceIcon");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f174229s = null;
        if (this.f174240q) {
            return;
        }
        int i17 = this.f174241r;
        java.lang.String str = this.f174239p;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            throw null;
        }
        V6(-1L, str, i17);
        this.f174240q = true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        java.lang.String string;
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9 = this.f174237n;
        if (c12853x6acde7c9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        boolean z17 = c12853x6acde7c9.f174266g == 0 && c12853x6acde7c9.f174267h == 0;
        if (z17 && c12853x6acde7c9.f174263d != po1.b.f438823e) {
            android.widget.LinearLayout linearLayout = this.f174233g;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rulesContainer");
                throw null;
            }
            linearLayout.setVisibility(8);
            android.widget.TextView textView = this.f174232f;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleRuleTv");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c92 = this.f174237n;
            if (c12853x6acde7c92 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                throw null;
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            textView.setText(fo1.r.c(c12853x6acde7c92, mo55332x76847179));
            return;
        }
        android.widget.TextView textView2 = this.f174232f;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleRuleTv");
            throw null;
        }
        textView2.setText(c12853x6acde7c9.f174263d != po1.b.f438822d ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.my7) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvp));
        android.widget.LinearLayout linearLayout2 = this.f174233g;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rulesContainer");
            throw null;
        }
        linearLayout2.setVisibility(0);
        android.widget.TextView textView3 = this.f174234h;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("convDescTv");
            throw null;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c93 = this.f174237n;
        if (c12853x6acde7c93 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
        objArr[0] = fo1.r.c(c12853x6acde7c93, mo55332x768471792);
        textView3.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.mx6, objArr));
        if (z17) {
            android.widget.TextView textView4 = this.f174235i;
            if (textView4 != null) {
                textView4.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeDescTv");
                throw null;
            }
        }
        android.widget.TextView textView5 = this.f174235i;
        if (textView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeDescTv");
            throw null;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c94 = this.f174237n;
        if (c12853x6acde7c94 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        long j17 = c12853x6acde7c94.f174266g;
        if (j17 != 0 && c12853x6acde7c94.f174267h != 0) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c95 = this.f174237n;
            if (c12853x6acde7c95 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                throw null;
            }
            calendar.setTimeInMillis(c12853x6acde7c95.f174266g);
            java.util.Calendar calendar2 = java.util.Calendar.getInstance();
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c96 = this.f174237n;
            if (c12853x6acde7c96 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                throw null;
            }
            calendar2.setTimeInMillis(c12853x6acde7c96.f174267h);
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572215m73, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5)), java.lang.Integer.valueOf(calendar2.get(1)), java.lang.Integer.valueOf(calendar2.get(2) + 1), java.lang.Integer.valueOf(calendar2.get(5)));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else if (j17 != 0) {
            java.util.Calendar calendar3 = java.util.Calendar.getInstance();
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c97 = this.f174237n;
            if (c12853x6acde7c97 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                throw null;
            }
            calendar3.setTimeInMillis(c12853x6acde7c97.f174266g);
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572217m75, java.lang.Integer.valueOf(calendar3.get(1)), java.lang.Integer.valueOf(calendar3.get(2) + 1), java.lang.Integer.valueOf(calendar3.get(5)));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else {
            java.util.Calendar calendar4 = java.util.Calendar.getInstance();
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c98 = this.f174237n;
            if (c12853x6acde7c98 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                throw null;
            }
            calendar4.setTimeInMillis(c12853x6acde7c98.f174267h);
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572216m74, java.lang.Integer.valueOf(calendar4.get(1)), java.lang.Integer.valueOf(calendar4.get(2) + 1), java.lang.Integer.valueOf(calendar4.get(5)));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        }
        objArr2[0] = string;
        textView5.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.mx7, objArr2));
        android.widget.TextView textView6 = this.f174235i;
        if (textView6 != null) {
            textView6.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeDescTv");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo52922x430f73e() {
        return false;
    }
}
