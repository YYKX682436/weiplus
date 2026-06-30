package an2;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f8855a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f8856b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f8857c;

    /* renamed from: d, reason: collision with root package name */
    public an2.b f8858d;

    /* renamed from: e, reason: collision with root package name */
    public final an2.f f8859e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f8860f;

    public i(android.view.ViewGroup navigatorLayout, java.util.List items, an2.b selectedItem) {
        kotlin.jvm.internal.o.g(navigatorLayout, "navigatorLayout");
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(selectedItem, "selectedItem");
        this.f8855a = navigatorLayout;
        this.f8856b = items;
        this.f8858d = selectedItem;
        an2.f fVar = new an2.f(items, selectedItem, new an2.h(this));
        this.f8859e = fVar;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) navigatorLayout.findViewById(com.tencent.mm.R.id.ukf);
        android.content.Context context = navigatorLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        recyclerView.setLayoutManager(new an2.g(context));
        recyclerView.setAdapter(fVar);
        this.f8860f = recyclerView;
    }

    public final void a(an2.b value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (kotlin.jvm.internal.o.b(this.f8858d, value)) {
            return;
        }
        this.f8858d = value;
        an2.f fVar = this.f8859e;
        fVar.getClass();
        fVar.f8848e = value;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f8860f;
        kotlin.jvm.internal.o.f(recyclerView, "recyclerView");
        for (androidx.recyclerview.widget.k3 k3Var : oj5.x.b(recyclerView)) {
            an2.e eVar = k3Var instanceof an2.e ? (an2.e) k3Var : null;
            if (eVar != null) {
                eVar.i(kotlin.jvm.internal.o.b(eVar.f8846f, value));
            }
        }
        int indexOf = this.f8856b.indexOf(this.f8858d);
        if (indexOf >= 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f8860f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(indexOf));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/navigators/FinderLiveBeautyNavigatorWidget", "revealSelectedItem", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView2.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView2, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/navigators/FinderLiveBeautyNavigatorWidget", "revealSelectedItem", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
    }
}
