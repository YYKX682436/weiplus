package j93;

/* loaded from: classes.dex */
public final class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.p2 f379941d;

    public i2(j93.p2 p2Var) {
        this.f379941d = p2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/uic/SelectLabelFooterViewUIC$initFooterView$2$view$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j93.p2.U6(this.f379941d);
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/uic/SelectLabelFooterViewUIC$initFooterView$2$view$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
