package vg2;

/* loaded from: classes3.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f518046d;

    public g1(vg2.r1 r1Var) {
        this.f518046d = r1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget$contentRootEntrance$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vg2.r1 r1Var = this.f518046d;
        android.view.ViewGroup viewGroup = r1Var.f518102j;
        ce2.i iVar = r1Var.f518100h;
        if (viewGroup != null && iVar != null) {
            r1Var.g();
            yz5.p pVar = r1Var.f518096d;
            if (pVar != null) {
                pVar.mo149xb9724478(viewGroup, iVar);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget$contentRootEntrance$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
