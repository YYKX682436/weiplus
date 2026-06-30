package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class b1 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppUI f46137a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI, android.os.Looper looper) {
        super(looper);
        this.f46137a = wxaLiteAppUI;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI = this.f46137a;
        if (i17 == 1) {
            com.tencent.liteapp.ui.WxaLiteAppUI.T6(wxaLiteAppUI, "openLiteAppANR");
        } else {
            if (i17 != 2) {
                return;
            }
            com.tencent.liteapp.ui.WxaLiteAppUI.T6(wxaLiteAppUI, "openLiteAppLoadingError");
        }
    }
}
