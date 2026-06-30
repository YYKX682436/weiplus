package at0;

/* loaded from: classes10.dex */
public final class p extends ms0.e {

    /* renamed from: t, reason: collision with root package name */
    public final boolean f13620t;

    /* renamed from: u, reason: collision with root package name */
    public os0.c f13621u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f13622v;

    /* renamed from: w, reason: collision with root package name */
    public int f13623w;

    /* renamed from: x, reason: collision with root package name */
    public int f13624x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f13625y;

    public p(boolean z17) {
        super(1, 0, 2, null);
        this.f13620t = z17;
        this.f13622v = ts0.d.f421550a.a();
        this.f13623w = -1;
        this.f13624x = -1;
    }

    @Override // ms0.c
    public os0.a f() {
        return this.f13620t ? new os0.f(this.f330945a, this.f330946b, this.f330947c, this.f330948d, this.f330949e, this.f330950f) : new os0.c(this.f330945a, this.f330946b, this.f330947c, this.f330948d, this.f330949e, this.f330950f);
    }

    @Override // ms0.c
    public is0.c g() {
        if (!this.f13622v) {
            return this.f330954j;
        }
        os0.c cVar = this.f13621u;
        if (cVar != null) {
            return cVar.f348000i;
        }
        return null;
    }

    @Override // ms0.c
    public is0.c j() {
        if (!this.f13622v) {
            return this.f330954j;
        }
        os0.c cVar = this.f13621u;
        if (cVar != null) {
            return cVar.f348000i;
        }
        return null;
    }

    @Override // ms0.c
    public void k(boolean z17) {
        is0.c cVar;
        super.k(z17);
        if (this.f13622v) {
            int i17 = this.f330945a;
            int i18 = this.f330946b;
            this.f13621u = new os0.c(i17, i18, i17, i18, 2, 2);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepareOutputTexture:");
            os0.c cVar2 = this.f13621u;
            sb6.append((cVar2 == null || (cVar = cVar2.f348000i) == null) ? null : java.lang.Integer.valueOf(cVar.f294395e));
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.AbsSurfaceRenderer", sb6.toString());
        }
    }

    @Override // ms0.c
    public void n(boolean z17) {
        super.n(z17);
        os0.c cVar = this.f13621u;
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
        if (!this.f13622v || (cVar = this.f330954j) == null) {
            return;
        }
        int i18 = cVar.f294395e;
        os0.c cVar3 = this.f13621u;
        if (cVar3 != null) {
            cVar3.w(this.f330945a, this.f330946b);
        }
        int i19 = this.f13623w;
        if (i19 <= 0 || (i17 = this.f13624x) <= 0) {
            os0.c cVar4 = this.f13621u;
            if (cVar4 != null) {
                cVar4.u(this.f330945a, this.f330946b);
            }
        } else {
            os0.c cVar5 = this.f13621u;
            if (cVar5 != null) {
                cVar5.u(i19, i17);
            }
        }
        int i27 = this.f330958n;
        if (i27 >= 0 && (cVar2 = this.f13621u) != null) {
            cVar2.f348005n = i27;
        }
        os0.c cVar6 = this.f13621u;
        if (cVar6 != null) {
            cVar6.f348007p = this.f330959o && this.f13625y;
        }
        if (cVar6 != null) {
            cVar6.f348006o = true;
        }
        if (cVar6 != null) {
            cVar6.H = i18;
        }
        if (cVar6 != null) {
            cVar6.o();
        }
    }
}
