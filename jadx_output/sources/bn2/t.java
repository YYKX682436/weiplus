package bn2;

/* loaded from: classes14.dex */
public final class t implements bn2.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f22890a;

    /* renamed from: b, reason: collision with root package name */
    public final wm2.a f22891b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f22892c;

    /* renamed from: d, reason: collision with root package name */
    public final an2.i f22893d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f22894e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f22895f;

    /* renamed from: g, reason: collision with root package name */
    public xm2.a f22896g;

    /* renamed from: h, reason: collision with root package name */
    public final xm2.a0 f22897h;

    public t(android.view.ViewGroup containerView, wm2.a packages, android.view.ViewGroup navigatorContainerView, an2.i navigatorWidget) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(packages, "packages");
        kotlin.jvm.internal.o.g(navigatorContainerView, "navigatorContainerView");
        kotlin.jvm.internal.o.g(navigatorWidget, "navigatorWidget");
        this.f22890a = containerView;
        this.f22891b = packages;
        this.f22892c = navigatorContainerView;
        this.f22893d = navigatorWidget;
        android.view.View inflate = android.view.LayoutInflater.from(containerView.getContext()).inflate(com.tencent.mm.R.layout.e8z, containerView, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f22894e = viewGroup;
        this.f22895f = navigatorWidget.f8855a;
        bn2.s sVar = bn2.s.f22889d;
        bn2.r rVar = new bn2.r(this);
        lo0.g0 g0Var = packages.f447231e;
        this.f22897h = new xm2.a0(viewGroup, g0Var.f319993b, g0Var.f319996e, new ym2.d(), sVar, rVar);
    }

    @Override // bn2.p
    public android.view.ViewGroup a() {
        return this.f22895f;
    }

    @Override // bn2.p
    public android.view.ViewGroup e() {
        return this.f22894e;
    }

    @Override // bn2.p
    public void f() {
        this.f22893d.f8857c = new bn2.q(this);
        xm2.a0 a0Var = this.f22897h;
        int indexOf = a0Var.f455184a.indexOf(a0Var.f455189f);
        if (indexOf == -1) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = a0Var.f455191h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(indexOf));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget", "revealSelectedItem", "()V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget", "revealSelectedItem", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // bn2.p
    public void g(xm2.a aVar) {
        this.f22896g = aVar;
    }

    @Override // bn2.p
    public void h() {
        ko0.c0 c0Var = ko0.c0.f309825a;
        wm2.a aVar = this.f22891b;
        c0Var.h(aVar.f447231e);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", aVar.f447231e.f319996e.f319967a);
        jSONObject.put("result", java.lang.String.valueOf(aVar.f447231e.f319996e.f319974h));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f328382v, jSONObject.toString(), null, 4, null);
    }
}
