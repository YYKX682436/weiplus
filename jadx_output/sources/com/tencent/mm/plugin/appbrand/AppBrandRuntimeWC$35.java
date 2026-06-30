package com.tencent.mm.plugin.appbrand;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class AppBrandRuntimeWC$35 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f74867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandRuntimeWC$35(com.tencent.mm.plugin.appbrand.o6 o6Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f74867d = o6Var;
        this.__eventId = -1441357655;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent notifyWxaCommLibUpdatedEvent) {
        this.f74867d.m(new com.tencent.mm.plugin.appbrand.b8(this, notifyWxaCommLibUpdatedEvent));
        return false;
    }
}
