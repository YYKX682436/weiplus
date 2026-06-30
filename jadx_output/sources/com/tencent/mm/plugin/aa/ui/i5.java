package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f72685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72686e;

    public i5(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, int i17) {
        this.f72686e = launchAAUI;
        this.f72685d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f72686e.O1.smoothScrollBy(0, this.f72685d);
    }
}
