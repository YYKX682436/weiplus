package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes11.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AASelectContactUI f72794d;

    public s1(com.tencent.mm.plugin.aa.ui.AASelectContactUI aASelectContactUI) {
        this.f72794d = aASelectContactUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.aa.ui.AASelectContactUI.V;
        this.f72794d.getContentView().findViewById(com.tencent.mm.R.id.cek).findViewById(com.tencent.mm.R.id.f486065k13).sendAccessibilityEvent(128);
    }
}
