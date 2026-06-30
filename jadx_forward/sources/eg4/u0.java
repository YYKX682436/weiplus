package eg4;

/* loaded from: classes4.dex */
public final class u0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18505x6ae0de9d f334350d;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18505x6ae0de9d activityC18505x6ae0de9d) {
        this.f334350d = activityC18505x6ae0de9d;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent(this.f334350d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18537x8ea3e013.class);
        intent.putExtra("invite_friend_scene", 3);
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18505x6ae0de9d activityC18505x6ae0de9d = this.f334350d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC18505x6ae0de9d, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordUI$onCreate$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18505x6ae0de9d.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC18505x6ae0de9d, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordUI$onCreate$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((ku5.t0) ku5.t0.f394148d).q(new eg4.t0(this.f334350d));
        return true;
    }
}
