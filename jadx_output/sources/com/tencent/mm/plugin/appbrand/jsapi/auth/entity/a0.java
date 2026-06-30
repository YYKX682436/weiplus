package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes7.dex */
public final class a0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.e f79483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f79484e;

    public a0(de0.e eVar, com.tencent.mm.ipcinvoker.r rVar) {
        this.f79483d = eVar;
        this.f79484e = rVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.z(this.f79484e, i17, i18));
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        this.f79483d.getClass();
        d17.q(2700, this);
    }
}
