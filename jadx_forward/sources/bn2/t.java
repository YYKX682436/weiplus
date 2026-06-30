package bn2;

/* loaded from: classes14.dex */
public final class t implements bn2.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f104423a;

    /* renamed from: b, reason: collision with root package name */
    public final wm2.a f104424b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f104425c;

    /* renamed from: d, reason: collision with root package name */
    public final an2.i f104426d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f104427e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f104428f;

    /* renamed from: g, reason: collision with root package name */
    public xm2.a f104429g;

    /* renamed from: h, reason: collision with root package name */
    public final xm2.a0 f104430h;

    public t(android.view.ViewGroup containerView, wm2.a packages, android.view.ViewGroup navigatorContainerView, an2.i navigatorWidget) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packages, "packages");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigatorContainerView, "navigatorContainerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigatorWidget, "navigatorWidget");
        this.f104423a = containerView;
        this.f104424b = packages;
        this.f104425c = navigatorContainerView;
        this.f104426d = navigatorWidget;
        android.view.View inflate = android.view.LayoutInflater.from(containerView.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e8z, containerView, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f104427e = viewGroup;
        this.f104428f = navigatorWidget.f90388a;
        bn2.s sVar = bn2.s.f104422d;
        bn2.r rVar = new bn2.r(this);
        lo0.g0 g0Var = packages.f528764e;
        this.f104430h = new xm2.a0(viewGroup, g0Var.f401526b, g0Var.f401529e, new ym2.d(), sVar, rVar);
    }

    @Override // bn2.p
    public android.view.ViewGroup a() {
        return this.f104428f;
    }

    @Override // bn2.p
    public android.view.ViewGroup e() {
        return this.f104427e;
    }

    @Override // bn2.p
    public void f() {
        this.f104426d.f90390c = new bn2.q(this);
        xm2.a0 a0Var = this.f104430h;
        int indexOf = a0Var.f536717a.indexOf(a0Var.f536722f);
        if (indexOf == -1) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = a0Var.f536724h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(indexOf));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget", "revealSelectedItem", "()V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget", "revealSelectedItem", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // bn2.p
    public void g(xm2.a aVar) {
        this.f104429g = aVar;
    }

    @Override // bn2.p
    public void h() {
        ko0.c0 c0Var = ko0.c0.f391358a;
        wm2.a aVar = this.f104424b;
        c0Var.h(aVar.f528764e);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", aVar.f528764e.f401529e.f401500a);
        jSONObject.put("result", java.lang.String.valueOf(aVar.f528764e.f401529e.f401507h));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f409915v, jSONObject.toString(), null, 4, null);
    }
}
