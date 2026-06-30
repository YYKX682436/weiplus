package bs2;

/* loaded from: classes2.dex */
public final class v0 implements db2.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f23958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bs2.h0 f23959b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23960c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f23961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db2.n3 f23962e;

    public v0(boolean z17, bs2.h0 h0Var, int i17, bs2.n1 n1Var, db2.n3 n3Var) {
        this.f23958a = z17;
        this.f23959b = h0Var;
        this.f23960c = i17;
        this.f23961d = n1Var;
        this.f23962e = n3Var;
    }

    @Override // db2.d3
    public boolean isBeginHistory() {
        return false;
    }

    @Override // db2.d3
    public boolean isResultConsume(int i17, int i18, r45.ny3 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        return false;
    }

    @Override // db2.d3
    public void onBuildRequest(db2.b3 request) {
        kotlin.jvm.internal.o.g(request, "request");
        if (this.f23958a) {
            request.set(10, 0);
        } else {
            request.set(10, 1);
        }
        bs2.h0 h0Var = bs2.h0.f23851n;
        bs2.h0 h0Var2 = this.f23959b;
        if (h0Var2 != h0Var) {
            bs2.g.a(bs2.g.f23841a, this.f23960c, 0, 1, 0, request.getLong(12) != 0, 0, false, 106, null);
        }
        boolean z17 = h0Var2 == bs2.h0.f23849i || h0Var2 == bs2.h0.f23852o || h0Var2 == bs2.h0.f23847g;
        r45.nx2 nx2Var = new r45.nx2();
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        if (z17) {
            nx2Var.set(3, java.lang.Boolean.valueOf(nk6.L0("TLRecommendTab") != null));
            nx2Var.set(2, java.lang.Boolean.valueOf(nk6.L0("TLFollow") != null));
            nx2Var.set(1, java.lang.Boolean.valueOf(nk6.L0("finder_tl_hot_tab") != null));
            nx2Var.set(6, java.lang.Integer.valueOf(this.f23962e.f228079d));
        } else {
            nx2Var.set(0, java.lang.Boolean.valueOf(nk6.L0("FinderEntrance") != null));
            nx2Var.set(6, 0);
        }
        request.set(30, nx2Var);
        java.lang.String str = this.f23961d.f23909c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preload: onBuildRequest scene_status = ");
        r45.nx2 nx2Var2 = (r45.nx2) request.getCustom(30);
        sb6.append(nx2Var2 != null ? pm0.b0.b(nx2Var2) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }

    @Override // db2.d3
    public void onLoadFinish() {
    }
}
