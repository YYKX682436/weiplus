package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/api/OnWeAppFinishedEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "protocol-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.api.OnWeAppFinishedEvent */
/* loaded from: classes.dex */
public final /* data */ class C11560xc99a07f4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f156489g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f156490h;

    public C11560xc99a07f4(java.lang.String username, java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f156489g = username;
        this.f156490h = appId;
    }

    /* renamed from: equals */
    public boolean m48846xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11560xc99a07f4)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11560xc99a07f4 c11560xc99a07f4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11560xc99a07f4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156489g, c11560xc99a07f4.f156489g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156490h, c11560xc99a07f4.f156490h);
    }

    /* renamed from: hashCode */
    public int m48847x8cdac1b() {
        return (this.f156489g.hashCode() * 31) + this.f156490h.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m48848x9616526c() {
        return "OnWeAppFinishedEvent(username=" + this.f156489g + ", appId=" + this.f156490h + ')';
    }
}
