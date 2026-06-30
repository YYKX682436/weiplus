package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f46167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppUI f46168e;

    public h1(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI, boolean z17) {
        this.f46168e = wxaLiteAppUI;
        this.f46167d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f46168e.f46032g.d(java.lang.Boolean.valueOf(this.f46167d).booleanValue(), true);
    }
}
