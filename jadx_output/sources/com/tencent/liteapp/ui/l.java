package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f46197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppBaseView f46198e;

    public l(com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView, java.util.HashMap hashMap) {
        this.f46198e = wxaLiteAppBaseView;
        this.f46197d = hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        kx5.n.h().j(this.f46198e.f46044h, "setForbidRightGestureEnable", this.f46197d);
    }
}
