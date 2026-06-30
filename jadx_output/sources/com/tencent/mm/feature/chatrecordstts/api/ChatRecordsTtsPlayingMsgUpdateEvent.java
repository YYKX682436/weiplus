package com.tencent.mm.feature.chatrecordstts.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/chatrecordstts/api/ChatRecordsTtsPlayingMsgUpdateEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "chatrecordstts-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class ChatRecordsTtsPlayingMsgUpdateEvent extends com.tencent.mm.sdk.event.IEvent {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f65346g;

    /* renamed from: h, reason: collision with root package name */
    public final long f65347h;

    public ChatRecordsTtsPlayingMsgUpdateEvent(java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f65346g = talker;
        this.f65347h = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsPlayingMsgUpdateEvent)) {
            return false;
        }
        com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsPlayingMsgUpdateEvent chatRecordsTtsPlayingMsgUpdateEvent = (com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsPlayingMsgUpdateEvent) obj;
        return kotlin.jvm.internal.o.b(this.f65346g, chatRecordsTtsPlayingMsgUpdateEvent.f65346g) && this.f65347h == chatRecordsTtsPlayingMsgUpdateEvent.f65347h;
    }

    public int hashCode() {
        return (this.f65346g.hashCode() * 31) + java.lang.Long.hashCode(this.f65347h);
    }

    public java.lang.String toString() {
        return "ChatRecordsTtsPlayingMsgUpdateEvent(talker=" + this.f65346g + ", msgId=" + this.f65347h + ')';
    }
}
