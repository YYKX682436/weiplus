package p61;

/* loaded from: classes5.dex */
public class f1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p61.g1 f433778d;

    public f1(p61.g1 g1Var) {
        this.f433778d = g1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        p61.g1 g1Var = this.f433778d;
        if (itemId == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 activityC11360x90d2d970 = g1Var.f433795e;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970.f154494y;
            db5.e1.A(activityC11360x90d2d970.mo55332x76847179(), activityC11360x90d2d970.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ah6), activityC11360x90d2d970.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ah7), activityC11360x90d2d970.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), activityC11360x90d2d970.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572253ah5), null, new p61.k1(activityC11360x90d2d970));
        } else {
            if (itemId != 1) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("need_matte_high_light_item", "settings_find_me_by_mobile");
            j45.l.j(g1Var.f433795e, "setting", ".ui.setting.SettingsPrivacyUI", intent, null);
        }
    }
}
