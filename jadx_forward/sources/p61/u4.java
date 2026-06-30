package p61;

/* loaded from: classes11.dex */
public class u4 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494 f433924d;

    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494 activityC11370x9b57e494) {
        this.f433924d = activityC11370x9b57e494;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494 activityC11370x9b57e494 = this.f433924d;
        if (i17 < activityC11370x9b57e494.f154616d.getHeaderViewsCount()) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        r61.a aVar = (r61.a) activityC11370x9b57e494.f154617e.getItem(i17 - activityC11370x9b57e494.f154616d.getHeaderViewsCount());
        int i18 = aVar.f474332o;
        if (i18 == 1 || i18 == 2) {
            activityC11370x9b57e494.V6(aVar);
        }
        if (aVar.f474332o == 0) {
            android.content.Intent intent = new android.content.Intent(activityC11370x9b57e494, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11377x618a2bfb.class);
            intent.putExtra("friend_type", 1);
            intent.putExtra("friend_user_name", aVar.i());
            intent.putExtra("friend_num", aVar.f() + "");
            intent.putExtra("friend_nick", aVar.h());
            intent.putExtra("friend_weixin_nick", aVar.g());
            intent.putExtra("friend_scene", 13);
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494 activityC11370x9b57e4942 = this.f433924d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC11370x9b57e4942, arrayList2.toArray(), "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$8", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC11370x9b57e4942.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC11370x9b57e4942, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$8", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
