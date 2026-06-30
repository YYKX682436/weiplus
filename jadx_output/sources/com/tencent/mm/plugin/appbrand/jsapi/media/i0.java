package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f81839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f81840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f81841f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ km5.b f81842g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.app.Activity activity, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, km5.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f81840e = activity;
        this.f81841f = recordConfigProvider;
        this.f81842g = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.jsapi.media.i0(this.f81840e, this.f81841f, this.f81842g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.jsapi.media.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f81839d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qc0.c1 c1Var = (qc0.c1) i95.n0.c(qc0.c1.class);
            android.app.Activity activity = this.f81840e;
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider provider = this.f81841f;
            kotlin.jvm.internal.o.f(provider, "$provider");
            this.f81839d = 1;
            obj = ((pc0.e2) c1Var).wi((androidx.activity.ComponentActivity) activity, provider, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        qc0.m1 m1Var = (qc0.m1) obj;
        int i18 = m1Var.f361411b;
        km5.b bVar = this.f81842g;
        if (i18 == 0) {
            bVar.c(com.tencent.mm.plugin.appbrand.jsapi.media.x.f82124a);
        } else if (i18 == -1 && m1Var.f361412c == 0) {
            qc0.l1 a17 = m1Var.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ChooseMediaWorkFlow", "print model info:" + a17);
            kotlin.jvm.internal.o.d(a17);
            java.lang.String str = a17.f361396b;
            kotlin.jvm.internal.o.d(str);
            bVar.c(new com.tencent.mm.plugin.appbrand.jsapi.media.z(kz5.b0.c(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str))), 2));
        } else {
            bVar.c(new com.tencent.mm.plugin.appbrand.jsapi.media.y("get null sight capture result"));
        }
        return jz5.f0.f302826a;
    }
}
