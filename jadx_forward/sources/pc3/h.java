package pc3;

/* loaded from: classes7.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pc3.m f434911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434912e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(pc3.m mVar, java.lang.String str) {
        super(0);
        this.f434911d = mVar;
        this.f434912e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.n4 n4Var = this.f434911d.f434918d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("connect biz server for ");
        sb6.append(this.f434912e);
        sb6.append(", has service?");
        sb6.append(n4Var != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushClientMgr", sb6.toString());
        if (n4Var == null) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            final pc3.m mVar = this.f434911d;
            ((ku5.t0) u0Var).a(new java.lang.Runnable() { // from class: pc3.g
                @Override // java.lang.Runnable
                public final void run() {
                    pc3.m mVar2 = pc3.m.this;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("bindServiceIfNeeded: ");
                    sb7.append(mVar2.f434918d == null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushClientMgr", sb7.toString());
                    ((ku5.t0) ku5.t0.f394148d).q(new pc3.d(mVar2));
                    ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("appbrand");
                    mVar2.b();
                }
            });
        } else {
            rc3.w0 w0Var = (rc3.w0) this.f434911d.f434916b.get(this.f434912e);
            if (w0Var != null) {
                w0Var.T(new rc3.f0(w0Var, n4Var));
            }
        }
        return jz5.f0.f384359a;
    }
}
