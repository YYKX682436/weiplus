package bs2;

/* loaded from: classes2.dex */
public final class v0 implements db2.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f105491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bs2.h0 f105492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f105493c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f105494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db2.n3 f105495e;

    public v0(boolean z17, bs2.h0 h0Var, int i17, bs2.n1 n1Var, db2.n3 n3Var) {
        this.f105491a = z17;
        this.f105492b = h0Var;
        this.f105493c = i17;
        this.f105494d = n1Var;
        this.f105495e = n3Var;
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
        if (this.f105491a) {
            request.set(10, 0);
        } else {
            request.set(10, 1);
        }
        bs2.h0 h0Var = bs2.h0.f105384n;
        bs2.h0 h0Var2 = this.f105492b;
        if (h0Var2 != h0Var) {
            bs2.g.a(bs2.g.f105374a, this.f105493c, 0, 1, 0, request.m75942xfb822ef2(12) != 0, 0, false, 106, null);
        }
        boolean z17 = h0Var2 == bs2.h0.f105382i || h0Var2 == bs2.h0.f105385o || h0Var2 == bs2.h0.f105380g;
        r45.nx2 nx2Var = new r45.nx2();
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        if (z17) {
            nx2Var.set(3, java.lang.Boolean.valueOf(nk6.L0("TLRecommendTab") != null));
            nx2Var.set(2, java.lang.Boolean.valueOf(nk6.L0("TLFollow") != null));
            nx2Var.set(1, java.lang.Boolean.valueOf(nk6.L0("finder_tl_hot_tab") != null));
            nx2Var.set(6, java.lang.Integer.valueOf(this.f105495e.f309612d));
        } else {
            nx2Var.set(0, java.lang.Boolean.valueOf(nk6.L0("FinderEntrance") != null));
            nx2Var.set(6, 0);
        }
        request.set(30, nx2Var);
        java.lang.String str = this.f105494d.f105442c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preload: onBuildRequest scene_status = ");
        r45.nx2 nx2Var2 = (r45.nx2) request.m75936x14adae67(30);
        sb6.append(nx2Var2 != null ? pm0.b0.b(nx2Var2) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
    }

    @Override // db2.d3
    /* renamed from: onLoadFinish */
    public void mo11124xa374d858() {
    }
}
