package cj4;

/* loaded from: classes4.dex */
public final class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f123457d;

    public e1(cj4.i1 i1Var) {
        this.f123457d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$update$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f123457d.T();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$update$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
