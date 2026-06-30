package cj4;

/* loaded from: classes5.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.a0 f42038d;

    public u(cj4.a0 a0Var) {
        this.f42038d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f42038d.T();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
