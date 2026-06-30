package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class d6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.m6 f99428d;

    public d6(com.tencent.mm.plugin.exdevice.ui.m6 m6Var) {
        this.f99428d = m6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.m6 m6Var = this.f99428d;
        dp.a.makeText(m6Var.f99570a, com.tencent.mm.R.string.f491144c42, 1).show();
        m6Var.f99570a.finish();
    }
}
