package qf2;

/* loaded from: classes3.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f443971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.c f443972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f443973f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f443974g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f443975h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ km2.q f443976i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443977m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443978n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, km2.c cVar, boolean z17, qf2.v0 v0Var, boolean z18, km2.q qVar, yz5.l lVar, java.lang.String str) {
        super(2, interfaceC29045xdcb5ca57);
        this.f443971d = hVar;
        this.f443972e = cVar;
        this.f443973f = z17;
        this.f443974g = v0Var;
        this.f443975h = z18;
        this.f443976i = qVar;
        this.f443977m = lVar;
        this.f443978n = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.k0(this.f443971d, interfaceC29045xdcb5ca57, this.f443972e, this.f443973f, this.f443974g, this.f443975h, this.f443976i, this.f443977m, this.f443978n);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.k0 k0Var = (qf2.k0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        k0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close pk response success sessionId: ");
        km2.c cVar = this.f443972e;
        sb6.append(cVar != null ? cVar.f390609a : null);
        sb6.append(" isAnchorSelfExit: ");
        sb6.append(this.f443973f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", sb6.toString());
        if (this.f443973f) {
            java.util.List list = ((mm2.o4) this.f443974g.m56788xbba4bfc0(mm2.o4.class)).f410857s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-anchorPkMicUserList>(...)");
            pm0.v.G(list, qf2.a0.f443813d);
            java.util.List list2 = ((mm2.o4) this.f443974g.m56788xbba4bfc0(mm2.o4.class)).f410858t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-anchorPkMicUserTempList>(...)");
            pm0.v.G(list2, qf2.b0.f443821d);
            java.util.List list3 = ((mm2.o4) this.f443974g.m56788xbba4bfc0(mm2.o4.class)).f410851o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list3, "<get-linkMicUserList>(...)");
            pm0.v.I(list3, qf2.c0.f443839d);
            java.util.List list4 = ((mm2.o4) this.f443974g.m56788xbba4bfc0(mm2.o4.class)).f410868z;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list4, "<get-linkMicUserInfoList>(...)");
            pm0.v.G(list4, qf2.d0.f443859d);
            java.util.Set set = ((mm2.o4) this.f443974g.m56788xbba4bfc0(mm2.o4.class)).P;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(set, "<get-anchorTrtcEnterStateMap>(...)");
            pm0.v.I(set, qf2.e0.f443873d);
            ((mm2.o4) this.f443974g.m56788xbba4bfc0(mm2.o4.class)).f410859u.clear();
            ((mm2.o4) this.f443974g.m56788xbba4bfc0(mm2.o4.class)).X6();
            ((mm2.y2) this.f443974g.m56788xbba4bfc0(mm2.y2.class)).c7();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na) this.f443974g.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na.class);
            if (naVar != null) {
                naVar.B1();
            }
            if (this.f443975h) {
                db5.t7.m123883x26a183b(this.f443974g.O6(), this.f443974g.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573147do0), 0).show();
            }
            this.f443974g.f7();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f443974g.f372632e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 v1Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1) ubVar : null;
            if (v1Var != null) {
                dk2.ef efVar = dk2.ef.f314905a;
                tn0.w0 w0Var = dk2.ef.f314911d;
                if (w0Var != null) {
                    w0Var.M0(false);
                }
                sm2.o4 m129724xca56ce03 = v1Var.m129724xca56ce03();
                if (m129724xca56ce03 != null) {
                    in0.q qVar = m129724xca56ce03.f101130e;
                    cl0.g gVar = qVar != null ? qVar.T1 : null;
                    org.json.JSONObject J2 = qVar != null ? qVar.J() : null;
                    in0.q qVar2 = m129724xca56ce03.f101130e;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57628x9aa6f4f1(v1Var, gVar, J2, qVar2 != null ? qVar2.W0() : null, true, null, 16, null);
                }
            }
        } else {
            km2.q qVar3 = this.f443976i;
            if (qVar3 != null) {
                if (qVar3 != null) {
                    qVar3.f390714l = 0;
                }
                mk2.h.f408666a.d(qVar3.f390705c);
                java.util.Map map = ((mm2.o4) this.f443974g.m56788xbba4bfc0(mm2.o4.class)).f410859u;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "<get-anchorPkCarryMicUserMap>(...)");
                java.lang.String str = qVar3.f390703a;
                synchronized (map) {
                    map.remove(str);
                }
                java.util.List list5 = ((mm2.o4) this.f443974g.m56788xbba4bfc0(mm2.o4.class)).f410851o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list5, "<get-linkMicUserList>(...)");
                pm0.v.I(list5, new qf2.f0(this.f443978n));
                java.util.List list6 = ((mm2.o4) this.f443974g.m56788xbba4bfc0(mm2.o4.class)).f410852p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list6, "<get-recomApplylinkMicUserList>(...)");
                pm0.v.I(list6, new qf2.g0(qVar3));
                java.util.List list7 = ((mm2.o4) this.f443974g.m56788xbba4bfc0(mm2.o4.class)).f410857s;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list7, "<get-anchorPkMicUserList>(...)");
                pm0.v.I(list7, new qf2.h0(this.f443978n));
                java.util.List list8 = ((mm2.o4) this.f443974g.m56788xbba4bfc0(mm2.o4.class)).f410858t;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list8, "<get-anchorPkMicUserTempList>(...)");
                pm0.v.G(list8, new qf2.i0(this.f443978n));
                if (this.f443975h) {
                    db5.t7.h(this.f443974g.O6(), this.f443974g.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dma));
                }
            }
        }
        yz5.l lVar = this.f443977m;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f384359a;
    }
}
