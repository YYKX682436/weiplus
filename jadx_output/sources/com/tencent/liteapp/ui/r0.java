package com.tencent.liteapp.ui;

/* loaded from: classes5.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppUI f46219e;

    public r0(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI, int i17) {
        this.f46219e = wxaLiteAppUI;
        this.f46218d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f46219e.getWindow().getDecorView().setSystemUiVisibility(this.f46218d);
    }
}
