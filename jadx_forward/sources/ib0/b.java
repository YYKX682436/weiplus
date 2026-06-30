package ib0;

/* loaded from: classes.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f371558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f371559e;

    public b(db5.g3 g3Var, yz5.a aVar) {
        this.f371558d = g3Var;
        this.f371559e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openmsg/ui/OpenMsgFunctionTipHelper$showFunctionTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f371558d.f293588d.dismiss();
        this.f371559e.mo152xb9724478();
        yj0.a.h(this, "com/tencent/mm/feature/openmsg/ui/OpenMsgFunctionTipHelper$showFunctionTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
