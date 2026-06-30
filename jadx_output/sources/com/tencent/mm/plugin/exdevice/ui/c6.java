package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class c6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.m6 f99420d;

    public c6(com.tencent.mm.plugin.exdevice.ui.m6 m6Var) {
        this.f99420d = m6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.m6 m6Var = this.f99420d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = m6Var.f99570a.f99344r;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        m6Var.f99570a.f99344r.dismiss();
        m6Var.f99570a.f99344r = null;
    }
}
