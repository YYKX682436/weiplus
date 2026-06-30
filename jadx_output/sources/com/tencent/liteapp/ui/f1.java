package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppUI f46155e;

    public f1(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI, int i17) {
        this.f46155e = wxaLiteAppUI;
        this.f46154d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.liteapp.ui.WxaLiteAppUI.X6(this.f46155e, this.f46154d);
    }
}
