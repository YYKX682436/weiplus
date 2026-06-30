package com.tencent.liteapp.ui;

/* loaded from: classes9.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f46144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppTransparentUI f46145e;

    public d0(com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI, boolean z17) {
        this.f46145e = wxaLiteAppTransparentUI;
        this.f46144d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f46144d;
        com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI = this.f46145e;
        if (z17) {
            wxaLiteAppTransparentUI.getWindow().clearFlags(8192);
        } else {
            wxaLiteAppTransparentUI.getWindow().addFlags(8192);
        }
    }
}
