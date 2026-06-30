package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class b0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.c0 f72575d;

    public b0(com.tencent.mm.plugin.aa.ui.c0 c0Var) {
        this.f72575d = c0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.aa.ui.c0 c0Var = this.f72575d;
        if (itemId == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AAQueryListUI", "go to launch list: %d", java.lang.Integer.valueOf(c0Var.f72587d.f72452s));
            com.tencent.mm.plugin.aa.ui.AAQueryListUI aAQueryListUI = c0Var.f72587d;
            if (aAQueryListUI.f72452s == 1) {
                return;
            }
            aAQueryListUI.f72452s = 1;
            aAQueryListUI.setMMTitle(com.tencent.mm.R.string.f489754ar);
            com.tencent.mm.plugin.aa.ui.w wVar = aAQueryListUI.f72445i;
            wVar.f72863f = aAQueryListUI.f72452s;
            ((java.util.ArrayList) wVar.f72861d).clear();
            aAQueryListUI.f72445i.notifyDataSetChanged();
            aAQueryListUI.f7(true, aAQueryListUI.f72452s);
            return;
        }
        if (itemId != 2) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AAQueryListUI", "go to pay query list: %d", java.lang.Integer.valueOf(c0Var.f72587d.f72452s));
        com.tencent.mm.plugin.aa.ui.AAQueryListUI aAQueryListUI2 = c0Var.f72587d;
        if (aAQueryListUI2.f72452s == 2) {
            return;
        }
        aAQueryListUI2.setMMTitle(com.tencent.mm.R.string.f489757au);
        com.tencent.mm.plugin.aa.ui.w wVar2 = aAQueryListUI2.f72445i;
        wVar2.f72863f = aAQueryListUI2.f72452s;
        ((java.util.ArrayList) wVar2.f72861d).clear();
        aAQueryListUI2.f72445i.notifyDataSetChanged();
        aAQueryListUI2.f72452s = 2;
        aAQueryListUI2.f7(true, 2);
    }
}
