package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f65382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f65383e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, long j17) {
        super(0);
        this.f65382d = str;
        this.f65383e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        new com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsFloatBallClickEvent(this.f65382d, this.f65383e).e();
        return jz5.f0.f302826a;
    }
}
