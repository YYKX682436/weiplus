package com.tencent.luggage.sdk.processes;

/* loaded from: classes7.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.r f47646d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.luggage.sdk.processes.r rVar) {
        super(0);
        this.f47646d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new java.util.concurrent.CopyOnWriteArrayList(this.f47646d.o());
    }
}
