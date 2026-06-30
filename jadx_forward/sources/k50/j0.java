package k50;

/* loaded from: classes.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k50.k0 f385764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k50.h0 f385765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f385766f;

    public j0(k50.k0 k0Var, k50.h0 h0Var, int i17) {
        this.f385764d = k0Var;
        this.f385765e = h0Var;
        this.f385766f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/forward/ForwardToOtherAppsSheetUIC$AppListAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f385764d.f385769e.mo149xb9724478(this.f385765e, java.lang.Integer.valueOf(this.f385766f));
        yj0.a.h(this, "com/tencent/mm/feature/forward/ForwardToOtherAppsSheetUIC$AppListAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
