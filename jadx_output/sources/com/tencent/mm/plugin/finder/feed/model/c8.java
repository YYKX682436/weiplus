package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class c8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f107756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.h8 f107757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f107758f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.a71 f107759g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f107760h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fp0.r f107761i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(com.tencent.mm.plugin.finder.feed.model.h8 h8Var, java.lang.Object obj, r45.a71 a71Var, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, fp0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f107757e = h8Var;
        this.f107758f = obj;
        this.f107759g = a71Var;
        this.f107760h = n0Var;
        this.f107761i = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.model.c8(this.f107757e, this.f107758f, this.f107759g, this.f107760h, this.f107761i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.model.c8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f107756d;
        java.lang.Object obj2 = this.f107758f;
        com.tencent.mm.plugin.finder.feed.model.h8 h8Var = this.f107757e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = ((com.tencent.mm.plugin.finder.feed.model.n8) obj2).f108212a;
            im5.c cVar = h8Var.f107915m;
            this.f107756d = 1;
            h8Var.getClass();
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            java.lang.String tag = h8Var.getTAG();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lbsStreamFetchImpl pullType=");
            sb6.append(i18);
            sb6.append('(');
            r45.a71 a71Var = this.f107759g;
            sb6.append(a71Var.getInteger(4));
            sb6.append(") location=");
            r45.jd1 jd1Var = (r45.jd1) a71Var.getCustom(5);
            sb6.append(jd1Var != null ? com.tencent.mm.plugin.finder.feed.model.h8.c(h8Var, jd1Var) : null);
            sb6.append(",real_location=");
            r45.jd1 jd1Var2 = (r45.jd1) a71Var.getCustom(6);
            sb6.append(jd1Var2 != null ? com.tencent.mm.plugin.finder.feed.model.h8.c(h8Var, jd1Var2) : null);
            sb6.append(",lastBuffer=");
            sb6.append(a71Var.getByteString(2));
            com.tencent.mars.xlog.Log.i(tag, sb6.toString());
            pq5.g l17 = ((az2.j) a71Var.d()).l();
            if (cVar != null) {
                l17.f(cVar);
            }
            l17.K(new com.tencent.mm.plugin.finder.feed.model.e8(nVar, h8Var, i18, a71Var));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.finder.feed.model.o8 o8Var = (com.tencent.mm.plugin.finder.feed.model.o8) obj;
        this.f107760h.onFetchDone(o8Var);
        this.f107761i.b(fp0.u.f265290f);
        com.tencent.mars.xlog.Log.i(h8Var.getTAG(), "lbsStreamFetch pullType=" + ((com.tencent.mm.plugin.finder.feed.model.n8) obj2).f108212a + " end," + o8Var);
        return jz5.f0.f302826a;
    }
}
