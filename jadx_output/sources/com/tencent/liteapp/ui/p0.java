package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f46212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppTransparentUI f46213e;

    public p0(com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI, boolean z17) {
        this.f46213e = wxaLiteAppTransparentUI;
        this.f46212d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ox5.a aVar = this.f46213e.f46075e;
        if (aVar != null) {
            aVar.d(this.f46212d, true);
        }
    }
}
