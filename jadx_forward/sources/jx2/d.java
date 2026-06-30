package jx2;

/* loaded from: classes3.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jx2.h f383939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f383940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f383941f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jx2.k f383942g;

    public d(jx2.h hVar, android.view.View view, android.content.Context context, jx2.k kVar) {
        this.f383939d = hVar;
        this.f383940e = view;
        this.f383941f = context;
        this.f383942g = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$showFirstPage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jx2.h.a(this.f383939d, this.f383940e, this.f383941f);
        ku5.u0 u0Var = ku5.t0.f394148d;
        jx2.c cVar = new jx2.c(this.f383942g, this.f383941f, this.f383939d);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(cVar, 200L, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$showFirstPage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
