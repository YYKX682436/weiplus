package by0;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f36339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ by0.n f36340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f36341f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f36342g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(by0.n nVar, com.tencent.maas.model.time.MJTime mJTime, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f36340e = nVar;
        this.f36341f = mJTime;
        this.f36342g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new by0.m(this.f36340e, this.f36341f, this.f36342g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((by0.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f36339d;
        by0.n nVar = this.f36340e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            by0.k kVar = nVar.f36343a;
            this.f36339d = 1;
            gx0.bf bfVar = (gx0.bf) kVar;
            bfVar.getClass();
            obj = kotlinx.coroutines.l.g(bfVar.f276253t, new gx0.we(bfVar, this.f36341f, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap == null) {
            return null;
        }
        float min = java.lang.Math.min(640.0f / bitmap.getWidth(), 640.0f / bitmap.getHeight());
        android.graphics.Bitmap F0 = com.tencent.mm.sdk.platformtools.x.F0(bitmap, min, min, true);
        by0.j jVar = new by0.j();
        jVar.d();
        kotlin.jvm.internal.o.d(F0);
        java.lang.String c17 = jVar.c(F0);
        jVar.a();
        nVar.f36344b.put(this.f36342g, new zu0.l(((gx0.bf) nVar.f36343a).i7(), F0, c17));
        return jz5.f0.f302826a;
    }
}
