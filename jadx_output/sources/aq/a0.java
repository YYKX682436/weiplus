package aq;

/* loaded from: classes4.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f12828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f12829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f12830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f12831g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f12832h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f12833i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f12834m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.lang.String str, java.lang.String str2, double d17, double d18, double d19, double d27, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12828d = str;
        this.f12829e = str2;
        this.f12830f = d17;
        this.f12831g = d18;
        this.f12832h = d19;
        this.f12833i = d27;
        this.f12834m = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq.a0(this.f12828d, this.f12829e, this.f12830f, this.f12831g, this.f12832h, this.f12833i, this.f12834m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.graphics.Bitmap E;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealClusterCropCenterImage >> cropImagePath: ");
        java.lang.String str = this.f12828d;
        sb6.append(str);
        sb6.append(", imagePath: ");
        java.lang.String imagePath = this.f12829e;
        sb6.append(imagePath);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQuerySDKCore", sb6.toString());
        android.graphics.Bitmap M = com.tencent.mm.sdk.platformtools.x.M(imagePath, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, true, null);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (M == null || (E = com.tencent.mm.sdk.platformtools.x.E(M, a06.d.a(this.f12830f), a06.d.a(this.f12831g), a06.d.a(this.f12832h), a06.d.a(this.f12833i), true)) == null) {
            return f0Var;
        }
        try {
            com.tencent.mm.sdk.platformtools.x.D0(E, 100, android.graphics.Bitmap.CompressFormat.PNG, str, true);
            com.tencent.mm.storage.s8 s8Var = com.tencent.mm.storage.s8.f195314a;
            java.lang.String str2 = aq.o.f12921b;
            java.lang.String valueOf = java.lang.String.valueOf(this.f12834m);
            kotlin.jvm.internal.o.f(imagePath, "$imagePath");
            s8Var.j(str2, valueOf, str, imagePath);
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageQuerySDKCore", "saveBitmapToImage error >> cropImagePath: " + str);
        }
        return f0Var;
    }
}
