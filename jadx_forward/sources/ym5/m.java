package ym5;

/* loaded from: classes10.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.h f544968d;

    public m(ym5.h hVar) {
        this.f544968d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/BaseDrawingView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ym5.h hVar = this.f544968d;
        if (hVar.mo177319xb073c692().getVisibility() == 0) {
            ((l45.n) hVar.m177317xc879b3f2()).o();
        } else {
            qk.i6 i6Var = ((l45.n) hVar.m177317xc879b3f2()).f397997e;
            if (i6Var != null) {
                i6Var.m5();
            }
        }
        yj0.a.h(this, "com/tencent/mm/view/BaseDrawingView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
