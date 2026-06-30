package com.tencent.mm.plugin.appbrand.config;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/WxaAttrStorageNotifyEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "data-storage_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class WxaAttrStorageNotifyEvent extends com.tencent.mm.sdk.event.IEvent {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f77399g;

    /* renamed from: h, reason: collision with root package name */
    public final int f77400h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f77401i;

    public WxaAttrStorageNotifyEvent(java.lang.String event, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(event, "event");
        this.f77399g = event;
        this.f77400h = i17;
        this.f77401i = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.config.WxaAttrStorageNotifyEvent)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.config.WxaAttrStorageNotifyEvent wxaAttrStorageNotifyEvent = (com.tencent.mm.plugin.appbrand.config.WxaAttrStorageNotifyEvent) obj;
        return kotlin.jvm.internal.o.b(this.f77399g, wxaAttrStorageNotifyEvent.f77399g) && this.f77400h == wxaAttrStorageNotifyEvent.f77400h && kotlin.jvm.internal.o.b(this.f77401i, wxaAttrStorageNotifyEvent.f77401i);
    }

    public int hashCode() {
        int hashCode = ((this.f77399g.hashCode() * 31) + java.lang.Integer.hashCode(this.f77400h)) * 31;
        java.lang.Object obj = this.f77401i;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public java.lang.String toString() {
        return "WxaAttrStorageNotifyEvent(event=" + this.f77399g + ", eventId=" + this.f77400h + ", obj=" + this.f77401i + ')';
    }
}
