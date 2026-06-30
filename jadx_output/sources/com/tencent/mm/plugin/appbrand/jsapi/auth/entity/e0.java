package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes7.dex */
public final class e0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 f79495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f79496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f79497f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.l f79498g;

    public e0(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var, int i17, java.util.ArrayList arrayList, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.l lVar) {
        this.f79495d = m0Var;
        this.f79496e = i17;
        this.f79497f = arrayList;
        this.f79498g = lVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.d0((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj, this.f79495d, this.f79496e, this.f79497f, this.f79498g));
    }
}
