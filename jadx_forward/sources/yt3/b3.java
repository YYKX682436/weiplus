package yt3;

/* loaded from: classes10.dex */
public final class b3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.d3 f546904d;

    public b3(yt3.d3 d3Var) {
        this.f546904d = d3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/RecordBeautifyPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yt3.d3 d3Var = this.f546904d;
        if (d3Var.f546942h) {
            boolean z17 = !d3Var.f546943i;
            d3Var.f546943i = z17;
            d3Var.a(z17);
        } else {
            boolean z18 = !d3Var.f546944m;
            d3Var.f546944m = z18;
            d3Var.a(z18);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/RecordBeautifyPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
