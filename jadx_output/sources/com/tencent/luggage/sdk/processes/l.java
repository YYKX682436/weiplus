package com.tencent.luggage.sdk.processes;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f47648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.util.ArrayList arrayList) {
        super(1);
        this.f47648d = arrayList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.luggage.sdk.processes.s it = (com.tencent.luggage.sdk.processes.s) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f47648d.add(it);
        return jz5.f0.f302826a;
    }
}
