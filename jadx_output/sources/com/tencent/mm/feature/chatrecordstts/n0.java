package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes3.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f65506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f65507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(java.lang.String str, long j17) {
        super(0);
        this.f65506d = str;
        this.f65507e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        new com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsPlayingMsgUpdateEvent(this.f65506d, this.f65507e).e();
        return jz5.f0.f302826a;
    }
}
