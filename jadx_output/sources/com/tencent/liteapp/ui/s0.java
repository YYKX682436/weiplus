package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class s0 extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppUI f46221a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI, android.os.Handler handler) {
        super(handler);
        this.f46221a = wxaLiteAppUI;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        super.onChange(z17);
        com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI = this.f46221a;
        if (wxaLiteAppUI.f46107q == 1) {
            com.tencent.liteapp.ui.WxaLiteAppUI.Y6(wxaLiteAppUI);
        }
    }
}
