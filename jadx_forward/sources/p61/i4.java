package p61;

/* loaded from: classes.dex */
public class i4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494 f433825d;

    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494 activityC11370x9b57e494) {
        this.f433825d = activityC11370x9b57e494;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494 activityC11370x9b57e494 = this.f433825d;
        android.content.Intent intent = new android.content.Intent(activityC11370x9b57e494.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970.class);
        intent.putExtra("key_upload_scene", 6);
        com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(activityC11370x9b57e494, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
