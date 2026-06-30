package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f46231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppUI f46232e;

    public v0(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI, boolean z17) {
        this.f46232e = wxaLiteAppUI;
        this.f46231d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI = this.f46232e;
        boolean z17 = this.f46231d;
        wxaLiteAppUI.V = z17;
        if (z17) {
            wxaLiteAppUI.getWindow().addFlags(128);
        } else {
            wxaLiteAppUI.getWindow().clearFlags(128);
        }
    }
}
