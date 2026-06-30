package x92;

/* loaded from: classes2.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x92.e f534206d;

    public d(x92.e eVar) {
        this.f534206d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC$initViews$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        x92.e eVar = this.f534206d;
        if (eVar.f534218u == null) {
            v92.g X6 = eVar.X6();
            eVar.f534218u = X6;
            if (X6 != null) {
                X6.q();
            }
        }
        v92.g gVar = eVar.f534218u;
        if (gVar != null) {
            gVar.u();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC$initViews$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
