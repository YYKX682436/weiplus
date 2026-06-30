package at0;

/* loaded from: classes10.dex */
public final class p extends ms0.e {

    /* renamed from: t, reason: collision with root package name */
    public final boolean f95153t;

    /* renamed from: u, reason: collision with root package name */
    public os0.c f95154u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f95155v;

    /* renamed from: w, reason: collision with root package name */
    public int f95156w;

    /* renamed from: x, reason: collision with root package name */
    public int f95157x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f95158y;

    public p(boolean z17) {
        super(1, 0, 2, null);
        this.f95153t = z17;
        this.f95155v = ts0.d.f503083a.a();
        this.f95156w = -1;
        this.f95157x = -1;
    }

    @Override // ms0.c
    public os0.a f() {
        return this.f95153t ? new os0.f(this.f412478a, this.f412479b, this.f412480c, this.f412481d, this.f412482e, this.f412483f) : new os0.c(this.f412478a, this.f412479b, this.f412480c, this.f412481d, this.f412482e, this.f412483f);
    }

    @Override // ms0.c
    public is0.c g() {
        if (!this.f95155v) {
            return this.f412487j;
        }
        os0.c cVar = this.f95154u;
        if (cVar != null) {
            return cVar.f429533i;
        }
        return null;
    }

    @Override // ms0.c
    public is0.c j() {
        if (!this.f95155v) {
            return this.f412487j;
        }
        os0.c cVar = this.f95154u;
        if (cVar != null) {
            return cVar.f429533i;
        }
        return null;
    }

    @Override // ms0.c
    public void k(boolean z17) {
        is0.c cVar;
        super.k(z17);
        if (this.f95155v) {
            int i17 = this.f412478a;
            int i18 = this.f412479b;
            this.f95154u = new os0.c(i17, i18, i17, i18, 2, 2);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepareOutputTexture:");
            os0.c cVar2 = this.f95154u;
            sb6.append((cVar2 == null || (cVar = cVar2.f429533i) == null) ? null : java.lang.Integer.valueOf(cVar.f375928e));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.AbsSurfaceRenderer", sb6.toString());
        }
    }

    @Override // ms0.c
    public void n(boolean z17) {
        super.n(z17);
        os0.c cVar = this.f95154u;
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // ms0.c
    public void p() {
        is0.c cVar;
        os0.c cVar2;
        int i17;
        super.p();
        if (!this.f95155v || (cVar = this.f412487j) == null) {
            return;
        }
        int i18 = cVar.f375928e;
        os0.c cVar3 = this.f95154u;
        if (cVar3 != null) {
            cVar3.w(this.f412478a, this.f412479b);
        }
        int i19 = this.f95156w;
        if (i19 <= 0 || (i17 = this.f95157x) <= 0) {
            os0.c cVar4 = this.f95154u;
            if (cVar4 != null) {
                cVar4.u(this.f412478a, this.f412479b);
            }
        } else {
            os0.c cVar5 = this.f95154u;
            if (cVar5 != null) {
                cVar5.u(i19, i17);
            }
        }
        int i27 = this.f412491n;
        if (i27 >= 0 && (cVar2 = this.f95154u) != null) {
            cVar2.f429538n = i27;
        }
        os0.c cVar6 = this.f95154u;
        if (cVar6 != null) {
            cVar6.f429540p = this.f412492o && this.f95158y;
        }
        if (cVar6 != null) {
            cVar6.f429539o = true;
        }
        if (cVar6 != null) {
            cVar6.H = i18;
        }
        if (cVar6 != null) {
            cVar6.o();
        }
    }
}
