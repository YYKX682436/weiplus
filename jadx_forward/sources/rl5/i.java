package rl5;

/* loaded from: classes15.dex */
public class i implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rl5.r f478853d;

    public i(rl5.r rVar) {
        this.f478853d = rVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/menu/MMPopupMenu$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        rl5.r rVar = this.f478853d;
        db5.t4 t4Var = rVar.f478887x;
        if (t4Var != null) {
            if (!rVar.K || i17 < 1) {
                t4Var.mo888x34063ac(rVar.f478889z.getItem(i17), i17);
            } else {
                t4Var.mo888x34063ac(rVar.f478889z.getItem(i17 - 1), i17);
            }
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e = rVar.f478873h;
        if (c21505x98c24a7e != null && c21505x98c24a7e.f279010g.isShowing()) {
            rVar.f478873h.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/menu/MMPopupMenu$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
