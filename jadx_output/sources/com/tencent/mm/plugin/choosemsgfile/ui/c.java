package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes12.dex */
public class c implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.d f95616a;

    public c(com.tencent.mm.plugin.choosemsgfile.ui.d dVar) {
        this.f95616a = dVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileListUI", "bOk:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI chooseMsgFileListUI = this.f95616a.f95618d;
            int i17 = com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI.f95566q;
            chooseMsgFileListUI.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putParcelableArrayListExtra("FILEPATHS", chooseMsgFileListUI.f95572i.a());
            chooseMsgFileListUI.setResult(-1, intent);
            chooseMsgFileListUI.finish();
        }
    }
}
