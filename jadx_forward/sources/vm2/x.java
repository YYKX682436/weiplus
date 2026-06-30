package vm2;

/* loaded from: classes.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vm2.y f519662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f519663e;

    public x(vm2.y yVar, int i17) {
        this.f519662d = yVar;
        this.f519663e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vm2.y yVar = this.f519662d;
        int i17 = yVar.f519665e;
        int i18 = this.f519663e;
        if (i17 != i18) {
            yVar.f519665e = i18;
            yVar.m8146xced61ae5();
        }
        yz5.l lVar = yVar.f519664d;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(i18));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
