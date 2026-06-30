package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/chatrecordstts/api/ChatRecordsTtsFloatBallClickEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "chatrecordstts-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsFloatBallClickEvent */
/* loaded from: classes3.dex */
public final /* data */ class C10512x81402a24 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f146876g;

    /* renamed from: h, reason: collision with root package name */
    public final long f146877h;

    public C10512x81402a24(java.lang.String talker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        this.f146876g = talker;
        this.f146877h = j17;
    }

    /* renamed from: equals */
    public boolean m44128xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.api.C10512x81402a24)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.api.C10512x81402a24 c10512x81402a24 = (com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.api.C10512x81402a24) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f146876g, c10512x81402a24.f146876g) && this.f146877h == c10512x81402a24.f146877h;
    }

    /* renamed from: hashCode */
    public int m44129x8cdac1b() {
        return (this.f146876g.hashCode() * 31) + java.lang.Long.hashCode(this.f146877h);
    }

    /* renamed from: toString */
    public java.lang.String m44130x9616526c() {
        return "ChatRecordsTtsFloatBallClickEvent(talker=" + this.f146876g + ", msgId=" + this.f146877h + ')';
    }
}
