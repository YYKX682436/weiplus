package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f88674d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.Runnable runnable) {
        super(1);
        this.f88674d = runnable;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Parcelable it = (android.os.Parcelable) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Runnable runnable = this.f88674d;
        if (runnable != null) {
            runnable.run();
        }
        return jz5.f0.f302826a;
    }
}
