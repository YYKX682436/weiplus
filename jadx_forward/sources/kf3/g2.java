package kf3;

/* loaded from: classes.dex */
public class g2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16489x8d6e80bc f388885d;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16489x8d6e80bc activityC16489x8d6e80bc) {
        this.f388885d = activityC16489x8d6e80bc;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendSelectContactUI", "Click Next Btn");
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16489x8d6e80bc activityC16489x8d6e80bc = this.f388885d;
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) ((java.util.LinkedList) activityC16489x8d6e80bc.E).toArray(new java.lang.String[0]));
        if (P1 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MassSendSelectContactUI", "no choosed anyone");
            return false;
        }
        P1.remove(c01.z1.r());
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(P1, ";");
        android.content.Intent intent = new android.content.Intent(activityC16489x8d6e80bc, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679.class);
        intent.putExtra("mass_send_contact_list", c17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16489x8d6e80bc activityC16489x8d6e80bc2 = this.f388885d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16489x8d6e80bc2, arrayList.toArray(), "com/tencent/mm/plugin/masssend/ui/MassSendSelectContactUI$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16489x8d6e80bc2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16489x8d6e80bc2, "com/tencent/mm/plugin/masssend/ui/MassSendSelectContactUI$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
