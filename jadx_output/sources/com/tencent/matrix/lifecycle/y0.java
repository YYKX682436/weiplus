package com.tencent.matrix.lifecycle;

/* loaded from: classes8.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f52909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.k f52910e;

    public y0(yz5.l lVar, com.tencent.matrix.lifecycle.k kVar) {
        this.f52909d = lVar;
        this.f52910e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f52909d.invoke(this.f52910e);
    }
}
