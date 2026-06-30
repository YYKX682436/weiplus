package gx0;

/* loaded from: classes5.dex */
public final class g6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f357985d;

    public g6(gx0.w8 w8Var) {
        this.f357985d = w8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gx0.w8 w8Var = this.f357985d;
        w8Var.O4(w8Var.m80379x76847179());
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
