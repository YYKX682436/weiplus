package fl1;

/* loaded from: classes7.dex */
public final class o1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.p1 f345370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.h1 f345371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f345372f;

    public o1(fl1.p1 p1Var, fl1.h1 h1Var, int i17) {
        this.f345370d = p1Var;
        this.f345371e = h1Var;
        this.f345372f = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AuthorizeOptionalListAdapter$ViewHolder$applyData$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        fl1.p1 p1Var = this.f345370d;
        fl1.j1 j1Var = p1Var.f345377f.f345386f;
        if (j1Var != null) {
            j1Var.a(p1Var.f345375d, this.f345371e, this.f345372f);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/widget/dialog/AuthorizeOptionalListAdapter$ViewHolder$applyData$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
