package mx0;

/* loaded from: classes3.dex */
public final class s9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.t9 f413858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f413859e;

    public s9(mx0.t9 t9Var, int i17) {
        this.f413858d = t9Var;
        this.f413859e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapter$bindNormalTemplate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f413858d.f413892g;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(this.f413859e));
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapter$bindNormalTemplate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
