package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes5.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectedRouterStateView f99718d;

    public x1(com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectedRouterStateView exdeviceConnectedRouterStateView) {
        this.f99718d = exdeviceConnectedRouterStateView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f99718d.invalidate();
    }
}
