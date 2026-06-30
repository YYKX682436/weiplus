package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.owners.i f52718d;

    public f(com.tencent.matrix.lifecycle.owners.i iVar) {
        this.f52718d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.tencent.matrix.lifecycle.owners.i.a(this.f52718d);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.lifecycle.FgService", th6, "", new java.lang.Object[0]);
        }
    }
}
