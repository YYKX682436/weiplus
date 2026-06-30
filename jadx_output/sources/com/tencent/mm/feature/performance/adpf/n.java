package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f67450d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i17) {
        super(1);
        this.f67450d = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.w("MicroMsg.AdpfFeatureService", "cpuLoad high toggled: " + it + ", cpuLoad=" + this.f67450d + '%');
        return jz5.f0.f302826a;
    }
}
