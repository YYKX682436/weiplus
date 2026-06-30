package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes11.dex */
public class o1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AASelectContactUI f72754d;

    public o1(com.tencent.mm.plugin.aa.ui.AASelectContactUI aASelectContactUI) {
        this.f72754d = aASelectContactUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.aa.ui.AASelectContactUI aASelectContactUI = this.f72754d;
        if (aASelectContactUI.I.size() > aASelectContactUI.f72471J) {
            db5.e1.s(aASelectContactUI.getContext(), aASelectContactUI.getString(com.tencent.mm.R.string.g_s, java.lang.Long.valueOf(aASelectContactUI.f72471J)), "");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(13721, 2, 8);
            g0Var.d(13722, 3);
            return true;
        }
        if (aASelectContactUI.I.size() < 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 2, 9);
            return true;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (aASelectContactUI.A7()) {
            linkedList.addAll(com.tencent.mm.plugin.aa.ui.AASelectContactUI.w7(aASelectContactUI));
        } else {
            linkedList.addAll(aASelectContactUI.I);
        }
        aASelectContactUI.setResult(-1, aASelectContactUI.getIntent().putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ",")));
        aASelectContactUI.finish();
        aASelectContactUI.hideVKB();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 2, 8);
        return true;
    }
}
