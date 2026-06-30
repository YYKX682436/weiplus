package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "zo1/c3", "zo1/d3", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI */
/* loaded from: classes5.dex */
public final class ActivityC12872x8baa24f8 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f174379x = {131072, 131075, 131081};

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f174380d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f174381e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f174382f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f174383g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f174384h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f174385i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f174386m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f174387n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f174388o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f174389p;

    /* renamed from: q, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f174390q;

    /* renamed from: r, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d f174391r;

    /* renamed from: t, reason: collision with root package name */
    public zo1.d3 f174393t;

    /* renamed from: u, reason: collision with root package name */
    public wo1.v f174394u;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f174392s = jz5.h.b(new zo1.k3(this));

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f174395v = new java.util.ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public long f174396w = 999;

    public static final void T6(final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8) {
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.c9) ((jz5.n) activityC12872x8baa24f8.f174392s).mo141623x754a37bb()).b();
        android.widget.ListView listView = activityC12872x8baa24f8.f174381e;
        if (listView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchResultLv");
            throw null;
        }
        listView.setVisibility(8);
        android.widget.RelativeLayout relativeLayout = activityC12872x8baa24f8.f174380d;
        if (relativeLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mainContentRl");
            throw null;
        }
        relativeLayout.setVisibility(0);
        activityC12872x8baa24f8.m78548x39037dd1();
        activityC12872x8baa24f8.mo78514x143f1b92().x0(activityC12872x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvh), new java.lang.Runnable() { // from class: zo1.e3
            @Override // java.lang.Runnable
            public final void run() {
                int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8.f174379x;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8.this.U6();
            }
        });
        activityC12872x8baa24f8.mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.mzg);
    }

    public final void U6() {
        finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559262q, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dxn;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        U6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m78560xe21cbbf(false);
        mo78514x143f1b92().x0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvh), new java.lang.Runnable() { // from class: zo1.h3
            @Override // java.lang.Runnable
            public final void run() {
                int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8.f174379x;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8.this.U6();
            }
        });
        mo78578x8b18f126(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.af_));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.mzg);
        java.lang.String stringExtra = getIntent().getStringExtra("contactAdapterClass");
        if (stringExtra == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectContactUI", "Adapter class must not be null");
            U6();
            return;
        }
        long longExtra = getIntent().getLongExtra("reportPageId", 999L);
        this.f174396w = longExtra;
        if (longExtra == 999) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectContactUI", "Fail to get report page id from intent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.b(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.f174100a, this.f174396w, 1L, null, 4, null);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.s4g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f174380d = (android.widget.RelativeLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.s4k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f174381e = (android.widget.ListView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.s4p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f174382f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.s4n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f174383g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.s4h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f174384h = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.s4c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f174385i = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.s4b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f174386m = (android.widget.LinearLayout) findViewById7;
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.s4f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f174387n = (android.widget.Button) findViewById8;
        android.view.View findViewById9 = findViewById(com.p314xaae8f345.mm.R.id.s4e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f174388o = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = findViewById(com.p314xaae8f345.mm.R.id.s4l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f174389p = (android.widget.TextView) findViewById10;
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.s4j)).setOnClickListener(new zo1.i3(this));
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.s4m)).setOnClickListener(new android.view.View.OnClickListener() { // from class: zo1.j3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View p07) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(p07);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
                int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8.f174379x;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8.this;
                android.view.View inflate = android.view.LayoutInflater.from(activityC12872x8baa24f8.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dvv, (android.view.ViewGroup) null);
                android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(inflate, -1, -2);
                android.widget.ListView listView = (android.widget.ListView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568601s73);
                wo1.v vVar = activityC12872x8baa24f8.f174394u;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(vVar);
                listView.setAdapter((android.widget.ListAdapter) vVar.m174237x2e226c01());
                listView.setOnItemClickListener(new zo1.u3(activityC12872x8baa24f8, popupWindow));
                android.view.View findViewById11 = activityC12872x8baa24f8.findViewById(com.p314xaae8f345.mm.R.id.s4i);
                popupWindow.setOutsideTouchable(true);
                popupWindow.setFocusable(true);
                popupWindow.setOnDismissListener(new zo1.w3(findViewById11, activityC12872x8baa24f8));
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById11, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI", "showSortPopWindow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById11.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById11, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI", "showSortPopWindow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sa5.d.c(findViewById11, 0.0f, 0L, null, 7, null);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = activityC12872x8baa24f8.f174383g;
                if (c22699x3dcdb352 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortTypeIv");
                    throw null;
                }
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f78551xb3b49691);
                popupWindow.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f576040yd);
                popupWindow.showAsDropDown(p07);
                yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f174384h;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contactRv");
            throw null;
        }
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
        this.f174390q = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this, 0, false);
        ((android.view.WindowManager) getSystemService("window")).getDefaultDisplay().getRealSize(new android.graphics.Point());
        this.f174391r = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(this, java.lang.Math.max((int) (r3.x / ((2 * getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.akx)) + getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.akw))), 1));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f174385i;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarRv");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f174390q;
        if (c1162x665295de == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarLayoutManagerLinear");
            throw null;
        }
        c1163xf1deaba42.mo7967x900dcbe1(c1162x665295de);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.mwe), false, 3, null);
        java.lang.String[] stringArrayExtra = getIntent().getStringArrayExtra("already_select_contact");
        if (stringArrayExtra != null) {
            kz5.h0.w(this.f174395v, stringArrayExtra);
        }
        android.content.Intent intent = getIntent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(intent, "getIntent(...)");
        ((ku5.t0) ku5.t0.f394148d).q(new zo1.g3(this, stringExtra, intent, f17));
    }
}
