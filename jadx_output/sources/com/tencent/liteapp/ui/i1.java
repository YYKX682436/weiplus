package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f46184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppUI f46185e;

    public i1(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI, java.util.HashMap hashMap) {
        this.f46185e = wxaLiteAppUI;
        this.f46184d = hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        kx5.n.h().j(this.f46185e.f46037o, "setForbidRightGestureEnable", this.f46184d);
    }
}
