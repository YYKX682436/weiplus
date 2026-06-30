package a82;

/* loaded from: classes12.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f2160d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o72.e2 f2162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.m f2163g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a82.t f2164h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(o72.e2 e2Var, dn.m mVar, a82.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f2162f = e2Var;
        this.f2163g = mVar;
        this.f2164h = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        a82.s sVar = new a82.s(this.f2162f, this.f2163g, this.f2164h, continuation);
        sVar.f2161e = obj;
        return sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a82.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f2160d;
        dn.m task = this.f2163g;
        o72.e2 e2Var = this.f2162f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f2161e;
            if (e2Var.y0()) {
                a82.g2 g2Var = a82.g2.f2000a;
                java.lang.String field_cdnUrl = e2Var.field_cdnUrl;
                kotlin.jvm.internal.o.f(field_cdnUrl, "field_cdnUrl");
                int i18 = e2Var.field_dataType;
                this.f2161e = y0Var;
                this.f2160d = 1;
                if (g2Var.b(task, field_cdnUrl, i18, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    throw new jz5.d();
                }
                if (i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                ((java.lang.Number) obj).longValue();
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).getClass();
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mm.modelcdntran.z aj6 = com.tencent.mm.modelcdntran.s1.aj();
        kotlinx.coroutines.flow.n2 d76 = aj6 != null ? aj6.d7(task) : null;
        a82.t tVar = this.f2164h;
        if (d76 != null) {
            a82.r rVar = new a82.r(tVar, e2Var);
            this.f2161e = null;
            this.f2160d = 2;
            if (d76.a(rVar, this) == aVar) {
                return aVar;
            }
            throw new jz5.d();
        }
        v65.h c76 = tVar.c7();
        java.lang.String field_dataId = e2Var.field_dataId;
        kotlin.jvm.internal.o.f(field_dataId, "field_dataId");
        this.f2161e = null;
        this.f2160d = 3;
        obj = c76.d(field_dataId, this);
        if (obj == aVar) {
            return aVar;
        }
        ((java.lang.Number) obj).longValue();
        return jz5.f0.f302826a;
    }
}
