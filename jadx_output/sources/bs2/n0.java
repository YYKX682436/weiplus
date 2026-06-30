package bs2;

/* loaded from: classes2.dex */
public final class n0 implements db2.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f23903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f23904b;

    public n0(boolean z17, bs2.n1 n1Var) {
        this.f23903a = z17;
        this.f23904b = n1Var;
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
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("FinderEntrance");
        if (L0 != null) {
            r45.xs2 xs2Var = L0.N;
            long j17 = xs2Var.getLong(3);
            int integer = xs2Var.getInteger(9);
            if (integer == request.getInteger(11) && j17 != 0 && request.getLong(12) != 0) {
                pm0.z.b(xy2.b.f458155b, "finderEnterPreloadWrongRedDotRequest", j17 == request.getLong(12), null, null, false, false, new com.tencent.mm.plugin.finder.extension.reddot.b2(j17, request, integer, L0), 60, null);
            }
        }
        if (this.f23903a) {
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
        java.lang.String str = this.f23904b.f23909c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchEnterLoad: [onBuildRequest] scene_status = ");
        r45.nx2 nx2Var2 = (r45.nx2) request.getCustom(30);
        sb6.append(nx2Var2 != null ? pm0.b0.b(nx2Var2) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }

    @Override // db2.d3
    public void onLoadFinish() {
    }
}
