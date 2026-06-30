package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f46203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppBaseView f46204e;

    public n(com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView, boolean z17) {
        this.f46204e = wxaLiteAppBaseView;
        this.f46203d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f46204e.setKeepScreenOn(this.f46203d);
    }
}
