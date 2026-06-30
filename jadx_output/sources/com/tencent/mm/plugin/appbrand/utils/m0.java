package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes3.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f90508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f90509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f90510f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(int i17, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        super(0);
        this.f90508d = i17;
        this.f90509e = runnable;
        this.f90510f = runnable2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f90508d == 0) {
            java.lang.Runnable runnable = this.f90509e;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            java.lang.Runnable runnable2 = this.f90510f;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
        return jz5.f0.f302826a;
    }
}
