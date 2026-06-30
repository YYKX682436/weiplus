package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes12.dex */
public class x implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.y f95638a;

    public x(com.tencent.mm.plugin.choosemsgfile.ui.y yVar) {
        this.f95638a = yVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUI", "bOk:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI chooseMsgFileUI = this.f95638a.f95639d;
            int i17 = com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI.f95592y;
            chooseMsgFileUI.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putParcelableArrayListExtra("FILEPATHS", chooseMsgFileUI.f95599m.a());
            chooseMsgFileUI.setResult(-1, intent);
            chooseMsgFileUI.finish();
        }
    }
}
