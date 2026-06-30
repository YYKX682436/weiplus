package bs2;

/* loaded from: classes2.dex */
public final class n0 implements db2.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f105436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f105437b;

    public n0(boolean z17, bs2.n1 n1Var) {
        this.f105436a = z17;
        this.f105437b = n1Var;
    }

    @Override // db2.d3
    /* renamed from: isBeginHistory */
    public boolean mo11121xd9b295f5() {
        return false;
    }

    @Override // db2.d3
    /* renamed from: isResultConsume */
    public boolean mo11122x83d23815(int i17, int i18, r45.ny3 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        return false;
    }

    @Override // db2.d3
    /* renamed from: onBuildRequest */
    public void mo11123x6b44d7c0(db2.b3 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("FinderEntrance");
        if (L0 != null) {
            r45.xs2 xs2Var = L0.N;
            long m75942xfb822ef2 = xs2Var.m75942xfb822ef2(3);
            int m75939xb282bd08 = xs2Var.m75939xb282bd08(9);
            if (m75939xb282bd08 == request.m75939xb282bd08(11) && m75942xfb822ef2 != 0 && request.m75942xfb822ef2(12) != 0) {
                pm0.z.b(xy2.b.f539688b, "finderEnterPreloadWrongRedDotRequest", m75942xfb822ef2 == request.m75942xfb822ef2(12), null, null, false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.b2(m75942xfb822ef2, request, m75939xb282bd08, L0), 60, null);
            }
        }
        if (this.f105436a) {
            request.set(10, 0);
        } else {
            request.set(10, 1);
        }
        r45.nx2 nx2Var = new r45.nx2();
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        nx2Var.set(3, java.lang.Boolean.valueOf(nk6.L0("TLRecommendTab") != null));
        nx2Var.set(2, java.lang.Boolean.valueOf(nk6.L0("TLFollow") != null));
        nx2Var.set(1, java.lang.Boolean.valueOf(nk6.L0("finder_tl_hot_tab") != null));
        nx2Var.set(0, java.lang.Boolean.valueOf(nk6.L0("FinderEntrance") != null));
        nx2Var.set(6, 0);
        request.set(30, nx2Var);
        java.lang.String str = this.f105437b.f105442c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchEnterLoad: [onBuildRequest] scene_status = ");
        r45.nx2 nx2Var2 = (r45.nx2) request.m75936x14adae67(30);
        sb6.append(nx2Var2 != null ? pm0.b0.b(nx2Var2) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
    }

    @Override // db2.d3
    /* renamed from: onLoadFinish */
    public void mo11124xa374d858() {
    }
}
