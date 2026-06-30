package com.tencent.liteapp.ui;

/* loaded from: classes9.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppTransparentUI f46158e;

    public g0(com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI, int i17) {
        this.f46158e = wxaLiteAppTransparentUI;
        this.f46157d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f46158e.getWindow().getDecorView().setSystemUiVisibility(this.f46157d);
    }
}
