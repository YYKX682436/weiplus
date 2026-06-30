package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f46225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppFragment f46226e;

    public u(com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment, java.util.HashMap hashMap) {
        this.f46226e = wxaLiteAppFragment;
        this.f46225d = hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        kx5.n.h().j(this.f46226e.f46030o, "setForbidRightGestureEnable", this.f46225d);
    }
}
