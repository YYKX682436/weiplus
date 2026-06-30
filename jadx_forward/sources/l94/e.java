package l94;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: e, reason: collision with root package name */
    public static final l94.b f398873e = new l94.b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f398874f;

    /* renamed from: g, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 f398875g;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f398876a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f398877b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f398878c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f398879d;

    static {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 a17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.a(0, 3, u26.u.DROP_OLDEST);
        f398874f = a17;
        f398875g = a17;
    }

    public e(java.lang.String componentName, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(componentName, "componentName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f398876a = context;
        this.f398877b = componentName;
        this.f398879d = new java.util.ArrayList();
    }

    public final void b(l94.e component, android.view.ViewGroup viewGroup) {
        jz5.f0 f0Var;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addChild", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f398879d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            f0Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((l94.a) obj).a(), component)) {
                    break;
                }
            }
        }
        l94.a aVar = (l94.a) obj;
        java.lang.String str = this.f398877b;
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "there is already an same component");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addChild", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
            return;
        }
        l94.a aVar2 = new l94.a(component, null, 2, null);
        arrayList.add(aVar2);
        if (viewGroup == null) {
            viewGroup = m();
        }
        if (viewGroup != null) {
            a84.y0.b(viewGroup, component.i(), -1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setParentView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$ChildComponentState");
            aVar2.f398853b = viewGroup;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setParentView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$ChildComponentState");
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "the parent is null, when add child component");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addChild", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
    }

    public final void c(h94.a foldAdInfo) {
        p3325xe03a0797.p3326xc267989b.y0 b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(foldAdInfo, "foldAdInfo");
        android.view.View view = this.f398878c;
        java.lang.String str = this.f398877b;
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "the associateView is not initialized!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
            return;
        }
        j(foldAdInfo);
        java.util.Iterator it = this.f398879d.iterator();
        while (it.hasNext()) {
            ((l94.a) it.next()).a().c(foldAdInfo);
        }
        if (g()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMainScope", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
            android.content.Context context = this.f398876a;
            if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
                b17 = v65.m.b((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "the context is not AppCompatActivity");
                b17 = p3325xe03a0797.p3326xc267989b.z0.b();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMainScope", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
            p3325xe03a0797.p3326xc267989b.l.d(b17, null, null, new l94.d(this, foldAdInfo, null), 3, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
    }

    public final android.view.View d() {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        this.f398878c = k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBuildChildren", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f398879d;
        boolean isEmpty = arrayList.isEmpty();
        java.lang.String str = this.f398877b;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "there is no child");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBuildChildren", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        } else {
            android.view.ViewGroup m17 = m();
            if (m17 != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    l94.a aVar = (l94.a) it.next();
                    aVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getParentView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$ChildComponentState");
                    android.view.ViewGroup viewGroup = aVar.f398853b;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getParentView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$ChildComponentState");
                    if (viewGroup == null && !a84.y0.f(aVar.a().i())) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setParentView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$ChildComponentState");
                        aVar.f398853b = m17;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setParentView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$ChildComponentState");
                        m17.addView(aVar.a().i());
                    }
                }
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "the component can't be have child!!");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBuildChildren", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        }
        android.view.View e17 = e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        return e17;
    }

    public final android.view.View e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAssociateView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        android.view.View view = this.f398878c;
        if (view != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAssociateView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("associateView");
        throw null;
    }

    public final android.content.Context f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContext", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContext", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        return this.f398876a;
    }

    public boolean g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShouldRegisterEventHandler", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShouldRegisterEventHandler", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        return false;
    }

    public final java.lang.String h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        return this.f398877b;
    }

    public final android.view.View i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        if (this.f398878c == null) {
            this.f398878c = d();
        }
        android.view.View e17 = e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        return e17;
    }

    public void j(h94.a adInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adInfo, "adInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
    }

    public abstract android.view.View k();

    public void l(h94.a adInfo, l94.l eventData) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onHandleViewEventData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adInfo, "adInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventData, "eventData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHandleViewEventData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
    }

    public final android.view.ViewGroup m() {
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toViewGroup", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        if (this.f398878c == null || !(e() instanceof android.view.ViewGroup)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f398877b, "the component view is not view group");
            viewGroup = null;
        } else {
            viewGroup = (android.view.ViewGroup) e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toViewGroup", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        return viewGroup;
    }
}
