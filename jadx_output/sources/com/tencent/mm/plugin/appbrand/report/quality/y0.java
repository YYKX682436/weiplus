package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f88383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f88384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.d1 f88385f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f88386g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f88387h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.j0 f88388i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(kotlinx.coroutines.r2 r2Var, com.tencent.mm.plugin.appbrand.report.quality.d1 d1Var, com.tencent.mm.plugin.appbrand.page.n7 n7Var, long j17, com.tencent.mm.plugin.appbrand.report.quality.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f88384e = r2Var;
        this.f88385f = d1Var;
        this.f88386g = n7Var;
        this.f88387h = j17;
        this.f88388i = j0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.report.quality.y0(this.f88384e, this.f88385f, this.f88386g, this.f88387h, this.f88388i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.report.quality.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[Catch: all -> 0x0097, TryCatch #1 {all -> 0x0097, blocks: (B:7:0x0016, B:12:0x0023, B:13:0x0062, B:15:0x0066, B:19:0x0074, B:33:0x0029, B:34:0x0046, B:38:0x0030, B:40:0x0034), top: B:2:0x000e }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.report.quality.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
