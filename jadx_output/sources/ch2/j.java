package ch2;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f41378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f41379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hn2.d f41380f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f41381g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(sf2.d3 d3Var, hn2.d dVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41379e = d3Var;
        this.f41380f = dVar;
        this.f41381g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.j(this.f41379e, this.f41380f, this.f41381g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.gy1 gy1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f41378d;
        sf2.d3 d3Var = this.f41379e;
        hn2.d dVar = this.f41380f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sf2.d3 d3Var2 = this.f41379e;
            hn2.d dVar2 = this.f41380f;
            r45.dy1 dy1Var = new r45.dy1();
            dy1Var.f372844d = this.f41381g;
            boolean z17 = dVar.f282516l;
            hn2.e eVar = dVar.f282517m;
            if (eVar != null) {
                gy1Var = new r45.gy1();
                gy1Var.f375635d = eVar.f282519a;
                gy1Var.f375636e = eVar.f282520b;
                gy1Var.f375637f = eVar.f282521c;
            } else {
                gy1Var = null;
            }
            this.f41378d = 1;
            obj = d3Var2.r7(dVar2, dy1Var, z17, gy1Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                d3Var.f407106p = null;
                d3Var.f407107q = null;
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.mx1 mx1Var = (r45.mx1) obj;
        if (mx1Var != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveKTVController", "Request item done");
            ch2.i iVar = ch2.i.f41370d;
            this.f41378d = 2;
            if (d3Var.d7(dVar, mx1Var, iVar, this) == aVar) {
                return aVar;
            }
        } else {
            com.tencent.mars.xlog.Log.e("FinderLiveKTVController", "Request item failed");
        }
        d3Var.f407106p = null;
        d3Var.f407107q = null;
        return jz5.f0.f302826a;
    }
}
