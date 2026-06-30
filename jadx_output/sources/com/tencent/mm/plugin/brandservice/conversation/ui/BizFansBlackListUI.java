package com.tencent.mm.plugin.brandservice.conversation.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BizFansBlackListUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f93931u = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f93932d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f93933e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f93936h;

    /* renamed from: i, reason: collision with root package name */
    public rl5.r f93937i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f93938m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f93939n;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f93941p;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f93943r;

    /* renamed from: t, reason: collision with root package name */
    public int f93945t;

    /* renamed from: f, reason: collision with root package name */
    public final ir1.d f93934f = new ir1.d(this);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f93935g = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f93940o = jz5.h.b(new ir1.j(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f93942q = jz5.h.b(new ir1.l(this));

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f93944s = new ir1.e(this);

    public final void U6() {
        jz5.g gVar = this.f93940o;
        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) ((jz5.n) gVar).getValue()).get();
        if (view != null) {
            view.removeCallbacks(this.f93944s);
        }
        android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) ((jz5.n) gVar).getValue()).get();
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        gm0.j1.d().g(new ar1.j(this.f93938m, this.f93945t));
    }

    public final void W6() {
        android.view.View view;
        U6();
        android.view.View view2 = this.f93941p;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!this.f93935g.isEmpty()) {
            android.widget.ListView listView = this.f93932d;
            if (listView == null) {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
            listView.setVisibility(0);
            android.widget.TextView textView = this.f93933e;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("emptyTip");
                throw null;
            }
        }
        android.widget.TextView textView2 = this.f93933e;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("emptyTip");
            throw null;
        }
        textView2.setVisibility(0);
        android.widget.TextView textView3 = this.f93933e;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("emptyTip");
            throw null;
        }
        textView3.setText(getString(com.tencent.mm.R.string.n4y));
        android.widget.ListView listView2 = this.f93932d;
        if (listView2 == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        if (listView2.getFooterViewsCount() > 0 && (view = this.f93943r) != null) {
            android.widget.ListView listView3 = this.f93932d;
            if (listView3 == null) {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
            listView3.removeFooterView(view);
        }
        android.widget.ListView listView4 = this.f93932d;
        if (listView4 != null) {
            listView4.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dzh;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(getString(com.tencent.mm.R.string.n4v));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ceg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f93932d = (android.widget.ListView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.dft);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f93933e = (android.widget.TextView) findViewById2;
        setBackBtn(new ir1.f(this));
        this.f93937i = new rl5.r(this);
        android.widget.ListView listView = this.f93932d;
        if (listView == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        ir1.d dVar = this.f93934f;
        listView.setAdapter((android.widget.ListAdapter) dVar);
        android.widget.ListView listView2 = this.f93932d;
        if (listView2 == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        listView2.setOnScrollListener(new ir1.g(this));
        dVar.f293951f = new ir1.h(this);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.oai);
        this.f93939n = findViewById3;
        if (findViewById3 != null) {
            findViewById3.postDelayed(this.f93944s, 400L);
        }
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.oav);
        this.f93941p = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new ir1.i(this));
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f93945t = getIntent().getIntExtra("serviceType", 0);
        gm0.j1.d().a(25742, this);
        initView();
        V6();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(25742, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        android.view.View view;
        com.tencent.mars.xlog.Log.i("BizFans.BizFansBlackListUI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        if (i17 == 0 && i18 == 0) {
            kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.conversation.NetSceneBizFansGetBlackList");
            com.tencent.mm.modelbase.o oVar = ((ar1.j) m1Var).f13378d;
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetBlackListResp");
            this.f93936h = ((r45.qb3) fVar).f383802f;
            com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetBlackListResp");
            this.f93938m = ((r45.qb3) fVar2).f383801e;
            pm0.v.X(new ir1.k(this, m1Var));
            return;
        }
        U6();
        if (!this.f93935g.isEmpty() || (view = (android.view.View) ((java.lang.ref.WeakReference) ((jz5.n) this.f93942q).getValue()).get()) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
