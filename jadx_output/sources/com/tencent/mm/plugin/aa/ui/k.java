package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.l f72702d;

    public k(com.tencent.mm.plugin.aa.ui.l lVar) {
        this.f72702d = lVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PreviewHdHeadImg", "onMMMenuItemSelected %s", java.lang.Integer.valueOf(menuItem.getItemId()));
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.aa.ui.l lVar = this.f72702d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            lVar.f72717a.setResult(-1);
            lVar.f72717a.finish();
            return;
        }
        com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI = lVar.f72717a;
        int i18 = com.tencent.mm.plugin.aa.ui.AAImagPreviewUI.f72429s;
        aAImagPreviewUI.getClass();
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(aAImagPreviewUI, new com.tencent.mm.plugin.aa.ui.s(aAImagPreviewUI), new com.tencent.mm.plugin.aa.ui.t(aAImagPreviewUI));
    }
}
