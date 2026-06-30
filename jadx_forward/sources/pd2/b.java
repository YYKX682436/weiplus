package pd2;

/* loaded from: classes.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435076d;

    public b(android.view.View view) {
        this.f435076d = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic$refresh$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f435076d;
        db5.t7.g(view2.getContext(), view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.elc));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic$refresh$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
