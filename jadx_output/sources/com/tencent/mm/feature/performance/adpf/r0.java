package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes8.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ActivityManager.MemoryInfo f67470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f67471e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(android.app.ActivityManager.MemoryInfo memoryInfo, long j17) {
        super(1);
        this.f67470d = memoryInfo;
        this.f67471e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.w("MicroMsg.AdpfFeatureService", "low memory toggled: " + it + ", lowMemory=" + this.f67470d.lowMemory + ", threshold=" + this.f67471e);
        return jz5.f0.f302826a;
    }
}
