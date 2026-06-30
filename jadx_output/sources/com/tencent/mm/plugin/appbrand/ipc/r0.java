package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes15.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f78432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.MainProcessTask f78433e;

    public r0(com.tencent.mm.plugin.appbrand.ipc.MainProcessTask.a aVar, com.tencent.mm.ipcinvoker.r rVar, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask mainProcessTask) {
        this.f78432d = rVar;
        this.f78433e = mainProcessTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ipcinvoker.r rVar = this.f78432d;
        if (rVar == null) {
            return;
        }
        rVar.a(this.f78433e);
    }
}
