package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppTransparentUI f46202e;

    public m0(com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI, int i17) {
        this.f46202e = wxaLiteAppTransparentUI;
        this.f46201d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.liteapp.ui.WxaLiteAppTransparentUI.f46083z1;
        this.f46202e.T6(this.f46201d);
    }
}
