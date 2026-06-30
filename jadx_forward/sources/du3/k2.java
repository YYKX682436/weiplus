package du3;

/* loaded from: classes3.dex */
public final class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.s2 f325174d;

    public k2(du3.s2 s2Var) {
        this.f325174d = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoMosaicPlugin$initLogic$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        du3.s2 s2Var = this.f325174d;
        hk0.z0 S6 = s2Var.D().S6();
        hk0.z0 z0Var = hk0.z0.f363396e;
        if (S6 != z0Var) {
            s2Var.f325235n = z0Var;
            s2Var.D().g7(z0Var, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoMosaicPlugin$initLogic$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
