package com.tencent.mm.matrix.monitor;

/* loaded from: classes12.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f68759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(long j17) {
        super(4);
        this.f68759d = j17;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).intValue();
        com.tencent.matrix.util.MemInfo[] amsMemInfos = (com.tencent.matrix.util.MemInfo[]) obj3;
        com.tencent.matrix.util.MemInfo[] debugMemInfos = (com.tencent.matrix.util.MemInfo[]) obj4;
        kotlin.jvm.internal.o.g(amsMemInfos, "amsMemInfos");
        kotlin.jvm.internal.o.g(debugMemInfos, "debugMemInfos");
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.matrix.monitor.f0(this.f68759d, amsMemInfos, intValue));
        return jz5.f0.f302826a;
    }
}
