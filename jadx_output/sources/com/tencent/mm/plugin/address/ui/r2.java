package com.tencent.mm.plugin.address.ui;

/* loaded from: classes12.dex */
public class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.NeedVerifyQQEvent f74619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletSelectAddrUI f74620e;

    public r2(com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI, com.tencent.mm.autogen.events.NeedVerifyQQEvent needVerifyQQEvent) {
        this.f74620e = walletSelectAddrUI;
        this.f74619d = needVerifyQQEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f74620e.f74493i.post(new com.tencent.mm.plugin.address.ui.q2(this));
    }
}
