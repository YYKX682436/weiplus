package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f89112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(yz5.l lVar) {
        super(1);
        this.f89112d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity it = (android.app.Activity) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f89112d.invoke("LaunchInBackgroundGuard2");
        return jz5.f0.f302826a;
    }
}
