package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class k8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f171360d;

    public k8(android.app.Activity activity) {
        this.f171360d = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f571557is, 1).show();
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.putExtra("animation_pop_in", true);
        intent.putExtra("Intro_Switch", true);
        android.app.Activity activity = this.f171360d;
        j45.l.u(activity, ".ui.LauncherUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.m8.b(activity);
    }
}
