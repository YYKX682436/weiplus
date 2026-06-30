package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class i0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppTransparentUI f46183a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI, android.os.Looper looper) {
        super(looper);
        this.f46183a = wxaLiteAppTransparentUI;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI = this.f46183a;
        if (i17 == 1) {
            com.tencent.liteapp.ui.WxaLiteAppTransparentUI.Q6(wxaLiteAppTransparentUI, "openLiteAppANR");
        } else {
            if (i17 != 2) {
                return;
            }
            com.tencent.liteapp.ui.WxaLiteAppTransparentUI.Q6(wxaLiteAppTransparentUI, "openLiteAppLoadingError");
        }
    }
}
