package com.tencent.mm.feature.performance;

/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f67604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f67605e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.Long l17, long j17) {
        super(1);
        this.f67604d = l17;
        this.f67605e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map it = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.put("uid-collect-ratio", java.lang.Long.valueOf(a06.d.c((((float) this.f67604d.longValue()) * 100.0f) / ((float) this.f67605e))));
        return jz5.f0.f302826a;
    }
}
