package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f46233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppFragment f46234e;

    public w(com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment, boolean z17) {
        this.f46234e = wxaLiteAppFragment;
        this.f46233d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f46234e.getView().setKeepScreenOn(this.f46233d);
    }
}
