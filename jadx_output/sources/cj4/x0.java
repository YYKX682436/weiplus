package cj4;

/* loaded from: classes11.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f42048d;

    /* renamed from: e, reason: collision with root package name */
    public int f42049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mj4.h f42050f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f42051g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(mj4.h hVar, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f42050f = hVar;
        this.f42051g = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cj4.x0(this.f42050f, this.f42051g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cj4.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f42049e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        mj4.h hVar = this.f42050f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (hVar == null) {
                return f0Var;
            }
            h0Var = new kotlin.jvm.internal.h0();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            cj4.v0 v0Var = new cj4.v0(h0Var, this.f42051g, null);
            this.f42048d = h0Var;
            this.f42049e = 1;
            if (kotlinx.coroutines.l.g(g3Var, v0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (kotlin.jvm.internal.h0) this.f42048d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("blogapp");
        arrayList.add("tmessage");
        arrayList.add("officialaccounts");
        arrayList.add("service_officialaccounts");
        arrayList.add("helper_entry");
        arrayList.add(c01.z1.r());
        boolean a17 = com.tencent.mm.contact.d.f64855g.a();
        g95.d dVar = g95.e.f269801a;
        p75.m c17 = dVar.g().c(a17 ? dm.e2.Y1.l(kz5.b0.c("0")) : dm.e2.P1.t("'%@%'"));
        p75.d dVar2 = dm.e2.P1;
        p75.m d17 = c17.c(dVar2.s(arrayList)).d(dVar2.j("weixin"));
        p75.i0 g17 = dm.e2.N1.g(kz5.b0.c(dVar2));
        g17.f352656c = "MicroMsg.TextStatus.BaseStatusLoadLogic";
        g17.f352657d = d17;
        g17.f352659f = dVar.h();
        p75.l0 a18 = g17.a();
        si4.a d18 = qi4.p.f363776a.d(true);
        si4.c cVar = d18 instanceof si4.c ? (si4.c) d18 : null;
        ((mj4.k) hVar).o();
        ((mj4.k) hVar).l();
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : a18.l(gm0.j1.u().f273153f)) {
            if (hashSet.size() <= 1000 || hashSet.contains(str)) {
                mj4.k kVar = (mj4.k) hVar;
                kVar.getClass();
                mj4.j jVar = new mj4.j(kVar);
                jVar.h(str);
                jVar.g(str.concat("_xx"));
                mj4.h a19 = jVar.a();
                if (cVar != null) {
                    cVar.s(a19);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.BaseStatusLoadLogic", "set user:" + str + " status " + hashSet.size());
            }
        }
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
        cj4.w0 w0Var = new cj4.w0(h0Var, null);
        this.f42048d = null;
        this.f42049e = 2;
        return kotlinx.coroutines.l.g(g3Var2, w0Var, this) == aVar ? aVar : f0Var;
    }
}
