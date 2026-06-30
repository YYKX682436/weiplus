package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes8.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oy.k f65503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(oy.k kVar) {
        super(0);
        this.f65503d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        new com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsPlaybackStateUpdateEvent(this.f65503d).e();
        return jz5.f0.f302826a;
    }
}
