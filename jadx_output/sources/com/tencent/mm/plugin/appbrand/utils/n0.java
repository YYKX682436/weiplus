package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes3.dex */
public final class n0 implements si1.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f90514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f90515b;

    public n0(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        this.f90514a = runnable;
        this.f90515b = runnable2;
    }

    @Override // si1.m0
    public final void a(int i17) {
        nf.e.f(new com.tencent.mm.plugin.appbrand.utils.m0(i17, this.f90514a, this.f90515b));
    }
}
