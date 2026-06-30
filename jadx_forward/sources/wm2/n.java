package wm2;

/* loaded from: classes14.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f528784a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f528785b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f528786c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f528787d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f528788e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f528789f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f528790g;

    /* renamed from: h, reason: collision with root package name */
    public final wm2.l f528791h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f528792i;

    public n(p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 rootLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootLayout, "rootLayout");
        this.f528784a = rootLayout;
        this.f528790g = new java.util.ArrayList();
        this.f528791h = new wm2.l(this);
        rootLayout.setAlpha(0.0f);
        android.view.View findViewById = rootLayout.findViewById(com.p314xaae8f345.mm.R.id.bz6);
        findViewById.setOnClickListener(new wm2.c(this));
        this.f528785b = findViewById;
        android.view.View findViewById2 = rootLayout.findViewById(com.p314xaae8f345.mm.R.id.aa9);
        findViewById2.setOnClickListener(new wm2.d(this));
        this.f528786c = findViewById2;
        android.view.View findViewById3 = rootLayout.findViewById(com.p314xaae8f345.mm.R.id.f568187uz4);
        findViewById3.setOnClickListener(new wm2.e(this));
        this.f528787d = findViewById3;
        android.view.View findViewById4 = rootLayout.findViewById(com.p314xaae8f345.mm.R.id.f565469t00);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f528788e = (android.widget.FrameLayout) findViewById4;
        android.view.View findViewById5 = rootLayout.findViewById(com.p314xaae8f345.mm.R.id.uke);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f528789f = (android.widget.FrameLayout) findViewById5;
    }

    public final void a(boolean z17, boolean z18) {
        if (((java.util.ArrayList) this.f528790g).isEmpty()) {
            return;
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.f528784a;
        if (z17) {
            c1073x7e08a787.animate().translationY(c1073x7e08a787.getHeight()).alpha(0.0f).setDuration(200L).withEndAction(new wm2.m(this, z18)).start();
            return;
        }
        c1073x7e08a787.setAlpha(0.0f);
        c();
        yz5.l lVar = this.f528792i;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(z18));
        }
    }

    public final void b() {
        java.util.List list = this.f528790g;
        if (!list.isEmpty()) {
            return;
        }
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
        boolean z17 = c1Var != null ? c1Var.O3 : true;
        lo0.t b17 = ko0.l.f391403a.b();
        dk2.ug ugVar = dk2.ug.f315751a;
        wm2.a aVar = new wm2.a(b17, dk2.ug.f315752b, ko0.l0.f391411a.b(), z17, ko0.c0.f391358a.b());
        android.widget.FrameLayout containerView = this.f528788e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        android.widget.FrameLayout navigatorContainerView = this.f528789f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigatorContainerView, "navigatorContainerView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String string = navigatorContainerView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dtw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        arrayList.add(new an2.k(string, an2.j.f90394d));
        if (aVar.f528761b) {
            java.lang.String string2 = navigatorContainerView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dub);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            arrayList.add(new an2.k(string2, an2.j.f90395e));
        }
        if (aVar.f528763d) {
            java.lang.String string3 = navigatorContainerView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.du7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            arrayList.add(new an2.k(string3, an2.j.f90396f));
        }
        android.view.View inflate = android.view.LayoutInflater.from(navigatorContainerView.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e8v, (android.view.ViewGroup) navigatorContainerView, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        bn2.o oVar = new bn2.o(containerView, aVar, navigatorContainerView, new an2.i((android.view.ViewGroup) inflate, arrayList, (an2.b) kz5.n0.X(arrayList)));
        oVar.f104416g = this.f528791h;
        ((java.util.ArrayList) list).add(oVar);
        containerView.addView(oVar.f104414e);
        android.view.ViewGroup viewGroup = oVar.f104415f;
        if (viewGroup != null) {
            navigatorContainerView.addView(viewGroup);
        }
        oVar.d();
        oVar.f();
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.f528784a;
        c1073x7e08a787.setTranslationY(c1073x7e08a787.getHeight());
        c1073x7e08a787.setAlpha(0.0f);
        c1073x7e08a787.animate().translationY(0.0f).alpha(1.0f).setDuration(200L).start();
    }

    public final void c() {
        while (true) {
            java.util.List list = this.f528790g;
            if (!(!list.isEmpty())) {
                this.f528788e.removeAllViews();
                this.f528789f.removeAllViews();
                android.view.View view = this.f528785b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautyUnifiedPanelWidget", "resetState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautyUnifiedPanelWidget", "resetState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.View view2 = this.f528786c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautyUnifiedPanelWidget", "resetState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautyUnifiedPanelWidget", "resetState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.View view3 = this.f528787d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautyUnifiedPanelWidget", "resetState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautyUnifiedPanelWidget", "resetState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                return;
            }
            bn2.p pVar = (bn2.p) kz5.n0.i0(list);
            pVar.getClass();
            pVar.h();
            ((java.util.ArrayList) list).remove(list.size() - 1);
        }
    }
}
