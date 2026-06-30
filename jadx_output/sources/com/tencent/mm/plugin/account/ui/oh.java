package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class oh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.ph f74100d;

    public oh(com.tencent.mm.plugin.account.ui.ph phVar) {
        this.f74100d = phVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.account.ui.ph phVar = this.f74100d;
        phVar.f74117d.f73630e.clearFocus();
        phVar.f74117d.f73630e.requestFocus();
    }
}
