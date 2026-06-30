package com.tencent.mm.plugin.account.ui;

/* loaded from: classes12.dex */
public class vg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegSetInfoUI f74277d;

    public vg(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI) {
        this.f74277d = regSetInfoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI = this.f74277d;
        regSetInfoUI.f73630e.clearFocus();
        regSetInfoUI.f73630e.requestFocus();
    }
}
