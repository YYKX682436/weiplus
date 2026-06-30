package com.tencent.mm.feature.wxpay;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class WxPayFeatureService$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.wxpay.j f67840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WxPayFeatureService$1(com.tencent.mm.feature.wxpay.j jVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f67840d = jVar;
        this.__eventId = 1489935310;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent beforeAggressiveCleanCacheEvent) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.feature.wxpay.i(this, beforeAggressiveCleanCacheEvent));
        return false;
    }
}
