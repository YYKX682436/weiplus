package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f67403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i17, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f67403d = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.w("MicroMsg.AdpfFeatureService", "thermal high_critical toggled: " + it + ", status=" + this.f67403d);
        return jz5.f0.f302826a;
    }
}
