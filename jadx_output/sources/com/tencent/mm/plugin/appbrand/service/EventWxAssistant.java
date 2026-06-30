package com.tencent.mm.plugin.appbrand.service;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/service/EventWxAssistant;", "Landroid/os/Parcelable;", "api-protocol.api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class EventWxAssistant implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.service.EventWxAssistant> CREATOR = new com.tencent.mm.plugin.appbrand.service.q0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f88614d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.service.r0 f88615e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Parcelable f88616f;

    public EventWxAssistant(java.lang.String sessionId, com.tencent.mm.plugin.appbrand.service.r0 method, android.os.Parcelable parcelable) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(method, "method");
        this.f88614d = sessionId;
        this.f88615e = method;
        this.f88616f = parcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.service.EventWxAssistant)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.service.EventWxAssistant eventWxAssistant = (com.tencent.mm.plugin.appbrand.service.EventWxAssistant) obj;
        return kotlin.jvm.internal.o.b(this.f88614d, eventWxAssistant.f88614d) && this.f88615e == eventWxAssistant.f88615e && kotlin.jvm.internal.o.b(this.f88616f, eventWxAssistant.f88616f);
    }

    public int hashCode() {
        int hashCode = ((this.f88614d.hashCode() * 31) + this.f88615e.hashCode()) * 31;
        android.os.Parcelable parcelable = this.f88616f;
        return hashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    public java.lang.String toString() {
        return "EventWxAssistant(sessionId=" + this.f88614d + ", method=" + this.f88615e + ", params=" + this.f88616f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f88614d);
        out.writeString(this.f88615e.name());
        out.writeParcelable(this.f88616f, i17);
    }
}
