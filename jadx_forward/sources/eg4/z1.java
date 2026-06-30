package eg4;

/* loaded from: classes4.dex */
public class z1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18506xcc7cdd98 f334369d;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18506xcc7cdd98 activityC18506xcc7cdd98) {
        this.f334369d = activityC18506xcc7cdd98;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18506xcc7cdd98 activityC18506xcc7cdd98 = this.f334369d;
        android.content.Intent intent = new android.content.Intent(activityC18506xcc7cdd98, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18537x8ea3e013.class);
        intent.putExtra("invite_friend_scene", 3);
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18506xcc7cdd98 activityC18506xcc7cdd982 = this.f334369d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC18506xcc7cdd982, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$6", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18506xcc7cdd982.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC18506xcc7cdd982, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$6", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        tf5.j.O6(activityC18506xcc7cdd98, "friends_add_button_addressbook");
        return true;
    }
}
