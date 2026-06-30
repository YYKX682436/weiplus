package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class ce extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f86502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f86503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f86504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86505g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f86506h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(android.graphics.Bitmap bitmap, boolean z17, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f86502d = bitmap;
        this.f86503e = z17;
        this.f86504f = v5Var;
        this.f86505g = str;
        this.f86506h = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.page.ce(this.f86502d, this.f86503e, this.f86504f, this.f86505g, this.f86506h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.page.ce) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86504f;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.graphics.Bitmap bitmap = this.f86502d;
        if (bitmap != null) {
            try {
                if (!this.f86503e) {
                    android.view.ViewGroup E1 = v5Var.E1();
                    com.tencent.mm.plugin.appbrand.page.ie.a(E1, E1, new android.graphics.Canvas(bitmap));
                }
            } finally {
                v5Var.getAppId();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                android.os.SystemClock.elapsedRealtime();
            }
        }
        return bitmap;
    }
}
