package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/WxaAttrStorageNotifyEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "data-storage_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttrStorageNotifyEvent */
/* loaded from: classes3.dex */
public final /* data */ class C11822x3b96e8c7 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f158932g;

    /* renamed from: h, reason: collision with root package name */
    public final int f158933h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f158934i;

    public C11822x3b96e8c7(java.lang.String event, int i17, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        this.f158932g = event;
        this.f158933h = i17;
        this.f158934i = obj;
    }

    /* renamed from: equals */
    public boolean m50130xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11822x3b96e8c7)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11822x3b96e8c7 c11822x3b96e8c7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11822x3b96e8c7) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f158932g, c11822x3b96e8c7.f158932g) && this.f158933h == c11822x3b96e8c7.f158933h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f158934i, c11822x3b96e8c7.f158934i);
    }

    /* renamed from: hashCode */
    public int m50131x8cdac1b() {
        int hashCode = ((this.f158932g.hashCode() * 31) + java.lang.Integer.hashCode(this.f158933h)) * 31;
        java.lang.Object obj = this.f158934i;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m50132x9616526c() {
        return "WxaAttrStorageNotifyEvent(event=" + this.f158932g + ", eventId=" + this.f158933h + ", obj=" + this.f158934i + ')';
    }
}
