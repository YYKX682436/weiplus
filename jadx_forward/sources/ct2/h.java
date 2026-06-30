package ct2;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public boolean f303791d;

    /* renamed from: e, reason: collision with root package name */
    public int f303792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ct2.j f303793f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f303794g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f303795h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ct2.f f303796i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ct2.j jVar, int i17, long j17, ct2.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f303793f = jVar;
        this.f303794g = i17;
        this.f303795h = j17;
        this.f303796i = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ct2.h(this.f303793f, this.f303794g, this.f303795h, this.f303796i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ct2.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.l71 l71Var;
        java.lang.Object obj2;
        boolean Ui;
        boolean z17;
        r45.nw1 nw1Var;
        r45.l71 l71Var2;
        r45.l71 l71Var3;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f303792e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        ct2.f fVar = this.f303796i;
        ct2.j jVar = this.f303793f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            long O6 = jVar.O6();
            qs5.d dVar = qs5.d.f447959e;
            this.f303792e = 1;
            com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var;
            v4Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "requestLiveInfo liveId " + pm0.v.u(O6) + ",scene:4");
            if (O6 == 0) {
                obj2 = null;
            } else {
                jz5.o oVar = (jz5.o) v4Var.f148519g.get(new java.lang.Long(O6));
                if (((oVar == null || (l71Var = (r45.l71) oVar.f384376f) == null) ? null : (r45.nw1) l71Var.m75936x14adae67(1)) != null) {
                    r45.zm1 zm1Var = new r45.zm1();
                    zm1Var.set(0, java.lang.Long.valueOf(((java.lang.Number) oVar.f384375e).longValue()));
                    zm1Var.set(1, (r45.l71) oVar.f384376f);
                    obj2 = zm1Var;
                } else {
                    p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
                    rVar.k();
                    i95.m c17 = i95.n0.c(s40.w0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    s40.w0.u9((s40.w0) c17, O6, true, null, new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.o4(O6, v4Var, 4, rVar), 4, null, null, null, 224, null);
                    obj2 = rVar.j();
                }
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    ((ws2.n2) fVar).a(false);
                    return f0Var;
                }
                z17 = this.f303791d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                Ui = z17;
                ((ws2.n2) fVar).a(Ui);
                return f0Var;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            obj2 = obj;
        }
        r45.zm1 zm1Var2 = (r45.zm1) obj2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long m75942xfb822ef2 = currentTimeMillis - (zm1Var2 != null ? zm1Var2.m75942xfb822ef2(0) : currentTimeMillis);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ReplayTransition1.1:checkReplayStatus liveId:");
        sb6.append(jVar.O6());
        sb6.append(",defaultRefreshDuration:");
        int i18 = this.f303794g;
        sb6.append(i18);
        sb6.append(", curTime:");
        sb6.append(currentTimeMillis);
        sb6.append(", updateTime:");
        sb6.append(zm1Var2 != null ? new java.lang.Long(zm1Var2.m75942xfb822ef2(0)) : null);
        sb6.append(", passTime:");
        sb6.append(m75942xfb822ef2);
        sb6.append(", resp interval:");
        sb6.append((zm1Var2 == null || (l71Var3 = (r45.l71) zm1Var2.m75936x14adae67(1)) == null) ? null : new java.lang.Integer(l71Var3.m75939xb282bd08(3)));
        sb6.append(",new Result is null:");
        sb6.append(((zm1Var2 == null || (l71Var2 = (r45.l71) zm1Var2.m75936x14adae67(1)) == null) ? null : (r45.nw1) l71Var2.m75936x14adae67(1)) == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", sb6.toString());
        if (jVar.O6() == 0) {
            return f0Var;
        }
        if (zm1Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "checkReplayStatus result is null!");
            this.f303792e = 3;
            if (p3325xe03a0797.p3326xc267989b.k1.b(i18, this) == aVar) {
                return aVar;
            }
            ((ws2.n2) fVar).a(false);
            return f0Var;
        }
        ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
        r45.l71 l71Var4 = (r45.l71) zm1Var2.m75936x14adae67(1);
        Ui = ((vd2.d5) i0Var).Ui(l71Var4 != null ? (r45.nw1) l71Var4.m75936x14adae67(1) : null);
        if (Ui) {
            r45.l71 l71Var5 = (r45.l71) zm1Var2.m75936x14adae67(1);
            if (l71Var5 != null && (nw1Var = (r45.nw1) l71Var5.m75936x14adae67(1)) != null) {
                ((mm2.e1) jVar.m147920xbba4bfc0(mm2.e1.class)).m7(nw1Var);
            }
            ((ws2.n2) fVar).a(Ui);
            return f0Var;
        }
        long m75939xb282bd08 = ((((r45.l71) zm1Var2.m75936x14adae67(1)) != null ? r2.m75939xb282bd08(3) : 0L) * 1000) - m75942xfb822ef2;
        long j17 = this.f303795h;
        if (m75939xb282bd08 > 0) {
            if (m75939xb282bd08 < j17) {
                m75939xb282bd08 = j17;
            }
            j17 = m75939xb282bd08;
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Bk(jVar.O6());
        }
        if (zl2.q4.f555466a.E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "checkReplayStatus delay:" + j17);
        }
        this.f303791d = Ui;
        this.f303792e = 2;
        if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
            return aVar;
        }
        z17 = Ui;
        Ui = z17;
        ((ws2.n2) fVar).a(Ui);
        return f0Var;
    }
}
