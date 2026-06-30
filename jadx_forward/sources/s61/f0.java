package s61;

/* loaded from: classes8.dex */
public class f0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f484877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f484878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f484879f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s61.i0 f484880g;

    public f0(s61.i0 i0Var, java.util.HashMap hashMap, android.net.Uri uri, java.lang.String str) {
        this.f484880g = i0Var;
        this.f484877d = hashMap;
        this.f484878e = uri;
        this.f484879f = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        android.content.Intent intent = new android.content.Intent();
        java.util.HashMap hashMap = this.f484877d;
        intent.setComponent(new android.content.ComponentName(((android.content.pm.ResolveInfo) hashMap.get(str)).activityInfo.packageName, ((android.content.pm.ResolveInfo) hashMap.get(str)).activityInfo.name));
        intent.setAction("android.intent.action.SENDTO");
        intent.setData(this.f484878e);
        intent.putExtra("sms_body", this.f484879f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11377x618a2bfb activityC11377x618a2bfb = this.f484880g.f484891d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC11377x618a2bfb, arrayList.toArray(), "com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1$4", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11377x618a2bfb.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC11377x618a2bfb, "com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1$4", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
