package vw0;

/* loaded from: classes5.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vw0.i0 f522350d;

    public x(vw0.i0 i0Var) {
        this.f522350d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vw0.i0 i0Var = this.f522350d;
        vw0.i0.a(i0Var, i0Var.f522324n);
        i0Var.f522318e.setVisibility(0);
        i0Var.f522319f.setVisibility(8);
        i0Var.f522320g.setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
