package com.tencent.mm.plugin.appbrand.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/api/OnWeAppFinishedEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "protocol-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class OnWeAppFinishedEvent extends com.tencent.mm.sdk.event.IEvent {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f74956g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f74957h;

    public OnWeAppFinishedEvent(java.lang.String username, java.lang.String appId) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f74956g = username;
        this.f74957h = appId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.api.OnWeAppFinishedEvent)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.api.OnWeAppFinishedEvent onWeAppFinishedEvent = (com.tencent.mm.plugin.appbrand.api.OnWeAppFinishedEvent) obj;
        return kotlin.jvm.internal.o.b(this.f74956g, onWeAppFinishedEvent.f74956g) && kotlin.jvm.internal.o.b(this.f74957h, onWeAppFinishedEvent.f74957h);
    }

    public int hashCode() {
        return (this.f74956g.hashCode() * 31) + this.f74957h.hashCode();
    }

    public java.lang.String toString() {
        return "OnWeAppFinishedEvent(username=" + this.f74956g + ", appId=" + this.f74957h + ')';
    }
}
