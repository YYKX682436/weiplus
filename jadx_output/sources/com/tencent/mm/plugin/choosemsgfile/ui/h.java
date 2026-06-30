package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes8.dex */
public class h implements android.webkit.ValueCallback {
    public h(com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI chooseMsgFileShowUI) {
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileShowUI", "updateRetCallback onReceiveValue ret = %d", (java.lang.Integer) obj);
    }
}
