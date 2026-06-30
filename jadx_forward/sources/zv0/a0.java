package zv0;

/* loaded from: classes5.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv0.f0 f557687d;

    public a0(zv0.f0 f0Var) {
        this.f557687d = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zv0.f0 f0Var = this.f557687d;
        f0Var.getClass();
        yz5.l m179693x2c77c188 = f0Var.m179693x2c77c188();
        if (m179693x2c77c188 != null) {
            m179693x2c77c188.mo146xb9724478(f0Var.m179697xa3329e14());
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
