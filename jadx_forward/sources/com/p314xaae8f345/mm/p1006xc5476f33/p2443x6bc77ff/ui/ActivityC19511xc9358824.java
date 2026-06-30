package com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui;

/* renamed from: com.tencent.mm.plugin.welab.ui.WelabAppInfoUI */
/* loaded from: classes15.dex */
public class ActivityC19511xc9358824 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f269615d;

    /* renamed from: e, reason: collision with root package name */
    public yy4.a f269616e;

    /* renamed from: f, reason: collision with root package name */
    public int f269617f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f269618g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.p2444xd1075a44.C19513x2ed8bedc f269619h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f269620i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f269621m;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f269622n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f269623o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f269624p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f269625q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f269626r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f269627s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f269628t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f269629u;

    /* renamed from: v, reason: collision with root package name */
    public zy4.f f269630v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View.OnClickListener f269631w = new zy4.e(this);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d__;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        if (this.f269616e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WelabAppInfoUI", "info is null");
            return;
        }
        m78577x7b07e1a8(8);
        android.view.Window window = getWindow();
        window.clearFlags(201326592);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aav));
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().j().setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aav));
        }
        mo54448x9c8c0d33(new zy4.a(this));
        this.f269619h = (com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.p2444xd1075a44.C19513x2ed8bedc) findViewById(com.p314xaae8f345.mm.R.id.a19);
        this.f269620i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f269621m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ns9);
        this.f269622n = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.hat);
        this.f269623o = findViewById(com.p314xaae8f345.mm.R.id.f564763a20);
        this.f269624p = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kio);
        this.f269625q = findViewById(com.p314xaae8f345.mm.R.id.e0k);
        this.f269626r = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.btf);
        this.f269627s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ntu);
        this.f269628t = findViewById(com.p314xaae8f345.mm.R.id.njf);
        this.f269629u = findViewById(com.p314xaae8f345.mm.R.id.kib);
        this.f269622n.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this, 0, false));
        this.f269622n.setOverScrollMode(2);
        zy4.f fVar = new zy4.f(this);
        this.f269630v = fVar;
        this.f269622n.mo7960x6cab2c8d(fVar);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m78567x3bd95720(true);
        mo78530x8b45058f();
        android.content.Intent intent = getIntent();
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("para_appid");
            this.f269615d = stringExtra;
            yy4.a b17 = sy4.m.f495417c.b(stringExtra);
            this.f269616e = b17;
            this.f269617f = b17.f66637xda33d239;
            this.f269618g = getIntent().getIntExtra("para_from_with_red_point", 0) == 1;
        }
        mo43517x10010bd5();
        sy4.r.a(this.f269615d, 2, this.f269618g);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f269617f != this.f269616e.f66637xda33d239) {
            sy4.m mVar = sy4.m.f495417c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WelabAppInfoUI", "update welab info [%b] originSwitch[%d] newSwitch[%d]", java.lang.Boolean.valueOf(mVar.c().mo9952xce0038c9(this.f269616e, new java.lang.String[0])), java.lang.Integer.valueOf(this.f269617f), java.lang.Integer.valueOf(this.f269616e.f66637xda33d239));
            this.f269617f = this.f269616e.f66637xda33d239;
            r45.i54 i54Var = new r45.i54();
            r45.h54 h54Var = new r45.h54();
            yy4.a aVar = this.f269616e;
            h54Var.f457387d = aVar.f66651xe408a7d5 == 1 ? 0 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(aVar.f66653x29106093, 0);
            yy4.a aVar2 = this.f269616e;
            h54Var.f457388e = aVar2.f66634x369ad11;
            h54Var.f457389f = aVar2.f66637xda33d239 != 2 ? 2 : 1;
            i54Var.f458280d.add(h54Var);
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(207, i54Var));
            sy4.r.a(this.f269615d, this.f269616e.f66637xda33d239 == 2 ? 4 : 5, this.f269618g);
            if (this.f269616e.f66637xda33d239 == 2) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(this.f269616e);
                mVar.f(arrayList);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        java.lang.String str;
        super.onResume();
        if (!this.f269616e.y0()) {
            android.view.View view = this.f269623o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (this.f269616e.f66647x2253a77f != 1) {
            android.view.View view2 = this.f269623o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = this.f269623o;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f269627s.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_b) + this.f269616e.u0("field_Title"));
            android.content.SharedPreferences sharedPreferences = getSharedPreferences(getPackageName() + "_preferences", 0);
            this.f269626r.setEnabled(true);
            if (this.f269616e.f66637xda33d239 == 2) {
                sharedPreferences.edit().putBoolean("switch_" + this.f269616e.f66634x369ad11, true).commit();
                this.f269626r.m81392x52cfa5c6(true);
            } else {
                sharedPreferences.edit().putBoolean("switch_" + this.f269616e.f66634x369ad11, false).commit();
                this.f269626r.m81392x52cfa5c6(false);
            }
            this.f269626r.m81396xb3e0a10a(new zy4.b(this));
        }
        if (this.f269616e.y0()) {
            this.f269624p.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l__) + this.f269616e.u0("field_Title"));
            if (this.f269616e.f66647x2253a77f == 1) {
                this.f269624p.setVisibility(8);
            } else {
                this.f269624p.setVisibility(0);
                this.f269624p.setOnClickListener(new zy4.c(this));
            }
        } else {
            this.f269624p.setVisibility(8);
        }
        this.f269620i.setText(sy4.m.f495417c.a(this.f269616e));
        this.f269621m.setText(this.f269616e.u0("field_Introduce"));
        if (this.f269616e.y0()) {
            android.view.View view4 = this.f269625q;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setFeedbackState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setFeedbackState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f269625q.setOnClickListener(new zy4.d(this));
        } else {
            android.view.View view5 = this.f269625q;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setFeedbackState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setFeedbackState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f269616e.y0()) {
            android.view.View view6 = this.f269628t;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view7 = this.f269629u;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view8 = this.f269628t;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view9 = this.f269629u;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.String u07 = this.f269616e.u0("field_ImgUrl_android");
        if (android.text.TextUtils.isEmpty(u07)) {
            u07 = this.f269616e.u0("field_ImgUrl");
        }
        java.util.List asList = android.text.TextUtils.isEmpty(u07) ? java.util.Collections.EMPTY_LIST : java.util.Arrays.asList(u07.split(";"));
        java.util.Iterator it = asList.iterator();
        while (it.hasNext()) {
            if (android.text.TextUtils.isEmpty((java.lang.String) it.next())) {
                it.remove();
            }
        }
        if (asList.isEmpty()) {
            this.f269622n.setVisibility(8);
        } else {
            this.f269622n.setVisibility(0);
            zy4.f fVar = this.f269630v;
            fVar.f559211d = asList;
            fVar.m8146xced61ae5();
        }
        this.f269619h.m74960x9f2c333c(0.5f);
        n11.a b17 = n11.a.b();
        sy4.m mVar = sy4.m.f495417c;
        yy4.a aVar = this.f269616e;
        mVar.getClass();
        uy4.w e17 = mVar.e(aVar.f66634x369ad11);
        if (e17 != null) {
            str = e17.xe(aVar.f66634x369ad11);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WelabMgr", "get icon url from opener , appid %s, url %s", aVar.f66634x369ad11, str);
        } else {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = aVar.f66621x224e54be;
        }
        b17.h(str, this.f269619h, mVar.f495419b);
    }
}
