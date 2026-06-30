package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class l2 extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81911d;

    public l2(com.tencent.mm.plugin.appbrand.jsapi.media.e3 e3Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f81911d = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        if (this.f81911d.getAppId() != null) {
            com.tencent.mm.plugin.appbrand.m6.a(this.f81911d.getAppId()).f85713f = false;
        }
        com.tencent.mm.plugin.appbrand.x0.e(this.f81911d.getAppId(), this);
    }
}
