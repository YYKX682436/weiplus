package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class bh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.ch f73756d;

    public bh(com.tencent.mm.plugin.account.ui.ch chVar) {
        this.f73756d = chVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.account.ui.ch chVar = this.f73756d;
        chVar.f73785e.f73630e.clearFocus();
        chVar.f73785e.f73630e.requestFocus();
    }
}
