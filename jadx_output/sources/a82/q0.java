package a82;

/* loaded from: classes4.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f2132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.re f2133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f2134f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f2135g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r45.re reVar, yz5.q qVar, o72.r2 r2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f2133e = reVar;
        this.f2134f = qVar;
        this.f2135g = r2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a82.q0(this.f2133e, this.f2134f, this.f2135g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a82.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f2132d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.re reVar = this.f2133e;
            reVar.getClass();
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 11485;
            lVar.f70666c = "/cgi-bin/micromsg-bin/batchdelfavitembysourceid";
            lVar.f70664a = reVar;
            lVar.f70665b = new r45.se();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            this.f2132d = 1;
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavDeleteService", "deleteBySourceId cgiBack:" + fVar);
        yz5.q qVar = this.f2134f;
        if (qVar != null) {
            java.lang.Integer num = new java.lang.Integer(fVar.f70616b);
            java.lang.Integer num2 = new java.lang.Integer(fVar.f70615a);
            java.lang.String str = fVar.f70617c;
            if (str == null) {
                str = "";
            }
            qVar.invoke(num, num2, str);
        }
        if (fVar.b()) {
            gm0.j1.e().j(new a82.p0(this.f2135g, fVar));
        }
        return jz5.f0.f302826a;
    }
}
