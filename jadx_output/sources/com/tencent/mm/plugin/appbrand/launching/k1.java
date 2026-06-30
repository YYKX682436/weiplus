package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes.dex */
public class k1 implements java.lang.Runnable {
    public k1(com.tencent.mm.plugin.appbrand.launching.l1 l1Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f490024is, 0).show();
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268435456).addFlags(67108864);
            j45.l.u(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.ui.LauncherUI", intent, null);
        } catch (java.lang.Exception unused) {
        }
    }
}
