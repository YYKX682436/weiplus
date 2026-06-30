package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAImagPreviewUI f72804d;

    public t(com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI) {
        this.f72804d = aAImagPreviewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI = this.f72804d;
        dp.a.makeText(aAImagPreviewUI.getContext(), aAImagPreviewUI.getContext().getString(com.tencent.mm.R.string.gab), 1).show();
        com.tencent.mm.autogen.mmdata.rpt.GroupPayPfClickReportStruct groupPayPfClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GroupPayPfClickReportStruct();
        groupPayPfClickReportStruct.f58395d = 15;
        groupPayPfClickReportStruct.k();
    }
}
