package hr3;

/* loaded from: classes11.dex */
public class mh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a f365345d;

    public mh(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a) {
        this.f365345d = activityC16872x6384268a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = this.f365345d;
        activityC16872x6384268a.U = bool;
        activityC16872x6384268a.k7(bool.booleanValue());
        activityC16872x6384268a.l7();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
