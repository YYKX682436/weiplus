package ah3;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f4915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ah3.v f4916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ah3.n f4917f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f4918g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f4919h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f4920i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ah3.v vVar, ah3.n nVar, java.util.List list, kotlinx.coroutines.y0 y0Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4916e = vVar;
        this.f4917f = nVar;
        this.f4918g = list;
        this.f4919h = y0Var;
        this.f4920i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ah3.p(this.f4916e, this.f4917f, this.f4918g, this.f4919h, this.f4920i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ah3.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f4915d;
        ah3.v vVar = this.f4916e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.sync.m mVar = vVar.f4973a;
                this.f4915d = 1;
                if (((kotlinx.coroutines.sync.o) mVar).a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return (java.util.List) obj;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            int i18 = vVar.f4974b + 1;
            vVar.f4974b = i18;
            vVar.f4975c = java.lang.Math.max(i18, vVar.f4975c);
            ah3.n nVar = this.f4917f;
            nVar.f4910b++;
            ah3.v vVar2 = this.f4916e;
            java.util.List list = this.f4918g;
            kotlinx.coroutines.y0 y0Var = this.f4919h;
            yz5.l lVar = this.f4920i;
            this.f4915d = 2;
            obj = ah3.v.b(vVar2, list, y0Var, lVar, nVar, this);
            if (obj == aVar) {
                return aVar;
            }
            return (java.util.List) obj;
        } finally {
            vVar.f4974b--;
            ((kotlinx.coroutines.sync.o) vVar.f4973a).c();
        }
    }
}
