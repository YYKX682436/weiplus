package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes2.dex */
public final class e0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public r45.qj2 f105217d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f105218e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f105219f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f105220g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f105221h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f105222i;

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f105223m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f105224n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f105225o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f105226p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f105227q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f105228r;

    /* renamed from: s, reason: collision with root package name */
    public int f105229s;

    /* renamed from: t, reason: collision with root package name */
    public long f105230t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f105231u;

    /* renamed from: v, reason: collision with root package name */
    public long f105232v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f105233w;

    /* renamed from: x, reason: collision with root package name */
    public int f105234x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f105225o = new java.util.ArrayList();
        this.f105226p = new java.util.ArrayList();
        this.f105227q = new java.util.ArrayList();
        this.f105233w = jz5.h.b(com.tencent.mm.plugin.finder.drama.drawer.b0.f105200d);
    }

    public final void O6(r45.qj2 qj2Var) {
        android.widget.FrameLayout frameLayout = this.f105218e;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = this.f105219f;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f105220g;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        android.app.Activity context2 = getContext();
        com.tencent.mm.ui.vas.VASActivity vASActivity = context2 instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) context2 : null;
        boolean z17 = (vASActivity != null ? vASActivity.getParentActivity() : null) instanceof com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineUI;
        long longExtra = getIntent().getLongExtra("native_drama_enter_object_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("native_drama_enter_dupflag");
        int intExtra = getIntent().getIntExtra("native_drama_enter_promotion_comment_scene", -1);
        km5.d T = pm0.v.T(new bq.s0(V6, qj2Var.getLong(0), this.f105230t, z17 ? longExtra : 0L, (!z17 || intExtra == -1) ? null : ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(longExtra, stringExtra, intExtra), getIntent().getStringExtra("native_drama_session_buffer")).l(), new com.tencent.mm.plugin.finder.drama.drawer.x(this, qj2Var, longExtra, stringExtra));
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        T.f(activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity : null);
    }

    public final void P6(int i17) {
        java.util.ArrayList arrayList = this.f105226p;
        java.util.Iterator it = arrayList.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            r45.bn2 bn2Var = (r45.bn2) ((zb2.b) it.next()).f471258d.getCustom(1);
            if (bn2Var != null && bn2Var.getInteger(2) == i17) {
                break;
            } else {
                i18++;
            }
        }
        if (i18 >= 0) {
            this.f105232v = ((zb2.b) arrayList.get(i18)).f471258d.getLong(0);
            com.tencent.mm.plugin.finder.drama.drawer.c0 c0Var = new com.tencent.mm.plugin.finder.drama.drawer.c0(getContext());
            c0Var.f12049a = i18;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f105222i;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("episodeRv");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.startSmoothScroll(c0Var);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById = getRootView().findViewById(com.tencent.mm.R.id.f486087uk2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f105218e = (android.widget.FrameLayout) findViewById;
        android.view.View findViewById2 = getRootView().findViewById(com.tencent.mm.R.id.oai);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f105219f = findViewById2;
        android.view.View findViewById3 = getRootView().findViewById(com.tencent.mm.R.id.oav);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f105220g = findViewById3;
        android.view.View findViewById4 = getRootView().findViewById(com.tencent.mm.R.id.t8f);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f105222i = (androidx.recyclerview.widget.RecyclerView) findViewById4;
        android.view.View findViewById5 = getRootView().findViewById(com.tencent.mm.R.id.uwh);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f105228r = (androidx.recyclerview.widget.RecyclerView) findViewById5;
        android.view.View findViewById6 = getRootView().findViewById(com.tencent.mm.R.id.uxe);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f105223m = (androidx.recyclerview.widget.RecyclerView) findViewById6;
        android.view.View findViewById7 = getRootView().findViewById(com.tencent.mm.R.id.f484130t53);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f105221h = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = getRootView().findViewById(com.tencent.mm.R.id.f484133t56);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f105224n = (android.view.ViewGroup) findViewById8;
        com.tencent.mm.ui.bk.s0(((android.widget.TextView) getRootView().findViewById(com.tencent.mm.R.id.f484131t54)).getPaint());
        com.tencent.mm.protobuf.f parseFrom = new r45.qj2().parseFrom(getIntent().getByteArrayExtra("native_drama_info"));
        r45.qj2 qj2Var = parseFrom instanceof r45.qj2 ? (r45.qj2) parseFrom : null;
        this.f105217d = qj2Var;
        if (qj2Var != null) {
            this.f105230t = getIntent().getLongExtra("native_drama_object_id", 0L);
            this.f105231u = getIntent().getStringExtra("native_drama_object_dup_flag");
            this.f105232v = this.f105230t;
            O6(qj2Var);
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            long j17 = qj2Var.getLong(0);
            long j18 = this.f105230t;
            java.lang.String str = this.f105231u;
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
            com.tencent.mm.plugin.finder.drama.drawer.z zVar2 = new com.tencent.mm.plugin.finder.drama.drawer.z(this, qj2Var);
            com.tencent.mm.plugin.finder.drama.drawer.a0 a0Var = com.tencent.mm.plugin.finder.drama.drawer.a0.f105198d;
            pq5.g l17 = new bq.c1(V6, j17, 0, null, j18, str).l();
            l17.f(mMActivity);
            pm0.v.T(l17, new cq.b1(zVar2, a0Var));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f105225o = new java.util.ArrayList();
        this.f105226p = new java.util.ArrayList();
        this.f105227q = new java.util.ArrayList();
        this.f105233w = jz5.h.b(com.tencent.mm.plugin.finder.drama.drawer.b0.f105200d);
    }
}
