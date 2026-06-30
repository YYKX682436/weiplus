package n91;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f417405b;

    /* renamed from: c, reason: collision with root package name */
    public n91.j f417406c = n91.j.NOT_STARTED;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f417407d = new java.util.LinkedList();

    /* renamed from: a, reason: collision with root package name */
    public final n91.f f417404a = new n91.c0();

    /* renamed from: e, reason: collision with root package name */
    public final n91.c f417408e = new n91.c(this);

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f417405b = o6Var;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1046xf4b1126e.C11834xf8fb5977 c11834xf8fb5977 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1046xf4b1126e.C11834xf8fb5977();
        c11834xf8fb5977.f159080d = this.f417405b.f156336n;
        c11834xf8fb5977.f159081e = this.f417405b.f156338p.f158814g;
        c11834xf8fb5977.f159082f = this.f417405b.u0().f158831k2.f169671h;
        c11834xf8fb5977.f159083g = this.f417405b.u0().f158831k2.f169667d;
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, c11834xf8fb5977, n91.i.class, new n91.C29192x2f5e1a());
    }

    public void b() {
        n91.j jVar = this.f417406c;
        n91.j jVar2 = n91.j.DESTROYED;
        if (jVar != jVar2) {
            n91.c0 c0Var = (n91.c0) this.f417405b.K2.f417404a;
            c0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] onDestroy");
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = c0Var.f417394e;
            if (c1073x7e08a787 != null) {
                c1073x7e08a787.removeAllViews();
            }
            ((ne0.n) ((oe0.r) i95.n0.c(oe0.r.class))).Di(c0Var.f417392c);
            android.view.ViewGroup viewGroup = c0Var.f417393d;
            android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
            if (parent instanceof android.view.ViewGroup) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] removeView");
                android.view.ViewGroup viewGroup2 = c0Var.f417393d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
                ((android.view.ViewGroup) parent).removeView(c0Var.f417393d);
            }
            c0Var.f417390a.mo48814x2efc64();
            this.f417406c = jVar2;
        }
    }

    public void c() {
        if (this.f417406c.ordinal() >= 2) {
            return;
        }
        this.f417406c = n91.j.ENTERING_FULL_SCREEN;
        n91.f fVar = this.f417404a;
        n91.c0 c0Var = (n91.c0) fVar;
        c0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] onStartFullScreen");
        ((ne0.n) ((oe0.r) i95.n0.c(oe0.r.class))).Ai("fullScreenStart", c0Var.f417392c, "");
        n91.c0 c0Var2 = (n91.c0) fVar;
        c0Var2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] onRotationStart");
        ((ne0.n) ((oe0.r) i95.n0.c(oe0.r.class))).Ai("rotationStart", c0Var2.f417392c, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1046xf4b1126e.C11835x238317fe c11835x238317fe = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1046xf4b1126e.C11835x238317fe();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f417405b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = o6Var.u0();
        c11835x238317fe.f159084d = u07;
        u07.f128806p0 = true;
        c11835x238317fe.f159085e = o6Var.l2();
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, c11835x238317fe, n91.k.class, new n91.C29192x2f5e1a());
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1046xf4b1126e.C11836x6cc003a1 c11836x6cc003a1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1046xf4b1126e.C11836x6cc003a1();
        c11836x6cc003a1.f159087e = this.f417405b.f156336n;
        c11836x6cc003a1.f159088f = this.f417405b.f156338p.f158814g;
        c11836x6cc003a1.f159086d = this.f417406c.ordinal() >= 2;
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, c11836x6cc003a1, n91.l.class, new n91.C29192x2f5e1a());
    }
}
