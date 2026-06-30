package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f78411e;

    public h0(com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent mMToClientEvent, java.lang.String str, java.lang.Object obj) {
        this.f78410d = str;
        this.f78411e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.f78380r.b(this.f78410d, new com.tencent.mm.plugin.appbrand.ipc.g0(this));
    }
}
