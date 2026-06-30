package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f68355d;

    public g0(java.lang.String str) {
        this.f68355d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ipcinvoker.q b17 = com.tencent.mm.ipcinvoker.q.b();
        b17.getClass();
        java.lang.String str = this.f68355d;
        if (com.tencent.mm.ipcinvoker.y.b(str)) {
            rk0.c.c("IPC.IPCBridgeManager", "the same process(%s), do not need to build IPCBridge.", str);
        } else {
            b17.a(str, false);
        }
    }
}
