package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro */
/* loaded from: classes5.dex */
public class ActivityC17415x5f2726f5 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final /* synthetic */ int D = 0;
    public android.widget.TextView A;
    public final int B = 1;
    public final int C = 1;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f241878d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f241879e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f241880f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f241881g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f241882h;

    /* renamed from: i, reason: collision with root package name */
    public long f241883i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f241884m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f241885n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f241886o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f241887p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f241888q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f241889r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f241890s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f241891t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f241892u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f241893v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f241894w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f241895x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f241896y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f241897z;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17415x5f2726f5 activityC17415x5f2726f5) {
        activityC17415x5f2726f5.getClass();
        l14.a.b(false);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC17415x5f2726f5.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8.class)).f242962f = false;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = activityC17415x5f2726f5.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8.class)).T6();
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17415x5f2726f5 activityC17415x5f2726f5) {
        activityC17415x5f2726f5.getClass();
        boolean g17 = j65.e.g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsCareModeIntro", "updateMuteStatus, lastExtStatus2:" + activityC17415x5f2726f5.f241883i + " isLargeFont:" + g17);
        if (g17) {
            activityC17415x5f2726f5.f241883i |= 16777216;
        } else {
            activityC17415x5f2726f5.f241883i &= -16777217;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(activityC17415x5f2726f5.f241883i));
        bn0.g.f104312a.g("USERINFO_EXT_STATUS2_LONG_SYNC", activityC17415x5f2726f5.f241883i);
        int i17 = g17 ? 1 : 2;
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 89;
        p53Var.f464295e = i17;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsCareModeIntro", "switch ext change : big font open = " + g17 + " item value = " + p53Var.f464295e + " functionId = " + p53Var.f464294d);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf, java.lang.Integer.valueOf(g17 ? 1 : 0));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("care_mode_quite_mode_switch", "view_clk", hashMap, 29254);
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17415x5f2726f5 activityC17415x5f2726f5) {
        activityC17415x5f2726f5.getClass();
        boolean f17 = j65.e.f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsCareModeIntro", "updateExtStatus2Values, lastExtStatus2:" + activityC17415x5f2726f5.f241883i + " isOpen:" + f17);
        if (f17) {
            activityC17415x5f2726f5.f241883i |= 16;
        } else {
            activityC17415x5f2726f5.f241883i &= -17;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(activityC17415x5f2726f5.f241883i));
        bn0.g.f104312a.g("USERINFO_EXT_STATUS2_LONG_SYNC", activityC17415x5f2726f5.f241883i);
        int i17 = f17 ? 1 : 2;
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 76;
        p53Var.f464295e = i17;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsCareModeIntro", "switch ext change : TTS open = " + f17 + " item value = " + p53Var.f464295e + " functionId = " + p53Var.f464294d);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf, java.lang.Integer.valueOf(f17 ? 1 : 0));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("care_mode_tts_switch", "view_clk", hashMap, 29254);
    }

    public final void W6() {
        if (((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ui() != wd0.g1.f526246e) {
            this.f241897z.setVisibility(0);
            this.A.setVisibility(8);
        } else {
            this.f241897z.setVisibility(8);
            this.A.setVisibility(0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cl8;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String str;
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.heb);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsCareModeIntro", "is care mode open: %s", java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8.class)).f242962f));
        this.f241888q = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.ql7);
        this.f241880f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.heb);
        this.f241881g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hea);
        this.f241882h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ql6);
        this.f241878d = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.bcy);
        this.f241879e = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.bcx);
        this.f241887p = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.qhh);
        this.f241889r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.qkk);
        this.f241890s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.qki);
        this.f241891t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.i3w);
        this.f241892u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.i3q);
        this.f241893v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567596qm4);
        this.f241894w = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567592qm2);
        this.f241895x = findViewById(com.p314xaae8f345.mm.R.id.f566770u26);
        this.f241896y = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.u28);
        this.f241897z = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.u27);
        this.A = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566769u25);
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bm.f242411a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long n17 = j62.e.g().n() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
        if (n17 == 0) {
            str = "0";
        } else if (n17 > 0) {
            str = java.lang.Long.toString(n17, 10);
        } else {
            char[] cArr = new char[64];
            long j17 = (n17 >>> 1) / 5;
            long j18 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
            while (j17 > 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                j17 /= j18;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        sb6.append(str);
        sb6.append("_");
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String value = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bm.f242412b = value;
        this.f241880f.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561387h3) * i65.a.m(mo55332x76847179()));
        this.f241881g.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) * i65.a.m(mo55332x76847179()));
        this.f241882h.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) * i65.a.m(mo55332x76847179()));
        this.f241879e.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561415hv) * i65.a.m(mo55332x76847179()));
        this.f241889r.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) * i65.a.m(mo55332x76847179()));
        this.f241890s.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3) * i65.a.m(mo55332x76847179()));
        this.f241891t.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) * i65.a.m(mo55332x76847179()));
        this.f241892u.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3) * i65.a.m(mo55332x76847179()));
        this.f241893v.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) * i65.a.m(mo55332x76847179()));
        this.f241894w.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3) * i65.a.m(mo55332x76847179()));
        this.f241896y.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) * i65.a.m(mo55332x76847179()));
        this.f241897z.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) * i65.a.m(mo55332x76847179()));
        this.A.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3) * i65.a.m(mo55332x76847179()));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8.class)).f242962f) {
            this.f241887p.setVisibility(8);
            this.f241879e.setVisibility(8);
            this.f241888q.setVisibility(0);
            if (((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).cj()) {
                this.f241882h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.n6e);
            } else {
                this.f241882h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.d_g);
            }
            this.f241878d.setVisibility(0);
            this.f241878d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.o9(this));
            return;
        }
        this.f241887p.setVisibility(0);
        this.f241878d.setVisibility(8);
        this.f241879e.setVisibility(0);
        this.f241888q.setVisibility(8);
        this.f241879e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.e9(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.i3v);
        this.f241885n = viewOnClickListenerC22631x1cc07cc8;
        viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(j65.e.f());
        this.f241885n.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h9(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.qkj);
        this.f241884m = viewOnClickListenerC22631x1cc07cc82;
        viewOnClickListenerC22631x1cc07cc82.m81392x52cfa5c6(j65.e.e());
        this.f241884m.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k9(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc83 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.f567595qm3);
        this.f241886o = viewOnClickListenerC22631x1cc07cc83;
        viewOnClickListenerC22631x1cc07cc83.m81392x52cfa5c6(j65.e.g());
        this.f241886o.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l9(this));
        this.f241895x.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.m9(this));
        if (((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).cj()) {
            android.view.View view = this.f241895x;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById = m78513xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.f566768u24);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.f241895x;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = m78513xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.f566768u24);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        W6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == this.f241895x.hashCode() && i18 == -1) {
            new android.os.Handler(getMainLooper()).postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.w8(this), 500L);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.SettingsCareModeIntro);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 29254);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getBoolean("caremode_setting_succeed", false)) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(j65.e.b() ? com.p314xaae8f345.mm.R.C30867xcad56011.awm : com.p314xaae8f345.mm.R.C30867xcad56011.awd);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
            e4Var.f293309c = string;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.c();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("caremode_setting_succeed", false);
        }
        this.f241883i = c01.z1.i();
        mo43517x10010bd5();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.x8(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        W6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8.class);
    }
}
