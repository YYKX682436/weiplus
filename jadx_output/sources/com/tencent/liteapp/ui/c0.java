package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f46140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppTransparentUI f46141e;

    public c0(com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI, boolean z17) {
        this.f46141e = wxaLiteAppTransparentUI;
        this.f46140d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI = this.f46141e;
        boolean z17 = this.f46140d;
        wxaLiteAppTransparentUI.N = z17;
        if (z17) {
            wxaLiteAppTransparentUI.getWindow().addFlags(128);
        } else {
            wxaLiteAppTransparentUI.getWindow().clearFlags(128);
        }
    }
}
