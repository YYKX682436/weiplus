package re;

/* loaded from: classes7.dex */
public final class b implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w, fg.h {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f475793d;

    /* renamed from: f, reason: collision with root package name */
    public int f475795f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 f475796g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f475797h;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1 f475794e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1();

    /* renamed from: i, reason: collision with root package name */
    public boolean f475798i = true;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f475793d = v5Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    public void a(boolean z17) {
        this.f475797h = z17;
        if (!this.f475798i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageViewKeyboardHeightEmitter", "onKeyboardStateChanged been called, but interrupted");
            return;
        }
        int i17 = z17 ? this.f475795f : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f475793d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 v37 = v5Var.v3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v37, "getService(...)");
        this.f475794e.x(i17, v37, v5Var, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f475793d;
        if (v5Var.mo51310xc2a54588() == null) {
            return;
        }
        android.view.View mo51310xc2a54588 = v5Var.mo51310xc2a54588();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo51310xc2a54588);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.e(mo51310xc2a54588);
        this.f475796g = e17;
        if (e17 != null) {
            e17.a(this);
        }
        fg.p0 p0Var = fg.p0.f343334a;
        fg.p0.f343335b.add(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v
    public void c() {
        if (this.f475797h) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f475793d;
            if (v5Var.v3() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 v37 = v5Var.v3();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v37, "getService(...)");
                this.f475794e.x(0, v37, v5Var, null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 l2Var = this.f475796g;
        if (l2Var != null) {
            l2Var.g(this);
        }
        this.f475796g = null;
        fg.p0 p0Var = fg.p0.f343334a;
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(fg.p0.f343335b).remove(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    public void d(int i17) {
        this.f475795f = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    /* renamed from: getHeight */
    public int mo53489x1c4fb41d() {
        return this.f475795f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w
    /* renamed from: onDestroy */
    public void mo32094xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 l2Var = this.f475796g;
        if (l2Var != null) {
            l2Var.g(this);
        }
        fg.p0 p0Var = fg.p0.f343334a;
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(fg.p0.f343335b).remove(this);
    }
}
