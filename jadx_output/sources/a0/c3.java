package a0;

/* loaded from: classes10.dex */
public final class c3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f98d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f99e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.m3 f100f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f101g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f102h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(boolean z17, a0.m3 m3Var, float f17, float f18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f99e = z17;
        this.f100f = m3Var;
        this.f101g = f17;
        this.f102h = f18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a0.c3(this.f99e, this.f100f, this.f101g, this.f102h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.c3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f98d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.f99e) {
                a0.m3 m3Var = this.f100f;
                float f17 = this.f101g;
                this.f98d = 1;
                if (b0.o2.b(m3Var, f17, null, this, 2, null) == aVar) {
                    return aVar;
                }
            } else {
                a0.m3 m3Var2 = this.f100f;
                float f18 = this.f102h;
                this.f98d = 2;
                if (b0.o2.b(m3Var2, f18, null, this, 2, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
