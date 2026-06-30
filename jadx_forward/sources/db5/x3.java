package db5;

/* loaded from: classes15.dex */
public class x3 implements android.widget.AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e f310103d;

    public x3(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e) {
        this.f310103d = c21505x98c24a7e;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        db5.y3 y3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMListPopupWindow$2", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (i17 != -1 && (y3Var = this.f310103d.f279012i) != null) {
            y3Var.f310112d = false;
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/MMListPopupWindow$2", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
    }
}
