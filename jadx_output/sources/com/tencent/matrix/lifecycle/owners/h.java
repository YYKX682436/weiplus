package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.owners.i f52747d;

    public h(com.tencent.matrix.lifecycle.owners.i iVar) {
        this.f52747d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.matrix.lifecycle.q0.f52785f.a().post(new com.tencent.matrix.lifecycle.owners.g(this));
    }
}
