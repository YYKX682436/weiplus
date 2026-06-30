package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f65563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(long j17) {
        super(1);
        this.f65563d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.storage.f9 it = (com.tencent.mm.storage.f9) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.getMsgId() == this.f65563d);
    }
}
