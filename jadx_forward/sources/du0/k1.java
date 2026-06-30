package du0;

/* loaded from: classes5.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du0.p1 f324908d;

    public k1(du0.p1 p1Var) {
        this.f324908d = p1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/common/uic/MusicTipUIC$initListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        du0.p1 p1Var = this.f324908d;
        p1Var.getClass();
        p1Var.C6();
        p1Var.r7(zw0.b.f558084e);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/common/uic/MusicTipUIC$initListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
