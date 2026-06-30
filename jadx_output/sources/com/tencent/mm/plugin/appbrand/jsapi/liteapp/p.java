package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes8.dex */
public class p implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f81550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.liteapp.s f81552c;

    public p(com.tencent.mm.plugin.appbrand.jsapi.liteapp.s sVar, com.tencent.mm.ipcinvoker.r rVar, java.lang.String str) {
        this.f81552c = sVar;
        this.f81550a = rVar;
        this.f81551b = str;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        this.f81550a.a(new com.tencent.mm.ipcinvoker.type.IPCLong(-1L));
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        com.tencent.mm.ipcinvoker.r rVar = this.f81550a;
        if (wxaLiteAppInfo == null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(-1L));
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.liteapp.r rVar2 = com.tencent.mm.plugin.appbrand.jsapi.liteapp.s.f81556d;
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(this.f81552c.a(this.f81551b)));
        }
    }
}
