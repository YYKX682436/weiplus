package mx0;

/* loaded from: classes.dex */
public final class s1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.w1 f413833d;

    public s1(mx0.w1 w1Var) {
        this.f413833d = w1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) this.f413833d.f413945g).P0();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
