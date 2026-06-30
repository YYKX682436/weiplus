package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI */
/* loaded from: classes3.dex */
public final class ActivityC12967xcacb933e extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f175464u = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f175465d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f175466e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f175469h;

    /* renamed from: i, reason: collision with root package name */
    public rl5.r f175470i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f175471m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f175472n;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f175474p;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f175476r;

    /* renamed from: t, reason: collision with root package name */
    public int f175478t;

    /* renamed from: f, reason: collision with root package name */
    public final ir1.d f175467f = new ir1.d(this);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f175468g = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f175473o = jz5.h.b(new ir1.j(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f175475q = jz5.h.b(new ir1.l(this));

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f175477s = new ir1.e(this);

    public final void U6() {
        jz5.g gVar = this.f175473o;
        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) ((jz5.n) gVar).mo141623x754a37bb()).get();
        if (view != null) {
            view.removeCallbacks(this.f175477s);
        }
        android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) ((jz5.n) gVar).mo141623x754a37bb()).get();
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI", "dismissLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI", "dismissLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view2, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void V6() {
        gm0.j1.d().g(new ar1.j(this.f175471m, this.f175478t));
    }

    public final void W6() {
        android.view.View view;
        U6();
        android.view.View view2 = this.f175474p;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!this.f175468g.isEmpty()) {
            android.widget.ListView listView = this.f175465d;
            if (listView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                throw null;
            }
            listView.setVisibility(0);
            android.widget.TextView textView = this.f175466e;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
                throw null;
            }
        }
        android.widget.TextView textView2 = this.f175466e;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
            throw null;
        }
        textView2.setVisibility(0);
        android.widget.TextView textView3 = this.f175466e;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
            throw null;
        }
        textView3.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.n4y));
        android.widget.ListView listView2 = this.f175465d;
        if (listView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        if (listView2.getFooterViewsCount() > 0 && (view = this.f175476r) != null) {
            android.widget.ListView listView3 = this.f175465d;
            if (listView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                throw null;
            }
            listView3.removeFooterView(view);
        }
        android.widget.ListView listView4 = this.f175465d;
        if (listView4 != null) {
            listView4.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dzh;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.n4v));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ceg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f175465d = (android.widget.ListView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.dft);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f175466e = (android.widget.TextView) findViewById2;
        mo54448x9c8c0d33(new ir1.f(this));
        this.f175470i = new rl5.r(this);
        android.widget.ListView listView = this.f175465d;
        if (listView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        ir1.d dVar = this.f175467f;
        listView.setAdapter((android.widget.ListAdapter) dVar);
        android.widget.ListView listView2 = this.f175465d;
        if (listView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        listView2.setOnScrollListener(new ir1.g(this));
        dVar.f375484f = new ir1.h(this);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.oai);
        this.f175472n = findViewById3;
        if (findViewById3 != null) {
            findViewById3.postDelayed(this.f175477s, 400L);
        }
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.oav);
        this.f175474p = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new ir1.i(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f175478t = getIntent().getIntExtra("serviceType", 0);
        gm0.j1.d().a(25742, this);
        mo43517x10010bd5();
        V6();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(25742, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.view.View view;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansBlackListUI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        if (i17 == 0 && i18 == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.conversation.NetSceneBizFansGetBlackList");
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((ar1.j) m1Var).f94911d;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetBlackListResp");
            this.f175469h = ((r45.qb3) fVar).f465335f;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetBlackListResp");
            this.f175471m = ((r45.qb3) fVar2).f465334e;
            pm0.v.X(new ir1.k(this, m1Var));
            return;
        }
        U6();
        if (!this.f175468g.isEmpty() || (view = (android.view.View) ((java.lang.ref.WeakReference) ((jz5.n) this.f175475q).mo141623x754a37bb()).get()) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
