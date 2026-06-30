package com.tencent.mm.feature.chatrecordstts.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/chatrecordstts/api/ChatRecordsTtsPlaybackStateUpdateEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "chatrecordstts-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class ChatRecordsTtsPlaybackStateUpdateEvent extends com.tencent.mm.sdk.event.IEvent {

    /* renamed from: g, reason: collision with root package name */
    public final oy.k f65345g;

    public ChatRecordsTtsPlaybackStateUpdateEvent(oy.k state) {
        kotlin.jvm.internal.o.g(state, "state");
        this.f65345g = state;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsPlaybackStateUpdateEvent) && this.f65345g == ((com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsPlaybackStateUpdateEvent) obj).f65345g;
    }

    public int hashCode() {
        return this.f65345g.hashCode();
    }

    public java.lang.String toString() {
        return "ChatRecordsTtsPlaybackStateUpdateEvent(state=" + this.f65345g + ')';
    }
}
