package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes8.dex */
public class m implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI f95626a;

    public m(com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI chooseMsgFileShowUI) {
        this.f95626a = chooseMsgFileShowUI;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileShowUI", "openReadFile, receiveValue = %s", str);
        boolean equals = "query for feature_wx_float_window successfully".equals(str);
        com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI chooseMsgFileShowUI = this.f95626a;
        if (equals) {
            chooseMsgFileShowUI.f95586o = true;
            ((th0.w) ((uh0.s) i95.n0.c(uh0.s.class))).wi(chooseMsgFileShowUI.f95584m.s(), chooseMsgFileShowUI.f95584m.a(), false, false, chooseMsgFileShowUI, chooseMsgFileShowUI.f95578d, chooseMsgFileShowUI.f95581g, chooseMsgFileShowUI.f95579e, chooseMsgFileShowUI.f95582h, 7, chooseMsgFileShowUI.f95590s, chooseMsgFileShowUI.U6(true), true);
            return;
        }
        if ("xwebFileReaderReachEnd".equals(str) || "xwebFileReaderUserOperated".equals(str)) {
            return;
        }
        if ("fileReaderClosed".equals(str)) {
            boolean z17 = chooseMsgFileShowUI.f95585n;
            if (z17) {
                chooseMsgFileShowUI.finish();
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileShowUI", "opCallback isFinishCurPage:%s", java.lang.Boolean.valueOf(z17));
                chooseMsgFileShowUI.f95585n = true;
                return;
            }
        }
        if ("fileReaderMenuClicked".equals(str)) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) chooseMsgFileShowUI, 1, false);
            k0Var.f211872n = new com.tencent.mm.plugin.choosemsgfile.ui.j(this);
            k0Var.f211881s = new com.tencent.mm.plugin.choosemsgfile.ui.l(this);
            k0Var.v();
        }
    }
}
