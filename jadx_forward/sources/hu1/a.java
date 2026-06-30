package hu1;

/* loaded from: classes15.dex */
public class a implements hu1.g {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f366601a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p0 f366602b;

    /* renamed from: c, reason: collision with root package name */
    public tt1.j f366603c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f366604d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f366605e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f366606f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f366607g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f366608h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f366609i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f366610j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f366611k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f366612l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f366613m = false;

    public a(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f366601a = abstractActivityC21394xb3d2c0cf;
    }

    @Override // hu1.g
    public boolean a() {
        return ((android.text.TextUtils.isEmpty(this.f366603c.i0().f466722o) ^ true) && w() && v()) || this.f366604d;
    }

    @Override // hu1.g
    public boolean b() {
        return false;
    }

    @Override // hu1.g
    public boolean c() {
        return this.f366603c.s0().I != null;
    }

    @Override // hu1.g
    public boolean d() {
        return false;
    }

    @Override // hu1.g
    public boolean e() {
        return (this.f366603c.i0().f466731x == null || android.text.TextUtils.isEmpty(this.f366603c.i0().f466731x.f470411d)) ? false : true;
    }

    @Override // hu1.g
    public boolean f() {
        return false;
    }

    @Override // hu1.g
    public boolean g() {
        return !android.text.TextUtils.isEmpty(this.f366603c.s0().F);
    }

    @Override // hu1.g
    public boolean h() {
        if (this.f366603c.i0().f466724q == null || this.f366603c.i0().f466724q.size() < 1) {
            return false;
        }
        return (w() && v()) || this.f366604d;
    }

    @Override // hu1.g
    public boolean i() {
        int i17;
        return (this.f366602b.f176636a == 6 && (!this.f366603c.F() || this.f366603c.y())) || (i17 = this.f366602b.f176636a) == 5 || (i17 == 23 && this.f366603c.z());
    }

    @Override // hu1.g
    public boolean j() {
        return false;
    }

    @Override // hu1.g
    public boolean k() {
        return !this.f366603c.F();
    }

    @Override // hu1.g
    public boolean l() {
        return this instanceof hu1.b;
    }

    @Override // hu1.g
    public boolean m() {
        return this.f366605e;
    }

    @Override // hu1.g
    public boolean n() {
        return false;
    }

    @Override // hu1.g
    public boolean o() {
        return !this.f366603c.d();
    }

    @Override // hu1.g
    public boolean p() {
        return true;
    }

    @Override // hu1.g
    public boolean q() {
        return (this.f366603c.s0().M == null || this.f366603c.s0().M.f453876g == null || this.f366603c.s0().M.f453876g.size() <= 0 || android.text.TextUtils.isEmpty((java.lang.CharSequence) this.f366603c.s0().M.f453876g.get(0))) ? false : true;
    }

    @Override // hu1.g
    public boolean r() {
        return false;
    }

    public java.lang.String s() {
        return !android.text.TextUtils.isEmpty(this.f366603c.s0().T) ? this.f366603c.s0().T : this.f366603c.i0().f466725r == 0 ? this.f366601a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aug) : this.f366603c.i0().f466726s == 0 ? !android.text.TextUtils.isEmpty(this.f366603c.s0().f470104z) ? this.f366603c.s0().f470104z : this.f366601a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ara) : "";
    }

    public boolean t() {
        return !this.f366603c.d0() && (lu1.a0.u(this.f366602b.f176636a) || lu1.a0.w(this.f366602b.f176636a) || this.f366602b.f176636a == 23);
    }

    public boolean u() {
        return !this.f366603c.y() && this.f366602b.f176636a == 6;
    }

    public boolean v() {
        int i17;
        int i18 = this.f366602b.f176636a;
        return i18 == 3 || (i18 == 6 && this.f366603c.i0().f466721n == 0) || (i17 = this.f366602b.f176636a) == 4 || i17 == 5 || i17 == 15;
    }

    public boolean w() {
        return this.f366603c.i0().f466714d == 0 || this.f366603c.i0().f466714d == 1 || this.f366603c.i0().f466714d == 2;
    }

    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardBaseShowLogic", "updateAcceptState()");
        if (!lu1.a0.u(this.f366602b.f176636a) && !lu1.a0.w(this.f366602b.f176636a)) {
            int i17 = this.f366602b.f176636a;
            if (i17 == 6) {
                if (this.f366603c.y()) {
                    this.f366605e = true;
                    this.f366606f = true;
                    this.f366609i = false;
                } else if (this.f366603c.F()) {
                    this.f366612l = true;
                    this.f366609i = true;
                    this.f366607g = true;
                    this.f366608h = true;
                } else {
                    this.f366605e = false;
                    this.f366606f = false;
                    this.f366609i = false;
                    this.f366607g = true;
                }
            } else if (lu1.a0.v(i17)) {
                this.f366605e = false;
                this.f366606f = false;
                this.f366607g = true;
                if (this.f366603c.F()) {
                    this.f366612l = true;
                    this.f366609i = true;
                    this.f366608h = true;
                } else {
                    this.f366613m = true;
                }
            } else if (this.f366602b.f176636a == 23) {
                if (this.f366603c.d0()) {
                    this.f366605e = true;
                    this.f366606f = true;
                    this.f366609i = false;
                    this.f366610j = true;
                } else {
                    this.f366605e = true;
                    this.f366606f = false;
                    this.f366609i = false;
                    this.f366610j = true;
                }
                if (!android.text.TextUtils.isEmpty(this.f366602b.f176639d) && !this.f366602b.f176639d.equals(c01.z1.r()) && !this.f366603c.z()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardBaseShowLogic", " detail page");
                    this.f366605e = false;
                    this.f366606f = false;
                    this.f366607g = true;
                    if (this.f366603c.F()) {
                        this.f366612l = true;
                        this.f366609i = true;
                        this.f366608h = true;
                    }
                }
            }
        } else if (this.f366603c.d0()) {
            this.f366605e = true;
            this.f366606f = true;
            this.f366611k = true;
            this.f366609i = true;
            this.f366610j = true;
        } else if (this.f366603c.d0()) {
            this.f366605e = false;
            this.f366606f = false;
            this.f366609i = false;
        } else {
            this.f366605e = true;
            this.f366606f = false;
            if (this.f366603c.e()) {
                this.f366612l = true;
                this.f366609i = true;
                this.f366608h = true;
            } else {
                this.f366609i = false;
            }
            this.f366610j = true;
        }
        if (this.f366603c.e()) {
            this.f366605e = false;
            this.f366606f = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardBaseShowLogic", "need direct jump!");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardBaseShowLogic", "not need direct jump!");
        }
        if (this.f366604d) {
            this.f366605e = false;
            this.f366606f = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardBaseShowLogic", "updateAcceptView to gone!");
        } else if (this.f366605e) {
            this.f366604d = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardBaseShowLogic", "set mIsAcceptedCard is false!");
        } else {
            this.f366604d = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardBaseShowLogic", "set mIsAcceptedCard is true");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardBaseShowLogic", "mIsAcceptedCard:" + this.f366604d);
    }
}
