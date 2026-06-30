package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class aa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallArgs f84503d;

    public aa(com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallArgs modularizingPkgBatchLoadTransaction$IPCCallArgs) {
        this.f84503d = modularizingPkgBatchLoadTransaction$IPCCallArgs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f84503d.f84460n.close();
    }
}
