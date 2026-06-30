package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f46148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppTransparentUI f46149e;

    public e0(com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI, android.content.Intent intent) {
        this.f46149e = wxaLiteAppTransparentUI;
        this.f46148d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = this.f46148d;
        com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI = this.f46149e;
        wxaLiteAppTransparentUI.setResult(-1, intent);
        wxaLiteAppTransparentUI.finish();
    }
}
