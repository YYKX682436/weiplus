package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class kd implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f81358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.ld f81360f;

    public kd(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.ld ldVar) {
        this.f81358d = c0Var;
        this.f81359e = i17;
        this.f81360f = ldVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        this.f81358d.a(this.f81359e, this.f81360f.r(null, ((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d ? jc1.f.f298912a : jc1.f.f298915d, null));
    }
}
