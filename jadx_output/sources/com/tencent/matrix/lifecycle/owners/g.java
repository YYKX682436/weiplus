package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.owners.h f52743d;

    public g(com.tencent.matrix.lifecycle.owners.h hVar) {
        this.f52743d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.matrix.lifecycle.owners.i iVar = this.f52743d.f52747d;
        try {
            com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.INSTANCE.hasForegroundService();
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.lifecycle.FgService", th6, "", new java.lang.Object[0]);
        }
    }
}
