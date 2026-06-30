package oe3;

/* loaded from: classes7.dex */
public final class c extends hq0.i0 {
    public java.lang.ref.WeakReference A;
    public final java.util.HashSet B;
    public final java.util.HashSet C;
    public long D;
    public long E;

    /* renamed from: x, reason: collision with root package name */
    public bf3.p f426327x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.FrameLayout f426328y;

    /* renamed from: z, reason: collision with root package name */
    public se3.e f426329z;

    public c() {
        super(null, 1, null);
        jc3.y0 wi6 = ((com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.v) ((xj.j) i95.n0.c(xj.j.class))).wi("MagicSclDemo");
        this.B = kz5.p1.d(new md3.o(), new qe3.a(), new qe3.b(), new ce3.a("MagicAdBrandService"), new ce3.d("MagicAdBrandService"), new vd3.f(), new vd3.d());
        java.util.HashSet d17 = kz5.p1.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.g0.class.getName(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Vc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eb.f34121x366c91de).getClass().getName(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Vc(64).getClass().getName(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Vc(63).getClass().getName());
        d17.addAll(wi6.f380546b);
        this.C = d17;
        this.D = java.lang.System.currentTimeMillis();
        this.E = java.lang.System.currentTimeMillis();
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        java.lang.ref.WeakReference weakReference = this.A;
        if (weakReference != null) {
            return (android.app.Activity) weakReference.get();
        }
        return null;
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerTag, "containerTag");
        throw new jz5.k("An operation is not implemented: not implemented");
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        return "MagicSclDemo";
    }

    @Override // hq0.i0
    public void X0() {
        super.X0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b(null, null, null, null, false, false, false, null, false, null, 1023, null);
        c16416x87606a7b.f229367x = this;
        c16416x87606a7b.f229354h = true;
        bf3.p pVar = this.f426327x;
        if (pVar != null) {
            c16416x87606a7b.f229364u = pVar;
        }
        c16416x87606a7b.f229354h = z65.c.a();
        c16416x87606a7b.a(this.B);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.y4.a(c16416x87606a7b, this.C);
        I1(c16416x87606a7b);
    }

    @Override // hq0.i0, jc3.g0
    public void c(int i17, boolean z17) {
        super.c(i17, z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vird", "cost " + (java.lang.System.currentTimeMillis() - this.D));
    }

    @Override // hq0.i0
    /* renamed from: destroy */
    public void mo123041x5cd39ffa() {
        pm0.v.X(new oe3.a(this));
        super.mo123041x5cd39ffa();
    }

    @Override // hq0.i0, jc3.u
    public void n() {
        super.n();
        jc3.j0 j0Var = this.f364528g;
        if (j0Var != null) {
            jc3.j0.d(j0Var, "mb.switchVConsole(true);", null, 2, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSclDemoBiz", "onMainScriptInjected");
    }

    @Override // hq0.i0
    public void s1(hq0.e0 root, fq0.x frameSet, java.lang.String info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        super.s1(root, frameSet, info);
        this.D = java.lang.System.currentTimeMillis();
    }

    @Override // hq0.i0
    public void x1(hq0.e0 root, fq0.x frameSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        super.x1(root, frameSet);
        this.E = java.lang.System.currentTimeMillis();
        frameSet.f347017h = new oe3.b(this);
    }
}
