package mi1;

/* loaded from: classes5.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.r1 f408068d;

    public d1(mi1.r1 r1Var) {
        this.f408068d = r1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/capsulebar/CapsuleTipsAnimator$animateShowIndeed$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a aVar = this.f408068d.f408212h;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/capsulebar/CapsuleTipsAnimator$animateShowIndeed$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
