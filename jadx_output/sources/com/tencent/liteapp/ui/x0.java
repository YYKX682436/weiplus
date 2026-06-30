package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f46239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppUI f46240e;

    public x0(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI, android.content.Intent intent) {
        this.f46240e = wxaLiteAppUI;
        this.f46239d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = this.f46239d;
        com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI = this.f46240e;
        wxaLiteAppUI.setResult(-1, intent);
        wxaLiteAppUI.finish();
    }
}
