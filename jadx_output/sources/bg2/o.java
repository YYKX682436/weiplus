package bg2;

/* loaded from: classes3.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20341d;

    /* renamed from: e, reason: collision with root package name */
    public int f20342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f20343f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg2.r f20344g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.util.List list, bg2.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20343f = list;
        this.f20344g = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.o(this.f20343f, this.f20344g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object j17;
        bg2.r rVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f20342e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.List<r45.h30> list = this.f20343f;
            if (list != null) {
                bg2.r rVar2 = this.f20344g;
                this.f20341d = rVar2;
                this.f20342e = 1;
                rVar2.getClass();
                kotlinx.coroutines.r rVar3 = new kotlinx.coroutines.r(pz5.f.b(this), 1);
                rVar3.k();
                v65.n nVar = new v65.n(rVar3);
                for (r45.h30 h30Var : list) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.String string = h30Var.getString(0);
                    int integer = h30Var.getInteger(1);
                    r45.mb4 mb4Var = new r45.mb4();
                    mb4Var.set(9, com.tencent.mm.sdk.platformtools.w2.a(string));
                    mb4Var.set(0, string);
                    mb4Var.set(1, string);
                    java.lang.String k17 = hc2.l.k(string);
                    mb4Var.set(46, k17);
                    mb4Var.set(47, k17);
                    mn2.c1 c1Var = new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null);
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    wo0.c a17 = g1Var.e().a(c1Var);
                    a17.g(g1Var.h(mn2.f1.f329953d));
                    a17.f447873d = new bg2.m(arrayList, arrayList2, integer, list, nVar);
                    a17.a();
                }
                j17 = rVar3.j();
                pz5.a aVar2 = pz5.a.f359186d;
                if (j17 == aVar) {
                    return aVar;
                }
                rVar = rVar2;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rVar = (bg2.r) this.f20341d;
        kotlin.ResultKt.throwOnFailure(obj);
        j17 = obj;
        jz5.l lVar = (jz5.l) j17;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView finderLiveConfettiView = rVar.f20437m;
        if (finderLiveConfettiView != null) {
            finderLiveConfettiView.b((java.util.ArrayList) lVar.f302833d, (java.util.ArrayList) lVar.f302834e);
        }
        return jz5.f0.f302826a;
    }
}
