package com.tencent.liteapp.ui;

/* loaded from: classes5.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f46235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppUI f46236e;

    public w0(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI, boolean z17) {
        this.f46236e = wxaLiteAppUI;
        this.f46235d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f46235d;
        com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI = this.f46236e;
        if (z17) {
            wxaLiteAppUI.getWindow().clearFlags(8192);
        } else {
            wxaLiteAppUI.getWindow().addFlags(8192);
        }
    }
}
