package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/chatrecordstts/api/ChatRecordsTtsPlayingMsgUpdateEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "chatrecordstts-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsPlayingMsgUpdateEvent */
/* loaded from: classes3.dex */
public final /* data */ class C10514xf2447a75 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f146879g;

    /* renamed from: h, reason: collision with root package name */
    public final long f146880h;

    public C10514xf2447a75(java.lang.String talker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        this.f146879g = talker;
        this.f146880h = j17;
    }

    /* renamed from: equals */
    public boolean m44134xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.api.C10514xf2447a75)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.api.C10514xf2447a75 c10514xf2447a75 = (com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.api.C10514xf2447a75) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f146879g, c10514xf2447a75.f146879g) && this.f146880h == c10514xf2447a75.f146880h;
    }

    /* renamed from: hashCode */
    public int m44135x8cdac1b() {
        return (this.f146879g.hashCode() * 31) + java.lang.Long.hashCode(this.f146880h);
    }

    /* renamed from: toString */
    public java.lang.String m44136x9616526c() {
        return "ChatRecordsTtsPlayingMsgUpdateEvent(talker=" + this.f146879g + ", msgId=" + this.f146880h + ')';
    }
}
