package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes2.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f88558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f1 f88559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f1 f88560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f88561g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88562h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kotlinx.coroutines.f1 f1Var, kotlinx.coroutines.f1 f1Var2, com.tencent.mm.vfs.r6 r6Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f88559e = f1Var;
        this.f88560f = f1Var2;
        this.f88561g = r6Var;
        this.f88562h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.screenshot.t(this.f88559e, this.f88560f, this.f88561g, this.f88562h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.screenshot.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f88558d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f88558d = 1;
            obj = this.f88559e.k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        kotlinx.coroutines.f1 f1Var = this.f88560f;
        if (bitmap == null) {
            this.f88558d = 2;
            obj = f1Var.k(this);
            return obj == aVar ? aVar : obj;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotComponentHelper", "getGenImgPath: custom poster success, cancelling default poster");
        kotlinx.coroutines.p2.a(f1Var, null, 1, null);
        com.tencent.mm.vfs.r6 r6Var = this.f88561g;
        if (r6Var.m()) {
            r6Var.l();
        }
        return this.f88562h;
    }
}
