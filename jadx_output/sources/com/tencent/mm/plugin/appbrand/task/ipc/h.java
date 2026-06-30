package com.tencent.mm.plugin.appbrand.task.ipc;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.ipc.AppBrandKillByClientMessage f89067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f89068e;

    public h(com.tencent.mm.plugin.appbrand.task.ipc.AppBrandKillByClientMessage appBrandKillByClientMessage, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f89067d = appBrandKillByClientMessage;
        this.f89068e = o6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f89067d.b(this.f89068e);
    }
}
