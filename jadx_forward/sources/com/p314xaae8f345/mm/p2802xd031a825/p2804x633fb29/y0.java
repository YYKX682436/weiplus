package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public abstract class y0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String f295558q = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f295562g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f295563h;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f295566n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f295567o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.ref.WeakReference f295568p;

    /* renamed from: d, reason: collision with root package name */
    public int f295559d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f295560e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f295561f = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f295564i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f295565m = false;

    public abstract void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr);

    public abstract void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var);

    public com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0 J(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 x0Var) {
        if (this.f295565m) {
            x0Var.a(this.f295559d, this.f295560e, this.f295562g, this);
        }
        return this;
    }

    public void K(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f295568p = new java.lang.ref.WeakReference(abstractActivityC21394xb3d2c0cf);
    }

    public boolean L() {
        return true;
    }

    public boolean M() {
        return true;
    }

    public boolean N() {
        return this instanceof xw1.e;
    }

    public com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0 O(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 x0Var) {
        if (!this.f295564i && !this.f295565m) {
            x0Var.a(this.f295559d, this.f295560e, this.f295562g, this);
        }
        return this;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f295567o = u0Var;
        iz5.a.d("rr can't be null!", this.f295566n);
        com.p314xaae8f345.mm.p2802xd031a825.ui.b0.g(this.f295566n.f152246d);
        if (this.f295566n.mo47976x1de73f19() == 0) {
            this.f295566n.mo47987xb512c125(2);
        }
        return mo9409x10f9447a(sVar, this.f295566n, this);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        if (i18 == 0 && i19 == 0) {
            this.f295564i = false;
        }
        if (!this.f295564i) {
            I(v0Var);
            if (this.f295561f != 0) {
                this.f295565m = true;
            }
        }
        this.f295559d = i19;
        this.f295560e = i18;
        this.f295562g = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewPayBase", "errType: %s, errCode: %s, errMsg: %s, retCode: %s, retMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(this.f295561f), this.f295563h);
        H(i17, i18, i19, str, v0Var, bArr);
        v0Var.mo13822xfb85f7b0();
        java.lang.ref.WeakReference weakReference = this.f295568p;
        if (weakReference == null || (abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) weakReference.get()) == null) {
            return;
        }
        if (this.f295564i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneNewPayBase", "show net error alert");
            db5.e1.G(abstractActivityC21394xb3d2c0cf, f295558q, null, false, new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.v0(this, abstractActivityC21394xb3d2c0cf));
            return;
        }
        if (!this.f295565m || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f295563h)) {
            return;
        }
        if (N()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneNewPayBase", "show resp error toast");
            dp.a.m125854x26a183b(abstractActivityC21394xb3d2c0cf, this.f295563h, 1).show();
        } else if (M()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneNewPayBase", "show resp error alert");
            db5.e1.E(abstractActivityC21394xb3d2c0cf, this.f295563h, null, abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.krn), false, new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.w0(this, abstractActivityC21394xb3d2c0cf));
        }
    }
}
