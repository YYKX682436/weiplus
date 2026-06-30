package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f88491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f1 f88492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88493f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88494g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(kotlinx.coroutines.f1 f1Var, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f88492e = f1Var;
        this.f88493f = str;
        this.f88494g = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.screenshot.h1(this.f88492e, this.f88493f, this.f88494g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.screenshot.h1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f88491d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f88491d = 1;
            if (this.f88492e.k(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        uk0.a.c(new com.tencent.mm.plugin.appbrand.screenshot.RecordScreenshotTakeReactor$ScreenshotMoveInfo(this.f88493f, this.f88494g), com.tencent.mm.plugin.appbrand.screenshot.g1.f88487d, null, 4, null);
        return jz5.f0.f302826a;
    }
}
