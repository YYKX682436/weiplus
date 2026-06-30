package an2;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f90388a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f90389b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f90390c;

    /* renamed from: d, reason: collision with root package name */
    public an2.b f90391d;

    /* renamed from: e, reason: collision with root package name */
    public final an2.f f90392e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f90393f;

    public i(android.view.ViewGroup navigatorLayout, java.util.List items, an2.b selectedItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigatorLayout, "navigatorLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedItem, "selectedItem");
        this.f90388a = navigatorLayout;
        this.f90389b = items;
        this.f90391d = selectedItem;
        an2.f fVar = new an2.f(items, selectedItem, new an2.h(this));
        this.f90392e = fVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) navigatorLayout.findViewById(com.p314xaae8f345.mm.R.id.ukf);
        android.content.Context context = navigatorLayout.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c1163xf1deaba4.mo7967x900dcbe1(new an2.g(context));
        c1163xf1deaba4.mo7960x6cab2c8d(fVar);
        this.f90393f = c1163xf1deaba4;
    }

    public final void a(an2.b value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f90391d, value)) {
            return;
        }
        this.f90391d = value;
        an2.f fVar = this.f90392e;
        fVar.getClass();
        fVar.f90381e = value;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView = this.f90393f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recyclerView, "recyclerView");
        for (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var : oj5.x.b(recyclerView)) {
            an2.e eVar = k3Var instanceof an2.e ? (an2.e) k3Var : null;
            if (eVar != null) {
                eVar.i(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.f90379f, value));
            }
        }
        int indexOf = this.f90389b.indexOf(this.f90391d);
        if (indexOf >= 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f90393f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(indexOf));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/navigators/FinderLiveBeautyNavigatorWidget", "revealSelectedItem", "()V", "Undefined", "scrollToPosition", "(I)V");
            c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/navigators/FinderLiveBeautyNavigatorWidget", "revealSelectedItem", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
    }
}
