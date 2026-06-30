package bp4;

/* loaded from: classes8.dex */
public final class f3 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f23169f;

    /* renamed from: g, reason: collision with root package name */
    public final bp4.e3 f23170g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23169f = parent.findViewById(com.tencent.mm.R.id.o19);
        android.view.View findViewById = parent.findViewById(com.tencent.mm.R.id.f487257o15);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        bp4.e3 e3Var = new bp4.e3();
        this.f23170g = e3Var;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(parent.getContext());
        linearLayoutManager.Q(0);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new androidx.recyclerview.widget.z());
        recyclerView.setHasFixedSize(true);
        java.util.LinkedList list = so4.g.f410779d;
        kotlin.jvm.internal.o.g(list, "list");
        java.util.ArrayList arrayList = e3Var.f23155d;
        arrayList.clear();
        arrayList.addAll(list);
        e3Var.notifyDataSetChanged();
        recyclerView.setAdapter(e3Var);
        e3Var.f23157f = new bp4.c3(status);
        e3Var.f23156e = 0;
        e3Var.notifyDataSetChanged();
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        android.view.View view = this.f23169f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final so4.b z() {
        bp4.e3 e3Var = this.f23170g;
        java.lang.Object obj = e3Var.f23155d.get(e3Var.f23156e);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return (so4.b) obj;
    }
}
