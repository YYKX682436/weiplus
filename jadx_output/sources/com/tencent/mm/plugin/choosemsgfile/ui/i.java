package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes8.dex */
public class i extends uh0.v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI f95622b;

    public i(com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI chooseMsgFileShowUI) {
        this.f95622b = chooseMsgFileShowUI;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (this.f427739a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileShowUI", "openReadFile, ignore ret = %d", num);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileShowUI", "openReadFile, ret = %d", num);
        uh0.r rVar = (uh0.r) i95.n0.c(uh0.r.class);
        com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI chooseMsgFileShowUI = this.f95622b;
        java.lang.String str = chooseMsgFileShowUI.f95578d;
        java.lang.String str2 = chooseMsgFileShowUI.f95579e;
        int intValue = num.intValue();
        ((th0.u) rVar).getClass();
        com.tencent.mm.xwebutil.i.g(chooseMsgFileShowUI, str, str2, intValue);
        if (num.intValue() != 0) {
            chooseMsgFileShowUI.finish();
        }
    }
}
