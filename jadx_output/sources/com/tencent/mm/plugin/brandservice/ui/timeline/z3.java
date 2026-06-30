package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes3.dex */
public final class z3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.ui.timeline.z3 f94553d = new com.tencent.mm.plugin.brandservice.ui.timeline.z3();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizTimeLineSettingUI", "showProgressDlg onCancel exp: %s ", e17.getLocalizedMessage());
        }
    }
}
