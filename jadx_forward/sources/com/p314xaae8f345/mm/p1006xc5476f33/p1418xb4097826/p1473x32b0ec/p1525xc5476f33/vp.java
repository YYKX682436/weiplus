package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class vp extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq f196342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f196343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f196344f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar, int i17, boolean z17) {
        super(0);
        this.f196342d = dqVar;
        this.f196343e = i17;
        this.f196344f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int intValue;
        byte[] bArr;
        mm2.e1 e1Var;
        r45.nw1 nw1Var;
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "showGiftSendAgainLayout networkEnable:" + this.f196342d.V + " batchCount:" + this.f196343e + " showSendBtn: " + this.f196344f);
        if (this.f196342d.V) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar = this.f196342d;
            if (dqVar.N == null) {
                dqVar.N = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar2 = this.f196342d;
            dqVar2.f193865x0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mo0(dqVar2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar2 = this.f196342d.N;
            if (tVar2 != null && (view = tVar2.f197225n) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar3 = this.f196342d;
                android.view.View t17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq.t1(dqVar3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "register view in continuousClickManager:" + view + " is not targetView:" + t17);
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, t17) && (tVar = dqVar3.N) != null) {
                    tVar.d(view);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar4 = this.f196342d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar3 = dqVar4.N;
            if (tVar3 != null) {
                android.view.View t18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq.t1(dqVar4);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m mVar = this.f196342d.L;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f196343e);
                boolean z17 = this.f196343e > 1;
                tVar3.f197225n = t18;
                tVar3.f197222k = z17;
                if (t18 != null) {
                    t18.setOnTouchListener(tVar3.f197227p);
                }
                tVar3.f197223l = mVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContinuousClickManager", "initialValue:" + valueOf);
                if (valueOf != null && (intValue = valueOf.intValue()) > 0) {
                    tVar3.f197218g = intValue;
                    tVar3.f197219h = 0;
                    tVar3.f197216e = intValue > 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n.f197166f : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n.f197165e;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
                    tVar3.f197217f = new dk2.g((k0Var == null || (e1Var = (mm2.e1) k0Var.m57635xbba4bfc0(mm2.e1.class)) == null || (nw1Var = e1Var.f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0));
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    dk2.g gVar = tVar3.f197217f;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    java.lang.String r17 = c01.z1.r();
                    if (r17 != null) {
                        bArr = r17.getBytes(r26.c.f450398a);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBytes(...)");
                    } else {
                        bArr = null;
                    }
                    sb6.append(kk.k.g(bArr));
                    sb6.append('_');
                    sb6.append(java.util.UUID.randomUUID());
                    java.lang.String sb7 = sb6.toString();
                    gVar.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb7, "<set-?>");
                    gVar.f315000b = sb7;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.r2 r2Var = tVar3.f197226o;
                    synchronized (r2Var.f197201a) {
                        r2Var.f197201a.clear();
                    }
                    tVar3.f197226o.c(tVar3.f197217f, intValue);
                    tVar3.f197220i = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = tVar3.f197229r;
                    long j17 = tVar3.f197213b;
                    b4Var.c(j17, j17);
                    tVar3.f197224m = mVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep) mVar).d(tVar3.f197225n, valueOf.intValue(), tVar3.f197216e, tVar3.f197217f, valueOf.intValue(), z17) : true;
                }
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("isCurrentSingleClickEnable:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar4 = this.f196342d.N;
            sb8.append(tVar4 != null ? java.lang.Boolean.valueOf(tVar4.f197224m) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", sb8.toString());
            if (this.f196344f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar5 = this.f196342d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar5 = dqVar5.N;
                if (tVar5 != null && tVar5.f197224m) {
                    dqVar5.K0(0);
                    this.f196342d.M.d();
                    ((je2.t) this.f196342d.P0(je2.t.class)).f380802o.mo7808x76db6cb1(new jz5.l(java.lang.Boolean.TRUE, this.f196342d.f193856p1));
                }
            }
            this.f196342d.K0(8);
            ((je2.t) this.f196342d.P0(je2.t.class)).f380802o.mo7808x76db6cb1(new jz5.l(java.lang.Boolean.TRUE, this.f196342d.f193856p1));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "showGiftSendAgainLayout networkEnable:" + this.f196342d.V);
        }
        return jz5.f0.f384359a;
    }
}
