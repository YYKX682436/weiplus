package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes8.dex */
public class j2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI f72695d;

    public j2(com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI) {
        this.f72695d = launchAAByPersonAmountSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.util.Map map;
        com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI = this.f72695d;
        if (launchAAByPersonAmountSelectUI.f72493v <= 0 || (map = launchAAByPersonAmountSelectUI.f72488q) == null || ((java.util.HashMap) map).size() <= launchAAByPersonAmountSelectUI.f72493v) {
            com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI.g7(launchAAByPersonAmountSelectUI);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 3, 4);
            return true;
        }
        db5.e1.s(launchAAByPersonAmountSelectUI.getContext(), launchAAByPersonAmountSelectUI.getString(com.tencent.mm.R.string.g_s, java.lang.Integer.valueOf(launchAAByPersonAmountSelectUI.f72493v)), "");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13722, 8);
        return true;
    }
}
