package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f68330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f68331e;

    public a0(java.lang.String str, java.lang.Runnable runnable) {
        this.f68330d = str;
        this.f68331e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        rk0.c.c("IPC.IPCInvokeLogic", "getThreadPoolDelegate", new java.lang.Object[0]);
        com.tencent.mm.ipcinvoker.h hVar = com.tencent.mm.ipcinvoker.y.f68470c;
        java.lang.Runnable runnable = this.f68331e;
        java.lang.String str = this.f68330d;
        if (str != null && !str.isEmpty() && hVar != null) {
            ((ku5.t0) ((p65.j$$a) hVar).f352446a).h(runnable, str);
        } else {
            if (runnable == null) {
                return;
            }
            com.tencent.mm.ipcinvoker.r0.a(runnable);
        }
    }
}
