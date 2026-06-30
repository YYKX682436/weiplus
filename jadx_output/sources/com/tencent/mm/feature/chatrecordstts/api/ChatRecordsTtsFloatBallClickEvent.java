package com.tencent.mm.feature.chatrecordstts.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/chatrecordstts/api/ChatRecordsTtsFloatBallClickEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "chatrecordstts-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class ChatRecordsTtsFloatBallClickEvent extends com.tencent.mm.sdk.event.IEvent {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f65343g;

    /* renamed from: h, reason: collision with root package name */
    public final long f65344h;

    public ChatRecordsTtsFloatBallClickEvent(java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f65343g = talker;
        this.f65344h = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsFloatBallClickEvent)) {
            return false;
        }
        com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsFloatBallClickEvent chatRecordsTtsFloatBallClickEvent = (com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsFloatBallClickEvent) obj;
        return kotlin.jvm.internal.o.b(this.f65343g, chatRecordsTtsFloatBallClickEvent.f65343g) && this.f65344h == chatRecordsTtsFloatBallClickEvent.f65344h;
    }

    public int hashCode() {
        return (this.f65343g.hashCode() * 31) + java.lang.Long.hashCode(this.f65344h);
    }

    public java.lang.String toString() {
        return "ChatRecordsTtsFloatBallClickEvent(talker=" + this.f65343g + ", msgId=" + this.f65344h + ')';
    }
}
