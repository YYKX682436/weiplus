package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes3.dex */
public final class k4 implements java.lang.AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f90496d;

    /* renamed from: e, reason: collision with root package name */
    public final long f90497e;

    public k4(l75.k0 k0Var, long j17, kotlin.jvm.internal.i iVar) {
        this.f90496d = k0Var;
        this.f90497e = j17;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f90496d.w(java.lang.Long.valueOf(this.f90497e));
    }
}
