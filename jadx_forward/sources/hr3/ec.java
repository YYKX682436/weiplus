package hr3;

/* loaded from: classes11.dex */
public class ec implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16864x5bbaf71d f365054d;

    public ec(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16864x5bbaf71d activityC16864x5bbaf71d) {
        this.f365054d = activityC16864x5bbaf71d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/PermissionSettingUI2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16864x5bbaf71d activityC16864x5bbaf71d = this.f365054d;
        if (activityC16864x5bbaf71d.f235301p.y2()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = activityC16864x5bbaf71d.f235301p;
            z3Var.mo43621x7650bebc(z3Var.m124896xfb85f7b0() & (-8388609));
            c01.e2.j0(activityC16864x5bbaf71d.f235301p);
            activityC16864x5bbaf71d.X6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(activityC16864x5bbaf71d.getIntent(), 20, 2, activityC16864x5bbaf71d.f235300o);
            activityC16864x5bbaf71d.W6(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
