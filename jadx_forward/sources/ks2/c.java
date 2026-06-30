package ks2;

/* loaded from: classes8.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks2.e f393133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cq4 f393134e;

    public c(ks2.e eVar, r45.cq4 cq4Var) {
        this.f393133d = eVar;
        this.f393134e = cq4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer$InfoItemDetailAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ks2.e eVar = this.f393133d;
        eVar.f393137d.remove(this.f393134e);
        eVar.f393138e = false;
        eVar.m8146xced61ae5();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer$InfoItemDetailAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
