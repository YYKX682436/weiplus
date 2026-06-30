package vw3;

/* loaded from: classes.dex */
public final class l4 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f522557d;

    public l4(android.view.View view) {
        this.f522557d = view;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerResDownloadUI$onCreate$2$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.widget.Toast.makeText(this.f522557d.getContext(), "Fore Clean Ads Data", 1000).show();
        ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Ni();
        yj0.a.i(true, this, "com/tencent/mm/plugin/repairer/ui/RepairerResDownloadUI$onCreate$2$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
