package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f46152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppTransparentUI f46153e;

    public f0(com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI, java.util.HashMap hashMap) {
        this.f46153e = wxaLiteAppTransparentUI;
        this.f46152d = hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        kx5.n.h().j(this.f46153e.f46080m, "setForbidRightGestureEnable", this.f46152d);
    }
}
