package cw1;

/* loaded from: classes12.dex */
public final class e6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.l6 f304453d;

    public e6(cw1.l6 l6Var) {
        this.f304453d = l6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cw1.l6 l6Var = this.f304453d;
        l6Var.f304644f.q();
        l6Var.f304641c.mo146xb9724478(java.lang.Boolean.FALSE);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
