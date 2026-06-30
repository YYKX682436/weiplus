package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WCPayWalletBufferEvent f82690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f82692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.x f82693g;

    public w(com.tencent.mm.plugin.appbrand.jsapi.pay.x xVar, com.tencent.mm.autogen.events.WCPayWalletBufferEvent wCPayWalletBufferEvent, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f82693g = xVar;
        this.f82690d = wCPayWalletBufferEvent;
        this.f82691e = lVar;
        this.f82692f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.WCPayWalletBufferEvent wCPayWalletBufferEvent = this.f82690d;
        int i17 = wCPayWalletBufferEvent.f54952h.f6626a;
        com.tencent.mm.plugin.appbrand.jsapi.pay.x xVar = this.f82693g;
        int i18 = this.f82692f;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82691e;
        if (i17 == 0) {
            new java.util.HashMap().put("buffer", wCPayWalletBufferEvent.f54952h.f6627b);
            lVar.a(i18, xVar.o("ok"));
        } else if (i17 == -2) {
            lVar.a(i18, xVar.o("null"));
        } else {
            lVar.a(i18, xVar.o("fail"));
        }
    }
}
