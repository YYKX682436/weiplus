package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class r5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.t5 f223271d;

    public r5(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.t5 t5Var) {
        this.f223271d = t5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.t5 t5Var = this.f223271d;
        t5Var.f223298d.getSharedPreferences("game_center_pref", 0).edit().putInt("game_region_confirm_mark", 1).commit();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15987x1ca24c56.V6(t5Var.f223298d);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.g(t5Var.f223298d);
        if (g17 != null) {
            intent.putExtra("gameRegionName", com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.i(g17));
            t5Var.f223298d.setResult(-1, intent);
        } else {
            t5Var.f223298d.setResult(1);
        }
        t5Var.f223298d.finish();
    }
}
