package ab5;

/* loaded from: classes9.dex */
public class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab5.i0 f2926d;

    public d0(ab5.i0 i0Var) {
        this.f2926d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/appbrand/AppBrandServiceImageBubble$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ab5.i0 i0Var = this.f2926d;
        ab5.h0 h0Var = i0Var.f2961q;
        if (h0Var != null) {
            h0Var.a();
        }
        i0Var.f2953f.dismiss();
        yj0.a.h(this, "com/tencent/mm/ui/appbrand/AppBrandServiceImageBubble$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
