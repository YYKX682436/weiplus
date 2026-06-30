package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class k8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f89827d;

    public k8(android.app.Activity activity) {
        this.f89827d = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f490024is, 1).show();
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.putExtra("animation_pop_in", true);
        intent.putExtra("Intro_Switch", true);
        android.app.Activity activity = this.f89827d;
        j45.l.u(activity, ".ui.LauncherUI", intent, null);
        com.tencent.mm.plugin.appbrand.ui.m8.b(activity);
    }
}
