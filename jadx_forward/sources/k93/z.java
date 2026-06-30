package k93;

/* loaded from: classes11.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 f387464d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd3130) {
        this.f387464d = c16180x2cdd3130;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/widget/MMLabelPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd3130 = this.f387464d;
        k93.b0 b0Var = c16180x2cdd3130.S;
        if (b0Var != null) {
            b0Var.a(c16180x2cdd3130.Q);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/widget/MMLabelPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
