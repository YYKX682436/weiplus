package vn2;

/* loaded from: classes2.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f519865d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f519866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.ev f519867f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.c40 f519868g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vn2.p f519869h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f519870i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.p f519871m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(bw5.ev evVar, bw5.c40 c40Var, vn2.p pVar, yz5.l lVar, yz5.p pVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f519867f = evVar;
        this.f519868g = c40Var;
        this.f519869h = pVar;
        this.f519870i = lVar;
        this.f519871m = pVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        vn2.n nVar = new vn2.n(this.f519867f, this.f519868g, this.f519869h, this.f519870i, this.f519871m, interfaceC29045xdcb5ca57);
        nVar.f519866e = obj;
        return nVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vn2.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        r45.hn6 hn6Var;
        java.lang.Object k17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f519865d;
        vn2.p pVar = this.f519869h;
        bw5.ev evVar = this.f519867f;
        bw5.ju juVar = null;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f519866e;
            if (evVar != null) {
                r45.vs2 vs2Var = new r45.vs2();
                vs2Var.mo11468x92b714fd(evVar.mo14344x5f01b1f6());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb();
                jbVar3.t0(vs2Var);
                jbVar = jbVar3;
            } else {
                jbVar = null;
            }
            bw5.c40 c40Var = this.f519868g;
            if (c40Var == null || c40Var.f107450f != 1) {
                gVar = null;
                hn6Var = null;
            } else {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = c40Var.f107456o[4] ? c40Var.f107451g : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
                bw5.d40 d40Var = new bw5.d40();
                d40Var.mo11468x92b714fd(gVar2.g());
                boolean[] zArr = d40Var.f107844f;
                bw5.wy wyVar = zArr[1] ? d40Var.f107842d : new bw5.wy();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = wyVar.f116410n[3] ? wyVar.f116404e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
                if (!(zArr[2] ? d40Var.f107843e : new bw5.wy()).f116410n[3]) {
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
                }
                r45.hn6 a17 = vn2.p.a(pVar, zArr[1] ? d40Var.f107842d : new bw5.wy(), 23);
                vn2.p.a(pVar, zArr[2] ? d40Var.f107843e : new bw5.wy(), 24);
                gVar = gVar3;
                hn6Var = a17;
            }
            vn2.k kVar = vn2.l.f519848a;
            p3325xe03a0797.p3326xc267989b.f1 b17 = p3325xe03a0797.p3326xc267989b.l.b(y0Var, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new vn2.m(kVar.c(jbVar, null, gVar, 23, kVar.a(9), hn6Var), null), 2, null);
            this.f519866e = jbVar;
            this.f519865d = 1;
            k17 = ((p3325xe03a0797.p3326xc267989b.g1) b17).k(this);
            if (k17 == aVar) {
                return aVar;
            }
            jbVar2 = jbVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jbVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) this.f519866e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            k17 = obj;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c) k17;
        if (cVar.getErrType() == 0 && cVar.getErrCode() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mainFlowResp: ");
            r45.m03 m03Var = cVar.f202439b;
            sb6.append(m03Var.m75941xfb821914(1).size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LongVideoMainFeedsDataFetchModel", sb6.toString());
            r45.pq2 pq2Var = (r45.pq2) m03Var.m75936x14adae67(7);
            bw5.c40 c40Var2 = new bw5.c40();
            bw5.d40 d40Var2 = new bw5.d40();
            d40Var2.f107842d = new bw5.wy().mo11468x92b714fd(m03Var.mo14344x5f01b1f6());
            d40Var2.f107844f[1] = true;
            c40Var2.f107451g = hc2.b.a(d40Var2);
            boolean[] zArr2 = c40Var2.f107456o;
            zArr2[4] = true;
            c40Var2.f107450f = 1;
            zArr2[3] = true;
            c40Var2.f107449e = evVar;
            zArr2[2] = true;
            int i18 = vn2.p.f519878e;
            pVar.getClass();
            boolean z17 = false;
            if (pq2Var != null && pq2Var.m75939xb282bd08(0) > 0 && pq2Var.m75939xb282bd08(1) > 0) {
                z17 = true;
            }
            if (z17) {
                bw5.ju juVar2 = new bw5.ju();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pq2Var);
                juVar = juVar2.mo11468x92b714fd(pq2Var.mo14344x5f01b1f6());
            }
            c40Var2.f107452h = juVar;
            zArr2[5] = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.h3.f187082a.d("preloadLongVideoImpl", jbVar2);
            this.f519870i.mo146xb9724478(c40Var2);
        } else {
            this.f519871m.mo149xb9724478(new java.lang.Integer(-1), "");
        }
        return jz5.f0.f384359a;
    }
}
