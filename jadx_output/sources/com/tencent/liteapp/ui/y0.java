package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppUI f46242d;

    public y0(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI) {
        this.f46242d = wxaLiteAppUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f46242d.removeBackgroundImage();
    }
}
