package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class g9 extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81243d;

    public g9(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f81243d = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        if (this.f81243d.getAppId() != null) {
            com.tencent.mm.plugin.appbrand.m6.a(this.f81243d.getAppId()).f85713f = false;
        }
        com.tencent.mm.plugin.appbrand.x0.e(this.f81243d.getAppId(), this);
    }
}
