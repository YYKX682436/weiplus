package tv0;

/* loaded from: classes5.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tv0.j0 f503784d;

    public y(tv0.j0 j0Var) {
        this.f503784d = j0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/crop/CropMaterialPanelUIC$onPanelAttached$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f503784d.y7();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/crop/CropMaterialPanelUIC$onPanelAttached$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
