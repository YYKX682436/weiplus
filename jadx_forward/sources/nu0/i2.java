package nu0;

/* loaded from: classes5.dex */
public final class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421501d;

    public i2(nu0.b4 b4Var) {
        this.f421501d = b4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nu0.b4 b4Var = this.f421501d;
        b4Var.O4(b4Var.m80379x76847179());
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
