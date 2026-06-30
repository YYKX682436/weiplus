package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAImagPreviewUI f72793d;

    public s(com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI) {
        this.f72793d = aAImagPreviewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI = this.f72793d;
        if (com.tencent.mm.vfs.w6.j(aAImagPreviewUI.f72433g)) {
            java.lang.String str = q75.c.d() + "img_" + kk.k.e(aAImagPreviewUI.f72433g) + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
            com.tencent.mm.vfs.w6.c(aAImagPreviewUI.f72433g, str);
            q75.c.f(str, aAImagPreviewUI.getContext());
            dp.a.makeText(aAImagPreviewUI.getContext(), aAImagPreviewUI.getContext().getString(com.tencent.mm.R.string.frx, q75.c.d()), 1).show();
            if (aAImagPreviewUI.f72431e == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 4, 13, java.lang.Integer.valueOf(aAImagPreviewUI.f72441r));
            }
        } else {
            dp.a.makeText(aAImagPreviewUI.getContext(), aAImagPreviewUI.getContext().getString(com.tencent.mm.R.string.gaa), 1).show();
        }
        com.tencent.mm.autogen.mmdata.rpt.GroupPayPfClickReportStruct groupPayPfClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GroupPayPfClickReportStruct();
        groupPayPfClickReportStruct.f58395d = 15;
        groupPayPfClickReportStruct.k();
    }
}
