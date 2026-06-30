package com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui;

@gm0.a2
/* renamed from: com.tencent.mm.plugin.welab.ui.WelabMainUI */
/* loaded from: classes15.dex */
public class ActivityC19512xacf356cc extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.Map f269632q = new zy4.j();

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f269634e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f269635f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f269636g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f269637h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f269638i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f269639m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f269640n;

    /* renamed from: d, reason: collision with root package name */
    public boolean f269633d = false;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Comparator f269641o = new zy4.k(this);

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnClickListener f269642p = new zy4.l(this);

    public final void T6(yy4.a aVar, android.widget.LinearLayout linearLayout) {
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d_9, (android.view.ViewGroup) linearLayout, false);
        android.widget.ImageView imageView = (android.widget.ImageView) linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.f568875od0);
        android.widget.ImageView imageView2 = (android.widget.ImageView) linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.a19);
        android.widget.TextView textView = (android.widget.TextView) linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.obc);
        android.widget.TextView textView2 = (android.widget.TextView) linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.ns9);
        android.widget.TextView textView3 = (android.widget.TextView) linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.oq7);
        if (az4.h.f97712c.a(aVar)) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
            rn3.i.Di().k(new zy4.m(imageView, textView3, aVar, linearLayout2));
        }
        n11.a b17 = n11.a.b();
        java.lang.String u07 = aVar.u0("field_ThumbUrl");
        sy4.m mVar = sy4.m.f495417c;
        b17.h(u07, imageView2, mVar.f495419b);
        textView.setText(mVar.a(aVar));
        textView2.setText(aVar.u0("field_Desc"));
        linearLayout2.setTag(aVar);
        linearLayout2.setOnClickListener(this.f269642p);
        linearLayout.addView(linearLayout2);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d_a;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.l_a);
        m78590x1b667a00(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aav));
        m78554x41d7d42(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        this.f269634e = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.ki9);
        this.f269636g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.ki_);
        this.f269635f = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.njd);
        this.f269637h = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.nje);
        this.f269638i = findViewById(com.p314xaae8f345.mm.R.id.l5f);
        this.f269639m = findViewById(com.p314xaae8f345.mm.R.id.kbt);
        this.f269638i.setOnClickListener(new zy4.h(this));
        mo54448x9c8c0d33(new zy4.i(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m78567x3bd95720(true);
        mo78530x8b45058f();
        if (getIntent() != null) {
            this.f269633d = getIntent().getIntExtra("para_from_with_red_point", 0) == 1;
            this.f269640n = getIntent().getStringArrayListExtra("key_exclude_apps");
        }
        mo43517x10010bd5();
        az4.h hVar = az4.h.f97712c;
        hVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d().edit().putBoolean("key_has_enter_welab", true).commit();
        hVar.c();
        sy4.r.a("", 1, this.f269633d);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f269636g.removeAllViews();
        this.f269637h.removeAllViews();
        java.util.List d17 = sy4.m.f495417c.d();
        java.util.ArrayList arrayList = (java.util.ArrayList) d17;
        boolean isEmpty = arrayList.isEmpty();
        java.util.Comparator comparator = this.f269641o;
        if (isEmpty) {
            this.f269634e.setVisibility(8);
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                yy4.a aVar = (yy4.a) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f66634x369ad11) && this.f269640n.contains(aVar.f66634x369ad11)) {
                    it.remove();
                }
            }
            if (arrayList.isEmpty()) {
                this.f269634e.setVisibility(8);
            } else {
                this.f269634e.setVisibility(0);
                java.util.Collections.sort(d17, comparator);
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    T6((yy4.a) it6.next(), this.f269636g);
                }
                this.f269636g.getChildCount();
            }
        }
        java.util.List y07 = sy4.m.f495417c.c().y0();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) y07;
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            yy4.a aVar2 = (yy4.a) it7.next();
            long currentTimeMillis = (java.lang.System.currentTimeMillis() / 1000) - aVar2.f66652x14d4a3e3;
            sy4.m mVar = sy4.m.f495417c;
            if (currentTimeMillis >= 2592000 || "labs1de6f3".equals(aVar2.f66634x369ad11)) {
                it7.remove();
                mVar.c().mo9951xb06685ab(aVar2, new java.lang.String[0]);
            } else if (aVar2.w0() && aVar2.f66637xda33d239 != 3) {
                aVar2.f66637xda33d239 = 3;
                mVar.c().mo9952xce0038c9(aVar2, new java.lang.String[0]);
            } else if (aVar2.f66637xda33d239 != 3) {
                it7.remove();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WelabMgr", "stopped lab %s", y07.toString());
        if (arrayList2.isEmpty()) {
            this.f269635f.setVisibility(8);
        } else {
            this.f269635f.setVisibility(0);
            java.util.Collections.sort(y07, comparator);
            java.util.Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                T6((yy4.a) it8.next(), this.f269637h);
            }
            this.f269637h.getChildCount();
        }
        if (this.f269634e.getVisibility() == 0 || this.f269635f.getVisibility() == 0) {
            android.view.View view = this.f269639m;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/welab/ui/WelabMainUI", "setNoAppView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/welab/ui/WelabMainUI", "setNoAppView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f269639m;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/welab/ui/WelabMainUI", "setNoAppView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/welab/ui/WelabMainUI", "setNoAppView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
