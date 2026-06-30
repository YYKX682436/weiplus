package com.tencent.mm.plugin.appbrand.ui.authrize;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/authrize/OnWxaAuthorizeScopeModifyEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class OnWxaAuthorizeScopeModifyEvent extends com.tencent.mm.sdk.event.IEvent {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f89514g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f89515h;

    public OnWxaAuthorizeScopeModifyEvent(java.lang.String username, java.util.List authorizeInfoList) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(authorizeInfoList, "authorizeInfoList");
        this.f89514g = username;
        this.f89515h = authorizeInfoList;
    }
}
