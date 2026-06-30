package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppUI f46151e;

    public e1(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI, int i17) {
        this.f46151e = wxaLiteAppUI;
        this.f46150d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f46151e.e7(this.f46150d);
    }
}
