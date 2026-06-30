package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes8.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ActivityManager.MemoryInfo f149003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f149004e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(android.app.ActivityManager.MemoryInfo memoryInfo, long j17) {
        super(1);
        this.f149003d = memoryInfo;
        this.f149004e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AdpfFeatureService", "low memory toggled: " + it + ", lowMemory=" + this.f149003d.lowMemory + ", threshold=" + this.f149004e);
        return jz5.f0.f384359a;
    }
}
