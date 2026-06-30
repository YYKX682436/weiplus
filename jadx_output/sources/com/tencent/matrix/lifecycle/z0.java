package com.tencent.matrix.lifecycle;

/* loaded from: classes8.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f52911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.k f52912e;

    public z0(yz5.l lVar, com.tencent.matrix.lifecycle.k kVar) {
        this.f52911d = lVar;
        this.f52912e = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f52911d.invoke(this.f52912e);
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(this.f52912e);
    }
}
