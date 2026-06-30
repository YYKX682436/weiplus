package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class y3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.p f67777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(cr0.p pVar) {
        super(1);
        this.f67777d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cr0.d0 entry = (cr0.d0) obj;
        kotlin.jvm.internal.o.g(entry, "entry");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(entry.f221604d);
        sb6.append(':');
        float floatValue = entry.f221605e.f395552a.floatValue() * 100.0f;
        kotlin.jvm.internal.o.f(this.f67777d.f221640j.f395552a, "get(...)");
        sb6.append(a06.d.c(floatValue / r1.floatValue()));
        return sb6.toString();
    }
}
