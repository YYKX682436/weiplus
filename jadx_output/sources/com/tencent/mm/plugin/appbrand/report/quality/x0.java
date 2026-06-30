package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.d1 f88377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f88378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.j0 f88379f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f88380g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.l0 f88381h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.plugin.appbrand.report.quality.d1 d1Var, com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.report.quality.j0 j0Var, android.graphics.Bitmap bitmap, com.tencent.mm.plugin.appbrand.report.quality.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f88377d = d1Var;
        this.f88378e = n7Var;
        this.f88379f = j0Var;
        this.f88380g = bitmap;
        this.f88381h = l0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.report.quality.x0(this.f88377d, this.f88378e, this.f88379f, this.f88380g, this.f88381h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.report.quality.x0 x0Var = (com.tencent.mm.plugin.appbrand.report.quality.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.appbrand.report.quality.d1.a(this.f88377d, this.f88378e, this.f88379f, this.f88380g, this.f88381h);
        return jz5.f0.f302826a;
    }
}
