package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class o extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f53544d;

    public o(com.tencent.mm.app.s sVar, android.content.Intent intent) {
        this.f53544d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(this.f53544d, com.tencent.mm.app.w.f53874s);
    }
}
