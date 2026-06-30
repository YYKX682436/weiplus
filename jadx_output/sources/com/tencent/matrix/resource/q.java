package com.tencent.matrix.resource;

/* loaded from: classes12.dex */
public final /* synthetic */ class q extends kotlin.jvm.internal.m implements yz5.r {
    public q(com.tencent.matrix.resource.MemoryUtil memoryUtil) {
        super(4, memoryUtil, com.tencent.matrix.resource.MemoryUtil.class, "nativeForkAnalyzeV2", "nativeForkAnalyzeV2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)I", 0);
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int nativeForkAnalyzeV2;
        java.lang.String p17 = (java.lang.String) obj;
        java.lang.String p27 = (java.lang.String) obj2;
        java.lang.String p37 = (java.lang.String) obj3;
        long longValue = ((java.lang.Number) obj4).longValue();
        kotlin.jvm.internal.o.g(p17, "p1");
        kotlin.jvm.internal.o.g(p27, "p2");
        kotlin.jvm.internal.o.g(p37, "p3");
        nativeForkAnalyzeV2 = ((com.tencent.matrix.resource.MemoryUtil) this.receiver).nativeForkAnalyzeV2(p17, p27, p37, longValue);
        return java.lang.Integer.valueOf(nativeForkAnalyzeV2);
    }
}
