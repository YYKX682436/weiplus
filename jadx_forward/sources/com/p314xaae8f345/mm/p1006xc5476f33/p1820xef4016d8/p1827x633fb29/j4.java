package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public final class j4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f226885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f226886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226887f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f226888g;

    public j4(android.app.Activity activity, java.lang.String str, android.app.Dialog dialog) {
        this.f226886e = activity;
        this.f226887f = str;
        this.f226888g = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyLqtSaveJumpHandler", "[jumpToLqtSaveKinda] WalletGetUserInfoEvent callback() hasCallback:%s", java.lang.Boolean.valueOf(this.f226885d));
        if (!this.f226885d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l4.f226949a.b(this.f226886e, this.f226887f, this.f226888g);
        }
        this.f226885d = true;
    }
}
