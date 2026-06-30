package ym5;

/* loaded from: classes10.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.h f544955d;

    public l(ym5.h hVar) {
        this.f544955d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/BaseDrawingView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ym5.h hVar = this.f544955d;
        if (hVar.mo177319xb073c692().getVisibility() == 0) {
            l45.q m177317xc879b3f2 = hVar.m177317xc879b3f2();
            android.text.Editable text = hVar.f544890t.getText();
            int currentTextColor = hVar.f544890t.getCurrentTextColor();
            int intValue = hVar.f544891u.getCurMode() == 3 ? ((java.lang.Integer) hVar.f544891u.getTag()).intValue() : 0;
            l45.n nVar = (l45.n) m177317xc879b3f2;
            nVar.getClass();
            if (text != null) {
                nVar.s(text.toString(), currentTextColor, intValue, "");
            }
        } else {
            qk.i6 i6Var = ((l45.n) hVar.m177317xc879b3f2()).f397997e;
            if (i6Var != null) {
                i6Var.mo60944x42fe6352();
            }
        }
        yj0.a.h(this, "com/tencent/mm/view/BaseDrawingView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
