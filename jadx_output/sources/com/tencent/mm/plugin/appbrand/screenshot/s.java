package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f88549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.screenshot.v f88550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f88551f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88552g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88553h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.appbrand.screenshot.v vVar, android.content.Context context, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f88550e = vVar;
        this.f88551f = context;
        this.f88552g = str;
        this.f88553h = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.screenshot.s(this.f88550e, this.f88551f, this.f88552g, this.f88553h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.screenshot.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f88549d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotComponentHelper", "getGenImgPath: launching default poster generation");
            this.f88549d = 1;
            obj = com.tencent.mm.plugin.appbrand.screenshot.v.j(this.f88550e, this.f88551f, this.f88552g, this.f88553h, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
