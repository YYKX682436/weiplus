package h71;

/* loaded from: classes5.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11390x3e8f7b14 f360913d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11390x3e8f7b14 activityC11390x3e8f7b14) {
        this.f360913d = activityC11390x3e8f7b14;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/security/ui/BindSafeDeviceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("bind_scene", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11390x3e8f7b14 activityC11390x3e8f7b14 = this.f360913d;
        intent.setClass(activityC11390x3e8f7b14, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11362x5f9e5504.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(activityC11390x3e8f7b14, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/account/security/ui/BindSafeDeviceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
