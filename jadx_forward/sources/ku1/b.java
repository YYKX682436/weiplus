package ku1;

/* loaded from: classes15.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt1.k f393596d;

    public b(ku1.c cVar, wt1.k kVar) {
        this.f393596d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/view/CardAcceptView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean isChecked = ((android.widget.CheckBox) view).isChecked();
        wt1.k kVar = this.f393596d;
        if (isChecked) {
            kVar.b().f537979w = true;
        } else {
            kVar.b().f537979w = false;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/view/CardAcceptView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
