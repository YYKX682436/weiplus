package ck1;

/* loaded from: classes4.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f123869d;

    public j0(ck1.k0 k0Var) {
        this.f123869d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/privacy/revoke/UserInfoManageAreaAdapter$updateManageBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f123869d.f123871d.l0().N6();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/privacy/revoke/UserInfoManageAreaAdapter$updateManageBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
