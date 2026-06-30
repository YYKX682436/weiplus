package com.tencent.mm.plugin.account.ui;

/* loaded from: classes12.dex */
public class jh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegSetInfoUI f73963d;

    public jh(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI) {
        this.f73963d = regSetInfoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI = this.f73963d;
        regSetInfoUI.f73644v.requestFocus();
        regSetInfoUI.f73629d.clearFocus();
    }
}
