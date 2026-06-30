package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class c8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f189289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.h8 f189290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f189291f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.a71 f189292g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 f189293h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fp0.r f189294i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.h8 h8Var, java.lang.Object obj, r45.a71 a71Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var, fp0.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f189290e = h8Var;
        this.f189291f = obj;
        this.f189292g = a71Var;
        this.f189293h = n0Var;
        this.f189294i = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.c8(this.f189290e, this.f189291f, this.f189292g, this.f189293h, this.f189294i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.c8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f189289d;
        java.lang.Object obj2 = this.f189291f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.h8 h8Var = this.f189290e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n8) obj2).f189745a;
            im5.c cVar = h8Var.f189448m;
            this.f189289d = 1;
            h8Var.getClass();
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            java.lang.String m56464xb5886c64 = h8Var.m56464xb5886c64();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lbsStreamFetchImpl pullType=");
            sb6.append(i18);
            sb6.append('(');
            r45.a71 a71Var = this.f189292g;
            sb6.append(a71Var.m75939xb282bd08(4));
            sb6.append(") location=");
            r45.jd1 jd1Var = (r45.jd1) a71Var.m75936x14adae67(5);
            sb6.append(jd1Var != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.h8.c(h8Var, jd1Var) : null);
            sb6.append(",real_location=");
            r45.jd1 jd1Var2 = (r45.jd1) a71Var.m75936x14adae67(6);
            sb6.append(jd1Var2 != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.h8.c(h8Var, jd1Var2) : null);
            sb6.append(",lastBuffer=");
            sb6.append(a71Var.m75934xbce7f2f(2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
            pq5.g l17 = ((az2.j) a71Var.d()).l();
            if (cVar != null) {
                l17.f(cVar);
            }
            l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e8(nVar, h8Var, i18, a71Var));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o8 o8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o8) obj;
        this.f189293h.mo55587xb461ee3d(o8Var);
        this.f189294i.b(fp0.u.f346823f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h8Var.m56464xb5886c64(), "lbsStreamFetch pullType=" + ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n8) obj2).f189745a + " end," + o8Var);
        return jz5.f0.f384359a;
    }
}
