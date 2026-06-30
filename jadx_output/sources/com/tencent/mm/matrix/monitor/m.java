package com.tencent.mm.matrix.monitor;

/* loaded from: classes12.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f68783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j17) {
        super(4);
        this.f68783d = j17;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).intValue();
        com.tencent.matrix.util.MemInfo[] amsMemInfos = (com.tencent.matrix.util.MemInfo[]) obj3;
        com.tencent.matrix.util.MemInfo[] debugMemInfos = (com.tencent.matrix.util.MemInfo[]) obj4;
        kotlin.jvm.internal.o.g(amsMemInfos, "amsMemInfos");
        kotlin.jvm.internal.o.g(debugMemInfos, "debugMemInfos");
        com.tencent.mm.matrix.monitor.k0 k0Var = com.tencent.mm.matrix.monitor.k0.f68773a;
        com.tencent.mars.xlog.Log.i("MicroMsg.monitor.AppBackgroundMemory", "Isolated XWeb is recycled or invalid");
        return jz5.f0.f302826a;
    }
}
