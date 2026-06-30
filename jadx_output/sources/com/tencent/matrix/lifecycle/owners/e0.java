package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.owners.y f52716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f52717e;

    public e0(com.tencent.matrix.lifecycle.owners.y yVar, java.lang.String str) {
        this.f52716d = yVar;
        this.f52717e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        ((com.tencent.matrix.lifecycle.supervisor.w) this.f52716d).a(this.f52717e, com.tencent.matrix.lifecycle.owners.f0.f52735q);
    }
}
