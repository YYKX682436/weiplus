package p61;

/* loaded from: classes4.dex */
public class k4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494 f433837d;

    public k4(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494 activityC11370x9b57e494) {
        this.f433837d = activityC11370x9b57e494;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.ListView listView = this.f433837d.f154616d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(listView);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$12", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m.a((android.widget.ListView) arrayList2.get(0));
        yj0.a.f(obj, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$12", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
