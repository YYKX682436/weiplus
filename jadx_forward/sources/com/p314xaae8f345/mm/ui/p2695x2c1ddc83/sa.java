package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes.dex */
public class sa implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22383x63d1b835 f289602d;

    public sa(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22383x63d1b835 activityC22383x63d1b835) {
        this.f289602d = activityC22383x63d1b835;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent(this.f289602d.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21435x7826ced5.class);
        intent.putExtra("mode", 0);
        intent.putExtra("from_scene", "scene_service_notify_conversation");
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22383x63d1b835 activityC22383x63d1b835 = this.f289602d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC22383x63d1b835, arrayList.toArray(), "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC22383x63d1b835.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC22383x63d1b835, "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21825, 2, null, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), null, null, 0, 0, 0, 0, te5.v1.f500291b);
        return true;
    }
}
