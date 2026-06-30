package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class t5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15987x1ca24c56 f223298d;

    public t5(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15987x1ca24c56 activityC15987x1ca24c56) {
        this.f223298d = activityC15987x1ca24c56;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15987x1ca24c56 activityC15987x1ca24c56 = this.f223298d;
        if (activityC15987x1ca24c56.getSharedPreferences("game_center_pref", 0).getInt("game_region_confirm_mark", 0) != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15987x1ca24c56 activityC15987x1ca24c562 = this.f223298d;
            db5.e1.K(activityC15987x1ca24c562, true, activityC15987x1ca24c562.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573758fp0), "", activityC15987x1ca24c56.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573759fp1), activityC15987x1ca24c56.getString(com.p314xaae8f345.mm.R.C30867xcad56011.foz), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.r5(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.s5(this));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15987x1ca24c56.V6(activityC15987x1ca24c56);
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.g(activityC15987x1ca24c56);
            if (g17 != null) {
                intent.putExtra("gameRegionName", com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.i(g17));
                activityC15987x1ca24c56.setResult(-1, intent);
            } else {
                activityC15987x1ca24c56.setResult(1);
            }
            activityC15987x1ca24c56.finish();
        }
        return true;
    }
}
